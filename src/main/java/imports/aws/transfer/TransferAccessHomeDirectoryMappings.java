package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.819Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferAccessHomeDirectoryMappings")
@software.amazon.jsii.Jsii.Proxy(TransferAccessHomeDirectoryMappings.Jsii$Proxy.class)
public interface TransferAccessHomeDirectoryMappings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/transfer_access#entry TransferAccess#entry}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEntry();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/transfer_access#target TransferAccess#target}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTarget();

    /**
     * @return a {@link Builder} of {@link TransferAccessHomeDirectoryMappings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TransferAccessHomeDirectoryMappings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TransferAccessHomeDirectoryMappings> {
        java.lang.String entry;
        java.lang.String target;

        /**
         * Sets the value of {@link TransferAccessHomeDirectoryMappings#getEntry}
         * @param entry Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/transfer_access#entry TransferAccess#entry}. This parameter is required.
         * @return {@code this}
         */
        public Builder entry(java.lang.String entry) {
            this.entry = entry;
            return this;
        }

        /**
         * Sets the value of {@link TransferAccessHomeDirectoryMappings#getTarget}
         * @param target Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/transfer_access#target TransferAccess#target}. This parameter is required.
         * @return {@code this}
         */
        public Builder target(java.lang.String target) {
            this.target = target;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TransferAccessHomeDirectoryMappings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TransferAccessHomeDirectoryMappings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link TransferAccessHomeDirectoryMappings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TransferAccessHomeDirectoryMappings {
        private final java.lang.String entry;
        private final java.lang.String target;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.entry = software.amazon.jsii.Kernel.get(this, "entry", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.entry = java.util.Objects.requireNonNull(builder.entry, "entry is required");
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
        }

        @Override
        public final java.lang.String getEntry() {
            return this.entry;
        }

        @Override
        public final java.lang.String getTarget() {
            return this.target;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("entry", om.valueToTree(this.getEntry()));
            data.set("target", om.valueToTree(this.getTarget()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.transfer.TransferAccessHomeDirectoryMappings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TransferAccessHomeDirectoryMappings.Jsii$Proxy that = (TransferAccessHomeDirectoryMappings.Jsii$Proxy) o;

            if (!entry.equals(that.entry)) return false;
            return this.target.equals(that.target);
        }

        @Override
        public final int hashCode() {
            int result = this.entry.hashCode();
            result = 31 * result + (this.target.hashCode());
            return result;
        }
    }
}
