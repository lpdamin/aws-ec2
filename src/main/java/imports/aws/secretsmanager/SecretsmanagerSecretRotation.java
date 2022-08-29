package imports.aws.secretsmanager;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation aws_secretsmanager_secret_rotation}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.559Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.secretsmanager.SecretsmanagerSecretRotation")
public class SecretsmanagerSecretRotation extends com.hashicorp.cdktf.TerraformResource {

    protected SecretsmanagerSecretRotation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SecretsmanagerSecretRotation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.secretsmanager.SecretsmanagerSecretRotation.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation aws_secretsmanager_secret_rotation} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SecretsmanagerSecretRotation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.secretsmanager.SecretsmanagerSecretRotationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putRotationRules(final @org.jetbrains.annotations.NotNull imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules value) {
        software.amazon.jsii.Kernel.call(this, "putRotationRules", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getRotationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "rotationEnabled", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRulesOutputReference getRotationRules() {
        return software.amazon.jsii.Kernel.get(this, "rotationRules", software.amazon.jsii.NativeType.forClass(imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRulesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRotationLambdaArnInput() {
        return software.amazon.jsii.Kernel.get(this, "rotationLambdaArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules getRotationRulesInput() {
        return software.amazon.jsii.Kernel.get(this, "rotationRulesInput", software.amazon.jsii.NativeType.forClass(imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretIdInput() {
        return software.amazon.jsii.Kernel.get(this, "secretIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRotationLambdaArn() {
        return software.amazon.jsii.Kernel.get(this, "rotationLambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRotationLambdaArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rotationLambdaArn", java.util.Objects.requireNonNull(value, "rotationLambdaArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretId() {
        return software.amazon.jsii.Kernel.get(this, "secretId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretId", java.util.Objects.requireNonNull(value, "secretId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.secretsmanager.SecretsmanagerSecretRotation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.secretsmanager.SecretsmanagerSecretRotation> {
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
        private final imports.aws.secretsmanager.SecretsmanagerSecretRotationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.secretsmanager.SecretsmanagerSecretRotationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#rotation_lambda_arn SecretsmanagerSecretRotation#rotation_lambda_arn}.
         * <p>
         * @return {@code this}
         * @param rotationLambdaArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#rotation_lambda_arn SecretsmanagerSecretRotation#rotation_lambda_arn}. This parameter is required.
         */
        public Builder rotationLambdaArn(final java.lang.String rotationLambdaArn) {
            this.config.rotationLambdaArn(rotationLambdaArn);
            return this;
        }

        /**
         * rotation_rules block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#rotation_rules SecretsmanagerSecretRotation#rotation_rules}
         * <p>
         * @return {@code this}
         * @param rotationRules rotation_rules block. This parameter is required.
         */
        public Builder rotationRules(final imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules rotationRules) {
            this.config.rotationRules(rotationRules);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#secret_id SecretsmanagerSecretRotation#secret_id}.
         * <p>
         * @return {@code this}
         * @param secretId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#secret_id SecretsmanagerSecretRotation#secret_id}. This parameter is required.
         */
        public Builder secretId(final java.lang.String secretId) {
            this.config.secretId(secretId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#id SecretsmanagerSecretRotation#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#id SecretsmanagerSecretRotation#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#tags SecretsmanagerSecretRotation#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_rotation#tags SecretsmanagerSecretRotation#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.secretsmanager.SecretsmanagerSecretRotation}.
         */
        @Override
        public imports.aws.secretsmanager.SecretsmanagerSecretRotation build() {
            return new imports.aws.secretsmanager.SecretsmanagerSecretRotation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
