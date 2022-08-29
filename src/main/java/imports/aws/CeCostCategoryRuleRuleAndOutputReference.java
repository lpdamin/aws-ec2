package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.126Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.CeCostCategoryRuleRuleAndOutputReference")
public class CeCostCategoryRuleRuleAndOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CeCostCategoryRuleRuleAndOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CeCostCategoryRuleRuleAndOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CeCostCategoryRuleRuleAndOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putCostCategory(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndCostCategory value) {
        software.amazon.jsii.Kernel.call(this, "putCostCategory", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDimension(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndDimension value) {
        software.amazon.jsii.Kernel.call(this, "putDimension", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTags(final @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndTags value) {
        software.amazon.jsii.Kernel.call(this, "putTags", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCostCategory() {
        software.amazon.jsii.Kernel.call(this, "resetCostCategory", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDimension() {
        software.amazon.jsii.Kernel.call(this, "resetDimension", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndCostCategoryOutputReference getCostCategory() {
        return software.amazon.jsii.Kernel.get(this, "costCategory", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndCostCategoryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndDimensionOutputReference getDimension() {
        return software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndDimensionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.CeCostCategoryRuleRuleAndTagsOutputReference getTags() {
        return software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndTagsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleAndCostCategory getCostCategoryInput() {
        return software.amazon.jsii.Kernel.get(this, "costCategoryInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndCostCategory.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleAndDimension getDimensionInput() {
        return software.amazon.jsii.Kernel.get(this, "dimensionInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndDimension.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleAndTags getTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndTags.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleAnd value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
