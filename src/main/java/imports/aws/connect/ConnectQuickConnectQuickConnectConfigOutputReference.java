package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.818Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectQuickConnectQuickConnectConfigOutputReference")
public class ConnectQuickConnectQuickConnectConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ConnectQuickConnectQuickConnectConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConnectQuickConnectQuickConnectConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ConnectQuickConnectQuickConnectConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPhoneConfig(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPhoneConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueueConfig(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putQueueConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserConfig(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putUserConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPhoneConfig() {
        software.amazon.jsii.Kernel.call(this, "resetPhoneConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueueConfig() {
        software.amazon.jsii.Kernel.call(this, "resetQueueConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserConfig() {
        software.amazon.jsii.Kernel.call(this, "resetUserConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectQuickConnectQuickConnectConfigPhoneConfigList getPhoneConfig() {
        return software.amazon.jsii.Kernel.get(this, "phoneConfig", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectQuickConnectQuickConnectConfigPhoneConfigList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectQuickConnectQuickConnectConfigQueueConfigList getQueueConfig() {
        return software.amazon.jsii.Kernel.get(this, "queueConfig", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectQuickConnectQuickConnectConfigQueueConfigList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectQuickConnectQuickConnectConfigUserConfigList getUserConfig() {
        return software.amazon.jsii.Kernel.get(this, "userConfig", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectQuickConnectQuickConnectConfigUserConfigList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPhoneConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "phoneConfigInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getQueueConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "queueConfigInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQuickConnectTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "quickConnectTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUserConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "userConfigInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQuickConnectType() {
        return software.amazon.jsii.Kernel.get(this, "quickConnectType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQuickConnectType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "quickConnectType", java.util.Objects.requireNonNull(value, "quickConnectType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectQuickConnectQuickConnectConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectQuickConnectQuickConnectConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectQuickConnectQuickConnectConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
