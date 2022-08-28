package imports.aws.s3;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/s3_objects aws_s3_objects}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.373Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.DataAwsS3Objects")
public class DataAwsS3Objects extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsS3Objects(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsS3Objects(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.s3.DataAwsS3Objects.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/s3_objects aws_s3_objects} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsS3Objects(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.s3.DataAwsS3ObjectsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDelimiter() {
        software.amazon.jsii.Kernel.call(this, "resetDelimiter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncodingType() {
        software.amazon.jsii.Kernel.call(this, "resetEncodingType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFetchOwner() {
        software.amazon.jsii.Kernel.call(this, "resetFetchOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxKeys() {
        software.amazon.jsii.Kernel.call(this, "resetMaxKeys", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartAfter() {
        software.amazon.jsii.Kernel.call(this, "resetStartAfter", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCommonPrefixes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "commonPrefixes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getKeys() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "keys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOwners() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "owners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDelimiterInput() {
        return software.amazon.jsii.Kernel.get(this, "delimiterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEncodingTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "encodingTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFetchOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "fetchOwnerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxKeysInput() {
        return software.amazon.jsii.Kernel.get(this, "maxKeysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStartAfterInput() {
        return software.amazon.jsii.Kernel.get(this, "startAfterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDelimiter() {
        return software.amazon.jsii.Kernel.get(this, "delimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDelimiter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "delimiter", java.util.Objects.requireNonNull(value, "delimiter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncodingType() {
        return software.amazon.jsii.Kernel.get(this, "encodingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEncodingType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "encodingType", java.util.Objects.requireNonNull(value, "encodingType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getFetchOwner() {
        return software.amazon.jsii.Kernel.get(this, "fetchOwner", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setFetchOwner(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fetchOwner", java.util.Objects.requireNonNull(value, "fetchOwner is required"));
    }

    public void setFetchOwner(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "fetchOwner", java.util.Objects.requireNonNull(value, "fetchOwner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxKeys() {
        return software.amazon.jsii.Kernel.get(this, "maxKeys", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxKeys(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxKeys", java.util.Objects.requireNonNull(value, "maxKeys is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStartAfter() {
        return software.amazon.jsii.Kernel.get(this, "startAfter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStartAfter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "startAfter", java.util.Objects.requireNonNull(value, "startAfter is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.s3.DataAwsS3Objects}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.s3.DataAwsS3Objects> {
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
        private final imports.aws.s3.DataAwsS3ObjectsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.s3.DataAwsS3ObjectsConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#bucket DataAwsS3Objects#bucket}.
         * <p>
         * @return {@code this}
         * @param bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#bucket DataAwsS3Objects#bucket}. This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config.bucket(bucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#delimiter DataAwsS3Objects#delimiter}.
         * <p>
         * @return {@code this}
         * @param delimiter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#delimiter DataAwsS3Objects#delimiter}. This parameter is required.
         */
        public Builder delimiter(final java.lang.String delimiter) {
            this.config.delimiter(delimiter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#encoding_type DataAwsS3Objects#encoding_type}.
         * <p>
         * @return {@code this}
         * @param encodingType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#encoding_type DataAwsS3Objects#encoding_type}. This parameter is required.
         */
        public Builder encodingType(final java.lang.String encodingType) {
            this.config.encodingType(encodingType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#fetch_owner DataAwsS3Objects#fetch_owner}.
         * <p>
         * @return {@code this}
         * @param fetchOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#fetch_owner DataAwsS3Objects#fetch_owner}. This parameter is required.
         */
        public Builder fetchOwner(final java.lang.Boolean fetchOwner) {
            this.config.fetchOwner(fetchOwner);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#fetch_owner DataAwsS3Objects#fetch_owner}.
         * <p>
         * @return {@code this}
         * @param fetchOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#fetch_owner DataAwsS3Objects#fetch_owner}. This parameter is required.
         */
        public Builder fetchOwner(final com.hashicorp.cdktf.IResolvable fetchOwner) {
            this.config.fetchOwner(fetchOwner);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#id DataAwsS3Objects#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#id DataAwsS3Objects#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#max_keys DataAwsS3Objects#max_keys}.
         * <p>
         * @return {@code this}
         * @param maxKeys Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#max_keys DataAwsS3Objects#max_keys}. This parameter is required.
         */
        public Builder maxKeys(final java.lang.Number maxKeys) {
            this.config.maxKeys(maxKeys);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#prefix DataAwsS3Objects#prefix}.
         * <p>
         * @return {@code this}
         * @param prefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#prefix DataAwsS3Objects#prefix}. This parameter is required.
         */
        public Builder prefix(final java.lang.String prefix) {
            this.config.prefix(prefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#start_after DataAwsS3Objects#start_after}.
         * <p>
         * @return {@code this}
         * @param startAfter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/s3_objects#start_after DataAwsS3Objects#start_after}. This parameter is required.
         */
        public Builder startAfter(final java.lang.String startAfter) {
            this.config.startAfter(startAfter);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.s3.DataAwsS3Objects}.
         */
        @Override
        public imports.aws.s3.DataAwsS3Objects build() {
            return new imports.aws.s3.DataAwsS3Objects(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
