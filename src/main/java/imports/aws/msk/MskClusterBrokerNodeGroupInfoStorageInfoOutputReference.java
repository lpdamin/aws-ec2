package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.962Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoOutputReference")
public class MskClusterBrokerNodeGroupInfoStorageInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterBrokerNodeGroupInfoStorageInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterBrokerNodeGroupInfoStorageInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterBrokerNodeGroupInfoStorageInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEbsStorageInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo value) {
        software.amazon.jsii.Kernel.call(this, "putEbsStorageInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEbsStorageInfo() {
        software.amazon.jsii.Kernel.call(this, "resetEbsStorageInfo", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference getEbsStorageInfo() {
        return software.amazon.jsii.Kernel.get(this, "ebsStorageInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo getEbsStorageInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsStorageInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoStorageInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
