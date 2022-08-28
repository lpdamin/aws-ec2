package imports.aws.servicecatalog;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.644Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicecatalog.ServicecatalogPrincipalPortfolioAssociationTimeouts")
@software.amazon.jsii.Jsii.Proxy(ServicecatalogPrincipalPortfolioAssociationTimeouts.Jsii$Proxy.class)
public interface ServicecatalogPrincipalPortfolioAssociationTimeouts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_principal_portfolio_association#create ServicecatalogPrincipalPortfolioAssociation#create}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_principal_portfolio_association#delete ServicecatalogPrincipalPortfolioAssociation#delete}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDelete() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_principal_portfolio_association#read ServicecatalogPrincipalPortfolioAssociation#read}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRead() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServicecatalogPrincipalPortfolioAssociationTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServicecatalogPrincipalPortfolioAssociationTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServicecatalogPrincipalPortfolioAssociationTimeouts> {
        java.lang.String create;
        java.lang.String delete;
        java.lang.String read;

        /**
         * Sets the value of {@link ServicecatalogPrincipalPortfolioAssociationTimeouts#getCreate}
         * @param create Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_principal_portfolio_association#create ServicecatalogPrincipalPortfolioAssociation#create}.
         * @return {@code this}
         */
        public Builder create(java.lang.String create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPrincipalPortfolioAssociationTimeouts#getDelete}
         * @param delete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_principal_portfolio_association#delete ServicecatalogPrincipalPortfolioAssociation#delete}.
         * @return {@code this}
         */
        public Builder delete(java.lang.String delete) {
            this.delete = delete;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogPrincipalPortfolioAssociationTimeouts#getRead}
         * @param read Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_principal_portfolio_association#read ServicecatalogPrincipalPortfolioAssociation#read}.
         * @return {@code this}
         */
        public Builder read(java.lang.String read) {
            this.read = read;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServicecatalogPrincipalPortfolioAssociationTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServicecatalogPrincipalPortfolioAssociationTimeouts build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServicecatalogPrincipalPortfolioAssociationTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServicecatalogPrincipalPortfolioAssociationTimeouts {
        private final java.lang.String create;
        private final java.lang.String delete;
        private final java.lang.String read;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.delete = software.amazon.jsii.Kernel.get(this, "delete", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.read = software.amazon.jsii.Kernel.get(this, "read", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.create = builder.create;
            this.delete = builder.delete;
            this.read = builder.read;
        }

        @Override
        public final java.lang.String getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.String getDelete() {
            return this.delete;
        }

        @Override
        public final java.lang.String getRead() {
            return this.read;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getDelete() != null) {
                data.set("delete", om.valueToTree(this.getDelete()));
            }
            if (this.getRead() != null) {
                data.set("read", om.valueToTree(this.getRead()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.servicecatalog.ServicecatalogPrincipalPortfolioAssociationTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServicecatalogPrincipalPortfolioAssociationTimeouts.Jsii$Proxy that = (ServicecatalogPrincipalPortfolioAssociationTimeouts.Jsii$Proxy) o;

            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.delete != null ? !this.delete.equals(that.delete) : that.delete != null) return false;
            return this.read != null ? this.read.equals(that.read) : that.read == null;
        }

        @Override
        public final int hashCode() {
            int result = this.create != null ? this.create.hashCode() : 0;
            result = 31 * result + (this.delete != null ? this.delete.hashCode() : 0);
            result = 31 * result + (this.read != null ? this.read.hashCode() : 0);
            return result;
        }
    }
}
