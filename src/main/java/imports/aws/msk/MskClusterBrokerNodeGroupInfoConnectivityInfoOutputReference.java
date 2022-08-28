package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.827Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference")
public class MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterBrokerNodeGroupInfoConnectivityInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPublicAccess(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess value) {
        software.amazon.jsii.Kernel.call(this, "putPublicAccess", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPublicAccess() {
        software.amazon.jsii.Kernel.call(this, "resetPublicAccess", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessOutputReference getPublicAccess() {
        return software.amazon.jsii.Kernel.get(this, "publicAccess", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess getPublicAccessInput() {
        return software.amazon.jsii.Kernel.get(this, "publicAccessInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
