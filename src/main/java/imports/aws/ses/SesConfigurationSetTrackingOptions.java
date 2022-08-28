package imports.aws.ses;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.684Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ses.SesConfigurationSetTrackingOptions")
@software.amazon.jsii.Jsii.Proxy(SesConfigurationSetTrackingOptions.Jsii$Proxy.class)
public interface SesConfigurationSetTrackingOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_configuration_set#custom_redirect_domain SesConfigurationSet#custom_redirect_domain}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCustomRedirectDomain() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SesConfigurationSetTrackingOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesConfigurationSetTrackingOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesConfigurationSetTrackingOptions> {
        java.lang.String customRedirectDomain;

        /**
         * Sets the value of {@link SesConfigurationSetTrackingOptions#getCustomRedirectDomain}
         * @param customRedirectDomain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_configuration_set#custom_redirect_domain SesConfigurationSet#custom_redirect_domain}.
         * @return {@code this}
         */
        public Builder customRedirectDomain(java.lang.String customRedirectDomain) {
            this.customRedirectDomain = customRedirectDomain;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SesConfigurationSetTrackingOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesConfigurationSetTrackingOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SesConfigurationSetTrackingOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesConfigurationSetTrackingOptions {
        private final java.lang.String customRedirectDomain;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.customRedirectDomain = software.amazon.jsii.Kernel.get(this, "customRedirectDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.customRedirectDomain = builder.customRedirectDomain;
        }

        @Override
        public final java.lang.String getCustomRedirectDomain() {
            return this.customRedirectDomain;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCustomRedirectDomain() != null) {
                data.set("customRedirectDomain", om.valueToTree(this.getCustomRedirectDomain()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ses.SesConfigurationSetTrackingOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesConfigurationSetTrackingOptions.Jsii$Proxy that = (SesConfigurationSetTrackingOptions.Jsii$Proxy) o;

            return this.customRedirectDomain != null ? this.customRedirectDomain.equals(that.customRedirectDomain) : that.customRedirectDomain == null;
        }

        @Override
        public final int hashCode() {
            int result = this.customRedirectDomain != null ? this.customRedirectDomain.hashCode() : 0;
            return result;
        }
    }
}
