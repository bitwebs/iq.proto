//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/vesting/v1beta1/vesting.proto

package iq.vesting.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun lazyGradedVestingAccount(block: iq.vesting.v1beta1.LazyGradedVestingAccountKt.Dsl.() -> Unit): iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount =
  iq.vesting.v1beta1.LazyGradedVestingAccountKt.Dsl._create(iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount.newBuilder()).apply { block() }._build()
object LazyGradedVestingAccountKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount = _builder.build()

    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [(.gogoproto.embed) = true];</code>
     */
    var baseVestingAccount: cosmos.vesting.v1beta1.Vesting.BaseVestingAccount
      @JvmName("getBaseVestingAccount")
      get() = _builder.getBaseVestingAccount()
      @JvmName("setBaseVestingAccount")
      set(value) {
        _builder.setBaseVestingAccount(value)
      }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [(.gogoproto.embed) = true];</code>
     */
    fun clearBaseVestingAccount() {
      _builder.clearBaseVestingAccount()
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [(.gogoproto.embed) = true];</code>
     * @return Whether the baseVestingAccount field is set.
     */
    fun hasBaseVestingAccount(): kotlin.Boolean {
      return _builder.hasBaseVestingAccount()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class VestingSchedulesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     */
     val vestingSchedules: com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getVestingSchedulesList()
      )
    /**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     * @param value The vestingSchedules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addVestingSchedules")
    fun com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>.add(value: iq.vesting.v1beta1.Vesting.VestingSchedule) {
      _builder.addVestingSchedules(value)
    }/**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     * @param value The vestingSchedules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignVestingSchedules")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>.plusAssign(value: iq.vesting.v1beta1.Vesting.VestingSchedule) {
      add(value)
    }/**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     * @param values The vestingSchedules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllVestingSchedules")
    fun com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>.addAll(values: kotlin.collections.Iterable<iq.vesting.v1beta1.Vesting.VestingSchedule>) {
      _builder.addAllVestingSchedules(values)
    }/**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     * @param values The vestingSchedules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllVestingSchedules")
    inline operator fun com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>.plusAssign(values: kotlin.collections.Iterable<iq.vesting.v1beta1.Vesting.VestingSchedule>) {
      addAll(values)
    }/**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     * @param index The index to set the value at.
     * @param value The vestingSchedules to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setVestingSchedules")
    operator fun com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>.set(index: kotlin.Int, value: iq.vesting.v1beta1.Vesting.VestingSchedule) {
      _builder.setVestingSchedules(index, value)
    }/**
     * <code>repeated .iq.vesting.v1beta1.VestingSchedule vesting_schedules = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_schedules&#92;"", (.gogoproto.castrepeated) = "VestingSchedules"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearVestingSchedules")
    fun com.google.protobuf.kotlin.DslList<iq.vesting.v1beta1.Vesting.VestingSchedule, VestingSchedulesProxy>.clear() {
      _builder.clearVestingSchedules()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount.copy(block: iq.vesting.v1beta1.LazyGradedVestingAccountKt.Dsl.() -> Unit): iq.vesting.v1beta1.Vesting.LazyGradedVestingAccount =
  iq.vesting.v1beta1.LazyGradedVestingAccountKt.Dsl._create(this.toBuilder()).apply { block() }._build()
