package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.611Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService")
@software.amazon.jsii.Jsii.Proxy(AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService.Jsii$Proxy.class)
public interface AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#virtual_service_name AppmeshGatewayRoute#virtual_service_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVirtualServiceName();

    /**
     * @return a {@link Builder} of {@link AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService> {
        java.lang.String virtualServiceName;

        /**
         * Sets the value of {@link AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService#getVirtualServiceName}
         * @param virtualServiceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_gateway_route#virtual_service_name AppmeshGatewayRoute#virtual_service_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder virtualServiceName(java.lang.String virtualServiceName) {
            this.virtualServiceName = virtualServiceName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService {
        private final java.lang.String virtualServiceName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.virtualServiceName = software.amazon.jsii.Kernel.get(this, "virtualServiceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.virtualServiceName = java.util.Objects.requireNonNull(builder.virtualServiceName, "virtualServiceName is required");
        }

        @Override
        public final java.lang.String getVirtualServiceName() {
            return this.virtualServiceName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("virtualServiceName", om.valueToTree(this.getVirtualServiceName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService.Jsii$Proxy that = (AppmeshGatewayRouteSpecHttpRouteActionTargetVirtualService.Jsii$Proxy) o;

            return this.virtualServiceName.equals(that.virtualServiceName);
        }

        @Override
        public final int hashCode() {
            int result = this.virtualServiceName.hashCode();
            return result;
        }
    }
}
