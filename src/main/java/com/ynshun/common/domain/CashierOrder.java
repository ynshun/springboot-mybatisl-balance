package com.ynshun.common.domain;

import java.io.Serializable;
import java.util.Date;

public class CashierOrder implements Serializable {
	private static final long serialVersionUID = -7458022655239104077L;
	
	private Integer id;
	private Date createTime;
	private Integer createId;
	private String createName;
	private Date updateTime;
	private String updateName;
	private Integer updateId;
	private Integer status;
	private String transactionId;
	private Integer partnerId;
	private String partnerOrderId;
	private String partnerCurrency;
	private Double partnerAmount;
	private String settleCurrency;
	private Double settleAmount;
	private Integer payId;
	private Double payMethodFee;
	private Double finalAmount;
	private Double payToUsdRate;
	private Double usdToCnyRate;
	private Double payToPartnerRate;
	private Date payTime;
	private String payStatus;
	private String bankFeeCurrency;
	private Double bankFeeMoney;
	private String clientIp;
	private String productName;
	private String nativeProductName;
	private String userEmail;
	private String languageVersion;
	private String userAgent;
	private String country;
	private String successUrl;
	private String failureUrl;
	private String backUrl;
	private String callbackUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerOrderId() {
		return partnerOrderId;
	}

	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}

	public String getPartnerCurrency() {
		return partnerCurrency;
	}

	public void setPartnerCurrency(String partnerCurrency) {
		this.partnerCurrency = partnerCurrency;
	}

	public Double getPartnerAmount() {
		return partnerAmount;
	}

	public void setPartnerAmount(Double partnerAmount) {
		this.partnerAmount = partnerAmount;
	}

	public String getSettleCurrency() {
		return settleCurrency;
	}

	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

	public Double getSettleAmount() {
		return settleAmount;
	}

	public void setSettleAmount(Double settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Integer getPayId() {
		return payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public Double getPayMethodFee() {
		return payMethodFee;
	}

	public void setPayMethodFee(Double payMethodFee) {
		this.payMethodFee = payMethodFee;
	}

	public Double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public Double getPayToUsdRate() {
		return payToUsdRate;
	}

	public void setPayToUsdRate(Double payToUsdRate) {
		this.payToUsdRate = payToUsdRate;
	}

	public Double getUsdToCnyRate() {
		return usdToCnyRate;
	}

	public void setUsdToCnyRate(Double usdToCnyRate) {
		this.usdToCnyRate = usdToCnyRate;
	}

	public Double getPayToPartnerRate() {
		return payToPartnerRate;
	}

	public void setPayToPartnerRate(Double payToPartnerRate) {
		this.payToPartnerRate = payToPartnerRate;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getBankFeeCurrency() {
		return bankFeeCurrency;
	}

	public void setBankFeeCurrency(String bankFeeCurrency) {
		this.bankFeeCurrency = bankFeeCurrency;
	}

	public Double getBankFeeMoney() {
		return bankFeeMoney;
	}

	public void setBankFeeMoney(Double bankFeeMoney) {
		this.bankFeeMoney = bankFeeMoney;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getNativeProductName() {
		return nativeProductName;
	}

	public void setNativeProductName(String nativeProductName) {
		this.nativeProductName = nativeProductName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getLanguageVersion() {
		return languageVersion;
	}

	public void setLanguageVersion(String languageVersion) {
		this.languageVersion = languageVersion;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSuccessUrl() {
		return successUrl;
	}

	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}

	public String getFailureUrl() {
		return failureUrl;
	}

	public void setFailureUrl(String failureUrl) {
		this.failureUrl = failureUrl;
	}

	public String getBackUrl() {
		return backUrl;
	}

	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

}
