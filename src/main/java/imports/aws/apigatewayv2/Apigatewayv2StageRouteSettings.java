package imports.aws.apigatewayv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.339Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigatewayv2.Apigatewayv2StageRouteSettings")
@software.amazon.jsii.Jsii.Proxy(Apigatewayv2StageRouteSettings.Jsii$Proxy.class)
public interface Apigatewayv2StageRouteSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#route_key Apigatewayv2Stage#route_key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRouteKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#data_trace_enabled Apigatewayv2Stage#data_trace_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDataTraceEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#detailed_metrics_enabled Apigatewayv2Stage#detailed_metrics_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDetailedMetricsEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#logging_level Apigatewayv2Stage#logging_level}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingLevel() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#throttling_burst_limit Apigatewayv2Stage#throttling_burst_limit}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThrottlingBurstLimit() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#throttling_rate_limit Apigatewayv2Stage#throttling_rate_limit}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThrottlingRateLimit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Apigatewayv2StageRouteSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Apigatewayv2StageRouteSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Apigatewayv2StageRouteSettings> {
        java.lang.String routeKey;
        java.lang.Object dataTraceEnabled;
        java.lang.Object detailedMetricsEnabled;
        java.lang.String loggingLevel;
        java.lang.Number throttlingBurstLimit;
        java.lang.Number throttlingRateLimit;

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getRouteKey}
         * @param routeKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#route_key Apigatewayv2Stage#route_key}. This parameter is required.
         * @return {@code this}
         */
        public Builder routeKey(java.lang.String routeKey) {
            this.routeKey = routeKey;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getDataTraceEnabled}
         * @param dataTraceEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#data_trace_enabled Apigatewayv2Stage#data_trace_enabled}.
         * @return {@code this}
         */
        public Builder dataTraceEnabled(java.lang.Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getDataTraceEnabled}
         * @param dataTraceEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#data_trace_enabled Apigatewayv2Stage#data_trace_enabled}.
         * @return {@code this}
         */
        public Builder dataTraceEnabled(com.hashicorp.cdktf.IResolvable dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getDetailedMetricsEnabled}
         * @param detailedMetricsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#detailed_metrics_enabled Apigatewayv2Stage#detailed_metrics_enabled}.
         * @return {@code this}
         */
        public Builder detailedMetricsEnabled(java.lang.Boolean detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getDetailedMetricsEnabled}
         * @param detailedMetricsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#detailed_metrics_enabled Apigatewayv2Stage#detailed_metrics_enabled}.
         * @return {@code this}
         */
        public Builder detailedMetricsEnabled(com.hashicorp.cdktf.IResolvable detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getLoggingLevel}
         * @param loggingLevel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#logging_level Apigatewayv2Stage#logging_level}.
         * @return {@code this}
         */
        public Builder loggingLevel(java.lang.String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getThrottlingBurstLimit}
         * @param throttlingBurstLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#throttling_burst_limit Apigatewayv2Stage#throttling_burst_limit}.
         * @return {@code this}
         */
        public Builder throttlingBurstLimit(java.lang.Number throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        /**
         * Sets the value of {@link Apigatewayv2StageRouteSettings#getThrottlingRateLimit}
         * @param throttlingRateLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_stage#throttling_rate_limit Apigatewayv2Stage#throttling_rate_limit}.
         * @return {@code this}
         */
        public Builder throttlingRateLimit(java.lang.Number throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Apigatewayv2StageRouteSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Apigatewayv2StageRouteSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Apigatewayv2StageRouteSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Apigatewayv2StageRouteSettings {
        private final java.lang.String routeKey;
        private final java.lang.Object dataTraceEnabled;
        private final java.lang.Object detailedMetricsEnabled;
        private final java.lang.String loggingLevel;
        private final java.lang.Number throttlingBurstLimit;
        private final java.lang.Number throttlingRateLimit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.routeKey = software.amazon.jsii.Kernel.get(this, "routeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dataTraceEnabled = software.amazon.jsii.Kernel.get(this, "dataTraceEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.detailedMetricsEnabled = software.amazon.jsii.Kernel.get(this, "detailedMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.loggingLevel = software.amazon.jsii.Kernel.get(this, "loggingLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.throttlingBurstLimit = software.amazon.jsii.Kernel.get(this, "throttlingBurstLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.throttlingRateLimit = software.amazon.jsii.Kernel.get(this, "throttlingRateLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.routeKey = java.util.Objects.requireNonNull(builder.routeKey, "routeKey is required");
            this.dataTraceEnabled = builder.dataTraceEnabled;
            this.detailedMetricsEnabled = builder.detailedMetricsEnabled;
            this.loggingLevel = builder.loggingLevel;
            this.throttlingBurstLimit = builder.throttlingBurstLimit;
            this.throttlingRateLimit = builder.throttlingRateLimit;
        }

        @Override
        public final java.lang.String getRouteKey() {
            return this.routeKey;
        }

        @Override
        public final java.lang.Object getDataTraceEnabled() {
            return this.dataTraceEnabled;
        }

        @Override
        public final java.lang.Object getDetailedMetricsEnabled() {
            return this.detailedMetricsEnabled;
        }

        @Override
        public final java.lang.String getLoggingLevel() {
            return this.loggingLevel;
        }

        @Override
        public final java.lang.Number getThrottlingBurstLimit() {
            return this.throttlingBurstLimit;
        }

        @Override
        public final java.lang.Number getThrottlingRateLimit() {
            return this.throttlingRateLimit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("routeKey", om.valueToTree(this.getRouteKey()));
            if (this.getDataTraceEnabled() != null) {
                data.set("dataTraceEnabled", om.valueToTree(this.getDataTraceEnabled()));
            }
            if (this.getDetailedMetricsEnabled() != null) {
                data.set("detailedMetricsEnabled", om.valueToTree(this.getDetailedMetricsEnabled()));
            }
            if (this.getLoggingLevel() != null) {
                data.set("loggingLevel", om.valueToTree(this.getLoggingLevel()));
            }
            if (this.getThrottlingBurstLimit() != null) {
                data.set("throttlingBurstLimit", om.valueToTree(this.getThrottlingBurstLimit()));
            }
            if (this.getThrottlingRateLimit() != null) {
                data.set("throttlingRateLimit", om.valueToTree(this.getThrottlingRateLimit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.apigatewayv2.Apigatewayv2StageRouteSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Apigatewayv2StageRouteSettings.Jsii$Proxy that = (Apigatewayv2StageRouteSettings.Jsii$Proxy) o;

            if (!routeKey.equals(that.routeKey)) return false;
            if (this.dataTraceEnabled != null ? !this.dataTraceEnabled.equals(that.dataTraceEnabled) : that.dataTraceEnabled != null) return false;
            if (this.detailedMetricsEnabled != null ? !this.detailedMetricsEnabled.equals(that.detailedMetricsEnabled) : that.detailedMetricsEnabled != null) return false;
            if (this.loggingLevel != null ? !this.loggingLevel.equals(that.loggingLevel) : that.loggingLevel != null) return false;
            if (this.throttlingBurstLimit != null ? !this.throttlingBurstLimit.equals(that.throttlingBurstLimit) : that.throttlingBurstLimit != null) return false;
            return this.throttlingRateLimit != null ? this.throttlingRateLimit.equals(that.throttlingRateLimit) : that.throttlingRateLimit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.routeKey.hashCode();
            result = 31 * result + (this.dataTraceEnabled != null ? this.dataTraceEnabled.hashCode() : 0);
            result = 31 * result + (this.detailedMetricsEnabled != null ? this.detailedMetricsEnabled.hashCode() : 0);
            result = 31 * result + (this.loggingLevel != null ? this.loggingLevel.hashCode() : 0);
            result = 31 * result + (this.throttlingBurstLimit != null ? this.throttlingBurstLimit.hashCode() : 0);
            result = 31 * result + (this.throttlingRateLimit != null ? this.throttlingRateLimit.hashCode() : 0);
            return result;
        }
    }
}
