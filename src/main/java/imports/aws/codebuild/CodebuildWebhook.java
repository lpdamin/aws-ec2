package imports.aws.codebuild;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook aws_codebuild_webhook}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.104Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildWebhook")
public class CodebuildWebhook extends com.hashicorp.cdktf.TerraformResource {

    protected CodebuildWebhook(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildWebhook(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.codebuild.CodebuildWebhook.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook aws_codebuild_webhook} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CodebuildWebhook(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildWebhookConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putFilterGroup(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilterGroup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBranchFilter() {
        software.amazon.jsii.Kernel.call(this, "resetBranchFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBuildType() {
        software.amazon.jsii.Kernel.call(this, "resetBuildType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilterGroup() {
        software.amazon.jsii.Kernel.call(this, "resetFilterGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildWebhookFilterGroupList getFilterGroup() {
        return software.amazon.jsii.Kernel.get(this, "filterGroup", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildWebhookFilterGroupList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPayloadUrl() {
        return software.amazon.jsii.Kernel.get(this, "payloadUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecret() {
        return software.amazon.jsii.Kernel.get(this, "secret", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBranchFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "branchFilterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBuildTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "buildTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "filterGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProjectNameInput() {
        return software.amazon.jsii.Kernel.get(this, "projectNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBranchFilter() {
        return software.amazon.jsii.Kernel.get(this, "branchFilter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBranchFilter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "branchFilter", java.util.Objects.requireNonNull(value, "branchFilter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBuildType() {
        return software.amazon.jsii.Kernel.get(this, "buildType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBuildType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "buildType", java.util.Objects.requireNonNull(value, "buildType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProjectName() {
        return software.amazon.jsii.Kernel.get(this, "projectName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProjectName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "projectName", java.util.Objects.requireNonNull(value, "projectName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.codebuild.CodebuildWebhook}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.codebuild.CodebuildWebhook> {
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
        private final imports.aws.codebuild.CodebuildWebhookConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.codebuild.CodebuildWebhookConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#project_name CodebuildWebhook#project_name}.
         * <p>
         * @return {@code this}
         * @param projectName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#project_name CodebuildWebhook#project_name}. This parameter is required.
         */
        public Builder projectName(final java.lang.String projectName) {
            this.config.projectName(projectName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#branch_filter CodebuildWebhook#branch_filter}.
         * <p>
         * @return {@code this}
         * @param branchFilter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#branch_filter CodebuildWebhook#branch_filter}. This parameter is required.
         */
        public Builder branchFilter(final java.lang.String branchFilter) {
            this.config.branchFilter(branchFilter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#build_type CodebuildWebhook#build_type}.
         * <p>
         * @return {@code this}
         * @param buildType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#build_type CodebuildWebhook#build_type}. This parameter is required.
         */
        public Builder buildType(final java.lang.String buildType) {
            this.config.buildType(buildType);
            return this;
        }

        /**
         * filter_group block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#filter_group CodebuildWebhook#filter_group}
         * <p>
         * @return {@code this}
         * @param filterGroup filter_group block. This parameter is required.
         */
        public Builder filterGroup(final com.hashicorp.cdktf.IResolvable filterGroup) {
            this.config.filterGroup(filterGroup);
            return this;
        }
        /**
         * filter_group block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#filter_group CodebuildWebhook#filter_group}
         * <p>
         * @return {@code this}
         * @param filterGroup filter_group block. This parameter is required.
         */
        public Builder filterGroup(final java.util.List<? extends imports.aws.codebuild.CodebuildWebhookFilterGroup> filterGroup) {
            this.config.filterGroup(filterGroup);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#id CodebuildWebhook#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#id CodebuildWebhook#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.codebuild.CodebuildWebhook}.
         */
        @Override
        public imports.aws.codebuild.CodebuildWebhook build() {
            return new imports.aws.codebuild.CodebuildWebhook(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
