package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.532Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings")
@software.amazon.jsii.Jsii.Proxy(SagemakerUserProfileUserSettingsSharingSettings.Jsii$Proxy.class)
public interface SagemakerUserProfileUserSettingsSharingSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#notebook_output_option SagemakerUserProfile#notebook_output_option}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNotebookOutputOption() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#s3_kms_key_id SagemakerUserProfile#s3_kms_key_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3KmsKeyId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#s3_output_path SagemakerUserProfile#s3_output_path}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3OutputPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerUserProfileUserSettingsSharingSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerUserProfileUserSettingsSharingSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerUserProfileUserSettingsSharingSettings> {
        java.lang.String notebookOutputOption;
        java.lang.String s3KmsKeyId;
        java.lang.String s3OutputPath;

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettingsSharingSettings#getNotebookOutputOption}
         * @param notebookOutputOption Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#notebook_output_option SagemakerUserProfile#notebook_output_option}.
         * @return {@code this}
         */
        public Builder notebookOutputOption(java.lang.String notebookOutputOption) {
            this.notebookOutputOption = notebookOutputOption;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettingsSharingSettings#getS3KmsKeyId}
         * @param s3KmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#s3_kms_key_id SagemakerUserProfile#s3_kms_key_id}.
         * @return {@code this}
         */
        public Builder s3KmsKeyId(java.lang.String s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettingsSharingSettings#getS3OutputPath}
         * @param s3OutputPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#s3_output_path SagemakerUserProfile#s3_output_path}.
         * @return {@code this}
         */
        public Builder s3OutputPath(java.lang.String s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerUserProfileUserSettingsSharingSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerUserProfileUserSettingsSharingSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerUserProfileUserSettingsSharingSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerUserProfileUserSettingsSharingSettings {
        private final java.lang.String notebookOutputOption;
        private final java.lang.String s3KmsKeyId;
        private final java.lang.String s3OutputPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.notebookOutputOption = software.amazon.jsii.Kernel.get(this, "notebookOutputOption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3KmsKeyId = software.amazon.jsii.Kernel.get(this, "s3KmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3OutputPath = software.amazon.jsii.Kernel.get(this, "s3OutputPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.notebookOutputOption = builder.notebookOutputOption;
            this.s3KmsKeyId = builder.s3KmsKeyId;
            this.s3OutputPath = builder.s3OutputPath;
        }

        @Override
        public final java.lang.String getNotebookOutputOption() {
            return this.notebookOutputOption;
        }

        @Override
        public final java.lang.String getS3KmsKeyId() {
            return this.s3KmsKeyId;
        }

        @Override
        public final java.lang.String getS3OutputPath() {
            return this.s3OutputPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNotebookOutputOption() != null) {
                data.set("notebookOutputOption", om.valueToTree(this.getNotebookOutputOption()));
            }
            if (this.getS3KmsKeyId() != null) {
                data.set("s3KmsKeyId", om.valueToTree(this.getS3KmsKeyId()));
            }
            if (this.getS3OutputPath() != null) {
                data.set("s3OutputPath", om.valueToTree(this.getS3OutputPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerUserProfileUserSettingsSharingSettings.Jsii$Proxy that = (SagemakerUserProfileUserSettingsSharingSettings.Jsii$Proxy) o;

            if (this.notebookOutputOption != null ? !this.notebookOutputOption.equals(that.notebookOutputOption) : that.notebookOutputOption != null) return false;
            if (this.s3KmsKeyId != null ? !this.s3KmsKeyId.equals(that.s3KmsKeyId) : that.s3KmsKeyId != null) return false;
            return this.s3OutputPath != null ? this.s3OutputPath.equals(that.s3OutputPath) : that.s3OutputPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.notebookOutputOption != null ? this.notebookOutputOption.hashCode() : 0;
            result = 31 * result + (this.s3KmsKeyId != null ? this.s3KmsKeyId.hashCode() : 0);
            result = 31 * result + (this.s3OutputPath != null ? this.s3OutputPath.hashCode() : 0);
            return result;
        }
    }
}
