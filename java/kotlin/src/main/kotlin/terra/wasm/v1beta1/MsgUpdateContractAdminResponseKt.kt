//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iq/wasm/v1beta1/tx.proto

package iq.wasm.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgUpdateContractAdminResponse(block: iq.wasm.v1beta1.MsgUpdateContractAdminResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse =
  iq.wasm.v1beta1.MsgUpdateContractAdminResponseKt.Dsl._create(iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse.newBuilder()).apply { block() }._build()
object MsgUpdateContractAdminResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse.copy(block: iq.wasm.v1beta1.MsgUpdateContractAdminResponseKt.Dsl.() -> Unit): iq.wasm.v1beta1.Tx.MsgUpdateContractAdminResponse =
  iq.wasm.v1beta1.MsgUpdateContractAdminResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
