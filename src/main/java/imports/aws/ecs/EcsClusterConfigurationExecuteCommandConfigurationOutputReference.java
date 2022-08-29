package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.895Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationOutputReference")
public class EcsClusterConfigurationExecuteCommandConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EcsClusterConfigurationExecuteCommandConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsClusterConfigurationExecuteCommandConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EcsClusterConfigurationExecuteCommandConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLogConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationLogConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putLogConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetLogConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogging() {
        software.amazon.jsii.Kernel.call(this, "resetLogging", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationLogConfigurationOutputReference getLogConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "logConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationLogConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationLogConfiguration getLogConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "logConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationLogConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoggingInput() {
        return software.amazon.jsii.Kernel.get(this, "loggingInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogging() {
        return software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogging(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logging", java.util.Objects.requireNonNull(value, "logging is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
