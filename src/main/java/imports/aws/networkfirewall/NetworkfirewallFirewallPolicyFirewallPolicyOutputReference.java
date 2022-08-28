package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.989Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyOutputReference")
public class NetworkfirewallFirewallPolicyFirewallPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkfirewallFirewallPolicyFirewallPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkfirewallFirewallPolicyFirewallPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public NetworkfirewallFirewallPolicyFirewallPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putStatefulEngineOptions(final @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions value) {
        software.amazon.jsii.Kernel.call(this, "putStatefulEngineOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStatefulRuleGroupReference(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putStatefulRuleGroupReference", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStatelessCustomAction(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putStatelessCustomAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStatelessRuleGroupReference(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putStatelessRuleGroupReference", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetStatefulDefaultActions() {
        software.amazon.jsii.Kernel.call(this, "resetStatefulDefaultActions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatefulEngineOptions() {
        software.amazon.jsii.Kernel.call(this, "resetStatefulEngineOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatefulRuleGroupReference() {
        software.amazon.jsii.Kernel.call(this, "resetStatefulRuleGroupReference", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatelessCustomAction() {
        software.amazon.jsii.Kernel.call(this, "resetStatelessCustomAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatelessRuleGroupReference() {
        software.amazon.jsii.Kernel.call(this, "resetStatelessRuleGroupReference", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptionsOutputReference getStatefulEngineOptions() {
        return software.amazon.jsii.Kernel.get(this, "statefulEngineOptions", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceList getStatefulRuleGroupReference() {
        return software.amazon.jsii.Kernel.get(this, "statefulRuleGroupReference", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionList getStatelessCustomAction() {
        return software.amazon.jsii.Kernel.get(this, "statelessCustomAction", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessRuleGroupReferenceList getStatelessRuleGroupReference() {
        return software.amazon.jsii.Kernel.get(this, "statelessRuleGroupReference", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessRuleGroupReferenceList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStatefulDefaultActionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "statefulDefaultActionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions getStatefulEngineOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "statefulEngineOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatefulEngineOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStatefulRuleGroupReferenceInput() {
        return software.amazon.jsii.Kernel.get(this, "statefulRuleGroupReferenceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStatelessCustomActionInput() {
        return software.amazon.jsii.Kernel.get(this, "statelessCustomActionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStatelessDefaultActionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "statelessDefaultActionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStatelessFragmentDefaultActionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "statelessFragmentDefaultActionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStatelessRuleGroupReferenceInput() {
        return software.amazon.jsii.Kernel.get(this, "statelessRuleGroupReferenceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatefulDefaultActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statefulDefaultActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStatefulDefaultActions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "statefulDefaultActions", java.util.Objects.requireNonNull(value, "statefulDefaultActions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatelessDefaultActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statelessDefaultActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStatelessDefaultActions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "statelessDefaultActions", java.util.Objects.requireNonNull(value, "statelessDefaultActions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStatelessFragmentDefaultActions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "statelessFragmentDefaultActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStatelessFragmentDefaultActions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "statelessFragmentDefaultActions", java.util.Objects.requireNonNull(value, "statelessFragmentDefaultActions is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
