package imports.aws.opsworks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.109Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.opsworks.OpsworksNodejsAppLayerCloudwatchConfigurationOutputReference")
public class OpsworksNodejsAppLayerCloudwatchConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected OpsworksNodejsAppLayerCloudwatchConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksNodejsAppLayerCloudwatchConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public OpsworksNodejsAppLayerCloudwatchConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLogStreams(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLogStreams", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogStreams() {
        software.amazon.jsii.Kernel.call(this, "resetLogStreams", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.opsworks.OpsworksNodejsAppLayerCloudwatchConfigurationLogStreamsList getLogStreams() {
        return software.amazon.jsii.Kernel.get(this, "logStreams", software.amazon.jsii.NativeType.forClass(imports.aws.opsworks.OpsworksNodejsAppLayerCloudwatchConfigurationLogStreamsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLogStreamsInput() {
        return software.amazon.jsii.Kernel.get(this, "logStreamsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.opsworks.OpsworksNodejsAppLayerCloudwatchConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.opsworks.OpsworksNodejsAppLayerCloudwatchConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.opsworks.OpsworksNodejsAppLayerCloudwatchConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
