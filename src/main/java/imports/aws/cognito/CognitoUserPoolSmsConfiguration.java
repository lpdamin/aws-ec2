package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.190Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolSmsConfiguration")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolSmsConfiguration.Jsii$Proxy.class)
public interface CognitoUserPoolSmsConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#external_id CognitoUserPool#external_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExternalId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sns_caller_arn CognitoUserPool#sns_caller_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSnsCallerArn();

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolSmsConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolSmsConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolSmsConfiguration> {
        java.lang.String externalId;
        java.lang.String snsCallerArn;

        /**
         * Sets the value of {@link CognitoUserPoolSmsConfiguration#getExternalId}
         * @param externalId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#external_id CognitoUserPool#external_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder externalId(java.lang.String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolSmsConfiguration#getSnsCallerArn}
         * @param snsCallerArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sns_caller_arn CognitoUserPool#sns_caller_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder snsCallerArn(java.lang.String snsCallerArn) {
            this.snsCallerArn = snsCallerArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolSmsConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolSmsConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolSmsConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolSmsConfiguration {
        private final java.lang.String externalId;
        private final java.lang.String snsCallerArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.externalId = software.amazon.jsii.Kernel.get(this, "externalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snsCallerArn = software.amazon.jsii.Kernel.get(this, "snsCallerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.externalId = java.util.Objects.requireNonNull(builder.externalId, "externalId is required");
            this.snsCallerArn = java.util.Objects.requireNonNull(builder.snsCallerArn, "snsCallerArn is required");
        }

        @Override
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        @Override
        public final java.lang.String getSnsCallerArn() {
            return this.snsCallerArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("externalId", om.valueToTree(this.getExternalId()));
            data.set("snsCallerArn", om.valueToTree(this.getSnsCallerArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoUserPoolSmsConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolSmsConfiguration.Jsii$Proxy that = (CognitoUserPoolSmsConfiguration.Jsii$Proxy) o;

            if (!externalId.equals(that.externalId)) return false;
            return this.snsCallerArn.equals(that.snsCallerArn);
        }

        @Override
        public final int hashCode() {
            int result = this.externalId.hashCode();
            result = 31 * result + (this.snsCallerArn.hashCode());
            return result;
        }
    }
}
