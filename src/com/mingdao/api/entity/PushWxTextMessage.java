package com.mingdao.api.entity;

/**
 * Created by wangjia on 14-7-1.
 */
public class PushWxTextMessage extends PushWxMessage {

    private String msgtype = "text";

    private MessageContent text;

    private String safe;

    public PushWxTextMessage(String content) {
        MessageContent message = new MessageContent();
        message.setContent(content);
        text = message;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public MessageContent getText() {
        return text;
    }

    public void setText(MessageContent text) {
        this.text = text;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }

    public class MessageContent {
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
