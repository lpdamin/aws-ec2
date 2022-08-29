package imports.aws.documentdb;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version aws_docdb_engine_version}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.472Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.documentdb.DataAwsDocdbEngineVersion")
public class DataAwsDocdbEngineVersion extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsDocdbEngineVersion(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsDocdbEngineVersion(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.documentdb.DataAwsDocdbEngineVersion.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version aws_docdb_engine_version} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsDocdbEngineVersion(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.documentdb.DataAwsDocdbEngineVersionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version aws_docdb_engine_version} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsDocdbEngineVersion(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetEngine() {
        software.amazon.jsii.Kernel.call(this, "resetEngine", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameterGroupFamily() {
        software.amazon.jsii.Kernel.call(this, "resetParameterGroupFamily", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreferredVersions() {
        software.amazon.jsii.Kernel.call(this, "resetPreferredVersions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineDescription() {
        return software.amazon.jsii.Kernel.get(this, "engineDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExportableLogTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "exportableLogTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getSupportsLogExportsToCloudwatch() {
        return software.amazon.jsii.Kernel.get(this, "supportsLogExportsToCloudwatch", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValidUpgradeTargets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "validUpgradeTargets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionDescription() {
        return software.amazon.jsii.Kernel.get(this, "versionDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineInput() {
        return software.amazon.jsii.Kernel.get(this, "engineInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParameterGroupFamilyInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterGroupFamilyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPreferredVersionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "preferredVersionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngine() {
        return software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngine(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engine", java.util.Objects.requireNonNull(value, "engine is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParameterGroupFamily() {
        return software.amazon.jsii.Kernel.get(this, "parameterGroupFamily", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParameterGroupFamily(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parameterGroupFamily", java.util.Objects.requireNonNull(value, "parameterGroupFamily is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPreferredVersions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "preferredVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPreferredVersions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "preferredVersions", java.util.Objects.requireNonNull(value, "preferredVersions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.documentdb.DataAwsDocdbEngineVersion}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.documentdb.DataAwsDocdbEngineVersion> {
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
        private imports.aws.documentdb.DataAwsDocdbEngineVersionConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#engine DataAwsDocdbEngineVersion#engine}.
         * <p>
         * @return {@code this}
         * @param engine Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#engine DataAwsDocdbEngineVersion#engine}. This parameter is required.
         */
        public Builder engine(final java.lang.String engine) {
            this.config().engine(engine);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#id DataAwsDocdbEngineVersion#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#id DataAwsDocdbEngineVersion#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#parameter_group_family DataAwsDocdbEngineVersion#parameter_group_family}.
         * <p>
         * @return {@code this}
         * @param parameterGroupFamily Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#parameter_group_family DataAwsDocdbEngineVersion#parameter_group_family}. This parameter is required.
         */
        public Builder parameterGroupFamily(final java.lang.String parameterGroupFamily) {
            this.config().parameterGroupFamily(parameterGroupFamily);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#preferred_versions DataAwsDocdbEngineVersion#preferred_versions}.
         * <p>
         * @return {@code this}
         * @param preferredVersions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#preferred_versions DataAwsDocdbEngineVersion#preferred_versions}. This parameter is required.
         */
        public Builder preferredVersions(final java.util.List<java.lang.String> preferredVersions) {
            this.config().preferredVersions(preferredVersions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#version DataAwsDocdbEngineVersion#version}.
         * <p>
         * @return {@code this}
         * @param version Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/docdb_engine_version#version DataAwsDocdbEngineVersion#version}. This parameter is required.
         */
        public Builder version(final java.lang.String version) {
            this.config().version(version);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.documentdb.DataAwsDocdbEngineVersion}.
         */
        @Override
        public imports.aws.documentdb.DataAwsDocdbEngineVersion build() {
            return new imports.aws.documentdb.DataAwsDocdbEngineVersion(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.documentdb.DataAwsDocdbEngineVersionConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.documentdb.DataAwsDocdbEngineVersionConfig.Builder();
            }
            return this.config;
        }
    }
}
