package imports.aws.redshift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.297Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.RedshiftScheduledActionTargetActionResumeClusterOutputReference")
public class RedshiftScheduledActionTargetActionResumeClusterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RedshiftScheduledActionTargetActionResumeClusterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RedshiftScheduledActionTargetActionResumeClusterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RedshiftScheduledActionTargetActionResumeClusterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterIdentifier", java.util.Objects.requireNonNull(value, "clusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
