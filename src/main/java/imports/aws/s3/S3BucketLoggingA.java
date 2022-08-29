package imports.aws.s3;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging aws_s3_bucket_logging}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.424Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLoggingA")
public class S3BucketLoggingA extends com.hashicorp.cdktf.TerraformResource {

    protected S3BucketLoggingA(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLoggingA(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.s3.S3BucketLoggingA.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging aws_s3_bucket_logging} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public S3BucketLoggingA(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLoggingAConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putTargetGrant(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTargetGrant", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExpectedBucketOwner() {
        software.amazon.jsii.Kernel.call(this, "resetExpectedBucketOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGrant() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGrant", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLoggingTargetGrantList getTargetGrant() {
        return software.amazon.jsii.Kernel.get(this, "targetGrant", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLoggingTargetGrantList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExpectedBucketOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "expectedBucketOwnerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "targetBucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTargetGrantInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGrantInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "targetPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExpectedBucketOwner() {
        return software.amazon.jsii.Kernel.get(this, "expectedBucketOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExpectedBucketOwner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "expectedBucketOwner", java.util.Objects.requireNonNull(value, "expectedBucketOwner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetBucket() {
        return software.amazon.jsii.Kernel.get(this, "targetBucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetBucket", java.util.Objects.requireNonNull(value, "targetBucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetPrefix() {
        return software.amazon.jsii.Kernel.get(this, "targetPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetPrefix", java.util.Objects.requireNonNull(value, "targetPrefix is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.s3.S3BucketLoggingA}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.s3.S3BucketLoggingA> {
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
        private final imports.aws.s3.S3BucketLoggingAConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.s3.S3BucketLoggingAConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#bucket S3BucketLoggingA#bucket}.
         * <p>
         * @return {@code this}
         * @param bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#bucket S3BucketLoggingA#bucket}. This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#target_bucket S3BucketLoggingA#target_bucket}.
         * <p>
         * @return {@code this}
         * @param targetBucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#target_bucket S3BucketLoggingA#target_bucket}. This parameter is required.
         */
        public Builder targetBucket(final java.lang.String targetBucket) {
            this.config.targetBucket(targetBucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#target_prefix S3BucketLoggingA#target_prefix}.
         * <p>
         * @return {@code this}
         * @param targetPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#target_prefix S3BucketLoggingA#target_prefix}. This parameter is required.
         */
        public Builder targetPrefix(final java.lang.String targetPrefix) {
            this.config.targetPrefix(targetPrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#expected_bucket_owner S3BucketLoggingA#expected_bucket_owner}.
         * <p>
         * @return {@code this}
         * @param expectedBucketOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#expected_bucket_owner S3BucketLoggingA#expected_bucket_owner}. This parameter is required.
         */
        public Builder expectedBucketOwner(final java.lang.String expectedBucketOwner) {
            this.config.expectedBucketOwner(expectedBucketOwner);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#id S3BucketLoggingA#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#id S3BucketLoggingA#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * target_grant block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#target_grant S3BucketLoggingA#target_grant}
         * <p>
         * @return {@code this}
         * @param targetGrant target_grant block. This parameter is required.
         */
        public Builder targetGrant(final com.hashicorp.cdktf.IResolvable targetGrant) {
            this.config.targetGrant(targetGrant);
            return this;
        }
        /**
         * target_grant block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_logging#target_grant S3BucketLoggingA#target_grant}
         * <p>
         * @return {@code this}
         * @param targetGrant target_grant block. This parameter is required.
         */
        public Builder targetGrant(final java.util.List<? extends imports.aws.s3.S3BucketLoggingTargetGrant> targetGrant) {
            this.config.targetGrant(targetGrant);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.s3.S3BucketLoggingA}.
         */
        @Override
        public imports.aws.s3.S3BucketLoggingA build() {
            return new imports.aws.s3.S3BucketLoggingA(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
