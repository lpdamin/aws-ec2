package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.413Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition")
@software.amazon.jsii.Jsii.Proxy(S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition.Jsii$Proxy.class)
public interface S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#storage_class S3BucketLifecycleConfiguration#storage_class}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStorageClass();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#newer_noncurrent_versions S3BucketLifecycleConfiguration#newer_noncurrent_versions}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNewerNoncurrentVersions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#noncurrent_days S3BucketLifecycleConfiguration#noncurrent_days}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNoncurrentDays() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition> {
        java.lang.String storageClass;
        java.lang.String newerNoncurrentVersions;
        java.lang.Number noncurrentDays;

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition#getStorageClass}
         * @param storageClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#storage_class S3BucketLifecycleConfiguration#storage_class}. This parameter is required.
         * @return {@code this}
         */
        public Builder storageClass(java.lang.String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition#getNewerNoncurrentVersions}
         * @param newerNoncurrentVersions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#newer_noncurrent_versions S3BucketLifecycleConfiguration#newer_noncurrent_versions}.
         * @return {@code this}
         */
        public Builder newerNoncurrentVersions(java.lang.String newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition#getNoncurrentDays}
         * @param noncurrentDays Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#noncurrent_days S3BucketLifecycleConfiguration#noncurrent_days}.
         * @return {@code this}
         */
        public Builder noncurrentDays(java.lang.Number noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition {
        private final java.lang.String storageClass;
        private final java.lang.String newerNoncurrentVersions;
        private final java.lang.Number noncurrentDays;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.storageClass = software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.newerNoncurrentVersions = software.amazon.jsii.Kernel.get(this, "newerNoncurrentVersions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.noncurrentDays = software.amazon.jsii.Kernel.get(this, "noncurrentDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.storageClass = java.util.Objects.requireNonNull(builder.storageClass, "storageClass is required");
            this.newerNoncurrentVersions = builder.newerNoncurrentVersions;
            this.noncurrentDays = builder.noncurrentDays;
        }

        @Override
        public final java.lang.String getStorageClass() {
            return this.storageClass;
        }

        @Override
        public final java.lang.String getNewerNoncurrentVersions() {
            return this.newerNoncurrentVersions;
        }

        @Override
        public final java.lang.Number getNoncurrentDays() {
            return this.noncurrentDays;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("storageClass", om.valueToTree(this.getStorageClass()));
            if (this.getNewerNoncurrentVersions() != null) {
                data.set("newerNoncurrentVersions", om.valueToTree(this.getNewerNoncurrentVersions()));
            }
            if (this.getNoncurrentDays() != null) {
                data.set("noncurrentDays", om.valueToTree(this.getNoncurrentDays()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition.Jsii$Proxy that = (S3BucketLifecycleConfigurationRuleNoncurrentVersionTransition.Jsii$Proxy) o;

            if (!storageClass.equals(that.storageClass)) return false;
            if (this.newerNoncurrentVersions != null ? !this.newerNoncurrentVersions.equals(that.newerNoncurrentVersions) : that.newerNoncurrentVersions != null) return false;
            return this.noncurrentDays != null ? this.noncurrentDays.equals(that.noncurrentDays) : that.noncurrentDays == null;
        }

        @Override
        public final int hashCode() {
            int result = this.storageClass.hashCode();
            result = 31 * result + (this.newerNoncurrentVersions != null ? this.newerNoncurrentVersions.hashCode() : 0);
            result = 31 * result + (this.noncurrentDays != null ? this.noncurrentDays.hashCode() : 0);
            return result;
        }
    }
}
