package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.673Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail")
@software.amazon.jsii.Jsii.Proxy(CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail.Jsii$Proxy.class)
public interface CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#html_body CognitoRiskConfiguration#html_body}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getHtmlBody();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#subject CognitoRiskConfiguration#subject}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSubject();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#text_body CognitoRiskConfiguration#text_body}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTextBody();

    /**
     * @return a {@link Builder} of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail> {
        java.lang.String htmlBody;
        java.lang.String subject;
        java.lang.String textBody;

        /**
         * Sets the value of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail#getHtmlBody}
         * @param htmlBody Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#html_body CognitoRiskConfiguration#html_body}. This parameter is required.
         * @return {@code this}
         */
        public Builder htmlBody(java.lang.String htmlBody) {
            this.htmlBody = htmlBody;
            return this;
        }

        /**
         * Sets the value of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail#getSubject}
         * @param subject Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#subject CognitoRiskConfiguration#subject}. This parameter is required.
         * @return {@code this}
         */
        public Builder subject(java.lang.String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Sets the value of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail#getTextBody}
         * @param textBody Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#text_body CognitoRiskConfiguration#text_body}. This parameter is required.
         * @return {@code this}
         */
        public Builder textBody(java.lang.String textBody) {
            this.textBody = textBody;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail {
        private final java.lang.String htmlBody;
        private final java.lang.String subject;
        private final java.lang.String textBody;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.htmlBody = software.amazon.jsii.Kernel.get(this, "htmlBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subject = software.amazon.jsii.Kernel.get(this, "subject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.textBody = software.amazon.jsii.Kernel.get(this, "textBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.htmlBody = java.util.Objects.requireNonNull(builder.htmlBody, "htmlBody is required");
            this.subject = java.util.Objects.requireNonNull(builder.subject, "subject is required");
            this.textBody = java.util.Objects.requireNonNull(builder.textBody, "textBody is required");
        }

        @Override
        public final java.lang.String getHtmlBody() {
            return this.htmlBody;
        }

        @Override
        public final java.lang.String getSubject() {
            return this.subject;
        }

        @Override
        public final java.lang.String getTextBody() {
            return this.textBody;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("htmlBody", om.valueToTree(this.getHtmlBody()));
            data.set("subject", om.valueToTree(this.getSubject()));
            data.set("textBody", om.valueToTree(this.getTextBody()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail.Jsii$Proxy that = (CognitoRiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationBlockEmail.Jsii$Proxy) o;

            if (!htmlBody.equals(that.htmlBody)) return false;
            if (!subject.equals(that.subject)) return false;
            return this.textBody.equals(that.textBody);
        }

        @Override
        public final int hashCode() {
            int result = this.htmlBody.hashCode();
            result = 31 * result + (this.subject.hashCode());
            result = 31 * result + (this.textBody.hashCode());
            return result;
        }
    }
}
