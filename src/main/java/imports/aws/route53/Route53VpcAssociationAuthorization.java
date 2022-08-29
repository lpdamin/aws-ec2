package imports.aws.route53;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization aws_route53_vpc_association_authorization}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.380Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53VpcAssociationAuthorization")
public class Route53VpcAssociationAuthorization extends com.hashicorp.cdktf.TerraformResource {

    protected Route53VpcAssociationAuthorization(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53VpcAssociationAuthorization(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.route53.Route53VpcAssociationAuthorization.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization aws_route53_vpc_association_authorization} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Route53VpcAssociationAuthorization(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.route53.Route53VpcAssociationAuthorizationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcRegion() {
        software.amazon.jsii.Kernel.call(this, "resetVpcRegion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "zoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcRegion() {
        return software.amazon.jsii.Kernel.get(this, "vpcRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcRegion", java.util.Objects.requireNonNull(value, "vpcRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneId() {
        return software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setZoneId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "zoneId", java.util.Objects.requireNonNull(value, "zoneId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.route53.Route53VpcAssociationAuthorization}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.route53.Route53VpcAssociationAuthorization> {
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
        private final imports.aws.route53.Route53VpcAssociationAuthorizationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.route53.Route53VpcAssociationAuthorizationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#vpc_id Route53VpcAssociationAuthorization#vpc_id}.
         * <p>
         * @return {@code this}
         * @param vpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#vpc_id Route53VpcAssociationAuthorization#vpc_id}. This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config.vpcId(vpcId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#zone_id Route53VpcAssociationAuthorization#zone_id}.
         * <p>
         * @return {@code this}
         * @param zoneId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#zone_id Route53VpcAssociationAuthorization#zone_id}. This parameter is required.
         */
        public Builder zoneId(final java.lang.String zoneId) {
            this.config.zoneId(zoneId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#id Route53VpcAssociationAuthorization#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#id Route53VpcAssociationAuthorization#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#vpc_region Route53VpcAssociationAuthorization#vpc_region}.
         * <p>
         * @return {@code this}
         * @param vpcRegion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_vpc_association_authorization#vpc_region Route53VpcAssociationAuthorization#vpc_region}. This parameter is required.
         */
        public Builder vpcRegion(final java.lang.String vpcRegion) {
            this.config.vpcRegion(vpcRegion);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.route53.Route53VpcAssociationAuthorization}.
         */
        @Override
        public imports.aws.route53.Route53VpcAssociationAuthorization build() {
            return new imports.aws.route53.Route53VpcAssociationAuthorization(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
