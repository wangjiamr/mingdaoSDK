package com.mingdao.api.htf.core;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public final class NeteaseEncrypt {

	private static Log neteaseLogger = LogFactory.getLog(NeteaseEncrypt.class
			.getName());
	public static final String KEY_ALGORITHM = "RSA";

	private static final String encoding = "UTF-8";
	private static String PRIVATEKEY = "";
	private static String PUBLICKEY = "";

	static {
		try {
			LoadProperties loadProperties = new LoadProperties("neteaseConfig");
			PRIVATEKEY = loadProperties.getProperties("MINGDAO_PRIKEY");
			PUBLICKEY = loadProperties.getProperties("MINGDAO_PUBKEY");
		} catch (Exception e) {
			neteaseLogger.error(e);
		}
	}

	public static String envolopData(String dataStr) {
		String plainText = "";
		try {
			plainText = rsaSign(PRIVATEKEY, dataStr);
		} catch (Exception e) {
			neteaseLogger.error("加密错误", e);
		}
		return plainText;
	}


	public static String base64Encoder(String msg) throws Exception {
		BASE64Encoder base64encoder = new BASE64Encoder();
		return base64encoder.encodeBuffer(msg.getBytes(encoding)).replaceAll(
				"\r|\n", "");
	}

	public static String base64Decoder(String msg) throws Exception {
		BASE64Decoder base64decoder = new BASE64Decoder();
		return new String(base64decoder.decodeBuffer(msg), encoding);
	}

	/**
	 * RSA解密
	 * 
	 * @param
	 * @param
	 * @return
	 */
	public static String DecryptData(String sign, String msg) {
		String plainText = "";
		try {
			boolean verifyFlag = false;
			verifyFlag = rsaVerify(PUBLICKEY, sign, msg, encoding);

			if (verifyFlag) {
				plainText = base64Decoder(msg);
			}
		} catch (Exception e) {
			neteaseLogger.error("解密错误", e);
		}
		return plainText;
	}
	

	private static ByteArrayOutputStream readFile(String s) {
		ByteArrayOutputStream bytearrayoutputstream;
		FileInputStream fileinputstream;
		try {
			fileinputstream = new FileInputStream(s);
			bytearrayoutputstream = new ByteArrayOutputStream();
			for (int i = 0; (i = fileinputstream.read()) != -1;)
				bytearrayoutputstream.write(i);
			fileinputstream.close();
			return bytearrayoutputstream;
		} catch (FileNotFoundException e) {
			neteaseLogger.error(e);
		} catch (IOException e) {
			neteaseLogger.error(e);
		}
		return null;
	}

	/**
	 * RSA签名
	 * 
	 * @param priKey
	 * @param src
	 * @return
	 */
	public static String rsaSign(String priKey, String src) {
		String sign = "";
		try {
			BASE64Decoder base64decoder = new BASE64Decoder();
			BASE64Encoder base64encoder = new BASE64Encoder();
			PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(
					base64decoder.decodeBuffer(priKey));
			KeyFactory fac = KeyFactory.getInstance("RSA");

			RSAPrivateKey privateKey = (RSAPrivateKey) fac
					.generatePrivate(keySpec);
			Signature sigEng = Signature.getInstance("SHA1withRSA");
			sigEng.initSign(privateKey);
			sigEng.update(src.getBytes(encoding));
			byte[] signature = sigEng.sign();
			sign = base64encoder.encodeBuffer(signature);
			sign = sign.replaceAll("\r|\n", "");
		} catch (Exception e) {
			neteaseLogger.error("加签error", e);
		}
		return sign;
	}

	/**
	 * RSA验签
	 * 
	 * @param pubKey
	 * @param sign
	 * @param src
	 * @return
	 * @throws Exception
	 */
	public static boolean rsaVerify(String pubKey, String sign, String src,
			String encoding) {
		boolean rs = false;
		try {
			BASE64Decoder base64decoder = new BASE64Decoder();
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(
					base64decoder.decodeBuffer(pubKey));
			KeyFactory fac = KeyFactory.getInstance("RSA");
			RSAPublicKey rsaPubKey = (RSAPublicKey) fac.generatePublic(keySpec);

			Signature sigEng = Signature.getInstance("SHA1withRSA");
			sigEng.initVerify(rsaPubKey);
			sigEng.update(src.getBytes(encoding));
			byte[] signature = base64decoder.decodeBuffer(sign);
			rs = sigEng.verify(signature);
		} catch (Exception e) {
			neteaseLogger.error("验签error", e);
		}
		return rs;
	}

}
