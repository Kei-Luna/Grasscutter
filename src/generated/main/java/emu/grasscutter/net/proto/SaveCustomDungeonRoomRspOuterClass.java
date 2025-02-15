// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SaveCustomDungeonRoomRsp.proto

package emu.grasscutter.net.proto;

public final class SaveCustomDungeonRoomRspOuterClass {
  private SaveCustomDungeonRoomRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SaveCustomDungeonRoomRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SaveCustomDungeonRoomRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock> 
        getErrorBlockListList();
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock getErrorBlockList(int index);
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    int getErrorBlockListCount();
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder> 
        getErrorBlockListOrBuilderList();
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder getErrorBlockListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 room_id = 7;</code>
     * @return The roomId.
     */
    int getRoomId();
  }
  /**
   * <pre>
   * CmdId: 6221
   * Obf: EBIIFMEFIBM
   * </pre>
   *
   * Protobuf type {@code SaveCustomDungeonRoomRsp}
   */
  public static final class SaveCustomDungeonRoomRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SaveCustomDungeonRoomRsp)
      SaveCustomDungeonRoomRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SaveCustomDungeonRoomRsp.newBuilder() to construct.
    private SaveCustomDungeonRoomRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SaveCustomDungeonRoomRsp() {
      errorBlockList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SaveCustomDungeonRoomRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SaveCustomDungeonRoomRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                errorBlockList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock>();
                mutable_bitField0_ |= 0x00000001;
              }
              errorBlockList_.add(
                  input.readMessage(emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.parser(), extensionRegistry));
              break;
            }
            case 56: {

              roomId_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          errorBlockList_ = java.util.Collections.unmodifiableList(errorBlockList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.internal_static_SaveCustomDungeonRoomRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.internal_static_SaveCustomDungeonRoomRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.class, emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.Builder.class);
    }

    public static final int ERROR_BLOCK_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock> errorBlockList_;
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock> getErrorBlockListList() {
      return errorBlockList_;
    }
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder> 
        getErrorBlockListOrBuilderList() {
      return errorBlockList_;
    }
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    @java.lang.Override
    public int getErrorBlockListCount() {
      return errorBlockList_.size();
    }
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock getErrorBlockList(int index) {
      return errorBlockList_.get(index);
    }
    /**
     * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder getErrorBlockListOrBuilder(
        int index) {
      return errorBlockList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 7;
    private int roomId_;
    /**
     * <code>uint32 room_id = 7;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < errorBlockList_.size(); i++) {
        output.writeMessage(2, errorBlockList_.get(i));
      }
      if (roomId_ != 0) {
        output.writeUInt32(7, roomId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < errorBlockList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, errorBlockList_.get(i));
      }
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, roomId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp other = (emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp) obj;

      if (!getErrorBlockListList()
          .equals(other.getErrorBlockListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getRoomId()
          != other.getRoomId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getErrorBlockListCount() > 0) {
        hash = (37 * hash) + ERROR_BLOCK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getErrorBlockListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 6221
     * Obf: EBIIFMEFIBM
     * </pre>
     *
     * Protobuf type {@code SaveCustomDungeonRoomRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SaveCustomDungeonRoomRsp)
        emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.internal_static_SaveCustomDungeonRoomRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.internal_static_SaveCustomDungeonRoomRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.class, emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getErrorBlockListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (errorBlockListBuilder_ == null) {
          errorBlockList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          errorBlockListBuilder_.clear();
        }
        retcode_ = 0;

        roomId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.internal_static_SaveCustomDungeonRoomRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp build() {
        emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp buildPartial() {
        emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp result = new emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp(this);
        int from_bitField0_ = bitField0_;
        if (errorBlockListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            errorBlockList_ = java.util.Collections.unmodifiableList(errorBlockList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.errorBlockList_ = errorBlockList_;
        } else {
          result.errorBlockList_ = errorBlockListBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.roomId_ = roomId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp other) {
        if (other == emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp.getDefaultInstance()) return this;
        if (errorBlockListBuilder_ == null) {
          if (!other.errorBlockList_.isEmpty()) {
            if (errorBlockList_.isEmpty()) {
              errorBlockList_ = other.errorBlockList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureErrorBlockListIsMutable();
              errorBlockList_.addAll(other.errorBlockList_);
            }
            onChanged();
          }
        } else {
          if (!other.errorBlockList_.isEmpty()) {
            if (errorBlockListBuilder_.isEmpty()) {
              errorBlockListBuilder_.dispose();
              errorBlockListBuilder_ = null;
              errorBlockList_ = other.errorBlockList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              errorBlockListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getErrorBlockListFieldBuilder() : null;
            } else {
              errorBlockListBuilder_.addAllMessages(other.errorBlockList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock> errorBlockList_ =
        java.util.Collections.emptyList();
      private void ensureErrorBlockListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          errorBlockList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock>(errorBlockList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder> errorBlockListBuilder_;

      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock> getErrorBlockListList() {
        if (errorBlockListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(errorBlockList_);
        } else {
          return errorBlockListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public int getErrorBlockListCount() {
        if (errorBlockListBuilder_ == null) {
          return errorBlockList_.size();
        } else {
          return errorBlockListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock getErrorBlockList(int index) {
        if (errorBlockListBuilder_ == null) {
          return errorBlockList_.get(index);
        } else {
          return errorBlockListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder setErrorBlockList(
          int index, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock value) {
        if (errorBlockListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureErrorBlockListIsMutable();
          errorBlockList_.set(index, value);
          onChanged();
        } else {
          errorBlockListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder setErrorBlockList(
          int index, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder builderForValue) {
        if (errorBlockListBuilder_ == null) {
          ensureErrorBlockListIsMutable();
          errorBlockList_.set(index, builderForValue.build());
          onChanged();
        } else {
          errorBlockListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder addErrorBlockList(emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock value) {
        if (errorBlockListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureErrorBlockListIsMutable();
          errorBlockList_.add(value);
          onChanged();
        } else {
          errorBlockListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder addErrorBlockList(
          int index, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock value) {
        if (errorBlockListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureErrorBlockListIsMutable();
          errorBlockList_.add(index, value);
          onChanged();
        } else {
          errorBlockListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder addErrorBlockList(
          emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder builderForValue) {
        if (errorBlockListBuilder_ == null) {
          ensureErrorBlockListIsMutable();
          errorBlockList_.add(builderForValue.build());
          onChanged();
        } else {
          errorBlockListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder addErrorBlockList(
          int index, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder builderForValue) {
        if (errorBlockListBuilder_ == null) {
          ensureErrorBlockListIsMutable();
          errorBlockList_.add(index, builderForValue.build());
          onChanged();
        } else {
          errorBlockListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder addAllErrorBlockList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock> values) {
        if (errorBlockListBuilder_ == null) {
          ensureErrorBlockListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, errorBlockList_);
          onChanged();
        } else {
          errorBlockListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder clearErrorBlockList() {
        if (errorBlockListBuilder_ == null) {
          errorBlockList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          errorBlockListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public Builder removeErrorBlockList(int index) {
        if (errorBlockListBuilder_ == null) {
          ensureErrorBlockListIsMutable();
          errorBlockList_.remove(index);
          onChanged();
        } else {
          errorBlockListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder getErrorBlockListBuilder(
          int index) {
        return getErrorBlockListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder getErrorBlockListOrBuilder(
          int index) {
        if (errorBlockListBuilder_ == null) {
          return errorBlockList_.get(index);  } else {
          return errorBlockListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder> 
           getErrorBlockListOrBuilderList() {
        if (errorBlockListBuilder_ != null) {
          return errorBlockListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(errorBlockList_);
        }
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder addErrorBlockListBuilder() {
        return getErrorBlockListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.getDefaultInstance());
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder addErrorBlockListBuilder(
          int index) {
        return getErrorBlockListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.getDefaultInstance());
      }
      /**
       * <code>repeated .CustomDungeonBlock error_block_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder> 
           getErrorBlockListBuilderList() {
        return getErrorBlockListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder> 
          getErrorBlockListFieldBuilder() {
        if (errorBlockListBuilder_ == null) {
          errorBlockListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder, emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder>(
                  errorBlockList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          errorBlockList_ = null;
        }
        return errorBlockListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 7;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 7;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SaveCustomDungeonRoomRsp)
    }

    // @@protoc_insertion_point(class_scope:SaveCustomDungeonRoomRsp)
    private static final emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp();
    }

    public static emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SaveCustomDungeonRoomRsp>
        PARSER = new com.google.protobuf.AbstractParser<SaveCustomDungeonRoomRsp>() {
      @java.lang.Override
      public SaveCustomDungeonRoomRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SaveCustomDungeonRoomRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SaveCustomDungeonRoomRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SaveCustomDungeonRoomRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SaveCustomDungeonRoomRspOuterClass.SaveCustomDungeonRoomRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCustomDungeonRoomRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCustomDungeonRoomRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SaveCustomDungeonRoomRsp.proto\032\030Custom" +
      "DungeonBlock.proto\"k\n\030SaveCustomDungeonR" +
      "oomRsp\022-\n\020error_block_list\030\002 \003(\0132\023.Custo" +
      "mDungeonBlock\022\017\n\007retcode\030\t \001(\005\022\017\n\007room_i" +
      "d\030\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.getDescriptor(),
        });
    internal_static_SaveCustomDungeonRoomRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SaveCustomDungeonRoomRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCustomDungeonRoomRsp_descriptor,
        new java.lang.String[] { "ErrorBlockList", "Retcode", "RoomId", });
    emu.grasscutter.net.proto.CustomDungeonBlockOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
