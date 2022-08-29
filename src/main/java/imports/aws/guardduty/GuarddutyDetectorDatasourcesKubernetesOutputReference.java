package imports.aws.guardduty;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.294Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.guardduty.GuarddutyDetectorDatasourcesKubernetesOutputReference")
public class GuarddutyDetectorDatasourcesKubernetesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GuarddutyDetectorDatasourcesKubernetesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GuarddutyDetectorDatasourcesKubernetesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GuarddutyDetectorDatasourcesKubernetesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAuditLogs(final @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetesAuditLogs value) {
        software.amazon.jsii.Kernel.call(this, "putAuditLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetesAuditLogsOutputReference getAuditLogs() {
        return software.amazon.jsii.Kernel.get(this, "auditLogs", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetesAuditLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetesAuditLogs getAuditLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "auditLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetesAuditLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetes getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetes.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyDetectorDatasourcesKubernetes value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
