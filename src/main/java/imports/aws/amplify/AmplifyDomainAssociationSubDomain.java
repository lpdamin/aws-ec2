package imports.aws.amplify;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.443Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.amplify.AmplifyDomainAssociationSubDomain")
@software.amazon.jsii.Jsii.Proxy(AmplifyDomainAssociationSubDomain.Jsii$Proxy.class)
public interface AmplifyDomainAssociationSubDomain extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_domain_association#branch_name AmplifyDomainAssociation#branch_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBranchName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_domain_association#prefix AmplifyDomainAssociation#prefix}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPrefix();

    /**
     * @return a {@link Builder} of {@link AmplifyDomainAssociationSubDomain}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AmplifyDomainAssociationSubDomain}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AmplifyDomainAssociationSubDomain> {
        java.lang.String branchName;
        java.lang.String prefix;

        /**
         * Sets the value of {@link AmplifyDomainAssociationSubDomain#getBranchName}
         * @param branchName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_domain_association#branch_name AmplifyDomainAssociation#branch_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder branchName(java.lang.String branchName) {
            this.branchName = branchName;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyDomainAssociationSubDomain#getPrefix}
         * @param prefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_domain_association#prefix AmplifyDomainAssociation#prefix}. This parameter is required.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AmplifyDomainAssociationSubDomain}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AmplifyDomainAssociationSubDomain build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AmplifyDomainAssociationSubDomain}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AmplifyDomainAssociationSubDomain {
        private final java.lang.String branchName;
        private final java.lang.String prefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.branchName = software.amazon.jsii.Kernel.get(this, "branchName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.branchName = java.util.Objects.requireNonNull(builder.branchName, "branchName is required");
            this.prefix = java.util.Objects.requireNonNull(builder.prefix, "prefix is required");
        }

        @Override
        public final java.lang.String getBranchName() {
            return this.branchName;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("branchName", om.valueToTree(this.getBranchName()));
            data.set("prefix", om.valueToTree(this.getPrefix()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.amplify.AmplifyDomainAssociationSubDomain"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AmplifyDomainAssociationSubDomain.Jsii$Proxy that = (AmplifyDomainAssociationSubDomain.Jsii$Proxy) o;

            if (!branchName.equals(that.branchName)) return false;
            return this.prefix.equals(that.prefix);
        }

        @Override
        public final int hashCode() {
            int result = this.branchName.hashCode();
            result = 31 * result + (this.prefix.hashCode());
            return result;
        }
    }
}
