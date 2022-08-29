package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.440Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketReplicationConfigurationRuleDeleteMarkerReplicationOutputReference")
public class S3BucketReplicationConfigurationRuleDeleteMarkerReplicationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketReplicationConfigurationRuleDeleteMarkerReplicationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketReplicationConfigurationRuleDeleteMarkerReplicationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketReplicationConfigurationRuleDeleteMarkerReplicationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleDeleteMarkerReplication getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleDeleteMarkerReplication.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleDeleteMarkerReplication value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
