package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.597Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualRouterSpecListener")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualRouterSpecListener.Jsii$Proxy.class)
public interface AppmeshVirtualRouterSpecListener extends software.amazon.jsii.JsiiSerializable {

    /**
     * port_mapping block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_router#port_mapping AppmeshVirtualRouter#port_mapping}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping getPortMapping();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualRouterSpecListener}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualRouterSpecListener}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualRouterSpecListener> {
        imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping portMapping;

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpecListener#getPortMapping}
         * @param portMapping port_mapping block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_router#port_mapping AppmeshVirtualRouter#port_mapping}
         * @return {@code this}
         */
        public Builder portMapping(imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping portMapping) {
            this.portMapping = portMapping;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualRouterSpecListener}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualRouterSpecListener build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualRouterSpecListener}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualRouterSpecListener {
        private final imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping portMapping;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.portMapping = software.amazon.jsii.Kernel.get(this, "portMapping", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.portMapping = java.util.Objects.requireNonNull(builder.portMapping, "portMapping is required");
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping getPortMapping() {
            return this.portMapping;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("portMapping", om.valueToTree(this.getPortMapping()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualRouterSpecListener"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualRouterSpecListener.Jsii$Proxy that = (AppmeshVirtualRouterSpecListener.Jsii$Proxy) o;

            return this.portMapping.equals(that.portMapping);
        }

        @Override
        public final int hashCode() {
            int result = this.portMapping.hashCode();
            return result;
        }
    }
}
