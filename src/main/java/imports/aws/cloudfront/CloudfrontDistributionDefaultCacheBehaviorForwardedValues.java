package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.947Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValues")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionDefaultCacheBehaviorForwardedValues.Jsii$Proxy.class)
public interface CloudfrontDistributionDefaultCacheBehaviorForwardedValues extends software.amazon.jsii.JsiiSerializable {

    /**
     * cookies block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#cookies CloudfrontDistribution#cookies}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies getCookies();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#query_string CloudfrontDistribution#query_string}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getQueryString();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#headers CloudfrontDistribution#headers}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHeaders() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#query_string_cache_keys CloudfrontDistribution#query_string_cache_keys}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getQueryStringCacheKeys() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionDefaultCacheBehaviorForwardedValues> {
        imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies cookies;
        java.lang.Object queryString;
        java.util.List<java.lang.String> headers;
        java.util.List<java.lang.String> queryStringCacheKeys;

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getCookies}
         * @param cookies cookies block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#cookies CloudfrontDistribution#cookies}
         * @return {@code this}
         */
        public Builder cookies(imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies cookies) {
            this.cookies = cookies;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getQueryString}
         * @param queryString Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#query_string CloudfrontDistribution#query_string}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryString(java.lang.Boolean queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getQueryString}
         * @param queryString Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#query_string CloudfrontDistribution#query_string}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryString(com.hashicorp.cdktf.IResolvable queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getHeaders}
         * @param headers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#headers CloudfrontDistribution#headers}.
         * @return {@code this}
         */
        public Builder headers(java.util.List<java.lang.String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues#getQueryStringCacheKeys}
         * @param queryStringCacheKeys Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#query_string_cache_keys CloudfrontDistribution#query_string_cache_keys}.
         * @return {@code this}
         */
        public Builder queryStringCacheKeys(java.util.List<java.lang.String> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionDefaultCacheBehaviorForwardedValues build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionDefaultCacheBehaviorForwardedValues}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionDefaultCacheBehaviorForwardedValues {
        private final imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies cookies;
        private final java.lang.Object queryString;
        private final java.util.List<java.lang.String> headers;
        private final java.util.List<java.lang.String> queryStringCacheKeys;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cookies = software.amazon.jsii.Kernel.get(this, "cookies", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies.class));
            this.queryString = software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.headers = software.amazon.jsii.Kernel.get(this, "headers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.queryStringCacheKeys = software.amazon.jsii.Kernel.get(this, "queryStringCacheKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cookies = java.util.Objects.requireNonNull(builder.cookies, "cookies is required");
            this.queryString = java.util.Objects.requireNonNull(builder.queryString, "queryString is required");
            this.headers = builder.headers;
            this.queryStringCacheKeys = builder.queryStringCacheKeys;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValuesCookies getCookies() {
            return this.cookies;
        }

        @Override
        public final java.lang.Object getQueryString() {
            return this.queryString;
        }

        @Override
        public final java.util.List<java.lang.String> getHeaders() {
            return this.headers;
        }

        @Override
        public final java.util.List<java.lang.String> getQueryStringCacheKeys() {
            return this.queryStringCacheKeys;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cookies", om.valueToTree(this.getCookies()));
            data.set("queryString", om.valueToTree(this.getQueryString()));
            if (this.getHeaders() != null) {
                data.set("headers", om.valueToTree(this.getHeaders()));
            }
            if (this.getQueryStringCacheKeys() != null) {
                data.set("queryStringCacheKeys", om.valueToTree(this.getQueryStringCacheKeys()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorForwardedValues"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionDefaultCacheBehaviorForwardedValues.Jsii$Proxy that = (CloudfrontDistributionDefaultCacheBehaviorForwardedValues.Jsii$Proxy) o;

            if (!cookies.equals(that.cookies)) return false;
            if (!queryString.equals(that.queryString)) return false;
            if (this.headers != null ? !this.headers.equals(that.headers) : that.headers != null) return false;
            return this.queryStringCacheKeys != null ? this.queryStringCacheKeys.equals(that.queryStringCacheKeys) : that.queryStringCacheKeys == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cookies.hashCode();
            result = 31 * result + (this.queryString.hashCode());
            result = 31 * result + (this.headers != null ? this.headers.hashCode() : 0);
            result = 31 * result + (this.queryStringCacheKeys != null ? this.queryStringCacheKeys.hashCode() : 0);
            return result;
        }
    }
}
