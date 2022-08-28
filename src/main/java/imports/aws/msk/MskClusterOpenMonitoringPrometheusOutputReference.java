package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.845Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterOpenMonitoringPrometheusOutputReference")
public class MskClusterOpenMonitoringPrometheusOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterOpenMonitoringPrometheusOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterOpenMonitoringPrometheusOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterOpenMonitoringPrometheusOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putJmxExporter(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringPrometheusJmxExporter value) {
        software.amazon.jsii.Kernel.call(this, "putJmxExporter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNodeExporter(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter value) {
        software.amazon.jsii.Kernel.call(this, "putNodeExporter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetJmxExporter() {
        software.amazon.jsii.Kernel.call(this, "resetJmxExporter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeExporter() {
        software.amazon.jsii.Kernel.call(this, "resetNodeExporter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringPrometheusJmxExporterOutputReference getJmxExporter() {
        return software.amazon.jsii.Kernel.get(this, "jmxExporter", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheusJmxExporterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporterOutputReference getNodeExporter() {
        return software.amazon.jsii.Kernel.get(this, "nodeExporter", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporterOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheusJmxExporter getJmxExporterInput() {
        return software.amazon.jsii.Kernel.get(this, "jmxExporterInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheusJmxExporter.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter getNodeExporterInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeExporterInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheusNodeExporter.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheus getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheus.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheus value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
