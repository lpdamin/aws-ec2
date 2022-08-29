package imports.aws.macie;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association aws_macie_s3_bucket_association}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.889Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.macie.MacieS3BucketAssociation")
public class MacieS3BucketAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected MacieS3BucketAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MacieS3BucketAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.macie.MacieS3BucketAssociation.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association aws_macie_s3_bucket_association} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public MacieS3BucketAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.macie.MacieS3BucketAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putClassificationType(final @org.jetbrains.annotations.NotNull imports.aws.macie.MacieS3BucketAssociationClassificationType value) {
        software.amazon.jsii.Kernel.call(this, "putClassificationType", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClassificationType() {
        software.amazon.jsii.Kernel.call(this, "resetClassificationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMemberAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetMemberAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.macie.MacieS3BucketAssociationClassificationTypeOutputReference getClassificationType() {
        return software.amazon.jsii.Kernel.get(this, "classificationType", software.amazon.jsii.NativeType.forClass(imports.aws.macie.MacieS3BucketAssociationClassificationTypeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie.MacieS3BucketAssociationClassificationType getClassificationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "classificationTypeInput", software.amazon.jsii.NativeType.forClass(imports.aws.macie.MacieS3BucketAssociationClassificationType.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMemberAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "memberAccountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketName() {
        return software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketName", java.util.Objects.requireNonNull(value, "bucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMemberAccountId() {
        return software.amazon.jsii.Kernel.get(this, "memberAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMemberAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "memberAccountId", java.util.Objects.requireNonNull(value, "memberAccountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefix", java.util.Objects.requireNonNull(value, "prefix is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.macie.MacieS3BucketAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.macie.MacieS3BucketAssociation> {
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
        private final imports.aws.macie.MacieS3BucketAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.macie.MacieS3BucketAssociationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#bucket_name MacieS3BucketAssociation#bucket_name}.
         * <p>
         * @return {@code this}
         * @param bucketName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#bucket_name MacieS3BucketAssociation#bucket_name}. This parameter is required.
         */
        public Builder bucketName(final java.lang.String bucketName) {
            this.config.bucketName(bucketName);
            return this;
        }

        /**
         * classification_type block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#classification_type MacieS3BucketAssociation#classification_type}
         * <p>
         * @return {@code this}
         * @param classificationType classification_type block. This parameter is required.
         */
        public Builder classificationType(final imports.aws.macie.MacieS3BucketAssociationClassificationType classificationType) {
            this.config.classificationType(classificationType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#id MacieS3BucketAssociation#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#id MacieS3BucketAssociation#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#member_account_id MacieS3BucketAssociation#member_account_id}.
         * <p>
         * @return {@code this}
         * @param memberAccountId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#member_account_id MacieS3BucketAssociation#member_account_id}. This parameter is required.
         */
        public Builder memberAccountId(final java.lang.String memberAccountId) {
            this.config.memberAccountId(memberAccountId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#prefix MacieS3BucketAssociation#prefix}.
         * <p>
         * @return {@code this}
         * @param prefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/macie_s3_bucket_association#prefix MacieS3BucketAssociation#prefix}. This parameter is required.
         */
        public Builder prefix(final java.lang.String prefix) {
            this.config.prefix(prefix);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.macie.MacieS3BucketAssociation}.
         */
        @Override
        public imports.aws.macie.MacieS3BucketAssociation build() {
            return new imports.aws.macie.MacieS3BucketAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
