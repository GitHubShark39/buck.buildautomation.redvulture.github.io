/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-01")
public class CASContainsRequest implements org.apache.thrift.TBase<CASContainsRequest, CASContainsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CASContainsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CASContainsRequest");

  private static final org.apache.thrift.protocol.TField CONTENT_SHA1S_FIELD_DESC = new org.apache.thrift.protocol.TField("contentSha1s", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CASContainsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CASContainsRequestTupleSchemeFactory();

  public java.util.List<java.lang.String> contentSha1s; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTENT_SHA1S((short)1, "contentSha1s");

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
        case 1: // CONTENT_SHA1S
          return CONTENT_SHA1S;
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
  private static final _Fields optionals[] = {_Fields.CONTENT_SHA1S};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTENT_SHA1S, new org.apache.thrift.meta_data.FieldMetaData("contentSha1s", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CASContainsRequest.class, metaDataMap);
  }

  public CASContainsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CASContainsRequest(CASContainsRequest other) {
    if (other.isSetContentSha1s()) {
      java.util.List<java.lang.String> __this__contentSha1s = new java.util.ArrayList<java.lang.String>(other.contentSha1s);
      this.contentSha1s = __this__contentSha1s;
    }
  }

  public CASContainsRequest deepCopy() {
    return new CASContainsRequest(this);
  }

  @Override
  public void clear() {
    this.contentSha1s = null;
  }

  public int getContentSha1sSize() {
    return (this.contentSha1s == null) ? 0 : this.contentSha1s.size();
  }

  public java.util.Iterator<java.lang.String> getContentSha1sIterator() {
    return (this.contentSha1s == null) ? null : this.contentSha1s.iterator();
  }

  public void addToContentSha1s(java.lang.String elem) {
    if (this.contentSha1s == null) {
      this.contentSha1s = new java.util.ArrayList<java.lang.String>();
    }
    this.contentSha1s.add(elem);
  }

  public java.util.List<java.lang.String> getContentSha1s() {
    return this.contentSha1s;
  }

  public CASContainsRequest setContentSha1s(java.util.List<java.lang.String> contentSha1s) {
    this.contentSha1s = contentSha1s;
    return this;
  }

  public void unsetContentSha1s() {
    this.contentSha1s = null;
  }

  /** Returns true if field contentSha1s is set (has been assigned a value) and false otherwise */
  public boolean isSetContentSha1s() {
    return this.contentSha1s != null;
  }

  public void setContentSha1sIsSet(boolean value) {
    if (!value) {
      this.contentSha1s = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CONTENT_SHA1S:
      if (value == null) {
        unsetContentSha1s();
      } else {
        setContentSha1s((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTENT_SHA1S:
      return getContentSha1s();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONTENT_SHA1S:
      return isSetContentSha1s();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CASContainsRequest)
      return this.equals((CASContainsRequest)that);
    return false;
  }

  public boolean equals(CASContainsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_contentSha1s = true && this.isSetContentSha1s();
    boolean that_present_contentSha1s = true && that.isSetContentSha1s();
    if (this_present_contentSha1s || that_present_contentSha1s) {
      if (!(this_present_contentSha1s && that_present_contentSha1s))
        return false;
      if (!this.contentSha1s.equals(that.contentSha1s))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetContentSha1s()) ? 131071 : 524287);
    if (isSetContentSha1s())
      hashCode = hashCode * 8191 + contentSha1s.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(CASContainsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetContentSha1s()).compareTo(other.isSetContentSha1s());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentSha1s()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentSha1s, other.contentSha1s);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CASContainsRequest(");
    boolean first = true;

    if (isSetContentSha1s()) {
      sb.append("contentSha1s:");
      if (this.contentSha1s == null) {
        sb.append("null");
      } else {
        sb.append(this.contentSha1s);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CASContainsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CASContainsRequestStandardScheme getScheme() {
      return new CASContainsRequestStandardScheme();
    }
  }

  private static class CASContainsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<CASContainsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CASContainsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTENT_SHA1S
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
                struct.contentSha1s = new java.util.ArrayList<java.lang.String>(_list58.size);
                java.lang.String _elem59;
                for (int _i60 = 0; _i60 < _list58.size; ++_i60)
                {
                  _elem59 = iprot.readString();
                  struct.contentSha1s.add(_elem59);
                }
                iprot.readListEnd();
              }
              struct.setContentSha1sIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CASContainsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.contentSha1s != null) {
        if (struct.isSetContentSha1s()) {
          oprot.writeFieldBegin(CONTENT_SHA1S_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.contentSha1s.size()));
            for (java.lang.String _iter61 : struct.contentSha1s)
            {
              oprot.writeString(_iter61);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CASContainsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CASContainsRequestTupleScheme getScheme() {
      return new CASContainsRequestTupleScheme();
    }
  }

  private static class CASContainsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<CASContainsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CASContainsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContentSha1s()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetContentSha1s()) {
        {
          oprot.writeI32(struct.contentSha1s.size());
          for (java.lang.String _iter62 : struct.contentSha1s)
          {
            oprot.writeString(_iter62);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CASContainsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list63 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.contentSha1s = new java.util.ArrayList<java.lang.String>(_list63.size);
          java.lang.String _elem64;
          for (int _i65 = 0; _i65 < _list63.size; ++_i65)
          {
            _elem64 = iprot.readString();
            struct.contentSha1s.add(_elem64);
          }
        }
        struct.setContentSha1sIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
