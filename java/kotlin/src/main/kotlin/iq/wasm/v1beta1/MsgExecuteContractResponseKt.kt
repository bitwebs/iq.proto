//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/tx.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgExecuteContractResponse(block: iq.wasm.v1beta1.MsgExecuteContractResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgExecuteContractResponse =
  iq.wasm.v1beta1.MsgExecuteContractResponseKt.Dsl._create(iq.wasm.v1beta1.Tx.MsgExecuteContractResponse.newBuilder()).apply { block() }._build()
object MsgExecuteContractResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Tx.MsgExecuteContractResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Tx.MsgExecuteContractResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Tx.MsgExecuteContractResponse = _builder.build()

    /**
     * <pre>
     * Data contains base64-encoded bytes to returned from the contract
     * </pre>
     *
     * <code>bytes data = 1 [(.gogoproto.moretags) = "yaml:&#92;"data&#92;""];</code>
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
     * <code>bytes data = 1 [(.gogoproto.moretags) = "yaml:&#92;"data&#92;""];</code>
     */
    fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Tx.MsgExecuteContractResponse.copy(block: iq.wasm.v1beta1.MsgExecuteContractResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgExecuteContractResponse =
  iq.wasm.v1beta1.MsgExecuteContractResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
