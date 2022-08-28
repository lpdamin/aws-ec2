package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.837Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterEncryptionInfoEncryptionInTransitOutputReference")
public class MskClusterEncryptionInfoEncryptionInTransitOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterEncryptionInfoEncryptionInTransitOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterEncryptionInfoEncryptionInTransitOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterEncryptionInfoEncryptionInTransitOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetClientBroker() {
        software.amazon.jsii.Kernel.call(this, "resetClientBroker", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInCluster() {
        software.amazon.jsii.Kernel.call(this, "resetInCluster", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientBrokerInput() {
        return software.amazon.jsii.Kernel.get(this, "clientBrokerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "inClusterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientBroker() {
        return software.amazon.jsii.Kernel.get(this, "clientBroker", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientBroker(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientBroker", java.util.Objects.requireNonNull(value, "clientBroker is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getInCluster() {
        return software.amazon.jsii.Kernel.get(this, "inCluster", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInCluster(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "inCluster", java.util.Objects.requireNonNull(value, "inCluster is required"));
    }

    public void setInCluster(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "inCluster", java.util.Objects.requireNonNull(value, "inCluster is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterEncryptionInfoEncryptionInTransit getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterEncryptionInfoEncryptionInTransit.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterEncryptionInfoEncryptionInTransit value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
