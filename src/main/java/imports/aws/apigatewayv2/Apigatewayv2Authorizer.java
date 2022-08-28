package imports.aws.apigatewayv2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer aws_apigatewayv2_authorizer}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.250Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigatewayv2.Apigatewayv2Authorizer")
public class Apigatewayv2Authorizer extends com.hashicorp.cdktf.TerraformResource {

    protected Apigatewayv2Authorizer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2Authorizer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.apigatewayv2.Apigatewayv2Authorizer.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer aws_apigatewayv2_authorizer} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Apigatewayv2Authorizer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.apigatewayv2.Apigatewayv2AuthorizerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putJwtConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putJwtConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAuthorizerCredentialsArn() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerCredentialsArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizerPayloadFormatVersion() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerPayloadFormatVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizerResultTtlInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerResultTtlInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthorizerUri() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizerUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableSimpleResponses() {
        software.amazon.jsii.Kernel.call(this, "resetEnableSimpleResponses", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdentitySources() {
        software.amazon.jsii.Kernel.call(this, "resetIdentitySources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJwtConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetJwtConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfigurationOutputReference getJwtConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "jwtConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerCredentialsArnInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerCredentialsArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerPayloadFormatVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerPayloadFormatVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAuthorizerResultTtlInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerResultTtlInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerUriInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableSimpleResponsesInput() {
        return software.amazon.jsii.Kernel.get(this, "enableSimpleResponsesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIdentitySourcesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "identitySourcesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration getJwtConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "jwtConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerCredentialsArn() {
        return software.amazon.jsii.Kernel.get(this, "authorizerCredentialsArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerCredentialsArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerCredentialsArn", java.util.Objects.requireNonNull(value, "authorizerCredentialsArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerPayloadFormatVersion() {
        return software.amazon.jsii.Kernel.get(this, "authorizerPayloadFormatVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerPayloadFormatVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerPayloadFormatVersion", java.util.Objects.requireNonNull(value, "authorizerPayloadFormatVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAuthorizerResultTtlInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "authorizerResultTtlInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAuthorizerResultTtlInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "authorizerResultTtlInSeconds", java.util.Objects.requireNonNull(value, "authorizerResultTtlInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerType() {
        return software.amazon.jsii.Kernel.get(this, "authorizerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerType", java.util.Objects.requireNonNull(value, "authorizerType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerUri() {
        return software.amazon.jsii.Kernel.get(this, "authorizerUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerUri", java.util.Objects.requireNonNull(value, "authorizerUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableSimpleResponses() {
        return software.amazon.jsii.Kernel.get(this, "enableSimpleResponses", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableSimpleResponses(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableSimpleResponses", java.util.Objects.requireNonNull(value, "enableSimpleResponses is required"));
    }

    public void setEnableSimpleResponses(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableSimpleResponses", java.util.Objects.requireNonNull(value, "enableSimpleResponses is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdentitySources() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "identitySources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIdentitySources(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "identitySources", java.util.Objects.requireNonNull(value, "identitySources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.apigatewayv2.Apigatewayv2Authorizer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.apigatewayv2.Apigatewayv2Authorizer> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.apigatewayv2.Apigatewayv2AuthorizerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.apigatewayv2.Apigatewayv2AuthorizerConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#api_id Apigatewayv2Authorizer#api_id}.
         * <p>
         * @return {@code this}
         * @param apiId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#api_id Apigatewayv2Authorizer#api_id}. This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_type Apigatewayv2Authorizer#authorizer_type}.
         * <p>
         * @return {@code this}
         * @param authorizerType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_type Apigatewayv2Authorizer#authorizer_type}. This parameter is required.
         */
        public Builder authorizerType(final java.lang.String authorizerType) {
            this.config.authorizerType(authorizerType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#name Apigatewayv2Authorizer#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#name Apigatewayv2Authorizer#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_credentials_arn Apigatewayv2Authorizer#authorizer_credentials_arn}.
         * <p>
         * @return {@code this}
         * @param authorizerCredentialsArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_credentials_arn Apigatewayv2Authorizer#authorizer_credentials_arn}. This parameter is required.
         */
        public Builder authorizerCredentialsArn(final java.lang.String authorizerCredentialsArn) {
            this.config.authorizerCredentialsArn(authorizerCredentialsArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_payload_format_version Apigatewayv2Authorizer#authorizer_payload_format_version}.
         * <p>
         * @return {@code this}
         * @param authorizerPayloadFormatVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_payload_format_version Apigatewayv2Authorizer#authorizer_payload_format_version}. This parameter is required.
         */
        public Builder authorizerPayloadFormatVersion(final java.lang.String authorizerPayloadFormatVersion) {
            this.config.authorizerPayloadFormatVersion(authorizerPayloadFormatVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_result_ttl_in_seconds Apigatewayv2Authorizer#authorizer_result_ttl_in_seconds}.
         * <p>
         * @return {@code this}
         * @param authorizerResultTtlInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_result_ttl_in_seconds Apigatewayv2Authorizer#authorizer_result_ttl_in_seconds}. This parameter is required.
         */
        public Builder authorizerResultTtlInSeconds(final java.lang.Number authorizerResultTtlInSeconds) {
            this.config.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_uri Apigatewayv2Authorizer#authorizer_uri}.
         * <p>
         * @return {@code this}
         * @param authorizerUri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#authorizer_uri Apigatewayv2Authorizer#authorizer_uri}. This parameter is required.
         */
        public Builder authorizerUri(final java.lang.String authorizerUri) {
            this.config.authorizerUri(authorizerUri);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#enable_simple_responses Apigatewayv2Authorizer#enable_simple_responses}.
         * <p>
         * @return {@code this}
         * @param enableSimpleResponses Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#enable_simple_responses Apigatewayv2Authorizer#enable_simple_responses}. This parameter is required.
         */
        public Builder enableSimpleResponses(final java.lang.Boolean enableSimpleResponses) {
            this.config.enableSimpleResponses(enableSimpleResponses);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#enable_simple_responses Apigatewayv2Authorizer#enable_simple_responses}.
         * <p>
         * @return {@code this}
         * @param enableSimpleResponses Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#enable_simple_responses Apigatewayv2Authorizer#enable_simple_responses}. This parameter is required.
         */
        public Builder enableSimpleResponses(final com.hashicorp.cdktf.IResolvable enableSimpleResponses) {
            this.config.enableSimpleResponses(enableSimpleResponses);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#id Apigatewayv2Authorizer#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#id Apigatewayv2Authorizer#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#identity_sources Apigatewayv2Authorizer#identity_sources}.
         * <p>
         * @return {@code this}
         * @param identitySources Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#identity_sources Apigatewayv2Authorizer#identity_sources}. This parameter is required.
         */
        public Builder identitySources(final java.util.List<java.lang.String> identitySources) {
            this.config.identitySources(identitySources);
            return this;
        }

        /**
         * jwt_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apigatewayv2_authorizer#jwt_configuration Apigatewayv2Authorizer#jwt_configuration}
         * <p>
         * @return {@code this}
         * @param jwtConfiguration jwt_configuration block. This parameter is required.
         */
        public Builder jwtConfiguration(final imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration jwtConfiguration) {
            this.config.jwtConfiguration(jwtConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.apigatewayv2.Apigatewayv2Authorizer}.
         */
        @Override
        public imports.aws.apigatewayv2.Apigatewayv2Authorizer build() {
            return new imports.aws.apigatewayv2.Apigatewayv2Authorizer(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
