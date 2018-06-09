/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.iroha.android;

public class irohaJNI {
  public final static native long new_ByteVector__SWIG_0();
  public final static native long new_ByteVector__SWIG_1(long jarg1);
  public final static native long ByteVector_size(long jarg1, ByteVector jarg1_);
  public final static native long ByteVector_capacity(long jarg1, ByteVector jarg1_);
  public final static native void ByteVector_reserve(long jarg1, ByteVector jarg1_, long jarg2);
  public final static native boolean ByteVector_isEmpty(long jarg1, ByteVector jarg1_);
  public final static native void ByteVector_clear(long jarg1, ByteVector jarg1_);
  public final static native void ByteVector_add(long jarg1, ByteVector jarg1_, short jarg2);
  public final static native short ByteVector_get(long jarg1, ByteVector jarg1_, int jarg2);
  public final static native void ByteVector_set(long jarg1, ByteVector jarg1_, int jarg2, short jarg3);
  public final static native void delete_ByteVector(long jarg1);
  public final static native long new_StringVector__SWIG_0();
  public final static native long new_StringVector__SWIG_1(long jarg1);
  public final static native long StringVector_size(long jarg1, StringVector jarg1_);
  public final static native long StringVector_capacity(long jarg1, StringVector jarg1_);
  public final static native void StringVector_reserve(long jarg1, StringVector jarg1_, long jarg2);
  public final static native boolean StringVector_isEmpty(long jarg1, StringVector jarg1_);
  public final static native void StringVector_clear(long jarg1, StringVector jarg1_);
  public final static native void StringVector_add(long jarg1, StringVector jarg1_, String jarg2);
  public final static native String StringVector_get(long jarg1, StringVector jarg1_, int jarg2);
  public final static native void StringVector_set(long jarg1, StringVector jarg1_, int jarg2, String jarg3);
  public final static native void delete_StringVector(long jarg1);
  public final static native long new_HashVector();
  public final static native long HashVector_size(long jarg1, HashVector jarg1_);
  public final static native long HashVector_capacity(long jarg1, HashVector jarg1_);
  public final static native void HashVector_reserve(long jarg1, HashVector jarg1_, long jarg2);
  public final static native boolean HashVector_isEmpty(long jarg1, HashVector jarg1_);
  public final static native void HashVector_clear(long jarg1, HashVector jarg1_);
  public final static native void HashVector_add(long jarg1, HashVector jarg1_, long jarg2, Hash jarg2_);
  public final static native long HashVector_get(long jarg1, HashVector jarg1_, int jarg2);
  public final static native void HashVector_set(long jarg1, HashVector jarg1_, int jarg2, long jarg3, Hash jarg3_);
  public final static native void delete_HashVector(long jarg1);
  public final static native String toBinaryString(long jarg1, Blob jarg1_);
  public final static native long new_Blob__SWIG_0();
  public final static native long new_Blob__SWIG_1(String jarg1);
  public final static native long new_Blob__SWIG_2(long jarg1, ByteVector jarg1_);
  public final static native long Blob_fromHexString(String jarg1);
  public final static native long Blob_blob(long jarg1, Blob jarg1_);
  public final static native String Blob_hex(long jarg1, Blob jarg1_);
  public final static native long Blob_size(long jarg1, Blob jarg1_);
  public final static native String Blob_toString(long jarg1, Blob jarg1_);
  public final static native boolean Blob_b_equal(long jarg1, Blob jarg1_, long jarg2, Blob jarg2_);
  public final static native void delete_Blob(long jarg1);
  public final static native long new_PublicKey__SWIG_0(String jarg1);
  public final static native long new_PublicKey__SWIG_1(long jarg1, Blob jarg1_);
  public final static native String PublicKey_toString(long jarg1, PublicKey jarg1_);
  public final static native void delete_PublicKey(long jarg1);
  public final static native long new_PrivateKey__SWIG_0(String jarg1);
  public final static native long new_PrivateKey__SWIG_1(long jarg1, Blob jarg1_);
  public final static native String PrivateKey_toString(long jarg1, PrivateKey jarg1_);
  public final static native void delete_PrivateKey(long jarg1);
  public final static native long Hash_Hasher_hash_invoke(long jarg1, Hash.Hasher jarg1_, long jarg2, Hash jarg2_);
  public final static native long new_Hash_Hasher();
  public final static native void delete_Hash_Hasher(long jarg1);
  public final static native long new_Hash__SWIG_0();
  public final static native long new_Hash__SWIG_1(String jarg1);
  public final static native String Hash_toString(long jarg1, Hash jarg1_);
  public final static native void delete_Hash(long jarg1);
  public final static native long new_Keypair(long jarg1, PublicKey jarg1_, long jarg2, PrivateKey jarg2_);
  public final static native long Keypair_publicKey(long jarg1, Keypair jarg1_);
  public final static native long Keypair_privateKey(long jarg1, Keypair jarg1_);
  public final static native boolean Keypair_kp_equal(long jarg1, Keypair jarg1_, long jarg2, Keypair jarg2_);
  public final static native String Keypair_toString(long jarg1, Keypair jarg1_);
  public final static native void delete_Keypair(long jarg1);
  public final static native long new_Signed__SWIG_0(String jarg1);
  public final static native long new_Signed__SWIG_1(long jarg1, ByteVector jarg1_);
  public final static native String Signed_toString(long jarg1, Signed jarg1_);
  public final static native void delete_Signed(long jarg1);
  public final static native long new_Transaction__SWIG_1(long jarg1, Transaction jarg1_);
  public final static native String Transaction_creatorAccountId(long jarg1, Transaction jarg1_);
  public final static native long Transaction_commands(long jarg1, Transaction jarg1_);
  public final static native long Transaction_blob(long jarg1, Transaction jarg1_);
  public final static native long Transaction_payload(long jarg1, Transaction jarg1_);
  public final static native long Transaction_signatures(long jarg1, Transaction jarg1_);
  public final static native boolean Transaction_addSignature(long jarg1, Transaction jarg1_, long jarg2, Signed jarg2_, long jarg3, PublicKey jarg3_);
  public final static native java.math.BigInteger Transaction_createdTime(long jarg1, Transaction jarg1_);
  public final static native long Transaction_quorum(long jarg1, Transaction jarg1_);
  public final static native void delete_Transaction(long jarg1);
  public final static native long new_Query__SWIG_1(long jarg1, Query jarg1_);
  public final static native long Query_get(long jarg1, Query jarg1_);
  public final static native String Query_creatorAccountId(long jarg1, Query jarg1_);
  public final static native java.math.BigInteger Query_queryCounter(long jarg1, Query jarg1_);
  public final static native long Query_blob(long jarg1, Query jarg1_);
  public final static native long Query_payload(long jarg1, Query jarg1_);
  public final static native long Query_signatures(long jarg1, Query jarg1_);
  public final static native boolean Query_addSignature(long jarg1, Query jarg1_, long jarg2, Signed jarg2_, long jarg3, PublicKey jarg3_);
  public final static native java.math.BigInteger Query_createdTime(long jarg1, Query jarg1_);
  public final static native void delete_Query(long jarg1);
  public final static native long new_ModelTransactionBuilder();
  public final static native long ModelTransactionBuilder_creatorAccountId(long jarg1, ModelTransactionBuilder jarg1_, String jarg2);
  public final static native long ModelTransactionBuilder_createdTime(long jarg1, ModelTransactionBuilder jarg1_, java.math.BigInteger jarg2);
  public final static native long ModelTransactionBuilder_quorum(long jarg1, ModelTransactionBuilder jarg1_, long jarg2);
  public final static native long ModelTransactionBuilder_addAssetQuantity(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native long ModelTransactionBuilder_addPeer(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, long jarg3, PublicKey jarg3_);
  public final static native long ModelTransactionBuilder_addSignatory(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, long jarg3, PublicKey jarg3_);
  public final static native long ModelTransactionBuilder_removeSignatory(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, long jarg3, PublicKey jarg3_);
  public final static native long ModelTransactionBuilder_appendRole(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3);
  public final static native long ModelTransactionBuilder_createAsset(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3, short jarg4);
  public final static native long ModelTransactionBuilder_createAccount(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3, long jarg4, PublicKey jarg4_);
  public final static native long ModelTransactionBuilder_createDomain(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3);
  public final static native long ModelTransactionBuilder_createRole(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, long jarg3, StringVector jarg3_);
  public final static native long ModelTransactionBuilder_detachRole(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3);
  public final static native long ModelTransactionBuilder_grantPermission(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3);
  public final static native long ModelTransactionBuilder_revokePermission(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3);
  public final static native long ModelTransactionBuilder_setAccountDetail(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native long ModelTransactionBuilder_setAccountQuorum(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, long jarg3);
  public final static native long ModelTransactionBuilder_subtractAssetQuantity(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native long ModelTransactionBuilder_transferAsset(long jarg1, ModelTransactionBuilder jarg1_, String jarg2, String jarg3, String jarg4, String jarg5, String jarg6);
  public final static native long ModelTransactionBuilder_build(long jarg1, ModelTransactionBuilder jarg1_);
  public final static native void delete_ModelTransactionBuilder(long jarg1);
  public final static native long new_ModelQueryBuilder();
  public final static native long ModelQueryBuilder_createdTime(long jarg1, ModelQueryBuilder jarg1_, java.math.BigInteger jarg2);
  public final static native long ModelQueryBuilder_creatorAccountId(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_queryCounter(long jarg1, ModelQueryBuilder jarg1_, java.math.BigInteger jarg2);
  public final static native long ModelQueryBuilder_getAccount(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_getSignatories(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_getAccountTransactions(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_getAccountAssetTransactions(long jarg1, ModelQueryBuilder jarg1_, String jarg2, String jarg3);
  public final static native long ModelQueryBuilder_getAccountAssets(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_getRoles(long jarg1, ModelQueryBuilder jarg1_);
  public final static native long ModelQueryBuilder_getAssetInfo(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_getRolePermissions(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_getTransactions(long jarg1, ModelQueryBuilder jarg1_, long jarg2, HashVector jarg2_);
  public final static native long ModelQueryBuilder_getAccountDetail(long jarg1, ModelQueryBuilder jarg1_, String jarg2);
  public final static native long ModelQueryBuilder_build(long jarg1, ModelQueryBuilder jarg1_);
  public final static native void delete_ModelQueryBuilder(long jarg1);
  public final static native long ModelCrypto_generateKeypair(long jarg1, ModelCrypto jarg1_);
  public final static native long ModelCrypto_fromPrivateKey(long jarg1, ModelCrypto jarg1_, String jarg2);
  public final static native long ModelCrypto_convertFromExisting(long jarg1, ModelCrypto jarg1_, String jarg2, String jarg3);
  public final static native long new_ModelCrypto();
  public final static native void delete_ModelCrypto(long jarg1);
  public final static native long new_UnsignedTx__SWIG_0(long jarg1, Transaction jarg1_);
  public final static native long UnsignedTx_signAndAddSignature(long jarg1, UnsignedTx jarg1_, long jarg2, Keypair jarg2_);
  public final static native long UnsignedTx_finish(long jarg1, UnsignedTx jarg1_);
  public final static native long UnsignedTx_hash(long jarg1, UnsignedTx jarg1_);
  public final static native void delete_UnsignedTx(long jarg1);
  public final static native long new_UnsignedQuery__SWIG_0(long jarg1, Query jarg1_);
  public final static native long UnsignedQuery_signAndAddSignature(long jarg1, UnsignedQuery jarg1_, long jarg2, Keypair jarg2_);
  public final static native long UnsignedQuery_finish(long jarg1, UnsignedQuery jarg1_);
  public final static native long UnsignedQuery_hash(long jarg1, UnsignedQuery jarg1_);
  public final static native void delete_UnsignedQuery(long jarg1);
  public final static native long new_ModelProtoTransaction(long jarg1, UnsignedTx jarg1_);
  public final static native long ModelProtoTransaction_signAndAddSignature(long jarg1, ModelProtoTransaction jarg1_, long jarg2, Keypair jarg2_);
  public final static native long ModelProtoTransaction_finish(long jarg1, ModelProtoTransaction jarg1_);
  public final static native void delete_ModelProtoTransaction(long jarg1);
  public final static native long new_ModelProtoQuery(long jarg1, UnsignedQuery jarg1_);
  public final static native long ModelProtoQuery_signAndAddSignature(long jarg1, ModelProtoQuery jarg1_, long jarg2, Keypair jarg2_);
  public final static native long ModelProtoQuery_finish(long jarg1, ModelProtoQuery jarg1_);
  public final static native void delete_ModelProtoQuery(long jarg1);
  public final static native long PublicKey_SWIGUpcast(long jarg1);
  public final static native long PrivateKey_SWIGUpcast(long jarg1);
  public final static native long Hash_SWIGUpcast(long jarg1);
  public final static native long Signed_SWIGUpcast(long jarg1);
}
