//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/treasury/v1beta1/query.proto

package iq.treasury.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryIndicatorsResponse(block: iq.treasury.v1beta1.QueryIndicatorsResponseKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse =
  iq.treasury.v1beta1.QueryIndicatorsResponseKt.Dsl._create(iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse.newBuilder()).apply { block() }._build()
object QueryIndicatorsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse = _builder.build()

    /**
     * <code>string trl_year = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "TRLYear"];</code>
     */
    var trlYear: kotlin.String
      @JvmName("getTrlYear")
      get() = _builder.getTrlYear()
      @JvmName("setTrlYear")
      set(value) {
        _builder.setTrlYear(value)
      }
    /**
     * <code>string trl_year = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "TRLYear"];</code>
     */
    fun clearTrlYear() {
      _builder.clearTrlYear()
    }

    /**
     * <code>string trl_month = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "TRLMonth"];</code>
     */
    var trlMonth: kotlin.String
      @JvmName("getTrlMonth")
      get() = _builder.getTrlMonth()
      @JvmName("setTrlMonth")
      set(value) {
        _builder.setTrlMonth(value)
      }
    /**
     * <code>string trl_month = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "TRLMonth"];</code>
     */
    fun clearTrlMonth() {
      _builder.clearTrlMonth()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse.copy(block: iq.treasury.v1beta1.QueryIndicatorsResponseKt.Dsl.() -> Unit): iq.treasury.v1beta1.QueryOuterClass.QueryIndicatorsResponse =
  iq.treasury.v1beta1.QueryIndicatorsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
