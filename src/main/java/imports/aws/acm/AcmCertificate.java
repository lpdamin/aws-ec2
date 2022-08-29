package imports.aws.acm;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate aws_acm_certificate}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.400Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmCertificate")
public class AcmCertificate extends com.hashicorp.cdktf.TerraformResource {

    protected AcmCertificate(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AcmCertificate(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.acm.AcmCertificate.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate aws_acm_certificate} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public AcmCertificate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.acm.AcmCertificateConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate aws_acm_certificate} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public AcmCertificate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putOptions(final @org.jetbrains.annotations.NotNull imports.aws.acm.AcmCertificateOptions value) {
        software.amazon.jsii.Kernel.call(this, "putOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putValidationOption(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putValidationOption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCertificateAuthorityArn() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateAuthorityArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificateBody() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateBody", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificateChain() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateChain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomainName() {
        software.amazon.jsii.Kernel.call(this, "resetDomainName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOptions() {
        software.amazon.jsii.Kernel.call(this, "resetOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateKey() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubjectAlternativeNames() {
        software.amazon.jsii.Kernel.call(this, "resetSubjectAlternativeNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValidationMethod() {
        software.amazon.jsii.Kernel.call(this, "resetValidationMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValidationOption() {
        software.amazon.jsii.Kernel.call(this, "resetValidationOption", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.AcmCertificateDomainValidationOptionsList getDomainValidationOptions() {
        return software.amazon.jsii.Kernel.get(this, "domainValidationOptions", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmCertificateDomainValidationOptionsList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotAfter() {
        return software.amazon.jsii.Kernel.get(this, "notAfter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotBefore() {
        return software.amazon.jsii.Kernel.get(this, "notBefore", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.AcmCertificateOptionsOutputReference getOptions() {
        return software.amazon.jsii.Kernel.get(this, "options", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmCertificateOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValidationEmails() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "validationEmails", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.AcmCertificateValidationOptionList getValidationOption() {
        return software.amazon.jsii.Kernel.get(this, "validationOption", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmCertificateValidationOptionList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateAuthorityArnInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateAuthorityArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateBodyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateChainInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateChainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.acm.AcmCertificateOptions getOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "optionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmCertificateOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "privateKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubjectAlternativeNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subjectAlternativeNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValidationMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "validationMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getValidationOptionInput() {
        return software.amazon.jsii.Kernel.get(this, "validationOptionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateAuthorityArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateAuthorityArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateAuthorityArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateAuthorityArn", java.util.Objects.requireNonNull(value, "certificateAuthorityArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateBody() {
        return software.amazon.jsii.Kernel.get(this, "certificateBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateBody(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateBody", java.util.Objects.requireNonNull(value, "certificateBody is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateChain() {
        return software.amazon.jsii.Kernel.get(this, "certificateChain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateChain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateChain", java.util.Objects.requireNonNull(value, "certificateChain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainName", java.util.Objects.requireNonNull(value, "domainName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateKey", java.util.Objects.requireNonNull(value, "privateKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubjectAlternativeNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subjectAlternativeNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubjectAlternativeNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subjectAlternativeNames", java.util.Objects.requireNonNull(value, "subjectAlternativeNames is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getValidationMethod() {
        return software.amazon.jsii.Kernel.get(this, "validationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValidationMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "validationMethod", java.util.Objects.requireNonNull(value, "validationMethod is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.acm.AcmCertificate}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.acm.AcmCertificate> {
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
        private imports.aws.acm.AcmCertificateConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_authority_arn AcmCertificate#certificate_authority_arn}.
         * <p>
         * @return {@code this}
         * @param certificateAuthorityArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_authority_arn AcmCertificate#certificate_authority_arn}. This parameter is required.
         */
        public Builder certificateAuthorityArn(final java.lang.String certificateAuthorityArn) {
            this.config().certificateAuthorityArn(certificateAuthorityArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_body AcmCertificate#certificate_body}.
         * <p>
         * @return {@code this}
         * @param certificateBody Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_body AcmCertificate#certificate_body}. This parameter is required.
         */
        public Builder certificateBody(final java.lang.String certificateBody) {
            this.config().certificateBody(certificateBody);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_chain AcmCertificate#certificate_chain}.
         * <p>
         * @return {@code this}
         * @param certificateChain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#certificate_chain AcmCertificate#certificate_chain}. This parameter is required.
         */
        public Builder certificateChain(final java.lang.String certificateChain) {
            this.config().certificateChain(certificateChain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#domain_name AcmCertificate#domain_name}.
         * <p>
         * @return {@code this}
         * @param domainName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#domain_name AcmCertificate#domain_name}. This parameter is required.
         */
        public Builder domainName(final java.lang.String domainName) {
            this.config().domainName(domainName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#id AcmCertificate#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#id AcmCertificate#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * options block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acm_certificate#options AcmCertificate#options}
         * <p>
         * @return {@code this}
         * @param options options block. This parameter is required.
         */
        public Builder options(final imports.aws.acm.AcmCertificateOptions options) {
            this.config().options(options);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#private_key AcmCertificate#private_key}.
         * <p>
         * @return {@code this}
         * @param privateKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#private_key AcmCertificate#private_key}. This parameter is required.
         */
        public Builder privateKey(final java.lang.String privateKey) {
            this.config().privateKey(privateKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#subject_alternative_names AcmCertificate#subject_alternative_names}.
         * <p>
         * @return {@code this}
         * @param subjectAlternativeNames Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#subject_alternative_names AcmCertificate#subject_alternative_names}. This parameter is required.
         */
        public Builder subjectAlternativeNames(final java.util.List<java.lang.String> subjectAlternativeNames) {
            this.config().subjectAlternativeNames(subjectAlternativeNames);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#tags AcmCertificate#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#tags AcmCertificate#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#tags_all AcmCertificate#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#tags_all AcmCertificate#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config().tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#validation_method AcmCertificate#validation_method}.
         * <p>
         * @return {@code this}
         * @param validationMethod Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acm_certificate#validation_method AcmCertificate#validation_method}. This parameter is required.
         */
        public Builder validationMethod(final java.lang.String validationMethod) {
            this.config().validationMethod(validationMethod);
            return this;
        }

        /**
         * validation_option block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acm_certificate#validation_option AcmCertificate#validation_option}
         * <p>
         * @return {@code this}
         * @param validationOption validation_option block. This parameter is required.
         */
        public Builder validationOption(final com.hashicorp.cdktf.IResolvable validationOption) {
            this.config().validationOption(validationOption);
            return this;
        }
        /**
         * validation_option block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acm_certificate#validation_option AcmCertificate#validation_option}
         * <p>
         * @return {@code this}
         * @param validationOption validation_option block. This parameter is required.
         */
        public Builder validationOption(final java.util.List<? extends imports.aws.acm.AcmCertificateValidationOption> validationOption) {
            this.config().validationOption(validationOption);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.acm.AcmCertificate}.
         */
        @Override
        public imports.aws.acm.AcmCertificate build() {
            return new imports.aws.acm.AcmCertificate(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.acm.AcmCertificateConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.acm.AcmCertificateConfig.Builder();
            }
            return this.config;
        }
    }
}
