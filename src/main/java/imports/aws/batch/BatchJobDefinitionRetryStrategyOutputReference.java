package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.BatchJobDefinitionRetryStrategyOutputReference")
public class BatchJobDefinitionRetryStrategyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected BatchJobDefinitionRetryStrategyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BatchJobDefinitionRetryStrategyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public BatchJobDefinitionRetryStrategyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEvaluateOnExit(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEvaluateOnExit", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAttempts() {
        software.amazon.jsii.Kernel.call(this, "resetAttempts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEvaluateOnExit() {
        software.amazon.jsii.Kernel.call(this, "resetEvaluateOnExit", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.batch.BatchJobDefinitionRetryStrategyEvaluateOnExitList getEvaluateOnExit() {
        return software.amazon.jsii.Kernel.get(this, "evaluateOnExit", software.amazon.jsii.NativeType.forClass(imports.aws.batch.BatchJobDefinitionRetryStrategyEvaluateOnExitList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAttemptsInput() {
        return software.amazon.jsii.Kernel.get(this, "attemptsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEvaluateOnExitInput() {
        return software.amazon.jsii.Kernel.get(this, "evaluateOnExitInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAttempts() {
        return software.amazon.jsii.Kernel.get(this, "attempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAttempts(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "attempts", java.util.Objects.requireNonNull(value, "attempts is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.batch.BatchJobDefinitionRetryStrategy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.batch.BatchJobDefinitionRetryStrategy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.batch.BatchJobDefinitionRetryStrategy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
