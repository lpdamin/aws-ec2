package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.540Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerWorkforceOidcConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerWorkforceOidcConfig.Jsii$Proxy.class)
public interface SagemakerWorkforceOidcConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#authorization_endpoint SagemakerWorkforce#authorization_endpoint}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationEndpoint();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#client_id SagemakerWorkforce#client_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getClientId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#client_secret SagemakerWorkforce#client_secret}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getClientSecret();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#issuer SagemakerWorkforce#issuer}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIssuer();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#jwks_uri SagemakerWorkforce#jwks_uri}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getJwksUri();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#logout_endpoint SagemakerWorkforce#logout_endpoint}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLogoutEndpoint();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#token_endpoint SagemakerWorkforce#token_endpoint}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTokenEndpoint();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#user_info_endpoint SagemakerWorkforce#user_info_endpoint}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUserInfoEndpoint();

    /**
     * @return a {@link Builder} of {@link SagemakerWorkforceOidcConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerWorkforceOidcConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerWorkforceOidcConfig> {
        java.lang.String authorizationEndpoint;
        java.lang.String clientId;
        java.lang.String clientSecret;
        java.lang.String issuer;
        java.lang.String jwksUri;
        java.lang.String logoutEndpoint;
        java.lang.String tokenEndpoint;
        java.lang.String userInfoEndpoint;

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getAuthorizationEndpoint}
         * @param authorizationEndpoint Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#authorization_endpoint SagemakerWorkforce#authorization_endpoint}. This parameter is required.
         * @return {@code this}
         */
        public Builder authorizationEndpoint(java.lang.String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getClientId}
         * @param clientId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#client_id SagemakerWorkforce#client_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder clientId(java.lang.String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getClientSecret}
         * @param clientSecret Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#client_secret SagemakerWorkforce#client_secret}. This parameter is required.
         * @return {@code this}
         */
        public Builder clientSecret(java.lang.String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getIssuer}
         * @param issuer Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#issuer SagemakerWorkforce#issuer}. This parameter is required.
         * @return {@code this}
         */
        public Builder issuer(java.lang.String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getJwksUri}
         * @param jwksUri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#jwks_uri SagemakerWorkforce#jwks_uri}. This parameter is required.
         * @return {@code this}
         */
        public Builder jwksUri(java.lang.String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getLogoutEndpoint}
         * @param logoutEndpoint Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#logout_endpoint SagemakerWorkforce#logout_endpoint}. This parameter is required.
         * @return {@code this}
         */
        public Builder logoutEndpoint(java.lang.String logoutEndpoint) {
            this.logoutEndpoint = logoutEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getTokenEndpoint}
         * @param tokenEndpoint Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#token_endpoint SagemakerWorkforce#token_endpoint}. This parameter is required.
         * @return {@code this}
         */
        public Builder tokenEndpoint(java.lang.String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkforceOidcConfig#getUserInfoEndpoint}
         * @param userInfoEndpoint Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#user_info_endpoint SagemakerWorkforce#user_info_endpoint}. This parameter is required.
         * @return {@code this}
         */
        public Builder userInfoEndpoint(java.lang.String userInfoEndpoint) {
            this.userInfoEndpoint = userInfoEndpoint;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerWorkforceOidcConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerWorkforceOidcConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerWorkforceOidcConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerWorkforceOidcConfig {
        private final java.lang.String authorizationEndpoint;
        private final java.lang.String clientId;
        private final java.lang.String clientSecret;
        private final java.lang.String issuer;
        private final java.lang.String jwksUri;
        private final java.lang.String logoutEndpoint;
        private final java.lang.String tokenEndpoint;
        private final java.lang.String userInfoEndpoint;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.authorizationEndpoint = software.amazon.jsii.Kernel.get(this, "authorizationEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientId = software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientSecret = software.amazon.jsii.Kernel.get(this, "clientSecret", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.issuer = software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jwksUri = software.amazon.jsii.Kernel.get(this, "jwksUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.logoutEndpoint = software.amazon.jsii.Kernel.get(this, "logoutEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tokenEndpoint = software.amazon.jsii.Kernel.get(this, "tokenEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userInfoEndpoint = software.amazon.jsii.Kernel.get(this, "userInfoEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.authorizationEndpoint = java.util.Objects.requireNonNull(builder.authorizationEndpoint, "authorizationEndpoint is required");
            this.clientId = java.util.Objects.requireNonNull(builder.clientId, "clientId is required");
            this.clientSecret = java.util.Objects.requireNonNull(builder.clientSecret, "clientSecret is required");
            this.issuer = java.util.Objects.requireNonNull(builder.issuer, "issuer is required");
            this.jwksUri = java.util.Objects.requireNonNull(builder.jwksUri, "jwksUri is required");
            this.logoutEndpoint = java.util.Objects.requireNonNull(builder.logoutEndpoint, "logoutEndpoint is required");
            this.tokenEndpoint = java.util.Objects.requireNonNull(builder.tokenEndpoint, "tokenEndpoint is required");
            this.userInfoEndpoint = java.util.Objects.requireNonNull(builder.userInfoEndpoint, "userInfoEndpoint is required");
        }

        @Override
        public final java.lang.String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        @Override
        public final java.lang.String getClientId() {
            return this.clientId;
        }

        @Override
        public final java.lang.String getClientSecret() {
            return this.clientSecret;
        }

        @Override
        public final java.lang.String getIssuer() {
            return this.issuer;
        }

        @Override
        public final java.lang.String getJwksUri() {
            return this.jwksUri;
        }

        @Override
        public final java.lang.String getLogoutEndpoint() {
            return this.logoutEndpoint;
        }

        @Override
        public final java.lang.String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        @Override
        public final java.lang.String getUserInfoEndpoint() {
            return this.userInfoEndpoint;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("authorizationEndpoint", om.valueToTree(this.getAuthorizationEndpoint()));
            data.set("clientId", om.valueToTree(this.getClientId()));
            data.set("clientSecret", om.valueToTree(this.getClientSecret()));
            data.set("issuer", om.valueToTree(this.getIssuer()));
            data.set("jwksUri", om.valueToTree(this.getJwksUri()));
            data.set("logoutEndpoint", om.valueToTree(this.getLogoutEndpoint()));
            data.set("tokenEndpoint", om.valueToTree(this.getTokenEndpoint()));
            data.set("userInfoEndpoint", om.valueToTree(this.getUserInfoEndpoint()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerWorkforceOidcConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerWorkforceOidcConfig.Jsii$Proxy that = (SagemakerWorkforceOidcConfig.Jsii$Proxy) o;

            if (!authorizationEndpoint.equals(that.authorizationEndpoint)) return false;
            if (!clientId.equals(that.clientId)) return false;
            if (!clientSecret.equals(that.clientSecret)) return false;
            if (!issuer.equals(that.issuer)) return false;
            if (!jwksUri.equals(that.jwksUri)) return false;
            if (!logoutEndpoint.equals(that.logoutEndpoint)) return false;
            if (!tokenEndpoint.equals(that.tokenEndpoint)) return false;
            return this.userInfoEndpoint.equals(that.userInfoEndpoint);
        }

        @Override
        public final int hashCode() {
            int result = this.authorizationEndpoint.hashCode();
            result = 31 * result + (this.clientId.hashCode());
            result = 31 * result + (this.clientSecret.hashCode());
            result = 31 * result + (this.issuer.hashCode());
            result = 31 * result + (this.jwksUri.hashCode());
            result = 31 * result + (this.logoutEndpoint.hashCode());
            result = 31 * result + (this.tokenEndpoint.hashCode());
            result = 31 * result + (this.userInfoEndpoint.hashCode());
            return result;
        }
    }
}
