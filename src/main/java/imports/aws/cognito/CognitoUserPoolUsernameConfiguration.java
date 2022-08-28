package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.755Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolUsernameConfiguration")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolUsernameConfiguration.Jsii$Proxy.class)
public interface CognitoUserPoolUsernameConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#case_sensitive CognitoUserPool#case_sensitive}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getCaseSensitive();

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolUsernameConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolUsernameConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolUsernameConfiguration> {
        java.lang.Object caseSensitive;

        /**
         * Sets the value of {@link CognitoUserPoolUsernameConfiguration#getCaseSensitive}
         * @param caseSensitive Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#case_sensitive CognitoUserPool#case_sensitive}. This parameter is required.
         * @return {@code this}
         */
        public Builder caseSensitive(java.lang.Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolUsernameConfiguration#getCaseSensitive}
         * @param caseSensitive Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#case_sensitive CognitoUserPool#case_sensitive}. This parameter is required.
         * @return {@code this}
         */
        public Builder caseSensitive(com.hashicorp.cdktf.IResolvable caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolUsernameConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolUsernameConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolUsernameConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolUsernameConfiguration {
        private final java.lang.Object caseSensitive;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.caseSensitive = software.amazon.jsii.Kernel.get(this, "caseSensitive", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.caseSensitive = java.util.Objects.requireNonNull(builder.caseSensitive, "caseSensitive is required");
        }

        @Override
        public final java.lang.Object getCaseSensitive() {
            return this.caseSensitive;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("caseSensitive", om.valueToTree(this.getCaseSensitive()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoUserPoolUsernameConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolUsernameConfiguration.Jsii$Proxy that = (CognitoUserPoolUsernameConfiguration.Jsii$Proxy) o;

            return this.caseSensitive.equals(that.caseSensitive);
        }

        @Override
        public final int hashCode() {
            int result = this.caseSensitive.hashCode();
            return result;
        }
    }
}
