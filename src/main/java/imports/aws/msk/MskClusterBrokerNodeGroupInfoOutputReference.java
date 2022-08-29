package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.961Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoOutputReference")
public class MskClusterBrokerNodeGroupInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterBrokerNodeGroupInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterBrokerNodeGroupInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterBrokerNodeGroupInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConnectivityInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo value) {
        software.amazon.jsii.Kernel.call(this, "putConnectivityInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStorageInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfo value) {
        software.amazon.jsii.Kernel.call(this, "putStorageInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAzDistribution() {
        software.amazon.jsii.Kernel.call(this, "resetAzDistribution", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectivityInfo() {
        software.amazon.jsii.Kernel.call(this, "resetConnectivityInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsVolumeSize() {
        software.amazon.jsii.Kernel.call(this, "resetEbsVolumeSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageInfo() {
        software.amazon.jsii.Kernel.call(this, "resetStorageInfo", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference getConnectivityInfo() {
        return software.amazon.jsii.Kernel.get(this, "connectivityInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoOutputReference getStorageInfo() {
        return software.amazon.jsii.Kernel.get(this, "storageInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAzDistributionInput() {
        return software.amazon.jsii.Kernel.get(this, "azDistributionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getClientSubnetsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "clientSubnetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo getConnectivityInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "connectivityInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEbsVolumeSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsVolumeSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfo getStorageInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "storageInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfo.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAzDistribution() {
        return software.amazon.jsii.Kernel.get(this, "azDistribution", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAzDistribution(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "azDistribution", java.util.Objects.requireNonNull(value, "azDistribution is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getClientSubnets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "clientSubnets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setClientSubnets(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "clientSubnets", java.util.Objects.requireNonNull(value, "clientSubnets is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEbsVolumeSize() {
        return software.amazon.jsii.Kernel.get(this, "ebsVolumeSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEbsVolumeSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ebsVolumeSize", java.util.Objects.requireNonNull(value, "ebsVolumeSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
