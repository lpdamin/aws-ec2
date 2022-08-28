package imports.aws.codebuild;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project aws_codebuild_project}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.434Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProject")
public class CodebuildProject extends com.hashicorp.cdktf.TerraformResource {

    protected CodebuildProject(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildProject(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.codebuild.CodebuildProject.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project aws_codebuild_project} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CodebuildProject(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putArtifacts(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectArtifacts value) {
        software.amazon.jsii.Kernel.call(this, "putArtifacts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBuildBatchConfig(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectBuildBatchConfig value) {
        software.amazon.jsii.Kernel.call(this, "putBuildBatchConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCache(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectCache value) {
        software.amazon.jsii.Kernel.call(this, "putCache", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEnvironment(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectEnvironment value) {
        software.amazon.jsii.Kernel.call(this, "putEnvironment", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFileSystemLocations(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFileSystemLocations", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogsConfig(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectLogsConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLogsConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecondaryArtifacts(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSecondaryArtifacts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecondarySources(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSecondarySources", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecondarySourceVersion(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSecondarySourceVersion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSource(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectSource value) {
        software.amazon.jsii.Kernel.call(this, "putSource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVpcConfig(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectVpcConfig value) {
        software.amazon.jsii.Kernel.call(this, "putVpcConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBadgeEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetBadgeEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBuildBatchConfig() {
        software.amazon.jsii.Kernel.call(this, "resetBuildBatchConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBuildTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetBuildTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCache() {
        software.amazon.jsii.Kernel.call(this, "resetCache", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConcurrentBuildLimit() {
        software.amazon.jsii.Kernel.call(this, "resetConcurrentBuildLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionKey() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFileSystemLocations() {
        software.amazon.jsii.Kernel.call(this, "resetFileSystemLocations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogsConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLogsConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProjectVisibility() {
        software.amazon.jsii.Kernel.call(this, "resetProjectVisibility", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueuedTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetQueuedTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceAccessRole() {
        software.amazon.jsii.Kernel.call(this, "resetResourceAccessRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondaryArtifacts() {
        software.amazon.jsii.Kernel.call(this, "resetSecondaryArtifacts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondarySources() {
        software.amazon.jsii.Kernel.call(this, "resetSecondarySources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondarySourceVersion() {
        software.amazon.jsii.Kernel.call(this, "resetSecondarySourceVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceVersion() {
        software.amazon.jsii.Kernel.call(this, "resetSourceVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetVpcConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectArtifactsOutputReference getArtifacts() {
        return software.amazon.jsii.Kernel.get(this, "artifacts", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectArtifactsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBadgeUrl() {
        return software.amazon.jsii.Kernel.get(this, "badgeUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectBuildBatchConfigOutputReference getBuildBatchConfig() {
        return software.amazon.jsii.Kernel.get(this, "buildBatchConfig", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectBuildBatchConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectCacheOutputReference getCache() {
        return software.amazon.jsii.Kernel.get(this, "cache", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectCacheOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectEnvironmentOutputReference getEnvironment() {
        return software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectEnvironmentOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectFileSystemLocationsList getFileSystemLocations() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemLocations", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectFileSystemLocationsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectLogsConfigOutputReference getLogsConfig() {
        return software.amazon.jsii.Kernel.get(this, "logsConfig", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicProjectAlias() {
        return software.amazon.jsii.Kernel.get(this, "publicProjectAlias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectSecondaryArtifactsList getSecondaryArtifacts() {
        return software.amazon.jsii.Kernel.get(this, "secondaryArtifacts", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSecondaryArtifactsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectSecondarySourcesList getSecondarySources() {
        return software.amazon.jsii.Kernel.get(this, "secondarySources", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSecondarySourcesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectSecondarySourceVersionList getSecondarySourceVersion() {
        return software.amazon.jsii.Kernel.get(this, "secondarySourceVersion", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSecondarySourceVersionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectSourceOutputReference getSource() {
        return software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSourceOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectVpcConfigOutputReference getVpcConfig() {
        return software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectVpcConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectArtifacts getArtifactsInput() {
        return software.amazon.jsii.Kernel.get(this, "artifactsInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectArtifacts.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBadgeEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "badgeEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectBuildBatchConfig getBuildBatchConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "buildBatchConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectBuildBatchConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBuildTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "buildTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectCache getCacheInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectCache.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getConcurrentBuildLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "concurrentBuildLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEncryptionKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectEnvironment getEnvironmentInput() {
        return software.amazon.jsii.Kernel.get(this, "environmentInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectEnvironment.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFileSystemLocationsInput() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemLocationsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfig getLogsConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "logsConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProjectVisibilityInput() {
        return software.amazon.jsii.Kernel.get(this, "projectVisibilityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getQueuedTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "queuedTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceAccessRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceAccessRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSecondaryArtifactsInput() {
        return software.amazon.jsii.Kernel.get(this, "secondaryArtifactsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSecondarySourcesInput() {
        return software.amazon.jsii.Kernel.get(this, "secondarySourcesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSecondarySourceVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "secondarySourceVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectSource getSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSource.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectVpcConfig getVpcConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectVpcConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getBadgeEnabled() {
        return software.amazon.jsii.Kernel.get(this, "badgeEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setBadgeEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "badgeEnabled", java.util.Objects.requireNonNull(value, "badgeEnabled is required"));
    }

    public void setBadgeEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "badgeEnabled", java.util.Objects.requireNonNull(value, "badgeEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBuildTimeout() {
        return software.amazon.jsii.Kernel.get(this, "buildTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBuildTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "buildTimeout", java.util.Objects.requireNonNull(value, "buildTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getConcurrentBuildLimit() {
        return software.amazon.jsii.Kernel.get(this, "concurrentBuildLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setConcurrentBuildLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "concurrentBuildLimit", java.util.Objects.requireNonNull(value, "concurrentBuildLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptionKey() {
        return software.amazon.jsii.Kernel.get(this, "encryptionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEncryptionKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "encryptionKey", java.util.Objects.requireNonNull(value, "encryptionKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProjectVisibility() {
        return software.amazon.jsii.Kernel.get(this, "projectVisibility", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProjectVisibility(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "projectVisibility", java.util.Objects.requireNonNull(value, "projectVisibility is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getQueuedTimeout() {
        return software.amazon.jsii.Kernel.get(this, "queuedTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setQueuedTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "queuedTimeout", java.util.Objects.requireNonNull(value, "queuedTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceAccessRole() {
        return software.amazon.jsii.Kernel.get(this, "resourceAccessRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceAccessRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceAccessRole", java.util.Objects.requireNonNull(value, "resourceAccessRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRole", java.util.Objects.requireNonNull(value, "serviceRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceVersion() {
        return software.amazon.jsii.Kernel.get(this, "sourceVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceVersion", java.util.Objects.requireNonNull(value, "sourceVersion is required"));
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

    /**
     * A fluent builder for {@link imports.aws.codebuild.CodebuildProject}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.codebuild.CodebuildProject> {
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
        private final imports.aws.codebuild.CodebuildProjectConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.codebuild.CodebuildProjectConfig.Builder();
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
         * artifacts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#artifacts CodebuildProject#artifacts}
         * <p>
         * @return {@code this}
         * @param artifacts artifacts block. This parameter is required.
         */
        public Builder artifacts(final imports.aws.codebuild.CodebuildProjectArtifacts artifacts) {
            this.config.artifacts(artifacts);
            return this;
        }

        /**
         * environment block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#environment CodebuildProject#environment}
         * <p>
         * @return {@code this}
         * @param environment environment block. This parameter is required.
         */
        public Builder environment(final imports.aws.codebuild.CodebuildProjectEnvironment environment) {
            this.config.environment(environment);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#name CodebuildProject#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#name CodebuildProject#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#service_role CodebuildProject#service_role}.
         * <p>
         * @return {@code this}
         * @param serviceRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#service_role CodebuildProject#service_role}. This parameter is required.
         */
        public Builder serviceRole(final java.lang.String serviceRole) {
            this.config.serviceRole(serviceRole);
            return this;
        }

        /**
         * source block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#source CodebuildProject#source}
         * <p>
         * @return {@code this}
         * @param source source block. This parameter is required.
         */
        public Builder source(final imports.aws.codebuild.CodebuildProjectSource source) {
            this.config.source(source);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#badge_enabled CodebuildProject#badge_enabled}.
         * <p>
         * @return {@code this}
         * @param badgeEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#badge_enabled CodebuildProject#badge_enabled}. This parameter is required.
         */
        public Builder badgeEnabled(final java.lang.Boolean badgeEnabled) {
            this.config.badgeEnabled(badgeEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#badge_enabled CodebuildProject#badge_enabled}.
         * <p>
         * @return {@code this}
         * @param badgeEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#badge_enabled CodebuildProject#badge_enabled}. This parameter is required.
         */
        public Builder badgeEnabled(final com.hashicorp.cdktf.IResolvable badgeEnabled) {
            this.config.badgeEnabled(badgeEnabled);
            return this;
        }

        /**
         * build_batch_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#build_batch_config CodebuildProject#build_batch_config}
         * <p>
         * @return {@code this}
         * @param buildBatchConfig build_batch_config block. This parameter is required.
         */
        public Builder buildBatchConfig(final imports.aws.codebuild.CodebuildProjectBuildBatchConfig buildBatchConfig) {
            this.config.buildBatchConfig(buildBatchConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#build_timeout CodebuildProject#build_timeout}.
         * <p>
         * @return {@code this}
         * @param buildTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#build_timeout CodebuildProject#build_timeout}. This parameter is required.
         */
        public Builder buildTimeout(final java.lang.Number buildTimeout) {
            this.config.buildTimeout(buildTimeout);
            return this;
        }

        /**
         * cache block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#cache CodebuildProject#cache}
         * <p>
         * @return {@code this}
         * @param cache cache block. This parameter is required.
         */
        public Builder cache(final imports.aws.codebuild.CodebuildProjectCache cache) {
            this.config.cache(cache);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#concurrent_build_limit CodebuildProject#concurrent_build_limit}.
         * <p>
         * @return {@code this}
         * @param concurrentBuildLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#concurrent_build_limit CodebuildProject#concurrent_build_limit}. This parameter is required.
         */
        public Builder concurrentBuildLimit(final java.lang.Number concurrentBuildLimit) {
            this.config.concurrentBuildLimit(concurrentBuildLimit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#description CodebuildProject#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#description CodebuildProject#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#encryption_key CodebuildProject#encryption_key}.
         * <p>
         * @return {@code this}
         * @param encryptionKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#encryption_key CodebuildProject#encryption_key}. This parameter is required.
         */
        public Builder encryptionKey(final java.lang.String encryptionKey) {
            this.config.encryptionKey(encryptionKey);
            return this;
        }

        /**
         * file_system_locations block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#file_system_locations CodebuildProject#file_system_locations}
         * <p>
         * @return {@code this}
         * @param fileSystemLocations file_system_locations block. This parameter is required.
         */
        public Builder fileSystemLocations(final com.hashicorp.cdktf.IResolvable fileSystemLocations) {
            this.config.fileSystemLocations(fileSystemLocations);
            return this;
        }
        /**
         * file_system_locations block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#file_system_locations CodebuildProject#file_system_locations}
         * <p>
         * @return {@code this}
         * @param fileSystemLocations file_system_locations block. This parameter is required.
         */
        public Builder fileSystemLocations(final java.util.List<? extends imports.aws.codebuild.CodebuildProjectFileSystemLocations> fileSystemLocations) {
            this.config.fileSystemLocations(fileSystemLocations);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#id CodebuildProject#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#id CodebuildProject#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * logs_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#logs_config CodebuildProject#logs_config}
         * <p>
         * @return {@code this}
         * @param logsConfig logs_config block. This parameter is required.
         */
        public Builder logsConfig(final imports.aws.codebuild.CodebuildProjectLogsConfig logsConfig) {
            this.config.logsConfig(logsConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#project_visibility CodebuildProject#project_visibility}.
         * <p>
         * @return {@code this}
         * @param projectVisibility Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#project_visibility CodebuildProject#project_visibility}. This parameter is required.
         */
        public Builder projectVisibility(final java.lang.String projectVisibility) {
            this.config.projectVisibility(projectVisibility);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#queued_timeout CodebuildProject#queued_timeout}.
         * <p>
         * @return {@code this}
         * @param queuedTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#queued_timeout CodebuildProject#queued_timeout}. This parameter is required.
         */
        public Builder queuedTimeout(final java.lang.Number queuedTimeout) {
            this.config.queuedTimeout(queuedTimeout);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#resource_access_role CodebuildProject#resource_access_role}.
         * <p>
         * @return {@code this}
         * @param resourceAccessRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#resource_access_role CodebuildProject#resource_access_role}. This parameter is required.
         */
        public Builder resourceAccessRole(final java.lang.String resourceAccessRole) {
            this.config.resourceAccessRole(resourceAccessRole);
            return this;
        }

        /**
         * secondary_artifacts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#secondary_artifacts CodebuildProject#secondary_artifacts}
         * <p>
         * @return {@code this}
         * @param secondaryArtifacts secondary_artifacts block. This parameter is required.
         */
        public Builder secondaryArtifacts(final com.hashicorp.cdktf.IResolvable secondaryArtifacts) {
            this.config.secondaryArtifacts(secondaryArtifacts);
            return this;
        }
        /**
         * secondary_artifacts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#secondary_artifacts CodebuildProject#secondary_artifacts}
         * <p>
         * @return {@code this}
         * @param secondaryArtifacts secondary_artifacts block. This parameter is required.
         */
        public Builder secondaryArtifacts(final java.util.List<? extends imports.aws.codebuild.CodebuildProjectSecondaryArtifacts> secondaryArtifacts) {
            this.config.secondaryArtifacts(secondaryArtifacts);
            return this;
        }

        /**
         * secondary_sources block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#secondary_sources CodebuildProject#secondary_sources}
         * <p>
         * @return {@code this}
         * @param secondarySources secondary_sources block. This parameter is required.
         */
        public Builder secondarySources(final com.hashicorp.cdktf.IResolvable secondarySources) {
            this.config.secondarySources(secondarySources);
            return this;
        }
        /**
         * secondary_sources block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#secondary_sources CodebuildProject#secondary_sources}
         * <p>
         * @return {@code this}
         * @param secondarySources secondary_sources block. This parameter is required.
         */
        public Builder secondarySources(final java.util.List<? extends imports.aws.codebuild.CodebuildProjectSecondarySources> secondarySources) {
            this.config.secondarySources(secondarySources);
            return this;
        }

        /**
         * secondary_source_version block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#secondary_source_version CodebuildProject#secondary_source_version}
         * <p>
         * @return {@code this}
         * @param secondarySourceVersion secondary_source_version block. This parameter is required.
         */
        public Builder secondarySourceVersion(final com.hashicorp.cdktf.IResolvable secondarySourceVersion) {
            this.config.secondarySourceVersion(secondarySourceVersion);
            return this;
        }
        /**
         * secondary_source_version block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#secondary_source_version CodebuildProject#secondary_source_version}
         * <p>
         * @return {@code this}
         * @param secondarySourceVersion secondary_source_version block. This parameter is required.
         */
        public Builder secondarySourceVersion(final java.util.List<? extends imports.aws.codebuild.CodebuildProjectSecondarySourceVersion> secondarySourceVersion) {
            this.config.secondarySourceVersion(secondarySourceVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#source_version CodebuildProject#source_version}.
         * <p>
         * @return {@code this}
         * @param sourceVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#source_version CodebuildProject#source_version}. This parameter is required.
         */
        public Builder sourceVersion(final java.lang.String sourceVersion) {
            this.config.sourceVersion(sourceVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#tags CodebuildProject#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#tags CodebuildProject#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#tags_all CodebuildProject#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#tags_all CodebuildProject#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * vpc_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#vpc_config CodebuildProject#vpc_config}
         * <p>
         * @return {@code this}
         * @param vpcConfig vpc_config block. This parameter is required.
         */
        public Builder vpcConfig(final imports.aws.codebuild.CodebuildProjectVpcConfig vpcConfig) {
            this.config.vpcConfig(vpcConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.codebuild.CodebuildProject}.
         */
        @Override
        public imports.aws.codebuild.CodebuildProject build() {
            return new imports.aws.codebuild.CodebuildProject(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
