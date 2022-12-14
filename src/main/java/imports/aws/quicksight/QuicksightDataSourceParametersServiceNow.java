package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.195Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersServiceNow")
@software.amazon.jsii.Jsii.Proxy(QuicksightDataSourceParametersServiceNow.Jsii$Proxy.class)
public interface QuicksightDataSourceParametersServiceNow extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#site_base_url QuicksightDataSource#site_base_url}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSiteBaseUrl();

    /**
     * @return a {@link Builder} of {@link QuicksightDataSourceParametersServiceNow}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link QuicksightDataSourceParametersServiceNow}
     */
    public static final class Builder implements software.amazon.jsii.Builder<QuicksightDataSourceParametersServiceNow> {
        java.lang.String siteBaseUrl;

        /**
         * Sets the value of {@link QuicksightDataSourceParametersServiceNow#getSiteBaseUrl}
         * @param siteBaseUrl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#site_base_url QuicksightDataSource#site_base_url}. This parameter is required.
         * @return {@code this}
         */
        public Builder siteBaseUrl(java.lang.String siteBaseUrl) {
            this.siteBaseUrl = siteBaseUrl;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link QuicksightDataSourceParametersServiceNow}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public QuicksightDataSourceParametersServiceNow build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link QuicksightDataSourceParametersServiceNow}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements QuicksightDataSourceParametersServiceNow {
        private final java.lang.String siteBaseUrl;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.siteBaseUrl = software.amazon.jsii.Kernel.get(this, "siteBaseUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.siteBaseUrl = java.util.Objects.requireNonNull(builder.siteBaseUrl, "siteBaseUrl is required");
        }

        @Override
        public final java.lang.String getSiteBaseUrl() {
            return this.siteBaseUrl;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("siteBaseUrl", om.valueToTree(this.getSiteBaseUrl()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.quicksight.QuicksightDataSourceParametersServiceNow"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            QuicksightDataSourceParametersServiceNow.Jsii$Proxy that = (QuicksightDataSourceParametersServiceNow.Jsii$Proxy) o;

            return this.siteBaseUrl.equals(that.siteBaseUrl);
        }

        @Override
        public final int hashCode() {
            int result = this.siteBaseUrl.hashCode();
            return result;
        }
    }
}
