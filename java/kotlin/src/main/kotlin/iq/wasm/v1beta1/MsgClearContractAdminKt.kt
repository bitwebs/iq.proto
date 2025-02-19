//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/tx.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgClearContractAdmin(block: iq.wasm.v1beta1.MsgClearContractAdminKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgClearContractAdmin =
  iq.wasm.v1beta1.MsgClearContractAdminKt.Dsl._create(iq.wasm.v1beta1.Tx.MsgClearContractAdmin.newBuilder()).apply { block() }._build()
object MsgClearContractAdminKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Tx.MsgClearContractAdmin.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Tx.MsgClearContractAdmin.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Tx.MsgClearContractAdmin = _builder.build()

    /**
     * <pre>
     * Admin is the current contract admin
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
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
     * Admin is the current contract admin
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     */
    var contract: kotlin.String
      @JvmName("getContract")
      get() = _builder.getContract()
      @JvmName("setContract")
      set(value) {
        _builder.setContract(value)
      }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     */
    fun clearContract() {
      _builder.clearContract()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Tx.MsgClearContractAdmin.copy(block: iq.wasm.v1beta1.MsgClearContractAdminKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgClearContractAdmin =
  iq.wasm.v1beta1.MsgClearContractAdminKt.Dsl._create(this.toBuilder()).apply { block() }._build()
