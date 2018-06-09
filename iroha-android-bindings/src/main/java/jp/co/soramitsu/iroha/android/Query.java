/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.iroha.android;

public class Query {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Query(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Query obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_Query(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Query(Query o) {
    this(irohaJNI.new_Query__SWIG_1(Query.getCPtr(o), o), true);
  }

  public SWIGTYPE_p_shared_model__proto__Query__QueryVariantType get() {
    return new SWIGTYPE_p_shared_model__proto__Query__QueryVariantType(irohaJNI.Query_get(swigCPtr, this), false);
  }

  public String creatorAccountId() {
    return irohaJNI.Query_creatorAccountId(swigCPtr, this);
  }

  public java.math.BigInteger queryCounter() {
    return irohaJNI.Query_queryCounter(swigCPtr, this);
  }

  public Blob blob() {
    return new Blob(irohaJNI.Query_blob(swigCPtr, this), false);
  }

  public Blob payload() {
    return new Blob(irohaJNI.Query_payload(swigCPtr, this), false);
  }

  public SWIGTYPE_p_boost__any_rangeT_shared_model__interface__Signature_const_R_boost__forward_traversal_tag_t signatures() {
    return new SWIGTYPE_p_boost__any_rangeT_shared_model__interface__Signature_const_R_boost__forward_traversal_tag_t(irohaJNI.Query_signatures(swigCPtr, this), true);
  }

  public boolean addSignature(Signed signed_blob, PublicKey public_key) {
    return irohaJNI.Query_addSignature(swigCPtr, this, Signed.getCPtr(signed_blob), signed_blob, PublicKey.getCPtr(public_key), public_key);
  }

  public java.math.BigInteger createdTime() {
    return irohaJNI.Query_createdTime(swigCPtr, this);
  }

}
