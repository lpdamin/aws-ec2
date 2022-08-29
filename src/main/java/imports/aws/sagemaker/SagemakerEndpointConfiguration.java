package imports.aws.sagemaker;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration aws_sagemaker_endpoint_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.500Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfiguration")
public class SagemakerEndpointConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected SagemakerEndpointConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.sagemaker.SagemakerEndpointConfiguration.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration aws_sagemaker_endpoint_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SagemakerEndpointConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAsyncInferenceConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig value) {
        software.amazon.jsii.Kernel.call(this, "putAsyncInferenceConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDataCaptureConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDataCaptureConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putProductionVariants(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putProductionVariants", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAsyncInferenceConfig() {
        software.amazon.jsii.Kernel.call(this, "resetAsyncInferenceConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataCaptureConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDataCaptureConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference getAsyncInferenceConfig() {
        return software.amazon.jsii.Kernel.get(this, "asyncInferenceConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigOutputReference getDataCaptureConfig() {
        return software.amazon.jsii.Kernel.get(this, "dataCaptureConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsList getProductionVariants() {
        return software.amazon.jsii.Kernel.get(this, "productionVariants", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig getAsyncInferenceConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "asyncInferenceConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig getDataCaptureConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "dataCaptureConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getProductionVariantsInput() {
        return software.amazon.jsii.Kernel.get(this, "productionVariantsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
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
     * A fluent builder for {@link imports.aws.sagemaker.SagemakerEndpointConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.sagemaker.SagemakerEndpointConfiguration> {
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
        private final imports.aws.sagemaker.SagemakerEndpointConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.sagemaker.SagemakerEndpointConfigurationConfig.Builder();
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
         * production_variants block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#production_variants SagemakerEndpointConfiguration#production_variants}
         * <p>
         * @return {@code this}
         * @param productionVariants production_variants block. This parameter is required.
         */
        public Builder productionVariants(final com.hashicorp.cdktf.IResolvable productionVariants) {
            this.config.productionVariants(productionVariants);
            return this;
        }
        /**
         * production_variants block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#production_variants SagemakerEndpointConfiguration#production_variants}
         * <p>
         * @return {@code this}
         * @param productionVariants production_variants block. This parameter is required.
         */
        public Builder productionVariants(final java.util.List<? extends imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariants> productionVariants) {
            this.config.productionVariants(productionVariants);
            return this;
        }

        /**
         * async_inference_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#async_inference_config SagemakerEndpointConfiguration#async_inference_config}
         * <p>
         * @return {@code this}
         * @param asyncInferenceConfig async_inference_config block. This parameter is required.
         */
        public Builder asyncInferenceConfig(final imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig asyncInferenceConfig) {
            this.config.asyncInferenceConfig(asyncInferenceConfig);
            return this;
        }

        /**
         * data_capture_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#data_capture_config SagemakerEndpointConfiguration#data_capture_config}
         * <p>
         * @return {@code this}
         * @param dataCaptureConfig data_capture_config block. This parameter is required.
         */
        public Builder dataCaptureConfig(final imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig dataCaptureConfig) {
            this.config.dataCaptureConfig(dataCaptureConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#id SagemakerEndpointConfiguration#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#id SagemakerEndpointConfiguration#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#kms_key_arn SagemakerEndpointConfiguration#kms_key_arn}.
         * <p>
         * @return {@code this}
         * @param kmsKeyArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#kms_key_arn SagemakerEndpointConfiguration#kms_key_arn}. This parameter is required.
         */
        public Builder kmsKeyArn(final java.lang.String kmsKeyArn) {
            this.config.kmsKeyArn(kmsKeyArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#name SagemakerEndpointConfiguration#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#name SagemakerEndpointConfiguration#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#tags SagemakerEndpointConfiguration#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#tags SagemakerEndpointConfiguration#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#tags_all SagemakerEndpointConfiguration#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#tags_all SagemakerEndpointConfiguration#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.sagemaker.SagemakerEndpointConfiguration}.
         */
        @Override
        public imports.aws.sagemaker.SagemakerEndpointConfiguration build() {
            return new imports.aws.sagemaker.SagemakerEndpointConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
