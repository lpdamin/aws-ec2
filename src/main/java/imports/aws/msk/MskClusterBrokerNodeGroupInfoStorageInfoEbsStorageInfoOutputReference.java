package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.827Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference")
public class MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putProvisionedThroughput(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput value) {
        software.amazon.jsii.Kernel.call(this, "putProvisionedThroughput", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetProvisionedThroughput() {
        software.amazon.jsii.Kernel.call(this, "resetProvisionedThroughput", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVolumeSize() {
        software.amazon.jsii.Kernel.call(this, "resetVolumeSize", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference getProvisionedThroughput() {
        return software.amazon.jsii.Kernel.get(this, "provisionedThroughput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput getProvisionedThroughputInput() {
        return software.amazon.jsii.Kernel.get(this, "provisionedThroughputInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getVolumeSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "volumeSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVolumeSize() {
        return software.amazon.jsii.Kernel.get(this, "volumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setVolumeSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "volumeSize", java.util.Objects.requireNonNull(value, "volumeSize is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
