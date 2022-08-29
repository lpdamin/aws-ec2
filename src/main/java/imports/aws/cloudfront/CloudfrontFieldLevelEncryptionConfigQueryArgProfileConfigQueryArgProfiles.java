package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.962Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles")
@software.amazon.jsii.Jsii.Proxy(CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles.Jsii$Proxy.class)
public interface CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles extends software.amazon.jsii.JsiiSerializable {

    /**
     * items block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_config#items CloudfrontFieldLevelEncryptionConfig#items}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles> {
        java.lang.Object items;

        /**
         * Sets the value of {@link CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles#getItems}
         * @param items items block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_config#items CloudfrontFieldLevelEncryptionConfig#items}
         * @return {@code this}
         */
        public Builder items(com.hashicorp.cdktf.IResolvable items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles#getItems}
         * @param items items block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_field_level_encryption_config#items CloudfrontFieldLevelEncryptionConfig#items}
         * @return {@code this}
         */
        public Builder items(java.util.List<? extends imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItems> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles {
        private final java.lang.Object items;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = builder.items;
        }

        @Override
        public final java.lang.Object getItems() {
            return this.items;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles.Jsii$Proxy that = (CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles.Jsii$Proxy) o;

            return this.items != null ? this.items.equals(that.items) : that.items == null;
        }

        @Override
        public final int hashCode() {
            int result = this.items != null ? this.items.hashCode() : 0;
            return result;
        }
    }
}
