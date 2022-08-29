package imports.aws.dynamodb;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table aws_dynamodb_table}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.486Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dynamodb.DataAwsDynamodbTable")
public class DataAwsDynamodbTable extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsDynamodbTable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsDynamodbTable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.dynamodb.DataAwsDynamodbTable.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table aws_dynamodb_table} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsDynamodbTable(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putServerSideEncryption(final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableServerSideEncryption value) {
        software.amazon.jsii.Kernel.call(this, "putServerSideEncryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryption() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableAttributeList getAttribute() {
        return software.amazon.jsii.Kernel.get(this, "attribute", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableAttributeList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBillingMode() {
        return software.amazon.jsii.Kernel.get(this, "billingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableGlobalSecondaryIndexList getGlobalSecondaryIndex() {
        return software.amazon.jsii.Kernel.get(this, "globalSecondaryIndex", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableGlobalSecondaryIndexList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHashKey() {
        return software.amazon.jsii.Kernel.get(this, "hashKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableLocalSecondaryIndexList getLocalSecondaryIndex() {
        return software.amazon.jsii.Kernel.get(this, "localSecondaryIndex", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableLocalSecondaryIndexList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTablePointInTimeRecoveryList getPointInTimeRecovery() {
        return software.amazon.jsii.Kernel.get(this, "pointInTimeRecovery", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTablePointInTimeRecoveryList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRangeKey() {
        return software.amazon.jsii.Kernel.get(this, "rangeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getReadCapacity() {
        return software.amazon.jsii.Kernel.get(this, "readCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableReplicaList getReplica() {
        return software.amazon.jsii.Kernel.get(this, "replica", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableReplicaList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableServerSideEncryptionOutputReference getServerSideEncryption() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableServerSideEncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamArn() {
        return software.amazon.jsii.Kernel.get(this, "streamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getStreamEnabled() {
        return software.amazon.jsii.Kernel.get(this, "streamEnabled", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamLabel() {
        return software.amazon.jsii.Kernel.get(this, "streamLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamViewType() {
        return software.amazon.jsii.Kernel.get(this, "streamViewType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableClass() {
        return software.amazon.jsii.Kernel.get(this, "tableClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DataAwsDynamodbTableTtlList getTtl() {
        return software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableTtlList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getWriteCapacity() {
        return software.amazon.jsii.Kernel.get(this, "writeCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dynamodb.DataAwsDynamodbTableServerSideEncryption getServerSideEncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DataAwsDynamodbTableServerSideEncryption.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
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

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.dynamodb.DataAwsDynamodbTable}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.dynamodb.DataAwsDynamodbTable> {
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
        private final imports.aws.dynamodb.DataAwsDynamodbTableConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.dynamodb.DataAwsDynamodbTableConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#name DataAwsDynamodbTable#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#name DataAwsDynamodbTable#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#id DataAwsDynamodbTable#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#id DataAwsDynamodbTable#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * server_side_encryption block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#server_side_encryption DataAwsDynamodbTable#server_side_encryption}
         * <p>
         * @return {@code this}
         * @param serverSideEncryption server_side_encryption block. This parameter is required.
         */
        public Builder serverSideEncryption(final imports.aws.dynamodb.DataAwsDynamodbTableServerSideEncryption serverSideEncryption) {
            this.config.serverSideEncryption(serverSideEncryption);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#tags DataAwsDynamodbTable#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/dynamodb_table#tags DataAwsDynamodbTable#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.dynamodb.DataAwsDynamodbTable}.
         */
        @Override
        public imports.aws.dynamodb.DataAwsDynamodbTable build() {
            return new imports.aws.dynamodb.DataAwsDynamodbTable(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
