package imports.aws.backup;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.934Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.backup.BackupPlanRuleLifecycleOutputReference")
public class BackupPlanRuleLifecycleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected BackupPlanRuleLifecycleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BackupPlanRuleLifecycleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public BackupPlanRuleLifecycleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetColdStorageAfter() {
        software.amazon.jsii.Kernel.call(this, "resetColdStorageAfter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeleteAfter() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteAfter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getColdStorageAfterInput() {
        return software.amazon.jsii.Kernel.get(this, "coldStorageAfterInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeleteAfterInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteAfterInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getColdStorageAfter() {
        return software.amazon.jsii.Kernel.get(this, "coldStorageAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setColdStorageAfter(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "coldStorageAfter", java.util.Objects.requireNonNull(value, "coldStorageAfter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeleteAfter() {
        return software.amazon.jsii.Kernel.get(this, "deleteAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeleteAfter(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deleteAfter", java.util.Objects.requireNonNull(value, "deleteAfter is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.backup.BackupPlanRuleLifecycle getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.backup.BackupPlanRuleLifecycle.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.backup.BackupPlanRuleLifecycle value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
