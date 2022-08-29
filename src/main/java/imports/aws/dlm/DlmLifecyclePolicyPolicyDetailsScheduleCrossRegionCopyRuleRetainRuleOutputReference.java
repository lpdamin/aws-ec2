package imports.aws.dlm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.448Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleOutputReference")
public class DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "intervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIntervalUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "intervalUnitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInterval() {
        return software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "interval", java.util.Objects.requireNonNull(value, "interval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIntervalUnit() {
        return software.amazon.jsii.Kernel.get(this, "intervalUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIntervalUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "intervalUnit", java.util.Objects.requireNonNull(value, "intervalUnit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
