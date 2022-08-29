package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint aws_vpc_endpoint}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.000Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcEndpoint")
public class VpcEndpoint extends com.hashicorp.cdktf.TerraformResource {

    protected VpcEndpoint(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcEndpoint(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.VpcEndpoint.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint aws_vpc_endpoint} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public VpcEndpoint(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcEndpointConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putDnsOptions(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcEndpointDnsOptions value) {
        software.amazon.jsii.Kernel.call(this, "putDnsOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcEndpointTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutoAccept() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAccept", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDnsOptions() {
        software.amazon.jsii.Kernel.call(this, "resetDnsOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpAddressType() {
        software.amazon.jsii.Kernel.call(this, "resetIpAddressType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateDnsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateDnsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRouteTableIds() {
        software.amazon.jsii.Kernel.call(this, "resetRouteTableIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnetIds() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcEndpointType() {
        software.amazon.jsii.Kernel.call(this, "resetVpcEndpointType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCidrBlocks() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cidrBlocks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcEndpointDnsEntryList getDnsEntry() {
        return software.amazon.jsii.Kernel.get(this, "dnsEntry", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcEndpointDnsEntryList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcEndpointDnsOptionsOutputReference getDnsOptions() {
        return software.amazon.jsii.Kernel.get(this, "dnsOptions", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcEndpointDnsOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNetworkInterfaceIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "networkInterfaceIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefixListId() {
        return software.amazon.jsii.Kernel.get(this, "prefixListId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getRequesterManaged() {
        return software.amazon.jsii.Kernel.get(this, "requesterManaged", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcEndpointTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcEndpointTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoAcceptInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAcceptInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcEndpointDnsOptions getDnsOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "dnsOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcEndpointDnsOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpAddressTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "policyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPrivateDnsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "privateDnsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRouteTableIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "routeTableIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcEndpointTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcEndpointTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoAccept() {
        return software.amazon.jsii.Kernel.get(this, "autoAccept", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoAccept(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAccept", java.util.Objects.requireNonNull(value, "autoAccept is required"));
    }

    public void setAutoAccept(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoAccept", java.util.Objects.requireNonNull(value, "autoAccept is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpAddressType() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpAddressType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipAddressType", java.util.Objects.requireNonNull(value, "ipAddressType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", java.util.Objects.requireNonNull(value, "policy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPrivateDnsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "privateDnsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPrivateDnsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "privateDnsEnabled", java.util.Objects.requireNonNull(value, "privateDnsEnabled is required"));
    }

    public void setPrivateDnsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "privateDnsEnabled", java.util.Objects.requireNonNull(value, "privateDnsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRouteTableIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "routeTableIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRouteTableIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "routeTableIds", java.util.Objects.requireNonNull(value, "routeTableIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroupIds", java.util.Objects.requireNonNull(value, "securityGroupIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceName() {
        return software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceName", java.util.Objects.requireNonNull(value, "serviceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnetIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnetIds", java.util.Objects.requireNonNull(value, "subnetIds is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcEndpointType() {
        return software.amazon.jsii.Kernel.get(this, "vpcEndpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcEndpointType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcEndpointType", java.util.Objects.requireNonNull(value, "vpcEndpointType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.VpcEndpoint}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.VpcEndpoint> {
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
        private final imports.aws.vpc.VpcEndpointConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.vpc.VpcEndpointConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#service_name VpcEndpoint#service_name}.
         * <p>
         * @return {@code this}
         * @param serviceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#service_name VpcEndpoint#service_name}. This parameter is required.
         */
        public Builder serviceName(final java.lang.String serviceName) {
            this.config.serviceName(serviceName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#vpc_id VpcEndpoint#vpc_id}.
         * <p>
         * @return {@code this}
         * @param vpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#vpc_id VpcEndpoint#vpc_id}. This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config.vpcId(vpcId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#auto_accept VpcEndpoint#auto_accept}.
         * <p>
         * @return {@code this}
         * @param autoAccept Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#auto_accept VpcEndpoint#auto_accept}. This parameter is required.
         */
        public Builder autoAccept(final java.lang.Boolean autoAccept) {
            this.config.autoAccept(autoAccept);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#auto_accept VpcEndpoint#auto_accept}.
         * <p>
         * @return {@code this}
         * @param autoAccept Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#auto_accept VpcEndpoint#auto_accept}. This parameter is required.
         */
        public Builder autoAccept(final com.hashicorp.cdktf.IResolvable autoAccept) {
            this.config.autoAccept(autoAccept);
            return this;
        }

        /**
         * dns_options block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#dns_options VpcEndpoint#dns_options}
         * <p>
         * @return {@code this}
         * @param dnsOptions dns_options block. This parameter is required.
         */
        public Builder dnsOptions(final imports.aws.vpc.VpcEndpointDnsOptions dnsOptions) {
            this.config.dnsOptions(dnsOptions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#id VpcEndpoint#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#id VpcEndpoint#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#ip_address_type VpcEndpoint#ip_address_type}.
         * <p>
         * @return {@code this}
         * @param ipAddressType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#ip_address_type VpcEndpoint#ip_address_type}. This parameter is required.
         */
        public Builder ipAddressType(final java.lang.String ipAddressType) {
            this.config.ipAddressType(ipAddressType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#policy VpcEndpoint#policy}.
         * <p>
         * @return {@code this}
         * @param policy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#policy VpcEndpoint#policy}. This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config.policy(policy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#private_dns_enabled VpcEndpoint#private_dns_enabled}.
         * <p>
         * @return {@code this}
         * @param privateDnsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#private_dns_enabled VpcEndpoint#private_dns_enabled}. This parameter is required.
         */
        public Builder privateDnsEnabled(final java.lang.Boolean privateDnsEnabled) {
            this.config.privateDnsEnabled(privateDnsEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#private_dns_enabled VpcEndpoint#private_dns_enabled}.
         * <p>
         * @return {@code this}
         * @param privateDnsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#private_dns_enabled VpcEndpoint#private_dns_enabled}. This parameter is required.
         */
        public Builder privateDnsEnabled(final com.hashicorp.cdktf.IResolvable privateDnsEnabled) {
            this.config.privateDnsEnabled(privateDnsEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#route_table_ids VpcEndpoint#route_table_ids}.
         * <p>
         * @return {@code this}
         * @param routeTableIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#route_table_ids VpcEndpoint#route_table_ids}. This parameter is required.
         */
        public Builder routeTableIds(final java.util.List<java.lang.String> routeTableIds) {
            this.config.routeTableIds(routeTableIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#security_group_ids VpcEndpoint#security_group_ids}.
         * <p>
         * @return {@code this}
         * @param securityGroupIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#security_group_ids VpcEndpoint#security_group_ids}. This parameter is required.
         */
        public Builder securityGroupIds(final java.util.List<java.lang.String> securityGroupIds) {
            this.config.securityGroupIds(securityGroupIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#subnet_ids VpcEndpoint#subnet_ids}.
         * <p>
         * @return {@code this}
         * @param subnetIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#subnet_ids VpcEndpoint#subnet_ids}. This parameter is required.
         */
        public Builder subnetIds(final java.util.List<java.lang.String> subnetIds) {
            this.config.subnetIds(subnetIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#tags VpcEndpoint#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#tags VpcEndpoint#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#tags_all VpcEndpoint#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#tags_all VpcEndpoint#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#timeouts VpcEndpoint#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.vpc.VpcEndpointTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#vpc_endpoint_type VpcEndpoint#vpc_endpoint_type}.
         * <p>
         * @return {@code this}
         * @param vpcEndpointType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#vpc_endpoint_type VpcEndpoint#vpc_endpoint_type}. This parameter is required.
         */
        public Builder vpcEndpointType(final java.lang.String vpcEndpointType) {
            this.config.vpcEndpointType(vpcEndpointType);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.VpcEndpoint}.
         */
        @Override
        public imports.aws.vpc.VpcEndpoint build() {
            return new imports.aws.vpc.VpcEndpoint(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
