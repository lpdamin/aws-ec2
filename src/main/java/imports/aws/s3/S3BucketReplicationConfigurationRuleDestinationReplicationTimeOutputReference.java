package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.441Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTimeOutputReference")
public class S3BucketReplicationConfigurationRuleDestinationReplicationTimeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketReplicationConfigurationRuleDestinationReplicationTimeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketReplicationConfigurationRuleDestinationReplicationTimeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketReplicationConfigurationRuleDestinationReplicationTimeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTime(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTimeTime value) {
        software.amazon.jsii.Kernel.call(this, "putTime", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTimeTimeOutputReference getTime() {
        return software.amazon.jsii.Kernel.get(this, "time", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTimeTimeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTimeTime getTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "timeInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTimeTime.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTime getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTime.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleDestinationReplicationTime value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
