package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.644Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualGatewaySpecBackendDefaults.Jsii$Proxy.class)
public interface AppmeshVirtualGatewaySpecBackendDefaults extends software.amazon.jsii.JsiiSerializable {

    /**
     * client_policy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#client_policy AppmeshVirtualGateway#client_policy}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicy getClientPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualGatewaySpecBackendDefaults}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualGatewaySpecBackendDefaults}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualGatewaySpecBackendDefaults> {
        imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicy clientPolicy;

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecBackendDefaults#getClientPolicy}
         * @param clientPolicy client_policy block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#client_policy AppmeshVirtualGateway#client_policy}
         * @return {@code this}
         */
        public Builder clientPolicy(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicy clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualGatewaySpecBackendDefaults}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualGatewaySpecBackendDefaults build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualGatewaySpecBackendDefaults}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualGatewaySpecBackendDefaults {
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicy clientPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientPolicy = software.amazon.jsii.Kernel.get(this, "clientPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicy.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientPolicy = builder.clientPolicy;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicy getClientPolicy() {
            return this.clientPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientPolicy() != null) {
                data.set("clientPolicy", om.valueToTree(this.getClientPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualGatewaySpecBackendDefaults.Jsii$Proxy that = (AppmeshVirtualGatewaySpecBackendDefaults.Jsii$Proxy) o;

            return this.clientPolicy != null ? this.clientPolicy.equals(that.clientPolicy) : that.clientPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientPolicy != null ? this.clientPolicy.hashCode() : 0;
            return result;
        }
    }
}
