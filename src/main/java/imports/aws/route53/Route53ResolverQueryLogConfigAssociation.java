package imports.aws.route53;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association aws_route53_resolver_query_log_config_association}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.375Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53ResolverQueryLogConfigAssociation")
public class Route53ResolverQueryLogConfigAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected Route53ResolverQueryLogConfigAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53ResolverQueryLogConfigAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.route53.Route53ResolverQueryLogConfigAssociation.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association aws_route53_resolver_query_log_config_association} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Route53ResolverQueryLogConfigAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.route53.Route53ResolverQueryLogConfigAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResolverQueryLogConfigIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resolverQueryLogConfigIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResolverQueryLogConfigId() {
        return software.amazon.jsii.Kernel.get(this, "resolverQueryLogConfigId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResolverQueryLogConfigId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resolverQueryLogConfigId", java.util.Objects.requireNonNull(value, "resolverQueryLogConfigId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceId() {
        return software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceId", java.util.Objects.requireNonNull(value, "resourceId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.route53.Route53ResolverQueryLogConfigAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.route53.Route53ResolverQueryLogConfigAssociation> {
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
        private final imports.aws.route53.Route53ResolverQueryLogConfigAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.route53.Route53ResolverQueryLogConfigAssociationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association#resolver_query_log_config_id Route53ResolverQueryLogConfigAssociation#resolver_query_log_config_id}.
         * <p>
         * @return {@code this}
         * @param resolverQueryLogConfigId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association#resolver_query_log_config_id Route53ResolverQueryLogConfigAssociation#resolver_query_log_config_id}. This parameter is required.
         */
        public Builder resolverQueryLogConfigId(final java.lang.String resolverQueryLogConfigId) {
            this.config.resolverQueryLogConfigId(resolverQueryLogConfigId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association#resource_id Route53ResolverQueryLogConfigAssociation#resource_id}.
         * <p>
         * @return {@code this}
         * @param resourceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association#resource_id Route53ResolverQueryLogConfigAssociation#resource_id}. This parameter is required.
         */
        public Builder resourceId(final java.lang.String resourceId) {
            this.config.resourceId(resourceId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association#id Route53ResolverQueryLogConfigAssociation#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_query_log_config_association#id Route53ResolverQueryLogConfigAssociation#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.route53.Route53ResolverQueryLogConfigAssociation}.
         */
        @Override
        public imports.aws.route53.Route53ResolverQueryLogConfigAssociation build() {
            return new imports.aws.route53.Route53ResolverQueryLogConfigAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
