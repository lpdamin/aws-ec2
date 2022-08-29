package imports.aws.ecs;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster aws_ecs_cluster}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.891Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsCluster")
public class EcsCluster extends com.hashicorp.cdktf.TerraformResource {

    protected EcsCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ecs.EcsCluster.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster aws_ecs_cluster} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EcsCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDefaultCapacityProviderStrategy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDefaultCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSetting(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSetting", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacityProviders() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityProviders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultCapacityProviderStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSetting() {
        software.amazon.jsii.Kernel.call(this, "resetSetting", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfigurationOutputReference getConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterDefaultCapacityProviderStrategyList getDefaultCapacityProviderStrategy() {
        return software.amazon.jsii.Kernel.get(this, "defaultCapacityProviderStrategy", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterDefaultCapacityProviderStrategyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterSettingList getSetting() {
        return software.amazon.jsii.Kernel.get(this, "setting", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterSettingList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCapacityProvidersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "capacityProvidersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfiguration getConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDefaultCapacityProviderStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultCapacityProviderStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSettingInput() {
        return software.amazon.jsii.Kernel.get(this, "settingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCapacityProviders() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "capacityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCapacityProviders(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "capacityProviders", java.util.Objects.requireNonNull(value, "capacityProviders is required"));
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
     * A fluent builder for {@link imports.aws.ecs.EcsCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ecs.EcsCluster> {
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
        private final imports.aws.ecs.EcsClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ecs.EcsClusterConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#name EcsCluster#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#name EcsCluster#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#capacity_providers EcsCluster#capacity_providers}.
         * <p>
         * @return {@code this}
         * @param capacityProviders Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#capacity_providers EcsCluster#capacity_providers}. This parameter is required.
         */
        public Builder capacityProviders(final java.util.List<java.lang.String> capacityProviders) {
            this.config.capacityProviders(capacityProviders);
            return this;
        }

        /**
         * configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#configuration EcsCluster#configuration}
         * <p>
         * @return {@code this}
         * @param configuration configuration block. This parameter is required.
         */
        public Builder configuration(final imports.aws.ecs.EcsClusterConfiguration configuration) {
            this.config.configuration(configuration);
            return this;
        }

        /**
         * default_capacity_provider_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#default_capacity_provider_strategy EcsCluster#default_capacity_provider_strategy}
         * <p>
         * @return {@code this}
         * @param defaultCapacityProviderStrategy default_capacity_provider_strategy block. This parameter is required.
         */
        public Builder defaultCapacityProviderStrategy(final com.hashicorp.cdktf.IResolvable defaultCapacityProviderStrategy) {
            this.config.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
            return this;
        }
        /**
         * default_capacity_provider_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#default_capacity_provider_strategy EcsCluster#default_capacity_provider_strategy}
         * <p>
         * @return {@code this}
         * @param defaultCapacityProviderStrategy default_capacity_provider_strategy block. This parameter is required.
         */
        public Builder defaultCapacityProviderStrategy(final java.util.List<? extends imports.aws.ecs.EcsClusterDefaultCapacityProviderStrategy> defaultCapacityProviderStrategy) {
            this.config.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#id EcsCluster#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#id EcsCluster#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * setting block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#setting EcsCluster#setting}
         * <p>
         * @return {@code this}
         * @param setting setting block. This parameter is required.
         */
        public Builder setting(final com.hashicorp.cdktf.IResolvable setting) {
            this.config.setting(setting);
            return this;
        }
        /**
         * setting block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#setting EcsCluster#setting}
         * <p>
         * @return {@code this}
         * @param setting setting block. This parameter is required.
         */
        public Builder setting(final java.util.List<? extends imports.aws.ecs.EcsClusterSetting> setting) {
            this.config.setting(setting);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#tags EcsCluster#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#tags EcsCluster#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#tags_all EcsCluster#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster#tags_all EcsCluster#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ecs.EcsCluster}.
         */
        @Override
        public imports.aws.ecs.EcsCluster build() {
            return new imports.aws.ecs.EcsCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
