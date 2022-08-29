package imports.aws.iot;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate aws_iot_certificate}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.424Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotCertificate")
public class IotCertificate extends com.hashicorp.cdktf.TerraformResource {

    protected IotCertificate(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotCertificate(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.iot.IotCertificate.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate aws_iot_certificate} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public IotCertificate(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.iot.IotCertificateConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetCaPem() {
        software.amazon.jsii.Kernel.call(this, "resetCaPem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificatePem() {
        software.amazon.jsii.Kernel.call(this, "resetCertificatePem", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCsr() {
        software.amazon.jsii.Kernel.call(this, "resetCsr", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicKey() {
        return software.amazon.jsii.Kernel.get(this, "publicKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getActiveInput() {
        return software.amazon.jsii.Kernel.get(this, "activeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaPemInput() {
        return software.amazon.jsii.Kernel.get(this, "caPemInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificatePemInput() {
        return software.amazon.jsii.Kernel.get(this, "certificatePemInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCsrInput() {
        return software.amazon.jsii.Kernel.get(this, "csrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getActive() {
        return software.amazon.jsii.Kernel.get(this, "active", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setActive(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "active", java.util.Objects.requireNonNull(value, "active is required"));
    }

    public void setActive(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "active", java.util.Objects.requireNonNull(value, "active is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCaPem() {
        return software.amazon.jsii.Kernel.get(this, "caPem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCaPem(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "caPem", java.util.Objects.requireNonNull(value, "caPem is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificatePem() {
        return software.amazon.jsii.Kernel.get(this, "certificatePem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificatePem(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificatePem", java.util.Objects.requireNonNull(value, "certificatePem is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCsr() {
        return software.amazon.jsii.Kernel.get(this, "csr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCsr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "csr", java.util.Objects.requireNonNull(value, "csr is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.iot.IotCertificate}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.iot.IotCertificate> {
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
        private final imports.aws.iot.IotCertificateConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.iot.IotCertificateConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#active IotCertificate#active}.
         * <p>
         * @return {@code this}
         * @param active Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#active IotCertificate#active}. This parameter is required.
         */
        public Builder active(final java.lang.Boolean active) {
            this.config.active(active);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#active IotCertificate#active}.
         * <p>
         * @return {@code this}
         * @param active Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#active IotCertificate#active}. This parameter is required.
         */
        public Builder active(final com.hashicorp.cdktf.IResolvable active) {
            this.config.active(active);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#ca_pem IotCertificate#ca_pem}.
         * <p>
         * @return {@code this}
         * @param caPem Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#ca_pem IotCertificate#ca_pem}. This parameter is required.
         */
        public Builder caPem(final java.lang.String caPem) {
            this.config.caPem(caPem);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#certificate_pem IotCertificate#certificate_pem}.
         * <p>
         * @return {@code this}
         * @param certificatePem Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#certificate_pem IotCertificate#certificate_pem}. This parameter is required.
         */
        public Builder certificatePem(final java.lang.String certificatePem) {
            this.config.certificatePem(certificatePem);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#csr IotCertificate#csr}.
         * <p>
         * @return {@code this}
         * @param csr Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#csr IotCertificate#csr}. This parameter is required.
         */
        public Builder csr(final java.lang.String csr) {
            this.config.csr(csr);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#id IotCertificate#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_certificate#id IotCertificate#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.iot.IotCertificate}.
         */
        @Override
        public imports.aws.iot.IotCertificate build() {
            return new imports.aws.iot.IotCertificate(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
