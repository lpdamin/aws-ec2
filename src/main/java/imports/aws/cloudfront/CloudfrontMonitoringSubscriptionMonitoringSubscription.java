package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.223Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscription")
@software.amazon.jsii.Jsii.Proxy(CloudfrontMonitoringSubscriptionMonitoringSubscription.Jsii$Proxy.class)
public interface CloudfrontMonitoringSubscriptionMonitoringSubscription extends software.amazon.jsii.JsiiSerializable {

    /**
     * realtime_metrics_subscription_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_monitoring_subscription#realtime_metrics_subscription_config CloudfrontMonitoringSubscription#realtime_metrics_subscription_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig getRealtimeMetricsSubscriptionConfig();

    /**
     * @return a {@link Builder} of {@link CloudfrontMonitoringSubscriptionMonitoringSubscription}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontMonitoringSubscriptionMonitoringSubscription}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontMonitoringSubscriptionMonitoringSubscription> {
        imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig;

        /**
         * Sets the value of {@link CloudfrontMonitoringSubscriptionMonitoringSubscription#getRealtimeMetricsSubscriptionConfig}
         * @param realtimeMetricsSubscriptionConfig realtime_metrics_subscription_config block. This parameter is required.
         *                                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_monitoring_subscription#realtime_metrics_subscription_config CloudfrontMonitoringSubscription#realtime_metrics_subscription_config}
         * @return {@code this}
         */
        public Builder realtimeMetricsSubscriptionConfig(imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig) {
            this.realtimeMetricsSubscriptionConfig = realtimeMetricsSubscriptionConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontMonitoringSubscriptionMonitoringSubscription}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontMonitoringSubscriptionMonitoringSubscription build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontMonitoringSubscriptionMonitoringSubscription}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontMonitoringSubscriptionMonitoringSubscription {
        private final imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.realtimeMetricsSubscriptionConfig = software.amazon.jsii.Kernel.get(this, "realtimeMetricsSubscriptionConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.realtimeMetricsSubscriptionConfig = java.util.Objects.requireNonNull(builder.realtimeMetricsSubscriptionConfig, "realtimeMetricsSubscriptionConfig is required");
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig getRealtimeMetricsSubscriptionConfig() {
            return this.realtimeMetricsSubscriptionConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("realtimeMetricsSubscriptionConfig", om.valueToTree(this.getRealtimeMetricsSubscriptionConfig()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscription"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontMonitoringSubscriptionMonitoringSubscription.Jsii$Proxy that = (CloudfrontMonitoringSubscriptionMonitoringSubscription.Jsii$Proxy) o;

            return this.realtimeMetricsSubscriptionConfig.equals(that.realtimeMetricsSubscriptionConfig);
        }

        @Override
        public final int hashCode() {
            int result = this.realtimeMetricsSubscriptionConfig.hashCode();
            return result;
        }
    }
}
