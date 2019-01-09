/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcProductExchRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcProductExchRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcProductExchRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcProductExchRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_ProductID_get(swigCPtr, this);
  }

  public void setQuoteCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_QuoteCurrencyID_set(swigCPtr, this, value);
  }

  public String getQuoteCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_QuoteCurrencyID_get(swigCPtr, this);
  }

  public void setExchangeRate(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_ExchangeRate_set(swigCPtr, this, value);
  }

  public double getExchangeRate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_ExchangeRate_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcProductExchRateField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcProductExchRateField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcProductExchRateField(), true);
  }

}