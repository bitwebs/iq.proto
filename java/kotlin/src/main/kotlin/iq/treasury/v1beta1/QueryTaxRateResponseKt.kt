//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/treasury/v1beta1/query.proto

package iq.treasury.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryTaxRateResponse(block: iq.treasury.v1beta1.QueryTaxRateResponseKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse =
  iq.treasury.v1beta1.QueryTaxRateResponseKt.Dsl._create(iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse.newBuilder()).apply { block() }._build()
object QueryTaxRateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse = _builder.build()

    /**
     * <code>string tax_rate = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    var taxRate: kotlin.String
      @JvmName("getTaxRate")
      get() = _builder.getTaxRate()
      @JvmName("setTaxRate")
      set(value) {
        _builder.setTaxRate(value)
      }
    /**
     * <code>string tax_rate = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    fun clearTaxRate() {
      _builder.clearTaxRate()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse.copy(block: iq.treasury.v1beta1.QueryTaxRateResponseKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryTaxRateResponse =
  iq.treasury.v1beta1.QueryTaxRateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
