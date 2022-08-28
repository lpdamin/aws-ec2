package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.754Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolUserPoolAddOns")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolUserPoolAddOns.Jsii$Proxy.class)
public interface CognitoUserPoolUserPoolAddOns extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#advanced_security_mode CognitoUserPool#advanced_security_mode}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAdvancedSecurityMode();

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolUserPoolAddOns}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolUserPoolAddOns}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolUserPoolAddOns> {
        java.lang.String advancedSecurityMode;

        /**
         * Sets the value of {@link CognitoUserPoolUserPoolAddOns#getAdvancedSecurityMode}
         * @param advancedSecurityMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#advanced_security_mode CognitoUserPool#advanced_security_mode}. This parameter is required.
         * @return {@code this}
         */
        public Builder advancedSecurityMode(java.lang.String advancedSecurityMode) {
            this.advancedSecurityMode = advancedSecurityMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolUserPoolAddOns}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolUserPoolAddOns build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolUserPoolAddOns}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolUserPoolAddOns {
        private final java.lang.String advancedSecurityMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.advancedSecurityMode = software.amazon.jsii.Kernel.get(this, "advancedSecurityMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.advancedSecurityMode = java.util.Objects.requireNonNull(builder.advancedSecurityMode, "advancedSecurityMode is required");
        }

        @Override
        public final java.lang.String getAdvancedSecurityMode() {
            return this.advancedSecurityMode;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("advancedSecurityMode", om.valueToTree(this.getAdvancedSecurityMode()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoUserPoolUserPoolAddOns"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolUserPoolAddOns.Jsii$Proxy that = (CognitoUserPoolUserPoolAddOns.Jsii$Proxy) o;

            return this.advancedSecurityMode.equals(that.advancedSecurityMode);
        }

        @Override
        public final int hashCode() {
            int result = this.advancedSecurityMode.hashCode();
            return result;
        }
    }
}
