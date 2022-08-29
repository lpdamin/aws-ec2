package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecTcpRouteTimeout")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecTcpRouteTimeout.Jsii$Proxy.class)
public interface AppmeshRouteSpecTcpRouteTimeout extends software.amazon.jsii.JsiiSerializable {

    /**
     * idle block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#idle AppmeshRoute#idle}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeoutIdle getIdle() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecTcpRouteTimeout}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecTcpRouteTimeout}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecTcpRouteTimeout> {
        imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeoutIdle idle;

        /**
         * Sets the value of {@link AppmeshRouteSpecTcpRouteTimeout#getIdle}
         * @param idle idle block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#idle AppmeshRoute#idle}
         * @return {@code this}
         */
        public Builder idle(imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecTcpRouteTimeout}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecTcpRouteTimeout build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecTcpRouteTimeout}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecTcpRouteTimeout {
        private final imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeoutIdle idle;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.idle = software.amazon.jsii.Kernel.get(this, "idle", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeoutIdle.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.idle = builder.idle;
        }

        @Override
        public final imports.aws.appmesh.AppmeshRouteSpecTcpRouteTimeoutIdle getIdle() {
            return this.idle;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getIdle() != null) {
                data.set("idle", om.valueToTree(this.getIdle()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshRouteSpecTcpRouteTimeout"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecTcpRouteTimeout.Jsii$Proxy that = (AppmeshRouteSpecTcpRouteTimeout.Jsii$Proxy) o;

            return this.idle != null ? this.idle.equals(that.idle) : that.idle == null;
        }

        @Override
        public final int hashCode() {
            int result = this.idle != null ? this.idle.hashCode() : 0;
            return result;
        }
    }
}
