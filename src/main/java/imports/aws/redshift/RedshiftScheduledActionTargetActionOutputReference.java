package imports.aws.redshift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.297Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.RedshiftScheduledActionTargetActionOutputReference")
public class RedshiftScheduledActionTargetActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RedshiftScheduledActionTargetActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RedshiftScheduledActionTargetActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RedshiftScheduledActionTargetActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPauseCluster(final @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster value) {
        software.amazon.jsii.Kernel.call(this, "putPauseCluster", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResizeCluster(final @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster value) {
        software.amazon.jsii.Kernel.call(this, "putResizeCluster", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResumeCluster(final @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster value) {
        software.amazon.jsii.Kernel.call(this, "putResumeCluster", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPauseCluster() {
        software.amazon.jsii.Kernel.call(this, "resetPauseCluster", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResizeCluster() {
        software.amazon.jsii.Kernel.call(this, "resetResizeCluster", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResumeCluster() {
        software.amazon.jsii.Kernel.call(this, "resetResumeCluster", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftScheduledActionTargetActionPauseClusterOutputReference getPauseCluster() {
        return software.amazon.jsii.Kernel.get(this, "pauseCluster", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionPauseClusterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftScheduledActionTargetActionResizeClusterOutputReference getResizeCluster() {
        return software.amazon.jsii.Kernel.get(this, "resizeCluster", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResizeClusterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftScheduledActionTargetActionResumeClusterOutputReference getResumeCluster() {
        return software.amazon.jsii.Kernel.get(this, "resumeCluster", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResumeClusterOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster getPauseClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "pauseClusterInput", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster getResizeClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "resizeClusterInput", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster getResumeClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "resumeClusterInput", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
