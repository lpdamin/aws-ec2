package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.725Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOutputReference")
public class LambdaFunctionEventInvokeConfigDestinationConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LambdaFunctionEventInvokeConfigDestinationConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaFunctionEventInvokeConfigDestinationConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LambdaFunctionEventInvokeConfigDestinationConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putOnFailure(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure value) {
        software.amazon.jsii.Kernel.call(this, "putOnFailure", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOnSuccess(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess value) {
        software.amazon.jsii.Kernel.call(this, "putOnSuccess", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOnFailure() {
        software.amazon.jsii.Kernel.call(this, "resetOnFailure", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnSuccess() {
        software.amazon.jsii.Kernel.call(this, "resetOnSuccess", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailureOutputReference getOnFailure() {
        return software.amazon.jsii.Kernel.get(this, "onFailure", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailureOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccessOutputReference getOnSuccess() {
        return software.amazon.jsii.Kernel.get(this, "onSuccess", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccessOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure getOnFailureInput() {
        return software.amazon.jsii.Kernel.get(this, "onFailureInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess getOnSuccessInput() {
        return software.amazon.jsii.Kernel.get(this, "onSuccessInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnSuccess.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
