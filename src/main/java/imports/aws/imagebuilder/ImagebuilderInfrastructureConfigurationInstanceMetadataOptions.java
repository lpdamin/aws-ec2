package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.417Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderInfrastructureConfigurationInstanceMetadataOptions")
@software.amazon.jsii.Jsii.Proxy(ImagebuilderInfrastructureConfigurationInstanceMetadataOptions.Jsii$Proxy.class)
public interface ImagebuilderInfrastructureConfigurationInstanceMetadataOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_infrastructure_configuration#http_put_response_hop_limit ImagebuilderInfrastructureConfiguration#http_put_response_hop_limit}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHttpPutResponseHopLimit() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_infrastructure_configuration#http_tokens ImagebuilderInfrastructureConfiguration#http_tokens}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpTokens() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ImagebuilderInfrastructureConfigurationInstanceMetadataOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ImagebuilderInfrastructureConfigurationInstanceMetadataOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ImagebuilderInfrastructureConfigurationInstanceMetadataOptions> {
        java.lang.Number httpPutResponseHopLimit;
        java.lang.String httpTokens;

        /**
         * Sets the value of {@link ImagebuilderInfrastructureConfigurationInstanceMetadataOptions#getHttpPutResponseHopLimit}
         * @param httpPutResponseHopLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_infrastructure_configuration#http_put_response_hop_limit ImagebuilderInfrastructureConfiguration#http_put_response_hop_limit}.
         * @return {@code this}
         */
        public Builder httpPutResponseHopLimit(java.lang.Number httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderInfrastructureConfigurationInstanceMetadataOptions#getHttpTokens}
         * @param httpTokens Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_infrastructure_configuration#http_tokens ImagebuilderInfrastructureConfiguration#http_tokens}.
         * @return {@code this}
         */
        public Builder httpTokens(java.lang.String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ImagebuilderInfrastructureConfigurationInstanceMetadataOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ImagebuilderInfrastructureConfigurationInstanceMetadataOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ImagebuilderInfrastructureConfigurationInstanceMetadataOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ImagebuilderInfrastructureConfigurationInstanceMetadataOptions {
        private final java.lang.Number httpPutResponseHopLimit;
        private final java.lang.String httpTokens;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.httpPutResponseHopLimit = software.amazon.jsii.Kernel.get(this, "httpPutResponseHopLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.httpTokens = software.amazon.jsii.Kernel.get(this, "httpTokens", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
            this.httpTokens = builder.httpTokens;
        }

        @Override
        public final java.lang.Number getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        @Override
        public final java.lang.String getHttpTokens() {
            return this.httpTokens;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHttpPutResponseHopLimit() != null) {
                data.set("httpPutResponseHopLimit", om.valueToTree(this.getHttpPutResponseHopLimit()));
            }
            if (this.getHttpTokens() != null) {
                data.set("httpTokens", om.valueToTree(this.getHttpTokens()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.imagebuilder.ImagebuilderInfrastructureConfigurationInstanceMetadataOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ImagebuilderInfrastructureConfigurationInstanceMetadataOptions.Jsii$Proxy that = (ImagebuilderInfrastructureConfigurationInstanceMetadataOptions.Jsii$Proxy) o;

            if (this.httpPutResponseHopLimit != null ? !this.httpPutResponseHopLimit.equals(that.httpPutResponseHopLimit) : that.httpPutResponseHopLimit != null) return false;
            return this.httpTokens != null ? this.httpTokens.equals(that.httpTokens) : that.httpTokens == null;
        }

        @Override
        public final int hashCode() {
            int result = this.httpPutResponseHopLimit != null ? this.httpPutResponseHopLimit.hashCode() : 0;
            result = 31 * result + (this.httpTokens != null ? this.httpTokens.hashCode() : 0);
            return result;
        }
    }
}
