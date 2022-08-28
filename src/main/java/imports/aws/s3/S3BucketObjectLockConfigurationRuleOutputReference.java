package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.430Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketObjectLockConfigurationRuleOutputReference")
public class S3BucketObjectLockConfigurationRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketObjectLockConfigurationRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketObjectLockConfigurationRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketObjectLockConfigurationRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDefaultRetention(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationRuleDefaultRetention value) {
        software.amazon.jsii.Kernel.call(this, "putDefaultRetention", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationRuleDefaultRetentionOutputReference getDefaultRetention() {
        return software.amazon.jsii.Kernel.get(this, "defaultRetention", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRuleDefaultRetentionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfigurationRuleDefaultRetention getDefaultRetentionInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultRetentionInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRuleDefaultRetention.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfigurationRule getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRule.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfigurationRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
