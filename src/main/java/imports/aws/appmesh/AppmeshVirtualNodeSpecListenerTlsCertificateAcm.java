package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.690Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerTlsCertificateAcm.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerTlsCertificateAcm extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#certificate_arn AppmeshVirtualNode#certificate_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerTlsCertificateAcm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerTlsCertificateAcm}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerTlsCertificateAcm> {
        java.lang.String certificateArn;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsCertificateAcm#getCertificateArn}
         * @param certificateArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#certificate_arn AppmeshVirtualNode#certificate_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder certificateArn(java.lang.String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerTlsCertificateAcm}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerTlsCertificateAcm build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerTlsCertificateAcm}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerTlsCertificateAcm {
        private final java.lang.String certificateArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.certificateArn = software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateArn = java.util.Objects.requireNonNull(builder.certificateArn, "certificateArn is required");
        }

        @Override
        public final java.lang.String getCertificateArn() {
            return this.certificateArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("certificateArn", om.valueToTree(this.getCertificateArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsCertificateAcm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerTlsCertificateAcm.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerTlsCertificateAcm.Jsii$Proxy) o;

            return this.certificateArn.equals(that.certificateArn);
        }

        @Override
        public final int hashCode() {
            int result = this.certificateArn.hashCode();
            return result;
        }
    }
}
