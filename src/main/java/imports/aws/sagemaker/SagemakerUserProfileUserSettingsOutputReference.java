package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.532Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsOutputReference")
public class SagemakerUserProfileUserSettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerUserProfileUserSettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerUserProfileUserSettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerUserProfileUserSettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putJupyterServerAppSettings(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings value) {
        software.amazon.jsii.Kernel.call(this, "putJupyterServerAppSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKernelGatewayAppSettings(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings value) {
        software.amazon.jsii.Kernel.call(this, "putKernelGatewayAppSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSharingSettings(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings value) {
        software.amazon.jsii.Kernel.call(this, "putSharingSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTensorBoardAppSettings(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings value) {
        software.amazon.jsii.Kernel.call(this, "putTensorBoardAppSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetJupyterServerAppSettings() {
        software.amazon.jsii.Kernel.call(this, "resetJupyterServerAppSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKernelGatewayAppSettings() {
        software.amazon.jsii.Kernel.call(this, "resetKernelGatewayAppSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSharingSettings() {
        software.amazon.jsii.Kernel.call(this, "resetSharingSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTensorBoardAppSettings() {
        software.amazon.jsii.Kernel.call(this, "resetTensorBoardAppSettings", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsOutputReference getJupyterServerAppSettings() {
        return software.amazon.jsii.Kernel.get(this, "jupyterServerAppSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettingsOutputReference getKernelGatewayAppSettings() {
        return software.amazon.jsii.Kernel.get(this, "kernelGatewayAppSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettingsOutputReference getSharingSettings() {
        return software.amazon.jsii.Kernel.get(this, "sharingSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsOutputReference getTensorBoardAppSettings() {
        return software.amazon.jsii.Kernel.get(this, "tensorBoardAppSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExecutionRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings getJupyterServerAppSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "jupyterServerAppSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings getKernelGatewayAppSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "kernelGatewayAppSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings getSharingSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "sharingSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings getTensorBoardAppSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "tensorBoardAppSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRole() {
        return software.amazon.jsii.Kernel.get(this, "executionRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExecutionRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "executionRole", java.util.Objects.requireNonNull(value, "executionRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
