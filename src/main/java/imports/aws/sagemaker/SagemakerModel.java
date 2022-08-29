package imports.aws.sagemaker;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model aws_sagemaker_model}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.519Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModel")
public class SagemakerModel extends com.hashicorp.cdktf.TerraformResource {

    protected SagemakerModel(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerModel(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.sagemaker.SagemakerModel.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model aws_sagemaker_model} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SagemakerModel(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putContainer(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putContainer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInferenceExecutionConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelInferenceExecutionConfig value) {
        software.amazon.jsii.Kernel.call(this, "putInferenceExecutionConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPrimaryContainer(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelPrimaryContainer value) {
        software.amazon.jsii.Kernel.call(this, "putPrimaryContainer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVpcConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelVpcConfig value) {
        software.amazon.jsii.Kernel.call(this, "putVpcConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetContainer() {
        software.amazon.jsii.Kernel.call(this, "resetContainer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableNetworkIsolation() {
        software.amazon.jsii.Kernel.call(this, "resetEnableNetworkIsolation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInferenceExecutionConfig() {
        software.amazon.jsii.Kernel.call(this, "resetInferenceExecutionConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrimaryContainer() {
        software.amazon.jsii.Kernel.call(this, "resetPrimaryContainer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetVpcConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelContainerList getContainer() {
        return software.amazon.jsii.Kernel.get(this, "container", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelContainerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelInferenceExecutionConfigOutputReference getInferenceExecutionConfig() {
        return software.amazon.jsii.Kernel.get(this, "inferenceExecutionConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelInferenceExecutionConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelPrimaryContainerOutputReference getPrimaryContainer() {
        return software.amazon.jsii.Kernel.get(this, "primaryContainer", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelVpcConfigOutputReference getVpcConfig() {
        return software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelVpcConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getContainerInput() {
        return software.amazon.jsii.Kernel.get(this, "containerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableNetworkIsolationInput() {
        return software.amazon.jsii.Kernel.get(this, "enableNetworkIsolationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExecutionRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelInferenceExecutionConfig getInferenceExecutionConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "inferenceExecutionConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelInferenceExecutionConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainer getPrimaryContainerInput() {
        return software.amazon.jsii.Kernel.get(this, "primaryContainerInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainer.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelVpcConfig getVpcConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelVpcConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableNetworkIsolation() {
        return software.amazon.jsii.Kernel.get(this, "enableNetworkIsolation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableNetworkIsolation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableNetworkIsolation", java.util.Objects.requireNonNull(value, "enableNetworkIsolation is required"));
    }

    public void setEnableNetworkIsolation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableNetworkIsolation", java.util.Objects.requireNonNull(value, "enableNetworkIsolation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExecutionRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "executionRoleArn", java.util.Objects.requireNonNull(value, "executionRoleArn is required"));
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

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.sagemaker.SagemakerModel}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.sagemaker.SagemakerModel> {
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
        private final imports.aws.sagemaker.SagemakerModelConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.sagemaker.SagemakerModelConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#execution_role_arn SagemakerModel#execution_role_arn}.
         * <p>
         * @return {@code this}
         * @param executionRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#execution_role_arn SagemakerModel#execution_role_arn}. This parameter is required.
         */
        public Builder executionRoleArn(final java.lang.String executionRoleArn) {
            this.config.executionRoleArn(executionRoleArn);
            return this;
        }

        /**
         * container block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#container SagemakerModel#container}
         * <p>
         * @return {@code this}
         * @param container container block. This parameter is required.
         */
        public Builder container(final com.hashicorp.cdktf.IResolvable container) {
            this.config.container(container);
            return this;
        }
        /**
         * container block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#container SagemakerModel#container}
         * <p>
         * @return {@code this}
         * @param container container block. This parameter is required.
         */
        public Builder container(final java.util.List<? extends imports.aws.sagemaker.SagemakerModelContainer> container) {
            this.config.container(container);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#enable_network_isolation SagemakerModel#enable_network_isolation}.
         * <p>
         * @return {@code this}
         * @param enableNetworkIsolation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#enable_network_isolation SagemakerModel#enable_network_isolation}. This parameter is required.
         */
        public Builder enableNetworkIsolation(final java.lang.Boolean enableNetworkIsolation) {
            this.config.enableNetworkIsolation(enableNetworkIsolation);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#enable_network_isolation SagemakerModel#enable_network_isolation}.
         * <p>
         * @return {@code this}
         * @param enableNetworkIsolation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#enable_network_isolation SagemakerModel#enable_network_isolation}. This parameter is required.
         */
        public Builder enableNetworkIsolation(final com.hashicorp.cdktf.IResolvable enableNetworkIsolation) {
            this.config.enableNetworkIsolation(enableNetworkIsolation);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#id SagemakerModel#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#id SagemakerModel#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * inference_execution_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#inference_execution_config SagemakerModel#inference_execution_config}
         * <p>
         * @return {@code this}
         * @param inferenceExecutionConfig inference_execution_config block. This parameter is required.
         */
        public Builder inferenceExecutionConfig(final imports.aws.sagemaker.SagemakerModelInferenceExecutionConfig inferenceExecutionConfig) {
            this.config.inferenceExecutionConfig(inferenceExecutionConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#name SagemakerModel#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#name SagemakerModel#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * primary_container block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#primary_container SagemakerModel#primary_container}
         * <p>
         * @return {@code this}
         * @param primaryContainer primary_container block. This parameter is required.
         */
        public Builder primaryContainer(final imports.aws.sagemaker.SagemakerModelPrimaryContainer primaryContainer) {
            this.config.primaryContainer(primaryContainer);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#tags SagemakerModel#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#tags SagemakerModel#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#tags_all SagemakerModel#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#tags_all SagemakerModel#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * vpc_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#vpc_config SagemakerModel#vpc_config}
         * <p>
         * @return {@code this}
         * @param vpcConfig vpc_config block. This parameter is required.
         */
        public Builder vpcConfig(final imports.aws.sagemaker.SagemakerModelVpcConfig vpcConfig) {
            this.config.vpcConfig(vpcConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.sagemaker.SagemakerModel}.
         */
        @Override
        public imports.aws.sagemaker.SagemakerModel build() {
            return new imports.aws.sagemaker.SagemakerModel(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
