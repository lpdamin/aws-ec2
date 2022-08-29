package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.461Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleErrorActionHttp")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleErrorActionHttp.Jsii$Proxy.class)
public interface IotTopicRuleErrorActionHttp extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#url IotTopicRule#url}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUrl();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#confirmation_url IotTopicRule#confirmation_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConfirmationUrl() {
        return null;
    }

    /**
     * http_header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#http_header IotTopicRule#http_header}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHttpHeader() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleErrorActionHttp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleErrorActionHttp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleErrorActionHttp> {
        java.lang.String url;
        java.lang.String confirmationUrl;
        java.lang.Object httpHeader;

        /**
         * Sets the value of {@link IotTopicRuleErrorActionHttp#getUrl}
         * @param url Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#url IotTopicRule#url}. This parameter is required.
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionHttp#getConfirmationUrl}
         * @param confirmationUrl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#confirmation_url IotTopicRule#confirmation_url}.
         * @return {@code this}
         */
        public Builder confirmationUrl(java.lang.String confirmationUrl) {
            this.confirmationUrl = confirmationUrl;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionHttp#getHttpHeader}
         * @param httpHeader http_header block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#http_header IotTopicRule#http_header}
         * @return {@code this}
         */
        public Builder httpHeader(com.hashicorp.cdktf.IResolvable httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleErrorActionHttp#getHttpHeader}
         * @param httpHeader http_header block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#http_header IotTopicRule#http_header}
         * @return {@code this}
         */
        public Builder httpHeader(java.util.List<? extends imports.aws.iot.IotTopicRuleErrorActionHttpHttpHeader> httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleErrorActionHttp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleErrorActionHttp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleErrorActionHttp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleErrorActionHttp {
        private final java.lang.String url;
        private final java.lang.String confirmationUrl;
        private final java.lang.Object httpHeader;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.url = software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.confirmationUrl = software.amazon.jsii.Kernel.get(this, "confirmationUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpHeader = software.amazon.jsii.Kernel.get(this, "httpHeader", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.url = java.util.Objects.requireNonNull(builder.url, "url is required");
            this.confirmationUrl = builder.confirmationUrl;
            this.httpHeader = builder.httpHeader;
        }

        @Override
        public final java.lang.String getUrl() {
            return this.url;
        }

        @Override
        public final java.lang.String getConfirmationUrl() {
            return this.confirmationUrl;
        }

        @Override
        public final java.lang.Object getHttpHeader() {
            return this.httpHeader;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("url", om.valueToTree(this.getUrl()));
            if (this.getConfirmationUrl() != null) {
                data.set("confirmationUrl", om.valueToTree(this.getConfirmationUrl()));
            }
            if (this.getHttpHeader() != null) {
                data.set("httpHeader", om.valueToTree(this.getHttpHeader()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iot.IotTopicRuleErrorActionHttp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleErrorActionHttp.Jsii$Proxy that = (IotTopicRuleErrorActionHttp.Jsii$Proxy) o;

            if (!url.equals(that.url)) return false;
            if (this.confirmationUrl != null ? !this.confirmationUrl.equals(that.confirmationUrl) : that.confirmationUrl != null) return false;
            return this.httpHeader != null ? this.httpHeader.equals(that.httpHeader) : that.httpHeader == null;
        }

        @Override
        public final int hashCode() {
            int result = this.url.hashCode();
            result = 31 * result + (this.confirmationUrl != null ? this.confirmationUrl.hashCode() : 0);
            result = 31 * result + (this.httpHeader != null ? this.httpHeader.hashCode() : 0);
            return result;
        }
    }
}
