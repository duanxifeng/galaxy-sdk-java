/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-26")
public class GetPartitionsOffsetRequest implements libthrift091.TBase<GetPartitionsOffsetRequest, GetPartitionsOffsetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetPartitionsOffsetRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetPartitionsOffsetRequest");

  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_LIST_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartitionList", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetPartitionsOffsetRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetPartitionsOffsetRequestTupleSchemeFactory());
  }

  /**
   * The specified topicAndPartition list
   * 
   */
  public List<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition> topicAndPartitionList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The specified topicAndPartition list
     * 
     */
    TOPIC_AND_PARTITION_LIST((short)1, "topicAndPartitionList");

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
        case 1: // TOPIC_AND_PARTITION_LIST
          return TOPIC_AND_PARTITION_LIST;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_AND_PARTITION_LIST, new libthrift091.meta_data.FieldMetaData("topicAndPartitionList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetPartitionsOffsetRequest.class, metaDataMap);
  }

  public GetPartitionsOffsetRequest() {
  }

  public GetPartitionsOffsetRequest(
    List<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition> topicAndPartitionList)
  {
    this();
    this.topicAndPartitionList = topicAndPartitionList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartitionsOffsetRequest(GetPartitionsOffsetRequest other) {
    if (other.isSetTopicAndPartitionList()) {
      List<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition> __this__topicAndPartitionList = new ArrayList<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition>(other.topicAndPartitionList.size());
      for (com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition other_element : other.topicAndPartitionList) {
        __this__topicAndPartitionList.add(new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other_element));
      }
      this.topicAndPartitionList = __this__topicAndPartitionList;
    }
  }

  public GetPartitionsOffsetRequest deepCopy() {
    return new GetPartitionsOffsetRequest(this);
  }

  @Override
  public void clear() {
    this.topicAndPartitionList = null;
  }

  public int getTopicAndPartitionListSize() {
    return (this.topicAndPartitionList == null) ? 0 : this.topicAndPartitionList.size();
  }

  public java.util.Iterator<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition> getTopicAndPartitionListIterator() {
    return (this.topicAndPartitionList == null) ? null : this.topicAndPartitionList.iterator();
  }

  public void addToTopicAndPartitionList(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition elem) {
    if (this.topicAndPartitionList == null) {
      this.topicAndPartitionList = new ArrayList<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition>();
    }
    this.topicAndPartitionList.add(elem);
  }

  /**
   * The specified topicAndPartition list
   * 
   */
  public List<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition> getTopicAndPartitionList() {
    return this.topicAndPartitionList;
  }

  /**
   * The specified topicAndPartition list
   * 
   */
  public GetPartitionsOffsetRequest setTopicAndPartitionList(List<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition> topicAndPartitionList) {
    this.topicAndPartitionList = topicAndPartitionList;
    return this;
  }

  public void unsetTopicAndPartitionList() {
    this.topicAndPartitionList = null;
  }

  /** Returns true if field topicAndPartitionList is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartitionList() {
    return this.topicAndPartitionList != null;
  }

  public void setTopicAndPartitionListIsSet(boolean value) {
    if (!value) {
      this.topicAndPartitionList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_AND_PARTITION_LIST:
      if (value == null) {
        unsetTopicAndPartitionList();
      } else {
        setTopicAndPartitionList((List<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_AND_PARTITION_LIST:
      return getTopicAndPartitionList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_AND_PARTITION_LIST:
      return isSetTopicAndPartitionList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetPartitionsOffsetRequest)
      return this.equals((GetPartitionsOffsetRequest)that);
    return false;
  }

  public boolean equals(GetPartitionsOffsetRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicAndPartitionList = true && this.isSetTopicAndPartitionList();
    boolean that_present_topicAndPartitionList = true && that.isSetTopicAndPartitionList();
    if (this_present_topicAndPartitionList || that_present_topicAndPartitionList) {
      if (!(this_present_topicAndPartitionList && that_present_topicAndPartitionList))
        return false;
      if (!this.topicAndPartitionList.equals(that.topicAndPartitionList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicAndPartitionList = true && (isSetTopicAndPartitionList());
    list.add(present_topicAndPartitionList);
    if (present_topicAndPartitionList)
      list.add(topicAndPartitionList);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetPartitionsOffsetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicAndPartitionList()).compareTo(other.isSetTopicAndPartitionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartitionList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartitionList, other.topicAndPartitionList);
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
    StringBuilder sb = new StringBuilder("GetPartitionsOffsetRequest(");
    boolean first = true;

    sb.append("topicAndPartitionList:");
    if (this.topicAndPartitionList == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartitionList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicAndPartitionList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartitionList' was not present! Struct: " + toString());
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetPartitionsOffsetRequestStandardSchemeFactory implements SchemeFactory {
    public GetPartitionsOffsetRequestStandardScheme getScheme() {
      return new GetPartitionsOffsetRequestStandardScheme();
    }
  }

  private static class GetPartitionsOffsetRequestStandardScheme extends StandardScheme<GetPartitionsOffsetRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, GetPartitionsOffsetRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_AND_PARTITION_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list24 = iprot.readListBegin();
                struct.topicAndPartitionList = new ArrayList<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition>(_list24.size);
                com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
                  _elem25.read(iprot);
                  struct.topicAndPartitionList.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setTopicAndPartitionListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetPartitionsOffsetRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicAndPartitionList != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.topicAndPartitionList.size()));
          for (com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition _iter27 : struct.topicAndPartitionList)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetPartitionsOffsetRequestTupleSchemeFactory implements SchemeFactory {
    public GetPartitionsOffsetRequestTupleScheme getScheme() {
      return new GetPartitionsOffsetRequestTupleScheme();
    }
  }

  private static class GetPartitionsOffsetRequestTupleScheme extends TupleScheme<GetPartitionsOffsetRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetPartitionsOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.topicAndPartitionList.size());
        for (com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition _iter28 : struct.topicAndPartitionList)
        {
          _iter28.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetPartitionsOffsetRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list29 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.topicAndPartitionList = new ArrayList<com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition>(_list29.size);
        com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition _elem30;
        for (int _i31 = 0; _i31 < _list29.size; ++_i31)
        {
          _elem30 = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
          _elem30.read(iprot);
          struct.topicAndPartitionList.add(_elem30);
        }
      }
      struct.setTopicAndPartitionListIsSet(true);
    }
  }

}

