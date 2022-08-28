package imports.aws.elasticache;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.538Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticache.ElasticacheClusterLogDeliveryConfiguration")
@software.amazon.jsii.Jsii.Proxy(ElasticacheClusterLogDeliveryConfiguration.Jsii$Proxy.class)
public interface ElasticacheClusterLogDeliveryConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#destination ElasticacheCluster#destination}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDestination();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#destination_type ElasticacheCluster#destination_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDestinationType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#log_format ElasticacheCluster#log_format}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLogFormat();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#log_type ElasticacheCluster#log_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLogType();

    /**
     * @return a {@link Builder} of {@link ElasticacheClusterLogDeliveryConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticacheClusterLogDeliveryConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticacheClusterLogDeliveryConfiguration> {
        java.lang.String destination;
        java.lang.String destinationType;
        java.lang.String logFormat;
        java.lang.String logType;

        /**
         * Sets the value of {@link ElasticacheClusterLogDeliveryConfiguration#getDestination}
         * @param destination Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#destination ElasticacheCluster#destination}. This parameter is required.
         * @return {@code this}
         */
        public Builder destination(java.lang.String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheClusterLogDeliveryConfiguration#getDestinationType}
         * @param destinationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#destination_type ElasticacheCluster#destination_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder destinationType(java.lang.String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheClusterLogDeliveryConfiguration#getLogFormat}
         * @param logFormat Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#log_format ElasticacheCluster#log_format}. This parameter is required.
         * @return {@code this}
         */
        public Builder logFormat(java.lang.String logFormat) {
            this.logFormat = logFormat;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheClusterLogDeliveryConfiguration#getLogType}
         * @param logType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_cluster#log_type ElasticacheCluster#log_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder logType(java.lang.String logType) {
            this.logType = logType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticacheClusterLogDeliveryConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticacheClusterLogDeliveryConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticacheClusterLogDeliveryConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticacheClusterLogDeliveryConfiguration {
        private final java.lang.String destination;
        private final java.lang.String destinationType;
        private final java.lang.String logFormat;
        private final java.lang.String logType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationType = software.amazon.jsii.Kernel.get(this, "destinationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logFormat = software.amazon.jsii.Kernel.get(this, "logFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logType = software.amazon.jsii.Kernel.get(this, "logType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = java.util.Objects.requireNonNull(builder.destination, "destination is required");
            this.destinationType = java.util.Objects.requireNonNull(builder.destinationType, "destinationType is required");
            this.logFormat = java.util.Objects.requireNonNull(builder.logFormat, "logFormat is required");
            this.logType = java.util.Objects.requireNonNull(builder.logType, "logType is required");
        }

        @Override
        public final java.lang.String getDestination() {
            return this.destination;
        }

        @Override
        public final java.lang.String getDestinationType() {
            return this.destinationType;
        }

        @Override
        public final java.lang.String getLogFormat() {
            return this.logFormat;
        }

        @Override
        public final java.lang.String getLogType() {
            return this.logType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destination", om.valueToTree(this.getDestination()));
            data.set("destinationType", om.valueToTree(this.getDestinationType()));
            data.set("logFormat", om.valueToTree(this.getLogFormat()));
            data.set("logType", om.valueToTree(this.getLogType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elasticache.ElasticacheClusterLogDeliveryConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticacheClusterLogDeliveryConfiguration.Jsii$Proxy that = (ElasticacheClusterLogDeliveryConfiguration.Jsii$Proxy) o;

            if (!destination.equals(that.destination)) return false;
            if (!destinationType.equals(that.destinationType)) return false;
            if (!logFormat.equals(that.logFormat)) return false;
            return this.logType.equals(that.logType);
        }

        @Override
        public final int hashCode() {
            int result = this.destination.hashCode();
            result = 31 * result + (this.destinationType.hashCode());
            result = 31 * result + (this.logFormat.hashCode());
            result = 31 * result + (this.logType.hashCode());
            return result;
        }
    }
}
