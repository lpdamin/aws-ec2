package imports.aws.timestreamwrite;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.817Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.timestreamwrite.TimestreamwriteTableRetentionProperties")
@software.amazon.jsii.Jsii.Proxy(TimestreamwriteTableRetentionProperties.Jsii$Proxy.class)
public interface TimestreamwriteTableRetentionProperties extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/timestreamwrite_table#magnetic_store_retention_period_in_days TimestreamwriteTable#magnetic_store_retention_period_in_days}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMagneticStoreRetentionPeriodInDays();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/timestreamwrite_table#memory_store_retention_period_in_hours TimestreamwriteTable#memory_store_retention_period_in_hours}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMemoryStoreRetentionPeriodInHours();

    /**
     * @return a {@link Builder} of {@link TimestreamwriteTableRetentionProperties}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TimestreamwriteTableRetentionProperties}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TimestreamwriteTableRetentionProperties> {
        java.lang.Number magneticStoreRetentionPeriodInDays;
        java.lang.Number memoryStoreRetentionPeriodInHours;

        /**
         * Sets the value of {@link TimestreamwriteTableRetentionProperties#getMagneticStoreRetentionPeriodInDays}
         * @param magneticStoreRetentionPeriodInDays Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/timestreamwrite_table#magnetic_store_retention_period_in_days TimestreamwriteTable#magnetic_store_retention_period_in_days}. This parameter is required.
         * @return {@code this}
         */
        public Builder magneticStoreRetentionPeriodInDays(java.lang.Number magneticStoreRetentionPeriodInDays) {
            this.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
            return this;
        }

        /**
         * Sets the value of {@link TimestreamwriteTableRetentionProperties#getMemoryStoreRetentionPeriodInHours}
         * @param memoryStoreRetentionPeriodInHours Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/timestreamwrite_table#memory_store_retention_period_in_hours TimestreamwriteTable#memory_store_retention_period_in_hours}. This parameter is required.
         * @return {@code this}
         */
        public Builder memoryStoreRetentionPeriodInHours(java.lang.Number memoryStoreRetentionPeriodInHours) {
            this.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TimestreamwriteTableRetentionProperties}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TimestreamwriteTableRetentionProperties build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link TimestreamwriteTableRetentionProperties}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TimestreamwriteTableRetentionProperties {
        private final java.lang.Number magneticStoreRetentionPeriodInDays;
        private final java.lang.Number memoryStoreRetentionPeriodInHours;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.magneticStoreRetentionPeriodInDays = software.amazon.jsii.Kernel.get(this, "magneticStoreRetentionPeriodInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.memoryStoreRetentionPeriodInHours = software.amazon.jsii.Kernel.get(this, "memoryStoreRetentionPeriodInHours", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.magneticStoreRetentionPeriodInDays = java.util.Objects.requireNonNull(builder.magneticStoreRetentionPeriodInDays, "magneticStoreRetentionPeriodInDays is required");
            this.memoryStoreRetentionPeriodInHours = java.util.Objects.requireNonNull(builder.memoryStoreRetentionPeriodInHours, "memoryStoreRetentionPeriodInHours is required");
        }

        @Override
        public final java.lang.Number getMagneticStoreRetentionPeriodInDays() {
            return this.magneticStoreRetentionPeriodInDays;
        }

        @Override
        public final java.lang.Number getMemoryStoreRetentionPeriodInHours() {
            return this.memoryStoreRetentionPeriodInHours;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("magneticStoreRetentionPeriodInDays", om.valueToTree(this.getMagneticStoreRetentionPeriodInDays()));
            data.set("memoryStoreRetentionPeriodInHours", om.valueToTree(this.getMemoryStoreRetentionPeriodInHours()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.timestreamwrite.TimestreamwriteTableRetentionProperties"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TimestreamwriteTableRetentionProperties.Jsii$Proxy that = (TimestreamwriteTableRetentionProperties.Jsii$Proxy) o;

            if (!magneticStoreRetentionPeriodInDays.equals(that.magneticStoreRetentionPeriodInDays)) return false;
            return this.memoryStoreRetentionPeriodInHours.equals(that.memoryStoreRetentionPeriodInHours);
        }

        @Override
        public final int hashCode() {
            int result = this.magneticStoreRetentionPeriodInDays.hashCode();
            result = 31 * result + (this.memoryStoreRetentionPeriodInHours.hashCode());
            return result;
        }
    }
}
