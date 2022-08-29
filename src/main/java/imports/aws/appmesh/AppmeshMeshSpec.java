package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.613Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshMeshSpec")
@software.amazon.jsii.Jsii.Proxy(AppmeshMeshSpec.Jsii$Proxy.class)
public interface AppmeshMeshSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * egress_filter block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_mesh#egress_filter AppmeshMesh#egress_filter}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshMeshSpecEgressFilter getEgressFilter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshMeshSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshMeshSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshMeshSpec> {
        imports.aws.appmesh.AppmeshMeshSpecEgressFilter egressFilter;

        /**
         * Sets the value of {@link AppmeshMeshSpec#getEgressFilter}
         * @param egressFilter egress_filter block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_mesh#egress_filter AppmeshMesh#egress_filter}
         * @return {@code this}
         */
        public Builder egressFilter(imports.aws.appmesh.AppmeshMeshSpecEgressFilter egressFilter) {
            this.egressFilter = egressFilter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshMeshSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshMeshSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshMeshSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshMeshSpec {
        private final imports.aws.appmesh.AppmeshMeshSpecEgressFilter egressFilter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.egressFilter = software.amazon.jsii.Kernel.get(this, "egressFilter", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshMeshSpecEgressFilter.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.egressFilter = builder.egressFilter;
        }

        @Override
        public final imports.aws.appmesh.AppmeshMeshSpecEgressFilter getEgressFilter() {
            return this.egressFilter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEgressFilter() != null) {
                data.set("egressFilter", om.valueToTree(this.getEgressFilter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshMeshSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshMeshSpec.Jsii$Proxy that = (AppmeshMeshSpec.Jsii$Proxy) o;

            return this.egressFilter != null ? this.egressFilter.equals(that.egressFilter) : that.egressFilter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.egressFilter != null ? this.egressFilter.hashCode() : 0;
            return result;
        }
    }
}
