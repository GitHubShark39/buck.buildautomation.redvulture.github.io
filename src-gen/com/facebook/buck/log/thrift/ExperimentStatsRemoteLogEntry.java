/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.log.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-18")
public class ExperimentStatsRemoteLogEntry implements org.apache.thrift.TBase<ExperimentStatsRemoteLogEntry, ExperimentStatsRemoteLogEntry._Fields>, java.io.Serializable, Cloneable, Comparable<ExperimentStatsRemoteLogEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExperimentStatsRemoteLogEntry");

  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VARIANT_FIELD_DESC = new org.apache.thrift.protocol.TField("variant", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROPERTY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("propertyName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExperimentStatsRemoteLogEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExperimentStatsRemoteLogEntryTupleSchemeFactory();

  public java.lang.String tag; // required
  public java.lang.String variant; // required
  public java.lang.String propertyName; // required
  public long value; // optional
  public java.lang.String content; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TAG((short)1, "tag"),
    VARIANT((short)2, "variant"),
    PROPERTY_NAME((short)3, "propertyName"),
    VALUE((short)4, "value"),
    CONTENT((short)5, "content");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TAG
          return TAG;
        case 2: // VARIANT
          return VARIANT;
        case 3: // PROPERTY_NAME
          return PROPERTY_NAME;
        case 4: // VALUE
          return VALUE;
        case 5: // CONTENT
          return CONTENT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VALUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VALUE,_Fields.CONTENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VARIANT, new org.apache.thrift.meta_data.FieldMetaData("variant", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROPERTY_NAME, new org.apache.thrift.meta_data.FieldMetaData("propertyName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExperimentStatsRemoteLogEntry.class, metaDataMap);
  }

  public ExperimentStatsRemoteLogEntry() {
  }

  public ExperimentStatsRemoteLogEntry(
    java.lang.String tag,
    java.lang.String variant,
    java.lang.String propertyName)
  {
    this();
    this.tag = tag;
    this.variant = variant;
    this.propertyName = propertyName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExperimentStatsRemoteLogEntry(ExperimentStatsRemoteLogEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
    if (other.isSetVariant()) {
      this.variant = other.variant;
    }
    if (other.isSetPropertyName()) {
      this.propertyName = other.propertyName;
    }
    this.value = other.value;
    if (other.isSetContent()) {
      this.content = other.content;
    }
  }

  public ExperimentStatsRemoteLogEntry deepCopy() {
    return new ExperimentStatsRemoteLogEntry(this);
  }

  @Override
  public void clear() {
    this.tag = null;
    this.variant = null;
    this.propertyName = null;
    setValueIsSet(false);
    this.value = 0;
    this.content = null;
  }

  public java.lang.String getTag() {
    return this.tag;
  }

  public ExperimentStatsRemoteLogEntry setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  public java.lang.String getVariant() {
    return this.variant;
  }

  public ExperimentStatsRemoteLogEntry setVariant(java.lang.String variant) {
    this.variant = variant;
    return this;
  }

  public void unsetVariant() {
    this.variant = null;
  }

  /** Returns true if field variant is set (has been assigned a value) and false otherwise */
  public boolean isSetVariant() {
    return this.variant != null;
  }

  public void setVariantIsSet(boolean value) {
    if (!value) {
      this.variant = null;
    }
  }

  public java.lang.String getPropertyName() {
    return this.propertyName;
  }

  public ExperimentStatsRemoteLogEntry setPropertyName(java.lang.String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  public void unsetPropertyName() {
    this.propertyName = null;
  }

  /** Returns true if field propertyName is set (has been assigned a value) and false otherwise */
  public boolean isSetPropertyName() {
    return this.propertyName != null;
  }

  public void setPropertyNameIsSet(boolean value) {
    if (!value) {
      this.propertyName = null;
    }
  }

  public long getValue() {
    return this.value;
  }

  public ExperimentStatsRemoteLogEntry setValue(long value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public ExperimentStatsRemoteLogEntry setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((java.lang.String)value);
      }
      break;

    case VARIANT:
      if (value == null) {
        unsetVariant();
      } else {
        setVariant((java.lang.String)value);
      }
      break;

    case PROPERTY_NAME:
      if (value == null) {
        unsetPropertyName();
      } else {
        setPropertyName((java.lang.String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.Long)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TAG:
      return getTag();

    case VARIANT:
      return getVariant();

    case PROPERTY_NAME:
      return getPropertyName();

    case VALUE:
      return getValue();

    case CONTENT:
      return getContent();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TAG:
      return isSetTag();
    case VARIANT:
      return isSetVariant();
    case PROPERTY_NAME:
      return isSetPropertyName();
    case VALUE:
      return isSetValue();
    case CONTENT:
      return isSetContent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ExperimentStatsRemoteLogEntry)
      return this.equals((ExperimentStatsRemoteLogEntry)that);
    return false;
  }

  public boolean equals(ExperimentStatsRemoteLogEntry that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    boolean this_present_variant = true && this.isSetVariant();
    boolean that_present_variant = true && that.isSetVariant();
    if (this_present_variant || that_present_variant) {
      if (!(this_present_variant && that_present_variant))
        return false;
      if (!this.variant.equals(that.variant))
        return false;
    }

    boolean this_present_propertyName = true && this.isSetPropertyName();
    boolean that_present_propertyName = true && that.isSetPropertyName();
    if (this_present_propertyName || that_present_propertyName) {
      if (!(this_present_propertyName && that_present_propertyName))
        return false;
      if (!this.propertyName.equals(that.propertyName))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTag()) ? 131071 : 524287);
    if (isSetTag())
      hashCode = hashCode * 8191 + tag.hashCode();

    hashCode = hashCode * 8191 + ((isSetVariant()) ? 131071 : 524287);
    if (isSetVariant())
      hashCode = hashCode * 8191 + variant.hashCode();

    hashCode = hashCode * 8191 + ((isSetPropertyName()) ? 131071 : 524287);
    if (isSetPropertyName())
      hashCode = hashCode * 8191 + propertyName.hashCode();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(value);

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExperimentStatsRemoteLogEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVariant()).compareTo(other.isSetVariant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVariant()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.variant, other.variant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPropertyName()).compareTo(other.isSetPropertyName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropertyName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propertyName, other.propertyName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperimentStatsRemoteLogEntry(");
    boolean first = true;

    sb.append("tag:");
    if (this.tag == null) {
      sb.append("null");
    } else {
      sb.append(this.tag);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("variant:");
    if (this.variant == null) {
      sb.append("null");
    } else {
      sb.append(this.variant);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("propertyName:");
    if (this.propertyName == null) {
      sb.append("null");
    } else {
      sb.append(this.propertyName);
    }
    first = false;
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      sb.append(this.value);
      first = false;
    }
    if (isSetContent()) {
      if (!first) sb.append(", ");
      sb.append("content:");
      if (this.content == null) {
        sb.append("null");
      } else {
        sb.append(this.content);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExperimentStatsRemoteLogEntryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExperimentStatsRemoteLogEntryStandardScheme getScheme() {
      return new ExperimentStatsRemoteLogEntryStandardScheme();
    }
  }

  private static class ExperimentStatsRemoteLogEntryStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExperimentStatsRemoteLogEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExperimentStatsRemoteLogEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VARIANT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.variant = iprot.readString();
              struct.setVariantIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROPERTY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.propertyName = iprot.readString();
              struct.setPropertyNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.value = iprot.readI64();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExperimentStatsRemoteLogEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tag != null) {
        oprot.writeFieldBegin(TAG_FIELD_DESC);
        oprot.writeString(struct.tag);
        oprot.writeFieldEnd();
      }
      if (struct.variant != null) {
        oprot.writeFieldBegin(VARIANT_FIELD_DESC);
        oprot.writeString(struct.variant);
        oprot.writeFieldEnd();
      }
      if (struct.propertyName != null) {
        oprot.writeFieldBegin(PROPERTY_NAME_FIELD_DESC);
        oprot.writeString(struct.propertyName);
        oprot.writeFieldEnd();
      }
      if (struct.isSetValue()) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeI64(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        if (struct.isSetContent()) {
          oprot.writeFieldBegin(CONTENT_FIELD_DESC);
          oprot.writeString(struct.content);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExperimentStatsRemoteLogEntryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExperimentStatsRemoteLogEntryTupleScheme getScheme() {
      return new ExperimentStatsRemoteLogEntryTupleScheme();
    }
  }

  private static class ExperimentStatsRemoteLogEntryTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExperimentStatsRemoteLogEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExperimentStatsRemoteLogEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTag()) {
        optionals.set(0);
      }
      if (struct.isSetVariant()) {
        optionals.set(1);
      }
      if (struct.isSetPropertyName()) {
        optionals.set(2);
      }
      if (struct.isSetValue()) {
        optionals.set(3);
      }
      if (struct.isSetContent()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
      if (struct.isSetVariant()) {
        oprot.writeString(struct.variant);
      }
      if (struct.isSetPropertyName()) {
        oprot.writeString(struct.propertyName);
      }
      if (struct.isSetValue()) {
        oprot.writeI64(struct.value);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExperimentStatsRemoteLogEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
      if (incoming.get(1)) {
        struct.variant = iprot.readString();
        struct.setVariantIsSet(true);
      }
      if (incoming.get(2)) {
        struct.propertyName = iprot.readString();
        struct.setPropertyNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.value = iprot.readI64();
        struct.setValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

