package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.847Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexIntentRejectionStatement")
@software.amazon.jsii.Jsii.Proxy(LexIntentRejectionStatement.Jsii$Proxy.class)
public interface LexIntentRejectionStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * message block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#message LexIntent#message}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getMessage();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#response_card LexIntent#response_card}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResponseCard() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LexIntentRejectionStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LexIntentRejectionStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LexIntentRejectionStatement> {
        java.lang.Object message;
        java.lang.String responseCard;

        /**
         * Sets the value of {@link LexIntentRejectionStatement#getMessage}
         * @param message message block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#message LexIntent#message}
         * @return {@code this}
         */
        public Builder message(com.hashicorp.cdktf.IResolvable message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link LexIntentRejectionStatement#getMessage}
         * @param message message block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#message LexIntent#message}
         * @return {@code this}
         */
        public Builder message(java.util.List<? extends imports.aws.lex.LexIntentRejectionStatementMessage> message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link LexIntentRejectionStatement#getResponseCard}
         * @param responseCard Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#response_card LexIntent#response_card}.
         * @return {@code this}
         */
        public Builder responseCard(java.lang.String responseCard) {
            this.responseCard = responseCard;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LexIntentRejectionStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LexIntentRejectionStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LexIntentRejectionStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LexIntentRejectionStatement {
        private final java.lang.Object message;
        private final java.lang.String responseCard;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.responseCard = software.amazon.jsii.Kernel.get(this, "responseCard", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.message = java.util.Objects.requireNonNull(builder.message, "message is required");
            this.responseCard = builder.responseCard;
        }

        @Override
        public final java.lang.Object getMessage() {
            return this.message;
        }

        @Override
        public final java.lang.String getResponseCard() {
            return this.responseCard;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("message", om.valueToTree(this.getMessage()));
            if (this.getResponseCard() != null) {
                data.set("responseCard", om.valueToTree(this.getResponseCard()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lex.LexIntentRejectionStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LexIntentRejectionStatement.Jsii$Proxy that = (LexIntentRejectionStatement.Jsii$Proxy) o;

            if (!message.equals(that.message)) return false;
            return this.responseCard != null ? this.responseCard.equals(that.responseCard) : that.responseCard == null;
        }

        @Override
        public final int hashCode() {
            int result = this.message.hashCode();
            result = 31 * result + (this.responseCard != null ? this.responseCard.hashCode() : 0);
            return result;
        }
    }
}
