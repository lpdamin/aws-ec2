package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.489Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig.Jsii$Proxy.class)
public interface SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#s3_output_path SagemakerEndpointConfiguration#s3_output_path}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getS3OutputPath();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#kms_key_id SagemakerEndpointConfiguration#kms_key_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    /**
     * notification_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#notification_config SagemakerEndpointConfiguration#notification_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig getNotificationConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig> {
        java.lang.String s3OutputPath;
        java.lang.String kmsKeyId;
        imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig;

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig#getS3OutputPath}
         * @param s3OutputPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#s3_output_path SagemakerEndpointConfiguration#s3_output_path}. This parameter is required.
         * @return {@code this}
         */
        public Builder s3OutputPath(java.lang.String s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig#getKmsKeyId}
         * @param kmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#kms_key_id SagemakerEndpointConfiguration#kms_key_id}.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig#getNotificationConfig}
         * @param notificationConfig notification_config block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#notification_config SagemakerEndpointConfiguration#notification_config}
         * @return {@code this}
         */
        public Builder notificationConfig(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig {
        private final java.lang.String s3OutputPath;
        private final java.lang.String kmsKeyId;
        private final imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3OutputPath = software.amazon.jsii.Kernel.get(this, "s3OutputPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationConfig = software.amazon.jsii.Kernel.get(this, "notificationConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3OutputPath = java.util.Objects.requireNonNull(builder.s3OutputPath, "s3OutputPath is required");
            this.kmsKeyId = builder.kmsKeyId;
            this.notificationConfig = builder.notificationConfig;
        }

        @Override
        public final java.lang.String getS3OutputPath() {
            return this.s3OutputPath;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig getNotificationConfig() {
            return this.notificationConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3OutputPath", om.valueToTree(this.getS3OutputPath()));
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getNotificationConfig() != null) {
                data.set("notificationConfig", om.valueToTree(this.getNotificationConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig.Jsii$Proxy that = (SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig.Jsii$Proxy) o;

            if (!s3OutputPath.equals(that.s3OutputPath)) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            return this.notificationConfig != null ? this.notificationConfig.equals(that.notificationConfig) : that.notificationConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3OutputPath.hashCode();
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.notificationConfig != null ? this.notificationConfig.hashCode() : 0);
            return result;
        }
    }
}
