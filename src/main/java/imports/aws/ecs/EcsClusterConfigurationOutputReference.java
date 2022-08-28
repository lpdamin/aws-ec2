package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.394Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsClusterConfigurationOutputReference")
public class EcsClusterConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EcsClusterConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsClusterConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EcsClusterConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putExecuteCommandConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putExecuteCommandConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExecuteCommandConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetExecuteCommandConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationOutputReference getExecuteCommandConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "executeCommandConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfiguration getExecuteCommandConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "executeCommandConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfigurationExecuteCommandConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsClusterConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsClusterConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
