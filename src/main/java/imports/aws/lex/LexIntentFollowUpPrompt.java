package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.748Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexIntentFollowUpPrompt")
@software.amazon.jsii.Jsii.Proxy(LexIntentFollowUpPrompt.Jsii$Proxy.class)
public interface LexIntentFollowUpPrompt extends software.amazon.jsii.JsiiSerializable {

    /**
     * prompt block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#prompt LexIntent#prompt}
     */
    @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFollowUpPromptPrompt getPrompt();

    /**
     * rejection_statement block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#rejection_statement LexIntent#rejection_statement}
     */
    @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFollowUpPromptRejectionStatement getRejectionStatement();

    /**
     * @return a {@link Builder} of {@link LexIntentFollowUpPrompt}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LexIntentFollowUpPrompt}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LexIntentFollowUpPrompt> {
        imports.aws.lex.LexIntentFollowUpPromptPrompt prompt;
        imports.aws.lex.LexIntentFollowUpPromptRejectionStatement rejectionStatement;

        /**
         * Sets the value of {@link LexIntentFollowUpPrompt#getPrompt}
         * @param prompt prompt block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#prompt LexIntent#prompt}
         * @return {@code this}
         */
        public Builder prompt(imports.aws.lex.LexIntentFollowUpPromptPrompt prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * Sets the value of {@link LexIntentFollowUpPrompt#getRejectionStatement}
         * @param rejectionStatement rejection_statement block. This parameter is required.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#rejection_statement LexIntent#rejection_statement}
         * @return {@code this}
         */
        public Builder rejectionStatement(imports.aws.lex.LexIntentFollowUpPromptRejectionStatement rejectionStatement) {
            this.rejectionStatement = rejectionStatement;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LexIntentFollowUpPrompt}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LexIntentFollowUpPrompt build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LexIntentFollowUpPrompt}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LexIntentFollowUpPrompt {
        private final imports.aws.lex.LexIntentFollowUpPromptPrompt prompt;
        private final imports.aws.lex.LexIntentFollowUpPromptRejectionStatement rejectionStatement;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prompt = software.amazon.jsii.Kernel.get(this, "prompt", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFollowUpPromptPrompt.class));
            this.rejectionStatement = software.amazon.jsii.Kernel.get(this, "rejectionStatement", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFollowUpPromptRejectionStatement.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prompt = java.util.Objects.requireNonNull(builder.prompt, "prompt is required");
            this.rejectionStatement = java.util.Objects.requireNonNull(builder.rejectionStatement, "rejectionStatement is required");
        }

        @Override
        public final imports.aws.lex.LexIntentFollowUpPromptPrompt getPrompt() {
            return this.prompt;
        }

        @Override
        public final imports.aws.lex.LexIntentFollowUpPromptRejectionStatement getRejectionStatement() {
            return this.rejectionStatement;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("prompt", om.valueToTree(this.getPrompt()));
            data.set("rejectionStatement", om.valueToTree(this.getRejectionStatement()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lex.LexIntentFollowUpPrompt"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LexIntentFollowUpPrompt.Jsii$Proxy that = (LexIntentFollowUpPrompt.Jsii$Proxy) o;

            if (!prompt.equals(that.prompt)) return false;
            return this.rejectionStatement.equals(that.rejectionStatement);
        }

        @Override
        public final int hashCode() {
            int result = this.prompt.hashCode();
            result = 31 * result + (this.rejectionStatement.hashCode());
            return result;
        }
    }
}
