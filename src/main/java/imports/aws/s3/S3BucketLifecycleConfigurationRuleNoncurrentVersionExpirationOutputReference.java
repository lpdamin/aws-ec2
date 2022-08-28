package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.406Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference")
public class S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetNewerNoncurrentVersions() {
        software.amazon.jsii.Kernel.call(this, "resetNewerNoncurrentVersions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNoncurrentDays() {
        software.amazon.jsii.Kernel.call(this, "resetNoncurrentDays", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNewerNoncurrentVersionsInput() {
        return software.amazon.jsii.Kernel.get(this, "newerNoncurrentVersionsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNoncurrentDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "noncurrentDaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNewerNoncurrentVersions() {
        return software.amazon.jsii.Kernel.get(this, "newerNoncurrentVersions", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNewerNoncurrentVersions(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "newerNoncurrentVersions", java.util.Objects.requireNonNull(value, "newerNoncurrentVersions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNoncurrentDays() {
        return software.amazon.jsii.Kernel.get(this, "noncurrentDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNoncurrentDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "noncurrentDays", java.util.Objects.requireNonNull(value, "noncurrentDays is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpiration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpiration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpiration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
