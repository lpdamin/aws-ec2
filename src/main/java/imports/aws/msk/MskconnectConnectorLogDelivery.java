package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.987Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorLogDelivery")
@software.amazon.jsii.Jsii.Proxy(MskconnectConnectorLogDelivery.Jsii$Proxy.class)
public interface MskconnectConnectorLogDelivery extends software.amazon.jsii.JsiiSerializable {

    /**
     * worker_log_delivery block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#worker_log_delivery MskconnectConnector#worker_log_delivery}
     */
    @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery getWorkerLogDelivery();

    /**
     * @return a {@link Builder} of {@link MskconnectConnectorLogDelivery}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectConnectorLogDelivery}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectConnectorLogDelivery> {
        imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery workerLogDelivery;

        /**
         * Sets the value of {@link MskconnectConnectorLogDelivery#getWorkerLogDelivery}
         * @param workerLogDelivery worker_log_delivery block. This parameter is required.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#worker_log_delivery MskconnectConnector#worker_log_delivery}
         * @return {@code this}
         */
        public Builder workerLogDelivery(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery workerLogDelivery) {
            this.workerLogDelivery = workerLogDelivery;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectConnectorLogDelivery}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectConnectorLogDelivery build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectConnectorLogDelivery}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectConnectorLogDelivery {
        private final imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery workerLogDelivery;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.workerLogDelivery = software.amazon.jsii.Kernel.get(this, "workerLogDelivery", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.workerLogDelivery = java.util.Objects.requireNonNull(builder.workerLogDelivery, "workerLogDelivery is required");
        }

        @Override
        public final imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery getWorkerLogDelivery() {
            return this.workerLogDelivery;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("workerLogDelivery", om.valueToTree(this.getWorkerLogDelivery()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectConnectorLogDelivery"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectConnectorLogDelivery.Jsii$Proxy that = (MskconnectConnectorLogDelivery.Jsii$Proxy) o;

            return this.workerLogDelivery.equals(that.workerLogDelivery);
        }

        @Override
        public final int hashCode() {
            int result = this.workerLogDelivery.hashCode();
            return result;
        }
    }
}
