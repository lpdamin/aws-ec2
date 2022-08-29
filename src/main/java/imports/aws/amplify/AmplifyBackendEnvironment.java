package imports.aws.amplify;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment aws_amplify_backend_environment}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.428Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.amplify.AmplifyBackendEnvironment")
public class AmplifyBackendEnvironment extends com.hashicorp.cdktf.TerraformResource {

    protected AmplifyBackendEnvironment(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AmplifyBackendEnvironment(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.amplify.AmplifyBackendEnvironment.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment aws_amplify_backend_environment} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AmplifyBackendEnvironment(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.amplify.AmplifyBackendEnvironmentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDeploymentArtifacts() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentArtifacts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStackName() {
        software.amazon.jsii.Kernel.call(this, "resetStackName", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAppIdInput() {
        return software.amazon.jsii.Kernel.get(this, "appIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeploymentArtifactsInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentArtifactsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEnvironmentNameInput() {
        return software.amazon.jsii.Kernel.get(this, "environmentNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStackNameInput() {
        return software.amazon.jsii.Kernel.get(this, "stackNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAppId() {
        return software.amazon.jsii.Kernel.get(this, "appId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAppId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "appId", java.util.Objects.requireNonNull(value, "appId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentArtifacts() {
        return software.amazon.jsii.Kernel.get(this, "deploymentArtifacts", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentArtifacts(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentArtifacts", java.util.Objects.requireNonNull(value, "deploymentArtifacts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEnvironmentName() {
        return software.amazon.jsii.Kernel.get(this, "environmentName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEnvironmentName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "environmentName", java.util.Objects.requireNonNull(value, "environmentName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackName() {
        return software.amazon.jsii.Kernel.get(this, "stackName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStackName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stackName", java.util.Objects.requireNonNull(value, "stackName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.amplify.AmplifyBackendEnvironment}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.amplify.AmplifyBackendEnvironment> {
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
        private final imports.aws.amplify.AmplifyBackendEnvironmentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.amplify.AmplifyBackendEnvironmentConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#app_id AmplifyBackendEnvironment#app_id}.
         * <p>
         * @return {@code this}
         * @param appId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#app_id AmplifyBackendEnvironment#app_id}. This parameter is required.
         */
        public Builder appId(final java.lang.String appId) {
            this.config.appId(appId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#environment_name AmplifyBackendEnvironment#environment_name}.
         * <p>
         * @return {@code this}
         * @param environmentName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#environment_name AmplifyBackendEnvironment#environment_name}. This parameter is required.
         */
        public Builder environmentName(final java.lang.String environmentName) {
            this.config.environmentName(environmentName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#deployment_artifacts AmplifyBackendEnvironment#deployment_artifacts}.
         * <p>
         * @return {@code this}
         * @param deploymentArtifacts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#deployment_artifacts AmplifyBackendEnvironment#deployment_artifacts}. This parameter is required.
         */
        public Builder deploymentArtifacts(final java.lang.String deploymentArtifacts) {
            this.config.deploymentArtifacts(deploymentArtifacts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#id AmplifyBackendEnvironment#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#id AmplifyBackendEnvironment#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#stack_name AmplifyBackendEnvironment#stack_name}.
         * <p>
         * @return {@code this}
         * @param stackName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#stack_name AmplifyBackendEnvironment#stack_name}. This parameter is required.
         */
        public Builder stackName(final java.lang.String stackName) {
            this.config.stackName(stackName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.amplify.AmplifyBackendEnvironment}.
         */
        @Override
        public imports.aws.amplify.AmplifyBackendEnvironment build() {
            return new imports.aws.amplify.AmplifyBackendEnvironment(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
