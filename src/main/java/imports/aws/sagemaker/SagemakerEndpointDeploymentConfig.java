package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.498Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointDeploymentConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerEndpointDeploymentConfig.Jsii$Proxy.class)
public interface SagemakerEndpointDeploymentConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * blue_green_update_policy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint#blue_green_update_policy SagemakerEndpoint#blue_green_update_policy}
     */
    @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy getBlueGreenUpdatePolicy();

    /**
     * auto_rollback_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint#auto_rollback_configuration SagemakerEndpoint#auto_rollback_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration getAutoRollbackConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerEndpointDeploymentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerEndpointDeploymentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerEndpointDeploymentConfig> {
        imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy;
        imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration;

        /**
         * Sets the value of {@link SagemakerEndpointDeploymentConfig#getBlueGreenUpdatePolicy}
         * @param blueGreenUpdatePolicy blue_green_update_policy block. This parameter is required.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint#blue_green_update_policy SagemakerEndpoint#blue_green_update_policy}
         * @return {@code this}
         */
        public Builder blueGreenUpdatePolicy(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy) {
            this.blueGreenUpdatePolicy = blueGreenUpdatePolicy;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointDeploymentConfig#getAutoRollbackConfiguration}
         * @param autoRollbackConfiguration auto_rollback_configuration block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint#auto_rollback_configuration SagemakerEndpoint#auto_rollback_configuration}
         * @return {@code this}
         */
        public Builder autoRollbackConfiguration(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration) {
            this.autoRollbackConfiguration = autoRollbackConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerEndpointDeploymentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerEndpointDeploymentConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerEndpointDeploymentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerEndpointDeploymentConfig {
        private final imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy;
        private final imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blueGreenUpdatePolicy = software.amazon.jsii.Kernel.get(this, "blueGreenUpdatePolicy", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy.class));
            this.autoRollbackConfiguration = software.amazon.jsii.Kernel.get(this, "autoRollbackConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blueGreenUpdatePolicy = java.util.Objects.requireNonNull(builder.blueGreenUpdatePolicy, "blueGreenUpdatePolicy is required");
            this.autoRollbackConfiguration = builder.autoRollbackConfiguration;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy getBlueGreenUpdatePolicy() {
            return this.blueGreenUpdatePolicy;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration getAutoRollbackConfiguration() {
            return this.autoRollbackConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("blueGreenUpdatePolicy", om.valueToTree(this.getBlueGreenUpdatePolicy()));
            if (this.getAutoRollbackConfiguration() != null) {
                data.set("autoRollbackConfiguration", om.valueToTree(this.getAutoRollbackConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerEndpointDeploymentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerEndpointDeploymentConfig.Jsii$Proxy that = (SagemakerEndpointDeploymentConfig.Jsii$Proxy) o;

            if (!blueGreenUpdatePolicy.equals(that.blueGreenUpdatePolicy)) return false;
            return this.autoRollbackConfiguration != null ? this.autoRollbackConfiguration.equals(that.autoRollbackConfiguration) : that.autoRollbackConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blueGreenUpdatePolicy.hashCode();
            result = 31 * result + (this.autoRollbackConfiguration != null ? this.autoRollbackConfiguration.hashCode() : 0);
            return result;
        }
    }
}
