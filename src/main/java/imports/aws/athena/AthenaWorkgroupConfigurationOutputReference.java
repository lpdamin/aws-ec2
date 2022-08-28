package imports.aws.athena;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.810Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.athena.AthenaWorkgroupConfigurationOutputReference")
public class AthenaWorkgroupConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AthenaWorkgroupConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AthenaWorkgroupConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AthenaWorkgroupConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEngineVersion(final @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationEngineVersion value) {
        software.amazon.jsii.Kernel.call(this, "putEngineVersion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResultConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationResultConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putResultConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBytesScannedCutoffPerQuery() {
        software.amazon.jsii.Kernel.call(this, "resetBytesScannedCutoffPerQuery", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnforceWorkgroupConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEnforceWorkgroupConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEngineVersion() {
        software.amazon.jsii.Kernel.call(this, "resetEngineVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublishCloudwatchMetricsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetPublishCloudwatchMetricsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequesterPaysEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetRequesterPaysEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResultConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetResultConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationEngineVersionOutputReference getEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationEngineVersionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationOutputReference getResultConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "resultConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBytesScannedCutoffPerQueryInput() {
        return software.amazon.jsii.Kernel.get(this, "bytesScannedCutoffPerQueryInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnforceWorkgroupConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "enforceWorkgroupConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationEngineVersion getEngineVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "engineVersionInput", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationEngineVersion.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPublishCloudwatchMetricsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "publishCloudwatchMetricsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRequesterPaysEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "requesterPaysEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationResultConfiguration getResultConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "resultConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfiguration.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBytesScannedCutoffPerQuery() {
        return software.amazon.jsii.Kernel.get(this, "bytesScannedCutoffPerQuery", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBytesScannedCutoffPerQuery(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "bytesScannedCutoffPerQuery", java.util.Objects.requireNonNull(value, "bytesScannedCutoffPerQuery is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnforceWorkgroupConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "enforceWorkgroupConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnforceWorkgroupConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enforceWorkgroupConfiguration", java.util.Objects.requireNonNull(value, "enforceWorkgroupConfiguration is required"));
    }

    public void setEnforceWorkgroupConfiguration(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enforceWorkgroupConfiguration", java.util.Objects.requireNonNull(value, "enforceWorkgroupConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPublishCloudwatchMetricsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "publishCloudwatchMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPublishCloudwatchMetricsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publishCloudwatchMetricsEnabled", java.util.Objects.requireNonNull(value, "publishCloudwatchMetricsEnabled is required"));
    }

    public void setPublishCloudwatchMetricsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "publishCloudwatchMetricsEnabled", java.util.Objects.requireNonNull(value, "publishCloudwatchMetricsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRequesterPaysEnabled() {
        return software.amazon.jsii.Kernel.get(this, "requesterPaysEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRequesterPaysEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requesterPaysEnabled", java.util.Objects.requireNonNull(value, "requesterPaysEnabled is required"));
    }

    public void setRequesterPaysEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "requesterPaysEnabled", java.util.Objects.requireNonNull(value, "requesterPaysEnabled is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
