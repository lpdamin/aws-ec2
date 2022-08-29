package imports.aws.cloudfront;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution aws_cloudfront_distribution}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.942Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistribution")
public class CloudfrontDistribution extends com.hashicorp.cdktf.TerraformResource {

    protected CloudfrontDistribution(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistribution(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cloudfront.CloudfrontDistribution.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution aws_cloudfront_distribution} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CloudfrontDistribution(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCustomErrorResponse(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCustomErrorResponse", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDefaultCacheBehavior(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior value) {
        software.amazon.jsii.Kernel.call(this, "putDefaultCacheBehavior", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLoggingConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionLoggingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLoggingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOrderedCacheBehavior(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOrderedCacheBehavior", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOrigin(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOrigin", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOriginGroup(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOriginGroup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRestrictions(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionRestrictions value) {
        software.amazon.jsii.Kernel.call(this, "putRestrictions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putViewerCertificate(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionViewerCertificate value) {
        software.amazon.jsii.Kernel.call(this, "putViewerCertificate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAliases() {
        software.amazon.jsii.Kernel.call(this, "resetAliases", software.amazon.jsii.NativeType.VOID);
    }

    public void resetComment() {
        software.amazon.jsii.Kernel.call(this, "resetComment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomErrorResponse() {
        software.amazon.jsii.Kernel.call(this, "resetCustomErrorResponse", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultRootObject() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultRootObject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpVersion() {
        software.amazon.jsii.Kernel.call(this, "resetHttpVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsIpv6Enabled() {
        software.amazon.jsii.Kernel.call(this, "resetIsIpv6Enabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrderedCacheBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetOrderedCacheBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOriginGroup() {
        software.amazon.jsii.Kernel.call(this, "resetOriginGroup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPriceClass() {
        software.amazon.jsii.Kernel.call(this, "resetPriceClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetainOnDelete() {
        software.amazon.jsii.Kernel.call(this, "resetRetainOnDelete", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForDeployment() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForDeployment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebAclId() {
        software.amazon.jsii.Kernel.call(this, "resetWebAclId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCallerReference() {
        return software.amazon.jsii.Kernel.get(this, "callerReference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionCustomErrorResponseList getCustomErrorResponse() {
        return software.amazon.jsii.Kernel.get(this, "customErrorResponse", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionCustomErrorResponseList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorOutputReference getDefaultCacheBehavior() {
        return software.amazon.jsii.Kernel.get(this, "defaultCacheBehavior", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehaviorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEtag() {
        return software.amazon.jsii.Kernel.get(this, "etag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostedZoneId() {
        return software.amazon.jsii.Kernel.get(this, "hostedZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInProgressValidationBatches() {
        return software.amazon.jsii.Kernel.get(this, "inProgressValidationBatches", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModifiedTime() {
        return software.amazon.jsii.Kernel.get(this, "lastModifiedTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionLoggingConfigOutputReference getLoggingConfig() {
        return software.amazon.jsii.Kernel.get(this, "loggingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionLoggingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorList getOrderedCacheBehavior() {
        return software.amazon.jsii.Kernel.get(this, "orderedCacheBehavior", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginList getOrigin() {
        return software.amazon.jsii.Kernel.get(this, "origin", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginGroupList getOriginGroup() {
        return software.amazon.jsii.Kernel.get(this, "originGroup", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginGroupList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionRestrictionsOutputReference getRestrictions() {
        return software.amazon.jsii.Kernel.get(this, "restrictions", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionTrustedKeyGroupsList getTrustedKeyGroups() {
        return software.amazon.jsii.Kernel.get(this, "trustedKeyGroups", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionTrustedKeyGroupsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionTrustedSignersList getTrustedSigners() {
        return software.amazon.jsii.Kernel.get(this, "trustedSigners", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionTrustedSignersList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionViewerCertificateOutputReference getViewerCertificate() {
        return software.amazon.jsii.Kernel.get(this, "viewerCertificate", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionViewerCertificateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliasesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "aliasesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCommentInput() {
        return software.amazon.jsii.Kernel.get(this, "commentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCustomErrorResponseInput() {
        return software.amazon.jsii.Kernel.get(this, "customErrorResponseInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior getDefaultCacheBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultCacheBehaviorInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultRootObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultRootObjectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "httpVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsIpv6EnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "isIpv6EnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionLoggingConfig getLoggingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "loggingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionLoggingConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOrderedCacheBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "orderedCacheBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOriginGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "originGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOriginInput() {
        return software.amazon.jsii.Kernel.get(this, "originInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPriceClassInput() {
        return software.amazon.jsii.Kernel.get(this, "priceClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionRestrictions getRestrictionsInput() {
        return software.amazon.jsii.Kernel.get(this, "restrictionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRetainOnDeleteInput() {
        return software.amazon.jsii.Kernel.get(this, "retainOnDeleteInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionViewerCertificate getViewerCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "viewerCertificateInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionViewerCertificate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWaitForDeploymentInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForDeploymentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWebAclIdInput() {
        return software.amazon.jsii.Kernel.get(this, "webAclIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAliases() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "aliases", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAliases(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "aliases", java.util.Objects.requireNonNull(value, "aliases is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComment() {
        return software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "comment", java.util.Objects.requireNonNull(value, "comment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultRootObject() {
        return software.amazon.jsii.Kernel.get(this, "defaultRootObject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultRootObject(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultRootObject", java.util.Objects.requireNonNull(value, "defaultRootObject is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpVersion() {
        return software.amazon.jsii.Kernel.get(this, "httpVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpVersion", java.util.Objects.requireNonNull(value, "httpVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsIpv6Enabled() {
        return software.amazon.jsii.Kernel.get(this, "isIpv6Enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsIpv6Enabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isIpv6Enabled", java.util.Objects.requireNonNull(value, "isIpv6Enabled is required"));
    }

    public void setIsIpv6Enabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isIpv6Enabled", java.util.Objects.requireNonNull(value, "isIpv6Enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPriceClass() {
        return software.amazon.jsii.Kernel.get(this, "priceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPriceClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "priceClass", java.util.Objects.requireNonNull(value, "priceClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRetainOnDelete() {
        return software.amazon.jsii.Kernel.get(this, "retainOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRetainOnDelete(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "retainOnDelete", java.util.Objects.requireNonNull(value, "retainOnDelete is required"));
    }

    public void setRetainOnDelete(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "retainOnDelete", java.util.Objects.requireNonNull(value, "retainOnDelete is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWaitForDeployment() {
        return software.amazon.jsii.Kernel.get(this, "waitForDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWaitForDeployment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "waitForDeployment", java.util.Objects.requireNonNull(value, "waitForDeployment is required"));
    }

    public void setWaitForDeployment(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "waitForDeployment", java.util.Objects.requireNonNull(value, "waitForDeployment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWebAclId() {
        return software.amazon.jsii.Kernel.get(this, "webAclId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWebAclId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "webAclId", java.util.Objects.requireNonNull(value, "webAclId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cloudfront.CloudfrontDistribution}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cloudfront.CloudfrontDistribution> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.cloudfront.CloudfrontDistributionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cloudfront.CloudfrontDistributionConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * default_cache_behavior block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_cache_behavior CloudfrontDistribution#default_cache_behavior}
         * <p>
         * @return {@code this}
         * @param defaultCacheBehavior default_cache_behavior block. This parameter is required.
         */
        public Builder defaultCacheBehavior(final imports.aws.cloudfront.CloudfrontDistributionDefaultCacheBehavior defaultCacheBehavior) {
            this.config.defaultCacheBehavior(defaultCacheBehavior);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#enabled CloudfrontDistribution#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * origin block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin CloudfrontDistribution#origin}
         * <p>
         * @return {@code this}
         * @param origin origin block. This parameter is required.
         */
        public Builder origin(final com.hashicorp.cdktf.IResolvable origin) {
            this.config.origin(origin);
            return this;
        }
        /**
         * origin block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin CloudfrontDistribution#origin}
         * <p>
         * @return {@code this}
         * @param origin origin block. This parameter is required.
         */
        public Builder origin(final java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOrigin> origin) {
            this.config.origin(origin);
            return this;
        }

        /**
         * restrictions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#restrictions CloudfrontDistribution#restrictions}
         * <p>
         * @return {@code this}
         * @param restrictions restrictions block. This parameter is required.
         */
        public Builder restrictions(final imports.aws.cloudfront.CloudfrontDistributionRestrictions restrictions) {
            this.config.restrictions(restrictions);
            return this;
        }

        /**
         * viewer_certificate block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#viewer_certificate CloudfrontDistribution#viewer_certificate}
         * <p>
         * @return {@code this}
         * @param viewerCertificate viewer_certificate block. This parameter is required.
         */
        public Builder viewerCertificate(final imports.aws.cloudfront.CloudfrontDistributionViewerCertificate viewerCertificate) {
            this.config.viewerCertificate(viewerCertificate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#aliases CloudfrontDistribution#aliases}.
         * <p>
         * @return {@code this}
         * @param aliases Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#aliases CloudfrontDistribution#aliases}. This parameter is required.
         */
        public Builder aliases(final java.util.List<java.lang.String> aliases) {
            this.config.aliases(aliases);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#comment CloudfrontDistribution#comment}.
         * <p>
         * @return {@code this}
         * @param comment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#comment CloudfrontDistribution#comment}. This parameter is required.
         */
        public Builder comment(final java.lang.String comment) {
            this.config.comment(comment);
            return this;
        }

        /**
         * custom_error_response block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_error_response CloudfrontDistribution#custom_error_response}
         * <p>
         * @return {@code this}
         * @param customErrorResponse custom_error_response block. This parameter is required.
         */
        public Builder customErrorResponse(final com.hashicorp.cdktf.IResolvable customErrorResponse) {
            this.config.customErrorResponse(customErrorResponse);
            return this;
        }
        /**
         * custom_error_response block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#custom_error_response CloudfrontDistribution#custom_error_response}
         * <p>
         * @return {@code this}
         * @param customErrorResponse custom_error_response block. This parameter is required.
         */
        public Builder customErrorResponse(final java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionCustomErrorResponse> customErrorResponse) {
            this.config.customErrorResponse(customErrorResponse);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_root_object CloudfrontDistribution#default_root_object}.
         * <p>
         * @return {@code this}
         * @param defaultRootObject Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#default_root_object CloudfrontDistribution#default_root_object}. This parameter is required.
         */
        public Builder defaultRootObject(final java.lang.String defaultRootObject) {
            this.config.defaultRootObject(defaultRootObject);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#http_version CloudfrontDistribution#http_version}.
         * <p>
         * @return {@code this}
         * @param httpVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#http_version CloudfrontDistribution#http_version}. This parameter is required.
         */
        public Builder httpVersion(final java.lang.String httpVersion) {
            this.config.httpVersion(httpVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#id CloudfrontDistribution#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#id CloudfrontDistribution#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}.
         * <p>
         * @return {@code this}
         * @param isIpv6Enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}. This parameter is required.
         */
        public Builder isIpv6Enabled(final java.lang.Boolean isIpv6Enabled) {
            this.config.isIpv6Enabled(isIpv6Enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}.
         * <p>
         * @return {@code this}
         * @param isIpv6Enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#is_ipv6_enabled CloudfrontDistribution#is_ipv6_enabled}. This parameter is required.
         */
        public Builder isIpv6Enabled(final com.hashicorp.cdktf.IResolvable isIpv6Enabled) {
            this.config.isIpv6Enabled(isIpv6Enabled);
            return this;
        }

        /**
         * logging_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#logging_config CloudfrontDistribution#logging_config}
         * <p>
         * @return {@code this}
         * @param loggingConfig logging_config block. This parameter is required.
         */
        public Builder loggingConfig(final imports.aws.cloudfront.CloudfrontDistributionLoggingConfig loggingConfig) {
            this.config.loggingConfig(loggingConfig);
            return this;
        }

        /**
         * ordered_cache_behavior block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#ordered_cache_behavior CloudfrontDistribution#ordered_cache_behavior}
         * <p>
         * @return {@code this}
         * @param orderedCacheBehavior ordered_cache_behavior block. This parameter is required.
         */
        public Builder orderedCacheBehavior(final com.hashicorp.cdktf.IResolvable orderedCacheBehavior) {
            this.config.orderedCacheBehavior(orderedCacheBehavior);
            return this;
        }
        /**
         * ordered_cache_behavior block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#ordered_cache_behavior CloudfrontDistribution#ordered_cache_behavior}
         * <p>
         * @return {@code this}
         * @param orderedCacheBehavior ordered_cache_behavior block. This parameter is required.
         */
        public Builder orderedCacheBehavior(final java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehavior> orderedCacheBehavior) {
            this.config.orderedCacheBehavior(orderedCacheBehavior);
            return this;
        }

        /**
         * origin_group block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_group CloudfrontDistribution#origin_group}
         * <p>
         * @return {@code this}
         * @param originGroup origin_group block. This parameter is required.
         */
        public Builder originGroup(final com.hashicorp.cdktf.IResolvable originGroup) {
            this.config.originGroup(originGroup);
            return this;
        }
        /**
         * origin_group block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#origin_group CloudfrontDistribution#origin_group}
         * <p>
         * @return {@code this}
         * @param originGroup origin_group block. This parameter is required.
         */
        public Builder originGroup(final java.util.List<? extends imports.aws.cloudfront.CloudfrontDistributionOriginGroup> originGroup) {
            this.config.originGroup(originGroup);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#price_class CloudfrontDistribution#price_class}.
         * <p>
         * @return {@code this}
         * @param priceClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#price_class CloudfrontDistribution#price_class}. This parameter is required.
         */
        public Builder priceClass(final java.lang.String priceClass) {
            this.config.priceClass(priceClass);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}.
         * <p>
         * @return {@code this}
         * @param retainOnDelete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}. This parameter is required.
         */
        public Builder retainOnDelete(final java.lang.Boolean retainOnDelete) {
            this.config.retainOnDelete(retainOnDelete);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}.
         * <p>
         * @return {@code this}
         * @param retainOnDelete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#retain_on_delete CloudfrontDistribution#retain_on_delete}. This parameter is required.
         */
        public Builder retainOnDelete(final com.hashicorp.cdktf.IResolvable retainOnDelete) {
            this.config.retainOnDelete(retainOnDelete);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags CloudfrontDistribution#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags CloudfrontDistribution#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags_all CloudfrontDistribution#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#tags_all CloudfrontDistribution#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}.
         * <p>
         * @return {@code this}
         * @param waitForDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}. This parameter is required.
         */
        public Builder waitForDeployment(final java.lang.Boolean waitForDeployment) {
            this.config.waitForDeployment(waitForDeployment);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}.
         * <p>
         * @return {@code this}
         * @param waitForDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#wait_for_deployment CloudfrontDistribution#wait_for_deployment}. This parameter is required.
         */
        public Builder waitForDeployment(final com.hashicorp.cdktf.IResolvable waitForDeployment) {
            this.config.waitForDeployment(waitForDeployment);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#web_acl_id CloudfrontDistribution#web_acl_id}.
         * <p>
         * @return {@code this}
         * @param webAclId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#web_acl_id CloudfrontDistribution#web_acl_id}. This parameter is required.
         */
        public Builder webAclId(final java.lang.String webAclId) {
            this.config.webAclId(webAclId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cloudfront.CloudfrontDistribution}.
         */
        @Override
        public imports.aws.cloudfront.CloudfrontDistribution build() {
            return new imports.aws.cloudfront.CloudfrontDistribution(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
