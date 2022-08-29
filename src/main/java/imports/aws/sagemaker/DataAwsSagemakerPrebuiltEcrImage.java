package imports.aws.sagemaker;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image aws_sagemaker_prebuilt_ecr_image}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.490Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage")
public class DataAwsSagemakerPrebuiltEcrImage extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsSagemakerPrebuiltEcrImage(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsSagemakerPrebuiltEcrImage(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image aws_sagemaker_prebuilt_ecr_image} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsSagemakerPrebuiltEcrImage(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImageConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDnsSuffix() {
        software.amazon.jsii.Kernel.call(this, "resetDnsSuffix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageTag() {
        software.amazon.jsii.Kernel.call(this, "resetImageTag", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getRegistryId() {
        return software.amazon.jsii.Kernel.get(this, "registryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegistryPath() {
        return software.amazon.jsii.Kernel.get(this, "registryPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDnsSuffixInput() {
        return software.amazon.jsii.Kernel.get(this, "dnsSuffixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageTagInput() {
        return software.amazon.jsii.Kernel.get(this, "imageTagInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryNameInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsSuffix() {
        return software.amazon.jsii.Kernel.get(this, "dnsSuffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDnsSuffix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dnsSuffix", java.util.Objects.requireNonNull(value, "dnsSuffix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageTag() {
        return software.amazon.jsii.Kernel.get(this, "imageTag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageTag(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageTag", java.util.Objects.requireNonNull(value, "imageTag is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryName() {
        return software.amazon.jsii.Kernel.get(this, "repositoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryName", java.util.Objects.requireNonNull(value, "repositoryName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage> {
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
        private final imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImageConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImageConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#repository_name DataAwsSagemakerPrebuiltEcrImage#repository_name}.
         * <p>
         * @return {@code this}
         * @param repositoryName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#repository_name DataAwsSagemakerPrebuiltEcrImage#repository_name}. This parameter is required.
         */
        public Builder repositoryName(final java.lang.String repositoryName) {
            this.config.repositoryName(repositoryName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#dns_suffix DataAwsSagemakerPrebuiltEcrImage#dns_suffix}.
         * <p>
         * @return {@code this}
         * @param dnsSuffix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#dns_suffix DataAwsSagemakerPrebuiltEcrImage#dns_suffix}. This parameter is required.
         */
        public Builder dnsSuffix(final java.lang.String dnsSuffix) {
            this.config.dnsSuffix(dnsSuffix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#id DataAwsSagemakerPrebuiltEcrImage#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#id DataAwsSagemakerPrebuiltEcrImage#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#image_tag DataAwsSagemakerPrebuiltEcrImage#image_tag}.
         * <p>
         * @return {@code this}
         * @param imageTag Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#image_tag DataAwsSagemakerPrebuiltEcrImage#image_tag}. This parameter is required.
         */
        public Builder imageTag(final java.lang.String imageTag) {
            this.config.imageTag(imageTag);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#region DataAwsSagemakerPrebuiltEcrImage#region}.
         * <p>
         * @return {@code this}
         * @param region Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/sagemaker_prebuilt_ecr_image#region DataAwsSagemakerPrebuiltEcrImage#region}. This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config.region(region);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage}.
         */
        @Override
        public imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage build() {
            return new imports.aws.sagemaker.DataAwsSagemakerPrebuiltEcrImage(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
