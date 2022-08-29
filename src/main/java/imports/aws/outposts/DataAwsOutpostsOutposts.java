package imports.aws.outposts;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts aws_outposts_outposts}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.157Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.outposts.DataAwsOutpostsOutposts")
public class DataAwsOutpostsOutposts extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsOutpostsOutposts(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsOutpostsOutposts(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.outposts.DataAwsOutpostsOutposts.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts aws_outposts_outposts} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsOutpostsOutposts(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.outposts.DataAwsOutpostsOutpostsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts aws_outposts_outposts} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsOutpostsOutposts(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZoneId() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZoneId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSiteId() {
        software.amazon.jsii.Kernel.call(this, "resetSiteId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "arns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSiteIdInput() {
        return software.amazon.jsii.Kernel.get(this, "siteIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZone", java.util.Objects.requireNonNull(value, "availabilityZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZoneId() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZoneId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZoneId", java.util.Objects.requireNonNull(value, "availabilityZoneId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwnerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ownerId", java.util.Objects.requireNonNull(value, "ownerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSiteId() {
        return software.amazon.jsii.Kernel.get(this, "siteId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSiteId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "siteId", java.util.Objects.requireNonNull(value, "siteId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.outposts.DataAwsOutpostsOutposts}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.outposts.DataAwsOutpostsOutposts> {
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
        private imports.aws.outposts.DataAwsOutpostsOutpostsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#availability_zone DataAwsOutpostsOutposts#availability_zone}.
         * <p>
         * @return {@code this}
         * @param availabilityZone Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#availability_zone DataAwsOutpostsOutposts#availability_zone}. This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config().availabilityZone(availabilityZone);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#availability_zone_id DataAwsOutpostsOutposts#availability_zone_id}.
         * <p>
         * @return {@code this}
         * @param availabilityZoneId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#availability_zone_id DataAwsOutpostsOutposts#availability_zone_id}. This parameter is required.
         */
        public Builder availabilityZoneId(final java.lang.String availabilityZoneId) {
            this.config().availabilityZoneId(availabilityZoneId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#id DataAwsOutpostsOutposts#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#id DataAwsOutpostsOutposts#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#owner_id DataAwsOutpostsOutposts#owner_id}.
         * <p>
         * @return {@code this}
         * @param ownerId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#owner_id DataAwsOutpostsOutposts#owner_id}. This parameter is required.
         */
        public Builder ownerId(final java.lang.String ownerId) {
            this.config().ownerId(ownerId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#site_id DataAwsOutpostsOutposts#site_id}.
         * <p>
         * @return {@code this}
         * @param siteId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/outposts_outposts#site_id DataAwsOutpostsOutposts#site_id}. This parameter is required.
         */
        public Builder siteId(final java.lang.String siteId) {
            this.config().siteId(siteId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.outposts.DataAwsOutpostsOutposts}.
         */
        @Override
        public imports.aws.outposts.DataAwsOutpostsOutposts build() {
            return new imports.aws.outposts.DataAwsOutpostsOutposts(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.outposts.DataAwsOutpostsOutpostsConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.outposts.DataAwsOutpostsOutpostsConfig.Builder();
            }
            return this.config;
        }
    }
}
