package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.471Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecTcpRoute")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecTcpRoute.Jsii$Proxy.class)
public interface AppmeshRouteSpecTcpRoute extends software.amazon.jsii.JsiiSerializable {

    /**
     * action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#action AppmeshRoute#action}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction getAction();

    /**
     * timeout block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#timeout AppmeshRoute#timeout}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeout getTimeout() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecTcpRoute}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecTcpRoute}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecTcpRoute> {
        imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction action;
        imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeout timeout;

        /**
         * Sets the value of {@link AppmeshRouteSpecTcpRoute#getAction}
         * @param action action block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#action AppmeshRoute#action}
         * @return {@code this}
         */
        public Builder action(imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecTcpRoute#getTimeout}
         * @param timeout timeout block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#timeout AppmeshRoute#timeout}
         * @return {@code this}
         */
        public Builder timeout(imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecTcpRoute}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecTcpRoute build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecTcpRoute}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecTcpRoute {
        private final imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction action;
        private final imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeout timeout;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction.class));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeout.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.action = java.util.Objects.requireNonNull(builder.action, "action is required");
            this.timeout = builder.timeout;
        }

        @Override
        public final imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction getAction() {
            return this.action;
        }

        @Override
        public final imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeout getTimeout() {
            return this.timeout;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("action", om.valueToTree(this.getAction()));
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshRouteSpecTcpRoute"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecTcpRoute.Jsii$Proxy that = (AppmeshRouteSpecTcpRoute.Jsii$Proxy) o;

            if (!action.equals(that.action)) return false;
            return this.timeout != null ? this.timeout.equals(that.timeout) : that.timeout == null;
        }

        @Override
        public final int hashCode() {
            int result = this.action.hashCode();
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            return result;
        }
    }
}
