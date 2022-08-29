package imports.aws.elb;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lb aws_lb}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.062Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.Lb")
public class Lb extends com.hashicorp.cdktf.TerraformResource {

    protected Lb(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Lb(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.elb.Lb.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lb aws_lb} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public Lb(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.elb.LbConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lb aws_lb} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public Lb(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putAccessLogs(final @org.jetbrains.annotations.NotNull imports.aws.elb.LbAccessLogs value) {
        software.amazon.jsii.Kernel.call(this, "putAccessLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSubnetMapping(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSubnetMapping", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.elb.LbTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccessLogs() {
        software.amazon.jsii.Kernel.call(this, "resetAccessLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomerOwnedIpv4Pool() {
        software.amazon.jsii.Kernel.call(this, "resetCustomerOwnedIpv4Pool", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDesyncMitigationMode() {
        software.amazon.jsii.Kernel.call(this, "resetDesyncMitigationMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDropInvalidHeaderFields() {
        software.amazon.jsii.Kernel.call(this, "resetDropInvalidHeaderFields", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableCrossZoneLoadBalancing() {
        software.amazon.jsii.Kernel.call(this, "resetEnableCrossZoneLoadBalancing", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableDeletionProtection() {
        software.amazon.jsii.Kernel.call(this, "resetEnableDeletionProtection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableHttp2() {
        software.amazon.jsii.Kernel.call(this, "resetEnableHttp2", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableWafFailOpen() {
        software.amazon.jsii.Kernel.call(this, "resetEnableWafFailOpen", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdleTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetIdleTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInternal() {
        software.amazon.jsii.Kernel.call(this, "resetInternal", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpAddressType() {
        software.amazon.jsii.Kernel.call(this, "resetIpAddressType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancerType() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancerType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreserveHostHeader() {
        software.amazon.jsii.Kernel.call(this, "resetPreserveHostHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnetMapping() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetMapping", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnets() {
        software.amazon.jsii.Kernel.call(this, "resetSubnets", software.amazon.jsii.NativeType.VOID);
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

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.elb.LbAccessLogsOutputReference getAccessLogs() {
        return software.amazon.jsii.Kernel.get(this, "accessLogs", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbAccessLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArnSuffix() {
        return software.amazon.jsii.Kernel.get(this, "arnSuffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.LbSubnetMappingList getSubnetMapping() {
        return software.amazon.jsii.Kernel.get(this, "subnetMapping", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbSubnetMappingList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.LbTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneId() {
        return software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.LbAccessLogs getAccessLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "accessLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbAccessLogs.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomerOwnedIpv4PoolInput() {
        return software.amazon.jsii.Kernel.get(this, "customerOwnedIpv4PoolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDesyncMitigationModeInput() {
        return software.amazon.jsii.Kernel.get(this, "desyncMitigationModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDropInvalidHeaderFieldsInput() {
        return software.amazon.jsii.Kernel.get(this, "dropInvalidHeaderFieldsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableCrossZoneLoadBalancingInput() {
        return software.amazon.jsii.Kernel.get(this, "enableCrossZoneLoadBalancingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableDeletionProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "enableDeletionProtectionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableHttp2Input() {
        return software.amazon.jsii.Kernel.get(this, "enableHttp2Input", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableWafFailOpenInput() {
        return software.amazon.jsii.Kernel.get(this, "enableWafFailOpenInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIdleTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "idleTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalInput() {
        return software.amazon.jsii.Kernel.get(this, "internalInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpAddressTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPreserveHostHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "preserveHostHeaderInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSubnetMappingInput() {
        return software.amazon.jsii.Kernel.get(this, "subnetMappingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerOwnedIpv4Pool() {
        return software.amazon.jsii.Kernel.get(this, "customerOwnedIpv4Pool", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomerOwnedIpv4Pool(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customerOwnedIpv4Pool", java.util.Objects.requireNonNull(value, "customerOwnedIpv4Pool is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDesyncMitigationMode() {
        return software.amazon.jsii.Kernel.get(this, "desyncMitigationMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDesyncMitigationMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "desyncMitigationMode", java.util.Objects.requireNonNull(value, "desyncMitigationMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDropInvalidHeaderFields() {
        return software.amazon.jsii.Kernel.get(this, "dropInvalidHeaderFields", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDropInvalidHeaderFields(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "dropInvalidHeaderFields", java.util.Objects.requireNonNull(value, "dropInvalidHeaderFields is required"));
    }

    public void setDropInvalidHeaderFields(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "dropInvalidHeaderFields", java.util.Objects.requireNonNull(value, "dropInvalidHeaderFields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableCrossZoneLoadBalancing() {
        return software.amazon.jsii.Kernel.get(this, "enableCrossZoneLoadBalancing", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableCrossZoneLoadBalancing(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableCrossZoneLoadBalancing", java.util.Objects.requireNonNull(value, "enableCrossZoneLoadBalancing is required"));
    }

    public void setEnableCrossZoneLoadBalancing(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableCrossZoneLoadBalancing", java.util.Objects.requireNonNull(value, "enableCrossZoneLoadBalancing is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableDeletionProtection() {
        return software.amazon.jsii.Kernel.get(this, "enableDeletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableDeletionProtection(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableDeletionProtection", java.util.Objects.requireNonNull(value, "enableDeletionProtection is required"));
    }

    public void setEnableDeletionProtection(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableDeletionProtection", java.util.Objects.requireNonNull(value, "enableDeletionProtection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableHttp2() {
        return software.amazon.jsii.Kernel.get(this, "enableHttp2", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableHttp2(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableHttp2", java.util.Objects.requireNonNull(value, "enableHttp2 is required"));
    }

    public void setEnableHttp2(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableHttp2", java.util.Objects.requireNonNull(value, "enableHttp2 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableWafFailOpen() {
        return software.amazon.jsii.Kernel.get(this, "enableWafFailOpen", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableWafFailOpen(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableWafFailOpen", java.util.Objects.requireNonNull(value, "enableWafFailOpen is required"));
    }

    public void setEnableWafFailOpen(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableWafFailOpen", java.util.Objects.requireNonNull(value, "enableWafFailOpen is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIdleTimeout() {
        return software.amazon.jsii.Kernel.get(this, "idleTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIdleTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "idleTimeout", java.util.Objects.requireNonNull(value, "idleTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getInternal() {
        return software.amazon.jsii.Kernel.get(this, "internal", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternal(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "internal", java.util.Objects.requireNonNull(value, "internal is required"));
    }

    public void setInternal(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internal", java.util.Objects.requireNonNull(value, "internal is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpAddressType() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpAddressType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipAddressType", java.util.Objects.requireNonNull(value, "ipAddressType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerType() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoadBalancerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loadBalancerType", java.util.Objects.requireNonNull(value, "loadBalancerType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPreserveHostHeader() {
        return software.amazon.jsii.Kernel.get(this, "preserveHostHeader", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPreserveHostHeader(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "preserveHostHeader", java.util.Objects.requireNonNull(value, "preserveHostHeader is required"));
    }

    public void setPreserveHostHeader(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "preserveHostHeader", java.util.Objects.requireNonNull(value, "preserveHostHeader is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnets(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnets", java.util.Objects.requireNonNull(value, "subnets is required"));
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

    /**
     * A fluent builder for {@link imports.aws.elb.Lb}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.elb.Lb> {
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
        private imports.aws.elb.LbConfig.Builder config;

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
         * access_logs block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb#access_logs Lb#access_logs}
         * <p>
         * @return {@code this}
         * @param accessLogs access_logs block. This parameter is required.
         */
        public Builder accessLogs(final imports.aws.elb.LbAccessLogs accessLogs) {
            this.config().accessLogs(accessLogs);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#customer_owned_ipv4_pool Lb#customer_owned_ipv4_pool}.
         * <p>
         * @return {@code this}
         * @param customerOwnedIpv4Pool Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#customer_owned_ipv4_pool Lb#customer_owned_ipv4_pool}. This parameter is required.
         */
        public Builder customerOwnedIpv4Pool(final java.lang.String customerOwnedIpv4Pool) {
            this.config().customerOwnedIpv4Pool(customerOwnedIpv4Pool);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#desync_mitigation_mode Lb#desync_mitigation_mode}.
         * <p>
         * @return {@code this}
         * @param desyncMitigationMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#desync_mitigation_mode Lb#desync_mitigation_mode}. This parameter is required.
         */
        public Builder desyncMitigationMode(final java.lang.String desyncMitigationMode) {
            this.config().desyncMitigationMode(desyncMitigationMode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#drop_invalid_header_fields Lb#drop_invalid_header_fields}.
         * <p>
         * @return {@code this}
         * @param dropInvalidHeaderFields Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#drop_invalid_header_fields Lb#drop_invalid_header_fields}. This parameter is required.
         */
        public Builder dropInvalidHeaderFields(final java.lang.Boolean dropInvalidHeaderFields) {
            this.config().dropInvalidHeaderFields(dropInvalidHeaderFields);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#drop_invalid_header_fields Lb#drop_invalid_header_fields}.
         * <p>
         * @return {@code this}
         * @param dropInvalidHeaderFields Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#drop_invalid_header_fields Lb#drop_invalid_header_fields}. This parameter is required.
         */
        public Builder dropInvalidHeaderFields(final com.hashicorp.cdktf.IResolvable dropInvalidHeaderFields) {
            this.config().dropInvalidHeaderFields(dropInvalidHeaderFields);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_cross_zone_load_balancing Lb#enable_cross_zone_load_balancing}.
         * <p>
         * @return {@code this}
         * @param enableCrossZoneLoadBalancing Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_cross_zone_load_balancing Lb#enable_cross_zone_load_balancing}. This parameter is required.
         */
        public Builder enableCrossZoneLoadBalancing(final java.lang.Boolean enableCrossZoneLoadBalancing) {
            this.config().enableCrossZoneLoadBalancing(enableCrossZoneLoadBalancing);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_cross_zone_load_balancing Lb#enable_cross_zone_load_balancing}.
         * <p>
         * @return {@code this}
         * @param enableCrossZoneLoadBalancing Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_cross_zone_load_balancing Lb#enable_cross_zone_load_balancing}. This parameter is required.
         */
        public Builder enableCrossZoneLoadBalancing(final com.hashicorp.cdktf.IResolvable enableCrossZoneLoadBalancing) {
            this.config().enableCrossZoneLoadBalancing(enableCrossZoneLoadBalancing);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_deletion_protection Lb#enable_deletion_protection}.
         * <p>
         * @return {@code this}
         * @param enableDeletionProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_deletion_protection Lb#enable_deletion_protection}. This parameter is required.
         */
        public Builder enableDeletionProtection(final java.lang.Boolean enableDeletionProtection) {
            this.config().enableDeletionProtection(enableDeletionProtection);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_deletion_protection Lb#enable_deletion_protection}.
         * <p>
         * @return {@code this}
         * @param enableDeletionProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_deletion_protection Lb#enable_deletion_protection}. This parameter is required.
         */
        public Builder enableDeletionProtection(final com.hashicorp.cdktf.IResolvable enableDeletionProtection) {
            this.config().enableDeletionProtection(enableDeletionProtection);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_http2 Lb#enable_http2}.
         * <p>
         * @return {@code this}
         * @param enableHttp2 Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_http2 Lb#enable_http2}. This parameter is required.
         */
        public Builder enableHttp2(final java.lang.Boolean enableHttp2) {
            this.config().enableHttp2(enableHttp2);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_http2 Lb#enable_http2}.
         * <p>
         * @return {@code this}
         * @param enableHttp2 Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_http2 Lb#enable_http2}. This parameter is required.
         */
        public Builder enableHttp2(final com.hashicorp.cdktf.IResolvable enableHttp2) {
            this.config().enableHttp2(enableHttp2);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_waf_fail_open Lb#enable_waf_fail_open}.
         * <p>
         * @return {@code this}
         * @param enableWafFailOpen Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_waf_fail_open Lb#enable_waf_fail_open}. This parameter is required.
         */
        public Builder enableWafFailOpen(final java.lang.Boolean enableWafFailOpen) {
            this.config().enableWafFailOpen(enableWafFailOpen);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_waf_fail_open Lb#enable_waf_fail_open}.
         * <p>
         * @return {@code this}
         * @param enableWafFailOpen Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#enable_waf_fail_open Lb#enable_waf_fail_open}. This parameter is required.
         */
        public Builder enableWafFailOpen(final com.hashicorp.cdktf.IResolvable enableWafFailOpen) {
            this.config().enableWafFailOpen(enableWafFailOpen);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#id Lb#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#id Lb#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#idle_timeout Lb#idle_timeout}.
         * <p>
         * @return {@code this}
         * @param idleTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#idle_timeout Lb#idle_timeout}. This parameter is required.
         */
        public Builder idleTimeout(final java.lang.Number idleTimeout) {
            this.config().idleTimeout(idleTimeout);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#internal Lb#internal}.
         * <p>
         * @return {@code this}
         * @param internal Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#internal Lb#internal}. This parameter is required.
         */
        public Builder internal(final java.lang.Boolean internal) {
            this.config().internal(internal);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#internal Lb#internal}.
         * <p>
         * @return {@code this}
         * @param internal Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#internal Lb#internal}. This parameter is required.
         */
        public Builder internal(final com.hashicorp.cdktf.IResolvable internal) {
            this.config().internal(internal);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#ip_address_type Lb#ip_address_type}.
         * <p>
         * @return {@code this}
         * @param ipAddressType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#ip_address_type Lb#ip_address_type}. This parameter is required.
         */
        public Builder ipAddressType(final java.lang.String ipAddressType) {
            this.config().ipAddressType(ipAddressType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#load_balancer_type Lb#load_balancer_type}.
         * <p>
         * @return {@code this}
         * @param loadBalancerType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#load_balancer_type Lb#load_balancer_type}. This parameter is required.
         */
        public Builder loadBalancerType(final java.lang.String loadBalancerType) {
            this.config().loadBalancerType(loadBalancerType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#name Lb#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#name Lb#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#name_prefix Lb#name_prefix}.
         * <p>
         * @return {@code this}
         * @param namePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#name_prefix Lb#name_prefix}. This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#preserve_host_header Lb#preserve_host_header}.
         * <p>
         * @return {@code this}
         * @param preserveHostHeader Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#preserve_host_header Lb#preserve_host_header}. This parameter is required.
         */
        public Builder preserveHostHeader(final java.lang.Boolean preserveHostHeader) {
            this.config().preserveHostHeader(preserveHostHeader);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#preserve_host_header Lb#preserve_host_header}.
         * <p>
         * @return {@code this}
         * @param preserveHostHeader Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#preserve_host_header Lb#preserve_host_header}. This parameter is required.
         */
        public Builder preserveHostHeader(final com.hashicorp.cdktf.IResolvable preserveHostHeader) {
            this.config().preserveHostHeader(preserveHostHeader);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#security_groups Lb#security_groups}.
         * <p>
         * @return {@code this}
         * @param securityGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#security_groups Lb#security_groups}. This parameter is required.
         */
        public Builder securityGroups(final java.util.List<java.lang.String> securityGroups) {
            this.config().securityGroups(securityGroups);
            return this;
        }

        /**
         * subnet_mapping block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb#subnet_mapping Lb#subnet_mapping}
         * <p>
         * @return {@code this}
         * @param subnetMapping subnet_mapping block. This parameter is required.
         */
        public Builder subnetMapping(final com.hashicorp.cdktf.IResolvable subnetMapping) {
            this.config().subnetMapping(subnetMapping);
            return this;
        }
        /**
         * subnet_mapping block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb#subnet_mapping Lb#subnet_mapping}
         * <p>
         * @return {@code this}
         * @param subnetMapping subnet_mapping block. This parameter is required.
         */
        public Builder subnetMapping(final java.util.List<? extends imports.aws.elb.LbSubnetMapping> subnetMapping) {
            this.config().subnetMapping(subnetMapping);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#subnets Lb#subnets}.
         * <p>
         * @return {@code this}
         * @param subnets Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#subnets Lb#subnets}. This parameter is required.
         */
        public Builder subnets(final java.util.List<java.lang.String> subnets) {
            this.config().subnets(subnets);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#tags Lb#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#tags Lb#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#tags_all Lb#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lb#tags_all Lb#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config().tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb#timeouts Lb#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.elb.LbTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.elb.Lb}.
         */
        @Override
        public imports.aws.elb.Lb build() {
            return new imports.aws.elb.Lb(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.elb.LbConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.elb.LbConfig.Builder();
            }
            return this.config;
        }
    }
}
