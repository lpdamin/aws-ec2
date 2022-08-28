package imports.aws.acm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.991Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmCertificateOptions")
@software.amazon.jsii.Jsii.Proxy(AcmCertificateOptions.Jsii$Proxy.class)
public interface AcmCertificateOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_transparency_logging_preference AcmCertificate#certificate_transparency_logging_preference}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateTransparencyLoggingPreference() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AcmCertificateOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmCertificateOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmCertificateOptions> {
        java.lang.String certificateTransparencyLoggingPreference;

        /**
         * Sets the value of {@link AcmCertificateOptions#getCertificateTransparencyLoggingPreference}
         * @param certificateTransparencyLoggingPreference Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_transparency_logging_preference AcmCertificate#certificate_transparency_logging_preference}.
         * @return {@code this}
         */
        public Builder certificateTransparencyLoggingPreference(java.lang.String certificateTransparencyLoggingPreference) {
            this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AcmCertificateOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmCertificateOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AcmCertificateOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmCertificateOptions {
        private final java.lang.String certificateTransparencyLoggingPreference;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.certificateTransparencyLoggingPreference = software.amazon.jsii.Kernel.get(this, "certificateTransparencyLoggingPreference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateTransparencyLoggingPreference = builder.certificateTransparencyLoggingPreference;
        }

        @Override
        public final java.lang.String getCertificateTransparencyLoggingPreference() {
            return this.certificateTransparencyLoggingPreference;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCertificateTransparencyLoggingPreference() != null) {
                data.set("certificateTransparencyLoggingPreference", om.valueToTree(this.getCertificateTransparencyLoggingPreference()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.acm.AcmCertificateOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmCertificateOptions.Jsii$Proxy that = (AcmCertificateOptions.Jsii$Proxy) o;

            return this.certificateTransparencyLoggingPreference != null ? this.certificateTransparencyLoggingPreference.equals(that.certificateTransparencyLoggingPreference) : that.certificateTransparencyLoggingPreference == null;
        }

        @Override
        public final int hashCode() {
            int result = this.certificateTransparencyLoggingPreference != null ? this.certificateTransparencyLoggingPreference.hashCode() : 0;
            return result;
        }
    }
}
