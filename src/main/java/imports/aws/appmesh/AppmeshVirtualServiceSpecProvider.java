package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.703Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualServiceSpecProvider")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualServiceSpecProvider.Jsii$Proxy.class)
public interface AppmeshVirtualServiceSpecProvider extends software.amazon.jsii.JsiiSerializable {

    /**
     * virtual_node block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_service#virtual_node AppmeshVirtualService#virtual_node}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode getVirtualNode() {
        return null;
    }

    /**
     * virtual_router block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_service#virtual_router AppmeshVirtualService#virtual_router}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter getVirtualRouter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualServiceSpecProvider}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualServiceSpecProvider}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualServiceSpecProvider> {
        imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode virtualNode;
        imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter virtualRouter;

        /**
         * Sets the value of {@link AppmeshVirtualServiceSpecProvider#getVirtualNode}
         * @param virtualNode virtual_node block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_service#virtual_node AppmeshVirtualService#virtual_node}
         * @return {@code this}
         */
        public Builder virtualNode(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode virtualNode) {
            this.virtualNode = virtualNode;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualServiceSpecProvider#getVirtualRouter}
         * @param virtualRouter virtual_router block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_service#virtual_router AppmeshVirtualService#virtual_router}
         * @return {@code this}
         */
        public Builder virtualRouter(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter virtualRouter) {
            this.virtualRouter = virtualRouter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualServiceSpecProvider}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualServiceSpecProvider build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualServiceSpecProvider}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualServiceSpecProvider {
        private final imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode virtualNode;
        private final imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter virtualRouter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualNode = software.amazon.jsii.Kernel.get(this, "virtualNode", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode.class));
            this.virtualRouter = software.amazon.jsii.Kernel.get(this, "virtualRouter", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualNode = builder.virtualNode;
            this.virtualRouter = builder.virtualRouter;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode getVirtualNode() {
            return this.virtualNode;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter getVirtualRouter() {
            return this.virtualRouter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVirtualNode() != null) {
                data.set("virtualNode", om.valueToTree(this.getVirtualNode()));
            }
            if (this.getVirtualRouter() != null) {
                data.set("virtualRouter", om.valueToTree(this.getVirtualRouter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualServiceSpecProvider"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualServiceSpecProvider.Jsii$Proxy that = (AppmeshVirtualServiceSpecProvider.Jsii$Proxy) o;

            if (this.virtualNode != null ? !this.virtualNode.equals(that.virtualNode) : that.virtualNode != null) return false;
            return this.virtualRouter != null ? this.virtualRouter.equals(that.virtualRouter) : that.virtualRouter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.virtualNode != null ? this.virtualNode.hashCode() : 0;
            result = 31 * result + (this.virtualRouter != null ? this.virtualRouter.hashCode() : 0);
            return result;
        }
    }
}
