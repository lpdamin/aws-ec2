package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.BatchJobDefinitionTimeoutOutputReference")
public class BatchJobDefinitionTimeoutOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected BatchJobDefinitionTimeoutOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BatchJobDefinitionTimeoutOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public BatchJobDefinitionTimeoutOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAttemptDurationSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetAttemptDurationSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAttemptDurationSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "attemptDurationSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAttemptDurationSeconds() {
        return software.amazon.jsii.Kernel.get(this, "attemptDurationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAttemptDurationSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "attemptDurationSeconds", java.util.Objects.requireNonNull(value, "attemptDurationSeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.batch.BatchJobDefinitionTimeout getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.batch.BatchJobDefinitionTimeout.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.batch.BatchJobDefinitionTimeout value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
