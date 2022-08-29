package imports.aws.backup;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.850Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.backup.BackupReportPlanReportSettingOutputReference")
public class BackupReportPlanReportSettingOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected BackupReportPlanReportSettingOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BackupReportPlanReportSettingOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public BackupReportPlanReportSettingOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFrameworkArns() {
        software.amazon.jsii.Kernel.call(this, "resetFrameworkArns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNumberOfFrameworks() {
        software.amazon.jsii.Kernel.call(this, "resetNumberOfFrameworks", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFrameworkArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "frameworkArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfFrameworksInput() {
        return software.amazon.jsii.Kernel.get(this, "numberOfFrameworksInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReportTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "reportTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getFrameworkArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "frameworkArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setFrameworkArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "frameworkArns", java.util.Objects.requireNonNull(value, "frameworkArns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfFrameworks() {
        return software.amazon.jsii.Kernel.get(this, "numberOfFrameworks", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfFrameworks(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfFrameworks", java.util.Objects.requireNonNull(value, "numberOfFrameworks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReportTemplate() {
        return software.amazon.jsii.Kernel.get(this, "reportTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReportTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reportTemplate", java.util.Objects.requireNonNull(value, "reportTemplate is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.backup.BackupReportPlanReportSetting getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.backup.BackupReportPlanReportSetting.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.backup.BackupReportPlanReportSetting value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
