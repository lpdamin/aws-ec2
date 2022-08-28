package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.595Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleLambda")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleLambda.Jsii$Proxy.class)
public interface IotTopicRuleLambda extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#function_arn IotTopicRule#function_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFunctionArn();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleLambda}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleLambda}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleLambda> {
        java.lang.String functionArn;

        /**
         * Sets the value of {@link IotTopicRuleLambda#getFunctionArn}
         * @param functionArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#function_arn IotTopicRule#function_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder functionArn(java.lang.String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleLambda}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleLambda build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleLambda}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleLambda {
        private final java.lang.String functionArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.functionArn = software.amazon.jsii.Kernel.get(this, "functionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.functionArn = java.util.Objects.requireNonNull(builder.functionArn, "functionArn is required");
        }

        @Override
        public final java.lang.String getFunctionArn() {
            return this.functionArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("functionArn", om.valueToTree(this.getFunctionArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iot.IotTopicRuleLambda"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleLambda.Jsii$Proxy that = (IotTopicRuleLambda.Jsii$Proxy) o;

            return this.functionArn.equals(that.functionArn);
        }

        @Override
        public final int hashCode() {
            int result = this.functionArn.hashCode();
            return result;
        }
    }
}
