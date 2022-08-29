package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.964Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems")
@software.amazon.jsii.Jsii.Proxy(CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems.Jsii$Proxy.class)
public interface CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * field_patterns block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_profile#field_patterns CloudfrontFieldLevelEncryptionProfile#field_patterns}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsFieldPatterns getFieldPatterns();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_profile#provider_id CloudfrontFieldLevelEncryptionProfile#provider_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getProviderId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_profile#public_key_id CloudfrontFieldLevelEncryptionProfile#public_key_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPublicKeyId();

    /**
     * @return a {@link Builder} of {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems> {
        imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsFieldPatterns fieldPatterns;
        java.lang.String providerId;
        java.lang.String publicKeyId;

        /**
         * Sets the value of {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems#getFieldPatterns}
         * @param fieldPatterns field_patterns block. This parameter is required.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_profile#field_patterns CloudfrontFieldLevelEncryptionProfile#field_patterns}
         * @return {@code this}
         */
        public Builder fieldPatterns(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsFieldPatterns fieldPatterns) {
            this.fieldPatterns = fieldPatterns;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems#getProviderId}
         * @param providerId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_profile#provider_id CloudfrontFieldLevelEncryptionProfile#provider_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder providerId(java.lang.String providerId) {
            this.providerId = providerId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems#getPublicKeyId}
         * @param publicKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_profile#public_key_id CloudfrontFieldLevelEncryptionProfile#public_key_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder publicKeyId(java.lang.String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems {
        private final imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsFieldPatterns fieldPatterns;
        private final java.lang.String providerId;
        private final java.lang.String publicKeyId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fieldPatterns = software.amazon.jsii.Kernel.get(this, "fieldPatterns", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsFieldPatterns.class));
            this.providerId = software.amazon.jsii.Kernel.get(this, "providerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.publicKeyId = software.amazon.jsii.Kernel.get(this, "publicKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fieldPatterns = java.util.Objects.requireNonNull(builder.fieldPatterns, "fieldPatterns is required");
            this.providerId = java.util.Objects.requireNonNull(builder.providerId, "providerId is required");
            this.publicKeyId = java.util.Objects.requireNonNull(builder.publicKeyId, "publicKeyId is required");
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsFieldPatterns getFieldPatterns() {
            return this.fieldPatterns;
        }

        @Override
        public final java.lang.String getProviderId() {
            return this.providerId;
        }

        @Override
        public final java.lang.String getPublicKeyId() {
            return this.publicKeyId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fieldPatterns", om.valueToTree(this.getFieldPatterns()));
            data.set("providerId", om.valueToTree(this.getProviderId()));
            data.set("publicKeyId", om.valueToTree(this.getPublicKeyId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems.Jsii$Proxy that = (CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItems.Jsii$Proxy) o;

            if (!fieldPatterns.equals(that.fieldPatterns)) return false;
            if (!providerId.equals(that.providerId)) return false;
            return this.publicKeyId.equals(that.publicKeyId);
        }

        @Override
        public final int hashCode() {
            int result = this.fieldPatterns.hashCode();
            result = 31 * result + (this.providerId.hashCode());
            result = 31 * result + (this.publicKeyId.hashCode());
            return result;
        }
    }
}
