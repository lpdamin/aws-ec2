package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.741Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexBotAbortStatement")
@software.amazon.jsii.Jsii.Proxy(LexBotAbortStatement.Jsii$Proxy.class)
public interface LexBotAbortStatement extends software.amazon.jsii.JsiiSerializable {

    /**
     * message block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#message LexBot#message}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getMessage();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#response_card LexBot#response_card}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResponseCard() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LexBotAbortStatement}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LexBotAbortStatement}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LexBotAbortStatement> {
        java.lang.Object message;
        java.lang.String responseCard;

        /**
         * Sets the value of {@link LexBotAbortStatement#getMessage}
         * @param message message block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#message LexBot#message}
         * @return {@code this}
         */
        public Builder message(com.hashicorp.cdktf.IResolvable message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link LexBotAbortStatement#getMessage}
         * @param message message block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#message LexBot#message}
         * @return {@code this}
         */
        public Builder message(java.util.List<? extends imports.aws.lex.LexBotAbortStatementMessage> message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link LexBotAbortStatement#getResponseCard}
         * @param responseCard Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#response_card LexBot#response_card}.
         * @return {@code this}
         */
        public Builder responseCard(java.lang.String responseCard) {
            this.responseCard = responseCard;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LexBotAbortStatement}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LexBotAbortStatement build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LexBotAbortStatement}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LexBotAbortStatement {
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.lex.LexBotAbortStatement"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LexBotAbortStatement.Jsii$Proxy that = (LexBotAbortStatement.Jsii$Proxy) o;

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
