//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/query.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryParamsResponse(block: iq.wasm.v1beta1.QueryParamsResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse =
  iq.wasm.v1beta1.QueryParamsResponseKt.Dsl._create(iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse.newBuilder()).apply { block() }._build()
object QueryParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse = _builder.build()

    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.iq.wasm.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    var params: iq.wasm.v1beta1.Wasm.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.iq.wasm.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.iq.wasm.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse.copy(block: iq.wasm.v1beta1.QueryParamsResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.QueryOuterClass.QueryParamsResponse =
  iq.wasm.v1beta1.QueryParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
