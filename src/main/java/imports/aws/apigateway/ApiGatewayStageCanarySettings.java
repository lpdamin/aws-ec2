package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.495Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayStageCanarySettings")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayStageCanarySettings.Jsii$Proxy.class)
public interface ApiGatewayStageCanarySettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#percent_traffic ApiGatewayStage#percent_traffic}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPercentTraffic() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#stage_variable_overrides ApiGatewayStage#stage_variable_overrides}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getStageVariableOverrides() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#use_stage_cache ApiGatewayStage#use_stage_cache}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseStageCache() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiGatewayStageCanarySettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayStageCanarySettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayStageCanarySettings> {
        java.lang.Number percentTraffic;
        java.util.Map<java.lang.String, java.lang.String> stageVariableOverrides;
        java.lang.Object useStageCache;

        /**
         * Sets the value of {@link ApiGatewayStageCanarySettings#getPercentTraffic}
         * @param percentTraffic Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#percent_traffic ApiGatewayStage#percent_traffic}.
         * @return {@code this}
         */
        public Builder percentTraffic(java.lang.Number percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageCanarySettings#getStageVariableOverrides}
         * @param stageVariableOverrides Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#stage_variable_overrides ApiGatewayStage#stage_variable_overrides}.
         * @return {@code this}
         */
        public Builder stageVariableOverrides(java.util.Map<java.lang.String, java.lang.String> stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageCanarySettings#getUseStageCache}
         * @param useStageCache Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#use_stage_cache ApiGatewayStage#use_stage_cache}.
         * @return {@code this}
         */
        public Builder useStageCache(java.lang.Boolean useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }

        /**
         * Sets the value of {@link ApiGatewayStageCanarySettings#getUseStageCache}
         * @param useStageCache Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_stage#use_stage_cache ApiGatewayStage#use_stage_cache}.
         * @return {@code this}
         */
        public Builder useStageCache(com.hashicorp.cdktf.IResolvable useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayStageCanarySettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayStageCanarySettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApiGatewayStageCanarySettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayStageCanarySettings {
        private final java.lang.Number percentTraffic;
        private final java.util.Map<java.lang.String, java.lang.String> stageVariableOverrides;
        private final java.lang.Object useStageCache;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.percentTraffic = software.amazon.jsii.Kernel.get(this, "percentTraffic", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.stageVariableOverrides = software.amazon.jsii.Kernel.get(this, "stageVariableOverrides", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.useStageCache = software.amazon.jsii.Kernel.get(this, "useStageCache", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.percentTraffic = builder.percentTraffic;
            this.stageVariableOverrides = builder.stageVariableOverrides;
            this.useStageCache = builder.useStageCache;
        }

        @Override
        public final java.lang.Number getPercentTraffic() {
            return this.percentTraffic;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getStageVariableOverrides() {
            return this.stageVariableOverrides;
        }

        @Override
        public final java.lang.Object getUseStageCache() {
            return this.useStageCache;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPercentTraffic() != null) {
                data.set("percentTraffic", om.valueToTree(this.getPercentTraffic()));
            }
            if (this.getStageVariableOverrides() != null) {
                data.set("stageVariableOverrides", om.valueToTree(this.getStageVariableOverrides()));
            }
            if (this.getUseStageCache() != null) {
                data.set("useStageCache", om.valueToTree(this.getUseStageCache()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.apigateway.ApiGatewayStageCanarySettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayStageCanarySettings.Jsii$Proxy that = (ApiGatewayStageCanarySettings.Jsii$Proxy) o;

            if (this.percentTraffic != null ? !this.percentTraffic.equals(that.percentTraffic) : that.percentTraffic != null) return false;
            if (this.stageVariableOverrides != null ? !this.stageVariableOverrides.equals(that.stageVariableOverrides) : that.stageVariableOverrides != null) return false;
            return this.useStageCache != null ? this.useStageCache.equals(that.useStageCache) : that.useStageCache == null;
        }

        @Override
        public final int hashCode() {
            int result = this.percentTraffic != null ? this.percentTraffic.hashCode() : 0;
            result = 31 * result + (this.stageVariableOverrides != null ? this.stageVariableOverrides.hashCode() : 0);
            result = 31 * result + (this.useStageCache != null ? this.useStageCache.hashCode() : 0);
            return result;
        }
    }
}
