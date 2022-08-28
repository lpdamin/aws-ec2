package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.589Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTls")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerTls.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerTls extends software.amazon.jsii.JsiiSerializable {

    /**
     * certificate block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#certificate AppmeshVirtualNode#certificate}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate getCertificate();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#mode AppmeshVirtualNode#mode}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMode();

    /**
     * validation block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#validation AppmeshVirtualNode#validation}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation getValidation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerTls}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerTls}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerTls> {
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate certificate;
        java.lang.String mode;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation validation;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTls#getCertificate}
         * @param certificate certificate block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#certificate AppmeshVirtualNode#certificate}
         * @return {@code this}
         */
        public Builder certificate(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTls#getMode}
         * @param mode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#mode AppmeshVirtualNode#mode}. This parameter is required.
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTls#getValidation}
         * @param validation validation block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#validation AppmeshVirtualNode#validation}
         * @return {@code this}
         */
        public Builder validation(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation validation) {
            this.validation = validation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerTls}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerTls build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerTls}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerTls {
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate certificate;
        private final java.lang.String mode;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation validation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.certificate = software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate.class));
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.validation = software.amazon.jsii.Kernel.get(this, "validation", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificate = java.util.Objects.requireNonNull(builder.certificate, "certificate is required");
            this.mode = java.util.Objects.requireNonNull(builder.mode, "mode is required");
            this.validation = builder.validation;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificate getCertificate() {
            return this.certificate;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidation getValidation() {
            return this.validation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("certificate", om.valueToTree(this.getCertificate()));
            data.set("mode", om.valueToTree(this.getMode()));
            if (this.getValidation() != null) {
                data.set("validation", om.valueToTree(this.getValidation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTls"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerTls.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerTls.Jsii$Proxy) o;

            if (!certificate.equals(that.certificate)) return false;
            if (!mode.equals(that.mode)) return false;
            return this.validation != null ? this.validation.equals(that.validation) : that.validation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.certificate.hashCode();
            result = 31 * result + (this.mode.hashCode());
            result = 31 * result + (this.validation != null ? this.validation.hashCode() : 0);
            return result;
        }
    }
}
