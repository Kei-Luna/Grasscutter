// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingFirstStageInfo.proto

package emu.grasscutter.net.proto;

public final class VintageHuntingFirstStageInfoOuterClass {
  private VintageHuntingFirstStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingFirstStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingFirstStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IIFPOPNBHKN = 4;</code>
     * @return The iIFPOPNBHKN.
     */
    int getIIFPOPNBHKN();

    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 JHDHJDPNNOK = 11;</code>
     * @return The jHDHJDPNNOK.
     */
    int getJHDHJDPNNOK();

    /**
     * <code>uint32 GBDOOANMBGO = 13;</code>
     * @return The gBDOOANMBGO.
     */
    int getGBDOOANMBGO();
  }
  /**
   * <pre>
   * Obf: KJEODHHMHDG
   * </pre>
   *
   * Protobuf type {@code VintageHuntingFirstStageInfo}
   */
  public static final class VintageHuntingFirstStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingFirstStageInfo)
      VintageHuntingFirstStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingFirstStageInfo.newBuilder() to construct.
    private VintageHuntingFirstStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingFirstStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingFirstStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageHuntingFirstStageInfo(
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
            case 32: {

              iIFPOPNBHKN_ = input.readUInt32();
              break;
            }
            case 88: {

              jHDHJDPNNOK_ = input.readUInt32();
              break;
            }
            case 104: {

              gBDOOANMBGO_ = input.readUInt32();
              break;
            }
            case 120: {

              score_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.class, emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.Builder.class);
    }

    public static final int IIFPOPNBHKN_FIELD_NUMBER = 4;
    private int iIFPOPNBHKN_;
    /**
     * <code>uint32 IIFPOPNBHKN = 4;</code>
     * @return The iIFPOPNBHKN.
     */
    @java.lang.Override
    public int getIIFPOPNBHKN() {
      return iIFPOPNBHKN_;
    }

    public static final int SCORE_FIELD_NUMBER = 15;
    private int score_;
    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int JHDHJDPNNOK_FIELD_NUMBER = 11;
    private int jHDHJDPNNOK_;
    /**
     * <code>uint32 JHDHJDPNNOK = 11;</code>
     * @return The jHDHJDPNNOK.
     */
    @java.lang.Override
    public int getJHDHJDPNNOK() {
      return jHDHJDPNNOK_;
    }

    public static final int GBDOOANMBGO_FIELD_NUMBER = 13;
    private int gBDOOANMBGO_;
    /**
     * <code>uint32 GBDOOANMBGO = 13;</code>
     * @return The gBDOOANMBGO.
     */
    @java.lang.Override
    public int getGBDOOANMBGO() {
      return gBDOOANMBGO_;
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
      if (iIFPOPNBHKN_ != 0) {
        output.writeUInt32(4, iIFPOPNBHKN_);
      }
      if (jHDHJDPNNOK_ != 0) {
        output.writeUInt32(11, jHDHJDPNNOK_);
      }
      if (gBDOOANMBGO_ != 0) {
        output.writeUInt32(13, gBDOOANMBGO_);
      }
      if (score_ != 0) {
        output.writeUInt32(15, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iIFPOPNBHKN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, iIFPOPNBHKN_);
      }
      if (jHDHJDPNNOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, jHDHJDPNNOK_);
      }
      if (gBDOOANMBGO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, gBDOOANMBGO_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, score_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo other = (emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo) obj;

      if (getIIFPOPNBHKN()
          != other.getIIFPOPNBHKN()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getJHDHJDPNNOK()
          != other.getJHDHJDPNNOK()) return false;
      if (getGBDOOANMBGO()
          != other.getGBDOOANMBGO()) return false;
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
      hash = (37 * hash) + IIFPOPNBHKN_FIELD_NUMBER;
      hash = (53 * hash) + getIIFPOPNBHKN();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + JHDHJDPNNOK_FIELD_NUMBER;
      hash = (53 * hash) + getJHDHJDPNNOK();
      hash = (37 * hash) + GBDOOANMBGO_FIELD_NUMBER;
      hash = (53 * hash) + getGBDOOANMBGO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo prototype) {
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
     * Obf: KJEODHHMHDG
     * </pre>
     *
     * Protobuf type {@code VintageHuntingFirstStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingFirstStageInfo)
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.class, emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.newBuilder()
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
        iIFPOPNBHKN_ = 0;

        score_ = 0;

        jHDHJDPNNOK_ = 0;

        gBDOOANMBGO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo build() {
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo buildPartial() {
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo result = new emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo(this);
        result.iIFPOPNBHKN_ = iIFPOPNBHKN_;
        result.score_ = score_;
        result.jHDHJDPNNOK_ = jHDHJDPNNOK_;
        result.gBDOOANMBGO_ = gBDOOANMBGO_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo other) {
        if (other == emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.getDefaultInstance()) return this;
        if (other.getIIFPOPNBHKN() != 0) {
          setIIFPOPNBHKN(other.getIIFPOPNBHKN());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getJHDHJDPNNOK() != 0) {
          setJHDHJDPNNOK(other.getJHDHJDPNNOK());
        }
        if (other.getGBDOOANMBGO() != 0) {
          setGBDOOANMBGO(other.getGBDOOANMBGO());
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
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iIFPOPNBHKN_ ;
      /**
       * <code>uint32 IIFPOPNBHKN = 4;</code>
       * @return The iIFPOPNBHKN.
       */
      @java.lang.Override
      public int getIIFPOPNBHKN() {
        return iIFPOPNBHKN_;
      }
      /**
       * <code>uint32 IIFPOPNBHKN = 4;</code>
       * @param value The iIFPOPNBHKN to set.
       * @return This builder for chaining.
       */
      public Builder setIIFPOPNBHKN(int value) {
        
        iIFPOPNBHKN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IIFPOPNBHKN = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIIFPOPNBHKN() {
        
        iIFPOPNBHKN_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 15;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int jHDHJDPNNOK_ ;
      /**
       * <code>uint32 JHDHJDPNNOK = 11;</code>
       * @return The jHDHJDPNNOK.
       */
      @java.lang.Override
      public int getJHDHJDPNNOK() {
        return jHDHJDPNNOK_;
      }
      /**
       * <code>uint32 JHDHJDPNNOK = 11;</code>
       * @param value The jHDHJDPNNOK to set.
       * @return This builder for chaining.
       */
      public Builder setJHDHJDPNNOK(int value) {
        
        jHDHJDPNNOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JHDHJDPNNOK = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearJHDHJDPNNOK() {
        
        jHDHJDPNNOK_ = 0;
        onChanged();
        return this;
      }

      private int gBDOOANMBGO_ ;
      /**
       * <code>uint32 GBDOOANMBGO = 13;</code>
       * @return The gBDOOANMBGO.
       */
      @java.lang.Override
      public int getGBDOOANMBGO() {
        return gBDOOANMBGO_;
      }
      /**
       * <code>uint32 GBDOOANMBGO = 13;</code>
       * @param value The gBDOOANMBGO to set.
       * @return This builder for chaining.
       */
      public Builder setGBDOOANMBGO(int value) {
        
        gBDOOANMBGO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GBDOOANMBGO = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGBDOOANMBGO() {
        
        gBDOOANMBGO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageHuntingFirstStageInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingFirstStageInfo)
    private static final emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo();
    }

    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingFirstStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingFirstStageInfo>() {
      @java.lang.Override
      public VintageHuntingFirstStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageHuntingFirstStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageHuntingFirstStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingFirstStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingFirstStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"VintageHuntingFirstStageInfo.proto\"l\n\034" +
      "VintageHuntingFirstStageInfo\022\023\n\013IIFPOPNB" +
      "HKN\030\004 \001(\r\022\r\n\005score\030\017 \001(\r\022\023\n\013JHDHJDPNNOK\030" +
      "\013 \001(\r\022\023\n\013GBDOOANMBGO\030\r \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingFirstStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingFirstStageInfo_descriptor,
        new java.lang.String[] { "IIFPOPNBHKN", "Score", "JHDHJDPNNOK", "GBDOOANMBGO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
