package imports.aws.ecs;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers aws_ecs_cluster_capacity_providers}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.892Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsClusterCapacityProviders")
public class EcsClusterCapacityProviders extends com.hashicorp.cdktf.TerraformResource {

    protected EcsClusterCapacityProviders(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsClusterCapacityProviders(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ecs.EcsClusterCapacityProviders.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers aws_ecs_cluster_capacity_providers} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EcsClusterCapacityProviders(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterCapacityProvidersConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putDefaultCapacityProviderStrategy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDefaultCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacityProviders() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityProviders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultCapacityProviderStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterCapacityProvidersDefaultCapacityProviderStrategyList getDefaultCapacityProviderStrategy() {
        return software.amazon.jsii.Kernel.get(this, "defaultCapacityProviderStrategy", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterCapacityProvidersDefaultCapacityProviderStrategyList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCapacityProvidersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "capacityProvidersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDefaultCapacityProviderStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultCapacityProviderStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCapacityProviders() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "capacityProviders", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCapacityProviders(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "capacityProviders", java.util.Objects.requireNonNull(value, "capacityProviders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterName() {
        return software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterName", java.util.Objects.requireNonNull(value, "clusterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ecs.EcsClusterCapacityProviders}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ecs.EcsClusterCapacityProviders> {
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
        private final imports.aws.ecs.EcsClusterCapacityProvidersConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ecs.EcsClusterCapacityProvidersConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#cluster_name EcsClusterCapacityProviders#cluster_name}.
         * <p>
         * @return {@code this}
         * @param clusterName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#cluster_name EcsClusterCapacityProviders#cluster_name}. This parameter is required.
         */
        public Builder clusterName(final java.lang.String clusterName) {
            this.config.clusterName(clusterName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#capacity_providers EcsClusterCapacityProviders#capacity_providers}.
         * <p>
         * @return {@code this}
         * @param capacityProviders Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#capacity_providers EcsClusterCapacityProviders#capacity_providers}. This parameter is required.
         */
        public Builder capacityProviders(final java.util.List<java.lang.String> capacityProviders) {
            this.config.capacityProviders(capacityProviders);
            return this;
        }

        /**
         * default_capacity_provider_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#default_capacity_provider_strategy EcsClusterCapacityProviders#default_capacity_provider_strategy}
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#default_capacity_provider_strategy EcsClusterCapacityProviders#default_capacity_provider_strategy}
         * <p>
         * @return {@code this}
         * @param defaultCapacityProviderStrategy default_capacity_provider_strategy block. This parameter is required.
         */
        public Builder defaultCapacityProviderStrategy(final java.util.List<? extends imports.aws.ecs.EcsClusterCapacityProvidersDefaultCapacityProviderStrategy> defaultCapacityProviderStrategy) {
            this.config.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#id EcsClusterCapacityProviders#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_cluster_capacity_providers#id EcsClusterCapacityProviders#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ecs.EcsClusterCapacityProviders}.
         */
        @Override
        public imports.aws.ecs.EcsClusterCapacityProviders build() {
            return new imports.aws.ecs.EcsClusterCapacityProviders(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
