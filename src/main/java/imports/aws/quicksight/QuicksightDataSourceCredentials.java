package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.170Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceCredentials")
@software.amazon.jsii.Jsii.Proxy(QuicksightDataSourceCredentials.Jsii$Proxy.class)
public interface QuicksightDataSourceCredentials extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#copy_source_arn QuicksightDataSource#copy_source_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCopySourceArn() {
        return null;
    }

    /**
     * credential_pair block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#credential_pair QuicksightDataSource#credential_pair}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair getCredentialPair() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link QuicksightDataSourceCredentials}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link QuicksightDataSourceCredentials}
     */
    public static final class Builder implements software.amazon.jsii.Builder<QuicksightDataSourceCredentials> {
        java.lang.String copySourceArn;
        imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair credentialPair;

        /**
         * Sets the value of {@link QuicksightDataSourceCredentials#getCopySourceArn}
         * @param copySourceArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#copy_source_arn QuicksightDataSource#copy_source_arn}.
         * @return {@code this}
         */
        public Builder copySourceArn(java.lang.String copySourceArn) {
            this.copySourceArn = copySourceArn;
            return this;
        }

        /**
         * Sets the value of {@link QuicksightDataSourceCredentials#getCredentialPair}
         * @param credentialPair credential_pair block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#credential_pair QuicksightDataSource#credential_pair}
         * @return {@code this}
         */
        public Builder credentialPair(imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair credentialPair) {
            this.credentialPair = credentialPair;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link QuicksightDataSourceCredentials}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public QuicksightDataSourceCredentials build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link QuicksightDataSourceCredentials}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements QuicksightDataSourceCredentials {
        private final java.lang.String copySourceArn;
        private final imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair credentialPair;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.copySourceArn = software.amazon.jsii.Kernel.get(this, "copySourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.credentialPair = software.amazon.jsii.Kernel.get(this, "credentialPair", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.copySourceArn = builder.copySourceArn;
            this.credentialPair = builder.credentialPair;
        }

        @Override
        public final java.lang.String getCopySourceArn() {
            return this.copySourceArn;
        }

        @Override
        public final imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair getCredentialPair() {
            return this.credentialPair;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCopySourceArn() != null) {
                data.set("copySourceArn", om.valueToTree(this.getCopySourceArn()));
            }
            if (this.getCredentialPair() != null) {
                data.set("credentialPair", om.valueToTree(this.getCredentialPair()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.quicksight.QuicksightDataSourceCredentials"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            QuicksightDataSourceCredentials.Jsii$Proxy that = (QuicksightDataSourceCredentials.Jsii$Proxy) o;

            if (this.copySourceArn != null ? !this.copySourceArn.equals(that.copySourceArn) : that.copySourceArn != null) return false;
            return this.credentialPair != null ? this.credentialPair.equals(that.credentialPair) : that.credentialPair == null;
        }

        @Override
        public final int hashCode() {
            int result = this.copySourceArn != null ? this.copySourceArn.hashCode() : 0;
            result = 31 * result + (this.credentialPair != null ? this.credentialPair.hashCode() : 0);
            return result;
        }
    }
}
