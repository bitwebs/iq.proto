//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/market/v1beta1/tx.proto

package iq.market.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgSwap(block: iq.market.v1beta1.MsgSwapKt.Dsl.() -> Unit): iq.market.v1beta1.Tx.MsgSwap =
  iq.market.v1beta1.MsgSwapKt.Dsl._create(iq.market.v1beta1.Tx.MsgSwap.newBuilder()).apply { block() }._build()
object MsgSwapKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.market.v1beta1.Tx.MsgSwap.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.market.v1beta1.Tx.MsgSwap.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.market.v1beta1.Tx.MsgSwap = _builder.build()

    /**
     * <code>string trader = 1 [(.gogoproto.moretags) = "yaml:&#92;"trader&#92;""];</code>
     */
    var trader: kotlin.String
      @JvmName("getTrader")
      get() = _builder.getTrader()
      @JvmName("setTrader")
      set(value) {
        _builder.setTrader(value)
      }
    /**
     * <code>string trader = 1 [(.gogoproto.moretags) = "yaml:&#92;"trader&#92;""];</code>
     */
    fun clearTrader() {
      _builder.clearTrader()
    }

    /**
     * <code>.cosmos.base.v1beta1.Coin offer_coin = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"offer_coin&#92;""];</code>
     */
    var offerCoin: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getOfferCoin")
      get() = _builder.getOfferCoin()
      @JvmName("setOfferCoin")
      set(value) {
        _builder.setOfferCoin(value)
      }
    /**
     * <code>.cosmos.base.v1beta1.Coin offer_coin = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"offer_coin&#92;""];</code>
     */
    fun clearOfferCoin() {
      _builder.clearOfferCoin()
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin offer_coin = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"offer_coin&#92;""];</code>
     * @return Whether the offerCoin field is set.
     */
    fun hasOfferCoin(): kotlin.Boolean {
      return _builder.hasOfferCoin()
    }

    /**
     * <code>string ask_denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"ask_denom&#92;""];</code>
     */
    var askDenom: kotlin.String
      @JvmName("getAskDenom")
      get() = _builder.getAskDenom()
      @JvmName("setAskDenom")
      set(value) {
        _builder.setAskDenom(value)
      }
    /**
     * <code>string ask_denom = 3 [(.gogoproto.moretags) = "yaml:&#92;"ask_denom&#92;""];</code>
     */
    fun clearAskDenom() {
      _builder.clearAskDenom()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.market.v1beta1.Tx.MsgSwap.copy(block: iq.market.v1beta1.MsgSwapKt.Dsl.() -> Unit): iq.market.v1beta1.Tx.MsgSwap =
  iq.market.v1beta1.MsgSwapKt.Dsl._create(this.toBuilder()).apply { block() }._build()
