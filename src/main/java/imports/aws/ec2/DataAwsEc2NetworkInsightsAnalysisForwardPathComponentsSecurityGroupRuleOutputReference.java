package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.618Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleOutputReference")
public class DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCidr() {
        return software.amazon.jsii.Kernel.get(this, "cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirection() {
        return software.amazon.jsii.Kernel.get(this, "direction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRulePortRangeList getPortRange() {
        return software.amazon.jsii.Kernel.get(this, "portRange", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRulePortRangeList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefixListId() {
        return software.amazon.jsii.Kernel.get(this, "prefixListId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProtocol() {
        return software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecurityGroupId() {
        return software.amazon.jsii.Kernel.get(this, "securityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.DataAwsEc2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
