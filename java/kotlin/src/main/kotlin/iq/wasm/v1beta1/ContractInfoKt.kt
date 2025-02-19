//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/wasm.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun contractInfo(block: iq.wasm.v1beta1.ContractInfoKt.Dsl.() -> Unit): iq.wasm.v1beta1.Wasm.ContractInfo =
  iq.wasm.v1beta1.ContractInfoKt.Dsl._create(iq.wasm.v1beta1.Wasm.ContractInfo.newBuilder()).apply { block() }._build()
object ContractInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Wasm.ContractInfo.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Wasm.ContractInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Wasm.ContractInfo = _builder.build()

    /**
     * <pre>
     * Address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [(.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     */
    var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * Address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [(.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     */
    fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * Creator is the contract creator address
     * </pre>
     *
     * <code>string creator = 2 [(.gogoproto.moretags) = "yaml:&#92;"creator&#92;""];</code>
     */
    var creator: kotlin.String
      @JvmName("getCreator")
      get() = _builder.getCreator()
      @JvmName("setCreator")
      set(value) {
        _builder.setCreator(value)
      }
    /**
     * <pre>
     * Creator is the contract creator address
     * </pre>
     *
     * <code>string creator = 2 [(.gogoproto.moretags) = "yaml:&#92;"creator&#92;""];</code>
     */
    fun clearCreator() {
      _builder.clearCreator()
    }

    /**
     * <pre>
     * Admin is who can execute the contract migration
     * </pre>
     *
     * <code>string admin = 3 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    var admin: kotlin.String
      @JvmName("getAdmin")
      get() = _builder.getAdmin()
      @JvmName("setAdmin")
      set(value) {
        _builder.setAdmin(value)
      }
    /**
     * <pre>
     * Admin is who can execute the contract migration
     * </pre>
     *
     * <code>string admin = 3 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * CodeID is the reference to the stored Wasm code
     * </pre>
     *
     * <code>uint64 code_id = 4 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    var codeId: kotlin.Long
      @JvmName("getCodeId")
      get() = _builder.getCodeId()
      @JvmName("setCodeId")
      set(value) {
        _builder.setCodeId(value)
      }
    /**
     * <pre>
     * CodeID is the reference to the stored Wasm code
     * </pre>
     *
     * <code>uint64 code_id = 4 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    fun clearCodeId() {
      _builder.clearCodeId()
    }

    /**
     * <pre>
     * InitMsg is the raw message used when instantiating a contract
     * </pre>
     *
     * <code>bytes init_msg = 5 [(.gogoproto.moretags) = "yaml:&#92;"init_msg&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    var initMsg: com.google.protobuf.ByteString
      @JvmName("getInitMsg")
      get() = _builder.getInitMsg()
      @JvmName("setInitMsg")
      set(value) {
        _builder.setInitMsg(value)
      }
    /**
     * <pre>
     * InitMsg is the raw message used when instantiating a contract
     * </pre>
     *
     * <code>bytes init_msg = 5 [(.gogoproto.moretags) = "yaml:&#92;"init_msg&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    fun clearInitMsg() {
      _builder.clearInitMsg()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Wasm.ContractInfo.copy(block: iq.wasm.v1beta1.ContractInfoKt.Dsl.() -> Unit): iq.wasm.v1beta1.Wasm.ContractInfo =
  iq.wasm.v1beta1.ContractInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
