package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.695Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualRouterSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualRouterSpec.Jsii$Proxy.class)
public interface AppmeshVirtualRouterSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * listener block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_router#listener AppmeshVirtualRouter#listener}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualRouterSpecListener getListener();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualRouterSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualRouterSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualRouterSpec> {
        imports.aws.appmesh.AppmeshVirtualRouterSpecListener listener;

        /**
         * Sets the value of {@link AppmeshVirtualRouterSpec#getListener}
         * @param listener listener block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_router#listener AppmeshVirtualRouter#listener}
         * @return {@code this}
         */
        public Builder listener(imports.aws.appmesh.AppmeshVirtualRouterSpecListener listener) {
            this.listener = listener;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualRouterSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualRouterSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualRouterSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualRouterSpec {
        private final imports.aws.appmesh.AppmeshVirtualRouterSpecListener listener;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.listener = software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualRouterSpecListener.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.listener = java.util.Objects.requireNonNull(builder.listener, "listener is required");
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualRouterSpecListener getListener() {
            return this.listener;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("listener", om.valueToTree(this.getListener()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualRouterSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualRouterSpec.Jsii$Proxy that = (AppmeshVirtualRouterSpec.Jsii$Proxy) o;

            return this.listener.equals(that.listener);
        }

        @Override
        public final int hashCode() {
            int result = this.listener.hashCode();
            return result;
        }
    }
}
