//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/query.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryAggregatePrevotesResponse(block: iq.oracle.v1beta1.QueryAggregatePrevotesResponseKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse =
  iq.oracle.v1beta1.QueryAggregatePrevotesResponseKt.Dsl._create(iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse.newBuilder()).apply { block() }._build()
object QueryAggregatePrevotesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class AggregatePrevotesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     */
     val aggregatePrevotes: com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAggregatePrevotesList()
      )
    /**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The aggregatePrevotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAggregatePrevotes")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>.add(value: iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote) {
      _builder.addAggregatePrevotes(value)
    }/**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The aggregatePrevotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAggregatePrevotes")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>.plusAssign(value: iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote) {
      add(value)
    }/**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The aggregatePrevotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAggregatePrevotes")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>.addAll(values: kotlin.collections.Iterable<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote>) {
      _builder.addAllAggregatePrevotes(values)
    }/**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The aggregatePrevotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAggregatePrevotes")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>.plusAssign(values: kotlin.collections.Iterable<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote>) {
      addAll(values)
    }/**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The aggregatePrevotes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAggregatePrevotes")
    operator fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>.set(index: kotlin.Int, value: iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote) {
      _builder.setAggregatePrevotes(index, value)
    }/**
     * <pre>
     * aggregate_prevotes defines all oracle aggregate prevotes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .iq.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevotes = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAggregatePrevotes")
    fun com.google.protobuf.kotlin.DslList<iq.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote, AggregatePrevotesProxy>.clear() {
      _builder.clearAggregatePrevotes()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse.copy(block: iq.oracle.v1beta1.QueryAggregatePrevotesResponseKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesResponse =
  iq.oracle.v1beta1.QueryAggregatePrevotesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
