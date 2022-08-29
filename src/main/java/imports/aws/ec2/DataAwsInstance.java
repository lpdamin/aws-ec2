package imports.aws.ec2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/instance aws_instance}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.671Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsInstance")
public class DataAwsInstance extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsInstance(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsInstance(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ec2.DataAwsInstance.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/instance aws_instance} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsInstance(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.ec2.DataAwsInstanceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/instance aws_instance} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsInstance(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFetchPasswordData() {
        software.amazon.jsii.Kernel.call(this, "resetFetchPasswordData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFetchUserData() {
        software.amazon.jsii.Kernel.call(this, "resetFetchUserData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceId() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceTags() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getAmi() {
        return software.amazon.jsii.Kernel.get(this, "ami", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAssociatePublicIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "associatePublicIpAddress", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceCreditSpecificationList getCreditSpecification() {
        return software.amazon.jsii.Kernel.get(this, "creditSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceCreditSpecificationList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getDisableApiStop() {
        return software.amazon.jsii.Kernel.get(this, "disableApiStop", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getDisableApiTermination() {
        return software.amazon.jsii.Kernel.get(this, "disableApiTermination", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceEbsBlockDeviceList getEbsBlockDevice() {
        return software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceEbsBlockDeviceList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEbsOptimized() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceEnclaveOptionsList getEnclaveOptions() {
        return software.amazon.jsii.Kernel.get(this, "enclaveOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceEnclaveOptionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceEphemeralBlockDeviceList getEphemeralBlockDevice() {
        return software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceEphemeralBlockDeviceList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostId() {
        return software.amazon.jsii.Kernel.get(this, "hostId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamInstanceProfile() {
        return software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceState() {
        return software.amazon.jsii.Kernel.get(this, "instanceState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIpv6Addresses() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ipv6Addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyName() {
        return software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceMaintenanceOptionsList getMaintenanceOptions() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceMaintenanceOptionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceMetadataOptionsList getMetadataOptions() {
        return software.amazon.jsii.Kernel.get(this, "metadataOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceMetadataOptionsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getMonitoring() {
        return software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkInterfaceId() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutpostArn() {
        return software.amazon.jsii.Kernel.get(this, "outpostArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPasswordData() {
        return software.amazon.jsii.Kernel.get(this, "passwordData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlacementGroup() {
        return software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPlacementPartitionNumber() {
        return software.amazon.jsii.Kernel.get(this, "placementPartitionNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateDns() {
        return software.amazon.jsii.Kernel.get(this, "privateDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstancePrivateDnsNameOptionsList getPrivateDnsNameOptions() {
        return software.amazon.jsii.Kernel.get(this, "privateDnsNameOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstancePrivateDnsNameOptionsList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateIp() {
        return software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicDns() {
        return software.amazon.jsii.Kernel.get(this, "publicDns", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicIp() {
        return software.amazon.jsii.Kernel.get(this, "publicIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceRootBlockDeviceList getRootBlockDevice() {
        return software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceRootBlockDeviceList.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecondaryPrivateIps() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "secondaryPrivateIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getSourceDestCheck() {
        return software.amazon.jsii.Kernel.get(this, "sourceDestCheck", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubnetId() {
        return software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTenancy() {
        return software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsInstanceTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsInstanceTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserData() {
        return software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserDataBase64() {
        return software.amazon.jsii.Kernel.get(this, "userDataBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFetchPasswordDataInput() {
        return software.amazon.jsii.Kernel.get(this, "fetchPasswordDataInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFetchUserDataInput() {
        return software.amazon.jsii.Kernel.get(this, "fetchUserDataInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getInstanceTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "instanceTagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getFetchPasswordData() {
        return software.amazon.jsii.Kernel.get(this, "fetchPasswordData", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setFetchPasswordData(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fetchPasswordData", java.util.Objects.requireNonNull(value, "fetchPasswordData is required"));
    }

    public void setFetchPasswordData(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "fetchPasswordData", java.util.Objects.requireNonNull(value, "fetchPasswordData is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getFetchUserData() {
        return software.amazon.jsii.Kernel.get(this, "fetchUserData", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setFetchUserData(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fetchUserData", java.util.Objects.requireNonNull(value, "fetchUserData is required"));
    }

    public void setFetchUserData(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "fetchUserData", java.util.Objects.requireNonNull(value, "fetchUserData is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceId() {
        return software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceId", java.util.Objects.requireNonNull(value, "instanceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getInstanceTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "instanceTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setInstanceTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "instanceTags", java.util.Objects.requireNonNull(value, "instanceTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ec2.DataAwsInstance}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ec2.DataAwsInstance> {
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
        private imports.aws.ec2.DataAwsInstanceConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_password_data DataAwsInstance#get_password_data}.
         * <p>
         * @return {@code this}
         * @param fetchPasswordData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_password_data DataAwsInstance#get_password_data}. This parameter is required.
         */
        public Builder fetchPasswordData(final java.lang.Boolean fetchPasswordData) {
            this.config().fetchPasswordData(fetchPasswordData);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_password_data DataAwsInstance#get_password_data}.
         * <p>
         * @return {@code this}
         * @param fetchPasswordData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_password_data DataAwsInstance#get_password_data}. This parameter is required.
         */
        public Builder fetchPasswordData(final com.hashicorp.cdktf.IResolvable fetchPasswordData) {
            this.config().fetchPasswordData(fetchPasswordData);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_user_data DataAwsInstance#get_user_data}.
         * <p>
         * @return {@code this}
         * @param fetchUserData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_user_data DataAwsInstance#get_user_data}. This parameter is required.
         */
        public Builder fetchUserData(final java.lang.Boolean fetchUserData) {
            this.config().fetchUserData(fetchUserData);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_user_data DataAwsInstance#get_user_data}.
         * <p>
         * @return {@code this}
         * @param fetchUserData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#get_user_data DataAwsInstance#get_user_data}. This parameter is required.
         */
        public Builder fetchUserData(final com.hashicorp.cdktf.IResolvable fetchUserData) {
            this.config().fetchUserData(fetchUserData);
            return this;
        }

        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/instance#filter DataAwsInstance#filter}
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/instance#filter DataAwsInstance#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.ec2.DataAwsInstanceFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#id DataAwsInstance#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#id DataAwsInstance#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#instance_id DataAwsInstance#instance_id}.
         * <p>
         * @return {@code this}
         * @param instanceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#instance_id DataAwsInstance#instance_id}. This parameter is required.
         */
        public Builder instanceId(final java.lang.String instanceId) {
            this.config().instanceId(instanceId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#instance_tags DataAwsInstance#instance_tags}.
         * <p>
         * @return {@code this}
         * @param instanceTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#instance_tags DataAwsInstance#instance_tags}. This parameter is required.
         */
        public Builder instanceTags(final java.util.Map<java.lang.String, java.lang.String> instanceTags) {
            this.config().instanceTags(instanceTags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#tags DataAwsInstance#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/instance#tags DataAwsInstance#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/instance#timeouts DataAwsInstance#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.ec2.DataAwsInstanceTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ec2.DataAwsInstance}.
         */
        @Override
        public imports.aws.ec2.DataAwsInstance build() {
            return new imports.aws.ec2.DataAwsInstance(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.ec2.DataAwsInstanceConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.ec2.DataAwsInstanceConfig.Builder();
            }
            return this.config;
        }
    }
}
