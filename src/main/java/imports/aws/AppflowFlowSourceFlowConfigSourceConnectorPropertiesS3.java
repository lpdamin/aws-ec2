package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.027Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3")
@software.amazon.jsii.Jsii.Proxy(AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3.Jsii$Proxy.class)
public interface AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_flow#bucket_name AppflowFlow#bucket_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBucketName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_flow#bucket_prefix AppflowFlow#bucket_prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return null;
    }

    /**
     * s3_input_format_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#s3_input_format_config AppflowFlow#s3_input_format_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfig getS3InputFormatConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3> {
        java.lang.String bucketName;
        java.lang.String bucketPrefix;
        imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfig s3InputFormatConfig;

        /**
         * Sets the value of {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3#getBucketName}
         * @param bucketName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_flow#bucket_name AppflowFlow#bucket_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3#getBucketPrefix}
         * @param bucketPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_flow#bucket_prefix AppflowFlow#bucket_prefix}.
         * @return {@code this}
         */
        public Builder bucketPrefix(java.lang.String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3#getS3InputFormatConfig}
         * @param s3InputFormatConfig s3_input_format_config block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#s3_input_format_config AppflowFlow#s3_input_format_config}
         * @return {@code this}
         */
        public Builder s3InputFormatConfig(imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfig s3InputFormatConfig) {
            this.s3InputFormatConfig = s3InputFormatConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3 {
        private final java.lang.String bucketName;
        private final java.lang.String bucketPrefix;
        private final imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfig s3InputFormatConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketPrefix = software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3InputFormatConfig = software.amazon.jsii.Kernel.get(this, "s3InputFormatConfig", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketName = java.util.Objects.requireNonNull(builder.bucketName, "bucketName is required");
            this.bucketPrefix = builder.bucketPrefix;
            this.s3InputFormatConfig = builder.s3InputFormatConfig;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getBucketPrefix() {
            return this.bucketPrefix;
        }

        @Override
        public final imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfig getS3InputFormatConfig() {
            return this.s3InputFormatConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketName", om.valueToTree(this.getBucketName()));
            if (this.getBucketPrefix() != null) {
                data.set("bucketPrefix", om.valueToTree(this.getBucketPrefix()));
            }
            if (this.getS3InputFormatConfig() != null) {
                data.set("s3InputFormatConfig", om.valueToTree(this.getS3InputFormatConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3.Jsii$Proxy that = (AppflowFlowSourceFlowConfigSourceConnectorPropertiesS3.Jsii$Proxy) o;

            if (!bucketName.equals(that.bucketName)) return false;
            if (this.bucketPrefix != null ? !this.bucketPrefix.equals(that.bucketPrefix) : that.bucketPrefix != null) return false;
            return this.s3InputFormatConfig != null ? this.s3InputFormatConfig.equals(that.s3InputFormatConfig) : that.s3InputFormatConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketName.hashCode();
            result = 31 * result + (this.bucketPrefix != null ? this.bucketPrefix.hashCode() : 0);
            result = 31 * result + (this.s3InputFormatConfig != null ? this.s3InputFormatConfig.hashCode() : 0);
            return result;
        }
    }
}
