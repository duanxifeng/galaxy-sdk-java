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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-21")
public class UserQuota implements libthrift091.TBase<UserQuota, UserQuota._Fields>, java.io.Serializable, Cloneable, Comparable<UserQuota> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("UserQuota");

  private static final libthrift091.protocol.TField SPACE_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("spaceQuota", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField TOPIC_NUMBER_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("topicNumberQuota", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField PARTITION_NUMBER_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("partitionNumberQuota", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField CREATE_TOPIC_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("createTopicQpsQuota", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField DELETE_TOPIC_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("deleteTopicQpsQuota", libthrift091.protocol.TType.I32, (short)5);
  private static final libthrift091.protocol.TField DESCRIBE_TOPIC_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("describeTopicQpsQuota", libthrift091.protocol.TType.I32, (short)6);
  private static final libthrift091.protocol.TField LIST_TOPICS_QPS_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("listTopicsQpsQuota", libthrift091.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserQuotaTupleSchemeFactory());
  }

  /**
   * The max space can be used for this developerId, default 1T (1G ~ 5T);
   * 
   */
  public long spaceQuota; // required
  /**
   * The max topic number that this developerId can create, default 20 (1 ~ 100);
   * 
   */
  public int topicNumberQuota; // optional
  /**
   * The max partition number in a signal topic, default 64 (1 ~ 256);
   * 
   */
  public int partitionNumberQuota; // optional
  /**
   * The max CreateTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public int createTopicQpsQuota; // optional
  /**
   * The max DeleteTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public int deleteTopicQpsQuota; // optional
  /**
   * The max DescribeTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public int describeTopicQpsQuota; // optional
  /**
   * The max listTopics times per second for this developerId, default 10 (1 ~ 10);
   * 
   */
  public int listTopicsQpsQuota; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The max space can be used for this developerId, default 1T (1G ~ 5T);
     * 
     */
    SPACE_QUOTA((short)1, "spaceQuota"),
    /**
     * The max topic number that this developerId can create, default 20 (1 ~ 100);
     * 
     */
    TOPIC_NUMBER_QUOTA((short)2, "topicNumberQuota"),
    /**
     * The max partition number in a signal topic, default 64 (1 ~ 256);
     * 
     */
    PARTITION_NUMBER_QUOTA((short)3, "partitionNumberQuota"),
    /**
     * The max CreateTopic times per second for this developerId, default 5 (1 ~ 5);
     * 
     */
    CREATE_TOPIC_QPS_QUOTA((short)4, "createTopicQpsQuota"),
    /**
     * The max DeleteTopic times per second for this developerId, default 5 (1 ~ 5);
     * 
     */
    DELETE_TOPIC_QPS_QUOTA((short)5, "deleteTopicQpsQuota"),
    /**
     * The max DescribeTopic times per second for this developerId, default 5 (1 ~ 5);
     * 
     */
    DESCRIBE_TOPIC_QPS_QUOTA((short)6, "describeTopicQpsQuota"),
    /**
     * The max listTopics times per second for this developerId, default 10 (1 ~ 10);
     * 
     */
    LIST_TOPICS_QPS_QUOTA((short)7, "listTopicsQpsQuota");

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
        case 1: // SPACE_QUOTA
          return SPACE_QUOTA;
        case 2: // TOPIC_NUMBER_QUOTA
          return TOPIC_NUMBER_QUOTA;
        case 3: // PARTITION_NUMBER_QUOTA
          return PARTITION_NUMBER_QUOTA;
        case 4: // CREATE_TOPIC_QPS_QUOTA
          return CREATE_TOPIC_QPS_QUOTA;
        case 5: // DELETE_TOPIC_QPS_QUOTA
          return DELETE_TOPIC_QPS_QUOTA;
        case 6: // DESCRIBE_TOPIC_QPS_QUOTA
          return DESCRIBE_TOPIC_QPS_QUOTA;
        case 7: // LIST_TOPICS_QPS_QUOTA
          return LIST_TOPICS_QPS_QUOTA;
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
  private static final int __SPACEQUOTA_ISSET_ID = 0;
  private static final int __TOPICNUMBERQUOTA_ISSET_ID = 1;
  private static final int __PARTITIONNUMBERQUOTA_ISSET_ID = 2;
  private static final int __CREATETOPICQPSQUOTA_ISSET_ID = 3;
  private static final int __DELETETOPICQPSQUOTA_ISSET_ID = 4;
  private static final int __DESCRIBETOPICQPSQUOTA_ISSET_ID = 5;
  private static final int __LISTTOPICSQPSQUOTA_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOPIC_NUMBER_QUOTA,_Fields.PARTITION_NUMBER_QUOTA,_Fields.CREATE_TOPIC_QPS_QUOTA,_Fields.DELETE_TOPIC_QPS_QUOTA,_Fields.DESCRIBE_TOPIC_QPS_QUOTA,_Fields.LIST_TOPICS_QPS_QUOTA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPACE_QUOTA, new libthrift091.meta_data.FieldMetaData("spaceQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.TOPIC_NUMBER_QUOTA, new libthrift091.meta_data.FieldMetaData("topicNumberQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.PARTITION_NUMBER_QUOTA, new libthrift091.meta_data.FieldMetaData("partitionNumberQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.CREATE_TOPIC_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("createTopicQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.DELETE_TOPIC_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("deleteTopicQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRIBE_TOPIC_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("describeTopicQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.LIST_TOPICS_QPS_QUOTA, new libthrift091.meta_data.FieldMetaData("listTopicsQpsQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(UserQuota.class, metaDataMap);
  }

  public UserQuota() {
  }

  public UserQuota(
    long spaceQuota)
  {
    this();
    this.spaceQuota = spaceQuota;
    setSpaceQuotaIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserQuota(UserQuota other) {
    __isset_bitfield = other.__isset_bitfield;
    this.spaceQuota = other.spaceQuota;
    this.topicNumberQuota = other.topicNumberQuota;
    this.partitionNumberQuota = other.partitionNumberQuota;
    this.createTopicQpsQuota = other.createTopicQpsQuota;
    this.deleteTopicQpsQuota = other.deleteTopicQpsQuota;
    this.describeTopicQpsQuota = other.describeTopicQpsQuota;
    this.listTopicsQpsQuota = other.listTopicsQpsQuota;
  }

  public UserQuota deepCopy() {
    return new UserQuota(this);
  }

  @Override
  public void clear() {
    setSpaceQuotaIsSet(false);
    this.spaceQuota = 0;
    setTopicNumberQuotaIsSet(false);
    this.topicNumberQuota = 0;
    setPartitionNumberQuotaIsSet(false);
    this.partitionNumberQuota = 0;
    setCreateTopicQpsQuotaIsSet(false);
    this.createTopicQpsQuota = 0;
    setDeleteTopicQpsQuotaIsSet(false);
    this.deleteTopicQpsQuota = 0;
    setDescribeTopicQpsQuotaIsSet(false);
    this.describeTopicQpsQuota = 0;
    setListTopicsQpsQuotaIsSet(false);
    this.listTopicsQpsQuota = 0;
  }

  /**
   * The max space can be used for this developerId, default 1T (1G ~ 5T);
   * 
   */
  public long getSpaceQuota() {
    return this.spaceQuota;
  }

  /**
   * The max space can be used for this developerId, default 1T (1G ~ 5T);
   * 
   */
  public UserQuota setSpaceQuota(long spaceQuota) {
    this.spaceQuota = spaceQuota;
    setSpaceQuotaIsSet(true);
    return this;
  }

  public void unsetSpaceQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPACEQUOTA_ISSET_ID);
  }

  /** Returns true if field spaceQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetSpaceQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __SPACEQUOTA_ISSET_ID);
  }

  public void setSpaceQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPACEQUOTA_ISSET_ID, value);
  }

  /**
   * The max topic number that this developerId can create, default 20 (1 ~ 100);
   * 
   */
  public int getTopicNumberQuota() {
    return this.topicNumberQuota;
  }

  /**
   * The max topic number that this developerId can create, default 20 (1 ~ 100);
   * 
   */
  public UserQuota setTopicNumberQuota(int topicNumberQuota) {
    this.topicNumberQuota = topicNumberQuota;
    setTopicNumberQuotaIsSet(true);
    return this;
  }

  public void unsetTopicNumberQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOPICNUMBERQUOTA_ISSET_ID);
  }

  /** Returns true if field topicNumberQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicNumberQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __TOPICNUMBERQUOTA_ISSET_ID);
  }

  public void setTopicNumberQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOPICNUMBERQUOTA_ISSET_ID, value);
  }

  /**
   * The max partition number in a signal topic, default 64 (1 ~ 256);
   * 
   */
  public int getPartitionNumberQuota() {
    return this.partitionNumberQuota;
  }

  /**
   * The max partition number in a signal topic, default 64 (1 ~ 256);
   * 
   */
  public UserQuota setPartitionNumberQuota(int partitionNumberQuota) {
    this.partitionNumberQuota = partitionNumberQuota;
    setPartitionNumberQuotaIsSet(true);
    return this;
  }

  public void unsetPartitionNumberQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONNUMBERQUOTA_ISSET_ID);
  }

  /** Returns true if field partitionNumberQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionNumberQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONNUMBERQUOTA_ISSET_ID);
  }

  public void setPartitionNumberQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONNUMBERQUOTA_ISSET_ID, value);
  }

  /**
   * The max CreateTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public int getCreateTopicQpsQuota() {
    return this.createTopicQpsQuota;
  }

  /**
   * The max CreateTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public UserQuota setCreateTopicQpsQuota(int createTopicQpsQuota) {
    this.createTopicQpsQuota = createTopicQpsQuota;
    setCreateTopicQpsQuotaIsSet(true);
    return this;
  }

  public void unsetCreateTopicQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETOPICQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field createTopicQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTopicQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETOPICQPSQUOTA_ISSET_ID);
  }

  public void setCreateTopicQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETOPICQPSQUOTA_ISSET_ID, value);
  }

  /**
   * The max DeleteTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public int getDeleteTopicQpsQuota() {
    return this.deleteTopicQpsQuota;
  }

  /**
   * The max DeleteTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public UserQuota setDeleteTopicQpsQuota(int deleteTopicQpsQuota) {
    this.deleteTopicQpsQuota = deleteTopicQpsQuota;
    setDeleteTopicQpsQuotaIsSet(true);
    return this;
  }

  public void unsetDeleteTopicQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELETETOPICQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field deleteTopicQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteTopicQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __DELETETOPICQPSQUOTA_ISSET_ID);
  }

  public void setDeleteTopicQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELETETOPICQPSQUOTA_ISSET_ID, value);
  }

  /**
   * The max DescribeTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public int getDescribeTopicQpsQuota() {
    return this.describeTopicQpsQuota;
  }

  /**
   * The max DescribeTopic times per second for this developerId, default 5 (1 ~ 5);
   * 
   */
  public UserQuota setDescribeTopicQpsQuota(int describeTopicQpsQuota) {
    this.describeTopicQpsQuota = describeTopicQpsQuota;
    setDescribeTopicQpsQuotaIsSet(true);
    return this;
  }

  public void unsetDescribeTopicQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DESCRIBETOPICQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field describeTopicQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetDescribeTopicQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __DESCRIBETOPICQPSQUOTA_ISSET_ID);
  }

  public void setDescribeTopicQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DESCRIBETOPICQPSQUOTA_ISSET_ID, value);
  }

  /**
   * The max listTopics times per second for this developerId, default 10 (1 ~ 10);
   * 
   */
  public int getListTopicsQpsQuota() {
    return this.listTopicsQpsQuota;
  }

  /**
   * The max listTopics times per second for this developerId, default 10 (1 ~ 10);
   * 
   */
  public UserQuota setListTopicsQpsQuota(int listTopicsQpsQuota) {
    this.listTopicsQpsQuota = listTopicsQpsQuota;
    setListTopicsQpsQuotaIsSet(true);
    return this;
  }

  public void unsetListTopicsQpsQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LISTTOPICSQPSQUOTA_ISSET_ID);
  }

  /** Returns true if field listTopicsQpsQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetListTopicsQpsQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __LISTTOPICSQPSQUOTA_ISSET_ID);
  }

  public void setListTopicsQpsQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LISTTOPICSQPSQUOTA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SPACE_QUOTA:
      if (value == null) {
        unsetSpaceQuota();
      } else {
        setSpaceQuota((Long)value);
      }
      break;

    case TOPIC_NUMBER_QUOTA:
      if (value == null) {
        unsetTopicNumberQuota();
      } else {
        setTopicNumberQuota((Integer)value);
      }
      break;

    case PARTITION_NUMBER_QUOTA:
      if (value == null) {
        unsetPartitionNumberQuota();
      } else {
        setPartitionNumberQuota((Integer)value);
      }
      break;

    case CREATE_TOPIC_QPS_QUOTA:
      if (value == null) {
        unsetCreateTopicQpsQuota();
      } else {
        setCreateTopicQpsQuota((Integer)value);
      }
      break;

    case DELETE_TOPIC_QPS_QUOTA:
      if (value == null) {
        unsetDeleteTopicQpsQuota();
      } else {
        setDeleteTopicQpsQuota((Integer)value);
      }
      break;

    case DESCRIBE_TOPIC_QPS_QUOTA:
      if (value == null) {
        unsetDescribeTopicQpsQuota();
      } else {
        setDescribeTopicQpsQuota((Integer)value);
      }
      break;

    case LIST_TOPICS_QPS_QUOTA:
      if (value == null) {
        unsetListTopicsQpsQuota();
      } else {
        setListTopicsQpsQuota((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SPACE_QUOTA:
      return Long.valueOf(getSpaceQuota());

    case TOPIC_NUMBER_QUOTA:
      return Integer.valueOf(getTopicNumberQuota());

    case PARTITION_NUMBER_QUOTA:
      return Integer.valueOf(getPartitionNumberQuota());

    case CREATE_TOPIC_QPS_QUOTA:
      return Integer.valueOf(getCreateTopicQpsQuota());

    case DELETE_TOPIC_QPS_QUOTA:
      return Integer.valueOf(getDeleteTopicQpsQuota());

    case DESCRIBE_TOPIC_QPS_QUOTA:
      return Integer.valueOf(getDescribeTopicQpsQuota());

    case LIST_TOPICS_QPS_QUOTA:
      return Integer.valueOf(getListTopicsQpsQuota());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SPACE_QUOTA:
      return isSetSpaceQuota();
    case TOPIC_NUMBER_QUOTA:
      return isSetTopicNumberQuota();
    case PARTITION_NUMBER_QUOTA:
      return isSetPartitionNumberQuota();
    case CREATE_TOPIC_QPS_QUOTA:
      return isSetCreateTopicQpsQuota();
    case DELETE_TOPIC_QPS_QUOTA:
      return isSetDeleteTopicQpsQuota();
    case DESCRIBE_TOPIC_QPS_QUOTA:
      return isSetDescribeTopicQpsQuota();
    case LIST_TOPICS_QPS_QUOTA:
      return isSetListTopicsQpsQuota();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserQuota)
      return this.equals((UserQuota)that);
    return false;
  }

  public boolean equals(UserQuota that) {
    if (that == null)
      return false;

    boolean this_present_spaceQuota = true;
    boolean that_present_spaceQuota = true;
    if (this_present_spaceQuota || that_present_spaceQuota) {
      if (!(this_present_spaceQuota && that_present_spaceQuota))
        return false;
      if (this.spaceQuota != that.spaceQuota)
        return false;
    }

    boolean this_present_topicNumberQuota = true && this.isSetTopicNumberQuota();
    boolean that_present_topicNumberQuota = true && that.isSetTopicNumberQuota();
    if (this_present_topicNumberQuota || that_present_topicNumberQuota) {
      if (!(this_present_topicNumberQuota && that_present_topicNumberQuota))
        return false;
      if (this.topicNumberQuota != that.topicNumberQuota)
        return false;
    }

    boolean this_present_partitionNumberQuota = true && this.isSetPartitionNumberQuota();
    boolean that_present_partitionNumberQuota = true && that.isSetPartitionNumberQuota();
    if (this_present_partitionNumberQuota || that_present_partitionNumberQuota) {
      if (!(this_present_partitionNumberQuota && that_present_partitionNumberQuota))
        return false;
      if (this.partitionNumberQuota != that.partitionNumberQuota)
        return false;
    }

    boolean this_present_createTopicQpsQuota = true && this.isSetCreateTopicQpsQuota();
    boolean that_present_createTopicQpsQuota = true && that.isSetCreateTopicQpsQuota();
    if (this_present_createTopicQpsQuota || that_present_createTopicQpsQuota) {
      if (!(this_present_createTopicQpsQuota && that_present_createTopicQpsQuota))
        return false;
      if (this.createTopicQpsQuota != that.createTopicQpsQuota)
        return false;
    }

    boolean this_present_deleteTopicQpsQuota = true && this.isSetDeleteTopicQpsQuota();
    boolean that_present_deleteTopicQpsQuota = true && that.isSetDeleteTopicQpsQuota();
    if (this_present_deleteTopicQpsQuota || that_present_deleteTopicQpsQuota) {
      if (!(this_present_deleteTopicQpsQuota && that_present_deleteTopicQpsQuota))
        return false;
      if (this.deleteTopicQpsQuota != that.deleteTopicQpsQuota)
        return false;
    }

    boolean this_present_describeTopicQpsQuota = true && this.isSetDescribeTopicQpsQuota();
    boolean that_present_describeTopicQpsQuota = true && that.isSetDescribeTopicQpsQuota();
    if (this_present_describeTopicQpsQuota || that_present_describeTopicQpsQuota) {
      if (!(this_present_describeTopicQpsQuota && that_present_describeTopicQpsQuota))
        return false;
      if (this.describeTopicQpsQuota != that.describeTopicQpsQuota)
        return false;
    }

    boolean this_present_listTopicsQpsQuota = true && this.isSetListTopicsQpsQuota();
    boolean that_present_listTopicsQpsQuota = true && that.isSetListTopicsQpsQuota();
    if (this_present_listTopicsQpsQuota || that_present_listTopicsQpsQuota) {
      if (!(this_present_listTopicsQpsQuota && that_present_listTopicsQpsQuota))
        return false;
      if (this.listTopicsQpsQuota != that.listTopicsQpsQuota)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_spaceQuota = true;
    list.add(present_spaceQuota);
    if (present_spaceQuota)
      list.add(spaceQuota);

    boolean present_topicNumberQuota = true && (isSetTopicNumberQuota());
    list.add(present_topicNumberQuota);
    if (present_topicNumberQuota)
      list.add(topicNumberQuota);

    boolean present_partitionNumberQuota = true && (isSetPartitionNumberQuota());
    list.add(present_partitionNumberQuota);
    if (present_partitionNumberQuota)
      list.add(partitionNumberQuota);

    boolean present_createTopicQpsQuota = true && (isSetCreateTopicQpsQuota());
    list.add(present_createTopicQpsQuota);
    if (present_createTopicQpsQuota)
      list.add(createTopicQpsQuota);

    boolean present_deleteTopicQpsQuota = true && (isSetDeleteTopicQpsQuota());
    list.add(present_deleteTopicQpsQuota);
    if (present_deleteTopicQpsQuota)
      list.add(deleteTopicQpsQuota);

    boolean present_describeTopicQpsQuota = true && (isSetDescribeTopicQpsQuota());
    list.add(present_describeTopicQpsQuota);
    if (present_describeTopicQpsQuota)
      list.add(describeTopicQpsQuota);

    boolean present_listTopicsQpsQuota = true && (isSetListTopicsQpsQuota());
    list.add(present_listTopicsQpsQuota);
    if (present_listTopicsQpsQuota)
      list.add(listTopicsQpsQuota);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpaceQuota()).compareTo(other.isSetSpaceQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpaceQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.spaceQuota, other.spaceQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicNumberQuota()).compareTo(other.isSetTopicNumberQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicNumberQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicNumberQuota, other.topicNumberQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionNumberQuota()).compareTo(other.isSetPartitionNumberQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionNumberQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionNumberQuota, other.partitionNumberQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTopicQpsQuota()).compareTo(other.isSetCreateTopicQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTopicQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.createTopicQpsQuota, other.createTopicQpsQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteTopicQpsQuota()).compareTo(other.isSetDeleteTopicQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteTopicQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.deleteTopicQpsQuota, other.deleteTopicQpsQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescribeTopicQpsQuota()).compareTo(other.isSetDescribeTopicQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescribeTopicQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.describeTopicQpsQuota, other.describeTopicQpsQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetListTopicsQpsQuota()).compareTo(other.isSetListTopicsQpsQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetListTopicsQpsQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.listTopicsQpsQuota, other.listTopicsQpsQuota);
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
    StringBuilder sb = new StringBuilder("UserQuota(");
    boolean first = true;

    sb.append("spaceQuota:");
    sb.append(this.spaceQuota);
    first = false;
    if (isSetTopicNumberQuota()) {
      if (!first) sb.append(", ");
      sb.append("topicNumberQuota:");
      sb.append(this.topicNumberQuota);
      first = false;
    }
    if (isSetPartitionNumberQuota()) {
      if (!first) sb.append(", ");
      sb.append("partitionNumberQuota:");
      sb.append(this.partitionNumberQuota);
      first = false;
    }
    if (isSetCreateTopicQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("createTopicQpsQuota:");
      sb.append(this.createTopicQpsQuota);
      first = false;
    }
    if (isSetDeleteTopicQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("deleteTopicQpsQuota:");
      sb.append(this.deleteTopicQpsQuota);
      first = false;
    }
    if (isSetDescribeTopicQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("describeTopicQpsQuota:");
      sb.append(this.describeTopicQpsQuota);
      first = false;
    }
    if (isSetListTopicsQpsQuota()) {
      if (!first) sb.append(", ");
      sb.append("listTopicsQpsQuota:");
      sb.append(this.listTopicsQpsQuota);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'spaceQuota' because it's a primitive and you chose the non-beans generator.
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

  private static class UserQuotaStandardSchemeFactory implements SchemeFactory {
    public UserQuotaStandardScheme getScheme() {
      return new UserQuotaStandardScheme();
    }
  }

  private static class UserQuotaStandardScheme extends StandardScheme<UserQuota> {

    public void read(libthrift091.protocol.TProtocol iprot, UserQuota struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPACE_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.spaceQuota = iprot.readI64();
              struct.setSpaceQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_NUMBER_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.topicNumberQuota = iprot.readI32();
              struct.setTopicNumberQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_NUMBER_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionNumberQuota = iprot.readI32();
              struct.setPartitionNumberQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATE_TOPIC_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.createTopicQpsQuota = iprot.readI32();
              struct.setCreateTopicQpsQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DELETE_TOPIC_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.deleteTopicQpsQuota = iprot.readI32();
              struct.setDeleteTopicQpsQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESCRIBE_TOPIC_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.describeTopicQpsQuota = iprot.readI32();
              struct.setDescribeTopicQpsQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LIST_TOPICS_QPS_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.listTopicsQpsQuota = iprot.readI32();
              struct.setListTopicsQpsQuotaIsSet(true);
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
      if (!struct.isSetSpaceQuota()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'spaceQuota' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, UserQuota struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SPACE_QUOTA_FIELD_DESC);
      oprot.writeI64(struct.spaceQuota);
      oprot.writeFieldEnd();
      if (struct.isSetTopicNumberQuota()) {
        oprot.writeFieldBegin(TOPIC_NUMBER_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.topicNumberQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPartitionNumberQuota()) {
        oprot.writeFieldBegin(PARTITION_NUMBER_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.partitionNumberQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreateTopicQpsQuota()) {
        oprot.writeFieldBegin(CREATE_TOPIC_QPS_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.createTopicQpsQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDeleteTopicQpsQuota()) {
        oprot.writeFieldBegin(DELETE_TOPIC_QPS_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.deleteTopicQpsQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDescribeTopicQpsQuota()) {
        oprot.writeFieldBegin(DESCRIBE_TOPIC_QPS_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.describeTopicQpsQuota);
        oprot.writeFieldEnd();
      }
      if (struct.isSetListTopicsQpsQuota()) {
        oprot.writeFieldBegin(LIST_TOPICS_QPS_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.listTopicsQpsQuota);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserQuotaTupleSchemeFactory implements SchemeFactory {
    public UserQuotaTupleScheme getScheme() {
      return new UserQuotaTupleScheme();
    }
  }

  private static class UserQuotaTupleScheme extends TupleScheme<UserQuota> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, UserQuota struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.spaceQuota);
      BitSet optionals = new BitSet();
      if (struct.isSetTopicNumberQuota()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionNumberQuota()) {
        optionals.set(1);
      }
      if (struct.isSetCreateTopicQpsQuota()) {
        optionals.set(2);
      }
      if (struct.isSetDeleteTopicQpsQuota()) {
        optionals.set(3);
      }
      if (struct.isSetDescribeTopicQpsQuota()) {
        optionals.set(4);
      }
      if (struct.isSetListTopicsQpsQuota()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTopicNumberQuota()) {
        oprot.writeI32(struct.topicNumberQuota);
      }
      if (struct.isSetPartitionNumberQuota()) {
        oprot.writeI32(struct.partitionNumberQuota);
      }
      if (struct.isSetCreateTopicQpsQuota()) {
        oprot.writeI32(struct.createTopicQpsQuota);
      }
      if (struct.isSetDeleteTopicQpsQuota()) {
        oprot.writeI32(struct.deleteTopicQpsQuota);
      }
      if (struct.isSetDescribeTopicQpsQuota()) {
        oprot.writeI32(struct.describeTopicQpsQuota);
      }
      if (struct.isSetListTopicsQpsQuota()) {
        oprot.writeI32(struct.listTopicsQpsQuota);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, UserQuota struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.spaceQuota = iprot.readI64();
      struct.setSpaceQuotaIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.topicNumberQuota = iprot.readI32();
        struct.setTopicNumberQuotaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.partitionNumberQuota = iprot.readI32();
        struct.setPartitionNumberQuotaIsSet(true);
      }
      if (incoming.get(2)) {
        struct.createTopicQpsQuota = iprot.readI32();
        struct.setCreateTopicQpsQuotaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.deleteTopicQpsQuota = iprot.readI32();
        struct.setDeleteTopicQpsQuotaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.describeTopicQpsQuota = iprot.readI32();
        struct.setDescribeTopicQpsQuotaIsSet(true);
      }
      if (incoming.get(5)) {
        struct.listTopicsQpsQuota = iprot.readI32();
        struct.setListTopicsQpsQuotaIsSet(true);
      }
    }
  }

}

