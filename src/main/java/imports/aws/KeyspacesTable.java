package imports.aws;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table aws_keyspaces_table}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.312Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KeyspacesTable")
public class KeyspacesTable extends com.hashicorp.cdktf.TerraformResource {

    protected KeyspacesTable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KeyspacesTable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.KeyspacesTable.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table aws_keyspaces_table} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public KeyspacesTable(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCapacitySpecification(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableCapacitySpecification value) {
        software.amazon.jsii.Kernel.call(this, "putCapacitySpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putComment(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableComment value) {
        software.amazon.jsii.Kernel.call(this, "putComment", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEncryptionSpecification(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableEncryptionSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putEncryptionSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPointInTimeRecovery(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTablePointInTimeRecovery value) {
        software.amazon.jsii.Kernel.call(this, "putPointInTimeRecovery", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSchemaDefinition(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableSchemaDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putSchemaDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTtl(final @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableTtl value) {
        software.amazon.jsii.Kernel.call(this, "putTtl", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacitySpecification() {
        software.amazon.jsii.Kernel.call(this, "resetCapacitySpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetComment() {
        software.amazon.jsii.Kernel.call(this, "resetComment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultTimeToLive() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultTimeToLive", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPointInTimeRecovery() {
        software.amazon.jsii.Kernel.call(this, "resetPointInTimeRecovery", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTtl() {
        software.amazon.jsii.Kernel.call(this, "resetTtl", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableCapacitySpecificationOutputReference getCapacitySpecification() {
        return software.amazon.jsii.Kernel.get(this, "capacitySpecification", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableCapacitySpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableCommentOutputReference getComment() {
        return software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableCommentOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableEncryptionSpecificationOutputReference getEncryptionSpecification() {
        return software.amazon.jsii.Kernel.get(this, "encryptionSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableEncryptionSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTablePointInTimeRecoveryOutputReference getPointInTimeRecovery() {
        return software.amazon.jsii.Kernel.get(this, "pointInTimeRecovery", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTablePointInTimeRecoveryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableSchemaDefinitionOutputReference getSchemaDefinition() {
        return software.amazon.jsii.Kernel.get(this, "schemaDefinition", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableTtlOutputReference getTtl() {
        return software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableTtlOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableCapacitySpecification getCapacitySpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "capacitySpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableCapacitySpecification.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableComment getCommentInput() {
        return software.amazon.jsii.Kernel.get(this, "commentInput", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableComment.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultTimeToLiveInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultTimeToLiveInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableEncryptionSpecification getEncryptionSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableEncryptionSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyspaceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "keyspaceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTablePointInTimeRecovery getPointInTimeRecoveryInput() {
        return software.amazon.jsii.Kernel.get(this, "pointInTimeRecoveryInput", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTablePointInTimeRecovery.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableSchemaDefinition getSchemaDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaDefinitionInput", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTableNameInput() {
        return software.amazon.jsii.Kernel.get(this, "tableNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableTtl getTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "ttlInput", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableTtl.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultTimeToLive() {
        return software.amazon.jsii.Kernel.get(this, "defaultTimeToLive", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultTimeToLive(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultTimeToLive", java.util.Objects.requireNonNull(value, "defaultTimeToLive is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyspaceName() {
        return software.amazon.jsii.Kernel.get(this, "keyspaceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyspaceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyspaceName", java.util.Objects.requireNonNull(value, "keyspaceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableName() {
        return software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTableName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tableName", java.util.Objects.requireNonNull(value, "tableName is required"));
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
     * A fluent builder for {@link imports.aws.KeyspacesTable}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.KeyspacesTable> {
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
        private final imports.aws.KeyspacesTableConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.KeyspacesTableConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#keyspace_name KeyspacesTable#keyspace_name}.
         * <p>
         * @return {@code this}
         * @param keyspaceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#keyspace_name KeyspacesTable#keyspace_name}. This parameter is required.
         */
        public Builder keyspaceName(final java.lang.String keyspaceName) {
            this.config.keyspaceName(keyspaceName);
            return this;
        }

        /**
         * schema_definition block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#schema_definition KeyspacesTable#schema_definition}
         * <p>
         * @return {@code this}
         * @param schemaDefinition schema_definition block. This parameter is required.
         */
        public Builder schemaDefinition(final imports.aws.KeyspacesTableSchemaDefinition schemaDefinition) {
            this.config.schemaDefinition(schemaDefinition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#table_name KeyspacesTable#table_name}.
         * <p>
         * @return {@code this}
         * @param tableName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#table_name KeyspacesTable#table_name}. This parameter is required.
         */
        public Builder tableName(final java.lang.String tableName) {
            this.config.tableName(tableName);
            return this;
        }

        /**
         * capacity_specification block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#capacity_specification KeyspacesTable#capacity_specification}
         * <p>
         * @return {@code this}
         * @param capacitySpecification capacity_specification block. This parameter is required.
         */
        public Builder capacitySpecification(final imports.aws.KeyspacesTableCapacitySpecification capacitySpecification) {
            this.config.capacitySpecification(capacitySpecification);
            return this;
        }

        /**
         * comment block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#comment KeyspacesTable#comment}
         * <p>
         * @return {@code this}
         * @param comment comment block. This parameter is required.
         */
        public Builder comment(final imports.aws.KeyspacesTableComment comment) {
            this.config.comment(comment);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#default_time_to_live KeyspacesTable#default_time_to_live}.
         * <p>
         * @return {@code this}
         * @param defaultTimeToLive Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#default_time_to_live KeyspacesTable#default_time_to_live}. This parameter is required.
         */
        public Builder defaultTimeToLive(final java.lang.Number defaultTimeToLive) {
            this.config.defaultTimeToLive(defaultTimeToLive);
            return this;
        }

        /**
         * encryption_specification block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#encryption_specification KeyspacesTable#encryption_specification}
         * <p>
         * @return {@code this}
         * @param encryptionSpecification encryption_specification block. This parameter is required.
         */
        public Builder encryptionSpecification(final imports.aws.KeyspacesTableEncryptionSpecification encryptionSpecification) {
            this.config.encryptionSpecification(encryptionSpecification);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#id KeyspacesTable#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#id KeyspacesTable#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * point_in_time_recovery block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#point_in_time_recovery KeyspacesTable#point_in_time_recovery}
         * <p>
         * @return {@code this}
         * @param pointInTimeRecovery point_in_time_recovery block. This parameter is required.
         */
        public Builder pointInTimeRecovery(final imports.aws.KeyspacesTablePointInTimeRecovery pointInTimeRecovery) {
            this.config.pointInTimeRecovery(pointInTimeRecovery);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#tags KeyspacesTable#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#tags KeyspacesTable#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#tags_all KeyspacesTable#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#tags_all KeyspacesTable#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#timeouts KeyspacesTable#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.KeyspacesTableTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * ttl block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#ttl KeyspacesTable#ttl}
         * <p>
         * @return {@code this}
         * @param ttl ttl block. This parameter is required.
         */
        public Builder ttl(final imports.aws.KeyspacesTableTtl ttl) {
            this.config.ttl(ttl);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.KeyspacesTable}.
         */
        @Override
        public imports.aws.KeyspacesTable build() {
            return new imports.aws.KeyspacesTable(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
