package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.478Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleTimestreamDimension")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleTimestreamDimension.Jsii$Proxy.class)
public interface IotTopicRuleTimestreamDimension extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#name IotTopicRule#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#value IotTopicRule#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleTimestreamDimension}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleTimestreamDimension}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleTimestreamDimension> {
        java.lang.String name;
        java.lang.String value;

        /**
         * Sets the value of {@link IotTopicRuleTimestreamDimension#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#name IotTopicRule#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleTimestreamDimension#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#value IotTopicRule#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleTimestreamDimension}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleTimestreamDimension build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleTimestreamDimension}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleTimestreamDimension {
        private final java.lang.String name;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("value", om.valueToTree(this.getValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iot.IotTopicRuleTimestreamDimension"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleTimestreamDimension.Jsii$Proxy that = (IotTopicRuleTimestreamDimension.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.value.equals(that.value);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value.hashCode());
            return result;
        }
    }
}
