package imports.aws.cognito;

/**
 * AWS Cognito.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.183Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolClientConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolClientConfig.Jsii$Proxy.class)
public interface CognitoUserPoolClientConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#name CognitoUserPoolClient#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#user_pool_id CognitoUserPoolClient#user_pool_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUserPoolId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#access_token_validity CognitoUserPoolClient#access_token_validity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAccessTokenValidity() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_flows CognitoUserPoolClient#allowed_oauth_flows}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOauthFlows() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_flows_user_pool_client CognitoUserPoolClient#allowed_oauth_flows_user_pool_client}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowedOauthFlowsUserPoolClient() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_scopes CognitoUserPoolClient#allowed_oauth_scopes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOauthScopes() {
        return null;
    }

    /**
     * analytics_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#analytics_configuration CognitoUserPoolClient#analytics_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolClientAnalyticsConfiguration getAnalyticsConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#callback_urls CognitoUserPoolClient#callback_urls}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCallbackUrls() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#default_redirect_uri CognitoUserPoolClient#default_redirect_uri}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRedirectUri() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#enable_propagate_additional_user_context_data CognitoUserPoolClient#enable_propagate_additional_user_context_data}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnablePropagateAdditionalUserContextData() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#enable_token_revocation CognitoUserPoolClient#enable_token_revocation}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableTokenRevocation() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#explicit_auth_flows CognitoUserPoolClient#explicit_auth_flows}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExplicitAuthFlows() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#generate_secret CognitoUserPoolClient#generate_secret}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getGenerateSecret() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#id CognitoUserPoolClient#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#id_token_validity CognitoUserPoolClient#id_token_validity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getIdTokenValidity() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#logout_urls CognitoUserPoolClient#logout_urls}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLogoutUrls() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#prevent_user_existence_errors CognitoUserPoolClient#prevent_user_existence_errors}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreventUserExistenceErrors() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#read_attributes CognitoUserPoolClient#read_attributes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getReadAttributes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#refresh_token_validity CognitoUserPoolClient#refresh_token_validity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRefreshTokenValidity() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#supported_identity_providers CognitoUserPoolClient#supported_identity_providers}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSupportedIdentityProviders() {
        return null;
    }

    /**
     * token_validity_units block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#token_validity_units CognitoUserPoolClient#token_validity_units}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolClientTokenValidityUnits getTokenValidityUnits() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#write_attributes CognitoUserPoolClient#write_attributes}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWriteAttributes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolClientConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolClientConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolClientConfig> {
        java.lang.String name;
        java.lang.String userPoolId;
        java.lang.Number accessTokenValidity;
        java.util.List<java.lang.String> allowedOauthFlows;
        java.lang.Object allowedOauthFlowsUserPoolClient;
        java.util.List<java.lang.String> allowedOauthScopes;
        imports.aws.cognito.CognitoUserPoolClientAnalyticsConfiguration analyticsConfiguration;
        java.util.List<java.lang.String> callbackUrls;
        java.lang.String defaultRedirectUri;
        java.lang.Object enablePropagateAdditionalUserContextData;
        java.lang.Object enableTokenRevocation;
        java.util.List<java.lang.String> explicitAuthFlows;
        java.lang.Object generateSecret;
        java.lang.String id;
        java.lang.Number idTokenValidity;
        java.util.List<java.lang.String> logoutUrls;
        java.lang.String preventUserExistenceErrors;
        java.util.List<java.lang.String> readAttributes;
        java.lang.Number refreshTokenValidity;
        java.util.List<java.lang.String> supportedIdentityProviders;
        imports.aws.cognito.CognitoUserPoolClientTokenValidityUnits tokenValidityUnits;
        java.util.List<java.lang.String> writeAttributes;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#name CognitoUserPoolClient#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getUserPoolId}
         * @param userPoolId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#user_pool_id CognitoUserPoolClient#user_pool_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder userPoolId(java.lang.String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAccessTokenValidity}
         * @param accessTokenValidity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#access_token_validity CognitoUserPoolClient#access_token_validity}.
         * @return {@code this}
         */
        public Builder accessTokenValidity(java.lang.Number accessTokenValidity) {
            this.accessTokenValidity = accessTokenValidity;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthFlows}
         * @param allowedOauthFlows Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_flows CognitoUserPoolClient#allowed_oauth_flows}.
         * @return {@code this}
         */
        public Builder allowedOauthFlows(java.util.List<java.lang.String> allowedOauthFlows) {
            this.allowedOauthFlows = allowedOauthFlows;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthFlowsUserPoolClient}
         * @param allowedOauthFlowsUserPoolClient Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_flows_user_pool_client CognitoUserPoolClient#allowed_oauth_flows_user_pool_client}.
         * @return {@code this}
         */
        public Builder allowedOauthFlowsUserPoolClient(java.lang.Boolean allowedOauthFlowsUserPoolClient) {
            this.allowedOauthFlowsUserPoolClient = allowedOauthFlowsUserPoolClient;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthFlowsUserPoolClient}
         * @param allowedOauthFlowsUserPoolClient Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_flows_user_pool_client CognitoUserPoolClient#allowed_oauth_flows_user_pool_client}.
         * @return {@code this}
         */
        public Builder allowedOauthFlowsUserPoolClient(com.hashicorp.cdktf.IResolvable allowedOauthFlowsUserPoolClient) {
            this.allowedOauthFlowsUserPoolClient = allowedOauthFlowsUserPoolClient;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAllowedOauthScopes}
         * @param allowedOauthScopes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#allowed_oauth_scopes CognitoUserPoolClient#allowed_oauth_scopes}.
         * @return {@code this}
         */
        public Builder allowedOauthScopes(java.util.List<java.lang.String> allowedOauthScopes) {
            this.allowedOauthScopes = allowedOauthScopes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getAnalyticsConfiguration}
         * @param analyticsConfiguration analytics_configuration block.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#analytics_configuration CognitoUserPoolClient#analytics_configuration}
         * @return {@code this}
         */
        public Builder analyticsConfiguration(imports.aws.cognito.CognitoUserPoolClientAnalyticsConfiguration analyticsConfiguration) {
            this.analyticsConfiguration = analyticsConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getCallbackUrls}
         * @param callbackUrls Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#callback_urls CognitoUserPoolClient#callback_urls}.
         * @return {@code this}
         */
        public Builder callbackUrls(java.util.List<java.lang.String> callbackUrls) {
            this.callbackUrls = callbackUrls;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getDefaultRedirectUri}
         * @param defaultRedirectUri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#default_redirect_uri CognitoUserPoolClient#default_redirect_uri}.
         * @return {@code this}
         */
        public Builder defaultRedirectUri(java.lang.String defaultRedirectUri) {
            this.defaultRedirectUri = defaultRedirectUri;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getEnablePropagateAdditionalUserContextData}
         * @param enablePropagateAdditionalUserContextData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#enable_propagate_additional_user_context_data CognitoUserPoolClient#enable_propagate_additional_user_context_data}.
         * @return {@code this}
         */
        public Builder enablePropagateAdditionalUserContextData(java.lang.Boolean enablePropagateAdditionalUserContextData) {
            this.enablePropagateAdditionalUserContextData = enablePropagateAdditionalUserContextData;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getEnablePropagateAdditionalUserContextData}
         * @param enablePropagateAdditionalUserContextData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#enable_propagate_additional_user_context_data CognitoUserPoolClient#enable_propagate_additional_user_context_data}.
         * @return {@code this}
         */
        public Builder enablePropagateAdditionalUserContextData(com.hashicorp.cdktf.IResolvable enablePropagateAdditionalUserContextData) {
            this.enablePropagateAdditionalUserContextData = enablePropagateAdditionalUserContextData;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getEnableTokenRevocation}
         * @param enableTokenRevocation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#enable_token_revocation CognitoUserPoolClient#enable_token_revocation}.
         * @return {@code this}
         */
        public Builder enableTokenRevocation(java.lang.Boolean enableTokenRevocation) {
            this.enableTokenRevocation = enableTokenRevocation;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getEnableTokenRevocation}
         * @param enableTokenRevocation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#enable_token_revocation CognitoUserPoolClient#enable_token_revocation}.
         * @return {@code this}
         */
        public Builder enableTokenRevocation(com.hashicorp.cdktf.IResolvable enableTokenRevocation) {
            this.enableTokenRevocation = enableTokenRevocation;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getExplicitAuthFlows}
         * @param explicitAuthFlows Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#explicit_auth_flows CognitoUserPoolClient#explicit_auth_flows}.
         * @return {@code this}
         */
        public Builder explicitAuthFlows(java.util.List<java.lang.String> explicitAuthFlows) {
            this.explicitAuthFlows = explicitAuthFlows;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getGenerateSecret}
         * @param generateSecret Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#generate_secret CognitoUserPoolClient#generate_secret}.
         * @return {@code this}
         */
        public Builder generateSecret(java.lang.Boolean generateSecret) {
            this.generateSecret = generateSecret;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getGenerateSecret}
         * @param generateSecret Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#generate_secret CognitoUserPoolClient#generate_secret}.
         * @return {@code this}
         */
        public Builder generateSecret(com.hashicorp.cdktf.IResolvable generateSecret) {
            this.generateSecret = generateSecret;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#id CognitoUserPoolClient#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getIdTokenValidity}
         * @param idTokenValidity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#id_token_validity CognitoUserPoolClient#id_token_validity}.
         * @return {@code this}
         */
        public Builder idTokenValidity(java.lang.Number idTokenValidity) {
            this.idTokenValidity = idTokenValidity;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getLogoutUrls}
         * @param logoutUrls Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#logout_urls CognitoUserPoolClient#logout_urls}.
         * @return {@code this}
         */
        public Builder logoutUrls(java.util.List<java.lang.String> logoutUrls) {
            this.logoutUrls = logoutUrls;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getPreventUserExistenceErrors}
         * @param preventUserExistenceErrors Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#prevent_user_existence_errors CognitoUserPoolClient#prevent_user_existence_errors}.
         * @return {@code this}
         */
        public Builder preventUserExistenceErrors(java.lang.String preventUserExistenceErrors) {
            this.preventUserExistenceErrors = preventUserExistenceErrors;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getReadAttributes}
         * @param readAttributes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#read_attributes CognitoUserPoolClient#read_attributes}.
         * @return {@code this}
         */
        public Builder readAttributes(java.util.List<java.lang.String> readAttributes) {
            this.readAttributes = readAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getRefreshTokenValidity}
         * @param refreshTokenValidity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#refresh_token_validity CognitoUserPoolClient#refresh_token_validity}.
         * @return {@code this}
         */
        public Builder refreshTokenValidity(java.lang.Number refreshTokenValidity) {
            this.refreshTokenValidity = refreshTokenValidity;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getSupportedIdentityProviders}
         * @param supportedIdentityProviders Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#supported_identity_providers CognitoUserPoolClient#supported_identity_providers}.
         * @return {@code this}
         */
        public Builder supportedIdentityProviders(java.util.List<java.lang.String> supportedIdentityProviders) {
            this.supportedIdentityProviders = supportedIdentityProviders;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getTokenValidityUnits}
         * @param tokenValidityUnits token_validity_units block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#token_validity_units CognitoUserPoolClient#token_validity_units}
         * @return {@code this}
         */
        public Builder tokenValidityUnits(imports.aws.cognito.CognitoUserPoolClientTokenValidityUnits tokenValidityUnits) {
            this.tokenValidityUnits = tokenValidityUnits;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getWriteAttributes}
         * @param writeAttributes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool_client#write_attributes CognitoUserPoolClient#write_attributes}.
         * @return {@code this}
         */
        public Builder writeAttributes(java.util.List<java.lang.String> writeAttributes) {
            this.writeAttributes = writeAttributes;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolClientConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolClientConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolClientConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolClientConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolClientConfig {
        private final java.lang.String name;
        private final java.lang.String userPoolId;
        private final java.lang.Number accessTokenValidity;
        private final java.util.List<java.lang.String> allowedOauthFlows;
        private final java.lang.Object allowedOauthFlowsUserPoolClient;
        private final java.util.List<java.lang.String> allowedOauthScopes;
        private final imports.aws.cognito.CognitoUserPoolClientAnalyticsConfiguration analyticsConfiguration;
        private final java.util.List<java.lang.String> callbackUrls;
        private final java.lang.String defaultRedirectUri;
        private final java.lang.Object enablePropagateAdditionalUserContextData;
        private final java.lang.Object enableTokenRevocation;
        private final java.util.List<java.lang.String> explicitAuthFlows;
        private final java.lang.Object generateSecret;
        private final java.lang.String id;
        private final java.lang.Number idTokenValidity;
        private final java.util.List<java.lang.String> logoutUrls;
        private final java.lang.String preventUserExistenceErrors;
        private final java.util.List<java.lang.String> readAttributes;
        private final java.lang.Number refreshTokenValidity;
        private final java.util.List<java.lang.String> supportedIdentityProviders;
        private final imports.aws.cognito.CognitoUserPoolClientTokenValidityUnits tokenValidityUnits;
        private final java.util.List<java.lang.String> writeAttributes;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userPoolId = software.amazon.jsii.Kernel.get(this, "userPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessTokenValidity = software.amazon.jsii.Kernel.get(this, "accessTokenValidity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.allowedOauthFlows = software.amazon.jsii.Kernel.get(this, "allowedOauthFlows", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedOauthFlowsUserPoolClient = software.amazon.jsii.Kernel.get(this, "allowedOauthFlowsUserPoolClient", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.allowedOauthScopes = software.amazon.jsii.Kernel.get(this, "allowedOauthScopes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.analyticsConfiguration = software.amazon.jsii.Kernel.get(this, "analyticsConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolClientAnalyticsConfiguration.class));
            this.callbackUrls = software.amazon.jsii.Kernel.get(this, "callbackUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.defaultRedirectUri = software.amazon.jsii.Kernel.get(this, "defaultRedirectUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enablePropagateAdditionalUserContextData = software.amazon.jsii.Kernel.get(this, "enablePropagateAdditionalUserContextData", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.enableTokenRevocation = software.amazon.jsii.Kernel.get(this, "enableTokenRevocation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.explicitAuthFlows = software.amazon.jsii.Kernel.get(this, "explicitAuthFlows", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.generateSecret = software.amazon.jsii.Kernel.get(this, "generateSecret", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.idTokenValidity = software.amazon.jsii.Kernel.get(this, "idTokenValidity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.logoutUrls = software.amazon.jsii.Kernel.get(this, "logoutUrls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.preventUserExistenceErrors = software.amazon.jsii.Kernel.get(this, "preventUserExistenceErrors", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readAttributes = software.amazon.jsii.Kernel.get(this, "readAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.refreshTokenValidity = software.amazon.jsii.Kernel.get(this, "refreshTokenValidity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.supportedIdentityProviders = software.amazon.jsii.Kernel.get(this, "supportedIdentityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tokenValidityUnits = software.amazon.jsii.Kernel.get(this, "tokenValidityUnits", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolClientTokenValidityUnits.class));
            this.writeAttributes = software.amazon.jsii.Kernel.get(this, "writeAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.userPoolId = java.util.Objects.requireNonNull(builder.userPoolId, "userPoolId is required");
            this.accessTokenValidity = builder.accessTokenValidity;
            this.allowedOauthFlows = builder.allowedOauthFlows;
            this.allowedOauthFlowsUserPoolClient = builder.allowedOauthFlowsUserPoolClient;
            this.allowedOauthScopes = builder.allowedOauthScopes;
            this.analyticsConfiguration = builder.analyticsConfiguration;
            this.callbackUrls = builder.callbackUrls;
            this.defaultRedirectUri = builder.defaultRedirectUri;
            this.enablePropagateAdditionalUserContextData = builder.enablePropagateAdditionalUserContextData;
            this.enableTokenRevocation = builder.enableTokenRevocation;
            this.explicitAuthFlows = builder.explicitAuthFlows;
            this.generateSecret = builder.generateSecret;
            this.id = builder.id;
            this.idTokenValidity = builder.idTokenValidity;
            this.logoutUrls = builder.logoutUrls;
            this.preventUserExistenceErrors = builder.preventUserExistenceErrors;
            this.readAttributes = builder.readAttributes;
            this.refreshTokenValidity = builder.refreshTokenValidity;
            this.supportedIdentityProviders = builder.supportedIdentityProviders;
            this.tokenValidityUnits = builder.tokenValidityUnits;
            this.writeAttributes = builder.writeAttributes;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getUserPoolId() {
            return this.userPoolId;
        }

        @Override
        public final java.lang.Number getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOauthFlows() {
            return this.allowedOauthFlows;
        }

        @Override
        public final java.lang.Object getAllowedOauthFlowsUserPoolClient() {
            return this.allowedOauthFlowsUserPoolClient;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOauthScopes() {
            return this.allowedOauthScopes;
        }

        @Override
        public final imports.aws.cognito.CognitoUserPoolClientAnalyticsConfiguration getAnalyticsConfiguration() {
            return this.analyticsConfiguration;
        }

        @Override
        public final java.util.List<java.lang.String> getCallbackUrls() {
            return this.callbackUrls;
        }

        @Override
        public final java.lang.String getDefaultRedirectUri() {
            return this.defaultRedirectUri;
        }

        @Override
        public final java.lang.Object getEnablePropagateAdditionalUserContextData() {
            return this.enablePropagateAdditionalUserContextData;
        }

        @Override
        public final java.lang.Object getEnableTokenRevocation() {
            return this.enableTokenRevocation;
        }

        @Override
        public final java.util.List<java.lang.String> getExplicitAuthFlows() {
            return this.explicitAuthFlows;
        }

        @Override
        public final java.lang.Object getGenerateSecret() {
            return this.generateSecret;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getIdTokenValidity() {
            return this.idTokenValidity;
        }

        @Override
        public final java.util.List<java.lang.String> getLogoutUrls() {
            return this.logoutUrls;
        }

        @Override
        public final java.lang.String getPreventUserExistenceErrors() {
            return this.preventUserExistenceErrors;
        }

        @Override
        public final java.util.List<java.lang.String> getReadAttributes() {
            return this.readAttributes;
        }

        @Override
        public final java.lang.Number getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        @Override
        public final java.util.List<java.lang.String> getSupportedIdentityProviders() {
            return this.supportedIdentityProviders;
        }

        @Override
        public final imports.aws.cognito.CognitoUserPoolClientTokenValidityUnits getTokenValidityUnits() {
            return this.tokenValidityUnits;
        }

        @Override
        public final java.util.List<java.lang.String> getWriteAttributes() {
            return this.writeAttributes;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("userPoolId", om.valueToTree(this.getUserPoolId()));
            if (this.getAccessTokenValidity() != null) {
                data.set("accessTokenValidity", om.valueToTree(this.getAccessTokenValidity()));
            }
            if (this.getAllowedOauthFlows() != null) {
                data.set("allowedOauthFlows", om.valueToTree(this.getAllowedOauthFlows()));
            }
            if (this.getAllowedOauthFlowsUserPoolClient() != null) {
                data.set("allowedOauthFlowsUserPoolClient", om.valueToTree(this.getAllowedOauthFlowsUserPoolClient()));
            }
            if (this.getAllowedOauthScopes() != null) {
                data.set("allowedOauthScopes", om.valueToTree(this.getAllowedOauthScopes()));
            }
            if (this.getAnalyticsConfiguration() != null) {
                data.set("analyticsConfiguration", om.valueToTree(this.getAnalyticsConfiguration()));
            }
            if (this.getCallbackUrls() != null) {
                data.set("callbackUrls", om.valueToTree(this.getCallbackUrls()));
            }
            if (this.getDefaultRedirectUri() != null) {
                data.set("defaultRedirectUri", om.valueToTree(this.getDefaultRedirectUri()));
            }
            if (this.getEnablePropagateAdditionalUserContextData() != null) {
                data.set("enablePropagateAdditionalUserContextData", om.valueToTree(this.getEnablePropagateAdditionalUserContextData()));
            }
            if (this.getEnableTokenRevocation() != null) {
                data.set("enableTokenRevocation", om.valueToTree(this.getEnableTokenRevocation()));
            }
            if (this.getExplicitAuthFlows() != null) {
                data.set("explicitAuthFlows", om.valueToTree(this.getExplicitAuthFlows()));
            }
            if (this.getGenerateSecret() != null) {
                data.set("generateSecret", om.valueToTree(this.getGenerateSecret()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIdTokenValidity() != null) {
                data.set("idTokenValidity", om.valueToTree(this.getIdTokenValidity()));
            }
            if (this.getLogoutUrls() != null) {
                data.set("logoutUrls", om.valueToTree(this.getLogoutUrls()));
            }
            if (this.getPreventUserExistenceErrors() != null) {
                data.set("preventUserExistenceErrors", om.valueToTree(this.getPreventUserExistenceErrors()));
            }
            if (this.getReadAttributes() != null) {
                data.set("readAttributes", om.valueToTree(this.getReadAttributes()));
            }
            if (this.getRefreshTokenValidity() != null) {
                data.set("refreshTokenValidity", om.valueToTree(this.getRefreshTokenValidity()));
            }
            if (this.getSupportedIdentityProviders() != null) {
                data.set("supportedIdentityProviders", om.valueToTree(this.getSupportedIdentityProviders()));
            }
            if (this.getTokenValidityUnits() != null) {
                data.set("tokenValidityUnits", om.valueToTree(this.getTokenValidityUnits()));
            }
            if (this.getWriteAttributes() != null) {
                data.set("writeAttributes", om.valueToTree(this.getWriteAttributes()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoUserPoolClientConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolClientConfig.Jsii$Proxy that = (CognitoUserPoolClientConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!userPoolId.equals(that.userPoolId)) return false;
            if (this.accessTokenValidity != null ? !this.accessTokenValidity.equals(that.accessTokenValidity) : that.accessTokenValidity != null) return false;
            if (this.allowedOauthFlows != null ? !this.allowedOauthFlows.equals(that.allowedOauthFlows) : that.allowedOauthFlows != null) return false;
            if (this.allowedOauthFlowsUserPoolClient != null ? !this.allowedOauthFlowsUserPoolClient.equals(that.allowedOauthFlowsUserPoolClient) : that.allowedOauthFlowsUserPoolClient != null) return false;
            if (this.allowedOauthScopes != null ? !this.allowedOauthScopes.equals(that.allowedOauthScopes) : that.allowedOauthScopes != null) return false;
            if (this.analyticsConfiguration != null ? !this.analyticsConfiguration.equals(that.analyticsConfiguration) : that.analyticsConfiguration != null) return false;
            if (this.callbackUrls != null ? !this.callbackUrls.equals(that.callbackUrls) : that.callbackUrls != null) return false;
            if (this.defaultRedirectUri != null ? !this.defaultRedirectUri.equals(that.defaultRedirectUri) : that.defaultRedirectUri != null) return false;
            if (this.enablePropagateAdditionalUserContextData != null ? !this.enablePropagateAdditionalUserContextData.equals(that.enablePropagateAdditionalUserContextData) : that.enablePropagateAdditionalUserContextData != null) return false;
            if (this.enableTokenRevocation != null ? !this.enableTokenRevocation.equals(that.enableTokenRevocation) : that.enableTokenRevocation != null) return false;
            if (this.explicitAuthFlows != null ? !this.explicitAuthFlows.equals(that.explicitAuthFlows) : that.explicitAuthFlows != null) return false;
            if (this.generateSecret != null ? !this.generateSecret.equals(that.generateSecret) : that.generateSecret != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.idTokenValidity != null ? !this.idTokenValidity.equals(that.idTokenValidity) : that.idTokenValidity != null) return false;
            if (this.logoutUrls != null ? !this.logoutUrls.equals(that.logoutUrls) : that.logoutUrls != null) return false;
            if (this.preventUserExistenceErrors != null ? !this.preventUserExistenceErrors.equals(that.preventUserExistenceErrors) : that.preventUserExistenceErrors != null) return false;
            if (this.readAttributes != null ? !this.readAttributes.equals(that.readAttributes) : that.readAttributes != null) return false;
            if (this.refreshTokenValidity != null ? !this.refreshTokenValidity.equals(that.refreshTokenValidity) : that.refreshTokenValidity != null) return false;
            if (this.supportedIdentityProviders != null ? !this.supportedIdentityProviders.equals(that.supportedIdentityProviders) : that.supportedIdentityProviders != null) return false;
            if (this.tokenValidityUnits != null ? !this.tokenValidityUnits.equals(that.tokenValidityUnits) : that.tokenValidityUnits != null) return false;
            if (this.writeAttributes != null ? !this.writeAttributes.equals(that.writeAttributes) : that.writeAttributes != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.userPoolId.hashCode());
            result = 31 * result + (this.accessTokenValidity != null ? this.accessTokenValidity.hashCode() : 0);
            result = 31 * result + (this.allowedOauthFlows != null ? this.allowedOauthFlows.hashCode() : 0);
            result = 31 * result + (this.allowedOauthFlowsUserPoolClient != null ? this.allowedOauthFlowsUserPoolClient.hashCode() : 0);
            result = 31 * result + (this.allowedOauthScopes != null ? this.allowedOauthScopes.hashCode() : 0);
            result = 31 * result + (this.analyticsConfiguration != null ? this.analyticsConfiguration.hashCode() : 0);
            result = 31 * result + (this.callbackUrls != null ? this.callbackUrls.hashCode() : 0);
            result = 31 * result + (this.defaultRedirectUri != null ? this.defaultRedirectUri.hashCode() : 0);
            result = 31 * result + (this.enablePropagateAdditionalUserContextData != null ? this.enablePropagateAdditionalUserContextData.hashCode() : 0);
            result = 31 * result + (this.enableTokenRevocation != null ? this.enableTokenRevocation.hashCode() : 0);
            result = 31 * result + (this.explicitAuthFlows != null ? this.explicitAuthFlows.hashCode() : 0);
            result = 31 * result + (this.generateSecret != null ? this.generateSecret.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.idTokenValidity != null ? this.idTokenValidity.hashCode() : 0);
            result = 31 * result + (this.logoutUrls != null ? this.logoutUrls.hashCode() : 0);
            result = 31 * result + (this.preventUserExistenceErrors != null ? this.preventUserExistenceErrors.hashCode() : 0);
            result = 31 * result + (this.readAttributes != null ? this.readAttributes.hashCode() : 0);
            result = 31 * result + (this.refreshTokenValidity != null ? this.refreshTokenValidity.hashCode() : 0);
            result = 31 * result + (this.supportedIdentityProviders != null ? this.supportedIdentityProviders.hashCode() : 0);
            result = 31 * result + (this.tokenValidityUnits != null ? this.tokenValidityUnits.hashCode() : 0);
            result = 31 * result + (this.writeAttributes != null ? this.writeAttributes.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
