package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.173Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsCeTagsFilterNotOutputReference")
public class DataAwsCeTagsFilterNotOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsCeTagsFilterNotOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsCeTagsFilterNotOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DataAwsCeTagsFilterNotOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCostCategory(final @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterNotCostCategory value) {
        software.amazon.jsii.Kernel.call(this, "putCostCategory", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDimension(final @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterNotDimension value) {
        software.amazon.jsii.Kernel.call(this, "putDimension", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTags(final @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterNotTags value) {
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

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterNotCostCategoryOutputReference getCostCategory() {
        return software.amazon.jsii.Kernel.get(this, "costCategory", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotCostCategoryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterNotDimensionOutputReference getDimension() {
        return software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotDimensionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterNotTagsOutputReference getTags() {
        return software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotTagsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNotCostCategory getCostCategoryInput() {
        return software.amazon.jsii.Kernel.get(this, "costCategoryInput", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotCostCategory.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNotDimension getDimensionInput() {
        return software.amazon.jsii.Kernel.get(this, "dimensionInput", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotDimension.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNotTags getTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotTags.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNot getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNot.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNot value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
