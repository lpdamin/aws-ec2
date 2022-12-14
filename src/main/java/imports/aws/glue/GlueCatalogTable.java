package imports.aws.glue;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table aws_glue_catalog_table}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.242Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogTable")
public class GlueCatalogTable extends com.hashicorp.cdktf.TerraformResource {

    protected GlueCatalogTable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCatalogTable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.glue.GlueCatalogTable.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table aws_glue_catalog_table} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public GlueCatalogTable(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putPartitionIndex(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPartitionIndex", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPartitionKeys(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPartitionKeys", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStorageDescriptor(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableStorageDescriptor value) {
        software.amazon.jsii.Kernel.call(this, "putStorageDescriptor", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetTable(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableTargetTable value) {
        software.amazon.jsii.Kernel.call(this, "putTargetTable", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCatalogId() {
        software.amazon.jsii.Kernel.call(this, "resetCatalogId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwner() {
        software.amazon.jsii.Kernel.call(this, "resetOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameters() {
        software.amazon.jsii.Kernel.call(this, "resetParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPartitionIndex() {
        software.amazon.jsii.Kernel.call(this, "resetPartitionIndex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPartitionKeys() {
        software.amazon.jsii.Kernel.call(this, "resetPartitionKeys", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetention() {
        software.amazon.jsii.Kernel.call(this, "resetRetention", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageDescriptor() {
        software.amazon.jsii.Kernel.call(this, "resetStorageDescriptor", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTableType() {
        software.amazon.jsii.Kernel.call(this, "resetTableType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetTable() {
        software.amazon.jsii.Kernel.call(this, "resetTargetTable", software.amazon.jsii.NativeType.VOID);
    }

    public void resetViewExpandedText() {
        software.amazon.jsii.Kernel.call(this, "resetViewExpandedText", software.amazon.jsii.NativeType.VOID);
    }

    public void resetViewOriginalText() {
        software.amazon.jsii.Kernel.call(this, "resetViewOriginalText", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTablePartitionIndexList getPartitionIndex() {
        return software.amazon.jsii.Kernel.get(this, "partitionIndex", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTablePartitionIndexList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTablePartitionKeysList getPartitionKeys() {
        return software.amazon.jsii.Kernel.get(this, "partitionKeys", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTablePartitionKeysList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableStorageDescriptorOutputReference getStorageDescriptor() {
        return software.amazon.jsii.Kernel.get(this, "storageDescriptor", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableStorageDescriptorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableTargetTableOutputReference getTargetTable() {
        return software.amazon.jsii.Kernel.get(this, "targetTable", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableTargetTableOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCatalogIdInput() {
        return software.amazon.jsii.Kernel.get(this, "catalogIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "parametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPartitionIndexInput() {
        return software.amazon.jsii.Kernel.get(this, "partitionIndexInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPartitionKeysInput() {
        return software.amazon.jsii.Kernel.get(this, "partitionKeysInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRetentionInput() {
        return software.amazon.jsii.Kernel.get(this, "retentionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableStorageDescriptor getStorageDescriptorInput() {
        return software.amazon.jsii.Kernel.get(this, "storageDescriptorInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableStorageDescriptor.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTableTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "tableTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableTargetTable getTargetTableInput() {
        return software.amazon.jsii.Kernel.get(this, "targetTableInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableTargetTable.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getViewExpandedTextInput() {
        return software.amazon.jsii.Kernel.get(this, "viewExpandedTextInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getViewOriginalTextInput() {
        return software.amazon.jsii.Kernel.get(this, "viewOriginalTextInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCatalogId() {
        return software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCatalogId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "catalogId", java.util.Objects.requireNonNull(value, "catalogId is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getOwner() {
        return software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "owner", java.util.Objects.requireNonNull(value, "owner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "parameters", java.util.Objects.requireNonNull(value, "parameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRetention() {
        return software.amazon.jsii.Kernel.get(this, "retention", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRetention(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "retention", java.util.Objects.requireNonNull(value, "retention is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableType() {
        return software.amazon.jsii.Kernel.get(this, "tableType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTableType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tableType", java.util.Objects.requireNonNull(value, "tableType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getViewExpandedText() {
        return software.amazon.jsii.Kernel.get(this, "viewExpandedText", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setViewExpandedText(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "viewExpandedText", java.util.Objects.requireNonNull(value, "viewExpandedText is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getViewOriginalText() {
        return software.amazon.jsii.Kernel.get(this, "viewOriginalText", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setViewOriginalText(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "viewOriginalText", java.util.Objects.requireNonNull(value, "viewOriginalText is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.glue.GlueCatalogTable}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.glue.GlueCatalogTable> {
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
        private final imports.aws.glue.GlueCatalogTableConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.glue.GlueCatalogTableConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#database_name GlueCatalogTable#database_name}.
         * <p>
         * @return {@code this}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#database_name GlueCatalogTable#database_name}. This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#name GlueCatalogTable#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#name GlueCatalogTable#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#catalog_id GlueCatalogTable#catalog_id}.
         * <p>
         * @return {@code this}
         * @param catalogId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#catalog_id GlueCatalogTable#catalog_id}. This parameter is required.
         */
        public Builder catalogId(final java.lang.String catalogId) {
            this.config.catalogId(catalogId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#description GlueCatalogTable#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#description GlueCatalogTable#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#id GlueCatalogTable#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#id GlueCatalogTable#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#owner GlueCatalogTable#owner}.
         * <p>
         * @return {@code this}
         * @param owner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#owner GlueCatalogTable#owner}. This parameter is required.
         */
        public Builder owner(final java.lang.String owner) {
            this.config.owner(owner);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#parameters GlueCatalogTable#parameters}.
         * <p>
         * @return {@code this}
         * @param parameters Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#parameters GlueCatalogTable#parameters}. This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.config.parameters(parameters);
            return this;
        }

        /**
         * partition_index block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#partition_index GlueCatalogTable#partition_index}
         * <p>
         * @return {@code this}
         * @param partitionIndex partition_index block. This parameter is required.
         */
        public Builder partitionIndex(final com.hashicorp.cdktf.IResolvable partitionIndex) {
            this.config.partitionIndex(partitionIndex);
            return this;
        }
        /**
         * partition_index block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#partition_index GlueCatalogTable#partition_index}
         * <p>
         * @return {@code this}
         * @param partitionIndex partition_index block. This parameter is required.
         */
        public Builder partitionIndex(final java.util.List<? extends imports.aws.glue.GlueCatalogTablePartitionIndex> partitionIndex) {
            this.config.partitionIndex(partitionIndex);
            return this;
        }

        /**
         * partition_keys block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#partition_keys GlueCatalogTable#partition_keys}
         * <p>
         * @return {@code this}
         * @param partitionKeys partition_keys block. This parameter is required.
         */
        public Builder partitionKeys(final com.hashicorp.cdktf.IResolvable partitionKeys) {
            this.config.partitionKeys(partitionKeys);
            return this;
        }
        /**
         * partition_keys block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#partition_keys GlueCatalogTable#partition_keys}
         * <p>
         * @return {@code this}
         * @param partitionKeys partition_keys block. This parameter is required.
         */
        public Builder partitionKeys(final java.util.List<? extends imports.aws.glue.GlueCatalogTablePartitionKeys> partitionKeys) {
            this.config.partitionKeys(partitionKeys);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#retention GlueCatalogTable#retention}.
         * <p>
         * @return {@code this}
         * @param retention Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#retention GlueCatalogTable#retention}. This parameter is required.
         */
        public Builder retention(final java.lang.Number retention) {
            this.config.retention(retention);
            return this;
        }

        /**
         * storage_descriptor block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#storage_descriptor GlueCatalogTable#storage_descriptor}
         * <p>
         * @return {@code this}
         * @param storageDescriptor storage_descriptor block. This parameter is required.
         */
        public Builder storageDescriptor(final imports.aws.glue.GlueCatalogTableStorageDescriptor storageDescriptor) {
            this.config.storageDescriptor(storageDescriptor);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#table_type GlueCatalogTable#table_type}.
         * <p>
         * @return {@code this}
         * @param tableType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#table_type GlueCatalogTable#table_type}. This parameter is required.
         */
        public Builder tableType(final java.lang.String tableType) {
            this.config.tableType(tableType);
            return this;
        }

        /**
         * target_table block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#target_table GlueCatalogTable#target_table}
         * <p>
         * @return {@code this}
         * @param targetTable target_table block. This parameter is required.
         */
        public Builder targetTable(final imports.aws.glue.GlueCatalogTableTargetTable targetTable) {
            this.config.targetTable(targetTable);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#view_expanded_text GlueCatalogTable#view_expanded_text}.
         * <p>
         * @return {@code this}
         * @param viewExpandedText Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#view_expanded_text GlueCatalogTable#view_expanded_text}. This parameter is required.
         */
        public Builder viewExpandedText(final java.lang.String viewExpandedText) {
            this.config.viewExpandedText(viewExpandedText);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#view_original_text GlueCatalogTable#view_original_text}.
         * <p>
         * @return {@code this}
         * @param viewOriginalText Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#view_original_text GlueCatalogTable#view_original_text}. This parameter is required.
         */
        public Builder viewOriginalText(final java.lang.String viewOriginalText) {
            this.config.viewOriginalText(viewOriginalText);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.glue.GlueCatalogTable}.
         */
        @Override
        public imports.aws.glue.GlueCatalogTable build() {
            return new imports.aws.glue.GlueCatalogTable(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
