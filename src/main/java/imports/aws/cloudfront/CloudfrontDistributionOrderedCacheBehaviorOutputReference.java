package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.193Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorOutputReference")
public class CloudfrontDistributionOrderedCacheBehaviorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontDistributionOrderedCacheBehaviorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistributionOrderedCacheBehaviorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CloudfrontDistributionOrderedCacheBehaviorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putForwardedValues(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValues value) {
        software.amazon.jsii.Kernel.call(this, "putForwardedValues", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFunctionAssociation(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFunctionAssociation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLambdaFunctionAssociation(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLambdaFunctionAssociation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCachePolicyId() {
        software.amazon.jsii.Kernel.call(this, "resetCachePolicyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompress() {
        software.amazon.jsii.Kernel.call(this, "resetCompress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultTtl() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFieldLevelEncryptionId() {
        software.amazon.jsii.Kernel.call(this, "resetFieldLevelEncryptionId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForwardedValues() {
        software.amazon.jsii.Kernel.call(this, "resetForwardedValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFunctionAssociation() {
        software.amazon.jsii.Kernel.call(this, "resetFunctionAssociation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaFunctionAssociation() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaFunctionAssociation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxTtl() {
        software.amazon.jsii.Kernel.call(this, "resetMaxTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinTtl() {
        software.amazon.jsii.Kernel.call(this, "resetMinTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOriginRequestPolicyId() {
        software.amazon.jsii.Kernel.call(this, "resetOriginRequestPolicyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRealtimeLogConfigArn() {
        software.amazon.jsii.Kernel.call(this, "resetRealtimeLogConfigArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResponseHeadersPolicyId() {
        software.amazon.jsii.Kernel.call(this, "resetResponseHeadersPolicyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmoothStreaming() {
        software.amazon.jsii.Kernel.call(this, "resetSmoothStreaming", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrustedKeyGroups() {
        software.amazon.jsii.Kernel.call(this, "resetTrustedKeyGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrustedSigners() {
        software.amazon.jsii.Kernel.call(this, "resetTrustedSigners", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValuesOutputReference getForwardedValues() {
        return software.amazon.jsii.Kernel.get(this, "forwardedValues", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValuesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorFunctionAssociationList getFunctionAssociation() {
        return software.amazon.jsii.Kernel.get(this, "functionAssociation", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorFunctionAssociationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorLambdaFunctionAssociationList getLambdaFunctionAssociation() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionAssociation", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorLambdaFunctionAssociationList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedMethodsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedMethodsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCachedMethodsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cachedMethodsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCachePolicyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "cachePolicyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCompressInput() {
        return software.amazon.jsii.Kernel.get(this, "compressInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultTtlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFieldLevelEncryptionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldLevelEncryptionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValues getForwardedValuesInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardedValuesInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValues.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFunctionAssociationInput() {
        return software.amazon.jsii.Kernel.get(this, "functionAssociationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLambdaFunctionAssociationInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionAssociationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "maxTtlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "minTtlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOriginRequestPolicyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "originRequestPolicyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathPatternInput() {
        return software.amazon.jsii.Kernel.get(this, "pathPatternInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRealtimeLogConfigArnInput() {
        return software.amazon.jsii.Kernel.get(this, "realtimeLogConfigArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResponseHeadersPolicyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "responseHeadersPolicyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSmoothStreamingInput() {
        return software.amazon.jsii.Kernel.get(this, "smoothStreamingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetOriginIdInput() {
        return software.amazon.jsii.Kernel.get(this, "targetOriginIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedKeyGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "trustedKeyGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedSignersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "trustedSignersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getViewerProtocolPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "viewerProtocolPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedMethods() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedMethods(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedMethods", java.util.Objects.requireNonNull(value, "allowedMethods is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCachedMethods() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "cachedMethods", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCachedMethods(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cachedMethods", java.util.Objects.requireNonNull(value, "cachedMethods is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCachePolicyId() {
        return software.amazon.jsii.Kernel.get(this, "cachePolicyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCachePolicyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cachePolicyId", java.util.Objects.requireNonNull(value, "cachePolicyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCompress() {
        return software.amazon.jsii.Kernel.get(this, "compress", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCompress(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "compress", java.util.Objects.requireNonNull(value, "compress is required"));
    }

    public void setCompress(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "compress", java.util.Objects.requireNonNull(value, "compress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultTtl() {
        return software.amazon.jsii.Kernel.get(this, "defaultTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultTtl", java.util.Objects.requireNonNull(value, "defaultTtl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFieldLevelEncryptionId() {
        return software.amazon.jsii.Kernel.get(this, "fieldLevelEncryptionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFieldLevelEncryptionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fieldLevelEncryptionId", java.util.Objects.requireNonNull(value, "fieldLevelEncryptionId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxTtl() {
        return software.amazon.jsii.Kernel.get(this, "maxTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxTtl", java.util.Objects.requireNonNull(value, "maxTtl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinTtl() {
        return software.amazon.jsii.Kernel.get(this, "minTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minTtl", java.util.Objects.requireNonNull(value, "minTtl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOriginRequestPolicyId() {
        return software.amazon.jsii.Kernel.get(this, "originRequestPolicyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOriginRequestPolicyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "originRequestPolicyId", java.util.Objects.requireNonNull(value, "originRequestPolicyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPathPattern() {
        return software.amazon.jsii.Kernel.get(this, "pathPattern", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPathPattern(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pathPattern", java.util.Objects.requireNonNull(value, "pathPattern is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRealtimeLogConfigArn() {
        return software.amazon.jsii.Kernel.get(this, "realtimeLogConfigArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRealtimeLogConfigArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "realtimeLogConfigArn", java.util.Objects.requireNonNull(value, "realtimeLogConfigArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseHeadersPolicyId() {
        return software.amazon.jsii.Kernel.get(this, "responseHeadersPolicyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResponseHeadersPolicyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "responseHeadersPolicyId", java.util.Objects.requireNonNull(value, "responseHeadersPolicyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSmoothStreaming() {
        return software.amazon.jsii.Kernel.get(this, "smoothStreaming", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSmoothStreaming(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "smoothStreaming", java.util.Objects.requireNonNull(value, "smoothStreaming is required"));
    }

    public void setSmoothStreaming(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "smoothStreaming", java.util.Objects.requireNonNull(value, "smoothStreaming is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetOriginId() {
        return software.amazon.jsii.Kernel.get(this, "targetOriginId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetOriginId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetOriginId", java.util.Objects.requireNonNull(value, "targetOriginId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTrustedKeyGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "trustedKeyGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTrustedKeyGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "trustedKeyGroups", java.util.Objects.requireNonNull(value, "trustedKeyGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTrustedSigners() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "trustedSigners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTrustedSigners(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "trustedSigners", java.util.Objects.requireNonNull(value, "trustedSigners is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getViewerProtocolPolicy() {
        return software.amazon.jsii.Kernel.get(this, "viewerProtocolPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setViewerProtocolPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "viewerProtocolPolicy", java.util.Objects.requireNonNull(value, "viewerProtocolPolicy is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehavior value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
