package imports.aws.apprunner;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service aws_apprunner_service}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.710Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerService")
public class ApprunnerService extends com.hashicorp.cdktf.TerraformResource {

    protected ApprunnerService(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApprunnerService(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.apprunner.ApprunnerService.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service aws_apprunner_service} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ApprunnerService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putEncryptionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putEncryptionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHealthCheckConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceHealthCheckConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putHealthCheckConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInstanceConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceInstanceConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putInstanceConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNetworkConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceNetworkConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putNetworkConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putObservabilityConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putObservabilityConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourceConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putSourceConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutoScalingConfigurationArn() {
        software.amazon.jsii.Kernel.call(this, "resetAutoScalingConfigurationArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObservabilityConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetObservabilityConfiguration", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceEncryptionConfigurationOutputReference getEncryptionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "encryptionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceEncryptionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceHealthCheckConfigurationOutputReference getHealthCheckConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceHealthCheckConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceInstanceConfigurationOutputReference getInstanceConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "instanceConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceInstanceConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceNetworkConfigurationOutputReference getNetworkConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceNetworkConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceObservabilityConfigurationOutputReference getObservabilityConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "observabilityConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceObservabilityConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceId() {
        return software.amazon.jsii.Kernel.get(this, "serviceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceUrl() {
        return software.amazon.jsii.Kernel.get(this, "serviceUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationOutputReference getSourceConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "sourceConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAutoScalingConfigurationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "autoScalingConfigurationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration getEncryptionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceHealthCheckConfiguration getHealthCheckConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceHealthCheckConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceInstanceConfiguration getInstanceConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceInstanceConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceNetworkConfiguration getNetworkConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "networkConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceNetworkConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration getObservabilityConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "observabilityConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfiguration getSourceConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoScalingConfigurationArn() {
        return software.amazon.jsii.Kernel.get(this, "autoScalingConfigurationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoScalingConfigurationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoScalingConfigurationArn", java.util.Objects.requireNonNull(value, "autoScalingConfigurationArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceName() {
        return software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceName", java.util.Objects.requireNonNull(value, "serviceName is required"));
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
     * A fluent builder for {@link imports.aws.apprunner.ApprunnerService}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.apprunner.ApprunnerService> {
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
        private final imports.aws.apprunner.ApprunnerServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.apprunner.ApprunnerServiceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#service_name ApprunnerService#service_name}.
         * <p>
         * @return {@code this}
         * @param serviceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#service_name ApprunnerService#service_name}. This parameter is required.
         */
        public Builder serviceName(final java.lang.String serviceName) {
            this.config.serviceName(serviceName);
            return this;
        }

        /**
         * source_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#source_configuration ApprunnerService#source_configuration}
         * <p>
         * @return {@code this}
         * @param sourceConfiguration source_configuration block. This parameter is required.
         */
        public Builder sourceConfiguration(final imports.aws.apprunner.ApprunnerServiceSourceConfiguration sourceConfiguration) {
            this.config.sourceConfiguration(sourceConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#auto_scaling_configuration_arn ApprunnerService#auto_scaling_configuration_arn}.
         * <p>
         * @return {@code this}
         * @param autoScalingConfigurationArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#auto_scaling_configuration_arn ApprunnerService#auto_scaling_configuration_arn}. This parameter is required.
         */
        public Builder autoScalingConfigurationArn(final java.lang.String autoScalingConfigurationArn) {
            this.config.autoScalingConfigurationArn(autoScalingConfigurationArn);
            return this;
        }

        /**
         * encryption_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#encryption_configuration ApprunnerService#encryption_configuration}
         * <p>
         * @return {@code this}
         * @param encryptionConfiguration encryption_configuration block. This parameter is required.
         */
        public Builder encryptionConfiguration(final imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration encryptionConfiguration) {
            this.config.encryptionConfiguration(encryptionConfiguration);
            return this;
        }

        /**
         * health_check_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#health_check_configuration ApprunnerService#health_check_configuration}
         * <p>
         * @return {@code this}
         * @param healthCheckConfiguration health_check_configuration block. This parameter is required.
         */
        public Builder healthCheckConfiguration(final imports.aws.apprunner.ApprunnerServiceHealthCheckConfiguration healthCheckConfiguration) {
            this.config.healthCheckConfiguration(healthCheckConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#id ApprunnerService#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#id ApprunnerService#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * instance_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#instance_configuration ApprunnerService#instance_configuration}
         * <p>
         * @return {@code this}
         * @param instanceConfiguration instance_configuration block. This parameter is required.
         */
        public Builder instanceConfiguration(final imports.aws.apprunner.ApprunnerServiceInstanceConfiguration instanceConfiguration) {
            this.config.instanceConfiguration(instanceConfiguration);
            return this;
        }

        /**
         * network_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#network_configuration ApprunnerService#network_configuration}
         * <p>
         * @return {@code this}
         * @param networkConfiguration network_configuration block. This parameter is required.
         */
        public Builder networkConfiguration(final imports.aws.apprunner.ApprunnerServiceNetworkConfiguration networkConfiguration) {
            this.config.networkConfiguration(networkConfiguration);
            return this;
        }

        /**
         * observability_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#observability_configuration ApprunnerService#observability_configuration}
         * <p>
         * @return {@code this}
         * @param observabilityConfiguration observability_configuration block. This parameter is required.
         */
        public Builder observabilityConfiguration(final imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration observabilityConfiguration) {
            this.config.observabilityConfiguration(observabilityConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#tags ApprunnerService#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#tags ApprunnerService#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#tags_all ApprunnerService#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/apprunner_service#tags_all ApprunnerService#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.apprunner.ApprunnerService}.
         */
        @Override
        public imports.aws.apprunner.ApprunnerService build() {
            return new imports.aws.apprunner.ApprunnerService(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
