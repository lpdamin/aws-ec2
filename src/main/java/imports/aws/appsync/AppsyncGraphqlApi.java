package imports.aws.appsync;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api aws_appsync_graphql_api}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.740Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncGraphqlApi")
public class AppsyncGraphqlApi extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncGraphqlApi(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncGraphqlApi(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appsync.AppsyncGraphqlApi.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api aws_appsync_graphql_api} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppsyncGraphqlApi(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAdditionalAuthenticationProvider(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAdditionalAuthenticationProvider", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLambdaAuthorizerConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLambdaAuthorizerConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiLogConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLogConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOpenidConnectConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig value) {
        software.amazon.jsii.Kernel.call(this, "putOpenidConnectConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserPoolConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig value) {
        software.amazon.jsii.Kernel.call(this, "putUserPoolConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAdditionalAuthenticationProvider() {
        software.amazon.jsii.Kernel.call(this, "resetAdditionalAuthenticationProvider", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaAuthorizerConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaAuthorizerConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLogConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOpenidConnectConfig() {
        software.amazon.jsii.Kernel.call(this, "resetOpenidConnectConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchema() {
        software.amazon.jsii.Kernel.call(this, "resetSchema", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserPoolConfig() {
        software.amazon.jsii.Kernel.call(this, "resetUserPoolConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXrayEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetXrayEnabled", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderList getAdditionalAuthenticationProvider() {
        return software.amazon.jsii.Kernel.get(this, "additionalAuthenticationProvider", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfigOutputReference getLambdaAuthorizerConfig() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAuthorizerConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiLogConfigOutputReference getLogConfig() {
        return software.amazon.jsii.Kernel.get(this, "logConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiLogConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfigOutputReference getOpenidConnectConfig() {
        return software.amazon.jsii.Kernel.get(this, "openidConnectConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getUris() {
        return software.amazon.jsii.Kernel.get(this, "uris", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiUserPoolConfigOutputReference getUserPoolConfig() {
        return software.amazon.jsii.Kernel.get(this, "userPoolConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiUserPoolConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAdditionalAuthenticationProviderInput() {
        return software.amazon.jsii.Kernel.get(this, "additionalAuthenticationProviderInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthenticationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig getLambdaAuthorizerConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAuthorizerConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiLogConfig getLogConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "logConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiLogConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig getOpenidConnectConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "openidConnectConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemaInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig getUserPoolConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "userPoolConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getXrayEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "xrayEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType() {
        return software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthenticationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authenticationType", java.util.Objects.requireNonNull(value, "authenticationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchema() {
        return software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchema(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schema", java.util.Objects.requireNonNull(value, "schema is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getXrayEnabled() {
        return software.amazon.jsii.Kernel.get(this, "xrayEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setXrayEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "xrayEnabled", java.util.Objects.requireNonNull(value, "xrayEnabled is required"));
    }

    public void setXrayEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "xrayEnabled", java.util.Objects.requireNonNull(value, "xrayEnabled is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.appsync.AppsyncGraphqlApi}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appsync.AppsyncGraphqlApi> {
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
        private final imports.aws.appsync.AppsyncGraphqlApiConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appsync.AppsyncGraphqlApiConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#authentication_type AppsyncGraphqlApi#authentication_type}.
         * <p>
         * @return {@code this}
         * @param authenticationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#authentication_type AppsyncGraphqlApi#authentication_type}. This parameter is required.
         */
        public Builder authenticationType(final java.lang.String authenticationType) {
            this.config.authenticationType(authenticationType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#name AppsyncGraphqlApi#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#name AppsyncGraphqlApi#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * additional_authentication_provider block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#additional_authentication_provider AppsyncGraphqlApi#additional_authentication_provider}
         * <p>
         * @return {@code this}
         * @param additionalAuthenticationProvider additional_authentication_provider block. This parameter is required.
         */
        public Builder additionalAuthenticationProvider(final com.hashicorp.cdktf.IResolvable additionalAuthenticationProvider) {
            this.config.additionalAuthenticationProvider(additionalAuthenticationProvider);
            return this;
        }
        /**
         * additional_authentication_provider block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#additional_authentication_provider AppsyncGraphqlApi#additional_authentication_provider}
         * <p>
         * @return {@code this}
         * @param additionalAuthenticationProvider additional_authentication_provider block. This parameter is required.
         */
        public Builder additionalAuthenticationProvider(final java.util.List<? extends imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider) {
            this.config.additionalAuthenticationProvider(additionalAuthenticationProvider);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#id AppsyncGraphqlApi#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#id AppsyncGraphqlApi#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * lambda_authorizer_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#lambda_authorizer_config AppsyncGraphqlApi#lambda_authorizer_config}
         * <p>
         * @return {@code this}
         * @param lambdaAuthorizerConfig lambda_authorizer_config block. This parameter is required.
         */
        public Builder lambdaAuthorizerConfig(final imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig lambdaAuthorizerConfig) {
            this.config.lambdaAuthorizerConfig(lambdaAuthorizerConfig);
            return this;
        }

        /**
         * log_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#log_config AppsyncGraphqlApi#log_config}
         * <p>
         * @return {@code this}
         * @param logConfig log_config block. This parameter is required.
         */
        public Builder logConfig(final imports.aws.appsync.AppsyncGraphqlApiLogConfig logConfig) {
            this.config.logConfig(logConfig);
            return this;
        }

        /**
         * openid_connect_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#openid_connect_config AppsyncGraphqlApi#openid_connect_config}
         * <p>
         * @return {@code this}
         * @param openidConnectConfig openid_connect_config block. This parameter is required.
         */
        public Builder openidConnectConfig(final imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig openidConnectConfig) {
            this.config.openidConnectConfig(openidConnectConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#schema AppsyncGraphqlApi#schema}.
         * <p>
         * @return {@code this}
         * @param schema Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#schema AppsyncGraphqlApi#schema}. This parameter is required.
         */
        public Builder schema(final java.lang.String schema) {
            this.config.schema(schema);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags AppsyncGraphqlApi#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags AppsyncGraphqlApi#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags_all AppsyncGraphqlApi#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags_all AppsyncGraphqlApi#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * user_pool_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#user_pool_config AppsyncGraphqlApi#user_pool_config}
         * <p>
         * @return {@code this}
         * @param userPoolConfig user_pool_config block. This parameter is required.
         */
        public Builder userPoolConfig(final imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig userPoolConfig) {
            this.config.userPoolConfig(userPoolConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}.
         * <p>
         * @return {@code this}
         * @param xrayEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}. This parameter is required.
         */
        public Builder xrayEnabled(final java.lang.Boolean xrayEnabled) {
            this.config.xrayEnabled(xrayEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}.
         * <p>
         * @return {@code this}
         * @param xrayEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}. This parameter is required.
         */
        public Builder xrayEnabled(final com.hashicorp.cdktf.IResolvable xrayEnabled) {
            this.config.xrayEnabled(xrayEnabled);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appsync.AppsyncGraphqlApi}.
         */
        @Override
        public imports.aws.appsync.AppsyncGraphqlApi build() {
            return new imports.aws.appsync.AppsyncGraphqlApi(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
