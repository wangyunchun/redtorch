/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcBrokerUserPasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcBrokerUserPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_Password_get(swigCPtr, this);
  }

  public void setLastUpdateTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_set(swigCPtr, this, value);
  }

  public String getLastUpdateTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_get(swigCPtr, this);
  }

  public void setLastLoginTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_set(swigCPtr, this, value);
  }

  public String getLastLoginTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_get(swigCPtr, this);
  }

  public void setExpireDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_ExpireDate_set(swigCPtr, this, value);
  }

  public String getExpireDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_ExpireDate_get(swigCPtr, this);
  }

  public void setWeakExpireDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_set(swigCPtr, this, value);
  }

  public String getWeakExpireDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserPasswordField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcBrokerUserPasswordField(), true);
  }

}
