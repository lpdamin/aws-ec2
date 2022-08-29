package imports.aws.acm;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate aws_acmpca_certificate_authority_certificate}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.412Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmpcaCertificateAuthorityCertificate")
public class AcmpcaCertificateAuthorityCertificate extends com.hashicorp.cdktf.TerraformResource {

    protected AcmpcaCertificateAuthorityCertificate(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AcmpcaCertificateAuthorityCertificate(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.acm.AcmpcaCertificateAuthorityCertificate.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate aws_acmpca_certificate_authority_certificate} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AcmpcaCertificateAuthorityCertificate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityCertificateConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCertificateChain() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateChain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateAuthorityArnInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateAuthorityArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateChainInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateChainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificate() {
        return software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificate", java.util.Objects.requireNonNull(value, "certificate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateAuthorityArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateAuthorityArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateAuthorityArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateAuthorityArn", java.util.Objects.requireNonNull(value, "certificateAuthorityArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateChain() {
        return software.amazon.jsii.Kernel.get(this, "certificateChain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateChain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateChain", java.util.Objects.requireNonNull(value, "certificateChain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.acm.AcmpcaCertificateAuthorityCertificate}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.acm.AcmpcaCertificateAuthorityCertificate> {
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
        private final imports.aws.acm.AcmpcaCertificateAuthorityCertificateConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.acm.AcmpcaCertificateAuthorityCertificateConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#certificate AcmpcaCertificateAuthorityCertificate#certificate}.
         * <p>
         * @return {@code this}
         * @param certificate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#certificate AcmpcaCertificateAuthorityCertificate#certificate}. This parameter is required.
         */
        public Builder certificate(final java.lang.String certificate) {
            this.config.certificate(certificate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#certificate_authority_arn AcmpcaCertificateAuthorityCertificate#certificate_authority_arn}.
         * <p>
         * @return {@code this}
         * @param certificateAuthorityArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#certificate_authority_arn AcmpcaCertificateAuthorityCertificate#certificate_authority_arn}. This parameter is required.
         */
        public Builder certificateAuthorityArn(final java.lang.String certificateAuthorityArn) {
            this.config.certificateAuthorityArn(certificateAuthorityArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#certificate_chain AcmpcaCertificateAuthorityCertificate#certificate_chain}.
         * <p>
         * @return {@code this}
         * @param certificateChain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#certificate_chain AcmpcaCertificateAuthorityCertificate#certificate_chain}. This parameter is required.
         */
        public Builder certificateChain(final java.lang.String certificateChain) {
            this.config.certificateChain(certificateChain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#id AcmpcaCertificateAuthorityCertificate#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate_authority_certificate#id AcmpcaCertificateAuthorityCertificate#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.acm.AcmpcaCertificateAuthorityCertificate}.
         */
        @Override
        public imports.aws.acm.AcmpcaCertificateAuthorityCertificate build() {
            return new imports.aws.acm.AcmpcaCertificateAuthorityCertificate(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
