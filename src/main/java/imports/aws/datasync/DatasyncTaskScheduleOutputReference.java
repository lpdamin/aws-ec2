package imports.aws.datasync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.362Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datasync.DatasyncTaskScheduleOutputReference")
public class DatasyncTaskScheduleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DatasyncTaskScheduleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DatasyncTaskScheduleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DatasyncTaskScheduleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScheduleExpression() {
        return software.amazon.jsii.Kernel.get(this, "scheduleExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScheduleExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scheduleExpression", java.util.Objects.requireNonNull(value, "scheduleExpression is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncTaskSchedule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncTaskSchedule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncTaskSchedule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
