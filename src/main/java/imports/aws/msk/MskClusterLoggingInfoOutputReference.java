package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.842Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterLoggingInfoOutputReference")
public class MskClusterLoggingInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterLoggingInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterLoggingInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterLoggingInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBrokerLogs(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterLoggingInfoBrokerLogs value) {
        software.amazon.jsii.Kernel.call(this, "putBrokerLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterLoggingInfoBrokerLogsOutputReference getBrokerLogs() {
        return software.amazon.jsii.Kernel.get(this, "brokerLogs", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterLoggingInfoBrokerLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterLoggingInfoBrokerLogs getBrokerLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "brokerLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterLoggingInfoBrokerLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterLoggingInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterLoggingInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterLoggingInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
