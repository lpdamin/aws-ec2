package imports.aws.acm;

/**
 * Amazon Certificate Manager.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.025Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmpcaCertificateConfig")
@software.amazon.jsii.Jsii.Proxy(AcmpcaCertificateConfig.Jsii$Proxy.class)
public interface AcmpcaCertificateConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#certificate_authority_arn AcmpcaCertificate#certificate_authority_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCertificateAuthorityArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#certificate_signing_request AcmpcaCertificate#certificate_signing_request}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCertificateSigningRequest();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#signing_algorithm AcmpcaCertificate#signing_algorithm}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSigningAlgorithm();

    /**
     * validity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#validity AcmpcaCertificate#validity}
     */
    @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateValidity getValidity();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#id AcmpcaCertificate#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#template_arn AcmpcaCertificate#template_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTemplateArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AcmpcaCertificateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AcmpcaCertificateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AcmpcaCertificateConfig> {
        java.lang.String certificateAuthorityArn;
        java.lang.String certificateSigningRequest;
        java.lang.String signingAlgorithm;
        imports.aws.acm.AcmpcaCertificateValidity validity;
        java.lang.String id;
        java.lang.String templateArn;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getCertificateAuthorityArn}
         * @param certificateAuthorityArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#certificate_authority_arn AcmpcaCertificate#certificate_authority_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder certificateAuthorityArn(java.lang.String certificateAuthorityArn) {
            this.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getCertificateSigningRequest}
         * @param certificateSigningRequest Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#certificate_signing_request AcmpcaCertificate#certificate_signing_request}. This parameter is required.
         * @return {@code this}
         */
        public Builder certificateSigningRequest(java.lang.String certificateSigningRequest) {
            this.certificateSigningRequest = certificateSigningRequest;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getSigningAlgorithm}
         * @param signingAlgorithm Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#signing_algorithm AcmpcaCertificate#signing_algorithm}. This parameter is required.
         * @return {@code this}
         */
        public Builder signingAlgorithm(java.lang.String signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getValidity}
         * @param validity validity block. This parameter is required.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#validity AcmpcaCertificate#validity}
         * @return {@code this}
         */
        public Builder validity(imports.aws.acm.AcmpcaCertificateValidity validity) {
            this.validity = validity;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#id AcmpcaCertificate#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getTemplateArn}
         * @param templateArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/acmpca_certificate#template_arn AcmpcaCertificate#template_arn}.
         * @return {@code this}
         */
        public Builder templateArn(java.lang.String templateArn) {
            this.templateArn = templateArn;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link AcmpcaCertificateConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AcmpcaCertificateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AcmpcaCertificateConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AcmpcaCertificateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AcmpcaCertificateConfig {
        private final java.lang.String certificateAuthorityArn;
        private final java.lang.String certificateSigningRequest;
        private final java.lang.String signingAlgorithm;
        private final imports.aws.acm.AcmpcaCertificateValidity validity;
        private final java.lang.String id;
        private final java.lang.String templateArn;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.certificateAuthorityArn = software.amazon.jsii.Kernel.get(this, "certificateAuthorityArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateSigningRequest = software.amazon.jsii.Kernel.get(this, "certificateSigningRequest", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signingAlgorithm = software.amazon.jsii.Kernel.get(this, "signingAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.validity = software.amazon.jsii.Kernel.get(this, "validity", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateValidity.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.templateArn = software.amazon.jsii.Kernel.get(this, "templateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.certificateAuthorityArn = java.util.Objects.requireNonNull(builder.certificateAuthorityArn, "certificateAuthorityArn is required");
            this.certificateSigningRequest = java.util.Objects.requireNonNull(builder.certificateSigningRequest, "certificateSigningRequest is required");
            this.signingAlgorithm = java.util.Objects.requireNonNull(builder.signingAlgorithm, "signingAlgorithm is required");
            this.validity = java.util.Objects.requireNonNull(builder.validity, "validity is required");
            this.id = builder.id;
            this.templateArn = builder.templateArn;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getCertificateAuthorityArn() {
            return this.certificateAuthorityArn;
        }

        @Override
        public final java.lang.String getCertificateSigningRequest() {
            return this.certificateSigningRequest;
        }

        @Override
        public final java.lang.String getSigningAlgorithm() {
            return this.signingAlgorithm;
        }

        @Override
        public final imports.aws.acm.AcmpcaCertificateValidity getValidity() {
            return this.validity;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getTemplateArn() {
            return this.templateArn;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("certificateAuthorityArn", om.valueToTree(this.getCertificateAuthorityArn()));
            data.set("certificateSigningRequest", om.valueToTree(this.getCertificateSigningRequest()));
            data.set("signingAlgorithm", om.valueToTree(this.getSigningAlgorithm()));
            data.set("validity", om.valueToTree(this.getValidity()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getTemplateArn() != null) {
                data.set("templateArn", om.valueToTree(this.getTemplateArn()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.acm.AcmpcaCertificateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AcmpcaCertificateConfig.Jsii$Proxy that = (AcmpcaCertificateConfig.Jsii$Proxy) o;

            if (!certificateAuthorityArn.equals(that.certificateAuthorityArn)) return false;
            if (!certificateSigningRequest.equals(that.certificateSigningRequest)) return false;
            if (!signingAlgorithm.equals(that.signingAlgorithm)) return false;
            if (!validity.equals(that.validity)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.templateArn != null ? !this.templateArn.equals(that.templateArn) : that.templateArn != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.certificateAuthorityArn.hashCode();
            result = 31 * result + (this.certificateSigningRequest.hashCode());
            result = 31 * result + (this.signingAlgorithm.hashCode());
            result = 31 * result + (this.validity.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.templateArn != null ? this.templateArn.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
