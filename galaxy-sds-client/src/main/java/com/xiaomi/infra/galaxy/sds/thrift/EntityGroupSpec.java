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
 * EntityGroup定义
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-23")
public class EntityGroupSpec implements libthrift091.TBase<EntityGroupSpec, EntityGroupSpec._Fields>, java.io.Serializable, Cloneable, Comparable<EntityGroupSpec> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("EntityGroupSpec");

  private static final libthrift091.protocol.TField ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("attributes", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField ENABLE_HASH_FIELD_DESC = new libthrift091.protocol.TField("enableHash", libthrift091.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntityGroupSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntityGroupSpecTupleSchemeFactory());
  }

  /**
   * 属性有序列表
   */
  public List<KeySpec> attributes; // optional
  /**
   * 是否对属性进行哈希分布:
   * 开启后表中记录按照(hash(attribute value), attribute value)大小顺序分布
   */
  public boolean enableHash; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 属性有序列表
     */
    ATTRIBUTES((short)1, "attributes"),
    /**
     * 是否对属性进行哈希分布:
     * 开启后表中记录按照(hash(attribute value), attribute value)大小顺序分布
     */
    ENABLE_HASH((short)2, "enableHash");

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
        case 1: // ATTRIBUTES
          return ATTRIBUTES;
        case 2: // ENABLE_HASH
          return ENABLE_HASH;
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
  private static final int __ENABLEHASH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ATTRIBUTES,_Fields.ENABLE_HASH};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("attributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.LIST        , "IndexSpec")));
    tmpMap.put(_Fields.ENABLE_HASH, new libthrift091.meta_data.FieldMetaData("enableHash", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(EntityGroupSpec.class, metaDataMap);
  }

  public EntityGroupSpec() {
    this.enableHash = true;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntityGroupSpec(EntityGroupSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAttributes()) {
      this.attributes = other.attributes;
    }
    this.enableHash = other.enableHash;
  }

  public EntityGroupSpec deepCopy() {
    return new EntityGroupSpec(this);
  }

  @Override
  public void clear() {
    this.attributes = null;
    this.enableHash = true;

  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public java.util.Iterator<KeySpec> getAttributesIterator() {
    return (this.attributes == null) ? null : this.attributes.iterator();
  }

  public void addToAttributes(KeySpec elem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<KeySpec>();
    }
    this.attributes.add(elem);
  }

  /**
   * 属性有序列表
   */
  public List<KeySpec> getAttributes() {
    return this.attributes;
  }

  /**
   * 属性有序列表
   */
  public EntityGroupSpec setAttributes(List<KeySpec> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  /**
   * 是否对属性进行哈希分布:
   * 开启后表中记录按照(hash(attribute value), attribute value)大小顺序分布
   */
  public boolean isEnableHash() {
    return this.enableHash;
  }

  /**
   * 是否对属性进行哈希分布:
   * 开启后表中记录按照(hash(attribute value), attribute value)大小顺序分布
   */
  public EntityGroupSpec setEnableHash(boolean enableHash) {
    this.enableHash = enableHash;
    setEnableHashIsSet(true);
    return this;
  }

  public void unsetEnableHash() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENABLEHASH_ISSET_ID);
  }

  /** Returns true if field enableHash is set (has been assigned a value) and false otherwise */
  public boolean isSetEnableHash() {
    return EncodingUtils.testBit(__isset_bitfield, __ENABLEHASH_ISSET_ID);
  }

  public void setEnableHashIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENABLEHASH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((List<KeySpec>)value);
      }
      break;

    case ENABLE_HASH:
      if (value == null) {
        unsetEnableHash();
      } else {
        setEnableHash((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ATTRIBUTES:
      return getAttributes();

    case ENABLE_HASH:
      return Boolean.valueOf(isEnableHash());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ATTRIBUTES:
      return isSetAttributes();
    case ENABLE_HASH:
      return isSetEnableHash();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntityGroupSpec)
      return this.equals((EntityGroupSpec)that);
    return false;
  }

  public boolean equals(EntityGroupSpec that) {
    if (that == null)
      return false;

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_enableHash = true && this.isSetEnableHash();
    boolean that_present_enableHash = true && that.isSetEnableHash();
    if (this_present_enableHash || that_present_enableHash) {
      if (!(this_present_enableHash && that_present_enableHash))
        return false;
      if (this.enableHash != that.enableHash)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    boolean present_enableHash = true && (isSetEnableHash());
    list.add(present_enableHash);
    if (present_enableHash)
      list.add(enableHash);

    return list.hashCode();
  }

  @Override
  public int compareTo(EntityGroupSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnableHash()).compareTo(other.isSetEnableHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnableHash()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.enableHash, other.enableHash);
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
    StringBuilder sb = new StringBuilder("EntityGroupSpec(");
    boolean first = true;

    if (isSetAttributes()) {
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    if (isSetEnableHash()) {
      if (!first) sb.append(", ");
      sb.append("enableHash:");
      sb.append(this.enableHash);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class EntityGroupSpecStandardSchemeFactory implements SchemeFactory {
    public EntityGroupSpecStandardScheme getScheme() {
      return new EntityGroupSpecStandardScheme();
    }
  }

  private static class EntityGroupSpecStandardScheme extends StandardScheme<EntityGroupSpec> {

    public void read(libthrift091.protocol.TProtocol iprot, EntityGroupSpec struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list80 = iprot.readListBegin();
                struct.attributes = new ArrayList<KeySpec>(_list80.size);
                KeySpec _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = new KeySpec();
                  _elem81.read(iprot);
                  struct.attributes.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENABLE_HASH
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.enableHash = iprot.readBool();
              struct.setEnableHashIsSet(true);
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
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, EntityGroupSpec struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.attributes.size()));
            for (KeySpec _iter83 : struct.attributes)
            {
              _iter83.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEnableHash()) {
        oprot.writeFieldBegin(ENABLE_HASH_FIELD_DESC);
        oprot.writeBool(struct.enableHash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntityGroupSpecTupleSchemeFactory implements SchemeFactory {
    public EntityGroupSpecTupleScheme getScheme() {
      return new EntityGroupSpecTupleScheme();
    }
  }

  private static class EntityGroupSpecTupleScheme extends TupleScheme<EntityGroupSpec> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, EntityGroupSpec struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAttributes()) {
        optionals.set(0);
      }
      if (struct.isSetEnableHash()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (KeySpec _iter84 : struct.attributes)
          {
            _iter84.write(oprot);
          }
        }
      }
      if (struct.isSetEnableHash()) {
        oprot.writeBool(struct.enableHash);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, EntityGroupSpec struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list85 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.attributes = new ArrayList<KeySpec>(_list85.size);
          KeySpec _elem86;
          for (int _i87 = 0; _i87 < _list85.size; ++_i87)
          {
            _elem86 = new KeySpec();
            _elem86.read(iprot);
            struct.attributes.add(_elem86);
          }
        }
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.enableHash = iprot.readBool();
        struct.setEnableHashIsSet(true);
      }
    }
  }

}

