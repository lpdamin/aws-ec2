package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.363Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.OpensearchDomainAdvancedSecurityOptionsMasterUserOptions")
@software.amazon.jsii.Jsii.Proxy(OpensearchDomainAdvancedSecurityOptionsMasterUserOptions.Jsii$Proxy.class)
public interface OpensearchDomainAdvancedSecurityOptionsMasterUserOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#master_user_arn OpensearchDomain#master_user_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMasterUserArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#master_user_name OpensearchDomain#master_user_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMasterUserName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#master_user_password OpensearchDomain#master_user_password}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMasterUserPassword() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpensearchDomainAdvancedSecurityOptionsMasterUserOptions> {
        java.lang.String masterUserArn;
        java.lang.String masterUserName;
        java.lang.String masterUserPassword;

        /**
         * Sets the value of {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions#getMasterUserArn}
         * @param masterUserArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#master_user_arn OpensearchDomain#master_user_arn}.
         * @return {@code this}
         */
        public Builder masterUserArn(java.lang.String masterUserArn) {
            this.masterUserArn = masterUserArn;
            return this;
        }

        /**
         * Sets the value of {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions#getMasterUserName}
         * @param masterUserName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#master_user_name OpensearchDomain#master_user_name}.
         * @return {@code this}
         */
        public Builder masterUserName(java.lang.String masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }

        /**
         * Sets the value of {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions#getMasterUserPassword}
         * @param masterUserPassword Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#master_user_password OpensearchDomain#master_user_password}.
         * @return {@code this}
         */
        public Builder masterUserPassword(java.lang.String masterUserPassword) {
            this.masterUserPassword = masterUserPassword;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpensearchDomainAdvancedSecurityOptionsMasterUserOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link OpensearchDomainAdvancedSecurityOptionsMasterUserOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpensearchDomainAdvancedSecurityOptionsMasterUserOptions {
        private final java.lang.String masterUserArn;
        private final java.lang.String masterUserName;
        private final java.lang.String masterUserPassword;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.masterUserArn = software.amazon.jsii.Kernel.get(this, "masterUserArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.masterUserName = software.amazon.jsii.Kernel.get(this, "masterUserName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.masterUserPassword = software.amazon.jsii.Kernel.get(this, "masterUserPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.masterUserArn = builder.masterUserArn;
            this.masterUserName = builder.masterUserName;
            this.masterUserPassword = builder.masterUserPassword;
        }

        @Override
        public final java.lang.String getMasterUserArn() {
            return this.masterUserArn;
        }

        @Override
        public final java.lang.String getMasterUserName() {
            return this.masterUserName;
        }

        @Override
        public final java.lang.String getMasterUserPassword() {
            return this.masterUserPassword;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMasterUserArn() != null) {
                data.set("masterUserArn", om.valueToTree(this.getMasterUserArn()));
            }
            if (this.getMasterUserName() != null) {
                data.set("masterUserName", om.valueToTree(this.getMasterUserName()));
            }
            if (this.getMasterUserPassword() != null) {
                data.set("masterUserPassword", om.valueToTree(this.getMasterUserPassword()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.OpensearchDomainAdvancedSecurityOptionsMasterUserOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpensearchDomainAdvancedSecurityOptionsMasterUserOptions.Jsii$Proxy that = (OpensearchDomainAdvancedSecurityOptionsMasterUserOptions.Jsii$Proxy) o;

            if (this.masterUserArn != null ? !this.masterUserArn.equals(that.masterUserArn) : that.masterUserArn != null) return false;
            if (this.masterUserName != null ? !this.masterUserName.equals(that.masterUserName) : that.masterUserName != null) return false;
            return this.masterUserPassword != null ? this.masterUserPassword.equals(that.masterUserPassword) : that.masterUserPassword == null;
        }

        @Override
        public final int hashCode() {
            int result = this.masterUserArn != null ? this.masterUserArn.hashCode() : 0;
            result = 31 * result + (this.masterUserName != null ? this.masterUserName.hashCode() : 0);
            result = 31 * result + (this.masterUserPassword != null ? this.masterUserPassword.hashCode() : 0);
            return result;
        }
    }
}
