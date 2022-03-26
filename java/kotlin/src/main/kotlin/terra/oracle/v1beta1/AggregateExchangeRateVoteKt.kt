//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/oracle.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun aggregateExchangeRateVote(block: iq.oracle.v1beta1.AggregateExchangeRateVoteKt.Dsl.() -> Unit): iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote =
  iq.oracle.v1beta1.AggregateExchangeRateVoteKt.Dsl._create(iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote.newBuilder()).apply { block() }._build()
object AggregateExchangeRateVoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ExchangeRateTuplesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
     val exchangeRateTuples: com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getExchangeRateTuplesList()
      )
    /**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     * @param value The exchangeRateTuples to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addExchangeRateTuples")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>.add(value: iq.oracle.v1beta1.Oracle.ExchangeRateTuple) {
      _builder.addExchangeRateTuples(value)
    }/**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     * @param value The exchangeRateTuples to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignExchangeRateTuples")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>.plusAssign(value: iq.oracle.v1beta1.Oracle.ExchangeRateTuple) {
      add(value)
    }/**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     * @param values The exchangeRateTuples to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllExchangeRateTuples")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>.addAll(values: kotlin.collections.Iterable<iq.oracle.v1beta1.Oracle.ExchangeRateTuple>) {
      _builder.addAllExchangeRateTuples(values)
    }/**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     * @param values The exchangeRateTuples to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllExchangeRateTuples")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>.plusAssign(values: kotlin.collections.Iterable<iq.oracle.v1beta1.Oracle.ExchangeRateTuple>) {
      addAll(values)
    }/**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     * @param index The index to set the value at.
     * @param value The exchangeRateTuples to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setExchangeRateTuples")
    operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>.set(index: kotlin.Int, value: iq.oracle.v1beta1.Oracle.ExchangeRateTuple) {
      _builder.setExchangeRateTuples(index, value)
    }/**
     * <code>repeated .iq.oracle.v1beta1.ExchangeRateTuple exchange_rate_tuples = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"exchange_rate_tuples&#92;"", (.gogoproto.castrepeated) = "ExchangeRateTuples"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearExchangeRateTuples")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.ExchangeRateTuple, ExchangeRateTuplesProxy>.clear() {
      _builder.clearExchangeRateTuples()
    }
    /**
     * <code>string voter = 2 [(.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     */
    var voter: kotlin.String
      @JvmName("getVoter")
      get() = _builder.getVoter()
      @JvmName("setVoter")
      set(value) {
        _builder.setVoter(value)
      }
    /**
     * <code>string voter = 2 [(.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     */
    fun clearVoter() {
      _builder.clearVoter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote.copy(block: iq.oracle.v1beta1.AggregateExchangeRateVoteKt.Dsl.() -> Unit): iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote =
  iq.oracle.v1beta1.AggregateExchangeRateVoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()
