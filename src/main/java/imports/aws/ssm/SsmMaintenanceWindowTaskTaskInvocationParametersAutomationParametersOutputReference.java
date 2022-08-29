package imports.aws.ssm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.760Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersOutputReference")
public class SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putParameter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putParameter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDocumentVersion() {
        software.amazon.jsii.Kernel.call(this, "resetDocumentVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameter() {
        software.amazon.jsii.Kernel.call(this, "resetParameter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterList getParameter() {
        return software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.forClass(imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDocumentVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "documentVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParameterInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentVersion() {
        return software.amazon.jsii.Kernel.get(this, "documentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDocumentVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "documentVersion", java.util.Objects.requireNonNull(value, "documentVersion is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ssm.SsmMaintenanceWindowTaskTaskInvocationParametersAutomationParameters value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
