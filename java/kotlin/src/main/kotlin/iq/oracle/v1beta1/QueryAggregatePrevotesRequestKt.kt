//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/query.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryAggregatePrevotesRequest(block: iq.oracle.v1beta1.QueryAggregatePrevotesRequestKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest =
  iq.oracle.v1beta1.QueryAggregatePrevotesRequestKt.Dsl._create(iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest.newBuilder()).apply { block() }._build()
object QueryAggregatePrevotesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest.copy(block: iq.oracle.v1beta1.QueryAggregatePrevotesRequestKt.Dsl.() -> Unit): iq.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevotesRequest =
  iq.oracle.v1beta1.QueryAggregatePrevotesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
