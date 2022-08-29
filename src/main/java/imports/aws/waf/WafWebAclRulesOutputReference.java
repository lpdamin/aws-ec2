package imports.aws.waf;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.074Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.waf.WafWebAclRulesOutputReference")
public class WafWebAclRulesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected WafWebAclRulesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafWebAclRulesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public WafWebAclRulesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAction(final @org.jetbrains.annotations.NotNull imports.aws.waf.WafWebAclRulesAction value) {
        software.amazon.jsii.Kernel.call(this, "putAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOverrideAction(final @org.jetbrains.annotations.NotNull imports.aws.waf.WafWebAclRulesOverrideAction value) {
        software.amazon.jsii.Kernel.call(this, "putOverrideAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAction() {
        software.amazon.jsii.Kernel.call(this, "resetAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOverrideAction() {
        software.amazon.jsii.Kernel.call(this, "resetOverrideAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.waf.WafWebAclRulesActionOutputReference getAction() {
        return software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(imports.aws.waf.WafWebAclRulesActionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.waf.WafWebAclRulesOverrideActionOutputReference getOverrideAction() {
        return software.amazon.jsii.Kernel.get(this, "overrideAction", software.amazon.jsii.NativeType.forClass(imports.aws.waf.WafWebAclRulesOverrideActionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.waf.WafWebAclRulesAction getActionInput() {
        return software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.forClass(imports.aws.waf.WafWebAclRulesAction.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.waf.WafWebAclRulesOverrideAction getOverrideActionInput() {
        return software.amazon.jsii.Kernel.get(this, "overrideActionInput", software.amazon.jsii.NativeType.forClass(imports.aws.waf.WafWebAclRulesOverrideAction.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPriorityInput() {
        return software.amazon.jsii.Kernel.get(this, "priorityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRuleIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPriority() {
        return software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPriority(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "priority", java.util.Objects.requireNonNull(value, "priority is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRuleId() {
        return software.amazon.jsii.Kernel.get(this, "ruleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuleId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ruleId", java.util.Objects.requireNonNull(value, "ruleId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.waf.WafWebAclRules value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
