package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.185Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation.Jsii$Proxy.class)
public interface CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#event_type CloudfrontDistribution#event_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEventType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#lambda_arn CloudfrontDistribution#lambda_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLambdaArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#include_body CloudfrontDistribution#include_body}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeBody() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation> {
        java.lang.String eventType;
        java.lang.String lambdaArn;
        java.lang.Object includeBody;

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation#getEventType}
         * @param eventType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#event_type CloudfrontDistribution#event_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder eventType(java.lang.String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation#getLambdaArn}
         * @param lambdaArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#lambda_arn CloudfrontDistribution#lambda_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder lambdaArn(java.lang.String lambdaArn) {
            this.lambdaArn = lambdaArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation#getIncludeBody}
         * @param includeBody Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#include_body CloudfrontDistribution#include_body}.
         * @return {@code this}
         */
        public Builder includeBody(java.lang.Boolean includeBody) {
            this.includeBody = includeBody;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation#getIncludeBody}
         * @param includeBody Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#include_body CloudfrontDistribution#include_body}.
         * @return {@code this}
         */
        public Builder includeBody(com.hashicorp.cdktf.IResolvable includeBody) {
            this.includeBody = includeBody;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation {
        private final java.lang.String eventType;
        private final java.lang.String lambdaArn;
        private final java.lang.Object includeBody;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eventType = software.amazon.jsii.Kernel.get(this, "eventType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaArn = software.amazon.jsii.Kernel.get(this, "lambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.includeBody = software.amazon.jsii.Kernel.get(this, "includeBody", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventType = java.util.Objects.requireNonNull(builder.eventType, "eventType is required");
            this.lambdaArn = java.util.Objects.requireNonNull(builder.lambdaArn, "lambdaArn is required");
            this.includeBody = builder.includeBody;
        }

        @Override
        public final java.lang.String getEventType() {
            return this.eventType;
        }

        @Override
        public final java.lang.String getLambdaArn() {
            return this.lambdaArn;
        }

        @Override
        public final java.lang.Object getIncludeBody() {
            return this.includeBody;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("eventType", om.valueToTree(this.getEventType()));
            data.set("lambdaArn", om.valueToTree(this.getLambdaArn()));
            if (this.getIncludeBody() != null) {
                data.set("includeBody", om.valueToTree(this.getIncludeBody()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation.Jsii$Proxy that = (CloudfrontDistributionDefaultCacheBehaviorLambdaFunctionAssociation.Jsii$Proxy) o;

            if (!eventType.equals(that.eventType)) return false;
            if (!lambdaArn.equals(that.lambdaArn)) return false;
            return this.includeBody != null ? this.includeBody.equals(that.includeBody) : that.includeBody == null;
        }

        @Override
        public final int hashCode() {
            int result = this.eventType.hashCode();
            result = 31 * result + (this.lambdaArn.hashCode());
            result = 31 * result + (this.includeBody != null ? this.includeBody.hashCode() : 0);
            return result;
        }
    }
}
