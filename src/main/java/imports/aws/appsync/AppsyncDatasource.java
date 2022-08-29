package imports.aws.appsync;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource aws_appsync_datasource}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.740Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncDatasource")
public class AppsyncDatasource extends com.hashicorp.cdktf.TerraformResource {

    protected AppsyncDatasource(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncDatasource(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appsync.AppsyncDatasource.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource aws_appsync_datasource} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppsyncDatasource(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putDynamodbConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceDynamodbConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDynamodbConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putElasticsearchConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceElasticsearchConfig value) {
        software.amazon.jsii.Kernel.call(this, "putElasticsearchConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceHttpConfig value) {
        software.amazon.jsii.Kernel.call(this, "putHttpConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLambdaConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceLambdaConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLambdaConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRelationalDatabaseConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceRelationalDatabaseConfig value) {
        software.amazon.jsii.Kernel.call(this, "putRelationalDatabaseConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodbConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodbConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearchConfig() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearchConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpConfig() {
        software.amazon.jsii.Kernel.call(this, "resetHttpConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRelationalDatabaseConfig() {
        software.amazon.jsii.Kernel.call(this, "resetRelationalDatabaseConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetServiceRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceDynamodbConfigOutputReference getDynamodbConfig() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceDynamodbConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceElasticsearchConfigOutputReference getElasticsearchConfig() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceElasticsearchConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceHttpConfigOutputReference getHttpConfig() {
        return software.amazon.jsii.Kernel.get(this, "httpConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceHttpConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceLambdaConfigOutputReference getLambdaConfig() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceLambdaConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceRelationalDatabaseConfigOutputReference getRelationalDatabaseConfig() {
        return software.amazon.jsii.Kernel.get(this, "relationalDatabaseConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceRelationalDatabaseConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "apiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceDynamodbConfig getDynamodbConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceDynamodbConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceElasticsearchConfig getElasticsearchConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceElasticsearchConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceHttpConfig getHttpConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "httpConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceHttpConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceLambdaConfig getLambdaConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceLambdaConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceRelationalDatabaseConfig getRelationalDatabaseConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "relationalDatabaseConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceRelationalDatabaseConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRoleArn", java.util.Objects.requireNonNull(value, "serviceRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.appsync.AppsyncDatasource}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appsync.AppsyncDatasource> {
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
        private final imports.aws.appsync.AppsyncDatasourceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appsync.AppsyncDatasourceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#api_id AppsyncDatasource#api_id}.
         * <p>
         * @return {@code this}
         * @param apiId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#api_id AppsyncDatasource#api_id}. This parameter is required.
         */
        public Builder apiId(final java.lang.String apiId) {
            this.config.apiId(apiId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#name AppsyncDatasource#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#name AppsyncDatasource#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#type AppsyncDatasource#type}.
         * <p>
         * @return {@code this}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#type AppsyncDatasource#type}. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#description AppsyncDatasource#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#description AppsyncDatasource#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dynamodb_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#dynamodb_config AppsyncDatasource#dynamodb_config}
         * <p>
         * @return {@code this}
         * @param dynamodbConfig dynamodb_config block. This parameter is required.
         */
        public Builder dynamodbConfig(final imports.aws.appsync.AppsyncDatasourceDynamodbConfig dynamodbConfig) {
            this.config.dynamodbConfig(dynamodbConfig);
            return this;
        }

        /**
         * elasticsearch_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#elasticsearch_config AppsyncDatasource#elasticsearch_config}
         * <p>
         * @return {@code this}
         * @param elasticsearchConfig elasticsearch_config block. This parameter is required.
         */
        public Builder elasticsearchConfig(final imports.aws.appsync.AppsyncDatasourceElasticsearchConfig elasticsearchConfig) {
            this.config.elasticsearchConfig(elasticsearchConfig);
            return this;
        }

        /**
         * http_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#http_config AppsyncDatasource#http_config}
         * <p>
         * @return {@code this}
         * @param httpConfig http_config block. This parameter is required.
         */
        public Builder httpConfig(final imports.aws.appsync.AppsyncDatasourceHttpConfig httpConfig) {
            this.config.httpConfig(httpConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#id AppsyncDatasource#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#id AppsyncDatasource#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * lambda_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#lambda_config AppsyncDatasource#lambda_config}
         * <p>
         * @return {@code this}
         * @param lambdaConfig lambda_config block. This parameter is required.
         */
        public Builder lambdaConfig(final imports.aws.appsync.AppsyncDatasourceLambdaConfig lambdaConfig) {
            this.config.lambdaConfig(lambdaConfig);
            return this;
        }

        /**
         * relational_database_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#relational_database_config AppsyncDatasource#relational_database_config}
         * <p>
         * @return {@code this}
         * @param relationalDatabaseConfig relational_database_config block. This parameter is required.
         */
        public Builder relationalDatabaseConfig(final imports.aws.appsync.AppsyncDatasourceRelationalDatabaseConfig relationalDatabaseConfig) {
            this.config.relationalDatabaseConfig(relationalDatabaseConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#service_role_arn AppsyncDatasource#service_role_arn}.
         * <p>
         * @return {@code this}
         * @param serviceRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appsync_datasource#service_role_arn AppsyncDatasource#service_role_arn}. This parameter is required.
         */
        public Builder serviceRoleArn(final java.lang.String serviceRoleArn) {
            this.config.serviceRoleArn(serviceRoleArn);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appsync.AppsyncDatasource}.
         */
        @Override
        public imports.aws.appsync.AppsyncDatasource build() {
            return new imports.aws.appsync.AppsyncDatasource(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
