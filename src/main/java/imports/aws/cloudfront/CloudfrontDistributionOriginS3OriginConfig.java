package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.202Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionOriginS3OriginConfig.Jsii$Proxy.class)
public interface CloudfrontDistributionOriginS3OriginConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_access_identity CloudfrontDistribution#origin_access_identity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOriginAccessIdentity();

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionOriginS3OriginConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionOriginS3OriginConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionOriginS3OriginConfig> {
        java.lang.String originAccessIdentity;

        /**
         * Sets the value of {@link CloudfrontDistributionOriginS3OriginConfig#getOriginAccessIdentity}
         * @param originAccessIdentity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_access_identity CloudfrontDistribution#origin_access_identity}. This parameter is required.
         * @return {@code this}
         */
        public Builder originAccessIdentity(java.lang.String originAccessIdentity) {
            this.originAccessIdentity = originAccessIdentity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionOriginS3OriginConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionOriginS3OriginConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionOriginS3OriginConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionOriginS3OriginConfig {
        private final java.lang.String originAccessIdentity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.originAccessIdentity = software.amazon.jsii.Kernel.get(this, "originAccessIdentity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.originAccessIdentity = java.util.Objects.requireNonNull(builder.originAccessIdentity, "originAccessIdentity is required");
        }

        @Override
        public final java.lang.String getOriginAccessIdentity() {
            return this.originAccessIdentity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("originAccessIdentity", om.valueToTree(this.getOriginAccessIdentity()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionOriginS3OriginConfig.Jsii$Proxy that = (CloudfrontDistributionOriginS3OriginConfig.Jsii$Proxy) o;

            return this.originAccessIdentity.equals(that.originAccessIdentity);
        }

        @Override
        public final int hashCode() {
            int result = this.originAccessIdentity.hashCode();
            return result;
        }
    }
}
