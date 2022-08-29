package imports.aws.redshift;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster aws_redshift_orderable_cluster}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.276Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.DataAwsRedshiftOrderableCluster")
public class DataAwsRedshiftOrderableCluster extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsRedshiftOrderableCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsRedshiftOrderableCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.redshift.DataAwsRedshiftOrderableCluster.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster aws_redshift_orderable_cluster} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsRedshiftOrderableCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.redshift.DataAwsRedshiftOrderableClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster aws_redshift_orderable_cluster} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsRedshiftOrderableCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetClusterType() {
        software.amazon.jsii.Kernel.call(this, "resetClusterType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterVersion() {
        software.amazon.jsii.Kernel.call(this, "resetClusterVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeType() {
        software.amazon.jsii.Kernel.call(this, "resetNodeType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreferredNodeTypes() {
        software.amazon.jsii.Kernel.call(this, "resetPreferredNodeTypes", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAvailabilityZones() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "availabilityZones", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNodeTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPreferredNodeTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "preferredNodeTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterType() {
        return software.amazon.jsii.Kernel.get(this, "clusterType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterType", java.util.Objects.requireNonNull(value, "clusterType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterVersion() {
        return software.amazon.jsii.Kernel.get(this, "clusterVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterVersion", java.util.Objects.requireNonNull(value, "clusterVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeType() {
        return software.amazon.jsii.Kernel.get(this, "nodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNodeType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nodeType", java.util.Objects.requireNonNull(value, "nodeType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPreferredNodeTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "preferredNodeTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPreferredNodeTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "preferredNodeTypes", java.util.Objects.requireNonNull(value, "preferredNodeTypes is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.redshift.DataAwsRedshiftOrderableCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.redshift.DataAwsRedshiftOrderableCluster> {
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
        private imports.aws.redshift.DataAwsRedshiftOrderableClusterConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#cluster_type DataAwsRedshiftOrderableCluster#cluster_type}.
         * <p>
         * @return {@code this}
         * @param clusterType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#cluster_type DataAwsRedshiftOrderableCluster#cluster_type}. This parameter is required.
         */
        public Builder clusterType(final java.lang.String clusterType) {
            this.config().clusterType(clusterType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#cluster_version DataAwsRedshiftOrderableCluster#cluster_version}.
         * <p>
         * @return {@code this}
         * @param clusterVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#cluster_version DataAwsRedshiftOrderableCluster#cluster_version}. This parameter is required.
         */
        public Builder clusterVersion(final java.lang.String clusterVersion) {
            this.config().clusterVersion(clusterVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#id DataAwsRedshiftOrderableCluster#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#id DataAwsRedshiftOrderableCluster#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#node_type DataAwsRedshiftOrderableCluster#node_type}.
         * <p>
         * @return {@code this}
         * @param nodeType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#node_type DataAwsRedshiftOrderableCluster#node_type}. This parameter is required.
         */
        public Builder nodeType(final java.lang.String nodeType) {
            this.config().nodeType(nodeType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#preferred_node_types DataAwsRedshiftOrderableCluster#preferred_node_types}.
         * <p>
         * @return {@code this}
         * @param preferredNodeTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/redshift_orderable_cluster#preferred_node_types DataAwsRedshiftOrderableCluster#preferred_node_types}. This parameter is required.
         */
        public Builder preferredNodeTypes(final java.util.List<java.lang.String> preferredNodeTypes) {
            this.config().preferredNodeTypes(preferredNodeTypes);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.redshift.DataAwsRedshiftOrderableCluster}.
         */
        @Override
        public imports.aws.redshift.DataAwsRedshiftOrderableCluster build() {
            return new imports.aws.redshift.DataAwsRedshiftOrderableCluster(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.redshift.DataAwsRedshiftOrderableClusterConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.redshift.DataAwsRedshiftOrderableClusterConfig.Builder();
            }
            return this.config;
        }
    }
}
