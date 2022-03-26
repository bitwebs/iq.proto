//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/treasury/v1beta1/query.proto

package iq.treasury.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryTaxCapRequest(block: iq.treasury.v1beta1.QueryTaxCapRequestKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest =
  iq.treasury.v1beta1.QueryTaxCapRequestKt.Dsl._create(iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest.newBuilder()).apply { block() }._build()
object QueryTaxCapRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest = _builder.build()

    /**
     * <pre>
     * denom defines the denomination to query for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    var denom: kotlin.String
      @JvmName("getDenom")
      get() = _builder.getDenom()
      @JvmName("setDenom")
      set(value) {
        _builder.setDenom(value)
      }
    /**
     * <pre>
     * denom defines the denomination to query for.
     * </pre>
     *
     * <code>string denom = 1;</code>
     */
    fun clearDenom() {
      _builder.clearDenom()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest.copy(block: iq.treasury.v1beta1.QueryTaxCapRequestKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapRequest =
  iq.treasury.v1beta1.QueryTaxCapRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
