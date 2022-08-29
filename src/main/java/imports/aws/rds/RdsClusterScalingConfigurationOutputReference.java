package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.272Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.RdsClusterScalingConfigurationOutputReference")
public class RdsClusterScalingConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RdsClusterScalingConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RdsClusterScalingConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RdsClusterScalingConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAutoPause() {
        software.amazon.jsii.Kernel.call(this, "resetAutoPause", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetMaxCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetMinCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondsUntilAutoPause() {
        software.amazon.jsii.Kernel.call(this, "resetSecondsUntilAutoPause", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeoutAction() {
        software.amazon.jsii.Kernel.call(this, "resetTimeoutAction", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoPauseInput() {
        return software.amazon.jsii.Kernel.get(this, "autoPauseInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "maxCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "minCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSecondsUntilAutoPauseInput() {
        return software.amazon.jsii.Kernel.get(this, "secondsUntilAutoPauseInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeoutActionInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutActionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoPause() {
        return software.amazon.jsii.Kernel.get(this, "autoPause", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoPause(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoPause", java.util.Objects.requireNonNull(value, "autoPause is required"));
    }

    public void setAutoPause(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoPause", java.util.Objects.requireNonNull(value, "autoPause is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxCapacity() {
        return software.amazon.jsii.Kernel.get(this, "maxCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxCapacity", java.util.Objects.requireNonNull(value, "maxCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinCapacity() {
        return software.amazon.jsii.Kernel.get(this, "minCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minCapacity", java.util.Objects.requireNonNull(value, "minCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSecondsUntilAutoPause() {
        return software.amazon.jsii.Kernel.get(this, "secondsUntilAutoPause", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSecondsUntilAutoPause(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "secondsUntilAutoPause", java.util.Objects.requireNonNull(value, "secondsUntilAutoPause is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeoutAction() {
        return software.amazon.jsii.Kernel.get(this, "timeoutAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeoutAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeoutAction", java.util.Objects.requireNonNull(value, "timeoutAction is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.rds.RdsClusterScalingConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.rds.RdsClusterScalingConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.rds.RdsClusterScalingConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
