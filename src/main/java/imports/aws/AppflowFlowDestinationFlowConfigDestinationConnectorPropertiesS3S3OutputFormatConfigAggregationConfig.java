package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.008Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig")
@software.amazon.jsii.Jsii.Proxy(AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig.Jsii$Proxy.class)
public interface AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_flow#aggregation_type AppflowFlow#aggregation_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAggregationType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig> {
        java.lang.String aggregationType;

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig#getAggregationType}
         * @param aggregationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_flow#aggregation_type AppflowFlow#aggregation_type}.
         * @return {@code this}
         */
        public Builder aggregationType(java.lang.String aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig {
        private final java.lang.String aggregationType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.aggregationType = software.amazon.jsii.Kernel.get(this, "aggregationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.aggregationType = builder.aggregationType;
        }

        @Override
        public final java.lang.String getAggregationType() {
            return this.aggregationType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAggregationType() != null) {
                data.set("aggregationType", om.valueToTree(this.getAggregationType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig.Jsii$Proxy that = (AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigAggregationConfig.Jsii$Proxy) o;

            return this.aggregationType != null ? this.aggregationType.equals(that.aggregationType) : that.aggregationType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.aggregationType != null ? this.aggregationType.hashCode() : 0;
            return result;
        }
    }
}
