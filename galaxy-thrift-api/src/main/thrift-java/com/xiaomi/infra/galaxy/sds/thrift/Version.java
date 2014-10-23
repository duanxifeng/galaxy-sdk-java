/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 版本号，规则详见http://semver.org
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-9")
public class Version implements libthrift091.TBase<Version, Version._Fields>, java.io.Serializable, Cloneable, Comparable<Version> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Version");

  private static final libthrift091.protocol.TField MAJOR_FIELD_DESC = new libthrift091.protocol.TField("major", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField MINOR_FIELD_DESC = new libthrift091.protocol.TField("minor", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField PATCH_FIELD_DESC = new libthrift091.protocol.TField("patch", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField COMMENTS_FIELD_DESC = new libthrift091.protocol.TField("comments", libthrift091.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VersionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VersionTupleSchemeFactory());
  }

  /**
   * 主版本号，不同版本号之间不兼容
   */
  public int major; // required
  /**
   * 次版本号，不同版本号之间向后兼容
   */
  public int minor; // required
  /**
   * 构建版本号，不同版本之间互相兼容
   */
  public String patch; // optional
  /**
   * 附加信息
   */
  public String comments; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 主版本号，不同版本号之间不兼容
     */
    MAJOR((short)1, "major"),
    /**
     * 次版本号，不同版本号之间向后兼容
     */
    MINOR((short)2, "minor"),
    /**
     * 构建版本号，不同版本之间互相兼容
     */
    PATCH((short)3, "patch"),
    /**
     * 附加信息
     */
    COMMENTS((short)4, "comments");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MAJOR
          return MAJOR;
        case 2: // MINOR
          return MINOR;
        case 3: // PATCH
          return PATCH;
        case 4: // COMMENTS
          return COMMENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MAJOR_ISSET_ID = 0;
  private static final int __MINOR_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PATCH,_Fields.COMMENTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAJOR, new libthrift091.meta_data.FieldMetaData("major", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MINOR, new libthrift091.meta_data.FieldMetaData("minor", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.PATCH, new libthrift091.meta_data.FieldMetaData("patch", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMMENTS, new libthrift091.meta_data.FieldMetaData("comments", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Version.class, metaDataMap);
  }

  public Version() {
    this.major = 1;

    this.minor = 0;

    this.patch = "db56394d";

    this.comments = "";

  }

  public Version(
    int major,
    int minor)
  {
    this();
    this.major = major;
    setMajorIsSet(true);
    this.minor = minor;
    setMinorIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Version(Version other) {
    __isset_bitfield = other.__isset_bitfield;
    this.major = other.major;
    this.minor = other.minor;
    if (other.isSetPatch()) {
      this.patch = other.patch;
    }
    if (other.isSetComments()) {
      this.comments = other.comments;
    }
  }

  public Version deepCopy() {
    return new Version(this);
  }

  @Override
  public void clear() {
    this.major = 1;

    this.minor = 0;

    this.patch = "db56394d";

    this.comments = "";

  }

  /**
   * 主版本号，不同版本号之间不兼容
   */
  public int getMajor() {
    return this.major;
  }

  /**
   * 主版本号，不同版本号之间不兼容
   */
  public Version setMajor(int major) {
    this.major = major;
    setMajorIsSet(true);
    return this;
  }

  public void unsetMajor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAJOR_ISSET_ID);
  }

  /** Returns true if field major is set (has been assigned a value) and false otherwise */
  public boolean isSetMajor() {
    return EncodingUtils.testBit(__isset_bitfield, __MAJOR_ISSET_ID);
  }

  public void setMajorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAJOR_ISSET_ID, value);
  }

  /**
   * 次版本号，不同版本号之间向后兼容
   */
  public int getMinor() {
    return this.minor;
  }

  /**
   * 次版本号，不同版本号之间向后兼容
   */
  public Version setMinor(int minor) {
    this.minor = minor;
    setMinorIsSet(true);
    return this;
  }

  public void unsetMinor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MINOR_ISSET_ID);
  }

  /** Returns true if field minor is set (has been assigned a value) and false otherwise */
  public boolean isSetMinor() {
    return EncodingUtils.testBit(__isset_bitfield, __MINOR_ISSET_ID);
  }

  public void setMinorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MINOR_ISSET_ID, value);
  }

  /**
   * 构建版本号，不同版本之间互相兼容
   */
  public String getPatch() {
    return this.patch;
  }

  /**
   * 构建版本号，不同版本之间互相兼容
   */
  public Version setPatch(String patch) {
    this.patch = patch;
    return this;
  }

  public void unsetPatch() {
    this.patch = null;
  }

  /** Returns true if field patch is set (has been assigned a value) and false otherwise */
  public boolean isSetPatch() {
    return this.patch != null;
  }

  public void setPatchIsSet(boolean value) {
    if (!value) {
      this.patch = null;
    }
  }

  /**
   * 附加信息
   */
  public String getComments() {
    return this.comments;
  }

  /**
   * 附加信息
   */
  public Version setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public void unsetComments() {
    this.comments = null;
  }

  /** Returns true if field comments is set (has been assigned a value) and false otherwise */
  public boolean isSetComments() {
    return this.comments != null;
  }

  public void setCommentsIsSet(boolean value) {
    if (!value) {
      this.comments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAJOR:
      if (value == null) {
        unsetMajor();
      } else {
        setMajor((Integer)value);
      }
      break;

    case MINOR:
      if (value == null) {
        unsetMinor();
      } else {
        setMinor((Integer)value);
      }
      break;

    case PATCH:
      if (value == null) {
        unsetPatch();
      } else {
        setPatch((String)value);
      }
      break;

    case COMMENTS:
      if (value == null) {
        unsetComments();
      } else {
        setComments((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAJOR:
      return Integer.valueOf(getMajor());

    case MINOR:
      return Integer.valueOf(getMinor());

    case PATCH:
      return getPatch();

    case COMMENTS:
      return getComments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAJOR:
      return isSetMajor();
    case MINOR:
      return isSetMinor();
    case PATCH:
      return isSetPatch();
    case COMMENTS:
      return isSetComments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Version)
      return this.equals((Version)that);
    return false;
  }

  public boolean equals(Version that) {
    if (that == null)
      return false;

    boolean this_present_major = true;
    boolean that_present_major = true;
    if (this_present_major || that_present_major) {
      if (!(this_present_major && that_present_major))
        return false;
      if (this.major != that.major)
        return false;
    }

    boolean this_present_minor = true;
    boolean that_present_minor = true;
    if (this_present_minor || that_present_minor) {
      if (!(this_present_minor && that_present_minor))
        return false;
      if (this.minor != that.minor)
        return false;
    }

    boolean this_present_patch = true && this.isSetPatch();
    boolean that_present_patch = true && that.isSetPatch();
    if (this_present_patch || that_present_patch) {
      if (!(this_present_patch && that_present_patch))
        return false;
      if (!this.patch.equals(that.patch))
        return false;
    }

    boolean this_present_comments = true && this.isSetComments();
    boolean that_present_comments = true && that.isSetComments();
    if (this_present_comments || that_present_comments) {
      if (!(this_present_comments && that_present_comments))
        return false;
      if (!this.comments.equals(that.comments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_major = true;
    list.add(present_major);
    if (present_major)
      list.add(major);

    boolean present_minor = true;
    list.add(present_minor);
    if (present_minor)
      list.add(minor);

    boolean present_patch = true && (isSetPatch());
    list.add(present_patch);
    if (present_patch)
      list.add(patch);

    boolean present_comments = true && (isSetComments());
    list.add(present_comments);
    if (present_comments)
      list.add(comments);

    return list.hashCode();
  }

  @Override
  public int compareTo(Version other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMajor()).compareTo(other.isSetMajor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMajor()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.major, other.major);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinor()).compareTo(other.isSetMinor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinor()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.minor, other.minor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPatch()).compareTo(other.isSetPatch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPatch()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.patch, other.patch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComments()).compareTo(other.isSetComments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComments()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.comments, other.comments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Version(");
    boolean first = true;

    sb.append("major:");
    sb.append(this.major);
    first = false;
    if (!first) sb.append(", ");
    sb.append("minor:");
    sb.append(this.minor);
    first = false;
    if (isSetPatch()) {
      if (!first) sb.append(", ");
      sb.append("patch:");
      if (this.patch == null) {
        sb.append("null");
      } else {
        sb.append(this.patch);
      }
      first = false;
    }
    if (isSetComments()) {
      if (!first) sb.append(", ");
      sb.append("comments:");
      if (this.comments == null) {
        sb.append("null");
      } else {
        sb.append(this.comments);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'major' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'minor' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VersionStandardSchemeFactory implements SchemeFactory {
    public VersionStandardScheme getScheme() {
      return new VersionStandardScheme();
    }
  }

  private static class VersionStandardScheme extends StandardScheme<Version> {

    public void read(libthrift091.protocol.TProtocol iprot, Version struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAJOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.major = iprot.readI32();
              struct.setMajorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MINOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.minor = iprot.readI32();
              struct.setMinorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PATCH
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.patch = iprot.readString();
              struct.setPatchIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMMENTS
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.comments = iprot.readString();
              struct.setCommentsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetMajor()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'major' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMinor()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'minor' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, Version struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAJOR_FIELD_DESC);
      oprot.writeI32(struct.major);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MINOR_FIELD_DESC);
      oprot.writeI32(struct.minor);
      oprot.writeFieldEnd();
      if (struct.patch != null) {
        if (struct.isSetPatch()) {
          oprot.writeFieldBegin(PATCH_FIELD_DESC);
          oprot.writeString(struct.patch);
          oprot.writeFieldEnd();
        }
      }
      if (struct.comments != null) {
        if (struct.isSetComments()) {
          oprot.writeFieldBegin(COMMENTS_FIELD_DESC);
          oprot.writeString(struct.comments);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VersionTupleSchemeFactory implements SchemeFactory {
    public VersionTupleScheme getScheme() {
      return new VersionTupleScheme();
    }
  }

  private static class VersionTupleScheme extends TupleScheme<Version> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Version struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.major);
      oprot.writeI32(struct.minor);
      BitSet optionals = new BitSet();
      if (struct.isSetPatch()) {
        optionals.set(0);
      }
      if (struct.isSetComments()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPatch()) {
        oprot.writeString(struct.patch);
      }
      if (struct.isSetComments()) {
        oprot.writeString(struct.comments);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Version struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.major = iprot.readI32();
      struct.setMajorIsSet(true);
      struct.minor = iprot.readI32();
      struct.setMinorIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.patch = iprot.readString();
        struct.setPatchIsSet(true);
      }
      if (incoming.get(1)) {
        struct.comments = iprot.readString();
        struct.setCommentsIsSet(true);
      }
    }
  }

}

