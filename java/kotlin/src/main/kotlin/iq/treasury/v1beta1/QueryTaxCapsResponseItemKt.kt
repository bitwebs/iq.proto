//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/treasury/v1beta1/query.proto

package iq.treasury.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryTaxCapsResponseItem(block: iq.treasury.v1beta1.QueryTaxCapsResponseItemKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem =
  iq.treasury.v1beta1.QueryTaxCapsResponseItemKt.Dsl._create(iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem.newBuilder()).apply { block() }._build()
object QueryTaxCapsResponseItemKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem = _builder.build()

    /**
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
     * <code>string denom = 1;</code>
     */
    fun clearDenom() {
      _builder.clearDenom()
    }

    /**
     * <code>string tax_cap = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    var taxCap: kotlin.String
      @JvmName("getTaxCap")
      get() = _builder.getTaxCap()
      @JvmName("setTaxCap")
      set(value) {
        _builder.setTaxCap(value)
      }
    /**
     * <code>string tax_cap = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    fun clearTaxCap() {
      _builder.clearTaxCap()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem.copy(block: iq.treasury.v1beta1.QueryTaxCapsResponseItemKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryTaxCapsResponseItem =
  iq.treasury.v1beta1.QueryTaxCapsResponseItemKt.Dsl._create(this.toBuilder()).apply { block() }._build()
