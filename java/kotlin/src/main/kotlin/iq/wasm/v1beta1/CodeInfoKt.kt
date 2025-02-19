//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/wasm.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun codeInfo(block: iq.wasm.v1beta1.CodeInfoKt.Dsl.() -> Unit): iq.wasm.v1beta1.Wasm.CodeInfo =
  iq.wasm.v1beta1.CodeInfoKt.Dsl._create(iq.wasm.v1beta1.Wasm.CodeInfo.newBuilder()).apply { block() }._build()
object CodeInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Wasm.CodeInfo.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Wasm.CodeInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Wasm.CodeInfo = _builder.build()

    /**
     * <pre>
     * CodeID is the sequentially increasing unique identifier
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
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
     * CodeID is the sequentially increasing unique identifier
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    fun clearCodeId() {
      _builder.clearCodeId()
    }

    /**
     * <pre>
     * CodeHash is the unique identifier created by wasmvm
     * </pre>
     *
     * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     */
    var codeHash: com.google.protobuf.ByteString
      @JvmName("getCodeHash")
      get() = _builder.getCodeHash()
      @JvmName("setCodeHash")
      set(value) {
        _builder.setCodeHash(value)
      }
    /**
     * <pre>
     * CodeHash is the unique identifier created by wasmvm
     * </pre>
     *
     * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     */
    fun clearCodeHash() {
      _builder.clearCodeHash()
    }

    /**
     * <pre>
     * Creator address who initially stored the code
     * </pre>
     *
     * <code>string creator = 3 [(.gogoproto.moretags) = "yaml:&#92;"creator&#92;""];</code>
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
     * Creator address who initially stored the code
     * </pre>
     *
     * <code>string creator = 3 [(.gogoproto.moretags) = "yaml:&#92;"creator&#92;""];</code>
     */
    fun clearCreator() {
      _builder.clearCreator()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Wasm.CodeInfo.copy(block: iq.wasm.v1beta1.CodeInfoKt.Dsl.() -> Unit): iq.wasm.v1beta1.Wasm.CodeInfo =
  iq.wasm.v1beta1.CodeInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
