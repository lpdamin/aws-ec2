package imports.aws.mq;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.821Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.mq.MqBrokerMaintenanceWindowStartTimeOutputReference")
public class MqBrokerMaintenanceWindowStartTimeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MqBrokerMaintenanceWindowStartTimeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MqBrokerMaintenanceWindowStartTimeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MqBrokerMaintenanceWindowStartTimeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDayOfWeekInput() {
        return software.amazon.jsii.Kernel.get(this, "dayOfWeekInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeOfDayInput() {
        return software.amazon.jsii.Kernel.get(this, "timeOfDayInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timeZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDayOfWeek() {
        return software.amazon.jsii.Kernel.get(this, "dayOfWeek", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDayOfWeek(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dayOfWeek", java.util.Objects.requireNonNull(value, "dayOfWeek is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeOfDay() {
        return software.amazon.jsii.Kernel.get(this, "timeOfDay", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeOfDay(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeOfDay", java.util.Objects.requireNonNull(value, "timeOfDay is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeZone() {
        return software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeZone", java.util.Objects.requireNonNull(value, "timeZone is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerMaintenanceWindowStartTime getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerMaintenanceWindowStartTime.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerMaintenanceWindowStartTime value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
