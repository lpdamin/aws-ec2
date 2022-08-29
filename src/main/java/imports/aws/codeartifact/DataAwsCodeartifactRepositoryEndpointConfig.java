package imports.aws.codeartifact;

/**
 * AWS CodeArtifact.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.081Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codeartifact.DataAwsCodeartifactRepositoryEndpointConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsCodeartifactRepositoryEndpointConfig.Jsii$Proxy.class)
public interface DataAwsCodeartifactRepositoryEndpointConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#domain DataAwsCodeartifactRepositoryEndpoint#domain}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDomain();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#format DataAwsCodeartifactRepositoryEndpoint#format}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFormat();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#repository DataAwsCodeartifactRepositoryEndpoint#repository}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRepository();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#domain_owner DataAwsCodeartifactRepositoryEndpoint#domain_owner}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDomainOwner() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#id DataAwsCodeartifactRepositoryEndpoint#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsCodeartifactRepositoryEndpointConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsCodeartifactRepositoryEndpointConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsCodeartifactRepositoryEndpointConfig> {
        java.lang.String domain;
        java.lang.String format;
        java.lang.String repository;
        java.lang.String domainOwner;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getDomain}
         * @param domain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#domain DataAwsCodeartifactRepositoryEndpoint#domain}. This parameter is required.
         * @return {@code this}
         */
        public Builder domain(java.lang.String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getFormat}
         * @param format Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#format DataAwsCodeartifactRepositoryEndpoint#format}. This parameter is required.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getRepository}
         * @param repository Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#repository DataAwsCodeartifactRepositoryEndpoint#repository}. This parameter is required.
         * @return {@code this}
         */
        public Builder repository(java.lang.String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getDomainOwner}
         * @param domainOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#domain_owner DataAwsCodeartifactRepositoryEndpoint#domain_owner}.
         * @return {@code this}
         */
        public Builder domainOwner(java.lang.String domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/codeartifact_repository_endpoint#id DataAwsCodeartifactRepositoryEndpoint#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getDependsOn}
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
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCodeartifactRepositoryEndpointConfig#getProvisioners}
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
         * @return a new instance of {@link DataAwsCodeartifactRepositoryEndpointConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsCodeartifactRepositoryEndpointConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsCodeartifactRepositoryEndpointConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsCodeartifactRepositoryEndpointConfig {
        private final java.lang.String domain;
        private final java.lang.String format;
        private final java.lang.String repository;
        private final java.lang.String domainOwner;
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
            this.domain = software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repository = software.amazon.jsii.Kernel.get(this, "repository", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.domainOwner = software.amazon.jsii.Kernel.get(this, "domainOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.domain = java.util.Objects.requireNonNull(builder.domain, "domain is required");
            this.format = java.util.Objects.requireNonNull(builder.format, "format is required");
            this.repository = java.util.Objects.requireNonNull(builder.repository, "repository is required");
            this.domainOwner = builder.domainOwner;
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
        public final java.lang.String getDomain() {
            return this.domain;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.lang.String getRepository() {
            return this.repository;
        }

        @Override
        public final java.lang.String getDomainOwner() {
            return this.domainOwner;
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

            data.set("domain", om.valueToTree(this.getDomain()));
            data.set("format", om.valueToTree(this.getFormat()));
            data.set("repository", om.valueToTree(this.getRepository()));
            if (this.getDomainOwner() != null) {
                data.set("domainOwner", om.valueToTree(this.getDomainOwner()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.codeartifact.DataAwsCodeartifactRepositoryEndpointConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsCodeartifactRepositoryEndpointConfig.Jsii$Proxy that = (DataAwsCodeartifactRepositoryEndpointConfig.Jsii$Proxy) o;

            if (!domain.equals(that.domain)) return false;
            if (!format.equals(that.format)) return false;
            if (!repository.equals(that.repository)) return false;
            if (this.domainOwner != null ? !this.domainOwner.equals(that.domainOwner) : that.domainOwner != null) return false;
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
            int result = this.domain.hashCode();
            result = 31 * result + (this.format.hashCode());
            result = 31 * result + (this.repository.hashCode());
            result = 31 * result + (this.domainOwner != null ? this.domainOwner.hashCode() : 0);
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
