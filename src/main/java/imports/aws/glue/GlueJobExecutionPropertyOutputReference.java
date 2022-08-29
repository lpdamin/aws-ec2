package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.266Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueJobExecutionPropertyOutputReference")
public class GlueJobExecutionPropertyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueJobExecutionPropertyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueJobExecutionPropertyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueJobExecutionPropertyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMaxConcurrentRuns() {
        software.amazon.jsii.Kernel.call(this, "resetMaxConcurrentRuns", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxConcurrentRunsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrentRunsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxConcurrentRuns() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrentRuns", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxConcurrentRuns(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxConcurrentRuns", java.util.Objects.requireNonNull(value, "maxConcurrentRuns is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueJobExecutionProperty getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueJobExecutionProperty.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueJobExecutionProperty value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
