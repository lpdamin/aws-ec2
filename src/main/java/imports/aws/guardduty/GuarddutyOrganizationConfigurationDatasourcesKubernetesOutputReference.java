package imports.aws.guardduty;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.416Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesOutputReference")
public class GuarddutyOrganizationConfigurationDatasourcesKubernetesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GuarddutyOrganizationConfigurationDatasourcesKubernetesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GuarddutyOrganizationConfigurationDatasourcesKubernetesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GuarddutyOrganizationConfigurationDatasourcesKubernetesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAuditLogs(final @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs value) {
        software.amazon.jsii.Kernel.call(this, "putAuditLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogsOutputReference getAuditLogs() {
        return software.amazon.jsii.Kernel.get(this, "auditLogs", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs getAuditLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "auditLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetes getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetes.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetes value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
