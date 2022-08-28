package imports.aws.elb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.859Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.LbListenerRuleCondition")
@software.amazon.jsii.Jsii.Proxy(LbListenerRuleCondition.Jsii$Proxy.class)
public interface LbListenerRuleCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     * host_header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#host_header LbListenerRule#host_header}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.LbListenerRuleConditionHostHeader getHostHeader() {
        return null;
    }

    /**
     * http_header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#http_header LbListenerRule#http_header}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.LbListenerRuleConditionHttpHeader getHttpHeader() {
        return null;
    }

    /**
     * http_request_method block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#http_request_method LbListenerRule#http_request_method}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.LbListenerRuleConditionHttpRequestMethod getHttpRequestMethod() {
        return null;
    }

    /**
     * path_pattern block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#path_pattern LbListenerRule#path_pattern}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.LbListenerRuleConditionPathPattern getPathPattern() {
        return null;
    }

    /**
     * query_string block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#query_string LbListenerRule#query_string}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getQueryString() {
        return null;
    }

    /**
     * source_ip block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#source_ip LbListenerRule#source_ip}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.LbListenerRuleConditionSourceIp getSourceIp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbListenerRuleCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbListenerRuleCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbListenerRuleCondition> {
        imports.aws.elb.LbListenerRuleConditionHostHeader hostHeader;
        imports.aws.elb.LbListenerRuleConditionHttpHeader httpHeader;
        imports.aws.elb.LbListenerRuleConditionHttpRequestMethod httpRequestMethod;
        imports.aws.elb.LbListenerRuleConditionPathPattern pathPattern;
        java.lang.Object queryString;
        imports.aws.elb.LbListenerRuleConditionSourceIp sourceIp;

        /**
         * Sets the value of {@link LbListenerRuleCondition#getHostHeader}
         * @param hostHeader host_header block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#host_header LbListenerRule#host_header}
         * @return {@code this}
         */
        public Builder hostHeader(imports.aws.elb.LbListenerRuleConditionHostHeader hostHeader) {
            this.hostHeader = hostHeader;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getHttpHeader}
         * @param httpHeader http_header block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#http_header LbListenerRule#http_header}
         * @return {@code this}
         */
        public Builder httpHeader(imports.aws.elb.LbListenerRuleConditionHttpHeader httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getHttpRequestMethod}
         * @param httpRequestMethod http_request_method block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#http_request_method LbListenerRule#http_request_method}
         * @return {@code this}
         */
        public Builder httpRequestMethod(imports.aws.elb.LbListenerRuleConditionHttpRequestMethod httpRequestMethod) {
            this.httpRequestMethod = httpRequestMethod;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getPathPattern}
         * @param pathPattern path_pattern block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#path_pattern LbListenerRule#path_pattern}
         * @return {@code this}
         */
        public Builder pathPattern(imports.aws.elb.LbListenerRuleConditionPathPattern pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getQueryString}
         * @param queryString query_string block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#query_string LbListenerRule#query_string}
         * @return {@code this}
         */
        public Builder queryString(com.hashicorp.cdktf.IResolvable queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getQueryString}
         * @param queryString query_string block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#query_string LbListenerRule#query_string}
         * @return {@code this}
         */
        public Builder queryString(java.util.List<? extends imports.aws.elb.LbListenerRuleConditionQueryString> queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleCondition#getSourceIp}
         * @param sourceIp source_ip block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#source_ip LbListenerRule#source_ip}
         * @return {@code this}
         */
        public Builder sourceIp(imports.aws.elb.LbListenerRuleConditionSourceIp sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbListenerRuleCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbListenerRuleCondition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LbListenerRuleCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbListenerRuleCondition {
        private final imports.aws.elb.LbListenerRuleConditionHostHeader hostHeader;
        private final imports.aws.elb.LbListenerRuleConditionHttpHeader httpHeader;
        private final imports.aws.elb.LbListenerRuleConditionHttpRequestMethod httpRequestMethod;
        private final imports.aws.elb.LbListenerRuleConditionPathPattern pathPattern;
        private final java.lang.Object queryString;
        private final imports.aws.elb.LbListenerRuleConditionSourceIp sourceIp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.hostHeader = software.amazon.jsii.Kernel.get(this, "hostHeader", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbListenerRuleConditionHostHeader.class));
            this.httpHeader = software.amazon.jsii.Kernel.get(this, "httpHeader", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbListenerRuleConditionHttpHeader.class));
            this.httpRequestMethod = software.amazon.jsii.Kernel.get(this, "httpRequestMethod", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbListenerRuleConditionHttpRequestMethod.class));
            this.pathPattern = software.amazon.jsii.Kernel.get(this, "pathPattern", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbListenerRuleConditionPathPattern.class));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.sourceIp = software.amazon.jsii.Kernel.get(this, "sourceIp", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbListenerRuleConditionSourceIp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.hostHeader = builder.hostHeader;
            this.httpHeader = builder.httpHeader;
            this.httpRequestMethod = builder.httpRequestMethod;
            this.pathPattern = builder.pathPattern;
            this.queryString = builder.queryString;
            this.sourceIp = builder.sourceIp;
        }

        @Override
        public final imports.aws.elb.LbListenerRuleConditionHostHeader getHostHeader() {
            return this.hostHeader;
        }

        @Override
        public final imports.aws.elb.LbListenerRuleConditionHttpHeader getHttpHeader() {
            return this.httpHeader;
        }

        @Override
        public final imports.aws.elb.LbListenerRuleConditionHttpRequestMethod getHttpRequestMethod() {
            return this.httpRequestMethod;
        }

        @Override
        public final imports.aws.elb.LbListenerRuleConditionPathPattern getPathPattern() {
            return this.pathPattern;
        }

        @Override
        public final java.lang.Object getQueryString() {
            return this.queryString;
        }

        @Override
        public final imports.aws.elb.LbListenerRuleConditionSourceIp getSourceIp() {
            return this.sourceIp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHostHeader() != null) {
                data.set("hostHeader", om.valueToTree(this.getHostHeader()));
            }
            if (this.getHttpHeader() != null) {
                data.set("httpHeader", om.valueToTree(this.getHttpHeader()));
            }
            if (this.getHttpRequestMethod() != null) {
                data.set("httpRequestMethod", om.valueToTree(this.getHttpRequestMethod()));
            }
            if (this.getPathPattern() != null) {
                data.set("pathPattern", om.valueToTree(this.getPathPattern()));
            }
            if (this.getQueryString() != null) {
                data.set("queryString", om.valueToTree(this.getQueryString()));
            }
            if (this.getSourceIp() != null) {
                data.set("sourceIp", om.valueToTree(this.getSourceIp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elb.LbListenerRuleCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbListenerRuleCondition.Jsii$Proxy that = (LbListenerRuleCondition.Jsii$Proxy) o;

            if (this.hostHeader != null ? !this.hostHeader.equals(that.hostHeader) : that.hostHeader != null) return false;
            if (this.httpHeader != null ? !this.httpHeader.equals(that.httpHeader) : that.httpHeader != null) return false;
            if (this.httpRequestMethod != null ? !this.httpRequestMethod.equals(that.httpRequestMethod) : that.httpRequestMethod != null) return false;
            if (this.pathPattern != null ? !this.pathPattern.equals(that.pathPattern) : that.pathPattern != null) return false;
            if (this.queryString != null ? !this.queryString.equals(that.queryString) : that.queryString != null) return false;
            return this.sourceIp != null ? this.sourceIp.equals(that.sourceIp) : that.sourceIp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.hostHeader != null ? this.hostHeader.hashCode() : 0;
            result = 31 * result + (this.httpHeader != null ? this.httpHeader.hashCode() : 0);
            result = 31 * result + (this.httpRequestMethod != null ? this.httpRequestMethod.hashCode() : 0);
            result = 31 * result + (this.pathPattern != null ? this.pathPattern.hashCode() : 0);
            result = 31 * result + (this.queryString != null ? this.queryString.hashCode() : 0);
            result = 31 * result + (this.sourceIp != null ? this.sourceIp.hashCode() : 0);
            return result;
        }
    }
}
