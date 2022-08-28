package imports.aws;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws aws}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.273Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AwsProvider")
public class AwsProvider extends com.hashicorp.cdktf.TerraformProvider {

    protected AwsProvider(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AwsProvider(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.AwsProvider.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws aws} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public AwsProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.AwsProviderConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws aws} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public AwsProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetAccessKey() {
        software.amazon.jsii.Kernel.call(this, "resetAccessKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAlias() {
        software.amazon.jsii.Kernel.call(this, "resetAlias", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowedAccountIds() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedAccountIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAssumeRole() {
        software.amazon.jsii.Kernel.call(this, "resetAssumeRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAssumeRoleWithWebIdentity() {
        software.amazon.jsii.Kernel.call(this, "resetAssumeRoleWithWebIdentity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomCaBundle() {
        software.amazon.jsii.Kernel.call(this, "resetCustomCaBundle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultTags() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEc2MetadataServiceEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetEc2MetadataServiceEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEc2MetadataServiceEndpointMode() {
        software.amazon.jsii.Kernel.call(this, "resetEc2MetadataServiceEndpointMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpoints() {
        software.amazon.jsii.Kernel.call(this, "resetEndpoints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForbiddenAccountIds() {
        software.amazon.jsii.Kernel.call(this, "resetForbiddenAccountIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpProxy() {
        software.amazon.jsii.Kernel.call(this, "resetHttpProxy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIgnoreTags() {
        software.amazon.jsii.Kernel.call(this, "resetIgnoreTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInsecure() {
        software.amazon.jsii.Kernel.call(this, "resetInsecure", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxRetries() {
        software.amazon.jsii.Kernel.call(this, "resetMaxRetries", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProfile() {
        software.amazon.jsii.Kernel.call(this, "resetProfile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3ForcePathStyle() {
        software.amazon.jsii.Kernel.call(this, "resetS3ForcePathStyle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3UsePathStyle() {
        software.amazon.jsii.Kernel.call(this, "resetS3UsePathStyle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretKey() {
        software.amazon.jsii.Kernel.call(this, "resetSecretKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSharedConfigFiles() {
        software.amazon.jsii.Kernel.call(this, "resetSharedConfigFiles", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSharedCredentialsFile() {
        software.amazon.jsii.Kernel.call(this, "resetSharedCredentialsFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSharedCredentialsFiles() {
        software.amazon.jsii.Kernel.call(this, "resetSharedCredentialsFiles", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipCredentialsValidation() {
        software.amazon.jsii.Kernel.call(this, "resetSkipCredentialsValidation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipGetEc2Platforms() {
        software.amazon.jsii.Kernel.call(this, "resetSkipGetEc2Platforms", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipMetadataApiCheck() {
        software.amazon.jsii.Kernel.call(this, "resetSkipMetadataApiCheck", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipRegionValidation() {
        software.amazon.jsii.Kernel.call(this, "resetSkipRegionValidation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipRequestingAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetSkipRequestingAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStsRegion() {
        software.amazon.jsii.Kernel.call(this, "resetStsRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetToken() {
        software.amazon.jsii.Kernel.call(this, "resetToken", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseDualstackEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetUseDualstackEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseFipsEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetUseFipsEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "accessKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAliasInput() {
        return software.amazon.jsii.Kernel.get(this, "aliasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedAccountIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedAccountIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRole getAssumeRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "assumeRoleInput", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRole.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRoleWithWebIdentity getAssumeRoleWithWebIdentityInput() {
        return software.amazon.jsii.Kernel.get(this, "assumeRoleWithWebIdentityInput", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRoleWithWebIdentity.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomCaBundleInput() {
        return software.amazon.jsii.Kernel.get(this, "customCaBundleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderDefaultTags getDefaultTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultTagsInput", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderDefaultTags.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEc2MetadataServiceEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "ec2MetadataServiceEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEc2MetadataServiceEndpointModeInput() {
        return software.amazon.jsii.Kernel.get(this, "ec2MetadataServiceEndpointModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEndpointsInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenAccountIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "forbiddenAccountIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpProxyInput() {
        return software.amazon.jsii.Kernel.get(this, "httpProxyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderIgnoreTags getIgnoreTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "ignoreTagsInput", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderIgnoreTags.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsecureInput() {
        return software.amazon.jsii.Kernel.get(this, "insecureInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetriesInput() {
        return software.amazon.jsii.Kernel.get(this, "maxRetriesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProfileInput() {
        return software.amazon.jsii.Kernel.get(this, "profileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getS3ForcePathStyleInput() {
        return software.amazon.jsii.Kernel.get(this, "s3ForcePathStyleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getS3UsePathStyleInput() {
        return software.amazon.jsii.Kernel.get(this, "s3UsePathStyleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSharedConfigFilesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sharedConfigFilesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSharedCredentialsFileInput() {
        return software.amazon.jsii.Kernel.get(this, "sharedCredentialsFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSharedCredentialsFilesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sharedCredentialsFilesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipCredentialsValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "skipCredentialsValidationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipGetEc2PlatformsInput() {
        return software.amazon.jsii.Kernel.get(this, "skipGetEc2PlatformsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSkipMetadataApiCheckInput() {
        return software.amazon.jsii.Kernel.get(this, "skipMetadataApiCheckInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipRegionValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "skipRegionValidationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipRequestingAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "skipRequestingAccountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStsRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "stsRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseDualstackEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "useDualstackEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseFipsEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "useFipsEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessKey() {
        return software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessKey(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessKey", value);
    }

    @Override
    public @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public void setAlias(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alias", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedAccountIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setAllowedAccountIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedAccountIds", value);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRole getAssumeRole() {
        return software.amazon.jsii.Kernel.get(this, "assumeRole", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRole.class));
    }

    public void setAssumeRole(final @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRole value) {
        software.amazon.jsii.Kernel.set(this, "assumeRole", value);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRoleWithWebIdentity getAssumeRoleWithWebIdentity() {
        return software.amazon.jsii.Kernel.get(this, "assumeRoleWithWebIdentity", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRoleWithWebIdentity.class));
    }

    public void setAssumeRoleWithWebIdentity(final @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRoleWithWebIdentity value) {
        software.amazon.jsii.Kernel.set(this, "assumeRoleWithWebIdentity", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomCaBundle() {
        return software.amazon.jsii.Kernel.get(this, "customCaBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomCaBundle(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customCaBundle", value);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderDefaultTags getDefaultTags() {
        return software.amazon.jsii.Kernel.get(this, "defaultTags", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderDefaultTags.class));
    }

    public void setDefaultTags(final @org.jetbrains.annotations.Nullable imports.aws.AwsProviderDefaultTags value) {
        software.amazon.jsii.Kernel.set(this, "defaultTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEc2MetadataServiceEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "ec2MetadataServiceEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEc2MetadataServiceEndpoint(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ec2MetadataServiceEndpoint", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEc2MetadataServiceEndpointMode() {
        return software.amazon.jsii.Kernel.get(this, "ec2MetadataServiceEndpointMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEc2MetadataServiceEndpointMode(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ec2MetadataServiceEndpointMode", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEndpoints() {
        return software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEndpoints(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "endpoints", value);
    }

    public void setEndpoints(final @org.jetbrains.annotations.Nullable java.util.List<imports.aws.AwsProviderEndpoints> value) {
        software.amazon.jsii.Kernel.set(this, "endpoints", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenAccountIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "forbiddenAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setForbiddenAccountIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "forbiddenAccountIds", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpProxy() {
        return software.amazon.jsii.Kernel.get(this, "httpProxy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpProxy(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpProxy", value);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AwsProviderIgnoreTags getIgnoreTags() {
        return software.amazon.jsii.Kernel.get(this, "ignoreTags", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderIgnoreTags.class));
    }

    public void setIgnoreTags(final @org.jetbrains.annotations.Nullable imports.aws.AwsProviderIgnoreTags value) {
        software.amazon.jsii.Kernel.set(this, "ignoreTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsecure() {
        return software.amazon.jsii.Kernel.get(this, "insecure", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInsecure(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "insecure", value);
    }

    public void setInsecure(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "insecure", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetries() {
        return software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxRetries(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxRetries", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProfile() {
        return software.amazon.jsii.Kernel.get(this, "profile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProfile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "profile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getS3ForcePathStyle() {
        return software.amazon.jsii.Kernel.get(this, "s3ForcePathStyle", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setS3ForcePathStyle(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "s3ForcePathStyle", value);
    }

    public void setS3ForcePathStyle(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "s3ForcePathStyle", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getS3UsePathStyle() {
        return software.amazon.jsii.Kernel.get(this, "s3UsePathStyle", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setS3UsePathStyle(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "s3UsePathStyle", value);
    }

    public void setS3UsePathStyle(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "s3UsePathStyle", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretKey() {
        return software.amazon.jsii.Kernel.get(this, "secretKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretKey(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretKey", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSharedConfigFiles() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sharedConfigFiles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSharedConfigFiles(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sharedConfigFiles", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSharedCredentialsFile() {
        return software.amazon.jsii.Kernel.get(this, "sharedCredentialsFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSharedCredentialsFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sharedCredentialsFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSharedCredentialsFiles() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sharedCredentialsFiles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSharedCredentialsFiles(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sharedCredentialsFiles", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipCredentialsValidation() {
        return software.amazon.jsii.Kernel.get(this, "skipCredentialsValidation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipCredentialsValidation(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipCredentialsValidation", value);
    }

    public void setSkipCredentialsValidation(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipCredentialsValidation", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipGetEc2Platforms() {
        return software.amazon.jsii.Kernel.get(this, "skipGetEc2Platforms", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipGetEc2Platforms(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipGetEc2Platforms", value);
    }

    public void setSkipGetEc2Platforms(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipGetEc2Platforms", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSkipMetadataApiCheck() {
        return software.amazon.jsii.Kernel.get(this, "skipMetadataApiCheck", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSkipMetadataApiCheck(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "skipMetadataApiCheck", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipRegionValidation() {
        return software.amazon.jsii.Kernel.get(this, "skipRegionValidation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipRegionValidation(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipRegionValidation", value);
    }

    public void setSkipRegionValidation(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipRegionValidation", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipRequestingAccountId() {
        return software.amazon.jsii.Kernel.get(this, "skipRequestingAccountId", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipRequestingAccountId(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipRequestingAccountId", value);
    }

    public void setSkipRequestingAccountId(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipRequestingAccountId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStsRegion() {
        return software.amazon.jsii.Kernel.get(this, "stsRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStsRegion(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stsRegion", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setToken(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "token", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseDualstackEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "useDualstackEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseDualstackEndpoint(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useDualstackEndpoint", value);
    }

    public void setUseDualstackEndpoint(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useDualstackEndpoint", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseFipsEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "useFipsEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseFipsEndpoint(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useFipsEndpoint", value);
    }

    public void setUseFipsEndpoint(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useFipsEndpoint", value);
    }

    /**
     * A fluent builder for {@link imports.aws.AwsProvider}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.AwsProvider> {
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
        private imports.aws.AwsProviderConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#access_key AwsProvider#access_key}
         * <p>
         * @return {@code this}
         * @param accessKey The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console. This parameter is required.
         */
        public Builder accessKey(final java.lang.String accessKey) {
            this.config().accessKey(accessKey);
            return this;
        }

        /**
         * Alias name.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#alias AwsProvider#alias}
         * <p>
         * @return {@code this}
         * @param alias Alias name. This parameter is required.
         */
        public Builder alias(final java.lang.String alias) {
            this.config().alias(alias);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#allowed_account_ids AwsProvider#allowed_account_ids}.
         * <p>
         * @return {@code this}
         * @param allowedAccountIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#allowed_account_ids AwsProvider#allowed_account_ids}. This parameter is required.
         */
        public Builder allowedAccountIds(final java.util.List<java.lang.String> allowedAccountIds) {
            this.config().allowedAccountIds(allowedAccountIds);
            return this;
        }

        /**
         * assume_role block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#assume_role AwsProvider#assume_role}
         * <p>
         * @return {@code this}
         * @param assumeRole assume_role block. This parameter is required.
         */
        public Builder assumeRole(final imports.aws.AwsProviderAssumeRole assumeRole) {
            this.config().assumeRole(assumeRole);
            return this;
        }

        /**
         * assume_role_with_web_identity block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#assume_role_with_web_identity AwsProvider#assume_role_with_web_identity}
         * <p>
         * @return {@code this}
         * @param assumeRoleWithWebIdentity assume_role_with_web_identity block. This parameter is required.
         */
        public Builder assumeRoleWithWebIdentity(final imports.aws.AwsProviderAssumeRoleWithWebIdentity assumeRoleWithWebIdentity) {
            this.config().assumeRoleWithWebIdentity(assumeRoleWithWebIdentity);
            return this;
        }

        /**
         * File containing custom root and intermediate certificates.
         * <p>
         * Can also be configured using the <code>AWS_CA_BUNDLE</code> environment variable. (Setting <code>ca_bundle</code> in the shared config file is not supported.)
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#custom_ca_bundle AwsProvider#custom_ca_bundle}
         * <p>
         * @return {@code this}
         * @param customCaBundle File containing custom root and intermediate certificates. This parameter is required.
         */
        public Builder customCaBundle(final java.lang.String customCaBundle) {
            this.config().customCaBundle(customCaBundle);
            return this;
        }

        /**
         * default_tags block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#default_tags AwsProvider#default_tags}
         * <p>
         * @return {@code this}
         * @param defaultTags default_tags block. This parameter is required.
         */
        public Builder defaultTags(final imports.aws.AwsProviderDefaultTags defaultTags) {
            this.config().defaultTags(defaultTags);
            return this;
        }

        /**
         * Address of the EC2 metadata service endpoint to use. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ec2_metadata_service_endpoint AwsProvider#ec2_metadata_service_endpoint}
         * <p>
         * @return {@code this}
         * @param ec2MetadataServiceEndpoint Address of the EC2 metadata service endpoint to use. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable. This parameter is required.
         */
        public Builder ec2MetadataServiceEndpoint(final java.lang.String ec2MetadataServiceEndpoint) {
            this.config().ec2MetadataServiceEndpoint(ec2MetadataServiceEndpoint);
            return this;
        }

        /**
         * Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ec2_metadata_service_endpoint_mode AwsProvider#ec2_metadata_service_endpoint_mode}
         * <p>
         * @return {@code this}
         * @param ec2MetadataServiceEndpointMode Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable. This parameter is required.
         */
        public Builder ec2MetadataServiceEndpointMode(final java.lang.String ec2MetadataServiceEndpointMode) {
            this.config().ec2MetadataServiceEndpointMode(ec2MetadataServiceEndpointMode);
            return this;
        }

        /**
         * endpoints block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#endpoints AwsProvider#endpoints}
         * <p>
         * @return {@code this}
         * @param endpoints endpoints block. This parameter is required.
         */
        public Builder endpoints(final com.hashicorp.cdktf.IResolvable endpoints) {
            this.config().endpoints(endpoints);
            return this;
        }
        /**
         * endpoints block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#endpoints AwsProvider#endpoints}
         * <p>
         * @return {@code this}
         * @param endpoints endpoints block. This parameter is required.
         */
        public Builder endpoints(final java.util.List<? extends imports.aws.AwsProviderEndpoints> endpoints) {
            this.config().endpoints(endpoints);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#forbidden_account_ids AwsProvider#forbidden_account_ids}.
         * <p>
         * @return {@code this}
         * @param forbiddenAccountIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#forbidden_account_ids AwsProvider#forbidden_account_ids}. This parameter is required.
         */
        public Builder forbiddenAccountIds(final java.util.List<java.lang.String> forbiddenAccountIds) {
            this.config().forbiddenAccountIds(forbiddenAccountIds);
            return this;
        }

        /**
         * The address of an HTTP proxy to use when accessing the AWS API.
         * <p>
         * Can also be configured using the <code>HTTP_PROXY</code> or <code>HTTPS_PROXY</code> environment variables.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#http_proxy AwsProvider#http_proxy}
         * <p>
         * @return {@code this}
         * @param httpProxy The address of an HTTP proxy to use when accessing the AWS API. This parameter is required.
         */
        public Builder httpProxy(final java.lang.String httpProxy) {
            this.config().httpProxy(httpProxy);
            return this;
        }

        /**
         * ignore_tags block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ignore_tags AwsProvider#ignore_tags}
         * <p>
         * @return {@code this}
         * @param ignoreTags ignore_tags block. This parameter is required.
         */
        public Builder ignoreTags(final imports.aws.AwsProviderIgnoreTags ignoreTags) {
            this.config().ignoreTags(ignoreTags);
            return this;
        }

        /**
         * Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#insecure AwsProvider#insecure}
         * <p>
         * @return {@code this}
         * @param insecure Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`. This parameter is required.
         */
        public Builder insecure(final java.lang.Boolean insecure) {
            this.config().insecure(insecure);
            return this;
        }
        /**
         * Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#insecure AwsProvider#insecure}
         * <p>
         * @return {@code this}
         * @param insecure Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`. This parameter is required.
         */
        public Builder insecure(final com.hashicorp.cdktf.IResolvable insecure) {
            this.config().insecure(insecure);
            return this;
        }

        /**
         * The maximum number of times an AWS API request is being executed.
         * <p>
         * If the API request still fails, an error is
         * thrown.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#max_retries AwsProvider#max_retries}
         * <p>
         * @return {@code this}
         * @param maxRetries The maximum number of times an AWS API request is being executed. This parameter is required.
         */
        public Builder maxRetries(final java.lang.Number maxRetries) {
            this.config().maxRetries(maxRetries);
            return this;
        }

        /**
         * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#profile AwsProvider#profile}
         * <p>
         * @return {@code this}
         * @param profile The profile for API operations. If not set, the default profile created with `aws configure` will be used. This parameter is required.
         */
        public Builder profile(final java.lang.String profile) {
            this.config().profile(profile);
            return this;
        }

        /**
         * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#region AwsProvider#region}
         * <p>
         * @return {@code this}
         * @param region The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc. This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config().region(region);
            return this;
        }

        /**
         * Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_force_path_style AwsProvider#s3_force_path_style}
         * <p>
         * @return {@code this}
         * @param s3ForcePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service. This parameter is required.
         */
        public Builder s3ForcePathStyle(final java.lang.Boolean s3ForcePathStyle) {
            this.config().s3ForcePathStyle(s3ForcePathStyle);
            return this;
        }
        /**
         * Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_force_path_style AwsProvider#s3_force_path_style}
         * <p>
         * @return {@code this}
         * @param s3ForcePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service. This parameter is required.
         */
        public Builder s3ForcePathStyle(final com.hashicorp.cdktf.IResolvable s3ForcePathStyle) {
            this.config().s3ForcePathStyle(s3ForcePathStyle);
            return this;
        }

        /**
         * Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_use_path_style AwsProvider#s3_use_path_style}
         * <p>
         * @return {@code this}
         * @param s3UsePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service. This parameter is required.
         */
        public Builder s3UsePathStyle(final java.lang.Boolean s3UsePathStyle) {
            this.config().s3UsePathStyle(s3UsePathStyle);
            return this;
        }
        /**
         * Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_use_path_style AwsProvider#s3_use_path_style}
         * <p>
         * @return {@code this}
         * @param s3UsePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service. This parameter is required.
         */
        public Builder s3UsePathStyle(final com.hashicorp.cdktf.IResolvable s3UsePathStyle) {
            this.config().s3UsePathStyle(s3UsePathStyle);
            return this;
        }

        /**
         * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#secret_key AwsProvider#secret_key}
         * <p>
         * @return {@code this}
         * @param secretKey The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console. This parameter is required.
         */
        public Builder secretKey(final java.lang.String secretKey) {
            this.config().secretKey(secretKey);
            return this;
        }

        /**
         * List of paths to shared config files. If not set, defaults to [~/.aws/config].
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_config_files AwsProvider#shared_config_files}
         * <p>
         * @return {@code this}
         * @param sharedConfigFiles List of paths to shared config files. If not set, defaults to [~/.aws/config]. This parameter is required.
         */
        public Builder sharedConfigFiles(final java.util.List<java.lang.String> sharedConfigFiles) {
            this.config().sharedConfigFiles(sharedConfigFiles);
            return this;
        }

        /**
         * The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_credentials_file AwsProvider#shared_credentials_file}
         * <p>
         * @return {@code this}
         * @param sharedCredentialsFile The path to the shared credentials file. If not set, defaults to ~/.aws/credentials. This parameter is required.
         */
        public Builder sharedCredentialsFile(final java.lang.String sharedCredentialsFile) {
            this.config().sharedCredentialsFile(sharedCredentialsFile);
            return this;
        }

        /**
         * List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials].
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_credentials_files AwsProvider#shared_credentials_files}
         * <p>
         * @return {@code this}
         * @param sharedCredentialsFiles List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials]. This parameter is required.
         */
        public Builder sharedCredentialsFiles(final java.util.List<java.lang.String> sharedCredentialsFiles) {
            this.config().sharedCredentialsFiles(sharedCredentialsFiles);
            return this;
        }

        /**
         * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_credentials_validation AwsProvider#skip_credentials_validation}
         * <p>
         * @return {@code this}
         * @param skipCredentialsValidation Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented. This parameter is required.
         */
        public Builder skipCredentialsValidation(final java.lang.Boolean skipCredentialsValidation) {
            this.config().skipCredentialsValidation(skipCredentialsValidation);
            return this;
        }
        /**
         * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_credentials_validation AwsProvider#skip_credentials_validation}
         * <p>
         * @return {@code this}
         * @param skipCredentialsValidation Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented. This parameter is required.
         */
        public Builder skipCredentialsValidation(final com.hashicorp.cdktf.IResolvable skipCredentialsValidation) {
            this.config().skipCredentialsValidation(skipCredentialsValidation);
            return this;
        }

        /**
         * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_get_ec2_platforms AwsProvider#skip_get_ec2_platforms}
         * <p>
         * @return {@code this}
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions. This parameter is required.
         */
        public Builder skipGetEc2Platforms(final java.lang.Boolean skipGetEc2Platforms) {
            this.config().skipGetEc2Platforms(skipGetEc2Platforms);
            return this;
        }
        /**
         * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_get_ec2_platforms AwsProvider#skip_get_ec2_platforms}
         * <p>
         * @return {@code this}
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions. This parameter is required.
         */
        public Builder skipGetEc2Platforms(final com.hashicorp.cdktf.IResolvable skipGetEc2Platforms) {
            this.config().skipGetEc2Platforms(skipGetEc2Platforms);
            return this;
        }

        /**
         * Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_metadata_api_check AwsProvider#skip_metadata_api_check}
         * <p>
         * @return {@code this}
         * @param skipMetadataApiCheck Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint. This parameter is required.
         */
        public Builder skipMetadataApiCheck(final java.lang.String skipMetadataApiCheck) {
            this.config().skipMetadataApiCheck(skipMetadataApiCheck);
            return this;
        }

        /**
         * Skip static validation of region name.
         * <p>
         * Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_region_validation AwsProvider#skip_region_validation}
         * <p>
         * @return {@code this}
         * @param skipRegionValidation Skip static validation of region name. This parameter is required.
         */
        public Builder skipRegionValidation(final java.lang.Boolean skipRegionValidation) {
            this.config().skipRegionValidation(skipRegionValidation);
            return this;
        }
        /**
         * Skip static validation of region name.
         * <p>
         * Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_region_validation AwsProvider#skip_region_validation}
         * <p>
         * @return {@code this}
         * @param skipRegionValidation Skip static validation of region name. This parameter is required.
         */
        public Builder skipRegionValidation(final com.hashicorp.cdktf.IResolvable skipRegionValidation) {
            this.config().skipRegionValidation(skipRegionValidation);
            return this;
        }

        /**
         * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_requesting_account_id AwsProvider#skip_requesting_account_id}
         * <p>
         * @return {@code this}
         * @param skipRequestingAccountId Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API. This parameter is required.
         */
        public Builder skipRequestingAccountId(final java.lang.Boolean skipRequestingAccountId) {
            this.config().skipRequestingAccountId(skipRequestingAccountId);
            return this;
        }
        /**
         * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_requesting_account_id AwsProvider#skip_requesting_account_id}
         * <p>
         * @return {@code this}
         * @param skipRequestingAccountId Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API. This parameter is required.
         */
        public Builder skipRequestingAccountId(final com.hashicorp.cdktf.IResolvable skipRequestingAccountId) {
            this.config().skipRequestingAccountId(skipRequestingAccountId);
            return this;
        }

        /**
         * The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#sts_region AwsProvider#sts_region}
         * <p>
         * @return {@code this}
         * @param stsRegion The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2. This parameter is required.
         */
        public Builder stsRegion(final java.lang.String stsRegion) {
            this.config().stsRegion(stsRegion);
            return this;
        }

        /**
         * session token. A session token is only required if you are using temporary security credentials.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#token AwsProvider#token}
         * <p>
         * @return {@code this}
         * @param token session token. A session token is only required if you are using temporary security credentials. This parameter is required.
         */
        public Builder token(final java.lang.String token) {
            this.config().token(token);
            return this;
        }

        /**
         * Resolve an endpoint with DualStack capability.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_dualstack_endpoint AwsProvider#use_dualstack_endpoint}
         * <p>
         * @return {@code this}
         * @param useDualstackEndpoint Resolve an endpoint with DualStack capability. This parameter is required.
         */
        public Builder useDualstackEndpoint(final java.lang.Boolean useDualstackEndpoint) {
            this.config().useDualstackEndpoint(useDualstackEndpoint);
            return this;
        }
        /**
         * Resolve an endpoint with DualStack capability.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_dualstack_endpoint AwsProvider#use_dualstack_endpoint}
         * <p>
         * @return {@code this}
         * @param useDualstackEndpoint Resolve an endpoint with DualStack capability. This parameter is required.
         */
        public Builder useDualstackEndpoint(final com.hashicorp.cdktf.IResolvable useDualstackEndpoint) {
            this.config().useDualstackEndpoint(useDualstackEndpoint);
            return this;
        }

        /**
         * Resolve an endpoint with FIPS capability.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_fips_endpoint AwsProvider#use_fips_endpoint}
         * <p>
         * @return {@code this}
         * @param useFipsEndpoint Resolve an endpoint with FIPS capability. This parameter is required.
         */
        public Builder useFipsEndpoint(final java.lang.Boolean useFipsEndpoint) {
            this.config().useFipsEndpoint(useFipsEndpoint);
            return this;
        }
        /**
         * Resolve an endpoint with FIPS capability.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_fips_endpoint AwsProvider#use_fips_endpoint}
         * <p>
         * @return {@code this}
         * @param useFipsEndpoint Resolve an endpoint with FIPS capability. This parameter is required.
         */
        public Builder useFipsEndpoint(final com.hashicorp.cdktf.IResolvable useFipsEndpoint) {
            this.config().useFipsEndpoint(useFipsEndpoint);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.AwsProvider}.
         */
        @Override
        public imports.aws.AwsProvider build() {
            return new imports.aws.AwsProvider(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.AwsProviderConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.AwsProviderConfig.Builder();
            }
            return this.config;
        }
    }
}
