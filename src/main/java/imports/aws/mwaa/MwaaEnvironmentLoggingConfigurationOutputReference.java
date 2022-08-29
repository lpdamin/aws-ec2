package imports.aws.mwaa;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.994Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.mwaa.MwaaEnvironmentLoggingConfigurationOutputReference")
public class MwaaEnvironmentLoggingConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MwaaEnvironmentLoggingConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MwaaEnvironmentLoggingConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MwaaEnvironmentLoggingConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDagProcessingLogs(final @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs value) {
        software.amazon.jsii.Kernel.call(this, "putDagProcessingLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSchedulerLogs(final @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs value) {
        software.amazon.jsii.Kernel.call(this, "putSchedulerLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTaskLogs(final @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs value) {
        software.amazon.jsii.Kernel.call(this, "putTaskLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWebserverLogs(final @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs value) {
        software.amazon.jsii.Kernel.call(this, "putWebserverLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWorkerLogs(final @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs value) {
        software.amazon.jsii.Kernel.call(this, "putWorkerLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDagProcessingLogs() {
        software.amazon.jsii.Kernel.call(this, "resetDagProcessingLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedulerLogs() {
        software.amazon.jsii.Kernel.call(this, "resetSchedulerLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTaskLogs() {
        software.amazon.jsii.Kernel.call(this, "resetTaskLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebserverLogs() {
        software.amazon.jsii.Kernel.call(this, "resetWebserverLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkerLogs() {
        software.amazon.jsii.Kernel.call(this, "resetWorkerLogs", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogsOutputReference getDagProcessingLogs() {
        return software.amazon.jsii.Kernel.get(this, "dagProcessingLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogsOutputReference getSchedulerLogs() {
        return software.amazon.jsii.Kernel.get(this, "schedulerLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogsOutputReference getTaskLogs() {
        return software.amazon.jsii.Kernel.get(this, "taskLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogsOutputReference getWebserverLogs() {
        return software.amazon.jsii.Kernel.get(this, "webserverLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogsOutputReference getWorkerLogs() {
        return software.amazon.jsii.Kernel.get(this, "workerLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs getDagProcessingLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "dagProcessingLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs getSchedulerLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "schedulerLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs getTaskLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "taskLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs getWebserverLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "webserverLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs getWorkerLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "workerLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
