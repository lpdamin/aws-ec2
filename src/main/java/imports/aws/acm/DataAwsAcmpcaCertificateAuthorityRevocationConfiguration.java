package imports.aws.acm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.422Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfiguration")
@software.amazon.jsii.Jsii.Proxy(DataAwsAcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy.class)
public interface DataAwsAcmpcaCertificateAuthorityRevocationConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * crl_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/acmpca_certificate_authority#crl_configuration DataAwsAcmpcaCertificateAuthority#crl_configuration}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCrlConfiguration() {
        return null;
    }

    /**
     * ocsp_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/acmpca_certificate_authority#ocsp_configuration DataAwsAcmpcaCertificateAuthority#ocsp_configuration}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOcspConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsAcmpcaCertificateAuthorityRevocationConfiguration> {
        java.lang.Object crlConfiguration;
        java.lang.Object ocspConfiguration;

        /**
         * Sets the value of {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration#getCrlConfiguration}
         * @param crlConfiguration crl_configuration block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/acmpca_certificate_authority#crl_configuration DataAwsAcmpcaCertificateAuthority#crl_configuration}
         * @return {@code this}
         */
        public Builder crlConfiguration(com.hashicorp.cdktf.IResolvable crlConfiguration) {
            this.crlConfiguration = crlConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration#getCrlConfiguration}
         * @param crlConfiguration crl_configuration block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/acmpca_certificate_authority#crl_configuration DataAwsAcmpcaCertificateAuthority#crl_configuration}
         * @return {@code this}
         */
        public Builder crlConfiguration(java.util.List<? extends imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfiguration) {
            this.crlConfiguration = crlConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration#getOcspConfiguration}
         * @param ocspConfiguration ocsp_configuration block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/acmpca_certificate_authority#ocsp_configuration DataAwsAcmpcaCertificateAuthority#ocsp_configuration}
         * @return {@code this}
         */
        public Builder ocspConfiguration(com.hashicorp.cdktf.IResolvable ocspConfiguration) {
            this.ocspConfiguration = ocspConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration#getOcspConfiguration}
         * @param ocspConfiguration ocsp_configuration block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/acmpca_certificate_authority#ocsp_configuration DataAwsAcmpcaCertificateAuthority#ocsp_configuration}
         * @return {@code this}
         */
        public Builder ocspConfiguration(java.util.List<? extends imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOcspConfiguration> ocspConfiguration) {
            this.ocspConfiguration = ocspConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsAcmpcaCertificateAuthorityRevocationConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsAcmpcaCertificateAuthorityRevocationConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsAcmpcaCertificateAuthorityRevocationConfiguration {
        private final java.lang.Object crlConfiguration;
        private final java.lang.Object ocspConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.crlConfiguration = software.amazon.jsii.Kernel.get(this, "crlConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ocspConfiguration = software.amazon.jsii.Kernel.get(this, "ocspConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.crlConfiguration = builder.crlConfiguration;
            this.ocspConfiguration = builder.ocspConfiguration;
        }

        @Override
        public final java.lang.Object getCrlConfiguration() {
            return this.crlConfiguration;
        }

        @Override
        public final java.lang.Object getOcspConfiguration() {
            return this.ocspConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCrlConfiguration() != null) {
                data.set("crlConfiguration", om.valueToTree(this.getCrlConfiguration()));
            }
            if (this.getOcspConfiguration() != null) {
                data.set("ocspConfiguration", om.valueToTree(this.getOcspConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsAcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy that = (DataAwsAcmpcaCertificateAuthorityRevocationConfiguration.Jsii$Proxy) o;

            if (this.crlConfiguration != null ? !this.crlConfiguration.equals(that.crlConfiguration) : that.crlConfiguration != null) return false;
            return this.ocspConfiguration != null ? this.ocspConfiguration.equals(that.ocspConfiguration) : that.ocspConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.crlConfiguration != null ? this.crlConfiguration.hashCode() : 0;
            result = 31 * result + (this.ocspConfiguration != null ? this.ocspConfiguration.hashCode() : 0);
            return result;
        }
    }
}
