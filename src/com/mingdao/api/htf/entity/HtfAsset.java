package com.mingdao.api.htf.entity;

import java.io.Serializable;

/**
 * Created by zhenjiaWang on 14-9-3.
 */
public class HtfAsset implements Serializable {

   private String retcode;

    private String retmsg;

    private String custno;

    private String instName;


    private Double totalAsset;

    private Double cashBalance;

    private Double cashTotalProfit;

    private Double cashTakeBackReal;

    private Double cashBuyAvailable;

    private Double cashFrozen;

    private Double financeAsset;

    private Double fundAsset;

    private Double smaAsset;

    private Double assetInFloat;

    private Double cashYield;

    private Double cashIncomeUnit;

    private String cashNavDate;

    private Double lastDayProfit;

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public Double getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(Double totalAsset) {
        this.totalAsset = totalAsset;
    }

    public Double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(Double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public Double getCashTotalProfit() {
        return cashTotalProfit;
    }

    public void setCashTotalProfit(Double cashTotalProfit) {
        this.cashTotalProfit = cashTotalProfit;
    }

    public Double getCashTakeBackReal() {
        return cashTakeBackReal;
    }

    public void setCashTakeBackReal(Double cashTakeBackReal) {
        this.cashTakeBackReal = cashTakeBackReal;
    }

    public Double getCashBuyAvailable() {
        return cashBuyAvailable;
    }

    public void setCashBuyAvailable(Double cashBuyAvailable) {
        this.cashBuyAvailable = cashBuyAvailable;
    }

    public Double getCashFrozen() {
        return cashFrozen;
    }

    public void setCashFrozen(Double cashFrozen) {
        this.cashFrozen = cashFrozen;
    }

    public Double getFinanceAsset() {
        return financeAsset;
    }

    public void setFinanceAsset(Double financeAsset) {
        this.financeAsset = financeAsset;
    }

    public Double getFundAsset() {
        return fundAsset;
    }

    public void setFundAsset(Double fundAsset) {
        this.fundAsset = fundAsset;
    }

    public Double getSmaAsset() {
        return smaAsset;
    }

    public void setSmaAsset(Double smaAsset) {
        this.smaAsset = smaAsset;
    }

    public Double getAssetInFloat() {
        return assetInFloat;
    }

    public void setAssetInFloat(Double assetInFloat) {
        this.assetInFloat = assetInFloat;
    }

    public Double getCashYield() {
        return cashYield;
    }

    public void setCashYield(Double cashYield) {
        this.cashYield = cashYield;
    }

    public Double getCashIncomeUnit() {
        return cashIncomeUnit;
    }

    public void setCashIncomeUnit(Double cashIncomeUnit) {
        this.cashIncomeUnit = cashIncomeUnit;
    }

    public String getCashNavDate() {
        return cashNavDate;
    }

    public void setCashNavDate(String cashNavDate) {
        this.cashNavDate = cashNavDate;
    }

    public Double getLastDayProfit() {
        return lastDayProfit;
    }

    public void setLastDayProfit(Double lastDayProfit) {
        this.lastDayProfit = lastDayProfit;
    }
}
