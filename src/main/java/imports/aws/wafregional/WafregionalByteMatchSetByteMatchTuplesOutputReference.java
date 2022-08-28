package imports.aws.wafregional;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:02.101Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafregional.WafregionalByteMatchSetByteMatchTuplesOutputReference")
public class WafregionalByteMatchSetByteMatchTuplesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected WafregionalByteMatchSetByteMatchTuplesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafregionalByteMatchSetByteMatchTuplesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public WafregionalByteMatchSetByteMatchTuplesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putFieldToMatch(final @org.jetbrains.annotations.NotNull imports.aws.wafregional.WafregionalByteMatchSetByteMatchTuplesFieldToMatch value) {
        software.amazon.jsii.Kernel.call(this, "putFieldToMatch", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTargetString() {
        software.amazon.jsii.Kernel.call(this, "resetTargetString", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafregional.WafregionalByteMatchSetByteMatchTuplesFieldToMatchOutputReference getFieldToMatch() {
        return software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalByteMatchSetByteMatchTuplesFieldToMatchOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalByteMatchSetByteMatchTuplesFieldToMatch getFieldToMatchInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldToMatchInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalByteMatchSetByteMatchTuplesFieldToMatch.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPositionalConstraintInput() {
        return software.amazon.jsii.Kernel.get(this, "positionalConstraintInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetStringInput() {
        return software.amazon.jsii.Kernel.get(this, "targetStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTextTransformationInput() {
        return software.amazon.jsii.Kernel.get(this, "textTransformationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPositionalConstraint() {
        return software.amazon.jsii.Kernel.get(this, "positionalConstraint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPositionalConstraint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "positionalConstraint", java.util.Objects.requireNonNull(value, "positionalConstraint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetString() {
        return software.amazon.jsii.Kernel.get(this, "targetString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetString", java.util.Objects.requireNonNull(value, "targetString is required"));
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

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalByteMatchSetByteMatchTuples value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
