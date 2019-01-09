/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcReqCancelAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqCancelAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqCancelAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcReqCancelAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_UserID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcReqCancelAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqCancelAccountField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcReqCancelAccountField(), true);
  }

}