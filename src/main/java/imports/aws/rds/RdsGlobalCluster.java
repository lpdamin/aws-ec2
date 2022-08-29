package imports.aws.rds;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster aws_rds_global_cluster}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.273Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.RdsGlobalCluster")
public class RdsGlobalCluster extends com.hashicorp.cdktf.TerraformResource {

    protected RdsGlobalCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RdsGlobalCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.rds.RdsGlobalCluster.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster aws_rds_global_cluster} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public RdsGlobalCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.rds.RdsGlobalClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.rds.RdsGlobalClusterTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDatabaseName() {
        software.amazon.jsii.Kernel.call(this, "resetDatabaseName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeletionProtection() {
        software.amazon.jsii.Kernel.call(this, "resetDeletionProtection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEngine() {
        software.amazon.jsii.Kernel.call(this, "resetEngine", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEngineVersion() {
        software.amazon.jsii.Kernel.call(this, "resetEngineVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceDestroy() {
        software.amazon.jsii.Kernel.call(this, "resetForceDestroy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceDbClusterIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetSourceDbClusterIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetStorageEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.rds.RdsGlobalClusterGlobalClusterMembersList getGlobalClusterMembers() {
        return software.amazon.jsii.Kernel.get(this, "globalClusterMembers", software.amazon.jsii.NativeType.forClass(imports.aws.rds.RdsGlobalClusterGlobalClusterMembersList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGlobalClusterResourceId() {
        return software.amazon.jsii.Kernel.get(this, "globalClusterResourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.rds.RdsGlobalClusterTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.rds.RdsGlobalClusterTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDeletionProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "deletionProtectionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineInput() {
        return software.amazon.jsii.Kernel.get(this, "engineInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "engineVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForceDestroyInput() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGlobalClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "globalClusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceDbClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceDbClusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStorageEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "storageEncryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDeletionProtection() {
        return software.amazon.jsii.Kernel.get(this, "deletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDeletionProtection(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deletionProtection", java.util.Objects.requireNonNull(value, "deletionProtection is required"));
    }

    public void setDeletionProtection(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "deletionProtection", java.util.Objects.requireNonNull(value, "deletionProtection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngine() {
        return software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngine(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engine", java.util.Objects.requireNonNull(value, "engine is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineVersion", java.util.Objects.requireNonNull(value, "engineVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForceDestroy() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", java.util.Objects.requireNonNull(value, "forceDestroy is required"));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", java.util.Objects.requireNonNull(value, "forceDestroy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGlobalClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "globalClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGlobalClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "globalClusterIdentifier", java.util.Objects.requireNonNull(value, "globalClusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceDbClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "sourceDbClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceDbClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceDbClusterIdentifier", java.util.Objects.requireNonNull(value, "sourceDbClusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStorageEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "storageEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStorageEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "storageEncrypted", java.util.Objects.requireNonNull(value, "storageEncrypted is required"));
    }

    public void setStorageEncrypted(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "storageEncrypted", java.util.Objects.requireNonNull(value, "storageEncrypted is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.rds.RdsGlobalCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.rds.RdsGlobalCluster> {
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
        private final imports.aws.rds.RdsGlobalClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.rds.RdsGlobalClusterConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#global_cluster_identifier RdsGlobalCluster#global_cluster_identifier}.
         * <p>
         * @return {@code this}
         * @param globalClusterIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#global_cluster_identifier RdsGlobalCluster#global_cluster_identifier}. This parameter is required.
         */
        public Builder globalClusterIdentifier(final java.lang.String globalClusterIdentifier) {
            this.config.globalClusterIdentifier(globalClusterIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#database_name RdsGlobalCluster#database_name}.
         * <p>
         * @return {@code this}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#database_name RdsGlobalCluster#database_name}. This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#deletion_protection RdsGlobalCluster#deletion_protection}.
         * <p>
         * @return {@code this}
         * @param deletionProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#deletion_protection RdsGlobalCluster#deletion_protection}. This parameter is required.
         */
        public Builder deletionProtection(final java.lang.Boolean deletionProtection) {
            this.config.deletionProtection(deletionProtection);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#deletion_protection RdsGlobalCluster#deletion_protection}.
         * <p>
         * @return {@code this}
         * @param deletionProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#deletion_protection RdsGlobalCluster#deletion_protection}. This parameter is required.
         */
        public Builder deletionProtection(final com.hashicorp.cdktf.IResolvable deletionProtection) {
            this.config.deletionProtection(deletionProtection);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#engine RdsGlobalCluster#engine}.
         * <p>
         * @return {@code this}
         * @param engine Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#engine RdsGlobalCluster#engine}. This parameter is required.
         */
        public Builder engine(final java.lang.String engine) {
            this.config.engine(engine);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#engine_version RdsGlobalCluster#engine_version}.
         * <p>
         * @return {@code this}
         * @param engineVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#engine_version RdsGlobalCluster#engine_version}. This parameter is required.
         */
        public Builder engineVersion(final java.lang.String engineVersion) {
            this.config.engineVersion(engineVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#force_destroy RdsGlobalCluster#force_destroy}.
         * <p>
         * @return {@code this}
         * @param forceDestroy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#force_destroy RdsGlobalCluster#force_destroy}. This parameter is required.
         */
        public Builder forceDestroy(final java.lang.Boolean forceDestroy) {
            this.config.forceDestroy(forceDestroy);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#force_destroy RdsGlobalCluster#force_destroy}.
         * <p>
         * @return {@code this}
         * @param forceDestroy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#force_destroy RdsGlobalCluster#force_destroy}. This parameter is required.
         */
        public Builder forceDestroy(final com.hashicorp.cdktf.IResolvable forceDestroy) {
            this.config.forceDestroy(forceDestroy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#id RdsGlobalCluster#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#id RdsGlobalCluster#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#source_db_cluster_identifier RdsGlobalCluster#source_db_cluster_identifier}.
         * <p>
         * @return {@code this}
         * @param sourceDbClusterIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#source_db_cluster_identifier RdsGlobalCluster#source_db_cluster_identifier}. This parameter is required.
         */
        public Builder sourceDbClusterIdentifier(final java.lang.String sourceDbClusterIdentifier) {
            this.config.sourceDbClusterIdentifier(sourceDbClusterIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#storage_encrypted RdsGlobalCluster#storage_encrypted}.
         * <p>
         * @return {@code this}
         * @param storageEncrypted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#storage_encrypted RdsGlobalCluster#storage_encrypted}. This parameter is required.
         */
        public Builder storageEncrypted(final java.lang.Boolean storageEncrypted) {
            this.config.storageEncrypted(storageEncrypted);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#storage_encrypted RdsGlobalCluster#storage_encrypted}.
         * <p>
         * @return {@code this}
         * @param storageEncrypted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#storage_encrypted RdsGlobalCluster#storage_encrypted}. This parameter is required.
         */
        public Builder storageEncrypted(final com.hashicorp.cdktf.IResolvable storageEncrypted) {
            this.config.storageEncrypted(storageEncrypted);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/rds_global_cluster#timeouts RdsGlobalCluster#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.rds.RdsGlobalClusterTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.rds.RdsGlobalCluster}.
         */
        @Override
        public imports.aws.rds.RdsGlobalCluster build() {
            return new imports.aws.rds.RdsGlobalCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
