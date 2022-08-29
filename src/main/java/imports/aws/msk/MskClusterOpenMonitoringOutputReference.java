package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.968Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterOpenMonitoringOutputReference")
public class MskClusterOpenMonitoringOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterOpenMonitoringOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterOpenMonitoringOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterOpenMonitoringOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPrometheus(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringPrometheus value) {
        software.amazon.jsii.Kernel.call(this, "putPrometheus", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringPrometheusOutputReference getPrometheus() {
        return software.amazon.jsii.Kernel.get(this, "prometheus", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheusOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoringPrometheus getPrometheusInput() {
        return software.amazon.jsii.Kernel.get(this, "prometheusInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringPrometheus.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoring getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoring.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoring value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
