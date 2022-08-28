package imports.aws.servicecatalog;

/**
 * AWS Service Catalog.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicecatalog.ServicecatalogPortfolioShareConfig")
@software.amazon.jsii.Jsii.Proxy(ServicecatalogPortfolioShareConfig.Jsii$Proxy.class)
public interface ServicecatalogPortfolioShareConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#portfolio_id ServicecatalogPortfolioShare#portfolio_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPortfolioId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#principal_id ServicecatalogPortfolioShare#principal_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPrincipalId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#type ServicecatalogPortfolioShare#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#accept_language ServicecatalogPortfolioShare#accept_language}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAcceptLanguage() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#id ServicecatalogPortfolioShare#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#share_tag_options ServicecatalogPortfolioShare#share_tag_options}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getShareTagOptions() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#timeouts ServicecatalogPortfolioShare#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.servicecatalog.ServicecatalogPortfolioShareTimeouts getTimeouts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#wait_for_acceptance ServicecatalogPortfolioShare#wait_for_acceptance}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWaitForAcceptance() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServicecatalogPortfolioShareConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServicecatalogPortfolioShareConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServicecatalogPortfolioShareConfig> {
        java.lang.String portfolioId;
        java.lang.String principalId;
        java.lang.String type;
        java.lang.String acceptLanguage;
        java.lang.String id;
        java.lang.Object shareTagOptions;
        imports.aws.servicecatalog.ServicecatalogPortfolioShareTimeouts timeouts;
        java.lang.Object waitForAcceptance;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getPortfolioId}
         * @param portfolioId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#portfolio_id ServicecatalogPortfolioShare#portfolio_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder portfolioId(java.lang.String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getPrincipalId}
         * @param principalId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#principal_id ServicecatalogPortfolioShare#principal_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder principalId(java.lang.String principalId) {
            this.principalId = principalId;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#type ServicecatalogPortfolioShare#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getAcceptLanguage}
         * @param acceptLanguage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#accept_language ServicecatalogPortfolioShare#accept_language}.
         * @return {@code this}
         */
        public Builder acceptLanguage(java.lang.String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#id ServicecatalogPortfolioShare#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getShareTagOptions}
         * @param shareTagOptions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#share_tag_options ServicecatalogPortfolioShare#share_tag_options}.
         * @return {@code this}
         */
        public Builder shareTagOptions(java.lang.Boolean shareTagOptions) {
            this.shareTagOptions = shareTagOptions;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getShareTagOptions}
         * @param shareTagOptions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#share_tag_options ServicecatalogPortfolioShare#share_tag_options}.
         * @return {@code this}
         */
        public Builder shareTagOptions(com.hashicorp.cdktf.IResolvable shareTagOptions) {
            this.shareTagOptions = shareTagOptions;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#timeouts ServicecatalogPortfolioShare#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.servicecatalog.ServicecatalogPortfolioShareTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getWaitForAcceptance}
         * @param waitForAcceptance Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#wait_for_acceptance ServicecatalogPortfolioShare#wait_for_acceptance}.
         * @return {@code this}
         */
        public Builder waitForAcceptance(java.lang.Boolean waitForAcceptance) {
            this.waitForAcceptance = waitForAcceptance;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getWaitForAcceptance}
         * @param waitForAcceptance Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_portfolio_share#wait_for_acceptance ServicecatalogPortfolioShare#wait_for_acceptance}.
         * @return {@code this}
         */
        public Builder waitForAcceptance(com.hashicorp.cdktf.IResolvable waitForAcceptance) {
            this.waitForAcceptance = waitForAcceptance;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getDependsOn}
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
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPortfolioShareConfig#getProvisioners}
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
         * @return a new instance of {@link ServicecatalogPortfolioShareConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServicecatalogPortfolioShareConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServicecatalogPortfolioShareConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServicecatalogPortfolioShareConfig {
        private final java.lang.String portfolioId;
        private final java.lang.String principalId;
        private final java.lang.String type;
        private final java.lang.String acceptLanguage;
        private final java.lang.String id;
        private final java.lang.Object shareTagOptions;
        private final imports.aws.servicecatalog.ServicecatalogPortfolioShareTimeouts timeouts;
        private final java.lang.Object waitForAcceptance;
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
            this.portfolioId = software.amazon.jsii.Kernel.get(this, "portfolioId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.principalId = software.amazon.jsii.Kernel.get(this, "principalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.acceptLanguage = software.amazon.jsii.Kernel.get(this, "acceptLanguage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shareTagOptions = software.amazon.jsii.Kernel.get(this, "shareTagOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.servicecatalog.ServicecatalogPortfolioShareTimeouts.class));
            this.waitForAcceptance = software.amazon.jsii.Kernel.get(this, "waitForAcceptance", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.portfolioId = java.util.Objects.requireNonNull(builder.portfolioId, "portfolioId is required");
            this.principalId = java.util.Objects.requireNonNull(builder.principalId, "principalId is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.acceptLanguage = builder.acceptLanguage;
            this.id = builder.id;
            this.shareTagOptions = builder.shareTagOptions;
            this.timeouts = builder.timeouts;
            this.waitForAcceptance = builder.waitForAcceptance;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getPortfolioId() {
            return this.portfolioId;
        }

        @Override
        public final java.lang.String getPrincipalId() {
            return this.principalId;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getAcceptLanguage() {
            return this.acceptLanguage;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getShareTagOptions() {
            return this.shareTagOptions;
        }

        @Override
        public final imports.aws.servicecatalog.ServicecatalogPortfolioShareTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Object getWaitForAcceptance() {
            return this.waitForAcceptance;
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

            data.set("portfolioId", om.valueToTree(this.getPortfolioId()));
            data.set("principalId", om.valueToTree(this.getPrincipalId()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getAcceptLanguage() != null) {
                data.set("acceptLanguage", om.valueToTree(this.getAcceptLanguage()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getShareTagOptions() != null) {
                data.set("shareTagOptions", om.valueToTree(this.getShareTagOptions()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getWaitForAcceptance() != null) {
                data.set("waitForAcceptance", om.valueToTree(this.getWaitForAcceptance()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.servicecatalog.ServicecatalogPortfolioShareConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServicecatalogPortfolioShareConfig.Jsii$Proxy that = (ServicecatalogPortfolioShareConfig.Jsii$Proxy) o;

            if (!portfolioId.equals(that.portfolioId)) return false;
            if (!principalId.equals(that.principalId)) return false;
            if (!type.equals(that.type)) return false;
            if (this.acceptLanguage != null ? !this.acceptLanguage.equals(that.acceptLanguage) : that.acceptLanguage != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.shareTagOptions != null ? !this.shareTagOptions.equals(that.shareTagOptions) : that.shareTagOptions != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.waitForAcceptance != null ? !this.waitForAcceptance.equals(that.waitForAcceptance) : that.waitForAcceptance != null) return false;
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
            int result = this.portfolioId.hashCode();
            result = 31 * result + (this.principalId.hashCode());
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.acceptLanguage != null ? this.acceptLanguage.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.shareTagOptions != null ? this.shareTagOptions.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.waitForAcceptance != null ? this.waitForAcceptance.hashCode() : 0);
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
