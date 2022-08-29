package imports.aws.glue;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler aws_glue_crawler}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.256Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCrawler")
public class GlueCrawler extends com.hashicorp.cdktf.TerraformResource {

    protected GlueCrawler(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCrawler(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.glue.GlueCrawler.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler aws_glue_crawler} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public GlueCrawler(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCatalogTarget(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCatalogTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDeltaTarget(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDeltaTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDynamodbTarget(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDynamodbTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putJdbcTarget(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putJdbcTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLineageConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerLineageConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putLineageConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMongodbTarget(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMongodbTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRecrawlPolicy(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerRecrawlPolicy value) {
        software.amazon.jsii.Kernel.call(this, "putRecrawlPolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3Target(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putS3Target", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSchemaChangePolicy(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerSchemaChangePolicy value) {
        software.amazon.jsii.Kernel.call(this, "putSchemaChangePolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCatalogTarget() {
        software.amazon.jsii.Kernel.call(this, "resetCatalogTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClassifiers() {
        software.amazon.jsii.Kernel.call(this, "resetClassifiers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeltaTarget() {
        software.amazon.jsii.Kernel.call(this, "resetDeltaTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodbTarget() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodbTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJdbcTarget() {
        software.amazon.jsii.Kernel.call(this, "resetJdbcTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLineageConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetLineageConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMongodbTarget() {
        software.amazon.jsii.Kernel.call(this, "resetMongodbTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRecrawlPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetRecrawlPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Target() {
        software.amazon.jsii.Kernel.call(this, "resetS3Target", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedule() {
        software.amazon.jsii.Kernel.call(this, "resetSchedule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchemaChangePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetSchemaChangePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTablePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetTablePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerCatalogTargetList getCatalogTarget() {
        return software.amazon.jsii.Kernel.get(this, "catalogTarget", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerCatalogTargetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerDeltaTargetList getDeltaTarget() {
        return software.amazon.jsii.Kernel.get(this, "deltaTarget", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerDeltaTargetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerDynamodbTargetList getDynamodbTarget() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbTarget", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerDynamodbTargetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerJdbcTargetList getJdbcTarget() {
        return software.amazon.jsii.Kernel.get(this, "jdbcTarget", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerJdbcTargetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerLineageConfigurationOutputReference getLineageConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "lineageConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerLineageConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerMongodbTargetList getMongodbTarget() {
        return software.amazon.jsii.Kernel.get(this, "mongodbTarget", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerMongodbTargetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerRecrawlPolicyOutputReference getRecrawlPolicy() {
        return software.amazon.jsii.Kernel.get(this, "recrawlPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerRecrawlPolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerS3TargetList getS3Target() {
        return software.amazon.jsii.Kernel.get(this, "s3Target", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerS3TargetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCrawlerSchemaChangePolicyOutputReference getSchemaChangePolicy() {
        return software.amazon.jsii.Kernel.get(this, "schemaChangePolicy", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerSchemaChangePolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCatalogTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "catalogTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClassifiersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "classifiersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDeltaTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "deltaTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDynamodbTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getJdbcTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "jdbcTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCrawlerLineageConfiguration getLineageConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "lineageConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerLineageConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMongodbTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "mongodbTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCrawlerRecrawlPolicy getRecrawlPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "recrawlPolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerRecrawlPolicy.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "roleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getS3TargetInput() {
        return software.amazon.jsii.Kernel.get(this, "s3TargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCrawlerSchemaChangePolicy getSchemaChangePolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaChangePolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCrawlerSchemaChangePolicy.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecurityConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "securityConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTablePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "tablePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClassifiers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "classifiers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setClassifiers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "classifiers", java.util.Objects.requireNonNull(value, "classifiers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configuration", java.util.Objects.requireNonNull(value, "configuration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRole() {
        return software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "role", java.util.Objects.requireNonNull(value, "role is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchedule() {
        return software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchedule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schedule", java.util.Objects.requireNonNull(value, "schedule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecurityConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "securityConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecurityConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "securityConfiguration", java.util.Objects.requireNonNull(value, "securityConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTablePrefix() {
        return software.amazon.jsii.Kernel.get(this, "tablePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTablePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tablePrefix", java.util.Objects.requireNonNull(value, "tablePrefix is required"));
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

    /**
     * A fluent builder for {@link imports.aws.glue.GlueCrawler}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.glue.GlueCrawler> {
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
        private final imports.aws.glue.GlueCrawlerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.glue.GlueCrawlerConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#database_name GlueCrawler#database_name}.
         * <p>
         * @return {@code this}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#database_name GlueCrawler#database_name}. This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#name GlueCrawler#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#name GlueCrawler#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#role GlueCrawler#role}.
         * <p>
         * @return {@code this}
         * @param role Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#role GlueCrawler#role}. This parameter is required.
         */
        public Builder role(final java.lang.String role) {
            this.config.role(role);
            return this;
        }

        /**
         * catalog_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#catalog_target GlueCrawler#catalog_target}
         * <p>
         * @return {@code this}
         * @param catalogTarget catalog_target block. This parameter is required.
         */
        public Builder catalogTarget(final com.hashicorp.cdktf.IResolvable catalogTarget) {
            this.config.catalogTarget(catalogTarget);
            return this;
        }
        /**
         * catalog_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#catalog_target GlueCrawler#catalog_target}
         * <p>
         * @return {@code this}
         * @param catalogTarget catalog_target block. This parameter is required.
         */
        public Builder catalogTarget(final java.util.List<? extends imports.aws.glue.GlueCrawlerCatalogTarget> catalogTarget) {
            this.config.catalogTarget(catalogTarget);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#classifiers GlueCrawler#classifiers}.
         * <p>
         * @return {@code this}
         * @param classifiers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#classifiers GlueCrawler#classifiers}. This parameter is required.
         */
        public Builder classifiers(final java.util.List<java.lang.String> classifiers) {
            this.config.classifiers(classifiers);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#configuration GlueCrawler#configuration}.
         * <p>
         * @return {@code this}
         * @param configuration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#configuration GlueCrawler#configuration}. This parameter is required.
         */
        public Builder configuration(final java.lang.String configuration) {
            this.config.configuration(configuration);
            return this;
        }

        /**
         * delta_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#delta_target GlueCrawler#delta_target}
         * <p>
         * @return {@code this}
         * @param deltaTarget delta_target block. This parameter is required.
         */
        public Builder deltaTarget(final com.hashicorp.cdktf.IResolvable deltaTarget) {
            this.config.deltaTarget(deltaTarget);
            return this;
        }
        /**
         * delta_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#delta_target GlueCrawler#delta_target}
         * <p>
         * @return {@code this}
         * @param deltaTarget delta_target block. This parameter is required.
         */
        public Builder deltaTarget(final java.util.List<? extends imports.aws.glue.GlueCrawlerDeltaTarget> deltaTarget) {
            this.config.deltaTarget(deltaTarget);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#description GlueCrawler#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#description GlueCrawler#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dynamodb_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#dynamodb_target GlueCrawler#dynamodb_target}
         * <p>
         * @return {@code this}
         * @param dynamodbTarget dynamodb_target block. This parameter is required.
         */
        public Builder dynamodbTarget(final com.hashicorp.cdktf.IResolvable dynamodbTarget) {
            this.config.dynamodbTarget(dynamodbTarget);
            return this;
        }
        /**
         * dynamodb_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#dynamodb_target GlueCrawler#dynamodb_target}
         * <p>
         * @return {@code this}
         * @param dynamodbTarget dynamodb_target block. This parameter is required.
         */
        public Builder dynamodbTarget(final java.util.List<? extends imports.aws.glue.GlueCrawlerDynamodbTarget> dynamodbTarget) {
            this.config.dynamodbTarget(dynamodbTarget);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#id GlueCrawler#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#id GlueCrawler#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * jdbc_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#jdbc_target GlueCrawler#jdbc_target}
         * <p>
         * @return {@code this}
         * @param jdbcTarget jdbc_target block. This parameter is required.
         */
        public Builder jdbcTarget(final com.hashicorp.cdktf.IResolvable jdbcTarget) {
            this.config.jdbcTarget(jdbcTarget);
            return this;
        }
        /**
         * jdbc_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#jdbc_target GlueCrawler#jdbc_target}
         * <p>
         * @return {@code this}
         * @param jdbcTarget jdbc_target block. This parameter is required.
         */
        public Builder jdbcTarget(final java.util.List<? extends imports.aws.glue.GlueCrawlerJdbcTarget> jdbcTarget) {
            this.config.jdbcTarget(jdbcTarget);
            return this;
        }

        /**
         * lineage_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#lineage_configuration GlueCrawler#lineage_configuration}
         * <p>
         * @return {@code this}
         * @param lineageConfiguration lineage_configuration block. This parameter is required.
         */
        public Builder lineageConfiguration(final imports.aws.glue.GlueCrawlerLineageConfiguration lineageConfiguration) {
            this.config.lineageConfiguration(lineageConfiguration);
            return this;
        }

        /**
         * mongodb_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#mongodb_target GlueCrawler#mongodb_target}
         * <p>
         * @return {@code this}
         * @param mongodbTarget mongodb_target block. This parameter is required.
         */
        public Builder mongodbTarget(final com.hashicorp.cdktf.IResolvable mongodbTarget) {
            this.config.mongodbTarget(mongodbTarget);
            return this;
        }
        /**
         * mongodb_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#mongodb_target GlueCrawler#mongodb_target}
         * <p>
         * @return {@code this}
         * @param mongodbTarget mongodb_target block. This parameter is required.
         */
        public Builder mongodbTarget(final java.util.List<? extends imports.aws.glue.GlueCrawlerMongodbTarget> mongodbTarget) {
            this.config.mongodbTarget(mongodbTarget);
            return this;
        }

        /**
         * recrawl_policy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#recrawl_policy GlueCrawler#recrawl_policy}
         * <p>
         * @return {@code this}
         * @param recrawlPolicy recrawl_policy block. This parameter is required.
         */
        public Builder recrawlPolicy(final imports.aws.glue.GlueCrawlerRecrawlPolicy recrawlPolicy) {
            this.config.recrawlPolicy(recrawlPolicy);
            return this;
        }

        /**
         * s3_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#s3_target GlueCrawler#s3_target}
         * <p>
         * @return {@code this}
         * @param s3Target s3_target block. This parameter is required.
         */
        public Builder s3Target(final com.hashicorp.cdktf.IResolvable s3Target) {
            this.config.s3Target(s3Target);
            return this;
        }
        /**
         * s3_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#s3_target GlueCrawler#s3_target}
         * <p>
         * @return {@code this}
         * @param s3Target s3_target block. This parameter is required.
         */
        public Builder s3Target(final java.util.List<? extends imports.aws.glue.GlueCrawlerS3Target> s3Target) {
            this.config.s3Target(s3Target);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#schedule GlueCrawler#schedule}.
         * <p>
         * @return {@code this}
         * @param schedule Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#schedule GlueCrawler#schedule}. This parameter is required.
         */
        public Builder schedule(final java.lang.String schedule) {
            this.config.schedule(schedule);
            return this;
        }

        /**
         * schema_change_policy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_crawler#schema_change_policy GlueCrawler#schema_change_policy}
         * <p>
         * @return {@code this}
         * @param schemaChangePolicy schema_change_policy block. This parameter is required.
         */
        public Builder schemaChangePolicy(final imports.aws.glue.GlueCrawlerSchemaChangePolicy schemaChangePolicy) {
            this.config.schemaChangePolicy(schemaChangePolicy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#security_configuration GlueCrawler#security_configuration}.
         * <p>
         * @return {@code this}
         * @param securityConfiguration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#security_configuration GlueCrawler#security_configuration}. This parameter is required.
         */
        public Builder securityConfiguration(final java.lang.String securityConfiguration) {
            this.config.securityConfiguration(securityConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#table_prefix GlueCrawler#table_prefix}.
         * <p>
         * @return {@code this}
         * @param tablePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#table_prefix GlueCrawler#table_prefix}. This parameter is required.
         */
        public Builder tablePrefix(final java.lang.String tablePrefix) {
            this.config.tablePrefix(tablePrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#tags GlueCrawler#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#tags GlueCrawler#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#tags_all GlueCrawler#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#tags_all GlueCrawler#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.glue.GlueCrawler}.
         */
        @Override
        public imports.aws.glue.GlueCrawler build() {
            return new imports.aws.glue.GlueCrawler(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
