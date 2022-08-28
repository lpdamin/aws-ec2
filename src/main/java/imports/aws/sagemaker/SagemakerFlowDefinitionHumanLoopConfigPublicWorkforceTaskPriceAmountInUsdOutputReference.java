package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.506Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference")
public class SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCents() {
        software.amazon.jsii.Kernel.call(this, "resetCents", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDollars() {
        software.amazon.jsii.Kernel.call(this, "resetDollars", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTenthFractionsOfACent() {
        software.amazon.jsii.Kernel.call(this, "resetTenthFractionsOfACent", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCentsInput() {
        return software.amazon.jsii.Kernel.get(this, "centsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDollarsInput() {
        return software.amazon.jsii.Kernel.get(this, "dollarsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTenthFractionsOfACentInput() {
        return software.amazon.jsii.Kernel.get(this, "tenthFractionsOfACentInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCents() {
        return software.amazon.jsii.Kernel.get(this, "cents", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCents(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cents", java.util.Objects.requireNonNull(value, "cents is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDollars() {
        return software.amazon.jsii.Kernel.get(this, "dollars", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDollars(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "dollars", java.util.Objects.requireNonNull(value, "dollars is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTenthFractionsOfACent() {
        return software.amazon.jsii.Kernel.get(this, "tenthFractionsOfACent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTenthFractionsOfACent(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "tenthFractionsOfACent", java.util.Objects.requireNonNull(value, "tenthFractionsOfACent is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
