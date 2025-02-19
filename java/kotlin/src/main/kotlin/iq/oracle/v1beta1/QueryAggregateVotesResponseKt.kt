//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/query.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryAggregateVotesResponse(block: iq.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse =
  iq.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl._create(iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.newBuilder()).apply { block() }._build()
object QueryAggregateVotesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class AggregateVotesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     */
     val aggregateVotes: com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAggregateVotesList()
      )
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAggregateVotes")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.add(value: iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote) {
      _builder.addAggregateVotes(value)
    }/**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAggregateVotes")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.plusAssign(value: iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote) {
      add(value)
    }/**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAggregateVotes")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.addAll(values: kotlin.collections.Iterable<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote>) {
      _builder.addAllAggregateVotes(values)
    }/**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAggregateVotes")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.plusAssign(values: kotlin.collections.Iterable<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote>) {
      addAll(values)
    }/**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The aggregateVotes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAggregateVotes")
    operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.set(index: kotlin.Int, value: iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote) {
      _builder.setAggregateVotes(index, value)
    }/**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAggregateVotes")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.clear() {
      _builder.clearAggregateVotes()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.copy(block: iq.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse =
  iq.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
