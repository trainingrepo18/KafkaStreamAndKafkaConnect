/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mycompany.commons.storeapp.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7082846176551356971L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.mycompany.commons.storeapp.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"created_at\",\"type\":{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"payment_type\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"customer_id\",\"type\":\"long\"}],\"connect.name\":\"com.mycompany.commons.storeapp.avro.Order\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Order> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Order to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Order from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Order instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence id;
  private java.time.Instant created_at;
  private java.lang.CharSequence payment_type;
  private java.lang.CharSequence status;
  private long customer_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param created_at The new value for created_at
   * @param payment_type The new value for payment_type
   * @param status The new value for status
   * @param customer_id The new value for customer_id
   */
  public Order(java.lang.CharSequence id, java.time.Instant created_at, java.lang.CharSequence payment_type, java.lang.CharSequence status, java.lang.Long customer_id) {
    this.id = id;
    this.created_at = created_at.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.payment_type = payment_type;
    this.status = status;
    this.customer_id = customer_id;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return created_at;
    case 2: return payment_type;
    case 3: return status;
    case 4: return customer_id;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: created_at = (java.time.Instant)value$; break;
    case 2: payment_type = (java.lang.CharSequence)value$; break;
    case 3: status = (java.lang.CharSequence)value$; break;
    case 4: customer_id = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'created_at' field.
   * @return The value of the 'created_at' field.
   */
  public java.time.Instant getCreatedAt() {
    return created_at;
  }


  /**
   * Sets the value of the 'created_at' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.time.Instant value) {
    this.created_at = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'payment_type' field.
   * @return The value of the 'payment_type' field.
   */
  public java.lang.CharSequence getPaymentType() {
    return payment_type;
  }


  /**
   * Sets the value of the 'payment_type' field.
   * @param value the value to set.
   */
  public void setPaymentType(java.lang.CharSequence value) {
    this.payment_type = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'customer_id' field.
   * @return The value of the 'customer_id' field.
   */
  public long getCustomerId() {
    return customer_id;
  }


  /**
   * Sets the value of the 'customer_id' field.
   * @param value the value to set.
   */
  public void setCustomerId(long value) {
    this.customer_id = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static com.mycompany.commons.storeapp.avro.Order.Builder newBuilder() {
    return new com.mycompany.commons.storeapp.avro.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static com.mycompany.commons.storeapp.avro.Order.Builder newBuilder(com.mycompany.commons.storeapp.avro.Order.Builder other) {
    if (other == null) {
      return new com.mycompany.commons.storeapp.avro.Order.Builder();
    } else {
      return new com.mycompany.commons.storeapp.avro.Order.Builder(other);
    }
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static com.mycompany.commons.storeapp.avro.Order.Builder newBuilder(com.mycompany.commons.storeapp.avro.Order other) {
    if (other == null) {
      return new com.mycompany.commons.storeapp.avro.Order.Builder();
    } else {
      return new com.mycompany.commons.storeapp.avro.Order.Builder(other);
    }
  }

  /**
   * RecordBuilder for Order instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private java.lang.CharSequence id;
    private java.time.Instant created_at;
    private java.lang.CharSequence payment_type;
    private java.lang.CharSequence status;
    private long customer_id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mycompany.commons.storeapp.avro.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.created_at)) {
        this.created_at = data().deepCopy(fields()[1].schema(), other.created_at);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.payment_type)) {
        this.payment_type = data().deepCopy(fields()[2].schema(), other.payment_type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.customer_id)) {
        this.customer_id = data().deepCopy(fields()[4].schema(), other.customer_id);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mycompany.commons.storeapp.avro.Order other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.created_at)) {
        this.created_at = data().deepCopy(fields()[1].schema(), other.created_at);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.payment_type)) {
        this.payment_type = data().deepCopy(fields()[2].schema(), other.payment_type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.customer_id)) {
        this.customer_id = data().deepCopy(fields()[4].schema(), other.customer_id);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'created_at' field.
      * @return The value.
      */
    public java.time.Instant getCreatedAt() {
      return created_at;
    }


    /**
      * Sets the value of the 'created_at' field.
      * @param value The value of 'created_at'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder setCreatedAt(java.time.Instant value) {
      validate(fields()[1], value);
      this.created_at = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'created_at' field has been set.
      * @return True if the 'created_at' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'created_at' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder clearCreatedAt() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'payment_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getPaymentType() {
      return payment_type;
    }


    /**
      * Sets the value of the 'payment_type' field.
      * @param value The value of 'payment_type'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder setPaymentType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.payment_type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'payment_type' field has been set.
      * @return True if the 'payment_type' field has been set, false otherwise.
      */
    public boolean hasPaymentType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'payment_type' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder clearPaymentType() {
      payment_type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder clearStatus() {
      status = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer_id' field.
      * @return The value.
      */
    public long getCustomerId() {
      return customer_id;
    }


    /**
      * Sets the value of the 'customer_id' field.
      * @param value The value of 'customer_id'.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder setCustomerId(long value) {
      validate(fields()[4], value);
      this.customer_id = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'customer_id' field has been set.
      * @return True if the 'customer_id' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'customer_id' field.
      * @return This builder.
      */
    public com.mycompany.commons.storeapp.avro.Order.Builder clearCustomerId() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.created_at = fieldSetFlags()[1] ? this.created_at : (java.time.Instant) defaultValue(fields()[1]);
        record.payment_type = fieldSetFlags()[2] ? this.payment_type : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.status = fieldSetFlags()[3] ? this.status : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.customer_id = fieldSetFlags()[4] ? this.customer_id : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










