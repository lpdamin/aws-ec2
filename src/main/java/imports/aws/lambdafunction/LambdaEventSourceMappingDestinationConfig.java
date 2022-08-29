package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.780Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMappingDestinationConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaEventSourceMappingDestinationConfig.Jsii$Proxy.class)
public interface LambdaEventSourceMappingDestinationConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * on_failure block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#on_failure LambdaEventSourceMapping#on_failure}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure getOnFailure() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaEventSourceMappingDestinationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaEventSourceMappingDestinationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaEventSourceMappingDestinationConfig> {
        imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure onFailure;

        /**
         * Sets the value of {@link LambdaEventSourceMappingDestinationConfig#getOnFailure}
         * @param onFailure on_failure block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#on_failure LambdaEventSourceMapping#on_failure}
         * @return {@code this}
         */
        public Builder onFailure(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaEventSourceMappingDestinationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaEventSourceMappingDestinationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaEventSourceMappingDestinationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaEventSourceMappingDestinationConfig {
        private final imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure onFailure;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.onFailure = software.amazon.jsii.Kernel.get(this, "onFailure", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.onFailure = builder.onFailure;
        }

        @Override
        public final imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOnFailure getOnFailure() {
            return this.onFailure;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOnFailure() != null) {
                data.set("onFailure", om.valueToTree(this.getOnFailure()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lambdafunction.LambdaEventSourceMappingDestinationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaEventSourceMappingDestinationConfig.Jsii$Proxy that = (LambdaEventSourceMappingDestinationConfig.Jsii$Proxy) o;

            return this.onFailure != null ? this.onFailure.equals(that.onFailure) : that.onFailure == null;
        }

        @Override
        public final int hashCode() {
            int result = this.onFailure != null ? this.onFailure.hashCode() : 0;
            return result;
        }
    }
}
