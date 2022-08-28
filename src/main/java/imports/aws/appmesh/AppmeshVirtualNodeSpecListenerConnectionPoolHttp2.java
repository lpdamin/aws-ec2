package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.583Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerConnectionPoolHttp2.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#max_requests AppmeshVirtualNode#max_requests}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxRequests();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerConnectionPoolHttp2}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerConnectionPoolHttp2}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerConnectionPoolHttp2> {
        java.lang.Number maxRequests;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerConnectionPoolHttp2#getMaxRequests}
         * @param maxRequests Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#max_requests AppmeshVirtualNode#max_requests}. This parameter is required.
         * @return {@code this}
         */
        public Builder maxRequests(java.lang.Number maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerConnectionPoolHttp2}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerConnectionPoolHttp2}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 {
        private final java.lang.Number maxRequests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxRequests = software.amazon.jsii.Kernel.get(this, "maxRequests", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxRequests = java.util.Objects.requireNonNull(builder.maxRequests, "maxRequests is required");
        }

        @Override
        public final java.lang.Number getMaxRequests() {
            return this.maxRequests;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxRequests", om.valueToTree(this.getMaxRequests()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerConnectionPoolHttp2.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerConnectionPoolHttp2.Jsii$Proxy) o;

            return this.maxRequests.equals(that.maxRequests);
        }

        @Override
        public final int hashCode() {
            int result = this.maxRequests.hashCode();
            return result;
        }
    }
}
