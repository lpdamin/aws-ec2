package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.721Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOutputReference")
public class LambdaEventSourceMappingDestinationConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LambdaEventSourceMappingDestinationConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaEventSourceMappingDestinationConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LambdaEventSourceMappingDestinationConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putOnFailure(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure value) {
        software.amazon.jsii.Kernel.call(this, "putOnFailure", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOnFailure() {
        software.amazon.jsii.Kernel.call(this, "resetOnFailure", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailureOutputReference getOnFailure() {
        return software.amazon.jsii.Kernel.get(this, "onFailure", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailureOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure getOnFailureInput() {
        return software.amazon.jsii.Kernel.get(this, "onFailureInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
