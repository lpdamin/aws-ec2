package imports.aws.elastictranscoder;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline aws_elastictranscoder_pipeline}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.667Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elastictranscoder.ElastictranscoderPipeline")
public class ElastictranscoderPipeline extends com.hashicorp.cdktf.TerraformResource {

    protected ElastictranscoderPipeline(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElastictranscoderPipeline(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.elastictranscoder.ElastictranscoderPipeline.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline aws_elastictranscoder_pipeline} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ElastictranscoderPipeline(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putContentConfig(final @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfig value) {
        software.amazon.jsii.Kernel.call(this, "putContentConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putContentConfigPermissions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putContentConfigPermissions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNotifications(final @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineNotifications value) {
        software.amazon.jsii.Kernel.call(this, "putNotifications", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putThumbnailConfig(final @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfig value) {
        software.amazon.jsii.Kernel.call(this, "putThumbnailConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putThumbnailConfigPermissions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putThumbnailConfigPermissions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAwsKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetAwsKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentConfig() {
        software.amazon.jsii.Kernel.call(this, "resetContentConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentConfigPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetContentConfigPermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotifications() {
        software.amazon.jsii.Kernel.call(this, "resetNotifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutputBucket() {
        software.amazon.jsii.Kernel.call(this, "resetOutputBucket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThumbnailConfig() {
        software.amazon.jsii.Kernel.call(this, "resetThumbnailConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThumbnailConfigPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetThumbnailConfigPermissions", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfigOutputReference getContentConfig() {
        return software.amazon.jsii.Kernel.get(this, "contentConfig", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfigPermissionsList getContentConfigPermissions() {
        return software.amazon.jsii.Kernel.get(this, "contentConfigPermissions", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfigPermissionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineNotificationsOutputReference getNotifications() {
        return software.amazon.jsii.Kernel.get(this, "notifications", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineNotificationsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfigOutputReference getThumbnailConfig() {
        return software.amazon.jsii.Kernel.get(this, "thumbnailConfig", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfigPermissionsList getThumbnailConfigPermissions() {
        return software.amazon.jsii.Kernel.get(this, "thumbnailConfigPermissions", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfigPermissionsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAwsKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "awsKmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfig getContentConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "contentConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getContentConfigPermissionsInput() {
        return software.amazon.jsii.Kernel.get(this, "contentConfigPermissionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "inputBucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elastictranscoder.ElastictranscoderPipelineNotifications getNotificationsInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationsInput", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineNotifications.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutputBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "outputBucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "roleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfig getThumbnailConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "thumbnailConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getThumbnailConfigPermissionsInput() {
        return software.amazon.jsii.Kernel.get(this, "thumbnailConfigPermissionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "awsKmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAwsKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "awsKmsKeyArn", java.util.Objects.requireNonNull(value, "awsKmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputBucket() {
        return software.amazon.jsii.Kernel.get(this, "inputBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputBucket", java.util.Objects.requireNonNull(value, "inputBucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutputBucket() {
        return software.amazon.jsii.Kernel.get(this, "outputBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutputBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outputBucket", java.util.Objects.requireNonNull(value, "outputBucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRole() {
        return software.amazon.jsii.Kernel.get(this, "role", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "role", java.util.Objects.requireNonNull(value, "role is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.elastictranscoder.ElastictranscoderPipeline}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.elastictranscoder.ElastictranscoderPipeline> {
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
        private final imports.aws.elastictranscoder.ElastictranscoderPipelineConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.elastictranscoder.ElastictranscoderPipelineConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#input_bucket ElastictranscoderPipeline#input_bucket}.
         * <p>
         * @return {@code this}
         * @param inputBucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#input_bucket ElastictranscoderPipeline#input_bucket}. This parameter is required.
         */
        public Builder inputBucket(final java.lang.String inputBucket) {
            this.config.inputBucket(inputBucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#role ElastictranscoderPipeline#role}.
         * <p>
         * @return {@code this}
         * @param role Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#role ElastictranscoderPipeline#role}. This parameter is required.
         */
        public Builder role(final java.lang.String role) {
            this.config.role(role);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#aws_kms_key_arn ElastictranscoderPipeline#aws_kms_key_arn}.
         * <p>
         * @return {@code this}
         * @param awsKmsKeyArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#aws_kms_key_arn ElastictranscoderPipeline#aws_kms_key_arn}. This parameter is required.
         */
        public Builder awsKmsKeyArn(final java.lang.String awsKmsKeyArn) {
            this.config.awsKmsKeyArn(awsKmsKeyArn);
            return this;
        }

        /**
         * content_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#content_config ElastictranscoderPipeline#content_config}
         * <p>
         * @return {@code this}
         * @param contentConfig content_config block. This parameter is required.
         */
        public Builder contentConfig(final imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfig contentConfig) {
            this.config.contentConfig(contentConfig);
            return this;
        }

        /**
         * content_config_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#content_config_permissions ElastictranscoderPipeline#content_config_permissions}
         * <p>
         * @return {@code this}
         * @param contentConfigPermissions content_config_permissions block. This parameter is required.
         */
        public Builder contentConfigPermissions(final com.hashicorp.cdktf.IResolvable contentConfigPermissions) {
            this.config.contentConfigPermissions(contentConfigPermissions);
            return this;
        }
        /**
         * content_config_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#content_config_permissions ElastictranscoderPipeline#content_config_permissions}
         * <p>
         * @return {@code this}
         * @param contentConfigPermissions content_config_permissions block. This parameter is required.
         */
        public Builder contentConfigPermissions(final java.util.List<? extends imports.aws.elastictranscoder.ElastictranscoderPipelineContentConfigPermissions> contentConfigPermissions) {
            this.config.contentConfigPermissions(contentConfigPermissions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#id ElastictranscoderPipeline#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#id ElastictranscoderPipeline#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#name ElastictranscoderPipeline#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#name ElastictranscoderPipeline#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * notifications block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#notifications ElastictranscoderPipeline#notifications}
         * <p>
         * @return {@code this}
         * @param notifications notifications block. This parameter is required.
         */
        public Builder notifications(final imports.aws.elastictranscoder.ElastictranscoderPipelineNotifications notifications) {
            this.config.notifications(notifications);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#output_bucket ElastictranscoderPipeline#output_bucket}.
         * <p>
         * @return {@code this}
         * @param outputBucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#output_bucket ElastictranscoderPipeline#output_bucket}. This parameter is required.
         */
        public Builder outputBucket(final java.lang.String outputBucket) {
            this.config.outputBucket(outputBucket);
            return this;
        }

        /**
         * thumbnail_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#thumbnail_config ElastictranscoderPipeline#thumbnail_config}
         * <p>
         * @return {@code this}
         * @param thumbnailConfig thumbnail_config block. This parameter is required.
         */
        public Builder thumbnailConfig(final imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfig thumbnailConfig) {
            this.config.thumbnailConfig(thumbnailConfig);
            return this;
        }

        /**
         * thumbnail_config_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#thumbnail_config_permissions ElastictranscoderPipeline#thumbnail_config_permissions}
         * <p>
         * @return {@code this}
         * @param thumbnailConfigPermissions thumbnail_config_permissions block. This parameter is required.
         */
        public Builder thumbnailConfigPermissions(final com.hashicorp.cdktf.IResolvable thumbnailConfigPermissions) {
            this.config.thumbnailConfigPermissions(thumbnailConfigPermissions);
            return this;
        }
        /**
         * thumbnail_config_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/elastictranscoder_pipeline#thumbnail_config_permissions ElastictranscoderPipeline#thumbnail_config_permissions}
         * <p>
         * @return {@code this}
         * @param thumbnailConfigPermissions thumbnail_config_permissions block. This parameter is required.
         */
        public Builder thumbnailConfigPermissions(final java.util.List<? extends imports.aws.elastictranscoder.ElastictranscoderPipelineThumbnailConfigPermissions> thumbnailConfigPermissions) {
            this.config.thumbnailConfigPermissions(thumbnailConfigPermissions);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.elastictranscoder.ElastictranscoderPipeline}.
         */
        @Override
        public imports.aws.elastictranscoder.ElastictranscoderPipeline build() {
            return new imports.aws.elastictranscoder.ElastictranscoderPipeline(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
