package imports.aws.s3;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object aws_s3_bucket_object}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.384Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.DataAwsS3BucketObject")
public class DataAwsS3BucketObject extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsS3BucketObject(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsS3BucketObject(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.s3.DataAwsS3BucketObject.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object aws_s3_bucket_object} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsS3BucketObject(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.s3.DataAwsS3BucketObjectConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRange() {
        software.amazon.jsii.Kernel.call(this, "resetRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersionId() {
        software.amazon.jsii.Kernel.call(this, "resetVersionId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getBody() {
        return software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getBucketKeyEnabled() {
        return software.amazon.jsii.Kernel.get(this, "bucketKeyEnabled", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCacheControl() {
        return software.amazon.jsii.Kernel.get(this, "cacheControl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentDisposition() {
        return software.amazon.jsii.Kernel.get(this, "contentDisposition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentEncoding() {
        return software.amazon.jsii.Kernel.get(this, "contentEncoding", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentLanguage() {
        return software.amazon.jsii.Kernel.get(this, "contentLanguage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getContentLength() {
        return software.amazon.jsii.Kernel.get(this, "contentLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContentType() {
        return software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEtag() {
        return software.amazon.jsii.Kernel.get(this, "etag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExpiration() {
        return software.amazon.jsii.Kernel.get(this, "expiration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExpires() {
        return software.amazon.jsii.Kernel.get(this, "expires", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModified() {
        return software.amazon.jsii.Kernel.get(this, "lastModified", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getMetadata() {
        return software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockLegalHoldStatus() {
        return software.amazon.jsii.Kernel.get(this, "objectLockLegalHoldStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockMode() {
        return software.amazon.jsii.Kernel.get(this, "objectLockMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockRetainUntilDate() {
        return software.amazon.jsii.Kernel.get(this, "objectLockRetainUntilDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerSideEncryption() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSseKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "sseKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "storageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebsiteRedirectLocation() {
        return software.amazon.jsii.Kernel.get(this, "websiteRedirectLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "keyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "rangeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "versionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRange() {
        return software.amazon.jsii.Kernel.get(this, "range", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRange(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "range", java.util.Objects.requireNonNull(value, "range is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionId() {
        return software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "versionId", java.util.Objects.requireNonNull(value, "versionId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.s3.DataAwsS3BucketObject}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.s3.DataAwsS3BucketObject> {
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
        private final imports.aws.s3.DataAwsS3BucketObjectConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.s3.DataAwsS3BucketObjectConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#bucket DataAwsS3BucketObject#bucket}.
         * <p>
         * @return {@code this}
         * @param bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#bucket DataAwsS3BucketObject#bucket}. This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#key DataAwsS3BucketObject#key}.
         * <p>
         * @return {@code this}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#key DataAwsS3BucketObject#key}. This parameter is required.
         */
        public Builder key(final java.lang.String key) {
            this.config.key(key);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#id DataAwsS3BucketObject#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#id DataAwsS3BucketObject#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#range DataAwsS3BucketObject#range}.
         * <p>
         * @return {@code this}
         * @param range Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#range DataAwsS3BucketObject#range}. This parameter is required.
         */
        public Builder range(final java.lang.String range) {
            this.config.range(range);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#tags DataAwsS3BucketObject#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#tags DataAwsS3BucketObject#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#version_id DataAwsS3BucketObject#version_id}.
         * <p>
         * @return {@code this}
         * @param versionId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_bucket_object#version_id DataAwsS3BucketObject#version_id}. This parameter is required.
         */
        public Builder versionId(final java.lang.String versionId) {
            this.config.versionId(versionId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.s3.DataAwsS3BucketObject}.
         */
        @Override
        public imports.aws.s3.DataAwsS3BucketObject build() {
            return new imports.aws.s3.DataAwsS3BucketObject(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
