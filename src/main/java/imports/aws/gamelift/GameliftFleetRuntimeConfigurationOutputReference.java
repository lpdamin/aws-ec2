package imports.aws.gamelift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.251Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftFleetRuntimeConfigurationOutputReference")
public class GameliftFleetRuntimeConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GameliftFleetRuntimeConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GameliftFleetRuntimeConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GameliftFleetRuntimeConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putServerProcess(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putServerProcess", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGameSessionActivationTimeoutSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetGameSessionActivationTimeoutSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxConcurrentGameSessionActivations() {
        software.amazon.jsii.Kernel.call(this, "resetMaxConcurrentGameSessionActivations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerProcess() {
        software.amazon.jsii.Kernel.call(this, "resetServerProcess", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.gamelift.GameliftFleetRuntimeConfigurationServerProcessList getServerProcess() {
        return software.amazon.jsii.Kernel.get(this, "serverProcess", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftFleetRuntimeConfigurationServerProcessList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getGameSessionActivationTimeoutSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "gameSessionActivationTimeoutSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxConcurrentGameSessionActivationsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrentGameSessionActivationsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getServerProcessInput() {
        return software.amazon.jsii.Kernel.get(this, "serverProcessInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getGameSessionActivationTimeoutSeconds() {
        return software.amazon.jsii.Kernel.get(this, "gameSessionActivationTimeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setGameSessionActivationTimeoutSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "gameSessionActivationTimeoutSeconds", java.util.Objects.requireNonNull(value, "gameSessionActivationTimeoutSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxConcurrentGameSessionActivations() {
        return software.amazon.jsii.Kernel.get(this, "maxConcurrentGameSessionActivations", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxConcurrentGameSessionActivations(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxConcurrentGameSessionActivations", java.util.Objects.requireNonNull(value, "maxConcurrentGameSessionActivations is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftFleetRuntimeConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftFleetRuntimeConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftFleetRuntimeConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
