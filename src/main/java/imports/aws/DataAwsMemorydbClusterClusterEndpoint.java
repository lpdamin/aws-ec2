package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.215Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsMemorydbClusterClusterEndpoint")
@software.amazon.jsii.Jsii.Proxy(DataAwsMemorydbClusterClusterEndpoint.Jsii$Proxy.class)
public interface DataAwsMemorydbClusterClusterEndpoint extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link DataAwsMemorydbClusterClusterEndpoint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsMemorydbClusterClusterEndpoint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsMemorydbClusterClusterEndpoint> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsMemorydbClusterClusterEndpoint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsMemorydbClusterClusterEndpoint build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsMemorydbClusterClusterEndpoint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsMemorydbClusterClusterEndpoint {

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
            struct.set("fqn", om.valueToTree("hashicorp_aws.DataAwsMemorydbClusterClusterEndpoint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
