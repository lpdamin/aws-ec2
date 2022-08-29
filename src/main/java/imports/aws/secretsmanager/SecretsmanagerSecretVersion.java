package imports.aws.secretsmanager;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version aws_secretsmanager_secret_version}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.560Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.secretsmanager.SecretsmanagerSecretVersion")
public class SecretsmanagerSecretVersion extends com.hashicorp.cdktf.TerraformResource {

    protected SecretsmanagerSecretVersion(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SecretsmanagerSecretVersion(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.secretsmanager.SecretsmanagerSecretVersion.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version aws_secretsmanager_secret_version} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SecretsmanagerSecretVersion(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.secretsmanager.SecretsmanagerSecretVersionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretBinary() {
        software.amazon.jsii.Kernel.call(this, "resetSecretBinary", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretString() {
        software.amazon.jsii.Kernel.call(this, "resetSecretString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersionStages() {
        software.amazon.jsii.Kernel.call(this, "resetVersionStages", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionId() {
        return software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretBinaryInput() {
        return software.amazon.jsii.Kernel.get(this, "secretBinaryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretIdInput() {
        return software.amazon.jsii.Kernel.get(this, "secretIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretStringInput() {
        return software.amazon.jsii.Kernel.get(this, "secretStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVersionStagesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "versionStagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretBinary() {
        return software.amazon.jsii.Kernel.get(this, "secretBinary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretBinary(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretBinary", java.util.Objects.requireNonNull(value, "secretBinary is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretId() {
        return software.amazon.jsii.Kernel.get(this, "secretId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretId", java.util.Objects.requireNonNull(value, "secretId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretString() {
        return software.amazon.jsii.Kernel.get(this, "secretString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretString", java.util.Objects.requireNonNull(value, "secretString is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVersionStages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "versionStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVersionStages(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "versionStages", java.util.Objects.requireNonNull(value, "versionStages is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.secretsmanager.SecretsmanagerSecretVersion}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.secretsmanager.SecretsmanagerSecretVersion> {
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
        private final imports.aws.secretsmanager.SecretsmanagerSecretVersionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.secretsmanager.SecretsmanagerSecretVersionConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#secret_id SecretsmanagerSecretVersion#secret_id}.
         * <p>
         * @return {@code this}
         * @param secretId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#secret_id SecretsmanagerSecretVersion#secret_id}. This parameter is required.
         */
        public Builder secretId(final java.lang.String secretId) {
            this.config.secretId(secretId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#id SecretsmanagerSecretVersion#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#id SecretsmanagerSecretVersion#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#secret_binary SecretsmanagerSecretVersion#secret_binary}.
         * <p>
         * @return {@code this}
         * @param secretBinary Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#secret_binary SecretsmanagerSecretVersion#secret_binary}. This parameter is required.
         */
        public Builder secretBinary(final java.lang.String secretBinary) {
            this.config.secretBinary(secretBinary);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#secret_string SecretsmanagerSecretVersion#secret_string}.
         * <p>
         * @return {@code this}
         * @param secretString Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#secret_string SecretsmanagerSecretVersion#secret_string}. This parameter is required.
         */
        public Builder secretString(final java.lang.String secretString) {
            this.config.secretString(secretString);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#version_stages SecretsmanagerSecretVersion#version_stages}.
         * <p>
         * @return {@code this}
         * @param versionStages Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version#version_stages SecretsmanagerSecretVersion#version_stages}. This parameter is required.
         */
        public Builder versionStages(final java.util.List<java.lang.String> versionStages) {
            this.config.versionStages(versionStages);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.secretsmanager.SecretsmanagerSecretVersion}.
         */
        @Override
        public imports.aws.secretsmanager.SecretsmanagerSecretVersion build() {
            return new imports.aws.secretsmanager.SecretsmanagerSecretVersion(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
