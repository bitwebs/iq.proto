//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/tx.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgInstantiateContractResponse(block: iq.wasm.v1beta1.MsgInstantiateContractResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse =
  iq.wasm.v1beta1.MsgInstantiateContractResponseKt.Dsl._create(iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse.newBuilder()).apply { block() }._build()
object MsgInstantiateContractResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse = _builder.build()

    /**
     * <pre>
     * ContractAddress is the bech32 address of the new contract instance.
     * </pre>
     *
     * <code>string contract_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"contract_address&#92;""];</code>
     */
    var contractAddress: kotlin.String
      @JvmName("getContractAddress")
      get() = _builder.getContractAddress()
      @JvmName("setContractAddress")
      set(value) {
        _builder.setContractAddress(value)
      }
    /**
     * <pre>
     * ContractAddress is the bech32 address of the new contract instance.
     * </pre>
     *
     * <code>string contract_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"contract_address&#92;""];</code>
     */
    fun clearContractAddress() {
      _builder.clearContractAddress()
    }

    /**
     * <pre>
     * Data contains base64-encoded bytes to returned from the contract
     * </pre>
     *
     * <code>bytes data = 2 [(.gogoproto.moretags) = "yaml:&#92;"data&#92;""];</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * Data contains base64-encoded bytes to returned from the contract
     * </pre>
     *
     * <code>bytes data = 2 [(.gogoproto.moretags) = "yaml:&#92;"data&#92;""];</code>
     */
    fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse.copy(block: iq.wasm.v1beta1.MsgInstantiateContractResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgInstantiateContractResponse =
  iq.wasm.v1beta1.MsgInstantiateContractResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
