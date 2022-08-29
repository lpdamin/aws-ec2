package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.412Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleFilterOutputReference")
public class S3BucketLifecycleConfigurationRuleFilterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketLifecycleConfigurationRuleFilterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLifecycleConfigurationRuleFilterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketLifecycleConfigurationRuleFilterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAnd(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd value) {
        software.amazon.jsii.Kernel.call(this, "putAnd", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTag(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag value) {
        software.amazon.jsii.Kernel.call(this, "putTag", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAnd() {
        software.amazon.jsii.Kernel.call(this, "resetAnd", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectSizeGreaterThan() {
        software.amazon.jsii.Kernel.call(this, "resetObjectSizeGreaterThan", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectSizeLessThan() {
        software.amazon.jsii.Kernel.call(this, "resetObjectSizeLessThan", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTag() {
        software.amazon.jsii.Kernel.call(this, "resetTag", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAndOutputReference getAnd() {
        return software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAndOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTagOutputReference getTag() {
        return software.amazon.jsii.Kernel.get(this, "tag", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTagOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd getAndInput() {
        return software.amazon.jsii.Kernel.get(this, "andInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterAnd.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectSizeGreaterThanInput() {
        return software.amazon.jsii.Kernel.get(this, "objectSizeGreaterThanInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectSizeLessThanInput() {
        return software.amazon.jsii.Kernel.get(this, "objectSizeLessThanInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag getTagInput() {
        return software.amazon.jsii.Kernel.get(this, "tagInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterTag.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectSizeGreaterThan() {
        return software.amazon.jsii.Kernel.get(this, "objectSizeGreaterThan", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectSizeGreaterThan(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectSizeGreaterThan", java.util.Objects.requireNonNull(value, "objectSizeGreaterThan is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectSizeLessThan() {
        return software.amazon.jsii.Kernel.get(this, "objectSizeLessThan", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectSizeLessThan(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectSizeLessThan", java.util.Objects.requireNonNull(value, "objectSizeLessThan is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilter getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilter.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilter value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
