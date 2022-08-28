package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.961Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyOutputReference")
public class DataAwsNetworkfirewallFirewallPolicyFirewallPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsNetworkfirewallFirewallPolicyFirewallPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsNetworkfirewallFirewallPolicyFirewallPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsNetworkfirewallFirewallPolicyFirewallPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatefulDefaultActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statefulDefaultActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptionsList getStatefulEngineOptions() {
        return software.amazon.jsii.Kernel.get(this, "statefulEngineOptions", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceList getStatefulRuleGroupReference() {
        return software.amazon.jsii.Kernel.get(this, "statefulRuleGroupReference", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionList getStatelessCustomAction() {
        return software.amazon.jsii.Kernel.get(this, "statelessCustomAction", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionList.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatelessDefaultActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statelessDefaultActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatelessFragmentDefaultActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statelessFragmentDefaultActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatelessRuleGroupReferenceList getStatelessRuleGroupReference() {
        return software.amazon.jsii.Kernel.get(this, "statelessRuleGroupReference", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicyStatelessRuleGroupReferenceList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.DataAwsNetworkfirewallFirewallPolicyFirewallPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
