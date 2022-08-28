package imports.aws.worklink;

/**
 * AWS WorkLink.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:02.697Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.worklink.WorklinkWebsiteCertificateAuthorityAssociationConfig")
@software.amazon.jsii.Jsii.Proxy(WorklinkWebsiteCertificateAuthorityAssociationConfig.Jsii$Proxy.class)
public interface WorklinkWebsiteCertificateAuthorityAssociationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#certificate WorklinkWebsiteCertificateAuthorityAssociation#certificate}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCertificate();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#fleet_arn WorklinkWebsiteCertificateAuthorityAssociation#fleet_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFleetArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#display_name WorklinkWebsiteCertificateAuthorityAssociation#display_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#id WorklinkWebsiteCertificateAuthorityAssociation#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WorklinkWebsiteCertificateAuthorityAssociationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WorklinkWebsiteCertificateAuthorityAssociationConfig> {
        java.lang.String certificate;
        java.lang.String fleetArn;
        java.lang.String displayName;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getCertificate}
         * @param certificate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#certificate WorklinkWebsiteCertificateAuthorityAssociation#certificate}. This parameter is required.
         * @return {@code this}
         */
        public Builder certificate(java.lang.String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getFleetArn}
         * @param fleetArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#fleet_arn WorklinkWebsiteCertificateAuthorityAssociation#fleet_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder fleetArn(java.lang.String fleetArn) {
            this.fleetArn = fleetArn;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getDisplayName}
         * @param displayName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#display_name WorklinkWebsiteCertificateAuthorityAssociation#display_name}.
         * @return {@code this}
         */
        public Builder displayName(java.lang.String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/worklink_website_certificate_authority_association#id WorklinkWebsiteCertificateAuthorityAssociation#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getDependsOn}
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
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig#getProvisioners}
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
         * @return a new instance of {@link WorklinkWebsiteCertificateAuthorityAssociationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WorklinkWebsiteCertificateAuthorityAssociationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link WorklinkWebsiteCertificateAuthorityAssociationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WorklinkWebsiteCertificateAuthorityAssociationConfig {
        private final java.lang.String certificate;
        private final java.lang.String fleetArn;
        private final java.lang.String displayName;
        private final java.lang.String id;
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
            this.certificate = software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fleetArn = software.amazon.jsii.Kernel.get(this, "fleetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.displayName = software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.certificate = java.util.Objects.requireNonNull(builder.certificate, "certificate is required");
            this.fleetArn = java.util.Objects.requireNonNull(builder.fleetArn, "fleetArn is required");
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getCertificate() {
            return this.certificate;
        }

        @Override
        public final java.lang.String getFleetArn() {
            return this.fleetArn;
        }

        @Override
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
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

            data.set("certificate", om.valueToTree(this.getCertificate()));
            data.set("fleetArn", om.valueToTree(this.getFleetArn()));
            if (this.getDisplayName() != null) {
                data.set("displayName", om.valueToTree(this.getDisplayName()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.worklink.WorklinkWebsiteCertificateAuthorityAssociationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WorklinkWebsiteCertificateAuthorityAssociationConfig.Jsii$Proxy that = (WorklinkWebsiteCertificateAuthorityAssociationConfig.Jsii$Proxy) o;

            if (!certificate.equals(that.certificate)) return false;
            if (!fleetArn.equals(that.fleetArn)) return false;
            if (this.displayName != null ? !this.displayName.equals(that.displayName) : that.displayName != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
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
            int result = this.certificate.hashCode();
            result = 31 * result + (this.fleetArn.hashCode());
            result = 31 * result + (this.displayName != null ? this.displayName.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
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
