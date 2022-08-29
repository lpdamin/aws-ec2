package imports.aws.s3;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration aws_s3_bucket_object_lock_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.430Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketObjectLockConfigurationA")
public class S3BucketObjectLockConfigurationA extends com.hashicorp.cdktf.TerraformResource {

    protected S3BucketObjectLockConfigurationA(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketObjectLockConfigurationA(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.s3.S3BucketObjectLockConfigurationA.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration aws_s3_bucket_object_lock_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public S3BucketObjectLockConfigurationA(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationAConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putRule(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationRuleA value) {
        software.amazon.jsii.Kernel.call(this, "putRule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExpectedBucketOwner() {
        software.amazon.jsii.Kernel.call(this, "resetExpectedBucketOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetObjectLockEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetObjectLockEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetToken() {
        software.amazon.jsii.Kernel.call(this, "resetToken", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketObjectLockConfigurationRuleAOutputReference getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRuleAOutputReference.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectLockEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "objectLockEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketObjectLockConfigurationRuleA getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketObjectLockConfigurationRuleA.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectLockEnabled() {
        return software.amazon.jsii.Kernel.get(this, "objectLockEnabled", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectLockEnabled(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectLockEnabled", java.util.Objects.requireNonNull(value, "objectLockEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getToken() {
        return software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setToken(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "token", java.util.Objects.requireNonNull(value, "token is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.s3.S3BucketObjectLockConfigurationA}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.s3.S3BucketObjectLockConfigurationA> {
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
        private final imports.aws.s3.S3BucketObjectLockConfigurationAConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.s3.S3BucketObjectLockConfigurationAConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#bucket S3BucketObjectLockConfigurationA#bucket}.
         * <p>
         * @return {@code this}
         * @param bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#bucket S3BucketObjectLockConfigurationA#bucket}. This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * rule block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#rule S3BucketObjectLockConfigurationA#rule}
         * <p>
         * @return {@code this}
         * @param rule rule block. This parameter is required.
         */
        public Builder rule(final imports.aws.s3.S3BucketObjectLockConfigurationRuleA rule) {
            this.config.rule(rule);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#expected_bucket_owner S3BucketObjectLockConfigurationA#expected_bucket_owner}.
         * <p>
         * @return {@code this}
         * @param expectedBucketOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#expected_bucket_owner S3BucketObjectLockConfigurationA#expected_bucket_owner}. This parameter is required.
         */
        public Builder expectedBucketOwner(final java.lang.String expectedBucketOwner) {
            this.config.expectedBucketOwner(expectedBucketOwner);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#id S3BucketObjectLockConfigurationA#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#id S3BucketObjectLockConfigurationA#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#object_lock_enabled S3BucketObjectLockConfigurationA#object_lock_enabled}.
         * <p>
         * @return {@code this}
         * @param objectLockEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#object_lock_enabled S3BucketObjectLockConfigurationA#object_lock_enabled}. This parameter is required.
         */
        public Builder objectLockEnabled(final java.lang.String objectLockEnabled) {
            this.config.objectLockEnabled(objectLockEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#token S3BucketObjectLockConfigurationA#token}.
         * <p>
         * @return {@code this}
         * @param token Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_object_lock_configuration#token S3BucketObjectLockConfigurationA#token}. This parameter is required.
         */
        public Builder token(final java.lang.String token) {
            this.config.token(token);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.s3.S3BucketObjectLockConfigurationA}.
         */
        @Override
        public imports.aws.s3.S3BucketObjectLockConfigurationA build() {
            return new imports.aws.s3.S3BucketObjectLockConfigurationA(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
