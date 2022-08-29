package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.127Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.CeCostCategoryRuleRuleAndTagsOutputReference")
public class CeCostCategoryRuleRuleAndTagsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CeCostCategoryRuleRuleAndTagsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CeCostCategoryRuleRuleAndTagsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CeCostCategoryRuleRuleAndTagsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetKey() {
        software.amazon.jsii.Kernel.call(this, "resetKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMatchOptions() {
        software.amazon.jsii.Kernel.call(this, "resetMatchOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValues() {
        software.amazon.jsii.Kernel.call(this, "resetValues", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "keyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMatchOptionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "matchOptionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getValuesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "valuesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKey() {
        return software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "key", java.util.Objects.requireNonNull(value, "key is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMatchOptions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "matchOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMatchOptions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "matchOptions", java.util.Objects.requireNonNull(value, "matchOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setValues(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "values", java.util.Objects.requireNonNull(value, "values is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleAndTags getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.CeCostCategoryRuleRuleAndTags.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.CeCostCategoryRuleRuleAndTags value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
