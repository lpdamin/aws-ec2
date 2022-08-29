package imports.aws.storagegateway;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool aws_storagegateway_tape_pool}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.808Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.StoragegatewayTapePool")
public class StoragegatewayTapePool extends com.hashicorp.cdktf.TerraformResource {

    protected StoragegatewayTapePool(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewayTapePool(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.storagegateway.StoragegatewayTapePool.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool aws_storagegateway_tape_pool} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public StoragegatewayTapePool(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.storagegateway.StoragegatewayTapePoolConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetentionLockTimeInDays() {
        software.amazon.jsii.Kernel.call(this, "resetRetentionLockTimeInDays", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetentionLockType() {
        software.amazon.jsii.Kernel.call(this, "resetRetentionLockType", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPoolNameInput() {
        return software.amazon.jsii.Kernel.get(this, "poolNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRetentionLockTimeInDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "retentionLockTimeInDaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRetentionLockTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "retentionLockTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageClassInput() {
        return software.amazon.jsii.Kernel.get(this, "storageClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getPoolName() {
        return software.amazon.jsii.Kernel.get(this, "poolName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPoolName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "poolName", java.util.Objects.requireNonNull(value, "poolName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRetentionLockTimeInDays() {
        return software.amazon.jsii.Kernel.get(this, "retentionLockTimeInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRetentionLockTimeInDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "retentionLockTimeInDays", java.util.Objects.requireNonNull(value, "retentionLockTimeInDays is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRetentionLockType() {
        return software.amazon.jsii.Kernel.get(this, "retentionLockType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRetentionLockType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "retentionLockType", java.util.Objects.requireNonNull(value, "retentionLockType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageClass", java.util.Objects.requireNonNull(value, "storageClass is required"));
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
     * A fluent builder for {@link imports.aws.storagegateway.StoragegatewayTapePool}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.storagegateway.StoragegatewayTapePool> {
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
        private final imports.aws.storagegateway.StoragegatewayTapePoolConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.storagegateway.StoragegatewayTapePoolConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#pool_name StoragegatewayTapePool#pool_name}.
         * <p>
         * @return {@code this}
         * @param poolName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#pool_name StoragegatewayTapePool#pool_name}. This parameter is required.
         */
        public Builder poolName(final java.lang.String poolName) {
            this.config.poolName(poolName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#storage_class StoragegatewayTapePool#storage_class}.
         * <p>
         * @return {@code this}
         * @param storageClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#storage_class StoragegatewayTapePool#storage_class}. This parameter is required.
         */
        public Builder storageClass(final java.lang.String storageClass) {
            this.config.storageClass(storageClass);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#id StoragegatewayTapePool#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#id StoragegatewayTapePool#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#retention_lock_time_in_days StoragegatewayTapePool#retention_lock_time_in_days}.
         * <p>
         * @return {@code this}
         * @param retentionLockTimeInDays Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#retention_lock_time_in_days StoragegatewayTapePool#retention_lock_time_in_days}. This parameter is required.
         */
        public Builder retentionLockTimeInDays(final java.lang.Number retentionLockTimeInDays) {
            this.config.retentionLockTimeInDays(retentionLockTimeInDays);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#retention_lock_type StoragegatewayTapePool#retention_lock_type}.
         * <p>
         * @return {@code this}
         * @param retentionLockType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#retention_lock_type StoragegatewayTapePool#retention_lock_type}. This parameter is required.
         */
        public Builder retentionLockType(final java.lang.String retentionLockType) {
            this.config.retentionLockType(retentionLockType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#tags StoragegatewayTapePool#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#tags StoragegatewayTapePool#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#tags_all StoragegatewayTapePool#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_tape_pool#tags_all StoragegatewayTapePool#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.storagegateway.StoragegatewayTapePool}.
         */
        @Override
        public imports.aws.storagegateway.StoragegatewayTapePool build() {
            return new imports.aws.storagegateway.StoragegatewayTapePool(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
