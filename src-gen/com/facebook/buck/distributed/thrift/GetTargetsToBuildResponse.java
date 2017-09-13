/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-18")
public class GetTargetsToBuildResponse implements org.apache.thrift.TBase<GetTargetsToBuildResponse, GetTargetsToBuildResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetTargetsToBuildResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTargetsToBuildResponse");

  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BUILD_TARGETS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildTargets", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetTargetsToBuildResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetTargetsToBuildResponseTupleSchemeFactory();

  /**
   * 
   * @see GetTargetsToBuildAction
   */
  public GetTargetsToBuildAction action; // optional
  public java.util.List<java.lang.String> buildTargets; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see GetTargetsToBuildAction
     */
    ACTION((short)1, "action"),
    BUILD_TARGETS((short)2, "buildTargets");

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
        case 1: // ACTION
          return ACTION;
        case 2: // BUILD_TARGETS
          return BUILD_TARGETS;
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
  private static final _Fields optionals[] = {_Fields.ACTION,_Fields.BUILD_TARGETS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GetTargetsToBuildAction.class)));
    tmpMap.put(_Fields.BUILD_TARGETS, new org.apache.thrift.meta_data.FieldMetaData("buildTargets", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTargetsToBuildResponse.class, metaDataMap);
  }

  public GetTargetsToBuildResponse() {
    this.action = com.facebook.buck.distributed.thrift.GetTargetsToBuildAction.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetTargetsToBuildResponse(GetTargetsToBuildResponse other) {
    if (other.isSetAction()) {
      this.action = other.action;
    }
    if (other.isSetBuildTargets()) {
      java.util.List<java.lang.String> __this__buildTargets = new java.util.ArrayList<java.lang.String>(other.buildTargets);
      this.buildTargets = __this__buildTargets;
    }
  }

  public GetTargetsToBuildResponse deepCopy() {
    return new GetTargetsToBuildResponse(this);
  }

  @Override
  public void clear() {
    this.action = com.facebook.buck.distributed.thrift.GetTargetsToBuildAction.UNKNOWN;

    this.buildTargets = null;
  }

  /**
   * 
   * @see GetTargetsToBuildAction
   */
  public GetTargetsToBuildAction getAction() {
    return this.action;
  }

  /**
   * 
   * @see GetTargetsToBuildAction
   */
  public GetTargetsToBuildResponse setAction(GetTargetsToBuildAction action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public int getBuildTargetsSize() {
    return (this.buildTargets == null) ? 0 : this.buildTargets.size();
  }

  public java.util.Iterator<java.lang.String> getBuildTargetsIterator() {
    return (this.buildTargets == null) ? null : this.buildTargets.iterator();
  }

  public void addToBuildTargets(java.lang.String elem) {
    if (this.buildTargets == null) {
      this.buildTargets = new java.util.ArrayList<java.lang.String>();
    }
    this.buildTargets.add(elem);
  }

  public java.util.List<java.lang.String> getBuildTargets() {
    return this.buildTargets;
  }

  public GetTargetsToBuildResponse setBuildTargets(java.util.List<java.lang.String> buildTargets) {
    this.buildTargets = buildTargets;
    return this;
  }

  public void unsetBuildTargets() {
    this.buildTargets = null;
  }

  /** Returns true if field buildTargets is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildTargets() {
    return this.buildTargets != null;
  }

  public void setBuildTargetsIsSet(boolean value) {
    if (!value) {
      this.buildTargets = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((GetTargetsToBuildAction)value);
      }
      break;

    case BUILD_TARGETS:
      if (value == null) {
        unsetBuildTargets();
      } else {
        setBuildTargets((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION:
      return getAction();

    case BUILD_TARGETS:
      return getBuildTargets();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ACTION:
      return isSetAction();
    case BUILD_TARGETS:
      return isSetBuildTargets();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetTargetsToBuildResponse)
      return this.equals((GetTargetsToBuildResponse)that);
    return false;
  }

  public boolean equals(GetTargetsToBuildResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_buildTargets = true && this.isSetBuildTargets();
    boolean that_present_buildTargets = true && that.isSetBuildTargets();
    if (this_present_buildTargets || that_present_buildTargets) {
      if (!(this_present_buildTargets && that_present_buildTargets))
        return false;
      if (!this.buildTargets.equals(that.buildTargets))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAction()) ? 131071 : 524287);
    if (isSetAction())
      hashCode = hashCode * 8191 + action.getValue();

    hashCode = hashCode * 8191 + ((isSetBuildTargets()) ? 131071 : 524287);
    if (isSetBuildTargets())
      hashCode = hashCode * 8191 + buildTargets.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetTargetsToBuildResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBuildTargets()).compareTo(other.isSetBuildTargets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildTargets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildTargets, other.buildTargets);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetTargetsToBuildResponse(");
    boolean first = true;

    if (isSetAction()) {
      sb.append("action:");
      if (this.action == null) {
        sb.append("null");
      } else {
        sb.append(this.action);
      }
      first = false;
    }
    if (isSetBuildTargets()) {
      if (!first) sb.append(", ");
      sb.append("buildTargets:");
      if (this.buildTargets == null) {
        sb.append("null");
      } else {
        sb.append(this.buildTargets);
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

  private static class GetTargetsToBuildResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetTargetsToBuildResponseStandardScheme getScheme() {
      return new GetTargetsToBuildResponseStandardScheme();
    }
  }

  private static class GetTargetsToBuildResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetTargetsToBuildResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetTargetsToBuildResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = com.facebook.buck.distributed.thrift.GetTargetsToBuildAction.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUILD_TARGETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.buildTargets = new java.util.ArrayList<java.lang.String>(_list0.size);
                java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.buildTargets.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setBuildTargetsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetTargetsToBuildResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action != null) {
        if (struct.isSetAction()) {
          oprot.writeFieldBegin(ACTION_FIELD_DESC);
          oprot.writeI32(struct.action.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildTargets != null) {
        if (struct.isSetBuildTargets()) {
          oprot.writeFieldBegin(BUILD_TARGETS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.buildTargets.size()));
            for (java.lang.String _iter3 : struct.buildTargets)
            {
              oprot.writeString(_iter3);
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

  private static class GetTargetsToBuildResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetTargetsToBuildResponseTupleScheme getScheme() {
      return new GetTargetsToBuildResponseTupleScheme();
    }
  }

  private static class GetTargetsToBuildResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetTargetsToBuildResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetTargetsToBuildResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAction()) {
        optionals.set(0);
      }
      if (struct.isSetBuildTargets()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAction()) {
        oprot.writeI32(struct.action.getValue());
      }
      if (struct.isSetBuildTargets()) {
        {
          oprot.writeI32(struct.buildTargets.size());
          for (java.lang.String _iter4 : struct.buildTargets)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetTargetsToBuildResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.action = com.facebook.buck.distributed.thrift.GetTargetsToBuildAction.findByValue(iprot.readI32());
        struct.setActionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.buildTargets = new java.util.ArrayList<java.lang.String>(_list5.size);
          java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.buildTargets.add(_elem6);
          }
        }
        struct.setBuildTargetsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
