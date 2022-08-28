package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.016Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsOutputReference")
public class NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putIpSet(final @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsIpSet value) {
        software.amazon.jsii.Kernel.call(this, "putIpSet", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsIpSetOutputReference getIpSet() {
        return software.amazon.jsii.Kernel.get(this, "ipSet", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsIpSetOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsIpSet getIpSetInput() {
        return software.amazon.jsii.Kernel.get(this, "ipSetInput", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSetsIpSet.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "keyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKey() {
        return software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "key", java.util.Objects.requireNonNull(value, "key is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariablesIpSets value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
