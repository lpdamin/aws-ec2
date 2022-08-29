package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.861Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.SpotInstanceRequestMetadataOptions")
@software.amazon.jsii.Jsii.Proxy(SpotInstanceRequestMetadataOptions.Jsii$Proxy.class)
public interface SpotInstanceRequestMetadataOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#http_endpoint SpotInstanceRequest#http_endpoint}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpEndpoint() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#http_put_response_hop_limit SpotInstanceRequest#http_put_response_hop_limit}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHttpPutResponseHopLimit() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#http_tokens SpotInstanceRequest#http_tokens}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpTokens() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#instance_metadata_tags SpotInstanceRequest#instance_metadata_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceMetadataTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SpotInstanceRequestMetadataOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SpotInstanceRequestMetadataOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SpotInstanceRequestMetadataOptions> {
        java.lang.String httpEndpoint;
        java.lang.Number httpPutResponseHopLimit;
        java.lang.String httpTokens;
        java.lang.String instanceMetadataTags;

        /**
         * Sets the value of {@link SpotInstanceRequestMetadataOptions#getHttpEndpoint}
         * @param httpEndpoint Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#http_endpoint SpotInstanceRequest#http_endpoint}.
         * @return {@code this}
         */
        public Builder httpEndpoint(java.lang.String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestMetadataOptions#getHttpPutResponseHopLimit}
         * @param httpPutResponseHopLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#http_put_response_hop_limit SpotInstanceRequest#http_put_response_hop_limit}.
         * @return {@code this}
         */
        public Builder httpPutResponseHopLimit(java.lang.Number httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestMetadataOptions#getHttpTokens}
         * @param httpTokens Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#http_tokens SpotInstanceRequest#http_tokens}.
         * @return {@code this}
         */
        public Builder httpTokens(java.lang.String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Sets the value of {@link SpotInstanceRequestMetadataOptions#getInstanceMetadataTags}
         * @param instanceMetadataTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/spot_instance_request#instance_metadata_tags SpotInstanceRequest#instance_metadata_tags}.
         * @return {@code this}
         */
        public Builder instanceMetadataTags(java.lang.String instanceMetadataTags) {
            this.instanceMetadataTags = instanceMetadataTags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SpotInstanceRequestMetadataOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SpotInstanceRequestMetadataOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SpotInstanceRequestMetadataOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SpotInstanceRequestMetadataOptions {
        private final java.lang.String httpEndpoint;
        private final java.lang.Number httpPutResponseHopLimit;
        private final java.lang.String httpTokens;
        private final java.lang.String instanceMetadataTags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.httpEndpoint = software.amazon.jsii.Kernel.get(this, "httpEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpPutResponseHopLimit = software.amazon.jsii.Kernel.get(this, "httpPutResponseHopLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.httpTokens = software.amazon.jsii.Kernel.get(this, "httpTokens", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceMetadataTags = software.amazon.jsii.Kernel.get(this, "instanceMetadataTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.httpEndpoint = builder.httpEndpoint;
            this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
            this.httpTokens = builder.httpTokens;
            this.instanceMetadataTags = builder.instanceMetadataTags;
        }

        @Override
        public final java.lang.String getHttpEndpoint() {
            return this.httpEndpoint;
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
        public final java.lang.String getInstanceMetadataTags() {
            return this.instanceMetadataTags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHttpEndpoint() != null) {
                data.set("httpEndpoint", om.valueToTree(this.getHttpEndpoint()));
            }
            if (this.getHttpPutResponseHopLimit() != null) {
                data.set("httpPutResponseHopLimit", om.valueToTree(this.getHttpPutResponseHopLimit()));
            }
            if (this.getHttpTokens() != null) {
                data.set("httpTokens", om.valueToTree(this.getHttpTokens()));
            }
            if (this.getInstanceMetadataTags() != null) {
                data.set("instanceMetadataTags", om.valueToTree(this.getInstanceMetadataTags()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.SpotInstanceRequestMetadataOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpotInstanceRequestMetadataOptions.Jsii$Proxy that = (SpotInstanceRequestMetadataOptions.Jsii$Proxy) o;

            if (this.httpEndpoint != null ? !this.httpEndpoint.equals(that.httpEndpoint) : that.httpEndpoint != null) return false;
            if (this.httpPutResponseHopLimit != null ? !this.httpPutResponseHopLimit.equals(that.httpPutResponseHopLimit) : that.httpPutResponseHopLimit != null) return false;
            if (this.httpTokens != null ? !this.httpTokens.equals(that.httpTokens) : that.httpTokens != null) return false;
            return this.instanceMetadataTags != null ? this.instanceMetadataTags.equals(that.instanceMetadataTags) : that.instanceMetadataTags == null;
        }

        @Override
        public final int hashCode() {
            int result = this.httpEndpoint != null ? this.httpEndpoint.hashCode() : 0;
            result = 31 * result + (this.httpPutResponseHopLimit != null ? this.httpPutResponseHopLimit.hashCode() : 0);
            result = 31 * result + (this.httpTokens != null ? this.httpTokens.hashCode() : 0);
            result = 31 * result + (this.instanceMetadataTags != null ? this.instanceMetadataTags.hashCode() : 0);
            return result;
        }
    }
}
