package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectCustomPluginLocationS3")
@software.amazon.jsii.Jsii.Proxy(MskconnectCustomPluginLocationS3.Jsii$Proxy.class)
public interface MskconnectCustomPluginLocationS3 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#bucket_arn MskconnectCustomPlugin#bucket_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBucketArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#file_key MskconnectCustomPlugin#file_key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFileKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#object_version MskconnectCustomPlugin#object_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getObjectVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskconnectCustomPluginLocationS3}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectCustomPluginLocationS3}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectCustomPluginLocationS3> {
        java.lang.String bucketArn;
        java.lang.String fileKey;
        java.lang.String objectVersion;

        /**
         * Sets the value of {@link MskconnectCustomPluginLocationS3#getBucketArn}
         * @param bucketArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#bucket_arn MskconnectCustomPlugin#bucket_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketArn(java.lang.String bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        /**
         * Sets the value of {@link MskconnectCustomPluginLocationS3#getFileKey}
         * @param fileKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#file_key MskconnectCustomPlugin#file_key}. This parameter is required.
         * @return {@code this}
         */
        public Builder fileKey(java.lang.String fileKey) {
            this.fileKey = fileKey;
            return this;
        }

        /**
         * Sets the value of {@link MskconnectCustomPluginLocationS3#getObjectVersion}
         * @param objectVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#object_version MskconnectCustomPlugin#object_version}.
         * @return {@code this}
         */
        public Builder objectVersion(java.lang.String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectCustomPluginLocationS3}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectCustomPluginLocationS3 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectCustomPluginLocationS3}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectCustomPluginLocationS3 {
        private final java.lang.String bucketArn;
        private final java.lang.String fileKey;
        private final java.lang.String objectVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketArn = software.amazon.jsii.Kernel.get(this, "bucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileKey = software.amazon.jsii.Kernel.get(this, "fileKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.objectVersion = software.amazon.jsii.Kernel.get(this, "objectVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketArn = java.util.Objects.requireNonNull(builder.bucketArn, "bucketArn is required");
            this.fileKey = java.util.Objects.requireNonNull(builder.fileKey, "fileKey is required");
            this.objectVersion = builder.objectVersion;
        }

        @Override
        public final java.lang.String getBucketArn() {
            return this.bucketArn;
        }

        @Override
        public final java.lang.String getFileKey() {
            return this.fileKey;
        }

        @Override
        public final java.lang.String getObjectVersion() {
            return this.objectVersion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketArn", om.valueToTree(this.getBucketArn()));
            data.set("fileKey", om.valueToTree(this.getFileKey()));
            if (this.getObjectVersion() != null) {
                data.set("objectVersion", om.valueToTree(this.getObjectVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectCustomPluginLocationS3"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectCustomPluginLocationS3.Jsii$Proxy that = (MskconnectCustomPluginLocationS3.Jsii$Proxy) o;

            if (!bucketArn.equals(that.bucketArn)) return false;
            if (!fileKey.equals(that.fileKey)) return false;
            return this.objectVersion != null ? this.objectVersion.equals(that.objectVersion) : that.objectVersion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketArn.hashCode();
            result = 31 * result + (this.fileKey.hashCode());
            result = 31 * result + (this.objectVersion != null ? this.objectVersion.hashCode() : 0);
            return result;
        }
    }
}
