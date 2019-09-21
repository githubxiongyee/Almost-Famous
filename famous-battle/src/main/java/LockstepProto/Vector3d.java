// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LSMessage.proto

package LockstepProto;

/**
 * Protobuf type {@code LockstepProto.Vector3d}
 */
public  final class Vector3d extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockstepProto.Vector3d)
        Vector3dOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vector3d.newBuilder() to construct.
  private Vector3d(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vector3d() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Vector3d(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            x_ = input.readSInt64();
            break;
          }
          case 16: {

            y_ = input.readSInt64();
            break;
          }
          case 24: {

            z_ = input.readSInt64();
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
    return LSMessage.internal_static_LockstepProto_Vector3d_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LSMessage.internal_static_LockstepProto_Vector3d_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Vector3d.class, Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private long x_;
  /**
   * <code>sint64 x = 1;</code>
   */
  public long getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private long y_;
  /**
   * <code>sint64 y = 2;</code>
   */
  public long getY() {
    return y_;
  }

  public static final int Z_FIELD_NUMBER = 3;
  private long z_;
  /**
   * <code>sint64 z = 3;</code>
   */
  public long getZ() {
    return z_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (x_ != 0L) {
      output.writeSInt64(1, x_);
    }
    if (y_ != 0L) {
      output.writeSInt64(2, y_);
    }
    if (z_ != 0L) {
      output.writeSInt64(3, z_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (x_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt64Size(1, x_);
    }
    if (y_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt64Size(2, y_);
    }
    if (z_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt64Size(3, z_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Vector3d)) {
      return super.equals(obj);
    }
    Vector3d other = (Vector3d) obj;

    if (getX()
        != other.getX()) return false;
    if (getY()
        != other.getY()) return false;
    if (getZ()
        != other.getZ()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getX());
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getY());
    hash = (37 * hash) + Z_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getZ());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Vector3d parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Vector3d parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Vector3d parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Vector3d parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Vector3d parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Vector3d parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Vector3d parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Vector3d parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Vector3d parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Vector3d parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Vector3d parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Vector3d parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Vector3d prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LockstepProto.Vector3d}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockstepProto.Vector3d)
      LockstepProto.Vector3dOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LSMessage.internal_static_LockstepProto_Vector3d_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LSMessage.internal_static_LockstepProto_Vector3d_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Vector3d.class, Builder.class);
    }

    // Construct using LockstepProto.Vector3d.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      x_ = 0L;

      y_ = 0L;

      z_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LSMessage.internal_static_LockstepProto_Vector3d_descriptor;
    }

    @Override
    public Vector3d getDefaultInstanceForType() {
      return Vector3d.getDefaultInstance();
    }

    @Override
    public Vector3d build() {
      Vector3d result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Vector3d buildPartial() {
      Vector3d result = new Vector3d(this);
      result.x_ = x_;
      result.y_ = y_;
      result.z_ = z_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Vector3d) {
        return mergeFrom((Vector3d)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Vector3d other) {
      if (other == Vector3d.getDefaultInstance()) return this;
      if (other.getX() != 0L) {
        setX(other.getX());
      }
      if (other.getY() != 0L) {
        setY(other.getY());
      }
      if (other.getZ() != 0L) {
        setZ(other.getZ());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Vector3d parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Vector3d) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long x_ ;
    /**
     * <code>sint64 x = 1;</code>
     */
    public long getX() {
      return x_;
    }
    /**
     * <code>sint64 x = 1;</code>
     */
    public Builder setX(long value) {
      
      x_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint64 x = 1;</code>
     */
    public Builder clearX() {
      
      x_ = 0L;
      onChanged();
      return this;
    }

    private long y_ ;
    /**
     * <code>sint64 y = 2;</code>
     */
    public long getY() {
      return y_;
    }
    /**
     * <code>sint64 y = 2;</code>
     */
    public Builder setY(long value) {
      
      y_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint64 y = 2;</code>
     */
    public Builder clearY() {
      
      y_ = 0L;
      onChanged();
      return this;
    }

    private long z_ ;
    /**
     * <code>sint64 z = 3;</code>
     */
    public long getZ() {
      return z_;
    }
    /**
     * <code>sint64 z = 3;</code>
     */
    public Builder setZ(long value) {
      
      z_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint64 z = 3;</code>
     */
    public Builder clearZ() {
      
      z_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LockstepProto.Vector3d)
  }

  // @@protoc_insertion_point(class_scope:LockstepProto.Vector3d)
  private static final Vector3d DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Vector3d();
  }

  public static Vector3d getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vector3d>
      PARSER = new com.google.protobuf.AbstractParser<Vector3d>() {
    @Override
    public Vector3d parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Vector3d(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Vector3d> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Vector3d> getParserForType() {
    return PARSER;
  }

  @Override
  public Vector3d getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

