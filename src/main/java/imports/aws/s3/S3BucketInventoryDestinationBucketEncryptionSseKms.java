package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKms")
@software.amazon.jsii.Jsii.Proxy(S3BucketInventoryDestinationBucketEncryptionSseKms.Jsii$Proxy.class)
public interface S3BucketInventoryDestinationBucketEncryptionSseKms extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_inventory#key_id S3BucketInventory#key_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKeyId();

    /**
     * @return a {@link Builder} of {@link S3BucketInventoryDestinationBucketEncryptionSseKms}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketInventoryDestinationBucketEncryptionSseKms}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketInventoryDestinationBucketEncryptionSseKms> {
        java.lang.String keyId;

        /**
         * Sets the value of {@link S3BucketInventoryDestinationBucketEncryptionSseKms#getKeyId}
         * @param keyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_inventory#key_id S3BucketInventory#key_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder keyId(java.lang.String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketInventoryDestinationBucketEncryptionSseKms}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketInventoryDestinationBucketEncryptionSseKms build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketInventoryDestinationBucketEncryptionSseKms}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketInventoryDestinationBucketEncryptionSseKms {
        private final java.lang.String keyId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.keyId = software.amazon.jsii.Kernel.get(this, "keyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.keyId = java.util.Objects.requireNonNull(builder.keyId, "keyId is required");
        }

        @Override
        public final java.lang.String getKeyId() {
            return this.keyId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("keyId", om.valueToTree(this.getKeyId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKms"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketInventoryDestinationBucketEncryptionSseKms.Jsii$Proxy that = (S3BucketInventoryDestinationBucketEncryptionSseKms.Jsii$Proxy) o;

            return this.keyId.equals(that.keyId);
        }

        @Override
        public final int hashCode() {
            int result = this.keyId.hashCode();
            return result;
        }
    }
}
