//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/oracle/v1beta1/genesis.proto

package iq.oracle.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun missCounter(block: iq.oracle.v1beta1.MissCounterKt.Dsl.() -> Unit): iq.oracle.v1beta1.Genesis.MissCounter =
  iq.oracle.v1beta1.MissCounterKt.Dsl._create(iq.oracle.v1beta1.Genesis.MissCounter.newBuilder()).apply { block() }._build()
object MissCounterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.oracle.v1beta1.Genesis.MissCounter.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.oracle.v1beta1.Genesis.MissCounter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.oracle.v1beta1.Genesis.MissCounter = _builder.build()

    /**
     * <code>string validator_address = 1;</code>
     */
    var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>string validator_address = 1;</code>
     */
    fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <code>uint64 miss_counter = 2;</code>
     */
    var missCounter: kotlin.Long
      @JvmName("getMissCounter")
      get() = _builder.getMissCounter()
      @JvmName("setMissCounter")
      set(value) {
        _builder.setMissCounter(value)
      }
    /**
     * <code>uint64 miss_counter = 2;</code>
     */
    fun clearMissCounter() {
      _builder.clearMissCounter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.oracle.v1beta1.Genesis.MissCounter.copy(block: iq.oracle.v1beta1.MissCounterKt.Dsl.() -> Unit): iq.oracle.v1beta1.Genesis.MissCounter =
  iq.oracle.v1beta1.MissCounterKt.Dsl._create(this.toBuilder()).apply { block() }._build()
