package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.607Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteAction")
@software.amazon.jsii.Jsii.Proxy(AppmeshGatewayRouteSpecGrpcRouteAction.Jsii$Proxy.class)
public interface AppmeshGatewayRouteSpecGrpcRouteAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * target block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#target AppmeshGatewayRoute#target}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget getTarget();

    /**
     * @return a {@link Builder} of {@link AppmeshGatewayRouteSpecGrpcRouteAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshGatewayRouteSpecGrpcRouteAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshGatewayRouteSpecGrpcRouteAction> {
        imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget target;

        /**
         * Sets the value of {@link AppmeshGatewayRouteSpecGrpcRouteAction#getTarget}
         * @param target target block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#target AppmeshGatewayRoute#target}
         * @return {@code this}
         */
        public Builder target(imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshGatewayRouteSpecGrpcRouteAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshGatewayRouteSpecGrpcRouteAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshGatewayRouteSpecGrpcRouteAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshGatewayRouteSpecGrpcRouteAction {
        private final imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
        }

        @Override
        public final imports.aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteActionTarget getTarget() {
            return this.target;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("target", om.valueToTree(this.getTarget()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshGatewayRouteSpecGrpcRouteAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshGatewayRouteSpecGrpcRouteAction.Jsii$Proxy that = (AppmeshGatewayRouteSpecGrpcRouteAction.Jsii$Proxy) o;

            return this.target.equals(that.target);
        }

        @Override
        public final int hashCode() {
            int result = this.target.hashCode();
            return result;
        }
    }
}
