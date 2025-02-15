// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabStageActiveChallengeIndexNotify.proto

package emu.grasscutter.net.proto;

public final class ChannelerSlabStageActiveChallengeIndexNotifyOuterClass {
  private ChannelerSlabStageActiveChallengeIndexNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabStageActiveChallengeIndexNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabStageActiveChallengeIndexNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 challenge_index = 7;</code>
     * @return The challengeIndex.
     */
    int getChallengeIndex();

    /**
     * <code>uint32 active_camp_index = 4;</code>
     * @return The activeCampIndex.
     */
    int getActiveCampIndex();
  }
  /**
   * <pre>
   * CmdId: 8068
   * Obf: EJPMHEMFJON
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabStageActiveChallengeIndexNotify}
   */
  public static final class ChannelerSlabStageActiveChallengeIndexNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabStageActiveChallengeIndexNotify)
      ChannelerSlabStageActiveChallengeIndexNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabStageActiveChallengeIndexNotify.newBuilder() to construct.
    private ChannelerSlabStageActiveChallengeIndexNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabStageActiveChallengeIndexNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabStageActiveChallengeIndexNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabStageActiveChallengeIndexNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              stageId_ = input.readUInt32();
              break;
            }
            case 32: {

              activeCampIndex_ = input.readUInt32();
              break;
            }
            case 56: {

              challengeIndex_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.internal_static_ChannelerSlabStageActiveChallengeIndexNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.internal_static_ChannelerSlabStageActiveChallengeIndexNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.class, emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int CHALLENGE_INDEX_FIELD_NUMBER = 7;
    private int challengeIndex_;
    /**
     * <code>uint32 challenge_index = 7;</code>
     * @return The challengeIndex.
     */
    @java.lang.Override
    public int getChallengeIndex() {
      return challengeIndex_;
    }

    public static final int ACTIVE_CAMP_INDEX_FIELD_NUMBER = 4;
    private int activeCampIndex_;
    /**
     * <code>uint32 active_camp_index = 4;</code>
     * @return The activeCampIndex.
     */
    @java.lang.Override
    public int getActiveCampIndex() {
      return activeCampIndex_;
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
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (activeCampIndex_ != 0) {
        output.writeUInt32(4, activeCampIndex_);
      }
      if (challengeIndex_ != 0) {
        output.writeUInt32(7, challengeIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      if (activeCampIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, activeCampIndex_);
      }
      if (challengeIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify other = (emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getChallengeIndex()
          != other.getChallengeIndex()) return false;
      if (getActiveCampIndex()
          != other.getActiveCampIndex()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + CHALLENGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeIndex();
      hash = (37 * hash) + ACTIVE_CAMP_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getActiveCampIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify prototype) {
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
     * CmdId: 8068
     * Obf: EJPMHEMFJON
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabStageActiveChallengeIndexNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabStageActiveChallengeIndexNotify)
        emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.internal_static_ChannelerSlabStageActiveChallengeIndexNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.internal_static_ChannelerSlabStageActiveChallengeIndexNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.class, emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stageId_ = 0;

        challengeIndex_ = 0;

        activeCampIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.internal_static_ChannelerSlabStageActiveChallengeIndexNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify build() {
        emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify buildPartial() {
        emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify result = new emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify(this);
        result.stageId_ = stageId_;
        result.challengeIndex_ = challengeIndex_;
        result.activeCampIndex_ = activeCampIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify other) {
        if (other == emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getChallengeIndex() != 0) {
          setChallengeIndex(other.getChallengeIndex());
        }
        if (other.getActiveCampIndex() != 0) {
          setActiveCampIndex(other.getActiveCampIndex());
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
        emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int challengeIndex_ ;
      /**
       * <code>uint32 challenge_index = 7;</code>
       * @return The challengeIndex.
       */
      @java.lang.Override
      public int getChallengeIndex() {
        return challengeIndex_;
      }
      /**
       * <code>uint32 challenge_index = 7;</code>
       * @param value The challengeIndex to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeIndex(int value) {
        
        challengeIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeIndex() {
        
        challengeIndex_ = 0;
        onChanged();
        return this;
      }

      private int activeCampIndex_ ;
      /**
       * <code>uint32 active_camp_index = 4;</code>
       * @return The activeCampIndex.
       */
      @java.lang.Override
      public int getActiveCampIndex() {
        return activeCampIndex_;
      }
      /**
       * <code>uint32 active_camp_index = 4;</code>
       * @param value The activeCampIndex to set.
       * @return This builder for chaining.
       */
      public Builder setActiveCampIndex(int value) {
        
        activeCampIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 active_camp_index = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearActiveCampIndex() {
        
        activeCampIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabStageActiveChallengeIndexNotify)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabStageActiveChallengeIndexNotify)
    private static final emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify();
    }

    public static emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabStageActiveChallengeIndexNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabStageActiveChallengeIndexNotify>() {
      @java.lang.Override
      public ChannelerSlabStageActiveChallengeIndexNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabStageActiveChallengeIndexNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabStageActiveChallengeIndexNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabStageActiveChallengeIndexNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannelerSlabStageActiveChallengeIndexNotifyOuterClass.ChannelerSlabStageActiveChallengeIndexNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabStageActiveChallengeIndexNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabStageActiveChallengeIndexNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2ChannelerSlabStageActiveChallengeIndex" +
      "Notify.proto\"t\n,ChannelerSlabStageActive" +
      "ChallengeIndexNotify\022\020\n\010stage_id\030\003 \001(\r\022\027" +
      "\n\017challenge_index\030\007 \001(\r\022\031\n\021active_camp_i" +
      "ndex\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabStageActiveChallengeIndexNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabStageActiveChallengeIndexNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabStageActiveChallengeIndexNotify_descriptor,
        new java.lang.String[] { "StageId", "ChallengeIndex", "ActiveCampIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
