/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcRemoveParkedOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRemoveParkedOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRemoveParkedOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcRemoveParkedOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setParkedOrderID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_ParkedOrderID_set(swigCPtr, this, value);
  }

  public String getParkedOrderID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_ParkedOrderID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcRemoveParkedOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcRemoveParkedOrderField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcRemoveParkedOrderField(), true);
  }

}
