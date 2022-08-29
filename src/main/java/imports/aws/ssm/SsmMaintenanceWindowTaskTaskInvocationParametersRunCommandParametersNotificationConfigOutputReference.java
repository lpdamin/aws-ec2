package imports.aws.ssm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.762Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOutputReference")
public class SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetNotificationArn() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotificationEvents() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationEvents", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotificationType() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotificationEventsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "notificationEventsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationArn() {
        return software.amazon.jsii.Kernel.get(this, "notificationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationArn", java.util.Objects.requireNonNull(value, "notificationArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNotificationEvents() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "notificationEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setNotificationEvents(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "notificationEvents", java.util.Objects.requireNonNull(value, "notificationEvents is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationType() {
        return software.amazon.jsii.Kernel.get(this, "notificationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationType", java.util.Objects.requireNonNull(value, "notificationType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
