package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.610Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttpRouteAction")
@software.amazon.jsii.Jsii.Proxy(AppmeshGatewayRouteSpecHttpRouteAction.Jsii$Proxy.class)
public interface AppmeshGatewayRouteSpecHttpRouteAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * target block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#target AppmeshGatewayRoute#target}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTarget getTarget();

    /**
     * rewrite block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#rewrite AppmeshGatewayRoute#rewrite}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite getRewrite() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshGatewayRouteSpecHttpRouteAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshGatewayRouteSpecHttpRouteAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshGatewayRouteSpecHttpRouteAction> {
        imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTarget target;
        imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite rewrite;

        /**
         * Sets the value of {@link AppmeshGatewayRouteSpecHttpRouteAction#getTarget}
         * @param target target block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#target AppmeshGatewayRoute#target}
         * @return {@code this}
         */
        public Builder target(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTarget target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshGatewayRouteSpecHttpRouteAction#getRewrite}
         * @param rewrite rewrite block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#rewrite AppmeshGatewayRoute#rewrite}
         * @return {@code this}
         */
        public Builder rewrite(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite rewrite) {
            this.rewrite = rewrite;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshGatewayRouteSpecHttpRouteAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshGatewayRouteSpecHttpRouteAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshGatewayRouteSpecHttpRouteAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshGatewayRouteSpecHttpRouteAction {
        private final imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTarget target;
        private final imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite rewrite;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTarget.class));
            this.rewrite = software.amazon.jsii.Kernel.get(this, "rewrite", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
            this.rewrite = builder.rewrite;
        }

        @Override
        public final imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTarget getTarget() {
            return this.target;
        }

        @Override
        public final imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite getRewrite() {
            return this.rewrite;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("target", om.valueToTree(this.getTarget()));
            if (this.getRewrite() != null) {
                data.set("rewrite", om.valueToTree(this.getRewrite()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttpRouteAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshGatewayRouteSpecHttpRouteAction.Jsii$Proxy that = (AppmeshGatewayRouteSpecHttpRouteAction.Jsii$Proxy) o;

            if (!target.equals(that.target)) return false;
            return this.rewrite != null ? this.rewrite.equals(that.rewrite) : that.rewrite == null;
        }

        @Override
        public final int hashCode() {
            int result = this.target.hashCode();
            result = 31 * result + (this.rewrite != null ? this.rewrite.hashCode() : 0);
            return result;
        }
    }
}
