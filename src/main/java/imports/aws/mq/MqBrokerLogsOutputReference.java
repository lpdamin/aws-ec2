package imports.aws.mq;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.940Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.mq.MqBrokerLogsOutputReference")
public class MqBrokerLogsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MqBrokerLogsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MqBrokerLogsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MqBrokerLogsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAudit() {
        software.amazon.jsii.Kernel.call(this, "resetAudit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGeneral() {
        software.amazon.jsii.Kernel.call(this, "resetGeneral", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuditInput() {
        return software.amazon.jsii.Kernel.get(this, "auditInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGeneralInput() {
        return software.amazon.jsii.Kernel.get(this, "generalInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAudit() {
        return software.amazon.jsii.Kernel.get(this, "audit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAudit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "audit", java.util.Objects.requireNonNull(value, "audit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getGeneral() {
        return software.amazon.jsii.Kernel.get(this, "general", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setGeneral(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "general", java.util.Objects.requireNonNull(value, "general is required"));
    }

    public void setGeneral(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "general", java.util.Objects.requireNonNull(value, "general is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerLogs getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerLogs.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerLogs value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
