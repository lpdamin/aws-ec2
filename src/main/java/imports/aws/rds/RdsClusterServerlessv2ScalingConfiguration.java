package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.256Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.RdsClusterServerlessv2ScalingConfiguration")
@software.amazon.jsii.Jsii.Proxy(RdsClusterServerlessv2ScalingConfiguration.Jsii$Proxy.class)
public interface RdsClusterServerlessv2ScalingConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#max_capacity RdsCluster#max_capacity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxCapacity();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#min_capacity RdsCluster#min_capacity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMinCapacity();

    /**
     * @return a {@link Builder} of {@link RdsClusterServerlessv2ScalingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RdsClusterServerlessv2ScalingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RdsClusterServerlessv2ScalingConfiguration> {
        java.lang.Number maxCapacity;
        java.lang.Number minCapacity;

        /**
         * Sets the value of {@link RdsClusterServerlessv2ScalingConfiguration#getMaxCapacity}
         * @param maxCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#max_capacity RdsCluster#max_capacity}. This parameter is required.
         * @return {@code this}
         */
        public Builder maxCapacity(java.lang.Number maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterServerlessv2ScalingConfiguration#getMinCapacity}
         * @param minCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#min_capacity RdsCluster#min_capacity}. This parameter is required.
         * @return {@code this}
         */
        public Builder minCapacity(java.lang.Number minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RdsClusterServerlessv2ScalingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RdsClusterServerlessv2ScalingConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RdsClusterServerlessv2ScalingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RdsClusterServerlessv2ScalingConfiguration {
        private final java.lang.Number maxCapacity;
        private final java.lang.Number minCapacity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxCapacity = software.amazon.jsii.Kernel.get(this, "maxCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.minCapacity = software.amazon.jsii.Kernel.get(this, "minCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxCapacity = java.util.Objects.requireNonNull(builder.maxCapacity, "maxCapacity is required");
            this.minCapacity = java.util.Objects.requireNonNull(builder.minCapacity, "minCapacity is required");
        }

        @Override
        public final java.lang.Number getMaxCapacity() {
            return this.maxCapacity;
        }

        @Override
        public final java.lang.Number getMinCapacity() {
            return this.minCapacity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxCapacity", om.valueToTree(this.getMaxCapacity()));
            data.set("minCapacity", om.valueToTree(this.getMinCapacity()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.rds.RdsClusterServerlessv2ScalingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RdsClusterServerlessv2ScalingConfiguration.Jsii$Proxy that = (RdsClusterServerlessv2ScalingConfiguration.Jsii$Proxy) o;

            if (!maxCapacity.equals(that.maxCapacity)) return false;
            return this.minCapacity.equals(that.minCapacity);
        }

        @Override
        public final int hashCode() {
            int result = this.maxCapacity.hashCode();
            result = 31 * result + (this.minCapacity.hashCode());
            return result;
        }
    }
}
