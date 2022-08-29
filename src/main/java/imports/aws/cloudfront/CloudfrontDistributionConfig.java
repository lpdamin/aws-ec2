package imports.aws.cloudfront;

/**
 * AWS CloudFront.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.944Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionConfig")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionConfig.Jsii$Proxy.class)
public interface CloudfrontDistributionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * default_cache_behavior block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_cache_behavior CloudfrontDistribution#default_cache_behavior}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior getDefaultCacheBehavior();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * origin block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin CloudfrontDistribution#origin}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getOrigin();

    /**
     * restrictions block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#restrictions CloudfrontDistribution#restrictions}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionRestrictions getRestrictions();

    /**
     * viewer_certificate block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#viewer_certificate CloudfrontDistribution#viewer_certificate}
     */
    @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionViewerCertificate getViewerCertificate();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#aliases CloudfrontDistribution#aliases}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliases() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#comment CloudfrontDistribution#comment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getComment() {
        return null;
    }

    /**
     * custom_error_response block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_error_response CloudfrontDistribution#custom_error_response}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCustomErrorResponse() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_root_object CloudfrontDistribution#default_root_object}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultRootObject() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#http_version CloudfrontDistribution#http_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpVersion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#id CloudfrontDistribution#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsIpv6Enabled() {
        return null;
    }

    /**
     * logging_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#logging_config CloudfrontDistribution#logging_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionLoggingConfig getLoggingConfig() {
        return null;
    }

    /**
     * ordered_cache_behavior block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#ordered_cache_behavior CloudfrontDistribution#ordered_cache_behavior}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOrderedCacheBehavior() {
        return null;
    }

    /**
     * origin_group block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_group CloudfrontDistribution#origin_group}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOriginGroup() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#price_class CloudfrontDistribution#price_class}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPriceClass() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRetainOnDelete() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags CloudfrontDistribution#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags_all CloudfrontDistribution#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWaitForDeployment() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#web_acl_id CloudfrontDistribution#web_acl_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWebAclId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionConfig> {
        imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior defaultCacheBehavior;
        java.lang.Object enabled;
        java.lang.Object origin;
        imports.aws.cloudfront.CloudfrontDistributionRestrictions restrictions;
        imports.aws.cloudfront.CloudfrontDistributionViewerCertificate viewerCertificate;
        java.util.List<java.lang.String> aliases;
        java.lang.String comment;
        java.lang.Object customErrorResponse;
        java.lang.String defaultRootObject;
        java.lang.String httpVersion;
        java.lang.String id;
        java.lang.Object isIpv6Enabled;
        imports.aws.cloudfront.CloudfrontDistributionLoggingConfig loggingConfig;
        java.lang.Object orderedCacheBehavior;
        java.lang.Object originGroup;
        java.lang.String priceClass;
        java.lang.Object retainOnDelete;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        java.lang.Object waitForDeployment;
        java.lang.String webAclId;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getDefaultCacheBehavior}
         * @param defaultCacheBehavior default_cache_behavior block. This parameter is required.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_cache_behavior CloudfrontDistribution#default_cache_behavior}
         * @return {@code this}
         */
        public Builder defaultCacheBehavior(imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior defaultCacheBehavior) {
            this.defaultCacheBehavior = defaultCacheBehavior;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOrigin}
         * @param origin origin block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin CloudfrontDistribution#origin}
         * @return {@code this}
         */
        public Builder origin(com.hashicorp.cdktf.IResolvable origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOrigin}
         * @param origin origin block. This parameter is required.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin CloudfrontDistribution#origin}
         * @return {@code this}
         */
        public Builder origin(java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOrigin> origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getRestrictions}
         * @param restrictions restrictions block. This parameter is required.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#restrictions CloudfrontDistribution#restrictions}
         * @return {@code this}
         */
        public Builder restrictions(imports.aws.cloudfront.CloudfrontDistributionRestrictions restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getViewerCertificate}
         * @param viewerCertificate viewer_certificate block. This parameter is required.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#viewer_certificate CloudfrontDistribution#viewer_certificate}
         * @return {@code this}
         */
        public Builder viewerCertificate(imports.aws.cloudfront.CloudfrontDistributionViewerCertificate viewerCertificate) {
            this.viewerCertificate = viewerCertificate;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getAliases}
         * @param aliases Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#aliases CloudfrontDistribution#aliases}.
         * @return {@code this}
         */
        public Builder aliases(java.util.List<java.lang.String> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getComment}
         * @param comment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#comment CloudfrontDistribution#comment}.
         * @return {@code this}
         */
        public Builder comment(java.lang.String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getCustomErrorResponse}
         * @param customErrorResponse custom_error_response block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_error_response CloudfrontDistribution#custom_error_response}
         * @return {@code this}
         */
        public Builder customErrorResponse(com.hashicorp.cdktf.IResolvable customErrorResponse) {
            this.customErrorResponse = customErrorResponse;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getCustomErrorResponse}
         * @param customErrorResponse custom_error_response block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_error_response CloudfrontDistribution#custom_error_response}
         * @return {@code this}
         */
        public Builder customErrorResponse(java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionCustomErrorResponse> customErrorResponse) {
            this.customErrorResponse = customErrorResponse;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getDefaultRootObject}
         * @param defaultRootObject Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_root_object CloudfrontDistribution#default_root_object}.
         * @return {@code this}
         */
        public Builder defaultRootObject(java.lang.String defaultRootObject) {
            this.defaultRootObject = defaultRootObject;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getHttpVersion}
         * @param httpVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#http_version CloudfrontDistribution#http_version}.
         * @return {@code this}
         */
        public Builder httpVersion(java.lang.String httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#id CloudfrontDistribution#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getIsIpv6Enabled}
         * @param isIpv6Enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}.
         * @return {@code this}
         */
        public Builder isIpv6Enabled(java.lang.Boolean isIpv6Enabled) {
            this.isIpv6Enabled = isIpv6Enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getIsIpv6Enabled}
         * @param isIpv6Enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}.
         * @return {@code this}
         */
        public Builder isIpv6Enabled(com.hashicorp.cdktf.IResolvable isIpv6Enabled) {
            this.isIpv6Enabled = isIpv6Enabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getLoggingConfig}
         * @param loggingConfig logging_config block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#logging_config CloudfrontDistribution#logging_config}
         * @return {@code this}
         */
        public Builder loggingConfig(imports.aws.cloudfront.CloudfrontDistributionLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOrderedCacheBehavior}
         * @param orderedCacheBehavior ordered_cache_behavior block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#ordered_cache_behavior CloudfrontDistribution#ordered_cache_behavior}
         * @return {@code this}
         */
        public Builder orderedCacheBehavior(com.hashicorp.cdktf.IResolvable orderedCacheBehavior) {
            this.orderedCacheBehavior = orderedCacheBehavior;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOrderedCacheBehavior}
         * @param orderedCacheBehavior ordered_cache_behavior block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#ordered_cache_behavior CloudfrontDistribution#ordered_cache_behavior}
         * @return {@code this}
         */
        public Builder orderedCacheBehavior(java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior) {
            this.orderedCacheBehavior = orderedCacheBehavior;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOriginGroup}
         * @param originGroup origin_group block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_group CloudfrontDistribution#origin_group}
         * @return {@code this}
         */
        public Builder originGroup(com.hashicorp.cdktf.IResolvable originGroup) {
            this.originGroup = originGroup;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getOriginGroup}
         * @param originGroup origin_group block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_group CloudfrontDistribution#origin_group}
         * @return {@code this}
         */
        public Builder originGroup(java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOriginGroup> originGroup) {
            this.originGroup = originGroup;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getPriceClass}
         * @param priceClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#price_class CloudfrontDistribution#price_class}.
         * @return {@code this}
         */
        public Builder priceClass(java.lang.String priceClass) {
            this.priceClass = priceClass;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getRetainOnDelete}
         * @param retainOnDelete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}.
         * @return {@code this}
         */
        public Builder retainOnDelete(java.lang.Boolean retainOnDelete) {
            this.retainOnDelete = retainOnDelete;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getRetainOnDelete}
         * @param retainOnDelete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}.
         * @return {@code this}
         */
        public Builder retainOnDelete(com.hashicorp.cdktf.IResolvable retainOnDelete) {
            this.retainOnDelete = retainOnDelete;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags CloudfrontDistribution#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags_all CloudfrontDistribution#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getWaitForDeployment}
         * @param waitForDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}.
         * @return {@code this}
         */
        public Builder waitForDeployment(java.lang.Boolean waitForDeployment) {
            this.waitForDeployment = waitForDeployment;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getWaitForDeployment}
         * @param waitForDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}.
         * @return {@code this}
         */
        public Builder waitForDeployment(com.hashicorp.cdktf.IResolvable waitForDeployment) {
            this.waitForDeployment = waitForDeployment;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getWebAclId}
         * @param webAclId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#web_acl_id CloudfrontDistribution#web_acl_id}.
         * @return {@code this}
         */
        public Builder webAclId(java.lang.String webAclId) {
            this.webAclId = webAclId;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionConfig {
        private final imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior defaultCacheBehavior;
        private final java.lang.Object enabled;
        private final java.lang.Object origin;
        private final imports.aws.cloudfront.CloudfrontDistributionRestrictions restrictions;
        private final imports.aws.cloudfront.CloudfrontDistributionViewerCertificate viewerCertificate;
        private final java.util.List<java.lang.String> aliases;
        private final java.lang.String comment;
        private final java.lang.Object customErrorResponse;
        private final java.lang.String defaultRootObject;
        private final java.lang.String httpVersion;
        private final java.lang.String id;
        private final java.lang.Object isIpv6Enabled;
        private final imports.aws.cloudfront.CloudfrontDistributionLoggingConfig loggingConfig;
        private final java.lang.Object orderedCacheBehavior;
        private final java.lang.Object originGroup;
        private final java.lang.String priceClass;
        private final java.lang.Object retainOnDelete;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final java.lang.Object waitForDeployment;
        private final java.lang.String webAclId;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultCacheBehavior = software.amazon.jsii.Kernel.get(this, "defaultCacheBehavior", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.origin = software.amazon.jsii.Kernel.get(this, "origin", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.restrictions = software.amazon.jsii.Kernel.get(this, "restrictions", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictions.class));
            this.viewerCertificate = software.amazon.jsii.Kernel.get(this, "viewerCertificate", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionViewerCertificate.class));
            this.aliases = software.amazon.jsii.Kernel.get(this, "aliases", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.comment = software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customErrorResponse = software.amazon.jsii.Kernel.get(this, "customErrorResponse", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.defaultRootObject = software.amazon.jsii.Kernel.get(this, "defaultRootObject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.httpVersion = software.amazon.jsii.Kernel.get(this, "httpVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isIpv6Enabled = software.amazon.jsii.Kernel.get(this, "isIpv6Enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.loggingConfig = software.amazon.jsii.Kernel.get(this, "loggingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionLoggingConfig.class));
            this.orderedCacheBehavior = software.amazon.jsii.Kernel.get(this, "orderedCacheBehavior", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.originGroup = software.amazon.jsii.Kernel.get(this, "originGroup", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.priceClass = software.amazon.jsii.Kernel.get(this, "priceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.retainOnDelete = software.amazon.jsii.Kernel.get(this, "retainOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.waitForDeployment = software.amazon.jsii.Kernel.get(this, "waitForDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.webAclId = software.amazon.jsii.Kernel.get(this, "webAclId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultCacheBehavior = java.util.Objects.requireNonNull(builder.defaultCacheBehavior, "defaultCacheBehavior is required");
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
            this.origin = java.util.Objects.requireNonNull(builder.origin, "origin is required");
            this.restrictions = java.util.Objects.requireNonNull(builder.restrictions, "restrictions is required");
            this.viewerCertificate = java.util.Objects.requireNonNull(builder.viewerCertificate, "viewerCertificate is required");
            this.aliases = builder.aliases;
            this.comment = builder.comment;
            this.customErrorResponse = builder.customErrorResponse;
            this.defaultRootObject = builder.defaultRootObject;
            this.httpVersion = builder.httpVersion;
            this.id = builder.id;
            this.isIpv6Enabled = builder.isIpv6Enabled;
            this.loggingConfig = builder.loggingConfig;
            this.orderedCacheBehavior = builder.orderedCacheBehavior;
            this.originGroup = builder.originGroup;
            this.priceClass = builder.priceClass;
            this.retainOnDelete = builder.retainOnDelete;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.waitForDeployment = builder.waitForDeployment;
            this.webAclId = builder.webAclId;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior getDefaultCacheBehavior() {
            return this.defaultCacheBehavior;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Object getOrigin() {
            return this.origin;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionRestrictions getRestrictions() {
            return this.restrictions;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionViewerCertificate getViewerCertificate() {
            return this.viewerCertificate;
        }

        @Override
        public final java.util.List<java.lang.String> getAliases() {
            return this.aliases;
        }

        @Override
        public final java.lang.String getComment() {
            return this.comment;
        }

        @Override
        public final java.lang.Object getCustomErrorResponse() {
            return this.customErrorResponse;
        }

        @Override
        public final java.lang.String getDefaultRootObject() {
            return this.defaultRootObject;
        }

        @Override
        public final java.lang.String getHttpVersion() {
            return this.httpVersion;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getIsIpv6Enabled() {
            return this.isIpv6Enabled;
        }

        @Override
        public final imports.aws.cloudfront.CloudfrontDistributionLoggingConfig getLoggingConfig() {
            return this.loggingConfig;
        }

        @Override
        public final java.lang.Object getOrderedCacheBehavior() {
            return this.orderedCacheBehavior;
        }

        @Override
        public final java.lang.Object getOriginGroup() {
            return this.originGroup;
        }

        @Override
        public final java.lang.String getPriceClass() {
            return this.priceClass;
        }

        @Override
        public final java.lang.Object getRetainOnDelete() {
            return this.retainOnDelete;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final java.lang.Object getWaitForDeployment() {
            return this.waitForDeployment;
        }

        @Override
        public final java.lang.String getWebAclId() {
            return this.webAclId;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultCacheBehavior", om.valueToTree(this.getDefaultCacheBehavior()));
            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("origin", om.valueToTree(this.getOrigin()));
            data.set("restrictions", om.valueToTree(this.getRestrictions()));
            data.set("viewerCertificate", om.valueToTree(this.getViewerCertificate()));
            if (this.getAliases() != null) {
                data.set("aliases", om.valueToTree(this.getAliases()));
            }
            if (this.getComment() != null) {
                data.set("comment", om.valueToTree(this.getComment()));
            }
            if (this.getCustomErrorResponse() != null) {
                data.set("customErrorResponse", om.valueToTree(this.getCustomErrorResponse()));
            }
            if (this.getDefaultRootObject() != null) {
                data.set("defaultRootObject", om.valueToTree(this.getDefaultRootObject()));
            }
            if (this.getHttpVersion() != null) {
                data.set("httpVersion", om.valueToTree(this.getHttpVersion()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIsIpv6Enabled() != null) {
                data.set("isIpv6Enabled", om.valueToTree(this.getIsIpv6Enabled()));
            }
            if (this.getLoggingConfig() != null) {
                data.set("loggingConfig", om.valueToTree(this.getLoggingConfig()));
            }
            if (this.getOrderedCacheBehavior() != null) {
                data.set("orderedCacheBehavior", om.valueToTree(this.getOrderedCacheBehavior()));
            }
            if (this.getOriginGroup() != null) {
                data.set("originGroup", om.valueToTree(this.getOriginGroup()));
            }
            if (this.getPriceClass() != null) {
                data.set("priceClass", om.valueToTree(this.getPriceClass()));
            }
            if (this.getRetainOnDelete() != null) {
                data.set("retainOnDelete", om.valueToTree(this.getRetainOnDelete()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getWaitForDeployment() != null) {
                data.set("waitForDeployment", om.valueToTree(this.getWaitForDeployment()));
            }
            if (this.getWebAclId() != null) {
                data.set("webAclId", om.valueToTree(this.getWebAclId()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionConfig.Jsii$Proxy that = (CloudfrontDistributionConfig.Jsii$Proxy) o;

            if (!defaultCacheBehavior.equals(that.defaultCacheBehavior)) return false;
            if (!enabled.equals(that.enabled)) return false;
            if (!origin.equals(that.origin)) return false;
            if (!restrictions.equals(that.restrictions)) return false;
            if (!viewerCertificate.equals(that.viewerCertificate)) return false;
            if (this.aliases != null ? !this.aliases.equals(that.aliases) : that.aliases != null) return false;
            if (this.comment != null ? !this.comment.equals(that.comment) : that.comment != null) return false;
            if (this.customErrorResponse != null ? !this.customErrorResponse.equals(that.customErrorResponse) : that.customErrorResponse != null) return false;
            if (this.defaultRootObject != null ? !this.defaultRootObject.equals(that.defaultRootObject) : that.defaultRootObject != null) return false;
            if (this.httpVersion != null ? !this.httpVersion.equals(that.httpVersion) : that.httpVersion != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.isIpv6Enabled != null ? !this.isIpv6Enabled.equals(that.isIpv6Enabled) : that.isIpv6Enabled != null) return false;
            if (this.loggingConfig != null ? !this.loggingConfig.equals(that.loggingConfig) : that.loggingConfig != null) return false;
            if (this.orderedCacheBehavior != null ? !this.orderedCacheBehavior.equals(that.orderedCacheBehavior) : that.orderedCacheBehavior != null) return false;
            if (this.originGroup != null ? !this.originGroup.equals(that.originGroup) : that.originGroup != null) return false;
            if (this.priceClass != null ? !this.priceClass.equals(that.priceClass) : that.priceClass != null) return false;
            if (this.retainOnDelete != null ? !this.retainOnDelete.equals(that.retainOnDelete) : that.retainOnDelete != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.waitForDeployment != null ? !this.waitForDeployment.equals(that.waitForDeployment) : that.waitForDeployment != null) return false;
            if (this.webAclId != null ? !this.webAclId.equals(that.webAclId) : that.webAclId != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultCacheBehavior.hashCode();
            result = 31 * result + (this.enabled.hashCode());
            result = 31 * result + (this.origin.hashCode());
            result = 31 * result + (this.restrictions.hashCode());
            result = 31 * result + (this.viewerCertificate.hashCode());
            result = 31 * result + (this.aliases != null ? this.aliases.hashCode() : 0);
            result = 31 * result + (this.comment != null ? this.comment.hashCode() : 0);
            result = 31 * result + (this.customErrorResponse != null ? this.customErrorResponse.hashCode() : 0);
            result = 31 * result + (this.defaultRootObject != null ? this.defaultRootObject.hashCode() : 0);
            result = 31 * result + (this.httpVersion != null ? this.httpVersion.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.isIpv6Enabled != null ? this.isIpv6Enabled.hashCode() : 0);
            result = 31 * result + (this.loggingConfig != null ? this.loggingConfig.hashCode() : 0);
            result = 31 * result + (this.orderedCacheBehavior != null ? this.orderedCacheBehavior.hashCode() : 0);
            result = 31 * result + (this.originGroup != null ? this.originGroup.hashCode() : 0);
            result = 31 * result + (this.priceClass != null ? this.priceClass.hashCode() : 0);
            result = 31 * result + (this.retainOnDelete != null ? this.retainOnDelete.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.waitForDeployment != null ? this.waitForDeployment.hashCode() : 0);
            result = 31 * result + (this.webAclId != null ? this.webAclId.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
