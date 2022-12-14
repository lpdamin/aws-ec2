package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.458Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayDomainNameEndpointConfiguration")
@software.amazon.jsii.Jsii.Proxy(ApiGatewayDomainNameEndpointConfiguration.Jsii$Proxy.class)
public interface ApiGatewayDomainNameEndpointConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_domain_name#types ApiGatewayDomainName#types}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTypes();

    /**
     * @return a {@link Builder} of {@link ApiGatewayDomainNameEndpointConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiGatewayDomainNameEndpointConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiGatewayDomainNameEndpointConfiguration> {
        java.util.List<java.lang.String> types;

        /**
         * Sets the value of {@link ApiGatewayDomainNameEndpointConfiguration#getTypes}
         * @param types Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_domain_name#types ApiGatewayDomainName#types}. This parameter is required.
         * @return {@code this}
         */
        public Builder types(java.util.List<java.lang.String> types) {
            this.types = types;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiGatewayDomainNameEndpointConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiGatewayDomainNameEndpointConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApiGatewayDomainNameEndpointConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiGatewayDomainNameEndpointConfiguration {
        private final java.util.List<java.lang.String> types;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.types = software.amazon.jsii.Kernel.get(this, "types", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.types = java.util.Objects.requireNonNull(builder.types, "types is required");
        }

        @Override
        public final java.util.List<java.lang.String> getTypes() {
            return this.types;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("types", om.valueToTree(this.getTypes()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.apigateway.ApiGatewayDomainNameEndpointConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiGatewayDomainNameEndpointConfiguration.Jsii$Proxy that = (ApiGatewayDomainNameEndpointConfiguration.Jsii$Proxy) o;

            return this.types.equals(that.types);
        }

        @Override
        public final int hashCode() {
            int result = this.types.hashCode();
            return result;
        }
    }
}
