package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.739Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference")
public class AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncFunctionSyncConfigLambdaConflictHandlerConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetLambdaConflictHandlerArn() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaConflictHandlerArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaConflictHandlerArnInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConflictHandlerArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaConflictHandlerArn() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConflictHandlerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaConflictHandlerArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaConflictHandlerArn", java.util.Objects.requireNonNull(value, "lambdaConflictHandlerArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncFunctionSyncConfigLambdaConflictHandlerConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
