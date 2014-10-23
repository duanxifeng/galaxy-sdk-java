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
 * 表元信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-9")
public class TableMetadata implements libthrift091.TBase<TableMetadata, TableMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<TableMetadata> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TableMetadata");

  private static final libthrift091.protocol.TField TABLE_ID_FIELD_DESC = new libthrift091.protocol.TField("tableId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField APP_ACL_FIELD_DESC = new libthrift091.protocol.TField("appAcl", libthrift091.protocol.TType.MAP, (short)3);
  private static final libthrift091.protocol.TField QUOTA_FIELD_DESC = new libthrift091.protocol.TField("quota", libthrift091.protocol.TType.STRUCT, (short)4);
  private static final libthrift091.protocol.TField THROUGHPUT_FIELD_DESC = new libthrift091.protocol.TField("throughput", libthrift091.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableMetadataTupleSchemeFactory());
  }

  /**
   * 表ID
   * 仅作为输出值，作为输入时无需指定
   */
  public String tableId; // optional
  /**
   * 所有者的开发者ID，
   * 对于CreateTable/AlterTable，值不设置时，默认为当前登录用户。
   */
  public String developerId; // optional
  /**
   * 权限控制设置
   */
  public Map<String,List<CannedAcl>> appAcl; // optional
  /**
   * 空间配额
   */
  public TableQuota quota; // optional
  /**
   * 吞吐量配额
   */
  public ProvisionThroughput throughput; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表ID
     * 仅作为输出值，作为输入时无需指定
     */
    TABLE_ID((short)1, "tableId"),
    /**
     * 所有者的开发者ID，
     * 对于CreateTable/AlterTable，值不设置时，默认为当前登录用户。
     */
    DEVELOPER_ID((short)2, "developerId"),
    /**
     * 权限控制设置
     */
    APP_ACL((short)3, "appAcl"),
    /**
     * 空间配额
     */
    QUOTA((short)4, "quota"),
    /**
     * 吞吐量配额
     */
    THROUGHPUT((short)5, "throughput");

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
        case 1: // TABLE_ID
          return TABLE_ID;
        case 2: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 3: // APP_ACL
          return APP_ACL;
        case 4: // QUOTA
          return QUOTA;
        case 5: // THROUGHPUT
          return THROUGHPUT;
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
  private static final _Fields optionals[] = {_Fields.TABLE_ID,_Fields.DEVELOPER_ID,_Fields.APP_ACL,_Fields.QUOTA,_Fields.THROUGHPUT};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_ID, new libthrift091.meta_data.FieldMetaData("tableId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_ACL, new libthrift091.meta_data.FieldMetaData("appAcl", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "AclConf")));
    tmpMap.put(_Fields.QUOTA, new libthrift091.meta_data.FieldMetaData("quota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TableQuota.class)));
    tmpMap.put(_Fields.THROUGHPUT, new libthrift091.meta_data.FieldMetaData("throughput", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, ProvisionThroughput.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TableMetadata.class, metaDataMap);
  }

  public TableMetadata() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableMetadata(TableMetadata other) {
    if (other.isSetTableId()) {
      this.tableId = other.tableId;
    }
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetAppAcl()) {
      this.appAcl = other.appAcl;
    }
    if (other.isSetQuota()) {
      this.quota = new TableQuota(other.quota);
    }
    if (other.isSetThroughput()) {
      this.throughput = new ProvisionThroughput(other.throughput);
    }
  }

  public TableMetadata deepCopy() {
    return new TableMetadata(this);
  }

  @Override
  public void clear() {
    this.tableId = null;
    this.developerId = null;
    this.appAcl = null;
    this.quota = null;
    this.throughput = null;
  }

  /**
   * 表ID
   * 仅作为输出值，作为输入时无需指定
   */
  public String getTableId() {
    return this.tableId;
  }

  /**
   * 表ID
   * 仅作为输出值，作为输入时无需指定
   */
  public TableMetadata setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public void unsetTableId() {
    this.tableId = null;
  }

  /** Returns true if field tableId is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return this.tableId != null;
  }

  public void setTableIdIsSet(boolean value) {
    if (!value) {
      this.tableId = null;
    }
  }

  /**
   * 所有者的开发者ID，
   * 对于CreateTable/AlterTable，值不设置时，默认为当前登录用户。
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * 所有者的开发者ID，
   * 对于CreateTable/AlterTable，值不设置时，默认为当前登录用户。
   */
  public TableMetadata setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  public int getAppAclSize() {
    return (this.appAcl == null) ? 0 : this.appAcl.size();
  }

  public void putToAppAcl(String key, List<CannedAcl> val) {
    if (this.appAcl == null) {
      this.appAcl = new HashMap<String,List<CannedAcl>>();
    }
    this.appAcl.put(key, val);
  }

  /**
   * 权限控制设置
   */
  public Map<String,List<CannedAcl>> getAppAcl() {
    return this.appAcl;
  }

  /**
   * 权限控制设置
   */
  public TableMetadata setAppAcl(Map<String,List<CannedAcl>> appAcl) {
    this.appAcl = appAcl;
    return this;
  }

  public void unsetAppAcl() {
    this.appAcl = null;
  }

  /** Returns true if field appAcl is set (has been assigned a value) and false otherwise */
  public boolean isSetAppAcl() {
    return this.appAcl != null;
  }

  public void setAppAclIsSet(boolean value) {
    if (!value) {
      this.appAcl = null;
    }
  }

  /**
   * 空间配额
   */
  public TableQuota getQuota() {
    return this.quota;
  }

  /**
   * 空间配额
   */
  public TableMetadata setQuota(TableQuota quota) {
    this.quota = quota;
    return this;
  }

  public void unsetQuota() {
    this.quota = null;
  }

  /** Returns true if field quota is set (has been assigned a value) and false otherwise */
  public boolean isSetQuota() {
    return this.quota != null;
  }

  public void setQuotaIsSet(boolean value) {
    if (!value) {
      this.quota = null;
    }
  }

  /**
   * 吞吐量配额
   */
  public ProvisionThroughput getThroughput() {
    return this.throughput;
  }

  /**
   * 吞吐量配额
   */
  public TableMetadata setThroughput(ProvisionThroughput throughput) {
    this.throughput = throughput;
    return this;
  }

  public void unsetThroughput() {
    this.throughput = null;
  }

  /** Returns true if field throughput is set (has been assigned a value) and false otherwise */
  public boolean isSetThroughput() {
    return this.throughput != null;
  }

  public void setThroughputIsSet(boolean value) {
    if (!value) {
      this.throughput = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((String)value);
      }
      break;

    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case APP_ACL:
      if (value == null) {
        unsetAppAcl();
      } else {
        setAppAcl((Map<String,List<CannedAcl>>)value);
      }
      break;

    case QUOTA:
      if (value == null) {
        unsetQuota();
      } else {
        setQuota((TableQuota)value);
      }
      break;

    case THROUGHPUT:
      if (value == null) {
        unsetThroughput();
      } else {
        setThroughput((ProvisionThroughput)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_ID:
      return getTableId();

    case DEVELOPER_ID:
      return getDeveloperId();

    case APP_ACL:
      return getAppAcl();

    case QUOTA:
      return getQuota();

    case THROUGHPUT:
      return getThroughput();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_ID:
      return isSetTableId();
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case APP_ACL:
      return isSetAppAcl();
    case QUOTA:
      return isSetQuota();
    case THROUGHPUT:
      return isSetThroughput();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableMetadata)
      return this.equals((TableMetadata)that);
    return false;
  }

  public boolean equals(TableMetadata that) {
    if (that == null)
      return false;

    boolean this_present_tableId = true && this.isSetTableId();
    boolean that_present_tableId = true && that.isSetTableId();
    if (this_present_tableId || that_present_tableId) {
      if (!(this_present_tableId && that_present_tableId))
        return false;
      if (!this.tableId.equals(that.tableId))
        return false;
    }

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_appAcl = true && this.isSetAppAcl();
    boolean that_present_appAcl = true && that.isSetAppAcl();
    if (this_present_appAcl || that_present_appAcl) {
      if (!(this_present_appAcl && that_present_appAcl))
        return false;
      if (!this.appAcl.equals(that.appAcl))
        return false;
    }

    boolean this_present_quota = true && this.isSetQuota();
    boolean that_present_quota = true && that.isSetQuota();
    if (this_present_quota || that_present_quota) {
      if (!(this_present_quota && that_present_quota))
        return false;
      if (!this.quota.equals(that.quota))
        return false;
    }

    boolean this_present_throughput = true && this.isSetThroughput();
    boolean that_present_throughput = true && that.isSetThroughput();
    if (this_present_throughput || that_present_throughput) {
      if (!(this_present_throughput && that_present_throughput))
        return false;
      if (!this.throughput.equals(that.throughput))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableId = true && (isSetTableId());
    list.add(present_tableId);
    if (present_tableId)
      list.add(tableId);

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_appAcl = true && (isSetAppAcl());
    list.add(present_appAcl);
    if (present_appAcl)
      list.add(appAcl);

    boolean present_quota = true && (isSetQuota());
    list.add(present_quota);
    if (present_quota)
      list.add(quota);

    boolean present_throughput = true && (isSetThroughput());
    list.add(present_throughput);
    if (present_throughput)
      list.add(throughput);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableId()).compareTo(other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableId, other.tableId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppAcl()).compareTo(other.isSetAppAcl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppAcl()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.appAcl, other.appAcl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuota()).compareTo(other.isSetQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.quota, other.quota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThroughput()).compareTo(other.isSetThroughput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThroughput()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throughput, other.throughput);
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
    StringBuilder sb = new StringBuilder("TableMetadata(");
    boolean first = true;

    if (isSetTableId()) {
      sb.append("tableId:");
      if (this.tableId == null) {
        sb.append("null");
      } else {
        sb.append(this.tableId);
      }
      first = false;
    }
    if (isSetDeveloperId()) {
      if (!first) sb.append(", ");
      sb.append("developerId:");
      if (this.developerId == null) {
        sb.append("null");
      } else {
        sb.append(this.developerId);
      }
      first = false;
    }
    if (isSetAppAcl()) {
      if (!first) sb.append(", ");
      sb.append("appAcl:");
      if (this.appAcl == null) {
        sb.append("null");
      } else {
        sb.append(this.appAcl);
      }
      first = false;
    }
    if (isSetQuota()) {
      if (!first) sb.append(", ");
      sb.append("quota:");
      if (this.quota == null) {
        sb.append("null");
      } else {
        sb.append(this.quota);
      }
      first = false;
    }
    if (isSetThroughput()) {
      if (!first) sb.append(", ");
      sb.append("throughput:");
      if (this.throughput == null) {
        sb.append("null");
      } else {
        sb.append(this.throughput);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (quota != null) {
      quota.validate();
    }
    if (throughput != null) {
      throughput.validate();
    }
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

  private static class TableMetadataStandardSchemeFactory implements SchemeFactory {
    public TableMetadataStandardScheme getScheme() {
      return new TableMetadataStandardScheme();
    }
  }

  private static class TableMetadataStandardScheme extends StandardScheme<TableMetadata> {

    public void read(libthrift091.protocol.TProtocol iprot, TableMetadata struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableId = iprot.readString();
              struct.setTableIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APP_ACL
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map116 = iprot.readMapBegin();
                struct.appAcl = new HashMap<String,List<CannedAcl>>(2*_map116.size);
                String _key117;
                List<CannedAcl> _val118;
                for (int _i119 = 0; _i119 < _map116.size; ++_i119)
                {
                  _key117 = iprot.readString();
                  {
                    libthrift091.protocol.TList _list120 = iprot.readListBegin();
                    _val118 = new ArrayList<CannedAcl>(_list120.size);
                    CannedAcl _elem121;
                    for (int _i122 = 0; _i122 < _list120.size; ++_i122)
                    {
                      _elem121 = com.xiaomi.infra.galaxy.sds.thrift.CannedAcl.findByValue(iprot.readI32());
                      _val118.add(_elem121);
                    }
                    iprot.readListEnd();
                  }
                  struct.appAcl.put(_key117, _val118);
                }
                iprot.readMapEnd();
              }
              struct.setAppAclIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.quota = new TableQuota();
              struct.quota.read(iprot);
              struct.setQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // THROUGHPUT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.throughput = new ProvisionThroughput();
              struct.throughput.read(iprot);
              struct.setThroughputIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TableMetadata struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableId != null) {
        if (struct.isSetTableId()) {
          oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
          oprot.writeString(struct.tableId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.developerId != null) {
        if (struct.isSetDeveloperId()) {
          oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
          oprot.writeString(struct.developerId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.appAcl != null) {
        if (struct.isSetAppAcl()) {
          oprot.writeFieldBegin(APP_ACL_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.LIST, struct.appAcl.size()));
            for (Map.Entry<String, List<CannedAcl>> _iter123 : struct.appAcl.entrySet())
            {
              oprot.writeString(_iter123.getKey());
              {
                oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, _iter123.getValue().size()));
                for (CannedAcl _iter124 : _iter123.getValue())
                {
                  oprot.writeI32(_iter124.getValue());
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.quota != null) {
        if (struct.isSetQuota()) {
          oprot.writeFieldBegin(QUOTA_FIELD_DESC);
          struct.quota.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.throughput != null) {
        if (struct.isSetThroughput()) {
          oprot.writeFieldBegin(THROUGHPUT_FIELD_DESC);
          struct.throughput.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableMetadataTupleSchemeFactory implements SchemeFactory {
    public TableMetadataTupleScheme getScheme() {
      return new TableMetadataTupleScheme();
    }
  }

  private static class TableMetadataTupleScheme extends TupleScheme<TableMetadata> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TableMetadata struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableId()) {
        optionals.set(0);
      }
      if (struct.isSetDeveloperId()) {
        optionals.set(1);
      }
      if (struct.isSetAppAcl()) {
        optionals.set(2);
      }
      if (struct.isSetQuota()) {
        optionals.set(3);
      }
      if (struct.isSetThroughput()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTableId()) {
        oprot.writeString(struct.tableId);
      }
      if (struct.isSetDeveloperId()) {
        oprot.writeString(struct.developerId);
      }
      if (struct.isSetAppAcl()) {
        {
          oprot.writeI32(struct.appAcl.size());
          for (Map.Entry<String, List<CannedAcl>> _iter125 : struct.appAcl.entrySet())
          {
            oprot.writeString(_iter125.getKey());
            {
              oprot.writeI32(_iter125.getValue().size());
              for (CannedAcl _iter126 : _iter125.getValue())
              {
                oprot.writeI32(_iter126.getValue());
              }
            }
          }
        }
      }
      if (struct.isSetQuota()) {
        struct.quota.write(oprot);
      }
      if (struct.isSetThroughput()) {
        struct.throughput.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TableMetadata struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tableId = iprot.readString();
        struct.setTableIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.developerId = iprot.readString();
        struct.setDeveloperIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map127 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.LIST, iprot.readI32());
          struct.appAcl = new HashMap<String,List<CannedAcl>>(2*_map127.size);
          String _key128;
          List<CannedAcl> _val129;
          for (int _i130 = 0; _i130 < _map127.size; ++_i130)
          {
            _key128 = iprot.readString();
            {
              libthrift091.protocol.TList _list131 = new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, iprot.readI32());
              _val129 = new ArrayList<CannedAcl>(_list131.size);
              CannedAcl _elem132;
              for (int _i133 = 0; _i133 < _list131.size; ++_i133)
              {
                _elem132 = com.xiaomi.infra.galaxy.sds.thrift.CannedAcl.findByValue(iprot.readI32());
                _val129.add(_elem132);
              }
            }
            struct.appAcl.put(_key128, _val129);
          }
        }
        struct.setAppAclIsSet(true);
      }
      if (incoming.get(3)) {
        struct.quota = new TableQuota();
        struct.quota.read(iprot);
        struct.setQuotaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.throughput = new ProvisionThroughput();
        struct.throughput.read(iprot);
        struct.setThroughputIsSet(true);
      }
    }
  }

}

