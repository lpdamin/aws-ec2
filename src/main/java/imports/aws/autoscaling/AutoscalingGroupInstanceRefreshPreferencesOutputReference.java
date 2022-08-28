package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.825Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingGroupInstanceRefreshPreferencesOutputReference")
public class AutoscalingGroupInstanceRefreshPreferencesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingGroupInstanceRefreshPreferencesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingGroupInstanceRefreshPreferencesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingGroupInstanceRefreshPreferencesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCheckpointDelay() {
        software.amazon.jsii.Kernel.call(this, "resetCheckpointDelay", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCheckpointPercentages() {
        software.amazon.jsii.Kernel.call(this, "resetCheckpointPercentages", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceWarmup() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceWarmup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinHealthyPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetMinHealthyPercentage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipMatching() {
        software.amazon.jsii.Kernel.call(this, "resetSkipMatching", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCheckpointDelayInput() {
        return software.amazon.jsii.Kernel.get(this, "checkpointDelayInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getCheckpointPercentagesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Number>)(software.amazon.jsii.Kernel.get(this, "checkpointPercentagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceWarmupInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceWarmupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinHealthyPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "minHealthyPercentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipMatchingInput() {
        return software.amazon.jsii.Kernel.get(this, "skipMatchingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCheckpointDelay() {
        return software.amazon.jsii.Kernel.get(this, "checkpointDelay", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCheckpointDelay(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "checkpointDelay", java.util.Objects.requireNonNull(value, "checkpointDelay is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getCheckpointPercentages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "checkpointPercentages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public void setCheckpointPercentages(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> value) {
        software.amazon.jsii.Kernel.set(this, "checkpointPercentages", java.util.Objects.requireNonNull(value, "checkpointPercentages is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceWarmup() {
        return software.amazon.jsii.Kernel.get(this, "instanceWarmup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceWarmup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceWarmup", java.util.Objects.requireNonNull(value, "instanceWarmup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinHealthyPercentage() {
        return software.amazon.jsii.Kernel.get(this, "minHealthyPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinHealthyPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minHealthyPercentage", java.util.Objects.requireNonNull(value, "minHealthyPercentage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSkipMatching() {
        return software.amazon.jsii.Kernel.get(this, "skipMatching", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipMatching(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipMatching", java.util.Objects.requireNonNull(value, "skipMatching is required"));
    }

    public void setSkipMatching(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipMatching", java.util.Objects.requireNonNull(value, "skipMatching is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupInstanceRefreshPreferences getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupInstanceRefreshPreferences.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupInstanceRefreshPreferences value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
