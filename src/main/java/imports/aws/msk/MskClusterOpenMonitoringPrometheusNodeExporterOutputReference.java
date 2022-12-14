package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.970Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterOpenMonitoringPrometheusNodeExporterOutputReference")
public class MskClusterOpenMonitoringPrometheusNodeExporterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterOpenMonitoringPrometheusNodeExporterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterOpenMonitoringPrometheusNodeExporterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterOpenMonitoringPrometheusNodeExporterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInBrokerInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInBrokerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabledInBroker() {
        return software.amazon.jsii.Kernel.get(this, "enabledInBroker", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabledInBroker(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabledInBroker", java.util.Objects.requireNonNull(value, "enabledInBroker is required"));
    }

    public void setEnabledInBroker(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabledInBroker", java.util.Objects.requireNonNull(value, "enabledInBroker is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
