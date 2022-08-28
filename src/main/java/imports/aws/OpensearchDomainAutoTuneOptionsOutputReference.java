package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.903Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.OpensearchDomainAutoTuneOptionsOutputReference")
public class OpensearchDomainAutoTuneOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected OpensearchDomainAutoTuneOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpensearchDomainAutoTuneOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public OpensearchDomainAutoTuneOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMaintenanceSchedule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMaintenanceSchedule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMaintenanceSchedule() {
        software.amazon.jsii.Kernel.call(this, "resetMaintenanceSchedule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRollbackOnDisable() {
        software.amazon.jsii.Kernel.call(this, "resetRollbackOnDisable", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.OpensearchDomainAutoTuneOptionsMaintenanceScheduleList getMaintenanceSchedule() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceSchedule", software.amazon.jsii.NativeType.forClass(imports.aws.OpensearchDomainAutoTuneOptionsMaintenanceScheduleList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDesiredStateInput() {
        return software.amazon.jsii.Kernel.get(this, "desiredStateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMaintenanceScheduleInput() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceScheduleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRollbackOnDisableInput() {
        return software.amazon.jsii.Kernel.get(this, "rollbackOnDisableInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDesiredState() {
        return software.amazon.jsii.Kernel.get(this, "desiredState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDesiredState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "desiredState", java.util.Objects.requireNonNull(value, "desiredState is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRollbackOnDisable() {
        return software.amazon.jsii.Kernel.get(this, "rollbackOnDisable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRollbackOnDisable(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rollbackOnDisable", java.util.Objects.requireNonNull(value, "rollbackOnDisable is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.OpensearchDomainAutoTuneOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.OpensearchDomainAutoTuneOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.OpensearchDomainAutoTuneOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
