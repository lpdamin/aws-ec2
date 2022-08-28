package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.757Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexIntentFollowUpPromptRejectionStatementMessage")
@software.amazon.jsii.Jsii.Proxy(LexIntentFollowUpPromptRejectionStatementMessage.Jsii$Proxy.class)
public interface LexIntentFollowUpPromptRejectionStatementMessage extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#content LexIntent#content}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContent();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#content_type LexIntent#content_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContentType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#group_number LexIntent#group_number}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getGroupNumber() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LexIntentFollowUpPromptRejectionStatementMessage}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LexIntentFollowUpPromptRejectionStatementMessage}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LexIntentFollowUpPromptRejectionStatementMessage> {
        java.lang.String content;
        java.lang.String contentType;
        java.lang.Number groupNumber;

        /**
         * Sets the value of {@link LexIntentFollowUpPromptRejectionStatementMessage#getContent}
         * @param content Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#content LexIntent#content}. This parameter is required.
         * @return {@code this}
         */
        public Builder content(java.lang.String content) {
            this.content = content;
            return this;
        }

        /**
         * Sets the value of {@link LexIntentFollowUpPromptRejectionStatementMessage#getContentType}
         * @param contentType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#content_type LexIntent#content_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder contentType(java.lang.String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the value of {@link LexIntentFollowUpPromptRejectionStatementMessage#getGroupNumber}
         * @param groupNumber Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#group_number LexIntent#group_number}.
         * @return {@code this}
         */
        public Builder groupNumber(java.lang.Number groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LexIntentFollowUpPromptRejectionStatementMessage}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LexIntentFollowUpPromptRejectionStatementMessage build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LexIntentFollowUpPromptRejectionStatementMessage}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LexIntentFollowUpPromptRejectionStatementMessage {
        private final java.lang.String content;
        private final java.lang.String contentType;
        private final java.lang.Number groupNumber;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.content = software.amazon.jsii.Kernel.get(this, "content", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.contentType = software.amazon.jsii.Kernel.get(this, "contentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupNumber = software.amazon.jsii.Kernel.get(this, "groupNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.content = java.util.Objects.requireNonNull(builder.content, "content is required");
            this.contentType = java.util.Objects.requireNonNull(builder.contentType, "contentType is required");
            this.groupNumber = builder.groupNumber;
        }

        @Override
        public final java.lang.String getContent() {
            return this.content;
        }

        @Override
        public final java.lang.String getContentType() {
            return this.contentType;
        }

        @Override
        public final java.lang.Number getGroupNumber() {
            return this.groupNumber;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("content", om.valueToTree(this.getContent()));
            data.set("contentType", om.valueToTree(this.getContentType()));
            if (this.getGroupNumber() != null) {
                data.set("groupNumber", om.valueToTree(this.getGroupNumber()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lex.LexIntentFollowUpPromptRejectionStatementMessage"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LexIntentFollowUpPromptRejectionStatementMessage.Jsii$Proxy that = (LexIntentFollowUpPromptRejectionStatementMessage.Jsii$Proxy) o;

            if (!content.equals(that.content)) return false;
            if (!contentType.equals(that.contentType)) return false;
            return this.groupNumber != null ? this.groupNumber.equals(that.groupNumber) : that.groupNumber == null;
        }

        @Override
        public final int hashCode() {
            int result = this.content.hashCode();
            result = 31 * result + (this.contentType.hashCode());
            result = 31 * result + (this.groupNumber != null ? this.groupNumber.hashCode() : 0);
            return result;
        }
    }
}
