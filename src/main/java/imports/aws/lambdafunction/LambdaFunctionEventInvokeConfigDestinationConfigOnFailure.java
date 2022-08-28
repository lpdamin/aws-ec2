package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.725Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure")
@software.amazon.jsii.Jsii.Proxy(LambdaFunctionEventInvokeConfigDestinationConfigOnFailure.Jsii$Proxy.class)
public interface LambdaFunctionEventInvokeConfigDestinationConfigOnFailure extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_event_invoke_config#destination LambdaFunctionEventInvokeConfig#destination}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDestination();

    /**
     * @return a {@link Builder} of {@link LambdaFunctionEventInvokeConfigDestinationConfigOnFailure}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaFunctionEventInvokeConfigDestinationConfigOnFailure}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaFunctionEventInvokeConfigDestinationConfigOnFailure> {
        java.lang.String destination;

        /**
         * Sets the value of {@link LambdaFunctionEventInvokeConfigDestinationConfigOnFailure#getDestination}
         * @param destination Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_event_invoke_config#destination LambdaFunctionEventInvokeConfig#destination}. This parameter is required.
         * @return {@code this}
         */
        public Builder destination(java.lang.String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaFunctionEventInvokeConfigDestinationConfigOnFailure}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaFunctionEventInvokeConfigDestinationConfigOnFailure build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaFunctionEventInvokeConfigDestinationConfigOnFailure}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaFunctionEventInvokeConfigDestinationConfigOnFailure {
        private final java.lang.String destination;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.destination = software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.destination = java.util.Objects.requireNonNull(builder.destination, "destination is required");
        }

        @Override
        public final java.lang.String getDestination() {
            return this.destination;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("destination", om.valueToTree(this.getDestination()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lambdafunction.LambdaFunctionEventInvokeConfigDestinationConfigOnFailure"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaFunctionEventInvokeConfigDestinationConfigOnFailure.Jsii$Proxy that = (LambdaFunctionEventInvokeConfigDestinationConfigOnFailure.Jsii$Proxy) o;

            return this.destination.equals(that.destination);
        }

        @Override
        public final int hashCode() {
            int result = this.destination.hashCode();
            return result;
        }
    }
}
