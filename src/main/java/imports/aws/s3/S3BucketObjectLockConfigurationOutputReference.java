package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.432Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketObjectLockConfigurationOutputReference")
public class S3BucketObjectLockConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketObjectLockConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketObjectLockConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketObjectLockConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRule(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationRule value) {
        software.amazon.jsii.Kernel.call(this, "putRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetObjectLockEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetObjectLockEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRule() {
        software.amazon.jsii.Kernel.call(this, "resetRule", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationRuleOutputReference getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRuleOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectLockEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "objectLockEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfigurationRule getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRule.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockEnabled() {
        return software.amazon.jsii.Kernel.get(this, "objectLockEnabled", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectLockEnabled(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectLockEnabled", java.util.Objects.requireNonNull(value, "objectLockEnabled is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
