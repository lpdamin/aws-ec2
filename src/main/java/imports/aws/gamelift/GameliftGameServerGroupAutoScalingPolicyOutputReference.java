package imports.aws.gamelift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.256Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftGameServerGroupAutoScalingPolicyOutputReference")
public class GameliftGameServerGroupAutoScalingPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GameliftGameServerGroupAutoScalingPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GameliftGameServerGroupAutoScalingPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GameliftGameServerGroupAutoScalingPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTargetTrackingConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putTargetTrackingConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEstimatedInstanceWarmup() {
        software.amazon.jsii.Kernel.call(this, "resetEstimatedInstanceWarmup", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfigurationOutputReference getTargetTrackingConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "targetTrackingConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEstimatedInstanceWarmupInput() {
        return software.amazon.jsii.Kernel.get(this, "estimatedInstanceWarmupInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration getTargetTrackingConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "targetTrackingConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEstimatedInstanceWarmup() {
        return software.amazon.jsii.Kernel.get(this, "estimatedInstanceWarmup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEstimatedInstanceWarmup(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "estimatedInstanceWarmup", java.util.Objects.requireNonNull(value, "estimatedInstanceWarmup is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftGameServerGroupAutoScalingPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
