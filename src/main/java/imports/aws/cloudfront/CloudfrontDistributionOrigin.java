package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.196Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOrigin")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionOrigin.Jsii$Proxy.class)
public interface CloudfrontDistributionOrigin extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#domain_name CloudfrontDistribution#domain_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDomainName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_id CloudfrontDistribution#origin_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOriginId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#connection_attempts CloudfrontDistribution#connection_attempts}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getConnectionAttempts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#connection_timeout CloudfrontDistribution#connection_timeout}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getConnectionTimeout() {
        return null;
    }

    /**
     * custom_header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_header CloudfrontDistribution#custom_header}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCustomHeader() {
        return null;
    }

    /**
     * custom_origin_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_origin_config CloudfrontDistribution#custom_origin_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig getCustomOriginConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_path CloudfrontDistribution#origin_path}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOriginPath() {
        return null;
    }

    /**
     * origin_shield block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_shield CloudfrontDistribution#origin_shield}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield getOriginShield() {
        return null;
    }

    /**
     * s3_origin_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#s3_origin_config CloudfrontDistribution#s3_origin_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig getS3OriginConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionOrigin}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionOrigin}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionOrigin> {
        java.lang.String domainName;
        java.lang.String originId;
        java.lang.Number connectionAttempts;
        java.lang.Number connectionTimeout;
        java.lang.Object customHeader;
        imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig customOriginConfig;
        java.lang.String originPath;
        imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield originShield;
        imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig s3OriginConfig;

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getDomainName}
         * @param domainName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#domain_name CloudfrontDistribution#domain_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder domainName(java.lang.String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getOriginId}
         * @param originId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_id CloudfrontDistribution#origin_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder originId(java.lang.String originId) {
            this.originId = originId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getConnectionAttempts}
         * @param connectionAttempts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#connection_attempts CloudfrontDistribution#connection_attempts}.
         * @return {@code this}
         */
        public Builder connectionAttempts(java.lang.Number connectionAttempts) {
            this.connectionAttempts = connectionAttempts;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getConnectionTimeout}
         * @param connectionTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#connection_timeout CloudfrontDistribution#connection_timeout}.
         * @return {@code this}
         */
        public Builder connectionTimeout(java.lang.Number connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getCustomHeader}
         * @param customHeader custom_header block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_header CloudfrontDistribution#custom_header}
         * @return {@code this}
         */
        public Builder customHeader(com.hashicorp.cdktf.IResolvable customHeader) {
            this.customHeader = customHeader;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getCustomHeader}
         * @param customHeader custom_header block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_header CloudfrontDistribution#custom_header}
         * @return {@code this}
         */
        public Builder customHeader(java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOriginCustomHeader> customHeader) {
            this.customHeader = customHeader;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getCustomOriginConfig}
         * @param customOriginConfig custom_origin_config block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_origin_config CloudfrontDistribution#custom_origin_config}
         * @return {@code this}
         */
        public Builder customOriginConfig(imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig customOriginConfig) {
            this.customOriginConfig = customOriginConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getOriginPath}
         * @param originPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_path CloudfrontDistribution#origin_path}.
         * @return {@code this}
         */
        public Builder originPath(java.lang.String originPath) {
            this.originPath = originPath;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getOriginShield}
         * @param originShield origin_shield block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_shield CloudfrontDistribution#origin_shield}
         * @return {@code this}
         */
        public Builder originShield(imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield originShield) {
            this.originShield = originShield;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionOrigin#getS3OriginConfig}
         * @param s3OriginConfig s3_origin_config block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#s3_origin_config CloudfrontDistribution#s3_origin_config}
         * @return {@code this}
         */
        public Builder s3OriginConfig(imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig s3OriginConfig) {
            this.s3OriginConfig = s3OriginConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionOrigin}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionOrigin build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionOrigin}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionOrigin {
        private final java.lang.String domainName;
        private final java.lang.String originId;
        private final java.lang.Number connectionAttempts;
        private final java.lang.Number connectionTimeout;
        private final java.lang.Object customHeader;
        private final imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig customOriginConfig;
        private final java.lang.String originPath;
        private final imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield originShield;
        private final imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig s3OriginConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.domainName = software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.originId = software.amazon.jsii.Kernel.get(this, "originId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionAttempts = software.amazon.jsii.Kernel.get(this, "connectionAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.connectionTimeout = software.amazon.jsii.Kernel.get(this, "connectionTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.customHeader = software.amazon.jsii.Kernel.get(this, "customHeader", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.customOriginConfig = software.amazon.jsii.Kernel.get(this, "customOriginConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig.class));
            this.originPath = software.amazon.jsii.Kernel.get(this, "originPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.originShield = software.amazon.jsii.Kernel.get(this, "originShield", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield.class));
            this.s3OriginConfig = software.amazon.jsii.Kernel.get(this, "s3OriginConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.domainName = java.util.Objects.requireNonNull(builder.domainName, "domainName is required");
            this.originId = java.util.Objects.requireNonNull(builder.originId, "originId is required");
            this.connectionAttempts = builder.connectionAttempts;
            this.connectionTimeout = builder.connectionTimeout;
            this.customHeader = builder.customHeader;
            this.customOriginConfig = builder.customOriginConfig;
            this.originPath = builder.originPath;
            this.originShield = builder.originShield;
            this.s3OriginConfig = builder.s3OriginConfig;
        }

        @Override
        public final java.lang.String getDomainName() {
            return this.domainName;
        }

        @Override
        public final java.lang.String getOriginId() {
            return this.originId;
        }

        @Override
        public final java.lang.Number getConnectionAttempts() {
            return this.connectionAttempts;
        }

        @Override
        public final java.lang.Number getConnectionTimeout() {
            return this.connectionTimeout;
        }

        @Override
        public final java.lang.Object getCustomHeader() {
            return this.customHeader;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig getCustomOriginConfig() {
            return this.customOriginConfig;
        }

        @Override
        public final java.lang.String getOriginPath() {
            return this.originPath;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield getOriginShield() {
            return this.originShield;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig getS3OriginConfig() {
            return this.s3OriginConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("domainName", om.valueToTree(this.getDomainName()));
            data.set("originId", om.valueToTree(this.getOriginId()));
            if (this.getConnectionAttempts() != null) {
                data.set("connectionAttempts", om.valueToTree(this.getConnectionAttempts()));
            }
            if (this.getConnectionTimeout() != null) {
                data.set("connectionTimeout", om.valueToTree(this.getConnectionTimeout()));
            }
            if (this.getCustomHeader() != null) {
                data.set("customHeader", om.valueToTree(this.getCustomHeader()));
            }
            if (this.getCustomOriginConfig() != null) {
                data.set("customOriginConfig", om.valueToTree(this.getCustomOriginConfig()));
            }
            if (this.getOriginPath() != null) {
                data.set("originPath", om.valueToTree(this.getOriginPath()));
            }
            if (this.getOriginShield() != null) {
                data.set("originShield", om.valueToTree(this.getOriginShield()));
            }
            if (this.getS3OriginConfig() != null) {
                data.set("s3OriginConfig", om.valueToTree(this.getS3OriginConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionOrigin"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionOrigin.Jsii$Proxy that = (CloudfrontDistributionOrigin.Jsii$Proxy) o;

            if (!domainName.equals(that.domainName)) return false;
            if (!originId.equals(that.originId)) return false;
            if (this.connectionAttempts != null ? !this.connectionAttempts.equals(that.connectionAttempts) : that.connectionAttempts != null) return false;
            if (this.connectionTimeout != null ? !this.connectionTimeout.equals(that.connectionTimeout) : that.connectionTimeout != null) return false;
            if (this.customHeader != null ? !this.customHeader.equals(that.customHeader) : that.customHeader != null) return false;
            if (this.customOriginConfig != null ? !this.customOriginConfig.equals(that.customOriginConfig) : that.customOriginConfig != null) return false;
            if (this.originPath != null ? !this.originPath.equals(that.originPath) : that.originPath != null) return false;
            if (this.originShield != null ? !this.originShield.equals(that.originShield) : that.originShield != null) return false;
            return this.s3OriginConfig != null ? this.s3OriginConfig.equals(that.s3OriginConfig) : that.s3OriginConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.domainName.hashCode();
            result = 31 * result + (this.originId.hashCode());
            result = 31 * result + (this.connectionAttempts != null ? this.connectionAttempts.hashCode() : 0);
            result = 31 * result + (this.connectionTimeout != null ? this.connectionTimeout.hashCode() : 0);
            result = 31 * result + (this.customHeader != null ? this.customHeader.hashCode() : 0);
            result = 31 * result + (this.customOriginConfig != null ? this.customOriginConfig.hashCode() : 0);
            result = 31 * result + (this.originPath != null ? this.originPath.hashCode() : 0);
            result = 31 * result + (this.originShield != null ? this.originShield.hashCode() : 0);
            result = 31 * result + (this.s3OriginConfig != null ? this.s3OriginConfig.hashCode() : 0);
            return result;
        }
    }
}
