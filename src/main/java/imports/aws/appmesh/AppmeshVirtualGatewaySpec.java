package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.477Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualGatewaySpec.Jsii$Proxy.class)
public interface AppmeshVirtualGatewaySpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * listener block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#listener AppmeshVirtualGateway#listener}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListener getListener();

    /**
     * backend_defaults block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#backend_defaults AppmeshVirtualGateway#backend_defaults}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults getBackendDefaults() {
        return null;
    }

    /**
     * logging block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#logging AppmeshVirtualGateway#logging}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecLogging getLogging() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualGatewaySpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualGatewaySpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualGatewaySpec> {
        imports.aws.appmesh.AppmeshVirtualGatewaySpecListener listener;
        imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults backendDefaults;
        imports.aws.appmesh.AppmeshVirtualGatewaySpecLogging logging;

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpec#getListener}
         * @param listener listener block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#listener AppmeshVirtualGateway#listener}
         * @return {@code this}
         */
        public Builder listener(imports.aws.appmesh.AppmeshVirtualGatewaySpecListener listener) {
            this.listener = listener;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpec#getBackendDefaults}
         * @param backendDefaults backend_defaults block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#backend_defaults AppmeshVirtualGateway#backend_defaults}
         * @return {@code this}
         */
        public Builder backendDefaults(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults backendDefaults) {
            this.backendDefaults = backendDefaults;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpec#getLogging}
         * @param logging logging block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#logging AppmeshVirtualGateway#logging}
         * @return {@code this}
         */
        public Builder logging(imports.aws.appmesh.AppmeshVirtualGatewaySpecLogging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualGatewaySpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualGatewaySpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualGatewaySpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualGatewaySpec {
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecListener listener;
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults backendDefaults;
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecLogging logging;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.listener = software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListener.class));
            this.backendDefaults = software.amazon.jsii.Kernel.get(this, "backendDefaults", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults.class));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecLogging.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.listener = java.util.Objects.requireNonNull(builder.listener, "listener is required");
            this.backendDefaults = builder.backendDefaults;
            this.logging = builder.logging;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecListener getListener() {
            return this.listener;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaults getBackendDefaults() {
            return this.backendDefaults;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecLogging getLogging() {
            return this.logging;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("listener", om.valueToTree(this.getListener()));
            if (this.getBackendDefaults() != null) {
                data.set("backendDefaults", om.valueToTree(this.getBackendDefaults()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualGatewaySpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualGatewaySpec.Jsii$Proxy that = (AppmeshVirtualGatewaySpec.Jsii$Proxy) o;

            if (!listener.equals(that.listener)) return false;
            if (this.backendDefaults != null ? !this.backendDefaults.equals(that.backendDefaults) : that.backendDefaults != null) return false;
            return this.logging != null ? this.logging.equals(that.logging) : that.logging == null;
        }

        @Override
        public final int hashCode() {
            int result = this.listener.hashCode();
            result = 31 * result + (this.backendDefaults != null ? this.backendDefaults.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            return result;
        }
    }
}
