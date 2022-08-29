package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.412Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference")
public class S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDaysAfterInitiation() {
        software.amazon.jsii.Kernel.call(this, "resetDaysAfterInitiation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDaysAfterInitiationInput() {
        return software.amazon.jsii.Kernel.get(this, "daysAfterInitiationInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDaysAfterInitiation() {
        return software.amazon.jsii.Kernel.get(this, "daysAfterInitiation", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDaysAfterInitiation(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "daysAfterInitiation", java.util.Objects.requireNonNull(value, "daysAfterInitiation is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
