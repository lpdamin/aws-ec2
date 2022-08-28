package imports.aws.synthetics;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.818Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.synthetics.SyntheticsCanaryScheduleOutputReference")
public class SyntheticsCanaryScheduleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SyntheticsCanaryScheduleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SyntheticsCanaryScheduleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SyntheticsCanaryScheduleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDurationInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetDurationInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDurationInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "durationInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "expressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDurationInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "durationInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDurationInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "durationInSeconds", java.util.Objects.requireNonNull(value, "durationInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExpression() {
        return software.amazon.jsii.Kernel.get(this, "expression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "expression", java.util.Objects.requireNonNull(value, "expression is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.synthetics.SyntheticsCanarySchedule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.synthetics.SyntheticsCanarySchedule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.synthetics.SyntheticsCanarySchedule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
