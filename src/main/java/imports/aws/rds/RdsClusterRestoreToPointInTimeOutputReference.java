package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.271Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.RdsClusterRestoreToPointInTimeOutputReference")
public class RdsClusterRestoreToPointInTimeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RdsClusterRestoreToPointInTimeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RdsClusterRestoreToPointInTimeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RdsClusterRestoreToPointInTimeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetRestoreToTime() {
        software.amazon.jsii.Kernel.call(this, "resetRestoreToTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestoreType() {
        software.amazon.jsii.Kernel.call(this, "resetRestoreType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseLatestRestorableTime() {
        software.amazon.jsii.Kernel.call(this, "resetUseLatestRestorableTime", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestoreToTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "restoreToTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestoreTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "restoreTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceClusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseLatestRestorableTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "useLatestRestorableTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestoreToTime() {
        return software.amazon.jsii.Kernel.get(this, "restoreToTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestoreToTime(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restoreToTime", java.util.Objects.requireNonNull(value, "restoreToTime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestoreType() {
        return software.amazon.jsii.Kernel.get(this, "restoreType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestoreType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restoreType", java.util.Objects.requireNonNull(value, "restoreType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "sourceClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceClusterIdentifier", java.util.Objects.requireNonNull(value, "sourceClusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getUseLatestRestorableTime() {
        return software.amazon.jsii.Kernel.get(this, "useLatestRestorableTime", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseLatestRestorableTime(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useLatestRestorableTime", java.util.Objects.requireNonNull(value, "useLatestRestorableTime is required"));
    }

    public void setUseLatestRestorableTime(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useLatestRestorableTime", java.util.Objects.requireNonNull(value, "useLatestRestorableTime is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.rds.RdsClusterRestoreToPointInTime getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.rds.RdsClusterRestoreToPointInTime.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.rds.RdsClusterRestoreToPointInTime value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
