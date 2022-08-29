package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.655Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificate")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualGatewaySpecListenerTlsCertificate.Jsii$Proxy.class)
public interface AppmeshVirtualGatewaySpecListenerTlsCertificate extends software.amazon.jsii.JsiiSerializable {

    /**
     * acm block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#acm AppmeshVirtualGateway#acm}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateAcm getAcm() {
        return null;
    }

    /**
     * file block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#file AppmeshVirtualGateway#file}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateFile getFile() {
        return null;
    }

    /**
     * sds block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#sds AppmeshVirtualGateway#sds}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateSds getSds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualGatewaySpecListenerTlsCertificate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualGatewaySpecListenerTlsCertificate}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualGatewaySpecListenerTlsCertificate> {
        imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateAcm acm;
        imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateFile file;
        imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateSds sds;

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecListenerTlsCertificate#getAcm}
         * @param acm acm block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#acm AppmeshVirtualGateway#acm}
         * @return {@code this}
         */
        public Builder acm(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateAcm acm) {
            this.acm = acm;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecListenerTlsCertificate#getFile}
         * @param file file block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#file AppmeshVirtualGateway#file}
         * @return {@code this}
         */
        public Builder file(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateFile file) {
            this.file = file;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecListenerTlsCertificate#getSds}
         * @param sds sds block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#sds AppmeshVirtualGateway#sds}
         * @return {@code this}
         */
        public Builder sds(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualGatewaySpecListenerTlsCertificate}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualGatewaySpecListenerTlsCertificate build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualGatewaySpecListenerTlsCertificate}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualGatewaySpecListenerTlsCertificate {
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateAcm acm;
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateFile file;
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateSds sds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.acm = software.amazon.jsii.Kernel.get(this, "acm", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateAcm.class));
            this.file = software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateFile.class));
            this.sds = software.amazon.jsii.Kernel.get(this, "sds", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateSds.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.acm = builder.acm;
            this.file = builder.file;
            this.sds = builder.sds;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateAcm getAcm() {
            return this.acm;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateFile getFile() {
            return this.file;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificateSds getSds() {
            return this.sds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAcm() != null) {
                data.set("acm", om.valueToTree(this.getAcm()));
            }
            if (this.getFile() != null) {
                data.set("file", om.valueToTree(this.getFile()));
            }
            if (this.getSds() != null) {
                data.set("sds", om.valueToTree(this.getSds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerTlsCertificate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualGatewaySpecListenerTlsCertificate.Jsii$Proxy that = (AppmeshVirtualGatewaySpecListenerTlsCertificate.Jsii$Proxy) o;

            if (this.acm != null ? !this.acm.equals(that.acm) : that.acm != null) return false;
            if (this.file != null ? !this.file.equals(that.file) : that.file != null) return false;
            return this.sds != null ? this.sds.equals(that.sds) : that.sds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.acm != null ? this.acm.hashCode() : 0;
            result = 31 * result + (this.file != null ? this.file.hashCode() : 0);
            result = 31 * result + (this.sds != null ? this.sds.hashCode() : 0);
            return result;
        }
    }
}
