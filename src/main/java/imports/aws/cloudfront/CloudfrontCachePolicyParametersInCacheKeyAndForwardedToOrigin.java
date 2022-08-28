package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.154Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin")
@software.amazon.jsii.Jsii.Proxy(CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin.Jsii$Proxy.class)
public interface CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin extends software.amazon.jsii.JsiiSerializable {

    /**
     * cookies_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#cookies_config CloudfrontCachePolicy#cookies_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig getCookiesConfig();

    /**
     * headers_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#headers_config CloudfrontCachePolicy#headers_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig getHeadersConfig();

    /**
     * query_strings_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#query_strings_config CloudfrontCachePolicy#query_strings_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig getQueryStringsConfig();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#enable_accept_encoding_brotli CloudfrontCachePolicy#enable_accept_encoding_brotli}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableAcceptEncodingBrotli() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#enable_accept_encoding_gzip CloudfrontCachePolicy#enable_accept_encoding_gzip}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableAcceptEncodingGzip() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin> {
        imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig;
        imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig;
        imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig;
        java.lang.Object enableAcceptEncodingBrotli;
        java.lang.Object enableAcceptEncodingGzip;

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getCookiesConfig}
         * @param cookiesConfig cookies_config block. This parameter is required.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#cookies_config CloudfrontCachePolicy#cookies_config}
         * @return {@code this}
         */
        public Builder cookiesConfig(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig) {
            this.cookiesConfig = cookiesConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getHeadersConfig}
         * @param headersConfig headers_config block. This parameter is required.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#headers_config CloudfrontCachePolicy#headers_config}
         * @return {@code this}
         */
        public Builder headersConfig(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig) {
            this.headersConfig = headersConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getQueryStringsConfig}
         * @param queryStringsConfig query_strings_config block. This parameter is required.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#query_strings_config CloudfrontCachePolicy#query_strings_config}
         * @return {@code this}
         */
        public Builder queryStringsConfig(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig) {
            this.queryStringsConfig = queryStringsConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getEnableAcceptEncodingBrotli}
         * @param enableAcceptEncodingBrotli Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#enable_accept_encoding_brotli CloudfrontCachePolicy#enable_accept_encoding_brotli}.
         * @return {@code this}
         */
        public Builder enableAcceptEncodingBrotli(java.lang.Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getEnableAcceptEncodingBrotli}
         * @param enableAcceptEncodingBrotli Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#enable_accept_encoding_brotli CloudfrontCachePolicy#enable_accept_encoding_brotli}.
         * @return {@code this}
         */
        public Builder enableAcceptEncodingBrotli(com.hashicorp.cdktf.IResolvable enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getEnableAcceptEncodingGzip}
         * @param enableAcceptEncodingGzip Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#enable_accept_encoding_gzip CloudfrontCachePolicy#enable_accept_encoding_gzip}.
         * @return {@code this}
         */
        public Builder enableAcceptEncodingGzip(java.lang.Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin#getEnableAcceptEncodingGzip}
         * @param enableAcceptEncodingGzip Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_cache_policy#enable_accept_encoding_gzip CloudfrontCachePolicy#enable_accept_encoding_gzip}.
         * @return {@code this}
         */
        public Builder enableAcceptEncodingGzip(com.hashicorp.cdktf.IResolvable enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin {
        private final imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig;
        private final imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig;
        private final imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig;
        private final java.lang.Object enableAcceptEncodingBrotli;
        private final java.lang.Object enableAcceptEncodingGzip;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cookiesConfig = software.amazon.jsii.Kernel.get(this, "cookiesConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig.class));
            this.headersConfig = software.amazon.jsii.Kernel.get(this, "headersConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig.class));
            this.queryStringsConfig = software.amazon.jsii.Kernel.get(this, "queryStringsConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig.class));
            this.enableAcceptEncodingBrotli = software.amazon.jsii.Kernel.get(this, "enableAcceptEncodingBrotli", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.enableAcceptEncodingGzip = software.amazon.jsii.Kernel.get(this, "enableAcceptEncodingGzip", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cookiesConfig = java.util.Objects.requireNonNull(builder.cookiesConfig, "cookiesConfig is required");
            this.headersConfig = java.util.Objects.requireNonNull(builder.headersConfig, "headersConfig is required");
            this.queryStringsConfig = java.util.Objects.requireNonNull(builder.queryStringsConfig, "queryStringsConfig is required");
            this.enableAcceptEncodingBrotli = builder.enableAcceptEncodingBrotli;
            this.enableAcceptEncodingGzip = builder.enableAcceptEncodingGzip;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig getCookiesConfig() {
            return this.cookiesConfig;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig getHeadersConfig() {
            return this.headersConfig;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig getQueryStringsConfig() {
            return this.queryStringsConfig;
        }

        @Override
        public final java.lang.Object getEnableAcceptEncodingBrotli() {
            return this.enableAcceptEncodingBrotli;
        }

        @Override
        public final java.lang.Object getEnableAcceptEncodingGzip() {
            return this.enableAcceptEncodingGzip;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cookiesConfig", om.valueToTree(this.getCookiesConfig()));
            data.set("headersConfig", om.valueToTree(this.getHeadersConfig()));
            data.set("queryStringsConfig", om.valueToTree(this.getQueryStringsConfig()));
            if (this.getEnableAcceptEncodingBrotli() != null) {
                data.set("enableAcceptEncodingBrotli", om.valueToTree(this.getEnableAcceptEncodingBrotli()));
            }
            if (this.getEnableAcceptEncodingGzip() != null) {
                data.set("enableAcceptEncodingGzip", om.valueToTree(this.getEnableAcceptEncodingGzip()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin.Jsii$Proxy that = (CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOrigin.Jsii$Proxy) o;

            if (!cookiesConfig.equals(that.cookiesConfig)) return false;
            if (!headersConfig.equals(that.headersConfig)) return false;
            if (!queryStringsConfig.equals(that.queryStringsConfig)) return false;
            if (this.enableAcceptEncodingBrotli != null ? !this.enableAcceptEncodingBrotli.equals(that.enableAcceptEncodingBrotli) : that.enableAcceptEncodingBrotli != null) return false;
            return this.enableAcceptEncodingGzip != null ? this.enableAcceptEncodingGzip.equals(that.enableAcceptEncodingGzip) : that.enableAcceptEncodingGzip == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cookiesConfig.hashCode();
            result = 31 * result + (this.headersConfig.hashCode());
            result = 31 * result + (this.queryStringsConfig.hashCode());
            result = 31 * result + (this.enableAcceptEncodingBrotli != null ? this.enableAcceptEncodingBrotli.hashCode() : 0);
            result = 31 * result + (this.enableAcceptEncodingGzip != null ? this.enableAcceptEncodingGzip.hashCode() : 0);
            return result;
        }
    }
}
