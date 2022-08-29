package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.888Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.DataAwsBatchJobQueueComputeEnvironmentOrder")
@software.amazon.jsii.Jsii.Proxy(DataAwsBatchJobQueueComputeEnvironmentOrder.Jsii$Proxy.class)
public interface DataAwsBatchJobQueueComputeEnvironmentOrder extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link DataAwsBatchJobQueueComputeEnvironmentOrder}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsBatchJobQueueComputeEnvironmentOrder}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsBatchJobQueueComputeEnvironmentOrder> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsBatchJobQueueComputeEnvironmentOrder}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsBatchJobQueueComputeEnvironmentOrder build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsBatchJobQueueComputeEnvironmentOrder}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsBatchJobQueueComputeEnvironmentOrder {

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
            struct.set("fqn", om.valueToTree("hashicorp_aws.batch.DataAwsBatchJobQueueComputeEnvironmentOrder"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
