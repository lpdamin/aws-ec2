package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/subnet aws_subnet}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.887Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsSubnet")
public class DataAwsSubnet extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsSubnet(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsSubnet(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.DataAwsSubnet.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/subnet aws_subnet} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsSubnet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.vpc.DataAwsSubnetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/subnet aws_subnet} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsSubnet(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsSubnetTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZoneId() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZoneId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCidrBlock() {
        software.amazon.jsii.Kernel.call(this, "resetCidrBlock", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultForAz() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultForAz", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpv6CidrBlock() {
        software.amazon.jsii.Kernel.call(this, "resetIpv6CidrBlock", software.amazon.jsii.NativeType.VOID);
    }

    public void resetState() {
        software.amazon.jsii.Kernel.call(this, "resetState", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcId() {
        software.amazon.jsii.Kernel.call(this, "resetVpcId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAssignIpv6AddressOnCreation() {
        return software.amazon.jsii.Kernel.get(this, "assignIpv6AddressOnCreation", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAvailableIpAddressCount() {
        return software.amazon.jsii.Kernel.get(this, "availableIpAddressCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerOwnedIpv4Pool() {
        return software.amazon.jsii.Kernel.get(this, "customerOwnedIpv4Pool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEnableDns64() {
        return software.amazon.jsii.Kernel.get(this, "enableDns64", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEnableResourceNameDnsAaaaRecordOnLaunch() {
        return software.amazon.jsii.Kernel.get(this, "enableResourceNameDnsAaaaRecordOnLaunch", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEnableResourceNameDnsARecordOnLaunch() {
        return software.amazon.jsii.Kernel.get(this, "enableResourceNameDnsARecordOnLaunch", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsSubnetFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsSubnetFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpv6CidrBlockAssociationId() {
        return software.amazon.jsii.Kernel.get(this, "ipv6CidrBlockAssociationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getIpv6Native() {
        return software.amazon.jsii.Kernel.get(this, "ipv6Native", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getMapCustomerOwnedIpOnLaunch() {
        return software.amazon.jsii.Kernel.get(this, "mapCustomerOwnedIpOnLaunch", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getMapPublicIpOnLaunch() {
        return software.amazon.jsii.Kernel.get(this, "mapPublicIpOnLaunch", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutpostArn() {
        return software.amazon.jsii.Kernel.get(this, "outpostArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateDnsHostnameTypeOnLaunch() {
        return software.amazon.jsii.Kernel.get(this, "privateDnsHostnameTypeOnLaunch", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsSubnetTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsSubnetTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "cidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDefaultForAzInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultForAzInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpv6CidrBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "ipv6CidrBlockInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStateInput() {
        return software.amazon.jsii.Kernel.get(this, "stateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getCidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "cidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cidrBlock", java.util.Objects.requireNonNull(value, "cidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDefaultForAz() {
        return software.amazon.jsii.Kernel.get(this, "defaultForAz", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDefaultForAz(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "defaultForAz", java.util.Objects.requireNonNull(value, "defaultForAz is required"));
    }

    public void setDefaultForAz(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "defaultForAz", java.util.Objects.requireNonNull(value, "defaultForAz is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpv6CidrBlock() {
        return software.amazon.jsii.Kernel.get(this, "ipv6CidrBlock", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpv6CidrBlock(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipv6CidrBlock", java.util.Objects.requireNonNull(value, "ipv6CidrBlock is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "state", java.util.Objects.requireNonNull(value, "state is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.DataAwsSubnet}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.DataAwsSubnet> {
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
        private imports.aws.vpc.DataAwsSubnetConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#availability_zone DataAwsSubnet#availability_zone}.
         * <p>
         * @return {@code this}
         * @param availabilityZone Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#availability_zone DataAwsSubnet#availability_zone}. This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config().availabilityZone(availabilityZone);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#availability_zone_id DataAwsSubnet#availability_zone_id}.
         * <p>
         * @return {@code this}
         * @param availabilityZoneId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#availability_zone_id DataAwsSubnet#availability_zone_id}. This parameter is required.
         */
        public Builder availabilityZoneId(final java.lang.String availabilityZoneId) {
            this.config().availabilityZoneId(availabilityZoneId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#cidr_block DataAwsSubnet#cidr_block}.
         * <p>
         * @return {@code this}
         * @param cidrBlock Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#cidr_block DataAwsSubnet#cidr_block}. This parameter is required.
         */
        public Builder cidrBlock(final java.lang.String cidrBlock) {
            this.config().cidrBlock(cidrBlock);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#default_for_az DataAwsSubnet#default_for_az}.
         * <p>
         * @return {@code this}
         * @param defaultForAz Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#default_for_az DataAwsSubnet#default_for_az}. This parameter is required.
         */
        public Builder defaultForAz(final java.lang.Boolean defaultForAz) {
            this.config().defaultForAz(defaultForAz);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#default_for_az DataAwsSubnet#default_for_az}.
         * <p>
         * @return {@code this}
         * @param defaultForAz Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#default_for_az DataAwsSubnet#default_for_az}. This parameter is required.
         */
        public Builder defaultForAz(final com.hashicorp.cdktf.IResolvable defaultForAz) {
            this.config().defaultForAz(defaultForAz);
            return this;
        }

        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/subnet#filter DataAwsSubnet#filter}
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/subnet#filter DataAwsSubnet#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.vpc.DataAwsSubnetFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#id DataAwsSubnet#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#id DataAwsSubnet#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#ipv6_cidr_block DataAwsSubnet#ipv6_cidr_block}.
         * <p>
         * @return {@code this}
         * @param ipv6CidrBlock Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#ipv6_cidr_block DataAwsSubnet#ipv6_cidr_block}. This parameter is required.
         */
        public Builder ipv6CidrBlock(final java.lang.String ipv6CidrBlock) {
            this.config().ipv6CidrBlock(ipv6CidrBlock);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#state DataAwsSubnet#state}.
         * <p>
         * @return {@code this}
         * @param state Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#state DataAwsSubnet#state}. This parameter is required.
         */
        public Builder state(final java.lang.String state) {
            this.config().state(state);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#tags DataAwsSubnet#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#tags DataAwsSubnet#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/subnet#timeouts DataAwsSubnet#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.vpc.DataAwsSubnetTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#vpc_id DataAwsSubnet#vpc_id}.
         * <p>
         * @return {@code this}
         * @param vpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/subnet#vpc_id DataAwsSubnet#vpc_id}. This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config().vpcId(vpcId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.DataAwsSubnet}.
         */
        @Override
        public imports.aws.vpc.DataAwsSubnet build() {
            return new imports.aws.vpc.DataAwsSubnet(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.vpc.DataAwsSubnetConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.vpc.DataAwsSubnetConfig.Builder();
            }
            return this.config;
        }
    }
}
