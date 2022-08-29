package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.250Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectQueueOutboundCallerConfigOutputReference")
public class ConnectQueueOutboundCallerConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ConnectQueueOutboundCallerConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConnectQueueOutboundCallerConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ConnectQueueOutboundCallerConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetOutboundCallerIdName() {
        software.amazon.jsii.Kernel.call(this, "resetOutboundCallerIdName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutboundCallerIdNumberId() {
        software.amazon.jsii.Kernel.call(this, "resetOutboundCallerIdNumberId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutboundFlowId() {
        software.amazon.jsii.Kernel.call(this, "resetOutboundFlowId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutboundCallerIdNameInput() {
        return software.amazon.jsii.Kernel.get(this, "outboundCallerIdNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutboundCallerIdNumberIdInput() {
        return software.amazon.jsii.Kernel.get(this, "outboundCallerIdNumberIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutboundFlowIdInput() {
        return software.amazon.jsii.Kernel.get(this, "outboundFlowIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutboundCallerIdName() {
        return software.amazon.jsii.Kernel.get(this, "outboundCallerIdName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutboundCallerIdName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outboundCallerIdName", java.util.Objects.requireNonNull(value, "outboundCallerIdName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutboundCallerIdNumberId() {
        return software.amazon.jsii.Kernel.get(this, "outboundCallerIdNumberId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutboundCallerIdNumberId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outboundCallerIdNumberId", java.util.Objects.requireNonNull(value, "outboundCallerIdNumberId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutboundFlowId() {
        return software.amazon.jsii.Kernel.get(this, "outboundFlowId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutboundFlowId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outboundFlowId", java.util.Objects.requireNonNull(value, "outboundFlowId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectQueueOutboundCallerConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectQueueOutboundCallerConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectQueueOutboundCallerConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
