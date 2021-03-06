/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcUserSessionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserSessionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserSessionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcUserSessionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_MacAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcUserSessionField_LoginRemark_get(swigCPtr, this);
  }

  public CThostFtdcUserSessionField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcUserSessionField(), true);
  }

}
