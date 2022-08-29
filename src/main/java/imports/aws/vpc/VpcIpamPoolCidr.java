package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr aws_vpc_ipam_pool_cidr}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.011Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcIpamPoolCidr")
public class VpcIpamPoolCidr extends com.hashicorp.cdktf.TerraformResource {

    protected VpcIpamPoolCidr(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcIpamPoolCidr(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.VpcIpamPoolCidr.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr aws_vpc_ipam_pool_cidr} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public VpcIpamPoolCidr(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcIpamPoolCidrConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCidrAuthorizationContext(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcIpamPoolCidrCidrAuthorizationContext value) {
        software.amazon.jsii.Kernel.call(this, "putCidrAuthorizationContext", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCidr() {
        software.amazon.jsii.Kernel.call(this, "resetCidr", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCidrAuthorizationContext() {
        software.amazon.jsii.Kernel.call(this, "resetCidrAuthorizationContext", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcIpamPoolCidrCidrAuthorizationContextOutputReference getCidrAuthorizationContext() {
        return software.amazon.jsii.Kernel.get(this, "cidrAuthorizationContext", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcIpamPoolCidrCidrAuthorizationContextOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcIpamPoolCidrCidrAuthorizationContext getCidrAuthorizationContextInput() {
        return software.amazon.jsii.Kernel.get(this, "cidrAuthorizationContextInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcIpamPoolCidrCidrAuthorizationContext.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCidrInput() {
        return software.amazon.jsii.Kernel.get(this, "cidrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpamPoolIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ipamPoolIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCidr() {
        return software.amazon.jsii.Kernel.get(this, "cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCidr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cidr", java.util.Objects.requireNonNull(value, "cidr is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpamPoolId() {
        return software.amazon.jsii.Kernel.get(this, "ipamPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpamPoolId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipamPoolId", java.util.Objects.requireNonNull(value, "ipamPoolId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.VpcIpamPoolCidr}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.VpcIpamPoolCidr> {
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
        private final imports.aws.vpc.VpcIpamPoolCidrConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.vpc.VpcIpamPoolCidrConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#ipam_pool_id VpcIpamPoolCidr#ipam_pool_id}.
         * <p>
         * @return {@code this}
         * @param ipamPoolId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#ipam_pool_id VpcIpamPoolCidr#ipam_pool_id}. This parameter is required.
         */
        public Builder ipamPoolId(final java.lang.String ipamPoolId) {
            this.config.ipamPoolId(ipamPoolId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#cidr VpcIpamPoolCidr#cidr}.
         * <p>
         * @return {@code this}
         * @param cidr Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#cidr VpcIpamPoolCidr#cidr}. This parameter is required.
         */
        public Builder cidr(final java.lang.String cidr) {
            this.config.cidr(cidr);
            return this;
        }

        /**
         * cidr_authorization_context block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#cidr_authorization_context VpcIpamPoolCidr#cidr_authorization_context}
         * <p>
         * @return {@code this}
         * @param cidrAuthorizationContext cidr_authorization_context block. This parameter is required.
         */
        public Builder cidrAuthorizationContext(final imports.aws.vpc.VpcIpamPoolCidrCidrAuthorizationContext cidrAuthorizationContext) {
            this.config.cidrAuthorizationContext(cidrAuthorizationContext);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#id VpcIpamPoolCidr#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam_pool_cidr#id VpcIpamPoolCidr#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.VpcIpamPoolCidr}.
         */
        @Override
        public imports.aws.vpc.VpcIpamPoolCidr build() {
            return new imports.aws.vpc.VpcIpamPoolCidr(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
