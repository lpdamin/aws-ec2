package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.172Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolAccountRecoverySetting")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolAccountRecoverySetting.Jsii$Proxy.class)
public interface CognitoUserPoolAccountRecoverySetting extends software.amazon.jsii.JsiiSerializable {

    /**
     * recovery_mechanism block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#recovery_mechanism CognitoUserPool#recovery_mechanism}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getRecoveryMechanism();

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolAccountRecoverySetting}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolAccountRecoverySetting}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolAccountRecoverySetting> {
        java.lang.Object recoveryMechanism;

        /**
         * Sets the value of {@link CognitoUserPoolAccountRecoverySetting#getRecoveryMechanism}
         * @param recoveryMechanism recovery_mechanism block. This parameter is required.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#recovery_mechanism CognitoUserPool#recovery_mechanism}
         * @return {@code this}
         */
        public Builder recoveryMechanism(com.hashicorp.cdktf.IResolvable recoveryMechanism) {
            this.recoveryMechanism = recoveryMechanism;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolAccountRecoverySetting#getRecoveryMechanism}
         * @param recoveryMechanism recovery_mechanism block. This parameter is required.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#recovery_mechanism CognitoUserPool#recovery_mechanism}
         * @return {@code this}
         */
        public Builder recoveryMechanism(java.util.List<? extends imports.aws.cognito.CognitoUserPoolAccountRecoverySettingRecoveryMechanism> recoveryMechanism) {
            this.recoveryMechanism = recoveryMechanism;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolAccountRecoverySetting}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolAccountRecoverySetting build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolAccountRecoverySetting}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolAccountRecoverySetting {
        private final java.lang.Object recoveryMechanism;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recoveryMechanism = software.amazon.jsii.Kernel.get(this, "recoveryMechanism", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recoveryMechanism = java.util.Objects.requireNonNull(builder.recoveryMechanism, "recoveryMechanism is required");
        }

        @Override
        public final java.lang.Object getRecoveryMechanism() {
            return this.recoveryMechanism;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("recoveryMechanism", om.valueToTree(this.getRecoveryMechanism()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoUserPoolAccountRecoverySetting"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolAccountRecoverySetting.Jsii$Proxy that = (CognitoUserPoolAccountRecoverySetting.Jsii$Proxy) o;

            return this.recoveryMechanism.equals(that.recoveryMechanism);
        }

        @Override
        public final int hashCode() {
            int result = this.recoveryMechanism.hashCode();
            return result;
        }
    }
}
