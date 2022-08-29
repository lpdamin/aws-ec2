package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketInventoryFilter")
@software.amazon.jsii.Jsii.Proxy(S3BucketInventoryFilter.Jsii$Proxy.class)
public interface S3BucketInventoryFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_inventory#prefix S3BucketInventory#prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketInventoryFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketInventoryFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketInventoryFilter> {
        java.lang.String prefix;

        /**
         * Sets the value of {@link S3BucketInventoryFilter#getPrefix}
         * @param prefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_inventory#prefix S3BucketInventory#prefix}.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketInventoryFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketInventoryFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketInventoryFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketInventoryFilter {
        private final java.lang.String prefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prefix = builder.prefix;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPrefix() != null) {
                data.set("prefix", om.valueToTree(this.getPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketInventoryFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketInventoryFilter.Jsii$Proxy that = (S3BucketInventoryFilter.Jsii$Proxy) o;

            return this.prefix != null ? this.prefix.equals(that.prefix) : that.prefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.prefix != null ? this.prefix.hashCode() : 0;
            return result;
        }
    }
}
