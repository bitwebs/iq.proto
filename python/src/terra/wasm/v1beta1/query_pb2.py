# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: terra/wasm/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from terra.wasm.v1beta1 import wasm_pb2 as terra_dot_wasm_dot_v1beta1_dot_wasm__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='terra/wasm/v1beta1/query.proto',
  package='terra.wasm.v1beta1',
  syntax='proto3',
  serialized_options=b'Z(github.com/terra-money/core/x/wasm/types',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1eterra/wasm/v1beta1/query.proto\x12\x12terra.wasm.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1dterra/wasm/v1beta1/wasm.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"1\n\x14QueryCodeInfoRequest\x12\x0f\n\x07\x63ode_id\x18\x01 \x01(\x04:\x08\xe8\xa0\x1f\x00\x88\xa0\x1f\x00\"N\n\x15QueryCodeInfoResponse\x12\x35\n\tcode_info\x18\x01 \x01(\x0b\x32\x1c.terra.wasm.v1beta1.CodeInfoB\x04\xc8\xde\x1f\x00\"1\n\x14QueryByteCodeRequest\x12\x0f\n\x07\x63ode_id\x18\x01 \x01(\x04:\x08\xe8\xa0\x1f\x00\x88\xa0\x1f\x00\"*\n\x15QueryByteCodeResponse\x12\x11\n\tbyte_code\x18\x01 \x01(\x0c\">\n\x18QueryContractInfoRequest\x12\x18\n\x10\x63ontract_address\x18\x01 \x01(\t:\x08\xe8\xa0\x1f\x00\x88\xa0\x1f\x00\"Z\n\x19QueryContractInfoResponse\x12=\n\rcontract_info\x18\x01 \x01(\x0b\x32 .terra.wasm.v1beta1.ContractInfoB\x04\xc8\xde\x1f\x00\"p\n\x19QueryContractStoreRequest\x12\x18\n\x10\x63ontract_address\x18\x01 \x01(\t\x12/\n\tquery_msg\x18\x02 \x01(\x0c\x42\x1c\xfa\xde\x1f\x18\x65ncoding/json.RawMessage:\x08\xe8\xa0\x1f\x00\x88\xa0\x1f\x00\"P\n\x1aQueryContractStoreResponse\x12\x32\n\x0cquery_result\x18\x01 \x01(\x0c\x42\x1c\xfa\xde\x1f\x18\x65ncoding/json.RawMessage\"G\n\x14QueryRawStoreRequest\x12\x18\n\x10\x63ontract_address\x18\x01 \x01(\t\x12\x0b\n\x03key\x18\x02 \x01(\x0c:\x08\xe8\xa0\x1f\x00\x88\xa0\x1f\x00\"%\n\x15QueryRawStoreResponse\x12\x0c\n\x04\x64\x61ta\x18\x01 \x01(\x0c\"\x14\n\x12QueryParamsRequest\"G\n\x13QueryParamsResponse\x12\x30\n\x06params\x18\x01 \x01(\x0b\x32\x1a.terra.wasm.v1beta1.ParamsB\x04\xc8\xde\x1f\x00\x32\xab\x07\n\x05Query\x12\x8c\x01\n\x08\x43odeInfo\x12(.terra.wasm.v1beta1.QueryCodeInfoRequest\x1a).terra.wasm.v1beta1.QueryCodeInfoResponse\"+\x82\xd3\xe4\x93\x02%\x12#/terra/wasm/v1beta1/codes/{code_id}\x12\x96\x01\n\x08\x42yteCode\x12(.terra.wasm.v1beta1.QueryByteCodeRequest\x1a).terra.wasm.v1beta1.QueryByteCodeResponse\"5\x82\xd3\xe4\x93\x02/\x12-/terra/wasm/v1beta1/codes/{code_id}/byte_code\x12\xa5\x01\n\x0c\x43ontractInfo\x12,.terra.wasm.v1beta1.QueryContractInfoRequest\x1a-.terra.wasm.v1beta1.QueryContractInfoResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/terra/wasm/v1beta1/contracts/{contract_address}\x12\xad\x01\n\rContractStore\x12-.terra.wasm.v1beta1.QueryContractStoreRequest\x1a..terra.wasm.v1beta1.QueryContractStoreResponse\"=\x82\xd3\xe4\x93\x02\x37\x12\x35/terra/wasm/v1beta1/contract/{contract_address}/store\x12\xa2\x01\n\x08RawStore\x12(.terra.wasm.v1beta1.QueryRawStoreRequest\x1a).terra.wasm.v1beta1.QueryRawStoreResponse\"A\x82\xd3\xe4\x93\x02;\x12\x39/terra/wasm/v1beta1/contract/{contract_address}/store/raw\x12}\n\x06Params\x12&.terra.wasm.v1beta1.QueryParamsRequest\x1a\'.terra.wasm.v1beta1.QueryParamsResponse\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/terra/wasm/v1beta1/paramsB*Z(github.com/terra-money/core/x/wasm/typesb\x06proto3'
  ,
  dependencies=[gogoproto_dot_gogo__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,terra_dot_wasm_dot_v1beta1_dot_wasm__pb2.DESCRIPTOR,cosmos_dot_base_dot_v1beta1_dot_coin__pb2.DESCRIPTOR,])




_QUERYCODEINFOREQUEST = _descriptor.Descriptor(
  name='QueryCodeInfoRequest',
  full_name='terra.wasm.v1beta1.QueryCodeInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code_id', full_name='terra.wasm.v1beta1.QueryCodeInfoRequest.code_id', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\350\240\037\000\210\240\037\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=169,
  serialized_end=218,
)


_QUERYCODEINFORESPONSE = _descriptor.Descriptor(
  name='QueryCodeInfoResponse',
  full_name='terra.wasm.v1beta1.QueryCodeInfoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code_info', full_name='terra.wasm.v1beta1.QueryCodeInfoResponse.code_info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=220,
  serialized_end=298,
)


_QUERYBYTECODEREQUEST = _descriptor.Descriptor(
  name='QueryByteCodeRequest',
  full_name='terra.wasm.v1beta1.QueryByteCodeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code_id', full_name='terra.wasm.v1beta1.QueryByteCodeRequest.code_id', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\350\240\037\000\210\240\037\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=300,
  serialized_end=349,
)


_QUERYBYTECODERESPONSE = _descriptor.Descriptor(
  name='QueryByteCodeResponse',
  full_name='terra.wasm.v1beta1.QueryByteCodeResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='byte_code', full_name='terra.wasm.v1beta1.QueryByteCodeResponse.byte_code', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=351,
  serialized_end=393,
)


_QUERYCONTRACTINFOREQUEST = _descriptor.Descriptor(
  name='QueryContractInfoRequest',
  full_name='terra.wasm.v1beta1.QueryContractInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='contract_address', full_name='terra.wasm.v1beta1.QueryContractInfoRequest.contract_address', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\350\240\037\000\210\240\037\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=395,
  serialized_end=457,
)


_QUERYCONTRACTINFORESPONSE = _descriptor.Descriptor(
  name='QueryContractInfoResponse',
  full_name='terra.wasm.v1beta1.QueryContractInfoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='contract_info', full_name='terra.wasm.v1beta1.QueryContractInfoResponse.contract_info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=459,
  serialized_end=549,
)


_QUERYCONTRACTSTOREREQUEST = _descriptor.Descriptor(
  name='QueryContractStoreRequest',
  full_name='terra.wasm.v1beta1.QueryContractStoreRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='contract_address', full_name='terra.wasm.v1beta1.QueryContractStoreRequest.contract_address', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='query_msg', full_name='terra.wasm.v1beta1.QueryContractStoreRequest.query_msg', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372\336\037\030encoding/json.RawMessage', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\350\240\037\000\210\240\037\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=551,
  serialized_end=663,
)


_QUERYCONTRACTSTORERESPONSE = _descriptor.Descriptor(
  name='QueryContractStoreResponse',
  full_name='terra.wasm.v1beta1.QueryContractStoreResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='query_result', full_name='terra.wasm.v1beta1.QueryContractStoreResponse.query_result', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372\336\037\030encoding/json.RawMessage', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=665,
  serialized_end=745,
)


_QUERYRAWSTOREREQUEST = _descriptor.Descriptor(
  name='QueryRawStoreRequest',
  full_name='terra.wasm.v1beta1.QueryRawStoreRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='contract_address', full_name='terra.wasm.v1beta1.QueryRawStoreRequest.contract_address', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='key', full_name='terra.wasm.v1beta1.QueryRawStoreRequest.key', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\350\240\037\000\210\240\037\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=747,
  serialized_end=818,
)


_QUERYRAWSTORERESPONSE = _descriptor.Descriptor(
  name='QueryRawStoreResponse',
  full_name='terra.wasm.v1beta1.QueryRawStoreResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='terra.wasm.v1beta1.QueryRawStoreResponse.data', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=820,
  serialized_end=857,
)


_QUERYPARAMSREQUEST = _descriptor.Descriptor(
  name='QueryParamsRequest',
  full_name='terra.wasm.v1beta1.QueryParamsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=859,
  serialized_end=879,
)


_QUERYPARAMSRESPONSE = _descriptor.Descriptor(
  name='QueryParamsResponse',
  full_name='terra.wasm.v1beta1.QueryParamsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='params', full_name='terra.wasm.v1beta1.QueryParamsResponse.params', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\310\336\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=881,
  serialized_end=952,
)

_QUERYCODEINFORESPONSE.fields_by_name['code_info'].message_type = terra_dot_wasm_dot_v1beta1_dot_wasm__pb2._CODEINFO
_QUERYCONTRACTINFORESPONSE.fields_by_name['contract_info'].message_type = terra_dot_wasm_dot_v1beta1_dot_wasm__pb2._CONTRACTINFO
_QUERYPARAMSRESPONSE.fields_by_name['params'].message_type = terra_dot_wasm_dot_v1beta1_dot_wasm__pb2._PARAMS
DESCRIPTOR.message_types_by_name['QueryCodeInfoRequest'] = _QUERYCODEINFOREQUEST
DESCRIPTOR.message_types_by_name['QueryCodeInfoResponse'] = _QUERYCODEINFORESPONSE
DESCRIPTOR.message_types_by_name['QueryByteCodeRequest'] = _QUERYBYTECODEREQUEST
DESCRIPTOR.message_types_by_name['QueryByteCodeResponse'] = _QUERYBYTECODERESPONSE
DESCRIPTOR.message_types_by_name['QueryContractInfoRequest'] = _QUERYCONTRACTINFOREQUEST
DESCRIPTOR.message_types_by_name['QueryContractInfoResponse'] = _QUERYCONTRACTINFORESPONSE
DESCRIPTOR.message_types_by_name['QueryContractStoreRequest'] = _QUERYCONTRACTSTOREREQUEST
DESCRIPTOR.message_types_by_name['QueryContractStoreResponse'] = _QUERYCONTRACTSTORERESPONSE
DESCRIPTOR.message_types_by_name['QueryRawStoreRequest'] = _QUERYRAWSTOREREQUEST
DESCRIPTOR.message_types_by_name['QueryRawStoreResponse'] = _QUERYRAWSTORERESPONSE
DESCRIPTOR.message_types_by_name['QueryParamsRequest'] = _QUERYPARAMSREQUEST
DESCRIPTOR.message_types_by_name['QueryParamsResponse'] = _QUERYPARAMSRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

QueryCodeInfoRequest = _reflection.GeneratedProtocolMessageType('QueryCodeInfoRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYCODEINFOREQUEST,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryCodeInfoRequest)
  })
_sym_db.RegisterMessage(QueryCodeInfoRequest)

QueryCodeInfoResponse = _reflection.GeneratedProtocolMessageType('QueryCodeInfoResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYCODEINFORESPONSE,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryCodeInfoResponse)
  })
_sym_db.RegisterMessage(QueryCodeInfoResponse)

QueryByteCodeRequest = _reflection.GeneratedProtocolMessageType('QueryByteCodeRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYBYTECODEREQUEST,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryByteCodeRequest)
  })
_sym_db.RegisterMessage(QueryByteCodeRequest)

QueryByteCodeResponse = _reflection.GeneratedProtocolMessageType('QueryByteCodeResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYBYTECODERESPONSE,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryByteCodeResponse)
  })
_sym_db.RegisterMessage(QueryByteCodeResponse)

QueryContractInfoRequest = _reflection.GeneratedProtocolMessageType('QueryContractInfoRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYCONTRACTINFOREQUEST,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryContractInfoRequest)
  })
_sym_db.RegisterMessage(QueryContractInfoRequest)

QueryContractInfoResponse = _reflection.GeneratedProtocolMessageType('QueryContractInfoResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYCONTRACTINFORESPONSE,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryContractInfoResponse)
  })
_sym_db.RegisterMessage(QueryContractInfoResponse)

QueryContractStoreRequest = _reflection.GeneratedProtocolMessageType('QueryContractStoreRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYCONTRACTSTOREREQUEST,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryContractStoreRequest)
  })
_sym_db.RegisterMessage(QueryContractStoreRequest)

QueryContractStoreResponse = _reflection.GeneratedProtocolMessageType('QueryContractStoreResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYCONTRACTSTORERESPONSE,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryContractStoreResponse)
  })
_sym_db.RegisterMessage(QueryContractStoreResponse)

QueryRawStoreRequest = _reflection.GeneratedProtocolMessageType('QueryRawStoreRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYRAWSTOREREQUEST,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryRawStoreRequest)
  })
_sym_db.RegisterMessage(QueryRawStoreRequest)

QueryRawStoreResponse = _reflection.GeneratedProtocolMessageType('QueryRawStoreResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYRAWSTORERESPONSE,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryRawStoreResponse)
  })
_sym_db.RegisterMessage(QueryRawStoreResponse)

QueryParamsRequest = _reflection.GeneratedProtocolMessageType('QueryParamsRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYPARAMSREQUEST,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryParamsRequest)
  })
_sym_db.RegisterMessage(QueryParamsRequest)

QueryParamsResponse = _reflection.GeneratedProtocolMessageType('QueryParamsResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYPARAMSRESPONSE,
  '__module__' : 'terra.wasm.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:terra.wasm.v1beta1.QueryParamsResponse)
  })
_sym_db.RegisterMessage(QueryParamsResponse)


DESCRIPTOR._options = None
_QUERYCODEINFOREQUEST._options = None
_QUERYCODEINFORESPONSE.fields_by_name['code_info']._options = None
_QUERYBYTECODEREQUEST._options = None
_QUERYCONTRACTINFOREQUEST._options = None
_QUERYCONTRACTINFORESPONSE.fields_by_name['contract_info']._options = None
_QUERYCONTRACTSTOREREQUEST.fields_by_name['query_msg']._options = None
_QUERYCONTRACTSTOREREQUEST._options = None
_QUERYCONTRACTSTORERESPONSE.fields_by_name['query_result']._options = None
_QUERYRAWSTOREREQUEST._options = None
_QUERYPARAMSRESPONSE.fields_by_name['params']._options = None

_QUERY = _descriptor.ServiceDescriptor(
  name='Query',
  full_name='terra.wasm.v1beta1.Query',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=955,
  serialized_end=1894,
  methods=[
  _descriptor.MethodDescriptor(
    name='CodeInfo',
    full_name='terra.wasm.v1beta1.Query.CodeInfo',
    index=0,
    containing_service=None,
    input_type=_QUERYCODEINFOREQUEST,
    output_type=_QUERYCODEINFORESPONSE,
    serialized_options=b'\202\323\344\223\002%\022#/terra/wasm/v1beta1/codes/{code_id}',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ByteCode',
    full_name='terra.wasm.v1beta1.Query.ByteCode',
    index=1,
    containing_service=None,
    input_type=_QUERYBYTECODEREQUEST,
    output_type=_QUERYBYTECODERESPONSE,
    serialized_options=b'\202\323\344\223\002/\022-/terra/wasm/v1beta1/codes/{code_id}/byte_code',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ContractInfo',
    full_name='terra.wasm.v1beta1.Query.ContractInfo',
    index=2,
    containing_service=None,
    input_type=_QUERYCONTRACTINFOREQUEST,
    output_type=_QUERYCONTRACTINFORESPONSE,
    serialized_options=b'\202\323\344\223\0022\0220/terra/wasm/v1beta1/contracts/{contract_address}',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ContractStore',
    full_name='terra.wasm.v1beta1.Query.ContractStore',
    index=3,
    containing_service=None,
    input_type=_QUERYCONTRACTSTOREREQUEST,
    output_type=_QUERYCONTRACTSTORERESPONSE,
    serialized_options=b'\202\323\344\223\0027\0225/terra/wasm/v1beta1/contract/{contract_address}/store',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RawStore',
    full_name='terra.wasm.v1beta1.Query.RawStore',
    index=4,
    containing_service=None,
    input_type=_QUERYRAWSTOREREQUEST,
    output_type=_QUERYRAWSTORERESPONSE,
    serialized_options=b'\202\323\344\223\002;\0229/terra/wasm/v1beta1/contract/{contract_address}/store/raw',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Params',
    full_name='terra.wasm.v1beta1.Query.Params',
    index=5,
    containing_service=None,
    input_type=_QUERYPARAMSREQUEST,
    output_type=_QUERYPARAMSRESPONSE,
    serialized_options=b'\202\323\344\223\002\034\022\032/terra/wasm/v1beta1/params',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_QUERY)

DESCRIPTOR.services_by_name['Query'] = _QUERY

# @@protoc_insertion_point(module_scope)
