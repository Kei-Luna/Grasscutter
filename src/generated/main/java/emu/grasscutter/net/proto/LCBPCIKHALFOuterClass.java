// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LCBPCIKHALF.proto

package emu.grasscutter.net.proto;

public final class LCBPCIKHALFOuterClass {
  private LCBPCIKHALFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LCBPCIKHALFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LCBPCIKHALF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string JOPGAMLCDBK = 12;</code>
     * @return The jOPGAMLCDBK.
     */
    java.lang.String getJOPGAMLCDBK();
    /**
     * <code>string JOPGAMLCDBK = 12;</code>
     * @return The bytes for jOPGAMLCDBK.
     */
    com.google.protobuf.ByteString
        getJOPGAMLCDBKBytes();

    /**
     * <code>uint64 JDBHLHCMJGD = 14;</code>
     * @return The jDBHLHCMJGD.
     */
    long getJDBHLHCMJGD();

    /**
     * <code>string json_str = 4;</code>
     * @return The jsonStr.
     */
    java.lang.String getJsonStr();
    /**
     * <code>string json_str = 4;</code>
     * @return The bytes for jsonStr.
     */
    com.google.protobuf.ByteString
        getJsonStrBytes();
  }
  /**
   * <pre>
   * CmdId: 9114
   * </pre>
   *
   * Protobuf type {@code LCBPCIKHALF}
   */
  public static final class LCBPCIKHALF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LCBPCIKHALF)
      LCBPCIKHALFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LCBPCIKHALF.newBuilder() to construct.
    private LCBPCIKHALF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LCBPCIKHALF() {
      jOPGAMLCDBK_ = "";
      jsonStr_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LCBPCIKHALF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LCBPCIKHALF(
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
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              jsonStr_ = s;
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              jOPGAMLCDBK_ = s;
              break;
            }
            case 112: {

              jDBHLHCMJGD_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.internal_static_LCBPCIKHALF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.internal_static_LCBPCIKHALF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.class, emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.Builder.class);
    }

    public static final int JOPGAMLCDBK_FIELD_NUMBER = 12;
    private volatile java.lang.Object jOPGAMLCDBK_;
    /**
     * <code>string JOPGAMLCDBK = 12;</code>
     * @return The jOPGAMLCDBK.
     */
    @java.lang.Override
    public java.lang.String getJOPGAMLCDBK() {
      java.lang.Object ref = jOPGAMLCDBK_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jOPGAMLCDBK_ = s;
        return s;
      }
    }
    /**
     * <code>string JOPGAMLCDBK = 12;</code>
     * @return The bytes for jOPGAMLCDBK.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJOPGAMLCDBKBytes() {
      java.lang.Object ref = jOPGAMLCDBK_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jOPGAMLCDBK_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int JDBHLHCMJGD_FIELD_NUMBER = 14;
    private long jDBHLHCMJGD_;
    /**
     * <code>uint64 JDBHLHCMJGD = 14;</code>
     * @return The jDBHLHCMJGD.
     */
    @java.lang.Override
    public long getJDBHLHCMJGD() {
      return jDBHLHCMJGD_;
    }

    public static final int JSON_STR_FIELD_NUMBER = 4;
    private volatile java.lang.Object jsonStr_;
    /**
     * <code>string json_str = 4;</code>
     * @return The jsonStr.
     */
    @java.lang.Override
    public java.lang.String getJsonStr() {
      java.lang.Object ref = jsonStr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jsonStr_ = s;
        return s;
      }
    }
    /**
     * <code>string json_str = 4;</code>
     * @return The bytes for jsonStr.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJsonStrBytes() {
      java.lang.Object ref = jsonStr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jsonStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonStr_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, jsonStr_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jOPGAMLCDBK_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, jOPGAMLCDBK_);
      }
      if (jDBHLHCMJGD_ != 0L) {
        output.writeUInt64(14, jDBHLHCMJGD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jsonStr_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, jsonStr_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jOPGAMLCDBK_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, jOPGAMLCDBK_);
      }
      if (jDBHLHCMJGD_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, jDBHLHCMJGD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF other = (emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF) obj;

      if (!getJOPGAMLCDBK()
          .equals(other.getJOPGAMLCDBK())) return false;
      if (getJDBHLHCMJGD()
          != other.getJDBHLHCMJGD()) return false;
      if (!getJsonStr()
          .equals(other.getJsonStr())) return false;
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
      hash = (37 * hash) + JOPGAMLCDBK_FIELD_NUMBER;
      hash = (53 * hash) + getJOPGAMLCDBK().hashCode();
      hash = (37 * hash) + JDBHLHCMJGD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getJDBHLHCMJGD());
      hash = (37 * hash) + JSON_STR_FIELD_NUMBER;
      hash = (53 * hash) + getJsonStr().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF prototype) {
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
     * CmdId: 9114
     * </pre>
     *
     * Protobuf type {@code LCBPCIKHALF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LCBPCIKHALF)
        emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.internal_static_LCBPCIKHALF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.internal_static_LCBPCIKHALF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.class, emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.newBuilder()
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
        jOPGAMLCDBK_ = "";

        jDBHLHCMJGD_ = 0L;

        jsonStr_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.internal_static_LCBPCIKHALF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF build() {
        emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF buildPartial() {
        emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF result = new emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF(this);
        result.jOPGAMLCDBK_ = jOPGAMLCDBK_;
        result.jDBHLHCMJGD_ = jDBHLHCMJGD_;
        result.jsonStr_ = jsonStr_;
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
        if (other instanceof emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF) {
          return mergeFrom((emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF other) {
        if (other == emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF.getDefaultInstance()) return this;
        if (!other.getJOPGAMLCDBK().isEmpty()) {
          jOPGAMLCDBK_ = other.jOPGAMLCDBK_;
          onChanged();
        }
        if (other.getJDBHLHCMJGD() != 0L) {
          setJDBHLHCMJGD(other.getJDBHLHCMJGD());
        }
        if (!other.getJsonStr().isEmpty()) {
          jsonStr_ = other.jsonStr_;
          onChanged();
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
        emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object jOPGAMLCDBK_ = "";
      /**
       * <code>string JOPGAMLCDBK = 12;</code>
       * @return The jOPGAMLCDBK.
       */
      public java.lang.String getJOPGAMLCDBK() {
        java.lang.Object ref = jOPGAMLCDBK_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          jOPGAMLCDBK_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string JOPGAMLCDBK = 12;</code>
       * @return The bytes for jOPGAMLCDBK.
       */
      public com.google.protobuf.ByteString
          getJOPGAMLCDBKBytes() {
        java.lang.Object ref = jOPGAMLCDBK_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jOPGAMLCDBK_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string JOPGAMLCDBK = 12;</code>
       * @param value The jOPGAMLCDBK to set.
       * @return This builder for chaining.
       */
      public Builder setJOPGAMLCDBK(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        jOPGAMLCDBK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string JOPGAMLCDBK = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearJOPGAMLCDBK() {
        
        jOPGAMLCDBK_ = getDefaultInstance().getJOPGAMLCDBK();
        onChanged();
        return this;
      }
      /**
       * <code>string JOPGAMLCDBK = 12;</code>
       * @param value The bytes for jOPGAMLCDBK to set.
       * @return This builder for chaining.
       */
      public Builder setJOPGAMLCDBKBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        jOPGAMLCDBK_ = value;
        onChanged();
        return this;
      }

      private long jDBHLHCMJGD_ ;
      /**
       * <code>uint64 JDBHLHCMJGD = 14;</code>
       * @return The jDBHLHCMJGD.
       */
      @java.lang.Override
      public long getJDBHLHCMJGD() {
        return jDBHLHCMJGD_;
      }
      /**
       * <code>uint64 JDBHLHCMJGD = 14;</code>
       * @param value The jDBHLHCMJGD to set.
       * @return This builder for chaining.
       */
      public Builder setJDBHLHCMJGD(long value) {
        
        jDBHLHCMJGD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 JDBHLHCMJGD = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearJDBHLHCMJGD() {
        
        jDBHLHCMJGD_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object jsonStr_ = "";
      /**
       * <code>string json_str = 4;</code>
       * @return The jsonStr.
       */
      public java.lang.String getJsonStr() {
        java.lang.Object ref = jsonStr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          jsonStr_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string json_str = 4;</code>
       * @return The bytes for jsonStr.
       */
      public com.google.protobuf.ByteString
          getJsonStrBytes() {
        java.lang.Object ref = jsonStr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jsonStr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string json_str = 4;</code>
       * @param value The jsonStr to set.
       * @return This builder for chaining.
       */
      public Builder setJsonStr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        jsonStr_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string json_str = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearJsonStr() {
        
        jsonStr_ = getDefaultInstance().getJsonStr();
        onChanged();
        return this;
      }
      /**
       * <code>string json_str = 4;</code>
       * @param value The bytes for jsonStr to set.
       * @return This builder for chaining.
       */
      public Builder setJsonStrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        jsonStr_ = value;
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


      // @@protoc_insertion_point(builder_scope:LCBPCIKHALF)
    }

    // @@protoc_insertion_point(class_scope:LCBPCIKHALF)
    private static final emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF();
    }

    public static emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LCBPCIKHALF>
        PARSER = new com.google.protobuf.AbstractParser<LCBPCIKHALF>() {
      @java.lang.Override
      public LCBPCIKHALF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LCBPCIKHALF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LCBPCIKHALF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LCBPCIKHALF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LCBPCIKHALFOuterClass.LCBPCIKHALF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LCBPCIKHALF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LCBPCIKHALF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LCBPCIKHALF.proto\"I\n\013LCBPCIKHALF\022\023\n\013JO" +
      "PGAMLCDBK\030\014 \001(\t\022\023\n\013JDBHLHCMJGD\030\016 \001(\004\022\020\n\010" +
      "json_str\030\004 \001(\tB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LCBPCIKHALF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LCBPCIKHALF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LCBPCIKHALF_descriptor,
        new java.lang.String[] { "JOPGAMLCDBK", "JDBHLHCMJGD", "JsonStr", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
