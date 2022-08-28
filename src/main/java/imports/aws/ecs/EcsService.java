package imports.aws.ecs;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ecs_service aws_ecs_service}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.395Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsService")
public class EcsService extends com.hashicorp.cdktf.TerraformResource {

    protected EcsService(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsService(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ecs.EcsService.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ecs_service aws_ecs_service} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EcsService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCapacityProviderStrategy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDeploymentCircuitBreaker(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceDeploymentCircuitBreaker value) {
        software.amazon.jsii.Kernel.call(this, "putDeploymentCircuitBreaker", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDeploymentController(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceDeploymentController value) {
        software.amazon.jsii.Kernel.call(this, "putDeploymentController", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLoadBalancer(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLoadBalancer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNetworkConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceNetworkConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putNetworkConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOrderedPlacementStrategy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOrderedPlacementStrategy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPlacementConstraints(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPlacementConstraints", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServiceRegistries(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceServiceRegistries value) {
        software.amazon.jsii.Kernel.call(this, "putServiceRegistries", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacityProviderStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityProviderStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCluster() {
        software.amazon.jsii.Kernel.call(this, "resetCluster", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentCircuitBreaker() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentCircuitBreaker", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentController() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentController", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentMaximumPercent() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentMaximumPercent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentMinimumHealthyPercent() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentMinimumHealthyPercent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDesiredCount() {
        software.amazon.jsii.Kernel.call(this, "resetDesiredCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableEcsManagedTags() {
        software.amazon.jsii.Kernel.call(this, "resetEnableEcsManagedTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableExecuteCommand() {
        software.amazon.jsii.Kernel.call(this, "resetEnableExecuteCommand", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForceNewDeployment() {
        software.amazon.jsii.Kernel.call(this, "resetForceNewDeployment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckGracePeriodSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckGracePeriodSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIamRole() {
        software.amazon.jsii.Kernel.call(this, "resetIamRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchType() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoadBalancer() {
        software.amazon.jsii.Kernel.call(this, "resetLoadBalancer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrderedPlacementStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetOrderedPlacementStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlacementConstraints() {
        software.amazon.jsii.Kernel.call(this, "resetPlacementConstraints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlatformVersion() {
        software.amazon.jsii.Kernel.call(this, "resetPlatformVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPropagateTags() {
        software.amazon.jsii.Kernel.call(this, "resetPropagateTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedulingStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetSchedulingStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceRegistries() {
        software.amazon.jsii.Kernel.call(this, "resetServiceRegistries", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTaskDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetTaskDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWaitForSteadyState() {
        software.amazon.jsii.Kernel.call(this, "resetWaitForSteadyState", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceCapacityProviderStrategyList getCapacityProviderStrategy() {
        return software.amazon.jsii.Kernel.get(this, "capacityProviderStrategy", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceCapacityProviderStrategyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceDeploymentCircuitBreakerOutputReference getDeploymentCircuitBreaker() {
        return software.amazon.jsii.Kernel.get(this, "deploymentCircuitBreaker", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceDeploymentCircuitBreakerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceDeploymentControllerOutputReference getDeploymentController() {
        return software.amazon.jsii.Kernel.get(this, "deploymentController", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceDeploymentControllerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceLoadBalancerList getLoadBalancer() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancer", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceLoadBalancerList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceNetworkConfigurationOutputReference getNetworkConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceNetworkConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceOrderedPlacementStrategyList getOrderedPlacementStrategy() {
        return software.amazon.jsii.Kernel.get(this, "orderedPlacementStrategy", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceOrderedPlacementStrategyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServicePlacementConstraintsList getPlacementConstraints() {
        return software.amazon.jsii.Kernel.get(this, "placementConstraints", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServicePlacementConstraintsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceServiceRegistriesOutputReference getServiceRegistries() {
        return software.amazon.jsii.Kernel.get(this, "serviceRegistries", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceServiceRegistriesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsServiceTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCapacityProviderStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "capacityProviderStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceDeploymentCircuitBreaker getDeploymentCircuitBreakerInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentCircuitBreakerInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceDeploymentCircuitBreaker.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceDeploymentController getDeploymentControllerInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentControllerInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceDeploymentController.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMaximumPercentInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMaximumPercentInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMinimumHealthyPercentInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMinimumHealthyPercentInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCountInput() {
        return software.amazon.jsii.Kernel.get(this, "desiredCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableEcsManagedTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "enableEcsManagedTagsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableExecuteCommandInput() {
        return software.amazon.jsii.Kernel.get(this, "enableExecuteCommandInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForceNewDeploymentInput() {
        return software.amazon.jsii.Kernel.get(this, "forceNewDeploymentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckGracePeriodSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLaunchTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "launchTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLoadBalancerInput() {
        return software.amazon.jsii.Kernel.get(this, "loadBalancerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceNetworkConfiguration getNetworkConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "networkConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceNetworkConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOrderedPlacementStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "orderedPlacementStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPlacementConstraintsInput() {
        return software.amazon.jsii.Kernel.get(this, "placementConstraintsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlatformVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "platformVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPropagateTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "propagateTagsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchedulingStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "schedulingStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceServiceRegistries getServiceRegistriesInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRegistriesInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceServiceRegistries.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTaskDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "taskDefinitionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWaitForSteadyStateInput() {
        return software.amazon.jsii.Kernel.get(this, "waitForSteadyStateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCluster() {
        return software.amazon.jsii.Kernel.get(this, "cluster", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCluster(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cluster", java.util.Objects.requireNonNull(value, "cluster is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeploymentMaximumPercent() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMaximumPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeploymentMaximumPercent(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deploymentMaximumPercent", java.util.Objects.requireNonNull(value, "deploymentMaximumPercent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeploymentMinimumHealthyPercent() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMinimumHealthyPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeploymentMinimumHealthyPercent(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deploymentMinimumHealthyPercent", java.util.Objects.requireNonNull(value, "deploymentMinimumHealthyPercent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDesiredCount() {
        return software.amazon.jsii.Kernel.get(this, "desiredCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDesiredCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "desiredCount", java.util.Objects.requireNonNull(value, "desiredCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableEcsManagedTags() {
        return software.amazon.jsii.Kernel.get(this, "enableEcsManagedTags", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableEcsManagedTags(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableEcsManagedTags", java.util.Objects.requireNonNull(value, "enableEcsManagedTags is required"));
    }

    public void setEnableEcsManagedTags(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableEcsManagedTags", java.util.Objects.requireNonNull(value, "enableEcsManagedTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableExecuteCommand() {
        return software.amazon.jsii.Kernel.get(this, "enableExecuteCommand", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableExecuteCommand(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableExecuteCommand", java.util.Objects.requireNonNull(value, "enableExecuteCommand is required"));
    }

    public void setEnableExecuteCommand(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableExecuteCommand", java.util.Objects.requireNonNull(value, "enableExecuteCommand is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForceNewDeployment() {
        return software.amazon.jsii.Kernel.get(this, "forceNewDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForceNewDeployment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceNewDeployment", java.util.Objects.requireNonNull(value, "forceNewDeployment is required"));
    }

    public void setForceNewDeployment(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forceNewDeployment", java.util.Objects.requireNonNull(value, "forceNewDeployment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckGracePeriodSeconds() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckGracePeriodSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckGracePeriodSeconds", java.util.Objects.requireNonNull(value, "healthCheckGracePeriodSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRole() {
        return software.amazon.jsii.Kernel.get(this, "iamRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRole", java.util.Objects.requireNonNull(value, "iamRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLaunchType() {
        return software.amazon.jsii.Kernel.get(this, "launchType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLaunchType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "launchType", java.util.Objects.requireNonNull(value, "launchType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformVersion() {
        return software.amazon.jsii.Kernel.get(this, "platformVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlatformVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "platformVersion", java.util.Objects.requireNonNull(value, "platformVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPropagateTags() {
        return software.amazon.jsii.Kernel.get(this, "propagateTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPropagateTags(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "propagateTags", java.util.Objects.requireNonNull(value, "propagateTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchedulingStrategy() {
        return software.amazon.jsii.Kernel.get(this, "schedulingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchedulingStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schedulingStrategy", java.util.Objects.requireNonNull(value, "schedulingStrategy is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTaskDefinition() {
        return software.amazon.jsii.Kernel.get(this, "taskDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTaskDefinition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "taskDefinition", java.util.Objects.requireNonNull(value, "taskDefinition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWaitForSteadyState() {
        return software.amazon.jsii.Kernel.get(this, "waitForSteadyState", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWaitForSteadyState(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "waitForSteadyState", java.util.Objects.requireNonNull(value, "waitForSteadyState is required"));
    }

    public void setWaitForSteadyState(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "waitForSteadyState", java.util.Objects.requireNonNull(value, "waitForSteadyState is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ecs.EcsService}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ecs.EcsService> {
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
        private final imports.aws.ecs.EcsServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ecs.EcsServiceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#name EcsService#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#name EcsService#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * capacity_provider_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#capacity_provider_strategy EcsService#capacity_provider_strategy}
         * <p>
         * @return {@code this}
         * @param capacityProviderStrategy capacity_provider_strategy block. This parameter is required.
         */
        public Builder capacityProviderStrategy(final com.hashicorp.cdktf.IResolvable capacityProviderStrategy) {
            this.config.capacityProviderStrategy(capacityProviderStrategy);
            return this;
        }
        /**
         * capacity_provider_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#capacity_provider_strategy EcsService#capacity_provider_strategy}
         * <p>
         * @return {@code this}
         * @param capacityProviderStrategy capacity_provider_strategy block. This parameter is required.
         */
        public Builder capacityProviderStrategy(final java.util.List<? extends imports.aws.ecs.EcsServiceCapacityProviderStrategy> capacityProviderStrategy) {
            this.config.capacityProviderStrategy(capacityProviderStrategy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#cluster EcsService#cluster}.
         * <p>
         * @return {@code this}
         * @param cluster Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#cluster EcsService#cluster}. This parameter is required.
         */
        public Builder cluster(final java.lang.String cluster) {
            this.config.cluster(cluster);
            return this;
        }

        /**
         * deployment_circuit_breaker block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_circuit_breaker EcsService#deployment_circuit_breaker}
         * <p>
         * @return {@code this}
         * @param deploymentCircuitBreaker deployment_circuit_breaker block. This parameter is required.
         */
        public Builder deploymentCircuitBreaker(final imports.aws.ecs.EcsServiceDeploymentCircuitBreaker deploymentCircuitBreaker) {
            this.config.deploymentCircuitBreaker(deploymentCircuitBreaker);
            return this;
        }

        /**
         * deployment_controller block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_controller EcsService#deployment_controller}
         * <p>
         * @return {@code this}
         * @param deploymentController deployment_controller block. This parameter is required.
         */
        public Builder deploymentController(final imports.aws.ecs.EcsServiceDeploymentController deploymentController) {
            this.config.deploymentController(deploymentController);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_maximum_percent EcsService#deployment_maximum_percent}.
         * <p>
         * @return {@code this}
         * @param deploymentMaximumPercent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_maximum_percent EcsService#deployment_maximum_percent}. This parameter is required.
         */
        public Builder deploymentMaximumPercent(final java.lang.Number deploymentMaximumPercent) {
            this.config.deploymentMaximumPercent(deploymentMaximumPercent);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_minimum_healthy_percent EcsService#deployment_minimum_healthy_percent}.
         * <p>
         * @return {@code this}
         * @param deploymentMinimumHealthyPercent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_minimum_healthy_percent EcsService#deployment_minimum_healthy_percent}. This parameter is required.
         */
        public Builder deploymentMinimumHealthyPercent(final java.lang.Number deploymentMinimumHealthyPercent) {
            this.config.deploymentMinimumHealthyPercent(deploymentMinimumHealthyPercent);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#desired_count EcsService#desired_count}.
         * <p>
         * @return {@code this}
         * @param desiredCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#desired_count EcsService#desired_count}. This parameter is required.
         */
        public Builder desiredCount(final java.lang.Number desiredCount) {
            this.config.desiredCount(desiredCount);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}.
         * <p>
         * @return {@code this}
         * @param enableEcsManagedTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}. This parameter is required.
         */
        public Builder enableEcsManagedTags(final java.lang.Boolean enableEcsManagedTags) {
            this.config.enableEcsManagedTags(enableEcsManagedTags);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}.
         * <p>
         * @return {@code this}
         * @param enableEcsManagedTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}. This parameter is required.
         */
        public Builder enableEcsManagedTags(final com.hashicorp.cdktf.IResolvable enableEcsManagedTags) {
            this.config.enableEcsManagedTags(enableEcsManagedTags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}.
         * <p>
         * @return {@code this}
         * @param enableExecuteCommand Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}. This parameter is required.
         */
        public Builder enableExecuteCommand(final java.lang.Boolean enableExecuteCommand) {
            this.config.enableExecuteCommand(enableExecuteCommand);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}.
         * <p>
         * @return {@code this}
         * @param enableExecuteCommand Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}. This parameter is required.
         */
        public Builder enableExecuteCommand(final com.hashicorp.cdktf.IResolvable enableExecuteCommand) {
            this.config.enableExecuteCommand(enableExecuteCommand);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}.
         * <p>
         * @return {@code this}
         * @param forceNewDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}. This parameter is required.
         */
        public Builder forceNewDeployment(final java.lang.Boolean forceNewDeployment) {
            this.config.forceNewDeployment(forceNewDeployment);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}.
         * <p>
         * @return {@code this}
         * @param forceNewDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}. This parameter is required.
         */
        public Builder forceNewDeployment(final com.hashicorp.cdktf.IResolvable forceNewDeployment) {
            this.config.forceNewDeployment(forceNewDeployment);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#health_check_grace_period_seconds EcsService#health_check_grace_period_seconds}.
         * <p>
         * @return {@code this}
         * @param healthCheckGracePeriodSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#health_check_grace_period_seconds EcsService#health_check_grace_period_seconds}. This parameter is required.
         */
        public Builder healthCheckGracePeriodSeconds(final java.lang.Number healthCheckGracePeriodSeconds) {
            this.config.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#iam_role EcsService#iam_role}.
         * <p>
         * @return {@code this}
         * @param iamRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#iam_role EcsService#iam_role}. This parameter is required.
         */
        public Builder iamRole(final java.lang.String iamRole) {
            this.config.iamRole(iamRole);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#id EcsService#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#id EcsService#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#launch_type EcsService#launch_type}.
         * <p>
         * @return {@code this}
         * @param launchType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#launch_type EcsService#launch_type}. This parameter is required.
         */
        public Builder launchType(final java.lang.String launchType) {
            this.config.launchType(launchType);
            return this;
        }

        /**
         * load_balancer block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#load_balancer EcsService#load_balancer}
         * <p>
         * @return {@code this}
         * @param loadBalancer load_balancer block. This parameter is required.
         */
        public Builder loadBalancer(final com.hashicorp.cdktf.IResolvable loadBalancer) {
            this.config.loadBalancer(loadBalancer);
            return this;
        }
        /**
         * load_balancer block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#load_balancer EcsService#load_balancer}
         * <p>
         * @return {@code this}
         * @param loadBalancer load_balancer block. This parameter is required.
         */
        public Builder loadBalancer(final java.util.List<? extends imports.aws.ecs.EcsServiceLoadBalancer> loadBalancer) {
            this.config.loadBalancer(loadBalancer);
            return this;
        }

        /**
         * network_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#network_configuration EcsService#network_configuration}
         * <p>
         * @return {@code this}
         * @param networkConfiguration network_configuration block. This parameter is required.
         */
        public Builder networkConfiguration(final imports.aws.ecs.EcsServiceNetworkConfiguration networkConfiguration) {
            this.config.networkConfiguration(networkConfiguration);
            return this;
        }

        /**
         * ordered_placement_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#ordered_placement_strategy EcsService#ordered_placement_strategy}
         * <p>
         * @return {@code this}
         * @param orderedPlacementStrategy ordered_placement_strategy block. This parameter is required.
         */
        public Builder orderedPlacementStrategy(final com.hashicorp.cdktf.IResolvable orderedPlacementStrategy) {
            this.config.orderedPlacementStrategy(orderedPlacementStrategy);
            return this;
        }
        /**
         * ordered_placement_strategy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#ordered_placement_strategy EcsService#ordered_placement_strategy}
         * <p>
         * @return {@code this}
         * @param orderedPlacementStrategy ordered_placement_strategy block. This parameter is required.
         */
        public Builder orderedPlacementStrategy(final java.util.List<? extends imports.aws.ecs.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy) {
            this.config.orderedPlacementStrategy(orderedPlacementStrategy);
            return this;
        }

        /**
         * placement_constraints block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#placement_constraints EcsService#placement_constraints}
         * <p>
         * @return {@code this}
         * @param placementConstraints placement_constraints block. This parameter is required.
         */
        public Builder placementConstraints(final com.hashicorp.cdktf.IResolvable placementConstraints) {
            this.config.placementConstraints(placementConstraints);
            return this;
        }
        /**
         * placement_constraints block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#placement_constraints EcsService#placement_constraints}
         * <p>
         * @return {@code this}
         * @param placementConstraints placement_constraints block. This parameter is required.
         */
        public Builder placementConstraints(final java.util.List<? extends imports.aws.ecs.EcsServicePlacementConstraints> placementConstraints) {
            this.config.placementConstraints(placementConstraints);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#platform_version EcsService#platform_version}.
         * <p>
         * @return {@code this}
         * @param platformVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#platform_version EcsService#platform_version}. This parameter is required.
         */
        public Builder platformVersion(final java.lang.String platformVersion) {
            this.config.platformVersion(platformVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#propagate_tags EcsService#propagate_tags}.
         * <p>
         * @return {@code this}
         * @param propagateTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#propagate_tags EcsService#propagate_tags}. This parameter is required.
         */
        public Builder propagateTags(final java.lang.String propagateTags) {
            this.config.propagateTags(propagateTags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#scheduling_strategy EcsService#scheduling_strategy}.
         * <p>
         * @return {@code this}
         * @param schedulingStrategy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#scheduling_strategy EcsService#scheduling_strategy}. This parameter is required.
         */
        public Builder schedulingStrategy(final java.lang.String schedulingStrategy) {
            this.config.schedulingStrategy(schedulingStrategy);
            return this;
        }

        /**
         * service_registries block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#service_registries EcsService#service_registries}
         * <p>
         * @return {@code this}
         * @param serviceRegistries service_registries block. This parameter is required.
         */
        public Builder serviceRegistries(final imports.aws.ecs.EcsServiceServiceRegistries serviceRegistries) {
            this.config.serviceRegistries(serviceRegistries);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags EcsService#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags EcsService#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags_all EcsService#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags_all EcsService#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#task_definition EcsService#task_definition}.
         * <p>
         * @return {@code this}
         * @param taskDefinition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#task_definition EcsService#task_definition}. This parameter is required.
         */
        public Builder taskDefinition(final java.lang.String taskDefinition) {
            this.config.taskDefinition(taskDefinition);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#timeouts EcsService#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.ecs.EcsServiceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}.
         * <p>
         * @return {@code this}
         * @param waitForSteadyState Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}. This parameter is required.
         */
        public Builder waitForSteadyState(final java.lang.Boolean waitForSteadyState) {
            this.config.waitForSteadyState(waitForSteadyState);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}.
         * <p>
         * @return {@code this}
         * @param waitForSteadyState Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}. This parameter is required.
         */
        public Builder waitForSteadyState(final com.hashicorp.cdktf.IResolvable waitForSteadyState) {
            this.config.waitForSteadyState(waitForSteadyState);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ecs.EcsService}.
         */
        @Override
        public imports.aws.ecs.EcsService build() {
            return new imports.aws.ecs.EcsService(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
