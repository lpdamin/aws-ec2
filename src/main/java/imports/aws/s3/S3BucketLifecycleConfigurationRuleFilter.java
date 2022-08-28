package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.406Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleFilter")
@software.amazon.jsii.Jsii.Proxy(S3BucketLifecycleConfigurationRuleFilter.Jsii$Proxy.class)
public interface S3BucketLifecycleConfigurationRuleFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * and block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#and S3BucketLifecycleConfiguration#and}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd getAnd() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#object_size_greater_than S3BucketLifecycleConfiguration#object_size_greater_than}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getObjectSizeGreaterThan() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#object_size_less_than S3BucketLifecycleConfiguration#object_size_less_than}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getObjectSizeLessThan() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#prefix S3BucketLifecycleConfiguration#prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * tag block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#tag S3BucketLifecycleConfiguration#tag}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag getTag() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketLifecycleConfigurationRuleFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketLifecycleConfigurationRuleFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketLifecycleConfigurationRuleFilter> {
        imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd and;
        java.lang.String objectSizeGreaterThan;
        java.lang.String objectSizeLessThan;
        java.lang.String prefix;
        imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag tag;

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilter#getAnd}
         * @param and and block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#and S3BucketLifecycleConfiguration#and}
         * @return {@code this}
         */
        public Builder and(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd and) {
            this.and = and;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilter#getObjectSizeGreaterThan}
         * @param objectSizeGreaterThan Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#object_size_greater_than S3BucketLifecycleConfiguration#object_size_greater_than}.
         * @return {@code this}
         */
        public Builder objectSizeGreaterThan(java.lang.String objectSizeGreaterThan) {
            this.objectSizeGreaterThan = objectSizeGreaterThan;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilter#getObjectSizeLessThan}
         * @param objectSizeLessThan Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#object_size_less_than S3BucketLifecycleConfiguration#object_size_less_than}.
         * @return {@code this}
         */
        public Builder objectSizeLessThan(java.lang.String objectSizeLessThan) {
            this.objectSizeLessThan = objectSizeLessThan;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilter#getPrefix}
         * @param prefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#prefix S3BucketLifecycleConfiguration#prefix}.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketLifecycleConfigurationRuleFilter#getTag}
         * @param tag tag block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_lifecycle_configuration#tag S3BucketLifecycleConfiguration#tag}
         * @return {@code this}
         */
        public Builder tag(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketLifecycleConfigurationRuleFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketLifecycleConfigurationRuleFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketLifecycleConfigurationRuleFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketLifecycleConfigurationRuleFilter {
        private final imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd and;
        private final java.lang.String objectSizeGreaterThan;
        private final java.lang.String objectSizeLessThan;
        private final java.lang.String prefix;
        private final imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag tag;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.and = software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd.class));
            this.objectSizeGreaterThan = software.amazon.jsii.Kernel.get(this, "objectSizeGreaterThan", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.objectSizeLessThan = software.amazon.jsii.Kernel.get(this, "objectSizeLessThan", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tag = software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.and = builder.and;
            this.objectSizeGreaterThan = builder.objectSizeGreaterThan;
            this.objectSizeLessThan = builder.objectSizeLessThan;
            this.prefix = builder.prefix;
            this.tag = builder.tag;
        }

        @Override
        public final imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd getAnd() {
            return this.and;
        }

        @Override
        public final java.lang.String getObjectSizeGreaterThan() {
            return this.objectSizeGreaterThan;
        }

        @Override
        public final java.lang.String getObjectSizeLessThan() {
            return this.objectSizeLessThan;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag getTag() {
            return this.tag;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnd() != null) {
                data.set("and", om.valueToTree(this.getAnd()));
            }
            if (this.getObjectSizeGreaterThan() != null) {
                data.set("objectSizeGreaterThan", om.valueToTree(this.getObjectSizeGreaterThan()));
            }
            if (this.getObjectSizeLessThan() != null) {
                data.set("objectSizeLessThan", om.valueToTree(this.getObjectSizeLessThan()));
            }
            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }
            if (this.getTag() != null) {
                data.set("tag", om.valueToTree(this.getTag()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketLifecycleConfigurationRuleFilter.Jsii$Proxy that = (S3BucketLifecycleConfigurationRuleFilter.Jsii$Proxy) o;

            if (this.and != null ? !this.and.equals(that.and) : that.and != null) return false;
            if (this.objectSizeGreaterThan != null ? !this.objectSizeGreaterThan.equals(that.objectSizeGreaterThan) : that.objectSizeGreaterThan != null) return false;
            if (this.objectSizeLessThan != null ? !this.objectSizeLessThan.equals(that.objectSizeLessThan) : that.objectSizeLessThan != null) return false;
            if (this.prefix != null ? !this.prefix.equals(that.prefix) : that.prefix != null) return false;
            return this.tag != null ? this.tag.equals(that.tag) : that.tag == null;
        }

        @Override
        public final int hashCode() {
            int result = this.and != null ? this.and.hashCode() : 0;
            result = 31 * result + (this.objectSizeGreaterThan != null ? this.objectSizeGreaterThan.hashCode() : 0);
            result = 31 * result + (this.objectSizeLessThan != null ? this.objectSizeLessThan.hashCode() : 0);
            result = 31 * result + (this.prefix != null ? this.prefix.hashCode() : 0);
            result = 31 * result + (this.tag != null ? this.tag.hashCode() : 0);
            return result;
        }
    }
}
