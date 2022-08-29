package imports.aws.apigateway;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping aws_api_gateway_base_path_mapping}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.450Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayBasePathMapping")
public class ApiGatewayBasePathMapping extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayBasePathMapping(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayBasePathMapping(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.apigateway.ApiGatewayBasePathMapping.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping aws_api_gateway_base_path_mapping} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ApiGatewayBasePathMapping(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.apigateway.ApiGatewayBasePathMappingConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBasePath() {
        software.amazon.jsii.Kernel.call(this, "resetBasePath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStageName() {
        software.amazon.jsii.Kernel.call(this, "resetStageName", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBasePathInput() {
        return software.amazon.jsii.Kernel.get(this, "basePathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStageNameInput() {
        return software.amazon.jsii.Kernel.get(this, "stageNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBasePath() {
        return software.amazon.jsii.Kernel.get(this, "basePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBasePath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "basePath", java.util.Objects.requireNonNull(value, "basePath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainName", java.util.Objects.requireNonNull(value, "domainName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStageName() {
        return software.amazon.jsii.Kernel.get(this, "stageName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStageName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stageName", java.util.Objects.requireNonNull(value, "stageName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.apigateway.ApiGatewayBasePathMapping}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.apigateway.ApiGatewayBasePathMapping> {
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
        private final imports.aws.apigateway.ApiGatewayBasePathMappingConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.apigateway.ApiGatewayBasePathMappingConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#api_id ApiGatewayBasePathMapping#api_id}.
         * <p>
         * @return {@code this}
         * @param apiId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#api_id ApiGatewayBasePathMapping#api_id}. This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#domain_name ApiGatewayBasePathMapping#domain_name}.
         * <p>
         * @return {@code this}
         * @param domainName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#domain_name ApiGatewayBasePathMapping#domain_name}. This parameter is required.
         */
        public Builder domainName(final java.lang.String domainName) {
            this.config.domainName(domainName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#base_path ApiGatewayBasePathMapping#base_path}.
         * <p>
         * @return {@code this}
         * @param basePath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#base_path ApiGatewayBasePathMapping#base_path}. This parameter is required.
         */
        public Builder basePath(final java.lang.String basePath) {
            this.config.basePath(basePath);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#id ApiGatewayBasePathMapping#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#id ApiGatewayBasePathMapping#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#stage_name ApiGatewayBasePathMapping#stage_name}.
         * <p>
         * @return {@code this}
         * @param stageName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_base_path_mapping#stage_name ApiGatewayBasePathMapping#stage_name}. This parameter is required.
         */
        public Builder stageName(final java.lang.String stageName) {
            this.config.stageName(stageName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.apigateway.ApiGatewayBasePathMapping}.
         */
        @Override
        public imports.aws.apigateway.ApiGatewayBasePathMapping build() {
            return new imports.aws.apigateway.ApiGatewayBasePathMapping(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
