package imports.aws.s3;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/s3_object aws_s3_object}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.485Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3Object")
public class S3Object extends com.hashicorp.cdktf.TerraformResource {

    protected S3Object(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3Object(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.s3.S3Object.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/s3_object aws_s3_object} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public S3Object(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.s3.S3ObjectConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAcl() {
        software.amazon.jsii.Kernel.call(this, "resetAcl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBucketKeyEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetBucketKeyEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCacheControl() {
        software.amazon.jsii.Kernel.call(this, "resetCacheControl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContent() {
        software.amazon.jsii.Kernel.call(this, "resetContent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentBase64() {
        software.amazon.jsii.Kernel.call(this, "resetContentBase64", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentDisposition() {
        software.amazon.jsii.Kernel.call(this, "resetContentDisposition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentEncoding() {
        software.amazon.jsii.Kernel.call(this, "resetContentEncoding", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentLanguage() {
        software.amazon.jsii.Kernel.call(this, "resetContentLanguage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentType() {
        software.amazon.jsii.Kernel.call(this, "resetContentType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEtag() {
        software.amazon.jsii.Kernel.call(this, "resetEtag", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceDestroy() {
        software.amazon.jsii.Kernel.call(this, "resetForceDestroy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetadata() {
        software.amazon.jsii.Kernel.call(this, "resetMetadata", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectLockLegalHoldStatus() {
        software.amazon.jsii.Kernel.call(this, "resetObjectLockLegalHoldStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectLockMode() {
        software.amazon.jsii.Kernel.call(this, "resetObjectLockMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectLockRetainUntilDate() {
        software.amazon.jsii.Kernel.call(this, "resetObjectLockRetainUntilDate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryption() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSource() {
        software.amazon.jsii.Kernel.call(this, "resetSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceHash() {
        software.amazon.jsii.Kernel.call(this, "resetSourceHash", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageClass() {
        software.amazon.jsii.Kernel.call(this, "resetStorageClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebsiteRedirect() {
        software.amazon.jsii.Kernel.call(this, "resetWebsiteRedirect", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionId() {
        return software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAclInput() {
        return software.amazon.jsii.Kernel.get(this, "aclInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBucketKeyEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketKeyEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCacheControlInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheControlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentBase64Input() {
        return software.amazon.jsii.Kernel.get(this, "contentBase64Input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentDispositionInput() {
        return software.amazon.jsii.Kernel.get(this, "contentDispositionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentEncodingInput() {
        return software.amazon.jsii.Kernel.get(this, "contentEncodingInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentInput() {
        return software.amazon.jsii.Kernel.get(this, "contentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentLanguageInput() {
        return software.amazon.jsii.Kernel.get(this, "contentLanguageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEtagInput() {
        return software.amazon.jsii.Kernel.get(this, "etagInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForceDestroyInput() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "keyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMetadataInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "metadataInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectLockLegalHoldStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "objectLockLegalHoldStatusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectLockModeInput() {
        return software.amazon.jsii.Kernel.get(this, "objectLockModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectLockRetainUntilDateInput() {
        return software.amazon.jsii.Kernel.get(this, "objectLockRetainUntilDateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServerSideEncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceHashInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceHashInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageClassInput() {
        return software.amazon.jsii.Kernel.get(this, "storageClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWebsiteRedirectInput() {
        return software.amazon.jsii.Kernel.get(this, "websiteRedirectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcl() {
        return software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acl", java.util.Objects.requireNonNull(value, "acl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getBucketKeyEnabled() {
        return software.amazon.jsii.Kernel.get(this, "bucketKeyEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setBucketKeyEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "bucketKeyEnabled", java.util.Objects.requireNonNull(value, "bucketKeyEnabled is required"));
    }

    public void setBucketKeyEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "bucketKeyEnabled", java.util.Objects.requireNonNull(value, "bucketKeyEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCacheControl() {
        return software.amazon.jsii.Kernel.get(this, "cacheControl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCacheControl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cacheControl", java.util.Objects.requireNonNull(value, "cacheControl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContent() {
        return software.amazon.jsii.Kernel.get(this, "content", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContent(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "content", java.util.Objects.requireNonNull(value, "content is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentBase64() {
        return software.amazon.jsii.Kernel.get(this, "contentBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentBase64(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentBase64", java.util.Objects.requireNonNull(value, "contentBase64 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentDisposition() {
        return software.amazon.jsii.Kernel.get(this, "contentDisposition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentDisposition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentDisposition", java.util.Objects.requireNonNull(value, "contentDisposition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentEncoding() {
        return software.amazon.jsii.Kernel.get(this, "contentEncoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentEncoding(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentEncoding", java.util.Objects.requireNonNull(value, "contentEncoding is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentLanguage() {
        return software.amazon.jsii.Kernel.get(this, "contentLanguage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentLanguage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentLanguage", java.util.Objects.requireNonNull(value, "contentLanguage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentType() {
        return software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContentType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "contentType", java.util.Objects.requireNonNull(value, "contentType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEtag() {
        return software.amazon.jsii.Kernel.get(this, "etag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEtag(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "etag", java.util.Objects.requireNonNull(value, "etag is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForceDestroy() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", java.util.Objects.requireNonNull(value, "forceDestroy is required"));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", java.util.Objects.requireNonNull(value, "forceDestroy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKey() {
        return software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "key", java.util.Objects.requireNonNull(value, "key is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMetadata(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "metadata", java.util.Objects.requireNonNull(value, "metadata is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockLegalHoldStatus() {
        return software.amazon.jsii.Kernel.get(this, "objectLockLegalHoldStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectLockLegalHoldStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectLockLegalHoldStatus", java.util.Objects.requireNonNull(value, "objectLockLegalHoldStatus is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockMode() {
        return software.amazon.jsii.Kernel.get(this, "objectLockMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectLockMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectLockMode", java.util.Objects.requireNonNull(value, "objectLockMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockRetainUntilDate() {
        return software.amazon.jsii.Kernel.get(this, "objectLockRetainUntilDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectLockRetainUntilDate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectLockRetainUntilDate", java.util.Objects.requireNonNull(value, "objectLockRetainUntilDate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerSideEncryption() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServerSideEncryption(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serverSideEncryption", java.util.Objects.requireNonNull(value, "serverSideEncryption is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSource() {
        return software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSource(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "source", java.util.Objects.requireNonNull(value, "source is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceHash() {
        return software.amazon.jsii.Kernel.get(this, "sourceHash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceHash(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceHash", java.util.Objects.requireNonNull(value, "sourceHash is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageClass", java.util.Objects.requireNonNull(value, "storageClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebsiteRedirect() {
        return software.amazon.jsii.Kernel.get(this, "websiteRedirect", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWebsiteRedirect(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "websiteRedirect", java.util.Objects.requireNonNull(value, "websiteRedirect is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.s3.S3Object}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.s3.S3Object> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.s3.S3ObjectConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.s3.S3ObjectConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#bucket S3Object#bucket}.
         * <p>
         * @return {@code this}
         * @param bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#bucket S3Object#bucket}. This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#key S3Object#key}.
         * <p>
         * @return {@code this}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#key S3Object#key}. This parameter is required.
         */
        public Builder key(final java.lang.String key) {
            this.config.key(key);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#acl S3Object#acl}.
         * <p>
         * @return {@code this}
         * @param acl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#acl S3Object#acl}. This parameter is required.
         */
        public Builder acl(final java.lang.String acl) {
            this.config.acl(acl);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#bucket_key_enabled S3Object#bucket_key_enabled}.
         * <p>
         * @return {@code this}
         * @param bucketKeyEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#bucket_key_enabled S3Object#bucket_key_enabled}. This parameter is required.
         */
        public Builder bucketKeyEnabled(final java.lang.Boolean bucketKeyEnabled) {
            this.config.bucketKeyEnabled(bucketKeyEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#bucket_key_enabled S3Object#bucket_key_enabled}.
         * <p>
         * @return {@code this}
         * @param bucketKeyEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#bucket_key_enabled S3Object#bucket_key_enabled}. This parameter is required.
         */
        public Builder bucketKeyEnabled(final com.hashicorp.cdktf.IResolvable bucketKeyEnabled) {
            this.config.bucketKeyEnabled(bucketKeyEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#cache_control S3Object#cache_control}.
         * <p>
         * @return {@code this}
         * @param cacheControl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#cache_control S3Object#cache_control}. This parameter is required.
         */
        public Builder cacheControl(final java.lang.String cacheControl) {
            this.config.cacheControl(cacheControl);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content S3Object#content}.
         * <p>
         * @return {@code this}
         * @param content Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content S3Object#content}. This parameter is required.
         */
        public Builder content(final java.lang.String content) {
            this.config.content(content);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_base64 S3Object#content_base64}.
         * <p>
         * @return {@code this}
         * @param contentBase64 Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_base64 S3Object#content_base64}. This parameter is required.
         */
        public Builder contentBase64(final java.lang.String contentBase64) {
            this.config.contentBase64(contentBase64);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_disposition S3Object#content_disposition}.
         * <p>
         * @return {@code this}
         * @param contentDisposition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_disposition S3Object#content_disposition}. This parameter is required.
         */
        public Builder contentDisposition(final java.lang.String contentDisposition) {
            this.config.contentDisposition(contentDisposition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_encoding S3Object#content_encoding}.
         * <p>
         * @return {@code this}
         * @param contentEncoding Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_encoding S3Object#content_encoding}. This parameter is required.
         */
        public Builder contentEncoding(final java.lang.String contentEncoding) {
            this.config.contentEncoding(contentEncoding);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_language S3Object#content_language}.
         * <p>
         * @return {@code this}
         * @param contentLanguage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_language S3Object#content_language}. This parameter is required.
         */
        public Builder contentLanguage(final java.lang.String contentLanguage) {
            this.config.contentLanguage(contentLanguage);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_type S3Object#content_type}.
         * <p>
         * @return {@code this}
         * @param contentType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#content_type S3Object#content_type}. This parameter is required.
         */
        public Builder contentType(final java.lang.String contentType) {
            this.config.contentType(contentType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#etag S3Object#etag}.
         * <p>
         * @return {@code this}
         * @param etag Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#etag S3Object#etag}. This parameter is required.
         */
        public Builder etag(final java.lang.String etag) {
            this.config.etag(etag);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#force_destroy S3Object#force_destroy}.
         * <p>
         * @return {@code this}
         * @param forceDestroy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#force_destroy S3Object#force_destroy}. This parameter is required.
         */
        public Builder forceDestroy(final java.lang.Boolean forceDestroy) {
            this.config.forceDestroy(forceDestroy);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#force_destroy S3Object#force_destroy}.
         * <p>
         * @return {@code this}
         * @param forceDestroy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#force_destroy S3Object#force_destroy}. This parameter is required.
         */
        public Builder forceDestroy(final com.hashicorp.cdktf.IResolvable forceDestroy) {
            this.config.forceDestroy(forceDestroy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#id S3Object#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#id S3Object#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#kms_key_id S3Object#kms_key_id}.
         * <p>
         * @return {@code this}
         * @param kmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#kms_key_id S3Object#kms_key_id}. This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config.kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#metadata S3Object#metadata}.
         * <p>
         * @return {@code this}
         * @param metadata Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#metadata S3Object#metadata}. This parameter is required.
         */
        public Builder metadata(final java.util.Map<java.lang.String, java.lang.String> metadata) {
            this.config.metadata(metadata);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#object_lock_legal_hold_status S3Object#object_lock_legal_hold_status}.
         * <p>
         * @return {@code this}
         * @param objectLockLegalHoldStatus Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#object_lock_legal_hold_status S3Object#object_lock_legal_hold_status}. This parameter is required.
         */
        public Builder objectLockLegalHoldStatus(final java.lang.String objectLockLegalHoldStatus) {
            this.config.objectLockLegalHoldStatus(objectLockLegalHoldStatus);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#object_lock_mode S3Object#object_lock_mode}.
         * <p>
         * @return {@code this}
         * @param objectLockMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#object_lock_mode S3Object#object_lock_mode}. This parameter is required.
         */
        public Builder objectLockMode(final java.lang.String objectLockMode) {
            this.config.objectLockMode(objectLockMode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#object_lock_retain_until_date S3Object#object_lock_retain_until_date}.
         * <p>
         * @return {@code this}
         * @param objectLockRetainUntilDate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#object_lock_retain_until_date S3Object#object_lock_retain_until_date}. This parameter is required.
         */
        public Builder objectLockRetainUntilDate(final java.lang.String objectLockRetainUntilDate) {
            this.config.objectLockRetainUntilDate(objectLockRetainUntilDate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#server_side_encryption S3Object#server_side_encryption}.
         * <p>
         * @return {@code this}
         * @param serverSideEncryption Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#server_side_encryption S3Object#server_side_encryption}. This parameter is required.
         */
        public Builder serverSideEncryption(final java.lang.String serverSideEncryption) {
            this.config.serverSideEncryption(serverSideEncryption);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#source S3Object#source}.
         * <p>
         * @return {@code this}
         * @param source Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#source S3Object#source}. This parameter is required.
         */
        public Builder source(final java.lang.String source) {
            this.config.source(source);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#source_hash S3Object#source_hash}.
         * <p>
         * @return {@code this}
         * @param sourceHash Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#source_hash S3Object#source_hash}. This parameter is required.
         */
        public Builder sourceHash(final java.lang.String sourceHash) {
            this.config.sourceHash(sourceHash);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#storage_class S3Object#storage_class}.
         * <p>
         * @return {@code this}
         * @param storageClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#storage_class S3Object#storage_class}. This parameter is required.
         */
        public Builder storageClass(final java.lang.String storageClass) {
            this.config.storageClass(storageClass);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#tags S3Object#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#tags S3Object#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#tags_all S3Object#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#tags_all S3Object#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#website_redirect S3Object#website_redirect}.
         * <p>
         * @return {@code this}
         * @param websiteRedirect Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_object#website_redirect S3Object#website_redirect}. This parameter is required.
         */
        public Builder websiteRedirect(final java.lang.String websiteRedirect) {
            this.config.websiteRedirect(websiteRedirect);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.s3.S3Object}.
         */
        @Override
        public imports.aws.s3.S3Object build() {
            return new imports.aws.s3.S3Object(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
