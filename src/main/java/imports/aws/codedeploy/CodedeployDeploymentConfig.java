package imports.aws.codedeploy;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config aws_codedeploy_deployment_config}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.524Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentConfig")
public class CodedeployDeploymentConfig extends com.hashicorp.cdktf.TerraformResource {

    protected CodedeployDeploymentConfig(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentConfig(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.codedeploy.CodedeployDeploymentConfig.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config aws_codedeploy_deployment_config} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CodedeployDeploymentConfig(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putMinimumHealthyHosts(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigMinimumHealthyHosts value) {
        software.amazon.jsii.Kernel.call(this, "putMinimumHealthyHosts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTrafficRoutingConfig(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putTrafficRoutingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetComputePlatform() {
        software.amazon.jsii.Kernel.call(this, "resetComputePlatform", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinimumHealthyHosts() {
        software.amazon.jsii.Kernel.call(this, "resetMinimumHealthyHosts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrafficRoutingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetTrafficRoutingConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigId() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigMinimumHealthyHostsOutputReference getMinimumHealthyHosts() {
        return software.amazon.jsii.Kernel.get(this, "minimumHealthyHosts", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigMinimumHealthyHostsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigOutputReference getTrafficRoutingConfig() {
        return software.amazon.jsii.Kernel.get(this, "trafficRoutingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getComputePlatformInput() {
        return software.amazon.jsii.Kernel.get(this, "computePlatformInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeploymentConfigNameInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigMinimumHealthyHosts getMinimumHealthyHostsInput() {
        return software.amazon.jsii.Kernel.get(this, "minimumHealthyHostsInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigMinimumHealthyHosts.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig getTrafficRoutingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "trafficRoutingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComputePlatform() {
        return software.amazon.jsii.Kernel.get(this, "computePlatform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComputePlatform(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "computePlatform", java.util.Objects.requireNonNull(value, "computePlatform is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentConfigName() {
        return software.amazon.jsii.Kernel.get(this, "deploymentConfigName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentConfigName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentConfigName", java.util.Objects.requireNonNull(value, "deploymentConfigName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.codedeploy.CodedeployDeploymentConfig}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.codedeploy.CodedeployDeploymentConfig> {
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
        private final imports.aws.codedeploy.CodedeployDeploymentConfigConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.codedeploy.CodedeployDeploymentConfigConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#deployment_config_name CodedeployDeploymentConfig#deployment_config_name}.
         * <p>
         * @return {@code this}
         * @param deploymentConfigName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#deployment_config_name CodedeployDeploymentConfig#deployment_config_name}. This parameter is required.
         */
        public Builder deploymentConfigName(final java.lang.String deploymentConfigName) {
            this.config.deploymentConfigName(deploymentConfigName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#compute_platform CodedeployDeploymentConfig#compute_platform}.
         * <p>
         * @return {@code this}
         * @param computePlatform Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#compute_platform CodedeployDeploymentConfig#compute_platform}. This parameter is required.
         */
        public Builder computePlatform(final java.lang.String computePlatform) {
            this.config.computePlatform(computePlatform);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#id CodedeployDeploymentConfig#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#id CodedeployDeploymentConfig#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * minimum_healthy_hosts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#minimum_healthy_hosts CodedeployDeploymentConfig#minimum_healthy_hosts}
         * <p>
         * @return {@code this}
         * @param minimumHealthyHosts minimum_healthy_hosts block. This parameter is required.
         */
        public Builder minimumHealthyHosts(final imports.aws.codedeploy.CodedeployDeploymentConfigMinimumHealthyHosts minimumHealthyHosts) {
            this.config.minimumHealthyHosts(minimumHealthyHosts);
            return this;
        }

        /**
         * traffic_routing_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codedeploy_deployment_config#traffic_routing_config CodedeployDeploymentConfig#traffic_routing_config}
         * <p>
         * @return {@code this}
         * @param trafficRoutingConfig traffic_routing_config block. This parameter is required.
         */
        public Builder trafficRoutingConfig(final imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig trafficRoutingConfig) {
            this.config.trafficRoutingConfig(trafficRoutingConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.codedeploy.CodedeployDeploymentConfig}.
         */
        @Override
        public imports.aws.codedeploy.CodedeployDeploymentConfig build() {
            return new imports.aws.codedeploy.CodedeployDeploymentConfig(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
