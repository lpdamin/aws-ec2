package imports.aws.apprunner;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.644Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerServiceObservabilityConfiguration")
@software.amazon.jsii.Jsii.Proxy(ApprunnerServiceObservabilityConfiguration.Jsii$Proxy.class)
public interface ApprunnerServiceObservabilityConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#observability_configuration_arn ApprunnerService#observability_configuration_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getObservabilityConfigurationArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#observability_enabled ApprunnerService#observability_enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getObservabilityEnabled();

    /**
     * @return a {@link Builder} of {@link ApprunnerServiceObservabilityConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApprunnerServiceObservabilityConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApprunnerServiceObservabilityConfiguration> {
        java.lang.String observabilityConfigurationArn;
        java.lang.Object observabilityEnabled;

        /**
         * Sets the value of {@link ApprunnerServiceObservabilityConfiguration#getObservabilityConfigurationArn}
         * @param observabilityConfigurationArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#observability_configuration_arn ApprunnerService#observability_configuration_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder observabilityConfigurationArn(java.lang.String observabilityConfigurationArn) {
            this.observabilityConfigurationArn = observabilityConfigurationArn;
            return this;
        }

        /**
         * Sets the value of {@link ApprunnerServiceObservabilityConfiguration#getObservabilityEnabled}
         * @param observabilityEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#observability_enabled ApprunnerService#observability_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder observabilityEnabled(java.lang.Boolean observabilityEnabled) {
            this.observabilityEnabled = observabilityEnabled;
            return this;
        }

        /**
         * Sets the value of {@link ApprunnerServiceObservabilityConfiguration#getObservabilityEnabled}
         * @param observabilityEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#observability_enabled ApprunnerService#observability_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder observabilityEnabled(com.hashicorp.cdktf.IResolvable observabilityEnabled) {
            this.observabilityEnabled = observabilityEnabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApprunnerServiceObservabilityConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApprunnerServiceObservabilityConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApprunnerServiceObservabilityConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApprunnerServiceObservabilityConfiguration {
        private final java.lang.String observabilityConfigurationArn;
        private final java.lang.Object observabilityEnabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.observabilityConfigurationArn = software.amazon.jsii.Kernel.get(this, "observabilityConfigurationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.observabilityEnabled = software.amazon.jsii.Kernel.get(this, "observabilityEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.observabilityConfigurationArn = java.util.Objects.requireNonNull(builder.observabilityConfigurationArn, "observabilityConfigurationArn is required");
            this.observabilityEnabled = java.util.Objects.requireNonNull(builder.observabilityEnabled, "observabilityEnabled is required");
        }

        @Override
        public final java.lang.String getObservabilityConfigurationArn() {
            return this.observabilityConfigurationArn;
        }

        @Override
        public final java.lang.Object getObservabilityEnabled() {
            return this.observabilityEnabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("observabilityConfigurationArn", om.valueToTree(this.getObservabilityConfigurationArn()));
            data.set("observabilityEnabled", om.valueToTree(this.getObservabilityEnabled()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.apprunner.ApprunnerServiceObservabilityConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApprunnerServiceObservabilityConfiguration.Jsii$Proxy that = (ApprunnerServiceObservabilityConfiguration.Jsii$Proxy) o;

            if (!observabilityConfigurationArn.equals(that.observabilityConfigurationArn)) return false;
            return this.observabilityEnabled.equals(that.observabilityEnabled);
        }

        @Override
        public final int hashCode() {
            int result = this.observabilityConfigurationArn.hashCode();
            result = 31 * result + (this.observabilityEnabled.hashCode());
            return result;
        }
    }
}
