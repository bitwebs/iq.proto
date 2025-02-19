#!/bin/bash
set -o errexit -o nounset -o pipefail
command -v shellcheck >/dev/null && shellcheck "$0"

OUT_DIR="./src"

# Path to this plugin, Note this must be an abolsute path on Windows (see #15)
PROTOC_GEN_TS_PROTO_PATH="./node_modules/.bin/protoc-gen-ts_proto"

mkdir -p "$OUT_DIR"

echo "Processing iqd proto files ..."
IQD_DIR="../iqd/proto"
IQD_THIRD_PARTY_DIR="../iqd/third_party/proto"

protoc \
  --plugin="protoc-gen-ts_proto=${PROTOC_GEN_TS_PROTO_PATH}" \
  --ts_proto_out="${OUT_DIR}" \
  --ts_proto_opt="esModuleInterop=true,forceLong=long,useOptionals=true,outputClientImpl=grpc-web" \
  --proto_path="$IQD_DIR" \
  --proto_path="$IQD_THIRD_PARTY_DIR" \
  $(find ${IQD_DIR} ${IQD_THIRD_PARTY_DIR} -path -prune -o -name '*.proto' -print0 | xargs -0)
