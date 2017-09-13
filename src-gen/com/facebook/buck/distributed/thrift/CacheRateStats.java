/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-01")
public class CacheRateStats implements org.apache.thrift.TBase<CacheRateStats, CacheRateStats._Fields>, java.io.Serializable, Cloneable, Comparable<CacheRateStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CacheRateStats");

  private static final org.apache.thrift.protocol.TField CACHE_HITS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheHitsCount", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CACHE_MISSES_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheMissesCount", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CACHE_IGNORES_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheIgnoresCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CACHE_ERRORS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheErrorsCount", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("cacheLocalKeyUnchangedHitsCount", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TOTAL_RULES_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalRulesCount", org.apache.thrift.protocol.TType.I32, (short)10);
  private static final org.apache.thrift.protocol.TField UPDATED_RULES_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedRulesCount", org.apache.thrift.protocol.TType.I32, (short)11);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CacheRateStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CacheRateStatsTupleSchemeFactory();

  public int cacheHitsCount; // optional
  public int cacheMissesCount; // optional
  public int cacheIgnoresCount; // optional
  public int cacheErrorsCount; // optional
  public int cacheLocalKeyUnchangedHitsCount; // optional
  public int totalRulesCount; // optional
  public int updatedRulesCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CACHE_HITS_COUNT((short)1, "cacheHitsCount"),
    CACHE_MISSES_COUNT((short)2, "cacheMissesCount"),
    CACHE_IGNORES_COUNT((short)3, "cacheIgnoresCount"),
    CACHE_ERRORS_COUNT((short)4, "cacheErrorsCount"),
    CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT((short)5, "cacheLocalKeyUnchangedHitsCount"),
    TOTAL_RULES_COUNT((short)10, "totalRulesCount"),
    UPDATED_RULES_COUNT((short)11, "updatedRulesCount");

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
        case 1: // CACHE_HITS_COUNT
          return CACHE_HITS_COUNT;
        case 2: // CACHE_MISSES_COUNT
          return CACHE_MISSES_COUNT;
        case 3: // CACHE_IGNORES_COUNT
          return CACHE_IGNORES_COUNT;
        case 4: // CACHE_ERRORS_COUNT
          return CACHE_ERRORS_COUNT;
        case 5: // CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT
          return CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT;
        case 10: // TOTAL_RULES_COUNT
          return TOTAL_RULES_COUNT;
        case 11: // UPDATED_RULES_COUNT
          return UPDATED_RULES_COUNT;
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
  private static final int __CACHEHITSCOUNT_ISSET_ID = 0;
  private static final int __CACHEMISSESCOUNT_ISSET_ID = 1;
  private static final int __CACHEIGNORESCOUNT_ISSET_ID = 2;
  private static final int __CACHEERRORSCOUNT_ISSET_ID = 3;
  private static final int __CACHELOCALKEYUNCHANGEDHITSCOUNT_ISSET_ID = 4;
  private static final int __TOTALRULESCOUNT_ISSET_ID = 5;
  private static final int __UPDATEDRULESCOUNT_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CACHE_HITS_COUNT,_Fields.CACHE_MISSES_COUNT,_Fields.CACHE_IGNORES_COUNT,_Fields.CACHE_ERRORS_COUNT,_Fields.CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT,_Fields.TOTAL_RULES_COUNT,_Fields.UPDATED_RULES_COUNT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CACHE_HITS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("cacheHitsCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CACHE_MISSES_COUNT, new org.apache.thrift.meta_data.FieldMetaData("cacheMissesCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CACHE_IGNORES_COUNT, new org.apache.thrift.meta_data.FieldMetaData("cacheIgnoresCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CACHE_ERRORS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("cacheErrorsCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("cacheLocalKeyUnchangedHitsCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_RULES_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalRulesCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UPDATED_RULES_COUNT, new org.apache.thrift.meta_data.FieldMetaData("updatedRulesCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CacheRateStats.class, metaDataMap);
  }

  public CacheRateStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CacheRateStats(CacheRateStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cacheHitsCount = other.cacheHitsCount;
    this.cacheMissesCount = other.cacheMissesCount;
    this.cacheIgnoresCount = other.cacheIgnoresCount;
    this.cacheErrorsCount = other.cacheErrorsCount;
    this.cacheLocalKeyUnchangedHitsCount = other.cacheLocalKeyUnchangedHitsCount;
    this.totalRulesCount = other.totalRulesCount;
    this.updatedRulesCount = other.updatedRulesCount;
  }

  public CacheRateStats deepCopy() {
    return new CacheRateStats(this);
  }

  @Override
  public void clear() {
    setCacheHitsCountIsSet(false);
    this.cacheHitsCount = 0;
    setCacheMissesCountIsSet(false);
    this.cacheMissesCount = 0;
    setCacheIgnoresCountIsSet(false);
    this.cacheIgnoresCount = 0;
    setCacheErrorsCountIsSet(false);
    this.cacheErrorsCount = 0;
    setCacheLocalKeyUnchangedHitsCountIsSet(false);
    this.cacheLocalKeyUnchangedHitsCount = 0;
    setTotalRulesCountIsSet(false);
    this.totalRulesCount = 0;
    setUpdatedRulesCountIsSet(false);
    this.updatedRulesCount = 0;
  }

  public int getCacheHitsCount() {
    return this.cacheHitsCount;
  }

  public CacheRateStats setCacheHitsCount(int cacheHitsCount) {
    this.cacheHitsCount = cacheHitsCount;
    setCacheHitsCountIsSet(true);
    return this;
  }

  public void unsetCacheHitsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CACHEHITSCOUNT_ISSET_ID);
  }

  /** Returns true if field cacheHitsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheHitsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CACHEHITSCOUNT_ISSET_ID);
  }

  public void setCacheHitsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CACHEHITSCOUNT_ISSET_ID, value);
  }

  public int getCacheMissesCount() {
    return this.cacheMissesCount;
  }

  public CacheRateStats setCacheMissesCount(int cacheMissesCount) {
    this.cacheMissesCount = cacheMissesCount;
    setCacheMissesCountIsSet(true);
    return this;
  }

  public void unsetCacheMissesCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CACHEMISSESCOUNT_ISSET_ID);
  }

  /** Returns true if field cacheMissesCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheMissesCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CACHEMISSESCOUNT_ISSET_ID);
  }

  public void setCacheMissesCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CACHEMISSESCOUNT_ISSET_ID, value);
  }

  public int getCacheIgnoresCount() {
    return this.cacheIgnoresCount;
  }

  public CacheRateStats setCacheIgnoresCount(int cacheIgnoresCount) {
    this.cacheIgnoresCount = cacheIgnoresCount;
    setCacheIgnoresCountIsSet(true);
    return this;
  }

  public void unsetCacheIgnoresCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CACHEIGNORESCOUNT_ISSET_ID);
  }

  /** Returns true if field cacheIgnoresCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheIgnoresCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CACHEIGNORESCOUNT_ISSET_ID);
  }

  public void setCacheIgnoresCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CACHEIGNORESCOUNT_ISSET_ID, value);
  }

  public int getCacheErrorsCount() {
    return this.cacheErrorsCount;
  }

  public CacheRateStats setCacheErrorsCount(int cacheErrorsCount) {
    this.cacheErrorsCount = cacheErrorsCount;
    setCacheErrorsCountIsSet(true);
    return this;
  }

  public void unsetCacheErrorsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CACHEERRORSCOUNT_ISSET_ID);
  }

  /** Returns true if field cacheErrorsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheErrorsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CACHEERRORSCOUNT_ISSET_ID);
  }

  public void setCacheErrorsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CACHEERRORSCOUNT_ISSET_ID, value);
  }

  public int getCacheLocalKeyUnchangedHitsCount() {
    return this.cacheLocalKeyUnchangedHitsCount;
  }

  public CacheRateStats setCacheLocalKeyUnchangedHitsCount(int cacheLocalKeyUnchangedHitsCount) {
    this.cacheLocalKeyUnchangedHitsCount = cacheLocalKeyUnchangedHitsCount;
    setCacheLocalKeyUnchangedHitsCountIsSet(true);
    return this;
  }

  public void unsetCacheLocalKeyUnchangedHitsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CACHELOCALKEYUNCHANGEDHITSCOUNT_ISSET_ID);
  }

  /** Returns true if field cacheLocalKeyUnchangedHitsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCacheLocalKeyUnchangedHitsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CACHELOCALKEYUNCHANGEDHITSCOUNT_ISSET_ID);
  }

  public void setCacheLocalKeyUnchangedHitsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CACHELOCALKEYUNCHANGEDHITSCOUNT_ISSET_ID, value);
  }

  public int getTotalRulesCount() {
    return this.totalRulesCount;
  }

  public CacheRateStats setTotalRulesCount(int totalRulesCount) {
    this.totalRulesCount = totalRulesCount;
    setTotalRulesCountIsSet(true);
    return this;
  }

  public void unsetTotalRulesCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALRULESCOUNT_ISSET_ID);
  }

  /** Returns true if field totalRulesCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalRulesCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALRULESCOUNT_ISSET_ID);
  }

  public void setTotalRulesCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALRULESCOUNT_ISSET_ID, value);
  }

  public int getUpdatedRulesCount() {
    return this.updatedRulesCount;
  }

  public CacheRateStats setUpdatedRulesCount(int updatedRulesCount) {
    this.updatedRulesCount = updatedRulesCount;
    setUpdatedRulesCountIsSet(true);
    return this;
  }

  public void unsetUpdatedRulesCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UPDATEDRULESCOUNT_ISSET_ID);
  }

  /** Returns true if field updatedRulesCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedRulesCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UPDATEDRULESCOUNT_ISSET_ID);
  }

  public void setUpdatedRulesCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UPDATEDRULESCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CACHE_HITS_COUNT:
      if (value == null) {
        unsetCacheHitsCount();
      } else {
        setCacheHitsCount((java.lang.Integer)value);
      }
      break;

    case CACHE_MISSES_COUNT:
      if (value == null) {
        unsetCacheMissesCount();
      } else {
        setCacheMissesCount((java.lang.Integer)value);
      }
      break;

    case CACHE_IGNORES_COUNT:
      if (value == null) {
        unsetCacheIgnoresCount();
      } else {
        setCacheIgnoresCount((java.lang.Integer)value);
      }
      break;

    case CACHE_ERRORS_COUNT:
      if (value == null) {
        unsetCacheErrorsCount();
      } else {
        setCacheErrorsCount((java.lang.Integer)value);
      }
      break;

    case CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT:
      if (value == null) {
        unsetCacheLocalKeyUnchangedHitsCount();
      } else {
        setCacheLocalKeyUnchangedHitsCount((java.lang.Integer)value);
      }
      break;

    case TOTAL_RULES_COUNT:
      if (value == null) {
        unsetTotalRulesCount();
      } else {
        setTotalRulesCount((java.lang.Integer)value);
      }
      break;

    case UPDATED_RULES_COUNT:
      if (value == null) {
        unsetUpdatedRulesCount();
      } else {
        setUpdatedRulesCount((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CACHE_HITS_COUNT:
      return getCacheHitsCount();

    case CACHE_MISSES_COUNT:
      return getCacheMissesCount();

    case CACHE_IGNORES_COUNT:
      return getCacheIgnoresCount();

    case CACHE_ERRORS_COUNT:
      return getCacheErrorsCount();

    case CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT:
      return getCacheLocalKeyUnchangedHitsCount();

    case TOTAL_RULES_COUNT:
      return getTotalRulesCount();

    case UPDATED_RULES_COUNT:
      return getUpdatedRulesCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CACHE_HITS_COUNT:
      return isSetCacheHitsCount();
    case CACHE_MISSES_COUNT:
      return isSetCacheMissesCount();
    case CACHE_IGNORES_COUNT:
      return isSetCacheIgnoresCount();
    case CACHE_ERRORS_COUNT:
      return isSetCacheErrorsCount();
    case CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT:
      return isSetCacheLocalKeyUnchangedHitsCount();
    case TOTAL_RULES_COUNT:
      return isSetTotalRulesCount();
    case UPDATED_RULES_COUNT:
      return isSetUpdatedRulesCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CacheRateStats)
      return this.equals((CacheRateStats)that);
    return false;
  }

  public boolean equals(CacheRateStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cacheHitsCount = true && this.isSetCacheHitsCount();
    boolean that_present_cacheHitsCount = true && that.isSetCacheHitsCount();
    if (this_present_cacheHitsCount || that_present_cacheHitsCount) {
      if (!(this_present_cacheHitsCount && that_present_cacheHitsCount))
        return false;
      if (this.cacheHitsCount != that.cacheHitsCount)
        return false;
    }

    boolean this_present_cacheMissesCount = true && this.isSetCacheMissesCount();
    boolean that_present_cacheMissesCount = true && that.isSetCacheMissesCount();
    if (this_present_cacheMissesCount || that_present_cacheMissesCount) {
      if (!(this_present_cacheMissesCount && that_present_cacheMissesCount))
        return false;
      if (this.cacheMissesCount != that.cacheMissesCount)
        return false;
    }

    boolean this_present_cacheIgnoresCount = true && this.isSetCacheIgnoresCount();
    boolean that_present_cacheIgnoresCount = true && that.isSetCacheIgnoresCount();
    if (this_present_cacheIgnoresCount || that_present_cacheIgnoresCount) {
      if (!(this_present_cacheIgnoresCount && that_present_cacheIgnoresCount))
        return false;
      if (this.cacheIgnoresCount != that.cacheIgnoresCount)
        return false;
    }

    boolean this_present_cacheErrorsCount = true && this.isSetCacheErrorsCount();
    boolean that_present_cacheErrorsCount = true && that.isSetCacheErrorsCount();
    if (this_present_cacheErrorsCount || that_present_cacheErrorsCount) {
      if (!(this_present_cacheErrorsCount && that_present_cacheErrorsCount))
        return false;
      if (this.cacheErrorsCount != that.cacheErrorsCount)
        return false;
    }

    boolean this_present_cacheLocalKeyUnchangedHitsCount = true && this.isSetCacheLocalKeyUnchangedHitsCount();
    boolean that_present_cacheLocalKeyUnchangedHitsCount = true && that.isSetCacheLocalKeyUnchangedHitsCount();
    if (this_present_cacheLocalKeyUnchangedHitsCount || that_present_cacheLocalKeyUnchangedHitsCount) {
      if (!(this_present_cacheLocalKeyUnchangedHitsCount && that_present_cacheLocalKeyUnchangedHitsCount))
        return false;
      if (this.cacheLocalKeyUnchangedHitsCount != that.cacheLocalKeyUnchangedHitsCount)
        return false;
    }

    boolean this_present_totalRulesCount = true && this.isSetTotalRulesCount();
    boolean that_present_totalRulesCount = true && that.isSetTotalRulesCount();
    if (this_present_totalRulesCount || that_present_totalRulesCount) {
      if (!(this_present_totalRulesCount && that_present_totalRulesCount))
        return false;
      if (this.totalRulesCount != that.totalRulesCount)
        return false;
    }

    boolean this_present_updatedRulesCount = true && this.isSetUpdatedRulesCount();
    boolean that_present_updatedRulesCount = true && that.isSetUpdatedRulesCount();
    if (this_present_updatedRulesCount || that_present_updatedRulesCount) {
      if (!(this_present_updatedRulesCount && that_present_updatedRulesCount))
        return false;
      if (this.updatedRulesCount != that.updatedRulesCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCacheHitsCount()) ? 131071 : 524287);
    if (isSetCacheHitsCount())
      hashCode = hashCode * 8191 + cacheHitsCount;

    hashCode = hashCode * 8191 + ((isSetCacheMissesCount()) ? 131071 : 524287);
    if (isSetCacheMissesCount())
      hashCode = hashCode * 8191 + cacheMissesCount;

    hashCode = hashCode * 8191 + ((isSetCacheIgnoresCount()) ? 131071 : 524287);
    if (isSetCacheIgnoresCount())
      hashCode = hashCode * 8191 + cacheIgnoresCount;

    hashCode = hashCode * 8191 + ((isSetCacheErrorsCount()) ? 131071 : 524287);
    if (isSetCacheErrorsCount())
      hashCode = hashCode * 8191 + cacheErrorsCount;

    hashCode = hashCode * 8191 + ((isSetCacheLocalKeyUnchangedHitsCount()) ? 131071 : 524287);
    if (isSetCacheLocalKeyUnchangedHitsCount())
      hashCode = hashCode * 8191 + cacheLocalKeyUnchangedHitsCount;

    hashCode = hashCode * 8191 + ((isSetTotalRulesCount()) ? 131071 : 524287);
    if (isSetTotalRulesCount())
      hashCode = hashCode * 8191 + totalRulesCount;

    hashCode = hashCode * 8191 + ((isSetUpdatedRulesCount()) ? 131071 : 524287);
    if (isSetUpdatedRulesCount())
      hashCode = hashCode * 8191 + updatedRulesCount;

    return hashCode;
  }

  @Override
  public int compareTo(CacheRateStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCacheHitsCount()).compareTo(other.isSetCacheHitsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheHitsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheHitsCount, other.cacheHitsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCacheMissesCount()).compareTo(other.isSetCacheMissesCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheMissesCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheMissesCount, other.cacheMissesCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCacheIgnoresCount()).compareTo(other.isSetCacheIgnoresCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheIgnoresCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheIgnoresCount, other.cacheIgnoresCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCacheErrorsCount()).compareTo(other.isSetCacheErrorsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheErrorsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheErrorsCount, other.cacheErrorsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCacheLocalKeyUnchangedHitsCount()).compareTo(other.isSetCacheLocalKeyUnchangedHitsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheLocalKeyUnchangedHitsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cacheLocalKeyUnchangedHitsCount, other.cacheLocalKeyUnchangedHitsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotalRulesCount()).compareTo(other.isSetTotalRulesCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalRulesCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalRulesCount, other.totalRulesCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedRulesCount()).compareTo(other.isSetUpdatedRulesCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedRulesCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedRulesCount, other.updatedRulesCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheRateStats(");
    boolean first = true;

    if (isSetCacheHitsCount()) {
      sb.append("cacheHitsCount:");
      sb.append(this.cacheHitsCount);
      first = false;
    }
    if (isSetCacheMissesCount()) {
      if (!first) sb.append(", ");
      sb.append("cacheMissesCount:");
      sb.append(this.cacheMissesCount);
      first = false;
    }
    if (isSetCacheIgnoresCount()) {
      if (!first) sb.append(", ");
      sb.append("cacheIgnoresCount:");
      sb.append(this.cacheIgnoresCount);
      first = false;
    }
    if (isSetCacheErrorsCount()) {
      if (!first) sb.append(", ");
      sb.append("cacheErrorsCount:");
      sb.append(this.cacheErrorsCount);
      first = false;
    }
    if (isSetCacheLocalKeyUnchangedHitsCount()) {
      if (!first) sb.append(", ");
      sb.append("cacheLocalKeyUnchangedHitsCount:");
      sb.append(this.cacheLocalKeyUnchangedHitsCount);
      first = false;
    }
    if (isSetTotalRulesCount()) {
      if (!first) sb.append(", ");
      sb.append("totalRulesCount:");
      sb.append(this.totalRulesCount);
      first = false;
    }
    if (isSetUpdatedRulesCount()) {
      if (!first) sb.append(", ");
      sb.append("updatedRulesCount:");
      sb.append(this.updatedRulesCount);
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

  private static class CacheRateStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CacheRateStatsStandardScheme getScheme() {
      return new CacheRateStatsStandardScheme();
    }
  }

  private static class CacheRateStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<CacheRateStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CacheRateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CACHE_HITS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cacheHitsCount = iprot.readI32();
              struct.setCacheHitsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CACHE_MISSES_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cacheMissesCount = iprot.readI32();
              struct.setCacheMissesCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CACHE_IGNORES_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cacheIgnoresCount = iprot.readI32();
              struct.setCacheIgnoresCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CACHE_ERRORS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cacheErrorsCount = iprot.readI32();
              struct.setCacheErrorsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cacheLocalKeyUnchangedHitsCount = iprot.readI32();
              struct.setCacheLocalKeyUnchangedHitsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // TOTAL_RULES_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalRulesCount = iprot.readI32();
              struct.setTotalRulesCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // UPDATED_RULES_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.updatedRulesCount = iprot.readI32();
              struct.setUpdatedRulesCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CacheRateStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCacheHitsCount()) {
        oprot.writeFieldBegin(CACHE_HITS_COUNT_FIELD_DESC);
        oprot.writeI32(struct.cacheHitsCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCacheMissesCount()) {
        oprot.writeFieldBegin(CACHE_MISSES_COUNT_FIELD_DESC);
        oprot.writeI32(struct.cacheMissesCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCacheIgnoresCount()) {
        oprot.writeFieldBegin(CACHE_IGNORES_COUNT_FIELD_DESC);
        oprot.writeI32(struct.cacheIgnoresCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCacheErrorsCount()) {
        oprot.writeFieldBegin(CACHE_ERRORS_COUNT_FIELD_DESC);
        oprot.writeI32(struct.cacheErrorsCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCacheLocalKeyUnchangedHitsCount()) {
        oprot.writeFieldBegin(CACHE_LOCAL_KEY_UNCHANGED_HITS_COUNT_FIELD_DESC);
        oprot.writeI32(struct.cacheLocalKeyUnchangedHitsCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalRulesCount()) {
        oprot.writeFieldBegin(TOTAL_RULES_COUNT_FIELD_DESC);
        oprot.writeI32(struct.totalRulesCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUpdatedRulesCount()) {
        oprot.writeFieldBegin(UPDATED_RULES_COUNT_FIELD_DESC);
        oprot.writeI32(struct.updatedRulesCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CacheRateStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CacheRateStatsTupleScheme getScheme() {
      return new CacheRateStatsTupleScheme();
    }
  }

  private static class CacheRateStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<CacheRateStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CacheRateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCacheHitsCount()) {
        optionals.set(0);
      }
      if (struct.isSetCacheMissesCount()) {
        optionals.set(1);
      }
      if (struct.isSetCacheIgnoresCount()) {
        optionals.set(2);
      }
      if (struct.isSetCacheErrorsCount()) {
        optionals.set(3);
      }
      if (struct.isSetCacheLocalKeyUnchangedHitsCount()) {
        optionals.set(4);
      }
      if (struct.isSetTotalRulesCount()) {
        optionals.set(5);
      }
      if (struct.isSetUpdatedRulesCount()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetCacheHitsCount()) {
        oprot.writeI32(struct.cacheHitsCount);
      }
      if (struct.isSetCacheMissesCount()) {
        oprot.writeI32(struct.cacheMissesCount);
      }
      if (struct.isSetCacheIgnoresCount()) {
        oprot.writeI32(struct.cacheIgnoresCount);
      }
      if (struct.isSetCacheErrorsCount()) {
        oprot.writeI32(struct.cacheErrorsCount);
      }
      if (struct.isSetCacheLocalKeyUnchangedHitsCount()) {
        oprot.writeI32(struct.cacheLocalKeyUnchangedHitsCount);
      }
      if (struct.isSetTotalRulesCount()) {
        oprot.writeI32(struct.totalRulesCount);
      }
      if (struct.isSetUpdatedRulesCount()) {
        oprot.writeI32(struct.updatedRulesCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CacheRateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.cacheHitsCount = iprot.readI32();
        struct.setCacheHitsCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cacheMissesCount = iprot.readI32();
        struct.setCacheMissesCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cacheIgnoresCount = iprot.readI32();
        struct.setCacheIgnoresCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.cacheErrorsCount = iprot.readI32();
        struct.setCacheErrorsCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.cacheLocalKeyUnchangedHitsCount = iprot.readI32();
        struct.setCacheLocalKeyUnchangedHitsCountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.totalRulesCount = iprot.readI32();
        struct.setTotalRulesCountIsSet(true);
      }
      if (incoming.get(6)) {
        struct.updatedRulesCount = iprot.readI32();
        struct.setUpdatedRulesCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
