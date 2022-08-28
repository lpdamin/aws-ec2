package imports.aws.storagegateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.800Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.StoragegatewaySmbFileShareCacheAttributes")
@software.amazon.jsii.Jsii.Proxy(StoragegatewaySmbFileShareCacheAttributes.Jsii$Proxy.class)
public interface StoragegatewaySmbFileShareCacheAttributes extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_smb_file_share#cache_stale_timeout_in_seconds StoragegatewaySmbFileShare#cache_stale_timeout_in_seconds}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCacheStaleTimeoutInSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StoragegatewaySmbFileShareCacheAttributes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StoragegatewaySmbFileShareCacheAttributes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StoragegatewaySmbFileShareCacheAttributes> {
        java.lang.Number cacheStaleTimeoutInSeconds;

        /**
         * Sets the value of {@link StoragegatewaySmbFileShareCacheAttributes#getCacheStaleTimeoutInSeconds}
         * @param cacheStaleTimeoutInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_smb_file_share#cache_stale_timeout_in_seconds StoragegatewaySmbFileShare#cache_stale_timeout_in_seconds}.
         * @return {@code this}
         */
        public Builder cacheStaleTimeoutInSeconds(java.lang.Number cacheStaleTimeoutInSeconds) {
            this.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StoragegatewaySmbFileShareCacheAttributes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StoragegatewaySmbFileShareCacheAttributes build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StoragegatewaySmbFileShareCacheAttributes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StoragegatewaySmbFileShareCacheAttributes {
        private final java.lang.Number cacheStaleTimeoutInSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cacheStaleTimeoutInSeconds = software.amazon.jsii.Kernel.get(this, "cacheStaleTimeoutInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cacheStaleTimeoutInSeconds = builder.cacheStaleTimeoutInSeconds;
        }

        @Override
        public final java.lang.Number getCacheStaleTimeoutInSeconds() {
            return this.cacheStaleTimeoutInSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCacheStaleTimeoutInSeconds() != null) {
                data.set("cacheStaleTimeoutInSeconds", om.valueToTree(this.getCacheStaleTimeoutInSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.storagegateway.StoragegatewaySmbFileShareCacheAttributes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StoragegatewaySmbFileShareCacheAttributes.Jsii$Proxy that = (StoragegatewaySmbFileShareCacheAttributes.Jsii$Proxy) o;

            return this.cacheStaleTimeoutInSeconds != null ? this.cacheStaleTimeoutInSeconds.equals(that.cacheStaleTimeoutInSeconds) : that.cacheStaleTimeoutInSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cacheStaleTimeoutInSeconds != null ? this.cacheStaleTimeoutInSeconds.hashCode() : 0;
            return result;
        }
    }
}
