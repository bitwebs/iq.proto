//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/genesis.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun code(block: iq.wasm.v1beta1.CodeKt.Dsl.() -> Unit): iq.wasm.v1beta1.Genesis.Code =
  iq.wasm.v1beta1.CodeKt.Dsl._create(iq.wasm.v1beta1.Genesis.Code.newBuilder()).apply { block() }._build()
object CodeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Genesis.Code.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Genesis.Code.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Genesis.Code = _builder.build()

    /**
     * <code>.iq.wasm.v1beta1.CodeInfo code_info = 1 [(.gogoproto.nullable) = false];</code>
     */
    var codeInfo: iq.wasm.v1beta1.Wasm.CodeInfo
      @JvmName("getCodeInfo")
      get() = _builder.getCodeInfo()
      @JvmName("setCodeInfo")
      set(value) {
        _builder.setCodeInfo(value)
      }
    /**
     * <code>.iq.wasm.v1beta1.CodeInfo code_info = 1 [(.gogoproto.nullable) = false];</code>
     */
    fun clearCodeInfo() {
      _builder.clearCodeInfo()
    }
    /**
     * <code>.iq.wasm.v1beta1.CodeInfo code_info = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the codeInfo field is set.
     */
    fun hasCodeInfo(): kotlin.Boolean {
      return _builder.hasCodeInfo()
    }

    /**
     * <code>bytes code_bytes = 2;</code>
     */
    var codeBytes: com.google.protobuf.ByteString
      @JvmName("getCodeBytes")
      get() = _builder.getCodeBytes()
      @JvmName("setCodeBytes")
      set(value) {
        _builder.setCodeBytes(value)
      }
    /**
     * <code>bytes code_bytes = 2;</code>
     */
    fun clearCodeBytes() {
      _builder.clearCodeBytes()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Genesis.Code.copy(block: iq.wasm.v1beta1.CodeKt.Dsl.() -> Unit): iq.wasm.v1beta1.Genesis.Code =
  iq.wasm.v1beta1.CodeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
