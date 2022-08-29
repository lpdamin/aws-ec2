package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.131Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.CeCostCategoryRuleRuleOutputReference")
public class CeCostCategoryRuleRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CeCostCategoryRuleRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CeCostCategoryRuleRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CeCostCategoryRuleRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAnd(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAnd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCostCategory(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleCostCategory value) {
        software.amazon.jsii.Kernel.call(this, "putCostCategory", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDimension(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleDimension value) {
        software.amazon.jsii.Kernel.call(this, "putDimension", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNot(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleNot value) {
        software.amazon.jsii.Kernel.call(this, "putNot", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOr(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOr", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTags(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleTags value) {
        software.amazon.jsii.Kernel.call(this, "putTags", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAnd() {
        software.amazon.jsii.Kernel.call(this, "resetAnd", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCostCategory() {
        software.amazon.jsii.Kernel.call(this, "resetCostCategory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDimension() {
        software.amazon.jsii.Kernel.call(this, "resetDimension", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNot() {
        software.amazon.jsii.Kernel.call(this, "resetNot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOr() {
        software.amazon.jsii.Kernel.call(this, "resetOr", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndList getAnd() {
        return software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleCostCategoryOutputReference getCostCategory() {
        return software.amazon.jsii.Kernel.get(this, "costCategory", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleCostCategoryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleDimensionOutputReference getDimension() {
        return software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleDimensionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleNotOutputReference getNot() {
        return software.amazon.jsii.Kernel.get(this, "not", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleNotOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleOrList getOr() {
        return software.amazon.jsii.Kernel.get(this, "or", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleOrList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleTagsOutputReference getTags() {
        return software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleTagsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAndInput() {
        return software.amazon.jsii.Kernel.get(this, "andInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleCostCategory getCostCategoryInput() {
        return software.amazon.jsii.Kernel.get(this, "costCategoryInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleCostCategory.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleDimension getDimensionInput() {
        return software.amazon.jsii.Kernel.get(this, "dimensionInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleDimension.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleNot getNotInput() {
        return software.amazon.jsii.Kernel.get(this, "notInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleNot.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOrInput() {
        return software.amazon.jsii.Kernel.get(this, "orInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleTags getTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleTags.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
