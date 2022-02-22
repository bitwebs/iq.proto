// This file is generated by rust-protobuf 2.25.2. Do not edit
// @generated

// https://github.com/rust-lang/rust-clippy/issues/702
#![allow(unknown_lints)]
#![allow(clippy::all)]

#![allow(unused_attributes)]
#![cfg_attr(rustfmt, rustfmt::skip)]

#![allow(box_pointers)]
#![allow(dead_code)]
#![allow(missing_docs)]
#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]
#![allow(trivial_casts)]
#![allow(unused_imports)]
#![allow(unused_results)]
//! Generated file from `terra/market/v1beta1/tx.proto`

/// Generated files are compatible only with the same version
/// of protobuf runtime.
// const _PROTOBUF_VERSION_CHECK: () = ::protobuf::VERSION_2_25_2;

#[derive(PartialEq,Clone,Default)]
pub struct MsgSwap {
    // message fields
    pub trader: ::std::string::String,
    pub offer_coin: ::protobuf::SingularPtrField<super::coin::Coin>,
    pub ask_denom: ::std::string::String,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a MsgSwap {
    fn default() -> &'a MsgSwap {
        <MsgSwap as ::protobuf::Message>::default_instance()
    }
}

impl MsgSwap {
    pub fn new() -> MsgSwap {
        ::std::default::Default::default()
    }

    // string trader = 1;


    pub fn get_trader(&self) -> &str {
        &self.trader
    }
    pub fn clear_trader(&mut self) {
        self.trader.clear();
    }

    // Param is passed by value, moved
    pub fn set_trader(&mut self, v: ::std::string::String) {
        self.trader = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_trader(&mut self) -> &mut ::std::string::String {
        &mut self.trader
    }

    // Take field
    pub fn take_trader(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.trader, ::std::string::String::new())
    }

    // .cosmos.base.v1beta1.Coin offer_coin = 2;


    pub fn get_offer_coin(&self) -> &super::coin::Coin {
        self.offer_coin.as_ref().unwrap_or_else(|| <super::coin::Coin as ::protobuf::Message>::default_instance())
    }
    pub fn clear_offer_coin(&mut self) {
        self.offer_coin.clear();
    }

    pub fn has_offer_coin(&self) -> bool {
        self.offer_coin.is_some()
    }

    // Param is passed by value, moved
    pub fn set_offer_coin(&mut self, v: super::coin::Coin) {
        self.offer_coin = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_offer_coin(&mut self) -> &mut super::coin::Coin {
        if self.offer_coin.is_none() {
            self.offer_coin.set_default();
        }
        self.offer_coin.as_mut().unwrap()
    }

    // Take field
    pub fn take_offer_coin(&mut self) -> super::coin::Coin {
        self.offer_coin.take().unwrap_or_else(|| super::coin::Coin::new())
    }

    // string ask_denom = 3;


    pub fn get_ask_denom(&self) -> &str {
        &self.ask_denom
    }
    pub fn clear_ask_denom(&mut self) {
        self.ask_denom.clear();
    }

    // Param is passed by value, moved
    pub fn set_ask_denom(&mut self, v: ::std::string::String) {
        self.ask_denom = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_ask_denom(&mut self) -> &mut ::std::string::String {
        &mut self.ask_denom
    }

    // Take field
    pub fn take_ask_denom(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.ask_denom, ::std::string::String::new())
    }
}

impl ::protobuf::Message for MsgSwap {
    fn is_initialized(&self) -> bool {
        for v in &self.offer_coin {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.trader)?;
                },
                2 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.offer_coin)?;
                },
                3 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.ask_denom)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if !self.trader.is_empty() {
            my_size += ::protobuf::rt::string_size(1, &self.trader);
        }
        if let Some(ref v) = self.offer_coin.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if !self.ask_denom.is_empty() {
            my_size += ::protobuf::rt::string_size(3, &self.ask_denom);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if !self.trader.is_empty() {
            os.write_string(1, &self.trader)?;
        }
        if let Some(ref v) = self.offer_coin.as_ref() {
            os.write_tag(2, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if !self.ask_denom.is_empty() {
            os.write_string(3, &self.ask_denom)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: ::std::boxed::Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> MsgSwap {
        MsgSwap::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static descriptor: ::protobuf::rt::LazyV2<::protobuf::reflect::MessageDescriptor> = ::protobuf::rt::LazyV2::INIT;
        descriptor.get(|| {
            let mut fields = ::std::vec::Vec::new();
            fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                "trader",
                |m: &MsgSwap| { &m.trader },
                |m: &mut MsgSwap| { &mut m.trader },
            ));
            fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::coin::Coin>>(
                "offer_coin",
                |m: &MsgSwap| { &m.offer_coin },
                |m: &mut MsgSwap| { &mut m.offer_coin },
            ));
            fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                "ask_denom",
                |m: &MsgSwap| { &m.ask_denom },
                |m: &mut MsgSwap| { &mut m.ask_denom },
            ));
            ::protobuf::reflect::MessageDescriptor::new_pb_name::<MsgSwap>(
                "MsgSwap",
                fields,
                file_descriptor_proto()
            )
        })
    }

    fn default_instance() -> &'static MsgSwap {
        static instance: ::protobuf::rt::LazyV2<MsgSwap> = ::protobuf::rt::LazyV2::INIT;
        instance.get(MsgSwap::new)
    }
}

impl ::protobuf::Clear for MsgSwap {
    fn clear(&mut self) {
        self.trader.clear();
        self.offer_coin.clear();
        self.ask_denom.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for MsgSwap {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for MsgSwap {
    fn as_ref(&self) -> ::protobuf::reflect::ReflectValueRef {
        ::protobuf::reflect::ReflectValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct MsgSwapResponse {
    // message fields
    pub swap_coin: ::protobuf::SingularPtrField<super::coin::Coin>,
    pub swap_fee: ::protobuf::SingularPtrField<super::coin::Coin>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a MsgSwapResponse {
    fn default() -> &'a MsgSwapResponse {
        <MsgSwapResponse as ::protobuf::Message>::default_instance()
    }
}

impl MsgSwapResponse {
    pub fn new() -> MsgSwapResponse {
        ::std::default::Default::default()
    }

    // .cosmos.base.v1beta1.Coin swap_coin = 1;


    pub fn get_swap_coin(&self) -> &super::coin::Coin {
        self.swap_coin.as_ref().unwrap_or_else(|| <super::coin::Coin as ::protobuf::Message>::default_instance())
    }
    pub fn clear_swap_coin(&mut self) {
        self.swap_coin.clear();
    }

    pub fn has_swap_coin(&self) -> bool {
        self.swap_coin.is_some()
    }

    // Param is passed by value, moved
    pub fn set_swap_coin(&mut self, v: super::coin::Coin) {
        self.swap_coin = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_swap_coin(&mut self) -> &mut super::coin::Coin {
        if self.swap_coin.is_none() {
            self.swap_coin.set_default();
        }
        self.swap_coin.as_mut().unwrap()
    }

    // Take field
    pub fn take_swap_coin(&mut self) -> super::coin::Coin {
        self.swap_coin.take().unwrap_or_else(|| super::coin::Coin::new())
    }

    // .cosmos.base.v1beta1.Coin swap_fee = 2;


    pub fn get_swap_fee(&self) -> &super::coin::Coin {
        self.swap_fee.as_ref().unwrap_or_else(|| <super::coin::Coin as ::protobuf::Message>::default_instance())
    }
    pub fn clear_swap_fee(&mut self) {
        self.swap_fee.clear();
    }

    pub fn has_swap_fee(&self) -> bool {
        self.swap_fee.is_some()
    }

    // Param is passed by value, moved
    pub fn set_swap_fee(&mut self, v: super::coin::Coin) {
        self.swap_fee = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_swap_fee(&mut self) -> &mut super::coin::Coin {
        if self.swap_fee.is_none() {
            self.swap_fee.set_default();
        }
        self.swap_fee.as_mut().unwrap()
    }

    // Take field
    pub fn take_swap_fee(&mut self) -> super::coin::Coin {
        self.swap_fee.take().unwrap_or_else(|| super::coin::Coin::new())
    }
}

impl ::protobuf::Message for MsgSwapResponse {
    fn is_initialized(&self) -> bool {
        for v in &self.swap_coin {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.swap_fee {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.swap_coin)?;
                },
                2 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.swap_fee)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if let Some(ref v) = self.swap_coin.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if let Some(ref v) = self.swap_fee.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if let Some(ref v) = self.swap_coin.as_ref() {
            os.write_tag(1, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if let Some(ref v) = self.swap_fee.as_ref() {
            os.write_tag(2, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: ::std::boxed::Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> MsgSwapResponse {
        MsgSwapResponse::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static descriptor: ::protobuf::rt::LazyV2<::protobuf::reflect::MessageDescriptor> = ::protobuf::rt::LazyV2::INIT;
        descriptor.get(|| {
            let mut fields = ::std::vec::Vec::new();
            fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::coin::Coin>>(
                "swap_coin",
                |m: &MsgSwapResponse| { &m.swap_coin },
                |m: &mut MsgSwapResponse| { &mut m.swap_coin },
            ));
            fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::coin::Coin>>(
                "swap_fee",
                |m: &MsgSwapResponse| { &m.swap_fee },
                |m: &mut MsgSwapResponse| { &mut m.swap_fee },
            ));
            ::protobuf::reflect::MessageDescriptor::new_pb_name::<MsgSwapResponse>(
                "MsgSwapResponse",
                fields,
                file_descriptor_proto()
            )
        })
    }

    fn default_instance() -> &'static MsgSwapResponse {
        static instance: ::protobuf::rt::LazyV2<MsgSwapResponse> = ::protobuf::rt::LazyV2::INIT;
        instance.get(MsgSwapResponse::new)
    }
}

impl ::protobuf::Clear for MsgSwapResponse {
    fn clear(&mut self) {
        self.swap_coin.clear();
        self.swap_fee.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for MsgSwapResponse {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for MsgSwapResponse {
    fn as_ref(&self) -> ::protobuf::reflect::ReflectValueRef {
        ::protobuf::reflect::ReflectValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct MsgSwapSend {
    // message fields
    pub from_address: ::std::string::String,
    pub to_address: ::std::string::String,
    pub offer_coin: ::protobuf::SingularPtrField<super::coin::Coin>,
    pub ask_denom: ::std::string::String,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a MsgSwapSend {
    fn default() -> &'a MsgSwapSend {
        <MsgSwapSend as ::protobuf::Message>::default_instance()
    }
}

impl MsgSwapSend {
    pub fn new() -> MsgSwapSend {
        ::std::default::Default::default()
    }

    // string from_address = 1;


    pub fn get_from_address(&self) -> &str {
        &self.from_address
    }
    pub fn clear_from_address(&mut self) {
        self.from_address.clear();
    }

    // Param is passed by value, moved
    pub fn set_from_address(&mut self, v: ::std::string::String) {
        self.from_address = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_from_address(&mut self) -> &mut ::std::string::String {
        &mut self.from_address
    }

    // Take field
    pub fn take_from_address(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.from_address, ::std::string::String::new())
    }

    // string to_address = 2;


    pub fn get_to_address(&self) -> &str {
        &self.to_address
    }
    pub fn clear_to_address(&mut self) {
        self.to_address.clear();
    }

    // Param is passed by value, moved
    pub fn set_to_address(&mut self, v: ::std::string::String) {
        self.to_address = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_to_address(&mut self) -> &mut ::std::string::String {
        &mut self.to_address
    }

    // Take field
    pub fn take_to_address(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.to_address, ::std::string::String::new())
    }

    // .cosmos.base.v1beta1.Coin offer_coin = 3;


    pub fn get_offer_coin(&self) -> &super::coin::Coin {
        self.offer_coin.as_ref().unwrap_or_else(|| <super::coin::Coin as ::protobuf::Message>::default_instance())
    }
    pub fn clear_offer_coin(&mut self) {
        self.offer_coin.clear();
    }

    pub fn has_offer_coin(&self) -> bool {
        self.offer_coin.is_some()
    }

    // Param is passed by value, moved
    pub fn set_offer_coin(&mut self, v: super::coin::Coin) {
        self.offer_coin = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_offer_coin(&mut self) -> &mut super::coin::Coin {
        if self.offer_coin.is_none() {
            self.offer_coin.set_default();
        }
        self.offer_coin.as_mut().unwrap()
    }

    // Take field
    pub fn take_offer_coin(&mut self) -> super::coin::Coin {
        self.offer_coin.take().unwrap_or_else(|| super::coin::Coin::new())
    }

    // string ask_denom = 4;


    pub fn get_ask_denom(&self) -> &str {
        &self.ask_denom
    }
    pub fn clear_ask_denom(&mut self) {
        self.ask_denom.clear();
    }

    // Param is passed by value, moved
    pub fn set_ask_denom(&mut self, v: ::std::string::String) {
        self.ask_denom = v;
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_ask_denom(&mut self) -> &mut ::std::string::String {
        &mut self.ask_denom
    }

    // Take field
    pub fn take_ask_denom(&mut self) -> ::std::string::String {
        ::std::mem::replace(&mut self.ask_denom, ::std::string::String::new())
    }
}

impl ::protobuf::Message for MsgSwapSend {
    fn is_initialized(&self) -> bool {
        for v in &self.offer_coin {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.from_address)?;
                },
                2 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.to_address)?;
                },
                3 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.offer_coin)?;
                },
                4 => {
                    ::protobuf::rt::read_singular_proto3_string_into(wire_type, is, &mut self.ask_denom)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if !self.from_address.is_empty() {
            my_size += ::protobuf::rt::string_size(1, &self.from_address);
        }
        if !self.to_address.is_empty() {
            my_size += ::protobuf::rt::string_size(2, &self.to_address);
        }
        if let Some(ref v) = self.offer_coin.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if !self.ask_denom.is_empty() {
            my_size += ::protobuf::rt::string_size(4, &self.ask_denom);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if !self.from_address.is_empty() {
            os.write_string(1, &self.from_address)?;
        }
        if !self.to_address.is_empty() {
            os.write_string(2, &self.to_address)?;
        }
        if let Some(ref v) = self.offer_coin.as_ref() {
            os.write_tag(3, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if !self.ask_denom.is_empty() {
            os.write_string(4, &self.ask_denom)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: ::std::boxed::Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> MsgSwapSend {
        MsgSwapSend::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static descriptor: ::protobuf::rt::LazyV2<::protobuf::reflect::MessageDescriptor> = ::protobuf::rt::LazyV2::INIT;
        descriptor.get(|| {
            let mut fields = ::std::vec::Vec::new();
            fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                "from_address",
                |m: &MsgSwapSend| { &m.from_address },
                |m: &mut MsgSwapSend| { &mut m.from_address },
            ));
            fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                "to_address",
                |m: &MsgSwapSend| { &m.to_address },
                |m: &mut MsgSwapSend| { &mut m.to_address },
            ));
            fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::coin::Coin>>(
                "offer_coin",
                |m: &MsgSwapSend| { &m.offer_coin },
                |m: &mut MsgSwapSend| { &mut m.offer_coin },
            ));
            fields.push(::protobuf::reflect::accessor::make_simple_field_accessor::<_, ::protobuf::types::ProtobufTypeString>(
                "ask_denom",
                |m: &MsgSwapSend| { &m.ask_denom },
                |m: &mut MsgSwapSend| { &mut m.ask_denom },
            ));
            ::protobuf::reflect::MessageDescriptor::new_pb_name::<MsgSwapSend>(
                "MsgSwapSend",
                fields,
                file_descriptor_proto()
            )
        })
    }

    fn default_instance() -> &'static MsgSwapSend {
        static instance: ::protobuf::rt::LazyV2<MsgSwapSend> = ::protobuf::rt::LazyV2::INIT;
        instance.get(MsgSwapSend::new)
    }
}

impl ::protobuf::Clear for MsgSwapSend {
    fn clear(&mut self) {
        self.from_address.clear();
        self.to_address.clear();
        self.offer_coin.clear();
        self.ask_denom.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for MsgSwapSend {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for MsgSwapSend {
    fn as_ref(&self) -> ::protobuf::reflect::ReflectValueRef {
        ::protobuf::reflect::ReflectValueRef::Message(self)
    }
}

#[derive(PartialEq,Clone,Default)]
pub struct MsgSwapSendResponse {
    // message fields
    pub swap_coin: ::protobuf::SingularPtrField<super::coin::Coin>,
    pub swap_fee: ::protobuf::SingularPtrField<super::coin::Coin>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::CachedSize,
}

impl<'a> ::std::default::Default for &'a MsgSwapSendResponse {
    fn default() -> &'a MsgSwapSendResponse {
        <MsgSwapSendResponse as ::protobuf::Message>::default_instance()
    }
}

impl MsgSwapSendResponse {
    pub fn new() -> MsgSwapSendResponse {
        ::std::default::Default::default()
    }

    // .cosmos.base.v1beta1.Coin swap_coin = 1;


    pub fn get_swap_coin(&self) -> &super::coin::Coin {
        self.swap_coin.as_ref().unwrap_or_else(|| <super::coin::Coin as ::protobuf::Message>::default_instance())
    }
    pub fn clear_swap_coin(&mut self) {
        self.swap_coin.clear();
    }

    pub fn has_swap_coin(&self) -> bool {
        self.swap_coin.is_some()
    }

    // Param is passed by value, moved
    pub fn set_swap_coin(&mut self, v: super::coin::Coin) {
        self.swap_coin = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_swap_coin(&mut self) -> &mut super::coin::Coin {
        if self.swap_coin.is_none() {
            self.swap_coin.set_default();
        }
        self.swap_coin.as_mut().unwrap()
    }

    // Take field
    pub fn take_swap_coin(&mut self) -> super::coin::Coin {
        self.swap_coin.take().unwrap_or_else(|| super::coin::Coin::new())
    }

    // .cosmos.base.v1beta1.Coin swap_fee = 2;


    pub fn get_swap_fee(&self) -> &super::coin::Coin {
        self.swap_fee.as_ref().unwrap_or_else(|| <super::coin::Coin as ::protobuf::Message>::default_instance())
    }
    pub fn clear_swap_fee(&mut self) {
        self.swap_fee.clear();
    }

    pub fn has_swap_fee(&self) -> bool {
        self.swap_fee.is_some()
    }

    // Param is passed by value, moved
    pub fn set_swap_fee(&mut self, v: super::coin::Coin) {
        self.swap_fee = ::protobuf::SingularPtrField::some(v);
    }

    // Mutable pointer to the field.
    // If field is not initialized, it is initialized with default value first.
    pub fn mut_swap_fee(&mut self) -> &mut super::coin::Coin {
        if self.swap_fee.is_none() {
            self.swap_fee.set_default();
        }
        self.swap_fee.as_mut().unwrap()
    }

    // Take field
    pub fn take_swap_fee(&mut self) -> super::coin::Coin {
        self.swap_fee.take().unwrap_or_else(|| super::coin::Coin::new())
    }
}

impl ::protobuf::Message for MsgSwapSendResponse {
    fn is_initialized(&self) -> bool {
        for v in &self.swap_coin {
            if !v.is_initialized() {
                return false;
            }
        };
        for v in &self.swap_fee {
            if !v.is_initialized() {
                return false;
            }
        };
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.swap_coin)?;
                },
                2 => {
                    ::protobuf::rt::read_singular_message_into(wire_type, is, &mut self.swap_fee)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if let Some(ref v) = self.swap_coin.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        if let Some(ref v) = self.swap_fee.as_ref() {
            let len = v.compute_size();
            my_size += 1 + ::protobuf::rt::compute_raw_varint32_size(len) + len;
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if let Some(ref v) = self.swap_coin.as_ref() {
            os.write_tag(1, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        if let Some(ref v) = self.swap_fee.as_ref() {
            os.write_tag(2, ::protobuf::wire_format::WireTypeLengthDelimited)?;
            os.write_raw_varint32(v.get_cached_size())?;
            v.write_to_with_cached_sizes(os)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn as_any(&self) -> &dyn (::std::any::Any) {
        self as &dyn (::std::any::Any)
    }
    fn as_any_mut(&mut self) -> &mut dyn (::std::any::Any) {
        self as &mut dyn (::std::any::Any)
    }
    fn into_any(self: ::std::boxed::Box<Self>) -> ::std::boxed::Box<dyn (::std::any::Any)> {
        self
    }

    fn descriptor(&self) -> &'static ::protobuf::reflect::MessageDescriptor {
        Self::descriptor_static()
    }

    fn new() -> MsgSwapSendResponse {
        MsgSwapSendResponse::new()
    }

    fn descriptor_static() -> &'static ::protobuf::reflect::MessageDescriptor {
        static descriptor: ::protobuf::rt::LazyV2<::protobuf::reflect::MessageDescriptor> = ::protobuf::rt::LazyV2::INIT;
        descriptor.get(|| {
            let mut fields = ::std::vec::Vec::new();
            fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::coin::Coin>>(
                "swap_coin",
                |m: &MsgSwapSendResponse| { &m.swap_coin },
                |m: &mut MsgSwapSendResponse| { &mut m.swap_coin },
            ));
            fields.push(::protobuf::reflect::accessor::make_singular_ptr_field_accessor::<_, ::protobuf::types::ProtobufTypeMessage<super::coin::Coin>>(
                "swap_fee",
                |m: &MsgSwapSendResponse| { &m.swap_fee },
                |m: &mut MsgSwapSendResponse| { &mut m.swap_fee },
            ));
            ::protobuf::reflect::MessageDescriptor::new_pb_name::<MsgSwapSendResponse>(
                "MsgSwapSendResponse",
                fields,
                file_descriptor_proto()
            )
        })
    }

    fn default_instance() -> &'static MsgSwapSendResponse {
        static instance: ::protobuf::rt::LazyV2<MsgSwapSendResponse> = ::protobuf::rt::LazyV2::INIT;
        instance.get(MsgSwapSendResponse::new)
    }
}

impl ::protobuf::Clear for MsgSwapSendResponse {
    fn clear(&mut self) {
        self.swap_coin.clear();
        self.swap_fee.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for MsgSwapSendResponse {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for MsgSwapSendResponse {
    fn as_ref(&self) -> ::protobuf::reflect::ReflectValueRef {
        ::protobuf::reflect::ReflectValueRef::Message(self)
    }
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\x1dterra/market/v1beta1/tx.proto\x12\x14terra.market.v1beta1\x1a\x14g\
    ogoproto/gogo.proto\x1a\x1ecosmos/base/v1beta1/coin.proto\"\xc6\x01\n\
    \x07MsgSwap\x12)\n\x06trader\x18\x01\x20\x01(\tR\x06traderB\x11\xf2\xde\
    \x1f\ryaml:\"trader\"\x12S\n\noffer_coin\x18\x02\x20\x01(\x0b2\x19.cosmo\
    s.base.v1beta1.CoinR\tofferCoinB\x19\xf2\xde\x1f\x11yaml:\"offer_coin\"\
    \xc8\xde\x1f\0\x121\n\task_denom\x18\x03\x20\x01(\tR\x08askDenomB\x14\
    \xf2\xde\x1f\x10yaml:\"ask_denom\":\x08\x88\xa0\x1f\0\xe8\xa0\x1f\0\"\
    \xb2\x01\n\x0fMsgSwapResponse\x12P\n\tswap_coin\x18\x01\x20\x01(\x0b2\
    \x19.cosmos.base.v1beta1.CoinR\x08swapCoinB\x18\xf2\xde\x1f\x10yaml:\"sw\
    ap_coin\"\xc8\xde\x1f\0\x12M\n\x08swap_fee\x18\x02\x20\x01(\x0b2\x19.cos\
    mos.base.v1beta1.CoinR\x07swapFeeB\x17\xf2\xde\x1f\x0fyaml:\"swap_fee\"\
    \xc8\xde\x1f\0\"\x91\x02\n\x0bMsgSwapSend\x12:\n\x0cfrom_address\x18\x01\
    \x20\x01(\tR\x0bfromAddressB\x17\xf2\xde\x1f\x13yaml:\"from_address\"\
    \x124\n\nto_address\x18\x02\x20\x01(\tR\ttoAddressB\x15\xf2\xde\x1f\x11y\
    aml:\"to_address\"\x12S\n\noffer_coin\x18\x03\x20\x01(\x0b2\x19.cosmos.b\
    ase.v1beta1.CoinR\tofferCoinB\x19\xf2\xde\x1f\x11yaml:\"offer_coin\"\xc8\
    \xde\x1f\0\x121\n\task_denom\x18\x04\x20\x01(\tR\x08askDenomB\x14\xf2\
    \xde\x1f\x10yaml:\"ask_denom\":\x08\x88\xa0\x1f\0\xe8\xa0\x1f\0\"\xb6\
    \x01\n\x13MsgSwapSendResponse\x12P\n\tswap_coin\x18\x01\x20\x01(\x0b2\
    \x19.cosmos.base.v1beta1.CoinR\x08swapCoinB\x18\xf2\xde\x1f\x10yaml:\"sw\
    ap_coin\"\xc8\xde\x1f\0\x12M\n\x08swap_fee\x18\x02\x20\x01(\x0b2\x19.cos\
    mos.base.v1beta1.CoinR\x07swapFeeB\x17\xf2\xde\x1f\x0fyaml:\"swap_fee\"\
    \xc8\xde\x1f\02\xad\x01\n\x03Msg\x12L\n\x04Swap\x12\x1d.terra.market.v1b\
    eta1.MsgSwap\x1a%.terra.market.v1beta1.MsgSwapResponse\x12X\n\x08SwapSen\
    d\x12!.terra.market.v1beta1.MsgSwapSend\x1a).terra.market.v1beta1.MsgSwa\
    pSendResponseB,Z*github.com/terra-money/core/x/market/typesb\x06proto3\
";

static file_descriptor_proto_lazy: ::protobuf::rt::LazyV2<::protobuf::descriptor::FileDescriptorProto> = ::protobuf::rt::LazyV2::INIT;

fn parse_descriptor_proto() -> ::protobuf::descriptor::FileDescriptorProto {
    ::protobuf::Message::parse_from_bytes(file_descriptor_proto_data).unwrap()
}

pub fn file_descriptor_proto() -> &'static ::protobuf::descriptor::FileDescriptorProto {
    file_descriptor_proto_lazy.get(|| {
        parse_descriptor_proto()
    })
}
