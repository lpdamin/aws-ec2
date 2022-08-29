package imports.aws.elb;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy aws_load_balancer_listener_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.103Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.LoadBalancerListenerPolicy")
public class LoadBalancerListenerPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected LoadBalancerListenerPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LoadBalancerListenerPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.elb.LoadBalancerListenerPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy aws_load_balancer_listener_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LoadBalancerListenerPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.elb.LoadBalancerListenerPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyNames() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyNames", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getLoadBalancerPortInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policyNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerName() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerName", java.util.Objects.requireNonNull(value, "loadBalancerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLoadBalancerPort() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLoadBalancerPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerPort", java.util.Objects.requireNonNull(value, "loadBalancerPort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPolicyNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "policyNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPolicyNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policyNames", java.util.Objects.requireNonNull(value, "policyNames is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.elb.LoadBalancerListenerPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.elb.LoadBalancerListenerPolicy> {
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
        private final imports.aws.elb.LoadBalancerListenerPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.elb.LoadBalancerListenerPolicyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#load_balancer_name LoadBalancerListenerPolicy#load_balancer_name}.
         * <p>
         * @return {@code this}
         * @param loadBalancerName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#load_balancer_name LoadBalancerListenerPolicy#load_balancer_name}. This parameter is required.
         */
        public Builder loadBalancerName(final java.lang.String loadBalancerName) {
            this.config.loadBalancerName(loadBalancerName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#load_balancer_port LoadBalancerListenerPolicy#load_balancer_port}.
         * <p>
         * @return {@code this}
         * @param loadBalancerPort Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#load_balancer_port LoadBalancerListenerPolicy#load_balancer_port}. This parameter is required.
         */
        public Builder loadBalancerPort(final java.lang.Number loadBalancerPort) {
            this.config.loadBalancerPort(loadBalancerPort);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#id LoadBalancerListenerPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#id LoadBalancerListenerPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#policy_names LoadBalancerListenerPolicy#policy_names}.
         * <p>
         * @return {@code this}
         * @param policyNames Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/load_balancer_listener_policy#policy_names LoadBalancerListenerPolicy#policy_names}. This parameter is required.
         */
        public Builder policyNames(final java.util.List<java.lang.String> policyNames) {
            this.config.policyNames(policyNames);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.elb.LoadBalancerListenerPolicy}.
         */
        @Override
        public imports.aws.elb.LoadBalancerListenerPolicy build() {
            return new imports.aws.elb.LoadBalancerListenerPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
