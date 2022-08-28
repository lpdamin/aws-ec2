package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.356Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption")
@software.amazon.jsii.Jsii.Proxy(GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption.Jsii$Proxy.class)
public interface GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_security_configuration#cloudwatch_encryption_mode GlueSecurityConfiguration#cloudwatch_encryption_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchEncryptionMode() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_security_configuration#kms_key_arn GlueSecurityConfiguration#kms_key_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption> {
        java.lang.String cloudwatchEncryptionMode;
        java.lang.String kmsKeyArn;

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption#getCloudwatchEncryptionMode}
         * @param cloudwatchEncryptionMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_security_configuration#cloudwatch_encryption_mode GlueSecurityConfiguration#cloudwatch_encryption_mode}.
         * @return {@code this}
         */
        public Builder cloudwatchEncryptionMode(java.lang.String cloudwatchEncryptionMode) {
            this.cloudwatchEncryptionMode = cloudwatchEncryptionMode;
            return this;
        }

        /**
         * Sets the value of {@link GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption#getKmsKeyArn}
         * @param kmsKeyArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_security_configuration#kms_key_arn GlueSecurityConfiguration#kms_key_arn}.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption {
        private final java.lang.String cloudwatchEncryptionMode;
        private final java.lang.String kmsKeyArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cloudwatchEncryptionMode = software.amazon.jsii.Kernel.get(this, "cloudwatchEncryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cloudwatchEncryptionMode = builder.cloudwatchEncryptionMode;
            this.kmsKeyArn = builder.kmsKeyArn;
        }

        @Override
        public final java.lang.String getCloudwatchEncryptionMode() {
            return this.cloudwatchEncryptionMode;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCloudwatchEncryptionMode() != null) {
                data.set("cloudwatchEncryptionMode", om.valueToTree(this.getCloudwatchEncryptionMode()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption.Jsii$Proxy that = (GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption.Jsii$Proxy) o;

            if (this.cloudwatchEncryptionMode != null ? !this.cloudwatchEncryptionMode.equals(that.cloudwatchEncryptionMode) : that.cloudwatchEncryptionMode != null) return false;
            return this.kmsKeyArn != null ? this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cloudwatchEncryptionMode != null ? this.cloudwatchEncryptionMode.hashCode() : 0;
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            return result;
        }
    }
}
