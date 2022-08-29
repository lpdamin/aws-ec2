package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.962Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference")
public class MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeThroughput() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeThroughput", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getVolumeThroughputInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeThroughputInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.Number getVolumeThroughput() {
        return software.amazon.jsii.Kernel.get(this, "volumeThroughput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setVolumeThroughput(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "volumeThroughput", java.util.Objects.requireNonNull(value, "volumeThroughput is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
