package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.516Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceOutputReference")
public class SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAmountInUsd(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd value) {
        software.amazon.jsii.Kernel.call(this, "putAmountInUsd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAmountInUsd() {
        software.amazon.jsii.Kernel.call(this, "resetAmountInUsd", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference getAmountInUsd() {
        return software.amazon.jsii.Kernel.get(this, "amountInUsd", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd getAmountInUsdInput() {
        return software.amazon.jsii.Kernel.get(this, "amountInUsdInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
