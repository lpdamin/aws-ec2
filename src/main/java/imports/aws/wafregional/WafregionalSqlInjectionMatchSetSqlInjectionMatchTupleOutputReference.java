package imports.aws.wafregional;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.100Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleOutputReference")
public class WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putFieldToMatch(final @org.jetbrains.annotations.NotNull imports.aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch value) {
        software.amazon.jsii.Kernel.call(this, "putFieldToMatch", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchOutputReference getFieldToMatch() {
        return software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch getFieldToMatchInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldToMatchInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTextTransformationInput() {
        return software.amazon.jsii.Kernel.get(this, "textTransformationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTextTransformation() {
        return software.amazon.jsii.Kernel.get(this, "textTransformation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTextTransformation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "textTransformation", java.util.Objects.requireNonNull(value, "textTransformation is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalSqlInjectionMatchSetSqlInjectionMatchTuple value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
