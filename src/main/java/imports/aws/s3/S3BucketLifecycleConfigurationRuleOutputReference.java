package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.413Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleConfigurationRuleOutputReference")
public class S3BucketLifecycleConfigurationRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketLifecycleConfigurationRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLifecycleConfigurationRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public S3BucketLifecycleConfigurationRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAbortIncompleteMultipartUpload(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload value) {
        software.amazon.jsii.Kernel.call(this, "putAbortIncompleteMultipartUpload", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putExpiration(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleExpiration value) {
        software.amazon.jsii.Kernel.call(this, "putExpiration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleFilter value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNoncurrentVersionExpiration(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpiration value) {
        software.amazon.jsii.Kernel.call(this, "putNoncurrentVersionExpiration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNoncurrentVersionTransition(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putNoncurrentVersionTransition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTransition(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTransition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAbortIncompleteMultipartUpload() {
        software.amazon.jsii.Kernel.call(this, "resetAbortIncompleteMultipartUpload", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExpiration() {
        software.amazon.jsii.Kernel.call(this, "resetExpiration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNoncurrentVersionExpiration() {
        software.amazon.jsii.Kernel.call(this, "resetNoncurrentVersionExpiration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNoncurrentVersionTransition() {
        software.amazon.jsii.Kernel.call(this, "resetNoncurrentVersionTransition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTransition() {
        software.amazon.jsii.Kernel.call(this, "resetTransition", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference getAbortIncompleteMultipartUpload() {
        return software.amazon.jsii.Kernel.get(this, "abortIncompleteMultipartUpload", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleExpirationOutputReference getExpiration() {
        return software.amazon.jsii.Kernel.get(this, "expiration", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleExpirationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterOutputReference getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference getNoncurrentVersionExpiration() {
        return software.amazon.jsii.Kernel.get(this, "noncurrentVersionExpiration", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpirationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionTransitionList getNoncurrentVersionTransition() {
        return software.amazon.jsii.Kernel.get(this, "noncurrentVersionTransition", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionTransitionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLifecycleConfigurationRuleTransitionList getTransition() {
        return software.amazon.jsii.Kernel.get(this, "transition", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleTransitionList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload getAbortIncompleteMultipartUploadInput() {
        return software.amazon.jsii.Kernel.get(this, "abortIncompleteMultipartUploadInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleExpiration getExpirationInput() {
        return software.amazon.jsii.Kernel.get(this, "expirationInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleExpiration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleFilter getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleFilter.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpiration getNoncurrentVersionExpirationInput() {
        return software.amazon.jsii.Kernel.get(this, "noncurrentVersionExpirationInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleConfigurationRuleNoncurrentVersionExpiration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNoncurrentVersionTransitionInput() {
        return software.amazon.jsii.Kernel.get(this, "noncurrentVersionTransitionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTransitionInput() {
        return software.amazon.jsii.Kernel.get(this, "transitionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleConfigurationRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
