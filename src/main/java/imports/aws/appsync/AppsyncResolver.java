package imports.aws.appsync;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver aws_appsync_resolver}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.762Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncResolver")
public class AppsyncResolver extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncResolver(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncResolver(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appsync.AppsyncResolver.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver aws_appsync_resolver} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppsyncResolver(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCachingConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverCachingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putCachingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPipelineConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverPipelineConfig value) {
        software.amazon.jsii.Kernel.call(this, "putPipelineConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSyncConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverSyncConfig value) {
        software.amazon.jsii.Kernel.call(this, "putSyncConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCachingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetCachingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataSource() {
        software.amazon.jsii.Kernel.call(this, "resetDataSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKind() {
        software.amazon.jsii.Kernel.call(this, "resetKind", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxBatchSize() {
        software.amazon.jsii.Kernel.call(this, "resetMaxBatchSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPipelineConfig() {
        software.amazon.jsii.Kernel.call(this, "resetPipelineConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetRequestTemplate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResponseTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetResponseTemplate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSyncConfig() {
        software.amazon.jsii.Kernel.call(this, "resetSyncConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverCachingConfigOutputReference getCachingConfig() {
        return software.amazon.jsii.Kernel.get(this, "cachingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncResolverCachingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverPipelineConfigOutputReference getPipelineConfig() {
        return software.amazon.jsii.Kernel.get(this, "pipelineConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncResolverPipelineConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncResolverSyncConfigOutputReference getSyncConfig() {
        return software.amazon.jsii.Kernel.get(this, "syncConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncResolverSyncConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncResolverCachingConfig getCachingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "cachingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncResolverCachingConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "dataSourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKindInput() {
        return software.amazon.jsii.Kernel.get(this, "kindInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxBatchSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxBatchSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncResolverPipelineConfig getPipelineConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "pipelineConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncResolverPipelineConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "requestTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResponseTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "responseTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncResolverSyncConfig getSyncConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "syncConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncResolverSyncConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiId() {
        return software.amazon.jsii.Kernel.get(this, "apiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiId", java.util.Objects.requireNonNull(value, "apiId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataSource() {
        return software.amazon.jsii.Kernel.get(this, "dataSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataSource(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataSource", java.util.Objects.requireNonNull(value, "dataSource is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getField() {
        return software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setField(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "field", java.util.Objects.requireNonNull(value, "field is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKind() {
        return software.amazon.jsii.Kernel.get(this, "kind", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKind(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kind", java.util.Objects.requireNonNull(value, "kind is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxBatchSize() {
        return software.amazon.jsii.Kernel.get(this, "maxBatchSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxBatchSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxBatchSize", java.util.Objects.requireNonNull(value, "maxBatchSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestTemplate() {
        return software.amazon.jsii.Kernel.get(this, "requestTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestTemplate", java.util.Objects.requireNonNull(value, "requestTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseTemplate() {
        return software.amazon.jsii.Kernel.get(this, "responseTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResponseTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "responseTemplate", java.util.Objects.requireNonNull(value, "responseTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.appsync.AppsyncResolver}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appsync.AppsyncResolver> {
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
        private final imports.aws.appsync.AppsyncResolverConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appsync.AppsyncResolverConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#api_id AppsyncResolver#api_id}.
         * <p>
         * @return {@code this}
         * @param apiId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#api_id AppsyncResolver#api_id}. This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#field AppsyncResolver#field}.
         * <p>
         * @return {@code this}
         * @param field Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#field AppsyncResolver#field}. This parameter is required.
         */
        public Builder field(final java.lang.String field) {
            this.config.field(field);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#type AppsyncResolver#type}.
         * <p>
         * @return {@code this}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#type AppsyncResolver#type}. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * caching_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#caching_config AppsyncResolver#caching_config}
         * <p>
         * @return {@code this}
         * @param cachingConfig caching_config block. This parameter is required.
         */
        public Builder cachingConfig(final imports.aws.appsync.AppsyncResolverCachingConfig cachingConfig) {
            this.config.cachingConfig(cachingConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#data_source AppsyncResolver#data_source}.
         * <p>
         * @return {@code this}
         * @param dataSource Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#data_source AppsyncResolver#data_source}. This parameter is required.
         */
        public Builder dataSource(final java.lang.String dataSource) {
            this.config.dataSource(dataSource);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#id AppsyncResolver#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#id AppsyncResolver#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#kind AppsyncResolver#kind}.
         * <p>
         * @return {@code this}
         * @param kind Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#kind AppsyncResolver#kind}. This parameter is required.
         */
        public Builder kind(final java.lang.String kind) {
            this.config.kind(kind);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#max_batch_size AppsyncResolver#max_batch_size}.
         * <p>
         * @return {@code this}
         * @param maxBatchSize Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#max_batch_size AppsyncResolver#max_batch_size}. This parameter is required.
         */
        public Builder maxBatchSize(final java.lang.Number maxBatchSize) {
            this.config.maxBatchSize(maxBatchSize);
            return this;
        }

        /**
         * pipeline_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#pipeline_config AppsyncResolver#pipeline_config}
         * <p>
         * @return {@code this}
         * @param pipelineConfig pipeline_config block. This parameter is required.
         */
        public Builder pipelineConfig(final imports.aws.appsync.AppsyncResolverPipelineConfig pipelineConfig) {
            this.config.pipelineConfig(pipelineConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#request_template AppsyncResolver#request_template}.
         * <p>
         * @return {@code this}
         * @param requestTemplate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#request_template AppsyncResolver#request_template}. This parameter is required.
         */
        public Builder requestTemplate(final java.lang.String requestTemplate) {
            this.config.requestTemplate(requestTemplate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#response_template AppsyncResolver#response_template}.
         * <p>
         * @return {@code this}
         * @param responseTemplate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#response_template AppsyncResolver#response_template}. This parameter is required.
         */
        public Builder responseTemplate(final java.lang.String responseTemplate) {
            this.config.responseTemplate(responseTemplate);
            return this;
        }

        /**
         * sync_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_resolver#sync_config AppsyncResolver#sync_config}
         * <p>
         * @return {@code this}
         * @param syncConfig sync_config block. This parameter is required.
         */
        public Builder syncConfig(final imports.aws.appsync.AppsyncResolverSyncConfig syncConfig) {
            this.config.syncConfig(syncConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appsync.AppsyncResolver}.
         */
        @Override
        public imports.aws.appsync.AppsyncResolver build() {
            return new imports.aws.appsync.AppsyncResolver(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
