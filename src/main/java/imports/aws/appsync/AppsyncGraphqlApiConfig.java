package imports.aws.appsync;

/**
 * AWS AppSync.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.746Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncGraphqlApiConfig")
@software.amazon.jsii.Jsii.Proxy(AppsyncGraphqlApiConfig.Jsii$Proxy.class)
public interface AppsyncGraphqlApiConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#authentication_type AppsyncGraphqlApi#authentication_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#name AppsyncGraphqlApi#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * additional_authentication_provider block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#additional_authentication_provider AppsyncGraphqlApi#additional_authentication_provider}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAdditionalAuthenticationProvider() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#id AppsyncGraphqlApi#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * lambda_authorizer_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#lambda_authorizer_config AppsyncGraphqlApi#lambda_authorizer_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig getLambdaAuthorizerConfig() {
        return null;
    }

    /**
     * log_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#log_config AppsyncGraphqlApi#log_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiLogConfig getLogConfig() {
        return null;
    }

    /**
     * openid_connect_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#openid_connect_config AppsyncGraphqlApi#openid_connect_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig getOpenidConnectConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#schema AppsyncGraphqlApi#schema}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSchema() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags AppsyncGraphqlApi#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags_all AppsyncGraphqlApi#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * user_pool_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#user_pool_config AppsyncGraphqlApi#user_pool_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig getUserPoolConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getXrayEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppsyncGraphqlApiConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppsyncGraphqlApiConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppsyncGraphqlApiConfig> {
        java.lang.String authenticationType;
        java.lang.String name;
        java.lang.Object additionalAuthenticationProvider;
        java.lang.String id;
        imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig lambdaAuthorizerConfig;
        imports.aws.appsync.AppsyncGraphqlApiLogConfig logConfig;
        imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig openidConnectConfig;
        java.lang.String schema;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig userPoolConfig;
        java.lang.Object xrayEnabled;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getAuthenticationType}
         * @param authenticationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#authentication_type AppsyncGraphqlApi#authentication_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder authenticationType(java.lang.String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#name AppsyncGraphqlApi#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getAdditionalAuthenticationProvider}
         * @param additionalAuthenticationProvider additional_authentication_provider block.
         *                                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#additional_authentication_provider AppsyncGraphqlApi#additional_authentication_provider}
         * @return {@code this}
         */
        public Builder additionalAuthenticationProvider(com.hashicorp.cdktf.IResolvable additionalAuthenticationProvider) {
            this.additionalAuthenticationProvider = additionalAuthenticationProvider;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getAdditionalAuthenticationProvider}
         * @param additionalAuthenticationProvider additional_authentication_provider block.
         *                                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#additional_authentication_provider AppsyncGraphqlApi#additional_authentication_provider}
         * @return {@code this}
         */
        public Builder additionalAuthenticationProvider(java.util.List<? extends imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProvider> additionalAuthenticationProvider) {
            this.additionalAuthenticationProvider = additionalAuthenticationProvider;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#id AppsyncGraphqlApi#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getLambdaAuthorizerConfig}
         * @param lambdaAuthorizerConfig lambda_authorizer_config block.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#lambda_authorizer_config AppsyncGraphqlApi#lambda_authorizer_config}
         * @return {@code this}
         */
        public Builder lambdaAuthorizerConfig(imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getLogConfig}
         * @param logConfig log_config block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#log_config AppsyncGraphqlApi#log_config}
         * @return {@code this}
         */
        public Builder logConfig(imports.aws.appsync.AppsyncGraphqlApiLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getOpenidConnectConfig}
         * @param openidConnectConfig openid_connect_config block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#openid_connect_config AppsyncGraphqlApi#openid_connect_config}
         * @return {@code this}
         */
        public Builder openidConnectConfig(imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig openidConnectConfig) {
            this.openidConnectConfig = openidConnectConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getSchema}
         * @param schema Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#schema AppsyncGraphqlApi#schema}.
         * @return {@code this}
         */
        public Builder schema(java.lang.String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags AppsyncGraphqlApi#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#tags_all AppsyncGraphqlApi#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getUserPoolConfig}
         * @param userPoolConfig user_pool_config block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#user_pool_config AppsyncGraphqlApi#user_pool_config}
         * @return {@code this}
         */
        public Builder userPoolConfig(imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig userPoolConfig) {
            this.userPoolConfig = userPoolConfig;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getXrayEnabled}
         * @param xrayEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}.
         * @return {@code this}
         */
        public Builder xrayEnabled(java.lang.Boolean xrayEnabled) {
            this.xrayEnabled = xrayEnabled;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getXrayEnabled}
         * @param xrayEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_graphql_api#xray_enabled AppsyncGraphqlApi#xray_enabled}.
         * @return {@code this}
         */
        public Builder xrayEnabled(com.hashicorp.cdktf.IResolvable xrayEnabled) {
            this.xrayEnabled = xrayEnabled;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getDependsOn}
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
         * Sets the value of {@link AppsyncGraphqlApiConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link AppsyncGraphqlApiConfig#getProvisioners}
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
         * @return a new instance of {@link AppsyncGraphqlApiConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppsyncGraphqlApiConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppsyncGraphqlApiConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppsyncGraphqlApiConfig {
        private final java.lang.String authenticationType;
        private final java.lang.String name;
        private final java.lang.Object additionalAuthenticationProvider;
        private final java.lang.String id;
        private final imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig lambdaAuthorizerConfig;
        private final imports.aws.appsync.AppsyncGraphqlApiLogConfig logConfig;
        private final imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig openidConnectConfig;
        private final java.lang.String schema;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig userPoolConfig;
        private final java.lang.Object xrayEnabled;
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
            this.authenticationType = software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.additionalAuthenticationProvider = software.amazon.jsii.Kernel.get(this, "additionalAuthenticationProvider", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaAuthorizerConfig = software.amazon.jsii.Kernel.get(this, "lambdaAuthorizerConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig.class));
            this.logConfig = software.amazon.jsii.Kernel.get(this, "logConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiLogConfig.class));
            this.openidConnectConfig = software.amazon.jsii.Kernel.get(this, "openidConnectConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig.class));
            this.schema = software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userPoolConfig = software.amazon.jsii.Kernel.get(this, "userPoolConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig.class));
            this.xrayEnabled = software.amazon.jsii.Kernel.get(this, "xrayEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.authenticationType = java.util.Objects.requireNonNull(builder.authenticationType, "authenticationType is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.additionalAuthenticationProvider = builder.additionalAuthenticationProvider;
            this.id = builder.id;
            this.lambdaAuthorizerConfig = builder.lambdaAuthorizerConfig;
            this.logConfig = builder.logConfig;
            this.openidConnectConfig = builder.openidConnectConfig;
            this.schema = builder.schema;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.userPoolConfig = builder.userPoolConfig;
            this.xrayEnabled = builder.xrayEnabled;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getAuthenticationType() {
            return this.authenticationType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getAdditionalAuthenticationProvider() {
            return this.additionalAuthenticationProvider;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.appsync.AppsyncGraphqlApiLambdaAuthorizerConfig getLambdaAuthorizerConfig() {
            return this.lambdaAuthorizerConfig;
        }

        @Override
        public final imports.aws.appsync.AppsyncGraphqlApiLogConfig getLogConfig() {
            return this.logConfig;
        }

        @Override
        public final imports.aws.appsync.AppsyncGraphqlApiOpenidConnectConfig getOpenidConnectConfig() {
            return this.openidConnectConfig;
        }

        @Override
        public final java.lang.String getSchema() {
            return this.schema;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final imports.aws.appsync.AppsyncGraphqlApiUserPoolConfig getUserPoolConfig() {
            return this.userPoolConfig;
        }

        @Override
        public final java.lang.Object getXrayEnabled() {
            return this.xrayEnabled;
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

            data.set("authenticationType", om.valueToTree(this.getAuthenticationType()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdditionalAuthenticationProvider() != null) {
                data.set("additionalAuthenticationProvider", om.valueToTree(this.getAdditionalAuthenticationProvider()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getLambdaAuthorizerConfig() != null) {
                data.set("lambdaAuthorizerConfig", om.valueToTree(this.getLambdaAuthorizerConfig()));
            }
            if (this.getLogConfig() != null) {
                data.set("logConfig", om.valueToTree(this.getLogConfig()));
            }
            if (this.getOpenidConnectConfig() != null) {
                data.set("openidConnectConfig", om.valueToTree(this.getOpenidConnectConfig()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getUserPoolConfig() != null) {
                data.set("userPoolConfig", om.valueToTree(this.getUserPoolConfig()));
            }
            if (this.getXrayEnabled() != null) {
                data.set("xrayEnabled", om.valueToTree(this.getXrayEnabled()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.appsync.AppsyncGraphqlApiConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppsyncGraphqlApiConfig.Jsii$Proxy that = (AppsyncGraphqlApiConfig.Jsii$Proxy) o;

            if (!authenticationType.equals(that.authenticationType)) return false;
            if (!name.equals(that.name)) return false;
            if (this.additionalAuthenticationProvider != null ? !this.additionalAuthenticationProvider.equals(that.additionalAuthenticationProvider) : that.additionalAuthenticationProvider != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.lambdaAuthorizerConfig != null ? !this.lambdaAuthorizerConfig.equals(that.lambdaAuthorizerConfig) : that.lambdaAuthorizerConfig != null) return false;
            if (this.logConfig != null ? !this.logConfig.equals(that.logConfig) : that.logConfig != null) return false;
            if (this.openidConnectConfig != null ? !this.openidConnectConfig.equals(that.openidConnectConfig) : that.openidConnectConfig != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.userPoolConfig != null ? !this.userPoolConfig.equals(that.userPoolConfig) : that.userPoolConfig != null) return false;
            if (this.xrayEnabled != null ? !this.xrayEnabled.equals(that.xrayEnabled) : that.xrayEnabled != null) return false;
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
            int result = this.authenticationType.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.additionalAuthenticationProvider != null ? this.additionalAuthenticationProvider.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.lambdaAuthorizerConfig != null ? this.lambdaAuthorizerConfig.hashCode() : 0);
            result = 31 * result + (this.logConfig != null ? this.logConfig.hashCode() : 0);
            result = 31 * result + (this.openidConnectConfig != null ? this.openidConnectConfig.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.userPoolConfig != null ? this.userPoolConfig.hashCode() : 0);
            result = 31 * result + (this.xrayEnabled != null ? this.xrayEnabled.hashCode() : 0);
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
