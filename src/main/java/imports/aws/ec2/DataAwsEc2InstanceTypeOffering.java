package imports.aws.ec2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering aws_ec2_instance_type_offering}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:58.605Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsEc2InstanceTypeOffering")
public class DataAwsEc2InstanceTypeOffering extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsEc2InstanceTypeOffering(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsEc2InstanceTypeOffering(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ec2.DataAwsEc2InstanceTypeOffering.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering aws_ec2_instance_type_offering} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsEc2InstanceTypeOffering(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.ec2.DataAwsEc2InstanceTypeOfferingConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering aws_ec2_instance_type_offering} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsEc2InstanceTypeOffering(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeOfferingTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocationType() {
        software.amazon.jsii.Kernel.call(this, "resetLocationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreferredInstanceTypes() {
        software.amazon.jsii.Kernel.call(this, "resetPreferredInstanceTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeOfferingFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2InstanceTypeOfferingFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2InstanceTypeOfferingTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2InstanceTypeOfferingTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "locationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPreferredInstanceTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "preferredInstanceTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocationType() {
        return software.amazon.jsii.Kernel.get(this, "locationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "locationType", java.util.Objects.requireNonNull(value, "locationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPreferredInstanceTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "preferredInstanceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPreferredInstanceTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "preferredInstanceTypes", java.util.Objects.requireNonNull(value, "preferredInstanceTypes is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ec2.DataAwsEc2InstanceTypeOffering}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ec2.DataAwsEc2InstanceTypeOffering> {
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
        private imports.aws.ec2.DataAwsEc2InstanceTypeOfferingConfig.Builder config;

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
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#filter DataAwsEc2InstanceTypeOffering#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final com.hashicorp.cdktf.IResolvable filter) {
            this.config().filter(filter);
            return this;
        }
        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#filter DataAwsEc2InstanceTypeOffering#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.ec2.DataAwsEc2InstanceTypeOfferingFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#id DataAwsEc2InstanceTypeOffering#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#id DataAwsEc2InstanceTypeOffering#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#location_type DataAwsEc2InstanceTypeOffering#location_type}.
         * <p>
         * @return {@code this}
         * @param locationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#location_type DataAwsEc2InstanceTypeOffering#location_type}. This parameter is required.
         */
        public Builder locationType(final java.lang.String locationType) {
            this.config().locationType(locationType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#preferred_instance_types DataAwsEc2InstanceTypeOffering#preferred_instance_types}.
         * <p>
         * @return {@code this}
         * @param preferredInstanceTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#preferred_instance_types DataAwsEc2InstanceTypeOffering#preferred_instance_types}. This parameter is required.
         */
        public Builder preferredInstanceTypes(final java.util.List<java.lang.String> preferredInstanceTypes) {
            this.config().preferredInstanceTypes(preferredInstanceTypes);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ec2_instance_type_offering#timeouts DataAwsEc2InstanceTypeOffering#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.ec2.DataAwsEc2InstanceTypeOfferingTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ec2.DataAwsEc2InstanceTypeOffering}.
         */
        @Override
        public imports.aws.ec2.DataAwsEc2InstanceTypeOffering build() {
            return new imports.aws.ec2.DataAwsEc2InstanceTypeOffering(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.ec2.DataAwsEc2InstanceTypeOfferingConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.ec2.DataAwsEc2InstanceTypeOfferingConfig.Builder();
            }
            return this.config;
        }
    }
}
