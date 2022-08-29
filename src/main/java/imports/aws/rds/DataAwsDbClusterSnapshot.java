package imports.aws.rds;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot aws_db_cluster_snapshot}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.204Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.DataAwsDbClusterSnapshot")
public class DataAwsDbClusterSnapshot extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsDbClusterSnapshot(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsDbClusterSnapshot(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.rds.DataAwsDbClusterSnapshot.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot aws_db_cluster_snapshot} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsDbClusterSnapshot(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.rds.DataAwsDbClusterSnapshotConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot aws_db_cluster_snapshot} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsDbClusterSnapshot(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetDbClusterIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetDbClusterIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDbClusterSnapshotIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetDbClusterSnapshotIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludePublic() {
        software.amazon.jsii.Kernel.call(this, "resetIncludePublic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeShared() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeShared", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMostRecent() {
        software.amazon.jsii.Kernel.call(this, "resetMostRecent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotType() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.Number getAllocatedStorage() {
        return software.amazon.jsii.Kernel.get(this, "allocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAvailabilityZones() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbClusterSnapshotArn() {
        return software.amazon.jsii.Kernel.get(this, "dbClusterSnapshotArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngine() {
        return software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLicenseModel() {
        return software.amazon.jsii.Kernel.get(this, "licenseModel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotCreateTime() {
        return software.amazon.jsii.Kernel.get(this, "snapshotCreateTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceDbClusterSnapshotArn() {
        return software.amazon.jsii.Kernel.get(this, "sourceDbClusterSnapshotArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getStorageEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "storageEncrypted", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDbClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "dbClusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDbClusterSnapshotIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "dbClusterSnapshotIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludePublicInput() {
        return software.amazon.jsii.Kernel.get(this, "includePublicInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeSharedInput() {
        return software.amazon.jsii.Kernel.get(this, "includeSharedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMostRecentInput() {
        return software.amazon.jsii.Kernel.get(this, "mostRecentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "dbClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDbClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dbClusterIdentifier", java.util.Objects.requireNonNull(value, "dbClusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbClusterSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "dbClusterSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDbClusterSnapshotIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dbClusterSnapshotIdentifier", java.util.Objects.requireNonNull(value, "dbClusterSnapshotIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludePublic() {
        return software.amazon.jsii.Kernel.get(this, "includePublic", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludePublic(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includePublic", java.util.Objects.requireNonNull(value, "includePublic is required"));
    }

    public void setIncludePublic(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includePublic", java.util.Objects.requireNonNull(value, "includePublic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeShared() {
        return software.amazon.jsii.Kernel.get(this, "includeShared", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeShared(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeShared", java.util.Objects.requireNonNull(value, "includeShared is required"));
    }

    public void setIncludeShared(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeShared", java.util.Objects.requireNonNull(value, "includeShared is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMostRecent() {
        return software.amazon.jsii.Kernel.get(this, "mostRecent", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMostRecent(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mostRecent", java.util.Objects.requireNonNull(value, "mostRecent is required"));
    }

    public void setMostRecent(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "mostRecent", java.util.Objects.requireNonNull(value, "mostRecent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotType() {
        return software.amazon.jsii.Kernel.get(this, "snapshotType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotType", java.util.Objects.requireNonNull(value, "snapshotType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.rds.DataAwsDbClusterSnapshot}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.rds.DataAwsDbClusterSnapshot> {
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
        private imports.aws.rds.DataAwsDbClusterSnapshotConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#db_cluster_identifier DataAwsDbClusterSnapshot#db_cluster_identifier}.
         * <p>
         * @return {@code this}
         * @param dbClusterIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#db_cluster_identifier DataAwsDbClusterSnapshot#db_cluster_identifier}. This parameter is required.
         */
        public Builder dbClusterIdentifier(final java.lang.String dbClusterIdentifier) {
            this.config().dbClusterIdentifier(dbClusterIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#db_cluster_snapshot_identifier DataAwsDbClusterSnapshot#db_cluster_snapshot_identifier}.
         * <p>
         * @return {@code this}
         * @param dbClusterSnapshotIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#db_cluster_snapshot_identifier DataAwsDbClusterSnapshot#db_cluster_snapshot_identifier}. This parameter is required.
         */
        public Builder dbClusterSnapshotIdentifier(final java.lang.String dbClusterSnapshotIdentifier) {
            this.config().dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#id DataAwsDbClusterSnapshot#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#id DataAwsDbClusterSnapshot#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_public DataAwsDbClusterSnapshot#include_public}.
         * <p>
         * @return {@code this}
         * @param includePublic Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_public DataAwsDbClusterSnapshot#include_public}. This parameter is required.
         */
        public Builder includePublic(final java.lang.Boolean includePublic) {
            this.config().includePublic(includePublic);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_public DataAwsDbClusterSnapshot#include_public}.
         * <p>
         * @return {@code this}
         * @param includePublic Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_public DataAwsDbClusterSnapshot#include_public}. This parameter is required.
         */
        public Builder includePublic(final com.hashicorp.cdktf.IResolvable includePublic) {
            this.config().includePublic(includePublic);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_shared DataAwsDbClusterSnapshot#include_shared}.
         * <p>
         * @return {@code this}
         * @param includeShared Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_shared DataAwsDbClusterSnapshot#include_shared}. This parameter is required.
         */
        public Builder includeShared(final java.lang.Boolean includeShared) {
            this.config().includeShared(includeShared);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_shared DataAwsDbClusterSnapshot#include_shared}.
         * <p>
         * @return {@code this}
         * @param includeShared Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#include_shared DataAwsDbClusterSnapshot#include_shared}. This parameter is required.
         */
        public Builder includeShared(final com.hashicorp.cdktf.IResolvable includeShared) {
            this.config().includeShared(includeShared);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#most_recent DataAwsDbClusterSnapshot#most_recent}.
         * <p>
         * @return {@code this}
         * @param mostRecent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#most_recent DataAwsDbClusterSnapshot#most_recent}. This parameter is required.
         */
        public Builder mostRecent(final java.lang.Boolean mostRecent) {
            this.config().mostRecent(mostRecent);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#most_recent DataAwsDbClusterSnapshot#most_recent}.
         * <p>
         * @return {@code this}
         * @param mostRecent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#most_recent DataAwsDbClusterSnapshot#most_recent}. This parameter is required.
         */
        public Builder mostRecent(final com.hashicorp.cdktf.IResolvable mostRecent) {
            this.config().mostRecent(mostRecent);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#snapshot_type DataAwsDbClusterSnapshot#snapshot_type}.
         * <p>
         * @return {@code this}
         * @param snapshotType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#snapshot_type DataAwsDbClusterSnapshot#snapshot_type}. This parameter is required.
         */
        public Builder snapshotType(final java.lang.String snapshotType) {
            this.config().snapshotType(snapshotType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#tags DataAwsDbClusterSnapshot#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/db_cluster_snapshot#tags DataAwsDbClusterSnapshot#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.rds.DataAwsDbClusterSnapshot}.
         */
        @Override
        public imports.aws.rds.DataAwsDbClusterSnapshot build() {
            return new imports.aws.rds.DataAwsDbClusterSnapshot(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.rds.DataAwsDbClusterSnapshotConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.rds.DataAwsDbClusterSnapshotConfig.Builder();
            }
            return this.config;
        }
    }
}
