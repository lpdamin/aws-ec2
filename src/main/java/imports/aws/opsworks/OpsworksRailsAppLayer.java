package imports.aws.opsworks;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer aws_opsworks_rails_app_layer}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.114Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.opsworks.OpsworksRailsAppLayer")
public class OpsworksRailsAppLayer extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksRailsAppLayer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksRailsAppLayer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.opsworks.OpsworksRailsAppLayer.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer aws_opsworks_rails_app_layer} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public OpsworksRailsAppLayer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.opsworks.OpsworksRailsAppLayerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCloudwatchConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.opsworks.OpsworksRailsAppLayerCloudwatchConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEbsVolume(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEbsVolume", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAppServer() {
        software.amazon.jsii.Kernel.call(this, "resetAppServer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoAssignElasticIps() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAssignElasticIps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoAssignPublicIps() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAssignPublicIps", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoHealing() {
        software.amazon.jsii.Kernel.call(this, "resetAutoHealing", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBundlerVersion() {
        software.amazon.jsii.Kernel.call(this, "resetBundlerVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomConfigureRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomConfigureRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomDeployRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomDeployRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomInstanceProfileArn() {
        software.amazon.jsii.Kernel.call(this, "resetCustomInstanceProfileArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomJson() {
        software.amazon.jsii.Kernel.call(this, "resetCustomJson", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetCustomSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomSetupRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomSetupRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomShutdownRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomShutdownRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomUndeployRecipes() {
        software.amazon.jsii.Kernel.call(this, "resetCustomUndeployRecipes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDrainElbOnShutdown() {
        software.amazon.jsii.Kernel.call(this, "resetDrainElbOnShutdown", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsVolume() {
        software.amazon.jsii.Kernel.call(this, "resetEbsVolume", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticLoadBalancer() {
        software.amazon.jsii.Kernel.call(this, "resetElasticLoadBalancer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstallUpdatesOnBoot() {
        software.amazon.jsii.Kernel.call(this, "resetInstallUpdatesOnBoot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceShutdownTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceShutdownTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetManageBundler() {
        software.amazon.jsii.Kernel.call(this, "resetManageBundler", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassengerVersion() {
        software.amazon.jsii.Kernel.call(this, "resetPassengerVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRubygemsVersion() {
        software.amazon.jsii.Kernel.call(this, "resetRubygemsVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRubyVersion() {
        software.amazon.jsii.Kernel.call(this, "resetRubyVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSystemPackages() {
        software.amazon.jsii.Kernel.call(this, "resetSystemPackages", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseEbsOptimizedInstances() {
        software.amazon.jsii.Kernel.call(this, "resetUseEbsOptimizedInstances", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.opsworks.OpsworksRailsAppLayerCloudwatchConfigurationOutputReference getCloudwatchConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.opsworks.OpsworksRailsAppLayerCloudwatchConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.opsworks.OpsworksRailsAppLayerEbsVolumeList getEbsVolume() {
        return software.amazon.jsii.Kernel.get(this, "ebsVolume", software.amazon.jsii.NativeType.forClass(imports.aws.opsworks.OpsworksRailsAppLayerEbsVolumeList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAppServerInput() {
        return software.amazon.jsii.Kernel.get(this, "appServerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoAssignElasticIpsInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignElasticIpsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoAssignPublicIpsInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignPublicIpsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoHealingInput() {
        return software.amazon.jsii.Kernel.get(this, "autoHealingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBundlerVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "bundlerVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.opsworks.OpsworksRailsAppLayerCloudwatchConfiguration getCloudwatchConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.opsworks.OpsworksRailsAppLayerCloudwatchConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomConfigureRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customConfigureRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomDeployRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customDeployRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomInstanceProfileArnInput() {
        return software.amazon.jsii.Kernel.get(this, "customInstanceProfileArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomJsonInput() {
        return software.amazon.jsii.Kernel.get(this, "customJsonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customSecurityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomSetupRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customSetupRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomShutdownRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customShutdownRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCustomUndeployRecipesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "customUndeployRecipesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDrainElbOnShutdownInput() {
        return software.amazon.jsii.Kernel.get(this, "drainElbOnShutdownInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEbsVolumeInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsVolumeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getElasticLoadBalancerInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticLoadBalancerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInstallUpdatesOnBootInput() {
        return software.amazon.jsii.Kernel.get(this, "installUpdatesOnBootInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInstanceShutdownTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getManageBundlerInput() {
        return software.amazon.jsii.Kernel.get(this, "manageBundlerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPassengerVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "passengerVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRubygemsVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "rubygemsVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRubyVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "rubyVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStackIdInput() {
        return software.amazon.jsii.Kernel.get(this, "stackIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSystemPackagesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "systemPackagesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseEbsOptimizedInstancesInput() {
        return software.amazon.jsii.Kernel.get(this, "useEbsOptimizedInstancesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAppServer() {
        return software.amazon.jsii.Kernel.get(this, "appServer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAppServer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "appServer", java.util.Objects.requireNonNull(value, "appServer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoAssignElasticIps() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignElasticIps", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoAssignElasticIps(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAssignElasticIps", java.util.Objects.requireNonNull(value, "autoAssignElasticIps is required"));
    }

    public void setAutoAssignElasticIps(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoAssignElasticIps", java.util.Objects.requireNonNull(value, "autoAssignElasticIps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoAssignPublicIps() {
        return software.amazon.jsii.Kernel.get(this, "autoAssignPublicIps", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoAssignPublicIps(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAssignPublicIps", java.util.Objects.requireNonNull(value, "autoAssignPublicIps is required"));
    }

    public void setAutoAssignPublicIps(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoAssignPublicIps", java.util.Objects.requireNonNull(value, "autoAssignPublicIps is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoHealing() {
        return software.amazon.jsii.Kernel.get(this, "autoHealing", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoHealing(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoHealing", java.util.Objects.requireNonNull(value, "autoHealing is required"));
    }

    public void setAutoHealing(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoHealing", java.util.Objects.requireNonNull(value, "autoHealing is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBundlerVersion() {
        return software.amazon.jsii.Kernel.get(this, "bundlerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBundlerVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bundlerVersion", java.util.Objects.requireNonNull(value, "bundlerVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomConfigureRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customConfigureRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomConfigureRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customConfigureRecipes", java.util.Objects.requireNonNull(value, "customConfigureRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomDeployRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customDeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomDeployRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customDeployRecipes", java.util.Objects.requireNonNull(value, "customDeployRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomInstanceProfileArn() {
        return software.amazon.jsii.Kernel.get(this, "customInstanceProfileArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomInstanceProfileArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customInstanceProfileArn", java.util.Objects.requireNonNull(value, "customInstanceProfileArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomJson() {
        return software.amazon.jsii.Kernel.get(this, "customJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomJson(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customJson", java.util.Objects.requireNonNull(value, "customJson is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customSecurityGroupIds", java.util.Objects.requireNonNull(value, "customSecurityGroupIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomSetupRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customSetupRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomSetupRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customSetupRecipes", java.util.Objects.requireNonNull(value, "customSetupRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomShutdownRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customShutdownRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomShutdownRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customShutdownRecipes", java.util.Objects.requireNonNull(value, "customShutdownRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCustomUndeployRecipes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "customUndeployRecipes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCustomUndeployRecipes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "customUndeployRecipes", java.util.Objects.requireNonNull(value, "customUndeployRecipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDrainElbOnShutdown() {
        return software.amazon.jsii.Kernel.get(this, "drainElbOnShutdown", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDrainElbOnShutdown(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "drainElbOnShutdown", java.util.Objects.requireNonNull(value, "drainElbOnShutdown is required"));
    }

    public void setDrainElbOnShutdown(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "drainElbOnShutdown", java.util.Objects.requireNonNull(value, "drainElbOnShutdown is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getElasticLoadBalancer() {
        return software.amazon.jsii.Kernel.get(this, "elasticLoadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setElasticLoadBalancer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "elasticLoadBalancer", java.util.Objects.requireNonNull(value, "elasticLoadBalancer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getInstallUpdatesOnBoot() {
        return software.amazon.jsii.Kernel.get(this, "installUpdatesOnBoot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInstallUpdatesOnBoot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "installUpdatesOnBoot", java.util.Objects.requireNonNull(value, "installUpdatesOnBoot is required"));
    }

    public void setInstallUpdatesOnBoot(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "installUpdatesOnBoot", java.util.Objects.requireNonNull(value, "installUpdatesOnBoot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInstanceShutdownTimeout() {
        return software.amazon.jsii.Kernel.get(this, "instanceShutdownTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInstanceShutdownTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "instanceShutdownTimeout", java.util.Objects.requireNonNull(value, "instanceShutdownTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getManageBundler() {
        return software.amazon.jsii.Kernel.get(this, "manageBundler", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setManageBundler(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "manageBundler", java.util.Objects.requireNonNull(value, "manageBundler is required"));
    }

    public void setManageBundler(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "manageBundler", java.util.Objects.requireNonNull(value, "manageBundler is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassengerVersion() {
        return software.amazon.jsii.Kernel.get(this, "passengerVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassengerVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "passengerVersion", java.util.Objects.requireNonNull(value, "passengerVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRubygemsVersion() {
        return software.amazon.jsii.Kernel.get(this, "rubygemsVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRubygemsVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rubygemsVersion", java.util.Objects.requireNonNull(value, "rubygemsVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRubyVersion() {
        return software.amazon.jsii.Kernel.get(this, "rubyVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRubyVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rubyVersion", java.util.Objects.requireNonNull(value, "rubyVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStackId() {
        return software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStackId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stackId", java.util.Objects.requireNonNull(value, "stackId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSystemPackages() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "systemPackages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSystemPackages(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "systemPackages", java.util.Objects.requireNonNull(value, "systemPackages is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getUseEbsOptimizedInstances() {
        return software.amazon.jsii.Kernel.get(this, "useEbsOptimizedInstances", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseEbsOptimizedInstances(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useEbsOptimizedInstances", java.util.Objects.requireNonNull(value, "useEbsOptimizedInstances is required"));
    }

    public void setUseEbsOptimizedInstances(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useEbsOptimizedInstances", java.util.Objects.requireNonNull(value, "useEbsOptimizedInstances is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.opsworks.OpsworksRailsAppLayer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.opsworks.OpsworksRailsAppLayer> {
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
        private final imports.aws.opsworks.OpsworksRailsAppLayerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.opsworks.OpsworksRailsAppLayerConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#stack_id OpsworksRailsAppLayer#stack_id}.
         * <p>
         * @return {@code this}
         * @param stackId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#stack_id OpsworksRailsAppLayer#stack_id}. This parameter is required.
         */
        public Builder stackId(final java.lang.String stackId) {
            this.config.stackId(stackId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#app_server OpsworksRailsAppLayer#app_server}.
         * <p>
         * @return {@code this}
         * @param appServer Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#app_server OpsworksRailsAppLayer#app_server}. This parameter is required.
         */
        public Builder appServer(final java.lang.String appServer) {
            this.config.appServer(appServer);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_elastic_ips OpsworksRailsAppLayer#auto_assign_elastic_ips}.
         * <p>
         * @return {@code this}
         * @param autoAssignElasticIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_elastic_ips OpsworksRailsAppLayer#auto_assign_elastic_ips}. This parameter is required.
         */
        public Builder autoAssignElasticIps(final java.lang.Boolean autoAssignElasticIps) {
            this.config.autoAssignElasticIps(autoAssignElasticIps);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_elastic_ips OpsworksRailsAppLayer#auto_assign_elastic_ips}.
         * <p>
         * @return {@code this}
         * @param autoAssignElasticIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_elastic_ips OpsworksRailsAppLayer#auto_assign_elastic_ips}. This parameter is required.
         */
        public Builder autoAssignElasticIps(final com.hashicorp.cdktf.IResolvable autoAssignElasticIps) {
            this.config.autoAssignElasticIps(autoAssignElasticIps);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_public_ips OpsworksRailsAppLayer#auto_assign_public_ips}.
         * <p>
         * @return {@code this}
         * @param autoAssignPublicIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_public_ips OpsworksRailsAppLayer#auto_assign_public_ips}. This parameter is required.
         */
        public Builder autoAssignPublicIps(final java.lang.Boolean autoAssignPublicIps) {
            this.config.autoAssignPublicIps(autoAssignPublicIps);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_public_ips OpsworksRailsAppLayer#auto_assign_public_ips}.
         * <p>
         * @return {@code this}
         * @param autoAssignPublicIps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_assign_public_ips OpsworksRailsAppLayer#auto_assign_public_ips}. This parameter is required.
         */
        public Builder autoAssignPublicIps(final com.hashicorp.cdktf.IResolvable autoAssignPublicIps) {
            this.config.autoAssignPublicIps(autoAssignPublicIps);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_healing OpsworksRailsAppLayer#auto_healing}.
         * <p>
         * @return {@code this}
         * @param autoHealing Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_healing OpsworksRailsAppLayer#auto_healing}. This parameter is required.
         */
        public Builder autoHealing(final java.lang.Boolean autoHealing) {
            this.config.autoHealing(autoHealing);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_healing OpsworksRailsAppLayer#auto_healing}.
         * <p>
         * @return {@code this}
         * @param autoHealing Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#auto_healing OpsworksRailsAppLayer#auto_healing}. This parameter is required.
         */
        public Builder autoHealing(final com.hashicorp.cdktf.IResolvable autoHealing) {
            this.config.autoHealing(autoHealing);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#bundler_version OpsworksRailsAppLayer#bundler_version}.
         * <p>
         * @return {@code this}
         * @param bundlerVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#bundler_version OpsworksRailsAppLayer#bundler_version}. This parameter is required.
         */
        public Builder bundlerVersion(final java.lang.String bundlerVersion) {
            this.config.bundlerVersion(bundlerVersion);
            return this;
        }

        /**
         * cloudwatch_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#cloudwatch_configuration OpsworksRailsAppLayer#cloudwatch_configuration}
         * <p>
         * @return {@code this}
         * @param cloudwatchConfiguration cloudwatch_configuration block. This parameter is required.
         */
        public Builder cloudwatchConfiguration(final imports.aws.opsworks.OpsworksRailsAppLayerCloudwatchConfiguration cloudwatchConfiguration) {
            this.config.cloudwatchConfiguration(cloudwatchConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_configure_recipes OpsworksRailsAppLayer#custom_configure_recipes}.
         * <p>
         * @return {@code this}
         * @param customConfigureRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_configure_recipes OpsworksRailsAppLayer#custom_configure_recipes}. This parameter is required.
         */
        public Builder customConfigureRecipes(final java.util.List<java.lang.String> customConfigureRecipes) {
            this.config.customConfigureRecipes(customConfigureRecipes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_deploy_recipes OpsworksRailsAppLayer#custom_deploy_recipes}.
         * <p>
         * @return {@code this}
         * @param customDeployRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_deploy_recipes OpsworksRailsAppLayer#custom_deploy_recipes}. This parameter is required.
         */
        public Builder customDeployRecipes(final java.util.List<java.lang.String> customDeployRecipes) {
            this.config.customDeployRecipes(customDeployRecipes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_instance_profile_arn OpsworksRailsAppLayer#custom_instance_profile_arn}.
         * <p>
         * @return {@code this}
         * @param customInstanceProfileArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_instance_profile_arn OpsworksRailsAppLayer#custom_instance_profile_arn}. This parameter is required.
         */
        public Builder customInstanceProfileArn(final java.lang.String customInstanceProfileArn) {
            this.config.customInstanceProfileArn(customInstanceProfileArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_json OpsworksRailsAppLayer#custom_json}.
         * <p>
         * @return {@code this}
         * @param customJson Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_json OpsworksRailsAppLayer#custom_json}. This parameter is required.
         */
        public Builder customJson(final java.lang.String customJson) {
            this.config.customJson(customJson);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_security_group_ids OpsworksRailsAppLayer#custom_security_group_ids}.
         * <p>
         * @return {@code this}
         * @param customSecurityGroupIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_security_group_ids OpsworksRailsAppLayer#custom_security_group_ids}. This parameter is required.
         */
        public Builder customSecurityGroupIds(final java.util.List<java.lang.String> customSecurityGroupIds) {
            this.config.customSecurityGroupIds(customSecurityGroupIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_setup_recipes OpsworksRailsAppLayer#custom_setup_recipes}.
         * <p>
         * @return {@code this}
         * @param customSetupRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_setup_recipes OpsworksRailsAppLayer#custom_setup_recipes}. This parameter is required.
         */
        public Builder customSetupRecipes(final java.util.List<java.lang.String> customSetupRecipes) {
            this.config.customSetupRecipes(customSetupRecipes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_shutdown_recipes OpsworksRailsAppLayer#custom_shutdown_recipes}.
         * <p>
         * @return {@code this}
         * @param customShutdownRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_shutdown_recipes OpsworksRailsAppLayer#custom_shutdown_recipes}. This parameter is required.
         */
        public Builder customShutdownRecipes(final java.util.List<java.lang.String> customShutdownRecipes) {
            this.config.customShutdownRecipes(customShutdownRecipes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_undeploy_recipes OpsworksRailsAppLayer#custom_undeploy_recipes}.
         * <p>
         * @return {@code this}
         * @param customUndeployRecipes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#custom_undeploy_recipes OpsworksRailsAppLayer#custom_undeploy_recipes}. This parameter is required.
         */
        public Builder customUndeployRecipes(final java.util.List<java.lang.String> customUndeployRecipes) {
            this.config.customUndeployRecipes(customUndeployRecipes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#drain_elb_on_shutdown OpsworksRailsAppLayer#drain_elb_on_shutdown}.
         * <p>
         * @return {@code this}
         * @param drainElbOnShutdown Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#drain_elb_on_shutdown OpsworksRailsAppLayer#drain_elb_on_shutdown}. This parameter is required.
         */
        public Builder drainElbOnShutdown(final java.lang.Boolean drainElbOnShutdown) {
            this.config.drainElbOnShutdown(drainElbOnShutdown);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#drain_elb_on_shutdown OpsworksRailsAppLayer#drain_elb_on_shutdown}.
         * <p>
         * @return {@code this}
         * @param drainElbOnShutdown Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#drain_elb_on_shutdown OpsworksRailsAppLayer#drain_elb_on_shutdown}. This parameter is required.
         */
        public Builder drainElbOnShutdown(final com.hashicorp.cdktf.IResolvable drainElbOnShutdown) {
            this.config.drainElbOnShutdown(drainElbOnShutdown);
            return this;
        }

        /**
         * ebs_volume block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#ebs_volume OpsworksRailsAppLayer#ebs_volume}
         * <p>
         * @return {@code this}
         * @param ebsVolume ebs_volume block. This parameter is required.
         */
        public Builder ebsVolume(final com.hashicorp.cdktf.IResolvable ebsVolume) {
            this.config.ebsVolume(ebsVolume);
            return this;
        }
        /**
         * ebs_volume block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#ebs_volume OpsworksRailsAppLayer#ebs_volume}
         * <p>
         * @return {@code this}
         * @param ebsVolume ebs_volume block. This parameter is required.
         */
        public Builder ebsVolume(final java.util.List<? extends imports.aws.opsworks.OpsworksRailsAppLayerEbsVolume> ebsVolume) {
            this.config.ebsVolume(ebsVolume);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#elastic_load_balancer OpsworksRailsAppLayer#elastic_load_balancer}.
         * <p>
         * @return {@code this}
         * @param elasticLoadBalancer Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#elastic_load_balancer OpsworksRailsAppLayer#elastic_load_balancer}. This parameter is required.
         */
        public Builder elasticLoadBalancer(final java.lang.String elasticLoadBalancer) {
            this.config.elasticLoadBalancer(elasticLoadBalancer);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#id OpsworksRailsAppLayer#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#id OpsworksRailsAppLayer#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#install_updates_on_boot OpsworksRailsAppLayer#install_updates_on_boot}.
         * <p>
         * @return {@code this}
         * @param installUpdatesOnBoot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#install_updates_on_boot OpsworksRailsAppLayer#install_updates_on_boot}. This parameter is required.
         */
        public Builder installUpdatesOnBoot(final java.lang.Boolean installUpdatesOnBoot) {
            this.config.installUpdatesOnBoot(installUpdatesOnBoot);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#install_updates_on_boot OpsworksRailsAppLayer#install_updates_on_boot}.
         * <p>
         * @return {@code this}
         * @param installUpdatesOnBoot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#install_updates_on_boot OpsworksRailsAppLayer#install_updates_on_boot}. This parameter is required.
         */
        public Builder installUpdatesOnBoot(final com.hashicorp.cdktf.IResolvable installUpdatesOnBoot) {
            this.config.installUpdatesOnBoot(installUpdatesOnBoot);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#instance_shutdown_timeout OpsworksRailsAppLayer#instance_shutdown_timeout}.
         * <p>
         * @return {@code this}
         * @param instanceShutdownTimeout Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#instance_shutdown_timeout OpsworksRailsAppLayer#instance_shutdown_timeout}. This parameter is required.
         */
        public Builder instanceShutdownTimeout(final java.lang.Number instanceShutdownTimeout) {
            this.config.instanceShutdownTimeout(instanceShutdownTimeout);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#manage_bundler OpsworksRailsAppLayer#manage_bundler}.
         * <p>
         * @return {@code this}
         * @param manageBundler Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#manage_bundler OpsworksRailsAppLayer#manage_bundler}. This parameter is required.
         */
        public Builder manageBundler(final java.lang.Boolean manageBundler) {
            this.config.manageBundler(manageBundler);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#manage_bundler OpsworksRailsAppLayer#manage_bundler}.
         * <p>
         * @return {@code this}
         * @param manageBundler Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#manage_bundler OpsworksRailsAppLayer#manage_bundler}. This parameter is required.
         */
        public Builder manageBundler(final com.hashicorp.cdktf.IResolvable manageBundler) {
            this.config.manageBundler(manageBundler);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#name OpsworksRailsAppLayer#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#name OpsworksRailsAppLayer#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#passenger_version OpsworksRailsAppLayer#passenger_version}.
         * <p>
         * @return {@code this}
         * @param passengerVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#passenger_version OpsworksRailsAppLayer#passenger_version}. This parameter is required.
         */
        public Builder passengerVersion(final java.lang.String passengerVersion) {
            this.config.passengerVersion(passengerVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#rubygems_version OpsworksRailsAppLayer#rubygems_version}.
         * <p>
         * @return {@code this}
         * @param rubygemsVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#rubygems_version OpsworksRailsAppLayer#rubygems_version}. This parameter is required.
         */
        public Builder rubygemsVersion(final java.lang.String rubygemsVersion) {
            this.config.rubygemsVersion(rubygemsVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#ruby_version OpsworksRailsAppLayer#ruby_version}.
         * <p>
         * @return {@code this}
         * @param rubyVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#ruby_version OpsworksRailsAppLayer#ruby_version}. This parameter is required.
         */
        public Builder rubyVersion(final java.lang.String rubyVersion) {
            this.config.rubyVersion(rubyVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#system_packages OpsworksRailsAppLayer#system_packages}.
         * <p>
         * @return {@code this}
         * @param systemPackages Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#system_packages OpsworksRailsAppLayer#system_packages}. This parameter is required.
         */
        public Builder systemPackages(final java.util.List<java.lang.String> systemPackages) {
            this.config.systemPackages(systemPackages);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#tags OpsworksRailsAppLayer#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#tags OpsworksRailsAppLayer#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#tags_all OpsworksRailsAppLayer#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#tags_all OpsworksRailsAppLayer#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#use_ebs_optimized_instances OpsworksRailsAppLayer#use_ebs_optimized_instances}.
         * <p>
         * @return {@code this}
         * @param useEbsOptimizedInstances Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#use_ebs_optimized_instances OpsworksRailsAppLayer#use_ebs_optimized_instances}. This parameter is required.
         */
        public Builder useEbsOptimizedInstances(final java.lang.Boolean useEbsOptimizedInstances) {
            this.config.useEbsOptimizedInstances(useEbsOptimizedInstances);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#use_ebs_optimized_instances OpsworksRailsAppLayer#use_ebs_optimized_instances}.
         * <p>
         * @return {@code this}
         * @param useEbsOptimizedInstances Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_rails_app_layer#use_ebs_optimized_instances OpsworksRailsAppLayer#use_ebs_optimized_instances}. This parameter is required.
         */
        public Builder useEbsOptimizedInstances(final com.hashicorp.cdktf.IResolvable useEbsOptimizedInstances) {
            this.config.useEbsOptimizedInstances(useEbsOptimizedInstances);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.opsworks.OpsworksRailsAppLayer}.
         */
        @Override
        public imports.aws.opsworks.OpsworksRailsAppLayer build() {
            return new imports.aws.opsworks.OpsworksRailsAppLayer(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
