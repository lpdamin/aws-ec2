package imports.aws.imagebuilder;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe aws_imagebuilder_container_recipe}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.390Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderContainerRecipe")
public class ImagebuilderContainerRecipe extends com.hashicorp.cdktf.TerraformResource {

    protected ImagebuilderContainerRecipe(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ImagebuilderContainerRecipe(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.imagebuilder.ImagebuilderContainerRecipe.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe aws_imagebuilder_container_recipe} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ImagebuilderContainerRecipe(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderContainerRecipeConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putComponent(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putComponent", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInstanceConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderContainerRecipeInstanceConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putInstanceConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetRepository(final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderContainerRecipeTargetRepository value) {
        software.amazon.jsii.Kernel.call(this, "putTargetRepository", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDockerfileTemplateData() {
        software.amazon.jsii.Kernel.call(this, "resetDockerfileTemplateData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDockerfileTemplateUri() {
        software.amazon.jsii.Kernel.call(this, "resetDockerfileTemplateUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkingDirectory() {
        software.amazon.jsii.Kernel.call(this, "resetWorkingDirectory", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderContainerRecipeComponentList getComponent() {
        return software.amazon.jsii.Kernel.get(this, "component", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderContainerRecipeComponentList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDateCreated() {
        return software.amazon.jsii.Kernel.get(this, "dateCreated", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderContainerRecipeInstanceConfigurationOutputReference getInstanceConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "instanceConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderContainerRecipeInstanceConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwner() {
        return software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatform() {
        return software.amazon.jsii.Kernel.get(this, "platform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderContainerRecipeTargetRepositoryOutputReference getTargetRepository() {
        return software.amazon.jsii.Kernel.get(this, "targetRepository", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderContainerRecipeTargetRepositoryOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getComponentInput() {
        return software.amazon.jsii.Kernel.get(this, "componentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContainerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "containerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerfileTemplateDataInput() {
        return software.amazon.jsii.Kernel.get(this, "dockerfileTemplateDataInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerfileTemplateUriInput() {
        return software.amazon.jsii.Kernel.get(this, "dockerfileTemplateUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderContainerRecipeInstanceConfiguration getInstanceConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderContainerRecipeInstanceConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParentImageInput() {
        return software.amazon.jsii.Kernel.get(this, "parentImageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderContainerRecipeTargetRepository getTargetRepositoryInput() {
        return software.amazon.jsii.Kernel.get(this, "targetRepositoryInput", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderContainerRecipeTargetRepository.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWorkingDirectoryInput() {
        return software.amazon.jsii.Kernel.get(this, "workingDirectoryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainerType() {
        return software.amazon.jsii.Kernel.get(this, "containerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContainerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "containerType", java.util.Objects.requireNonNull(value, "containerType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDockerfileTemplateData() {
        return software.amazon.jsii.Kernel.get(this, "dockerfileTemplateData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerfileTemplateData(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerfileTemplateData", java.util.Objects.requireNonNull(value, "dockerfileTemplateData is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDockerfileTemplateUri() {
        return software.amazon.jsii.Kernel.get(this, "dockerfileTemplateUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerfileTemplateUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerfileTemplateUri", java.util.Objects.requireNonNull(value, "dockerfileTemplateUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParentImage() {
        return software.amazon.jsii.Kernel.get(this, "parentImage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParentImage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parentImage", java.util.Objects.requireNonNull(value, "parentImage is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkingDirectory() {
        return software.amazon.jsii.Kernel.get(this, "workingDirectory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWorkingDirectory(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "workingDirectory", java.util.Objects.requireNonNull(value, "workingDirectory is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.imagebuilder.ImagebuilderContainerRecipe}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.imagebuilder.ImagebuilderContainerRecipe> {
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
        private final imports.aws.imagebuilder.ImagebuilderContainerRecipeConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.imagebuilder.ImagebuilderContainerRecipeConfig.Builder();
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
         * component block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#component ImagebuilderContainerRecipe#component}
         * <p>
         * @return {@code this}
         * @param component component block. This parameter is required.
         */
        public Builder component(final com.hashicorp.cdktf.IResolvable component) {
            this.config.component(component);
            return this;
        }
        /**
         * component block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#component ImagebuilderContainerRecipe#component}
         * <p>
         * @return {@code this}
         * @param component component block. This parameter is required.
         */
        public Builder component(final java.util.List<? extends imports.aws.imagebuilder.ImagebuilderContainerRecipeComponent> component) {
            this.config.component(component);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#container_type ImagebuilderContainerRecipe#container_type}.
         * <p>
         * @return {@code this}
         * @param containerType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#container_type ImagebuilderContainerRecipe#container_type}. This parameter is required.
         */
        public Builder containerType(final java.lang.String containerType) {
            this.config.containerType(containerType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#name ImagebuilderContainerRecipe#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#name ImagebuilderContainerRecipe#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#parent_image ImagebuilderContainerRecipe#parent_image}.
         * <p>
         * @return {@code this}
         * @param parentImage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#parent_image ImagebuilderContainerRecipe#parent_image}. This parameter is required.
         */
        public Builder parentImage(final java.lang.String parentImage) {
            this.config.parentImage(parentImage);
            return this;
        }

        /**
         * target_repository block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#target_repository ImagebuilderContainerRecipe#target_repository}
         * <p>
         * @return {@code this}
         * @param targetRepository target_repository block. This parameter is required.
         */
        public Builder targetRepository(final imports.aws.imagebuilder.ImagebuilderContainerRecipeTargetRepository targetRepository) {
            this.config.targetRepository(targetRepository);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#version ImagebuilderContainerRecipe#version}.
         * <p>
         * @return {@code this}
         * @param version Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#version ImagebuilderContainerRecipe#version}. This parameter is required.
         */
        public Builder version(final java.lang.String version) {
            this.config.version(version);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#description ImagebuilderContainerRecipe#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#description ImagebuilderContainerRecipe#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#dockerfile_template_data ImagebuilderContainerRecipe#dockerfile_template_data}.
         * <p>
         * @return {@code this}
         * @param dockerfileTemplateData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#dockerfile_template_data ImagebuilderContainerRecipe#dockerfile_template_data}. This parameter is required.
         */
        public Builder dockerfileTemplateData(final java.lang.String dockerfileTemplateData) {
            this.config.dockerfileTemplateData(dockerfileTemplateData);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#dockerfile_template_uri ImagebuilderContainerRecipe#dockerfile_template_uri}.
         * <p>
         * @return {@code this}
         * @param dockerfileTemplateUri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#dockerfile_template_uri ImagebuilderContainerRecipe#dockerfile_template_uri}. This parameter is required.
         */
        public Builder dockerfileTemplateUri(final java.lang.String dockerfileTemplateUri) {
            this.config.dockerfileTemplateUri(dockerfileTemplateUri);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#id ImagebuilderContainerRecipe#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#id ImagebuilderContainerRecipe#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * instance_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#instance_configuration ImagebuilderContainerRecipe#instance_configuration}
         * <p>
         * @return {@code this}
         * @param instanceConfiguration instance_configuration block. This parameter is required.
         */
        public Builder instanceConfiguration(final imports.aws.imagebuilder.ImagebuilderContainerRecipeInstanceConfiguration instanceConfiguration) {
            this.config.instanceConfiguration(instanceConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#kms_key_id ImagebuilderContainerRecipe#kms_key_id}.
         * <p>
         * @return {@code this}
         * @param kmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#kms_key_id ImagebuilderContainerRecipe#kms_key_id}. This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config.kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#tags ImagebuilderContainerRecipe#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#tags ImagebuilderContainerRecipe#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#tags_all ImagebuilderContainerRecipe#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#tags_all ImagebuilderContainerRecipe#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#working_directory ImagebuilderContainerRecipe#working_directory}.
         * <p>
         * @return {@code this}
         * @param workingDirectory Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_container_recipe#working_directory ImagebuilderContainerRecipe#working_directory}. This parameter is required.
         */
        public Builder workingDirectory(final java.lang.String workingDirectory) {
            this.config.workingDirectory(workingDirectory);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.imagebuilder.ImagebuilderContainerRecipe}.
         */
        @Override
        public imports.aws.imagebuilder.ImagebuilderContainerRecipe build() {
            return new imports.aws.imagebuilder.ImagebuilderContainerRecipe(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
