package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.095Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest")
@software.amazon.jsii.Jsii.Proxy(AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest.Jsii$Proxy.class)
public interface AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#auth_code AppflowConnectorProfile#auth_code}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAuthCode() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#redirect_uri AppflowConnectorProfile#redirect_uri}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRedirectUri() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest> {
        java.lang.String authCode;
        java.lang.String redirectUri;

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest#getAuthCode}
         * @param authCode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#auth_code AppflowConnectorProfile#auth_code}.
         * @return {@code this}
         */
        public Builder authCode(java.lang.String authCode) {
            this.authCode = authCode;
            return this;
        }

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest#getRedirectUri}
         * @param redirectUri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#redirect_uri AppflowConnectorProfile#redirect_uri}.
         * @return {@code this}
         */
        public Builder redirectUri(java.lang.String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest {
        private final java.lang.String authCode;
        private final java.lang.String redirectUri;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.authCode = software.amazon.jsii.Kernel.get(this, "authCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.redirectUri = software.amazon.jsii.Kernel.get(this, "redirectUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authCode = builder.authCode;
            this.redirectUri = builder.redirectUri;
        }

        @Override
        public final java.lang.String getAuthCode() {
            return this.authCode;
        }

        @Override
        public final java.lang.String getRedirectUri() {
            return this.redirectUri;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAuthCode() != null) {
                data.set("authCode", om.valueToTree(this.getAuthCode()));
            }
            if (this.getRedirectUri() != null) {
                data.set("redirectUri", om.valueToTree(this.getRedirectUri()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest.Jsii$Proxy that = (AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsMarketoOauthRequest.Jsii$Proxy) o;

            if (this.authCode != null ? !this.authCode.equals(that.authCode) : that.authCode != null) return false;
            return this.redirectUri != null ? this.redirectUri.equals(that.redirectUri) : that.redirectUri == null;
        }

        @Override
        public final int hashCode() {
            int result = this.authCode != null ? this.authCode.hashCode() : 0;
            result = 31 * result + (this.redirectUri != null ? this.redirectUri.hashCode() : 0);
            return result;
        }
    }
}
