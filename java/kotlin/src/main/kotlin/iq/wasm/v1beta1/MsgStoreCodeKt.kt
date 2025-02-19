//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/tx.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgStoreCode(block: iq.wasm.v1beta1.MsgStoreCodeKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgStoreCode =
  iq.wasm.v1beta1.MsgStoreCodeKt.Dsl._create(iq.wasm.v1beta1.Tx.MsgStoreCode.newBuilder()).apply { block() }._build()
object MsgStoreCodeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Tx.MsgStoreCode.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Tx.MsgStoreCode.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Tx.MsgStoreCode = _builder.build()

    /**
     * <pre>
     * Sender is the that actor that signed the messages
     * </pre>
     *
     * <code>string sender = 1 [(.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     */
    var sender: kotlin.String
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <pre>
     * Sender is the that actor that signed the messages
     * </pre>
     *
     * <code>string sender = 1 [(.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
     */
    fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <pre>
     * WASMByteCode can be raw or gzip compressed
     * </pre>
     *
     * <code>bytes wasm_byte_code = 2 [(.gogoproto.customname) = "WASMByteCode", (.gogoproto.moretags) = "yaml:&#92;"wasm_byte_code&#92;""];</code>
     */
    var wasmByteCode: com.google.protobuf.ByteString
      @JvmName("getWasmByteCode")
      get() = _builder.getWasmByteCode()
      @JvmName("setWasmByteCode")
      set(value) {
        _builder.setWasmByteCode(value)
      }
    /**
     * <pre>
     * WASMByteCode can be raw or gzip compressed
     * </pre>
     *
     * <code>bytes wasm_byte_code = 2 [(.gogoproto.customname) = "WASMByteCode", (.gogoproto.moretags) = "yaml:&#92;"wasm_byte_code&#92;""];</code>
     */
    fun clearWasmByteCode() {
      _builder.clearWasmByteCode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Tx.MsgStoreCode.copy(block: iq.wasm.v1beta1.MsgStoreCodeKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgStoreCode =
  iq.wasm.v1beta1.MsgStoreCodeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
