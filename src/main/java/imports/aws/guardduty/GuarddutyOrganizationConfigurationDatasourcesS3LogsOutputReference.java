package imports.aws.guardduty;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.310Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesS3LogsOutputReference")
public class GuarddutyOrganizationConfigurationDatasourcesS3LogsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GuarddutyOrganizationConfigurationDatasourcesS3LogsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GuarddutyOrganizationConfigurationDatasourcesS3LogsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GuarddutyOrganizationConfigurationDatasourcesS3LogsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoEnableInput() {
        return software.amazon.jsii.Kernel.get(this, "autoEnableInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoEnable() {
        return software.amazon.jsii.Kernel.get(this, "autoEnable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoEnable(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoEnable", java.util.Objects.requireNonNull(value, "autoEnable is required"));
    }

    public void setAutoEnable(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoEnable", java.util.Objects.requireNonNull(value, "autoEnable is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesS3Logs getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesS3Logs.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesS3Logs value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
