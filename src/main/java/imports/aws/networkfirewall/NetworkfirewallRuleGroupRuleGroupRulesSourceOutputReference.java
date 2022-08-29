package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.047Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceOutputReference")
public class NetworkfirewallRuleGroupRuleGroupRulesSourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkfirewallRuleGroupRuleGroupRulesSourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkfirewallRuleGroupRuleGroupRulesSourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public NetworkfirewallRuleGroupRuleGroupRulesSourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRulesSourceList(final @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceRulesSourceList value) {
        software.amazon.jsii.Kernel.call(this, "putRulesSourceList", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStatefulRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putStatefulRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStatelessRulesAndCustomActions(final @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions value) {
        software.amazon.jsii.Kernel.call(this, "putStatelessRulesAndCustomActions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRulesSourceList() {
        software.amazon.jsii.Kernel.call(this, "resetRulesSourceList", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRulesString() {
        software.amazon.jsii.Kernel.call(this, "resetRulesString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatefulRule() {
        software.amazon.jsii.Kernel.call(this, "resetStatefulRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatelessRulesAndCustomActions() {
        software.amazon.jsii.Kernel.call(this, "resetStatelessRulesAndCustomActions", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceRulesSourceListOutputReference getRulesSourceList() {
        return software.amazon.jsii.Kernel.get(this, "rulesSourceList", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceRulesSourceListOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatefulRuleList getStatefulRule() {
        return software.amazon.jsii.Kernel.get(this, "statefulRule", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatefulRuleList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsOutputReference getStatelessRulesAndCustomActions() {
        return software.amazon.jsii.Kernel.get(this, "statelessRulesAndCustomActions", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceRulesSourceList getRulesSourceListInput() {
        return software.amazon.jsii.Kernel.get(this, "rulesSourceListInput", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceRulesSourceList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRulesStringInput() {
        return software.amazon.jsii.Kernel.get(this, "rulesStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStatefulRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "statefulRuleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions getStatelessRulesAndCustomActionsInput() {
        return software.amazon.jsii.Kernel.get(this, "statelessRulesAndCustomActionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRulesString() {
        return software.amazon.jsii.Kernel.get(this, "rulesString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRulesString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rulesString", java.util.Objects.requireNonNull(value, "rulesString is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
