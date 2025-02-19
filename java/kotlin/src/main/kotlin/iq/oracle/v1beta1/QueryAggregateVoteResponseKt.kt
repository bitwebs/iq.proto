//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/query.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryAggregateVoteResponse(block: iq.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse =
  iq.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl._create(iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.newBuilder()).apply { block() }._build()
object QueryAggregateVoteResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse = _builder.build()

    /**
     * <pre>
     * aggregate_vote defines oracle aggregate vote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_vote = 1 [(.gogoproto.nullable) = false];</code>
     */
    var aggregateVote: iq.oracle.v1beta1.Oracle.AggregateExchangeRateVote
      @JvmName("getAggregateVote")
      get() = _builder.getAggregateVote()
      @JvmName("setAggregateVote")
      set(value) {
        _builder.setAggregateVote(value)
      }
    /**
     * <pre>
     * aggregate_vote defines oracle aggregate vote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_vote = 1 [(.gogoproto.nullable) = false];</code>
     */
    fun clearAggregateVote() {
      _builder.clearAggregateVote()
    }
    /**
     * <pre>
     * aggregate_vote defines oracle aggregate vote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.iq.oracle.v1beta1.AggregateExchangeRateVote aggregate_vote = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the aggregateVote field is set.
     */
    fun hasAggregateVote(): kotlin.Boolean {
      return _builder.hasAggregateVote()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.copy(block: iq.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse =
  iq.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
