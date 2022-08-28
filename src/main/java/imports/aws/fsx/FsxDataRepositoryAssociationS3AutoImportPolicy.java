package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.169Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxDataRepositoryAssociationS3AutoImportPolicy")
@software.amazon.jsii.Jsii.Proxy(FsxDataRepositoryAssociationS3AutoImportPolicy.Jsii$Proxy.class)
public interface FsxDataRepositoryAssociationS3AutoImportPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#events FsxDataRepositoryAssociation#events}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEvents() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FsxDataRepositoryAssociationS3AutoImportPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FsxDataRepositoryAssociationS3AutoImportPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FsxDataRepositoryAssociationS3AutoImportPolicy> {
        java.util.List<java.lang.String> events;

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationS3AutoImportPolicy#getEvents}
         * @param events Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#events FsxDataRepositoryAssociation#events}.
         * @return {@code this}
         */
        public Builder events(java.util.List<java.lang.String> events) {
            this.events = events;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FsxDataRepositoryAssociationS3AutoImportPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FsxDataRepositoryAssociationS3AutoImportPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FsxDataRepositoryAssociationS3AutoImportPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FsxDataRepositoryAssociationS3AutoImportPolicy {
        private final java.util.List<java.lang.String> events;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.events = software.amazon.jsii.Kernel.get(this, "events", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.events = builder.events;
        }

        @Override
        public final java.util.List<java.lang.String> getEvents() {
            return this.events;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEvents() != null) {
                data.set("events", om.valueToTree(this.getEvents()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.fsx.FsxDataRepositoryAssociationS3AutoImportPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FsxDataRepositoryAssociationS3AutoImportPolicy.Jsii$Proxy that = (FsxDataRepositoryAssociationS3AutoImportPolicy.Jsii$Proxy) o;

            return this.events != null ? this.events.equals(that.events) : that.events == null;
        }

        @Override
        public final int hashCode() {
            int result = this.events != null ? this.events.hashCode() : 0;
            return result;
        }
    }
}
