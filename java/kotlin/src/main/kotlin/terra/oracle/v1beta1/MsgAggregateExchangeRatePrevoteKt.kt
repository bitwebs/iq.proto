//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/tx.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgAggregateExchangeRatePrevote(block: iq.oracle.v1beta1.MsgAggregateExchangeRatePrevoteKt.Dsl.() -> Unit): iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote =
  iq.oracle.v1beta1.MsgAggregateExchangeRatePrevoteKt.Dsl._create(iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote.newBuilder()).apply { block() }._build()
object MsgAggregateExchangeRatePrevoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote = _builder.build()

    /**
     * <code>string hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"hash&#92;""];</code>
     */
    var hash: kotlin.String
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>string hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"hash&#92;""];</code>
     */
    fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <code>string feeder = 2 [(.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     */
    var feeder: kotlin.String
      @JvmName("getFeeder")
      get() = _builder.getFeeder()
      @JvmName("setFeeder")
      set(value) {
        _builder.setFeeder(value)
      }
    /**
     * <code>string feeder = 2 [(.gogoproto.moretags) = "yaml:&#92;"feeder&#92;""];</code>
     */
    fun clearFeeder() {
      _builder.clearFeeder()
    }

    /**
     * <code>string validator = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     */
    var validator: kotlin.String
      @JvmName("getValidator")
      get() = _builder.getValidator()
      @JvmName("setValidator")
      set(value) {
        _builder.setValidator(value)
      }
    /**
     * <code>string validator = 3 [(.gogoproto.moretags) = "yaml:&#92;"validator&#92;""];</code>
     */
    fun clearValidator() {
      _builder.clearValidator()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote.copy(block: iq.oracle.v1beta1.MsgAggregateExchangeRatePrevoteKt.Dsl.() -> Unit): iq.oracle.v1beta1.Tx.MsgAggregateExchangeRatePrevote =
  iq.oracle.v1beta1.MsgAggregateExchangeRatePrevoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()
