package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.848Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectRoutingProfileQueueConfigsAssociated")
@software.amazon.jsii.Jsii.Proxy(ConnectRoutingProfileQueueConfigsAssociated.Jsii$Proxy.class)
public interface ConnectRoutingProfileQueueConfigsAssociated extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link ConnectRoutingProfileQueueConfigsAssociated}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConnectRoutingProfileQueueConfigsAssociated}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConnectRoutingProfileQueueConfigsAssociated> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConnectRoutingProfileQueueConfigsAssociated}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConnectRoutingProfileQueueConfigsAssociated build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConnectRoutingProfileQueueConfigsAssociated}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConnectRoutingProfileQueueConfigsAssociated {

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();


            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.connect.ConnectRoutingProfileQueueConfigsAssociated"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
