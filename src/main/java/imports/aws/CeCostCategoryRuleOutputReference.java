package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.125Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.CeCostCategoryRuleOutputReference")
public class CeCostCategoryRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CeCostCategoryRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CeCostCategoryRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CeCostCategoryRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putInheritedValue(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleInheritedValue value) {
        software.amazon.jsii.Kernel.call(this, "putInheritedValue", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRule(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRule value) {
        software.amazon.jsii.Kernel.call(this, "putRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetInheritedValue() {
        software.amazon.jsii.Kernel.call(this, "resetInheritedValue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRule() {
        software.amazon.jsii.Kernel.call(this, "resetRule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValue() {
        software.amazon.jsii.Kernel.call(this, "resetValue", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleInheritedValueOutputReference getInheritedValue() {
        return software.amazon.jsii.Kernel.get(this, "inheritedValue", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleInheritedValueOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleOutputReference getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleInheritedValue getInheritedValueInput() {
        return software.amazon.jsii.Kernel.get(this, "inheritedValueInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleInheritedValue.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRule getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRule.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValueInput() {
        return software.amazon.jsii.Kernel.get(this, "valueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "value", java.util.Objects.requireNonNull(value, "value is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
