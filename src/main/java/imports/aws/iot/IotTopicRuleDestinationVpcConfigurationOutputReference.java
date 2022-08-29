package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.457Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleDestinationVpcConfigurationOutputReference")
public class IotTopicRuleDestinationVpcConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotTopicRuleDestinationVpcConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotTopicRuleDestinationVpcConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotTopicRuleDestinationVpcConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnetIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnetIds", java.util.Objects.requireNonNull(value, "subnetIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleDestinationVpcConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleDestinationVpcConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleDestinationVpcConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
