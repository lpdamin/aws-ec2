package imports.aws.ecs;

/**
 * AWS EC2 Container Service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.398Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsServiceConfig")
@software.amazon.jsii.Jsii.Proxy(EcsServiceConfig.Jsii$Proxy.class)
public interface EcsServiceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#name EcsService#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * capacity_provider_strategy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#capacity_provider_strategy EcsService#capacity_provider_strategy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCapacityProviderStrategy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#cluster EcsService#cluster}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCluster() {
        return null;
    }

    /**
     * deployment_circuit_breaker block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_circuit_breaker EcsService#deployment_circuit_breaker}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceDeploymentCircuitBreaker getDeploymentCircuitBreaker() {
        return null;
    }

    /**
     * deployment_controller block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_controller EcsService#deployment_controller}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceDeploymentController getDeploymentController() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_maximum_percent EcsService#deployment_maximum_percent}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMaximumPercent() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_minimum_healthy_percent EcsService#deployment_minimum_healthy_percent}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDeploymentMinimumHealthyPercent() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#desired_count EcsService#desired_count}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDesiredCount() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableEcsManagedTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableExecuteCommand() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getForceNewDeployment() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#health_check_grace_period_seconds EcsService#health_check_grace_period_seconds}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckGracePeriodSeconds() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#iam_role EcsService#iam_role}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIamRole() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#id EcsService#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#launch_type EcsService#launch_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLaunchType() {
        return null;
    }

    /**
     * load_balancer block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#load_balancer EcsService#load_balancer}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLoadBalancer() {
        return null;
    }

    /**
     * network_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#network_configuration EcsService#network_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceNetworkConfiguration getNetworkConfiguration() {
        return null;
    }

    /**
     * ordered_placement_strategy block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#ordered_placement_strategy EcsService#ordered_placement_strategy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOrderedPlacementStrategy() {
        return null;
    }

    /**
     * placement_constraints block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#placement_constraints EcsService#placement_constraints}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPlacementConstraints() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#platform_version EcsService#platform_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPlatformVersion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#propagate_tags EcsService#propagate_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPropagateTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#scheduling_strategy EcsService#scheduling_strategy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSchedulingStrategy() {
        return null;
    }

    /**
     * service_registries block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#service_registries EcsService#service_registries}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceServiceRegistries getServiceRegistries() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags EcsService#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags_all EcsService#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#task_definition EcsService#task_definition}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTaskDefinition() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#timeouts EcsService#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsServiceTimeouts getTimeouts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWaitForSteadyState() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsServiceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsServiceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsServiceConfig> {
        java.lang.String name;
        java.lang.Object capacityProviderStrategy;
        java.lang.String cluster;
        imports.aws.ecs.EcsServiceDeploymentCircuitBreaker deploymentCircuitBreaker;
        imports.aws.ecs.EcsServiceDeploymentController deploymentController;
        java.lang.Number deploymentMaximumPercent;
        java.lang.Number deploymentMinimumHealthyPercent;
        java.lang.Number desiredCount;
        java.lang.Object enableEcsManagedTags;
        java.lang.Object enableExecuteCommand;
        java.lang.Object forceNewDeployment;
        java.lang.Number healthCheckGracePeriodSeconds;
        java.lang.String iamRole;
        java.lang.String id;
        java.lang.String launchType;
        java.lang.Object loadBalancer;
        imports.aws.ecs.EcsServiceNetworkConfiguration networkConfiguration;
        java.lang.Object orderedPlacementStrategy;
        java.lang.Object placementConstraints;
        java.lang.String platformVersion;
        java.lang.String propagateTags;
        java.lang.String schedulingStrategy;
        imports.aws.ecs.EcsServiceServiceRegistries serviceRegistries;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        java.lang.String taskDefinition;
        imports.aws.ecs.EcsServiceTimeouts timeouts;
        java.lang.Object waitForSteadyState;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link EcsServiceConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#name EcsService#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCapacityProviderStrategy}
         * @param capacityProviderStrategy capacity_provider_strategy block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#capacity_provider_strategy EcsService#capacity_provider_strategy}
         * @return {@code this}
         */
        public Builder capacityProviderStrategy(com.hashicorp.cdktf.IResolvable capacityProviderStrategy) {
            this.capacityProviderStrategy = capacityProviderStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCapacityProviderStrategy}
         * @param capacityProviderStrategy capacity_provider_strategy block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#capacity_provider_strategy EcsService#capacity_provider_strategy}
         * @return {@code this}
         */
        public Builder capacityProviderStrategy(java.util.List<? extends imports.aws.ecs.EcsServiceCapacityProviderStrategy> capacityProviderStrategy) {
            this.capacityProviderStrategy = capacityProviderStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCluster}
         * @param cluster Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#cluster EcsService#cluster}.
         * @return {@code this}
         */
        public Builder cluster(java.lang.String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentCircuitBreaker}
         * @param deploymentCircuitBreaker deployment_circuit_breaker block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_circuit_breaker EcsService#deployment_circuit_breaker}
         * @return {@code this}
         */
        public Builder deploymentCircuitBreaker(imports.aws.ecs.EcsServiceDeploymentCircuitBreaker deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentController}
         * @param deploymentController deployment_controller block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_controller EcsService#deployment_controller}
         * @return {@code this}
         */
        public Builder deploymentController(imports.aws.ecs.EcsServiceDeploymentController deploymentController) {
            this.deploymentController = deploymentController;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentMaximumPercent}
         * @param deploymentMaximumPercent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_maximum_percent EcsService#deployment_maximum_percent}.
         * @return {@code this}
         */
        public Builder deploymentMaximumPercent(java.lang.Number deploymentMaximumPercent) {
            this.deploymentMaximumPercent = deploymentMaximumPercent;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDeploymentMinimumHealthyPercent}
         * @param deploymentMinimumHealthyPercent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#deployment_minimum_healthy_percent EcsService#deployment_minimum_healthy_percent}.
         * @return {@code this}
         */
        public Builder deploymentMinimumHealthyPercent(java.lang.Number deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDesiredCount}
         * @param desiredCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#desired_count EcsService#desired_count}.
         * @return {@code this}
         */
        public Builder desiredCount(java.lang.Number desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getEnableEcsManagedTags}
         * @param enableEcsManagedTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}.
         * @return {@code this}
         */
        public Builder enableEcsManagedTags(java.lang.Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getEnableEcsManagedTags}
         * @param enableEcsManagedTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_ecs_managed_tags EcsService#enable_ecs_managed_tags}.
         * @return {@code this}
         */
        public Builder enableEcsManagedTags(com.hashicorp.cdktf.IResolvable enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getEnableExecuteCommand}
         * @param enableExecuteCommand Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}.
         * @return {@code this}
         */
        public Builder enableExecuteCommand(java.lang.Boolean enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getEnableExecuteCommand}
         * @param enableExecuteCommand Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#enable_execute_command EcsService#enable_execute_command}.
         * @return {@code this}
         */
        public Builder enableExecuteCommand(com.hashicorp.cdktf.IResolvable enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getForceNewDeployment}
         * @param forceNewDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}.
         * @return {@code this}
         */
        public Builder forceNewDeployment(java.lang.Boolean forceNewDeployment) {
            this.forceNewDeployment = forceNewDeployment;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getForceNewDeployment}
         * @param forceNewDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#force_new_deployment EcsService#force_new_deployment}.
         * @return {@code this}
         */
        public Builder forceNewDeployment(com.hashicorp.cdktf.IResolvable forceNewDeployment) {
            this.forceNewDeployment = forceNewDeployment;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getHealthCheckGracePeriodSeconds}
         * @param healthCheckGracePeriodSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#health_check_grace_period_seconds EcsService#health_check_grace_period_seconds}.
         * @return {@code this}
         */
        public Builder healthCheckGracePeriodSeconds(java.lang.Number healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getIamRole}
         * @param iamRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#iam_role EcsService#iam_role}.
         * @return {@code this}
         */
        public Builder iamRole(java.lang.String iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#id EcsService#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getLaunchType}
         * @param launchType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#launch_type EcsService#launch_type}.
         * @return {@code this}
         */
        public Builder launchType(java.lang.String launchType) {
            this.launchType = launchType;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getLoadBalancer}
         * @param loadBalancer load_balancer block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#load_balancer EcsService#load_balancer}
         * @return {@code this}
         */
        public Builder loadBalancer(com.hashicorp.cdktf.IResolvable loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getLoadBalancer}
         * @param loadBalancer load_balancer block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#load_balancer EcsService#load_balancer}
         * @return {@code this}
         */
        public Builder loadBalancer(java.util.List<? extends imports.aws.ecs.EcsServiceLoadBalancer> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getNetworkConfiguration}
         * @param networkConfiguration network_configuration block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#network_configuration EcsService#network_configuration}
         * @return {@code this}
         */
        public Builder networkConfiguration(imports.aws.ecs.EcsServiceNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getOrderedPlacementStrategy}
         * @param orderedPlacementStrategy ordered_placement_strategy block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#ordered_placement_strategy EcsService#ordered_placement_strategy}
         * @return {@code this}
         */
        public Builder orderedPlacementStrategy(com.hashicorp.cdktf.IResolvable orderedPlacementStrategy) {
            this.orderedPlacementStrategy = orderedPlacementStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getOrderedPlacementStrategy}
         * @param orderedPlacementStrategy ordered_placement_strategy block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#ordered_placement_strategy EcsService#ordered_placement_strategy}
         * @return {@code this}
         */
        public Builder orderedPlacementStrategy(java.util.List<? extends imports.aws.ecs.EcsServiceOrderedPlacementStrategy> orderedPlacementStrategy) {
            this.orderedPlacementStrategy = orderedPlacementStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPlacementConstraints}
         * @param placementConstraints placement_constraints block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#placement_constraints EcsService#placement_constraints}
         * @return {@code this}
         */
        public Builder placementConstraints(com.hashicorp.cdktf.IResolvable placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPlacementConstraints}
         * @param placementConstraints placement_constraints block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#placement_constraints EcsService#placement_constraints}
         * @return {@code this}
         */
        public Builder placementConstraints(java.util.List<? extends imports.aws.ecs.EcsServicePlacementConstraints> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPlatformVersion}
         * @param platformVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#platform_version EcsService#platform_version}.
         * @return {@code this}
         */
        public Builder platformVersion(java.lang.String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getPropagateTags}
         * @param propagateTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#propagate_tags EcsService#propagate_tags}.
         * @return {@code this}
         */
        public Builder propagateTags(java.lang.String propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getSchedulingStrategy}
         * @param schedulingStrategy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#scheduling_strategy EcsService#scheduling_strategy}.
         * @return {@code this}
         */
        public Builder schedulingStrategy(java.lang.String schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getServiceRegistries}
         * @param serviceRegistries service_registries block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#service_registries EcsService#service_registries}
         * @return {@code this}
         */
        public Builder serviceRegistries(imports.aws.ecs.EcsServiceServiceRegistries serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags EcsService#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#tags_all EcsService#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTaskDefinition}
         * @param taskDefinition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#task_definition EcsService#task_definition}.
         * @return {@code this}
         */
        public Builder taskDefinition(java.lang.String taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_service#timeouts EcsService#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.ecs.EcsServiceTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getWaitForSteadyState}
         * @param waitForSteadyState Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}.
         * @return {@code this}
         */
        public Builder waitForSteadyState(java.lang.Boolean waitForSteadyState) {
            this.waitForSteadyState = waitForSteadyState;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getWaitForSteadyState}
         * @param waitForSteadyState Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_service#wait_for_steady_state EcsService#wait_for_steady_state}.
         * @return {@code this}
         */
        public Builder waitForSteadyState(com.hashicorp.cdktf.IResolvable waitForSteadyState) {
            this.waitForSteadyState = waitForSteadyState;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getDependsOn}
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
         * Sets the value of {@link EcsServiceConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link EcsServiceConfig#getProvisioners}
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
         * @return a new instance of {@link EcsServiceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsServiceConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EcsServiceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsServiceConfig {
        private final java.lang.String name;
        private final java.lang.Object capacityProviderStrategy;
        private final java.lang.String cluster;
        private final imports.aws.ecs.EcsServiceDeploymentCircuitBreaker deploymentCircuitBreaker;
        private final imports.aws.ecs.EcsServiceDeploymentController deploymentController;
        private final java.lang.Number deploymentMaximumPercent;
        private final java.lang.Number deploymentMinimumHealthyPercent;
        private final java.lang.Number desiredCount;
        private final java.lang.Object enableEcsManagedTags;
        private final java.lang.Object enableExecuteCommand;
        private final java.lang.Object forceNewDeployment;
        private final java.lang.Number healthCheckGracePeriodSeconds;
        private final java.lang.String iamRole;
        private final java.lang.String id;
        private final java.lang.String launchType;
        private final java.lang.Object loadBalancer;
        private final imports.aws.ecs.EcsServiceNetworkConfiguration networkConfiguration;
        private final java.lang.Object orderedPlacementStrategy;
        private final java.lang.Object placementConstraints;
        private final java.lang.String platformVersion;
        private final java.lang.String propagateTags;
        private final java.lang.String schedulingStrategy;
        private final imports.aws.ecs.EcsServiceServiceRegistries serviceRegistries;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final java.lang.String taskDefinition;
        private final imports.aws.ecs.EcsServiceTimeouts timeouts;
        private final java.lang.Object waitForSteadyState;
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
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.capacityProviderStrategy = software.amazon.jsii.Kernel.get(this, "capacityProviderStrategy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.cluster = software.amazon.jsii.Kernel.get(this, "cluster", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deploymentCircuitBreaker = software.amazon.jsii.Kernel.get(this, "deploymentCircuitBreaker", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceDeploymentCircuitBreaker.class));
            this.deploymentController = software.amazon.jsii.Kernel.get(this, "deploymentController", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceDeploymentController.class));
            this.deploymentMaximumPercent = software.amazon.jsii.Kernel.get(this, "deploymentMaximumPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deploymentMinimumHealthyPercent = software.amazon.jsii.Kernel.get(this, "deploymentMinimumHealthyPercent", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.desiredCount = software.amazon.jsii.Kernel.get(this, "desiredCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.enableEcsManagedTags = software.amazon.jsii.Kernel.get(this, "enableEcsManagedTags", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.enableExecuteCommand = software.amazon.jsii.Kernel.get(this, "enableExecuteCommand", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.forceNewDeployment = software.amazon.jsii.Kernel.get(this, "forceNewDeployment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.healthCheckGracePeriodSeconds = software.amazon.jsii.Kernel.get(this, "healthCheckGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.iamRole = software.amazon.jsii.Kernel.get(this, "iamRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchType = software.amazon.jsii.Kernel.get(this, "launchType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loadBalancer = software.amazon.jsii.Kernel.get(this, "loadBalancer", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.networkConfiguration = software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceNetworkConfiguration.class));
            this.orderedPlacementStrategy = software.amazon.jsii.Kernel.get(this, "orderedPlacementStrategy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.placementConstraints = software.amazon.jsii.Kernel.get(this, "placementConstraints", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.platformVersion = software.amazon.jsii.Kernel.get(this, "platformVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.propagateTags = software.amazon.jsii.Kernel.get(this, "propagateTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schedulingStrategy = software.amazon.jsii.Kernel.get(this, "schedulingStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceRegistries = software.amazon.jsii.Kernel.get(this, "serviceRegistries", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceServiceRegistries.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.taskDefinition = software.amazon.jsii.Kernel.get(this, "taskDefinition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsServiceTimeouts.class));
            this.waitForSteadyState = software.amazon.jsii.Kernel.get(this, "waitForSteadyState", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.capacityProviderStrategy = builder.capacityProviderStrategy;
            this.cluster = builder.cluster;
            this.deploymentCircuitBreaker = builder.deploymentCircuitBreaker;
            this.deploymentController = builder.deploymentController;
            this.deploymentMaximumPercent = builder.deploymentMaximumPercent;
            this.deploymentMinimumHealthyPercent = builder.deploymentMinimumHealthyPercent;
            this.desiredCount = builder.desiredCount;
            this.enableEcsManagedTags = builder.enableEcsManagedTags;
            this.enableExecuteCommand = builder.enableExecuteCommand;
            this.forceNewDeployment = builder.forceNewDeployment;
            this.healthCheckGracePeriodSeconds = builder.healthCheckGracePeriodSeconds;
            this.iamRole = builder.iamRole;
            this.id = builder.id;
            this.launchType = builder.launchType;
            this.loadBalancer = builder.loadBalancer;
            this.networkConfiguration = builder.networkConfiguration;
            this.orderedPlacementStrategy = builder.orderedPlacementStrategy;
            this.placementConstraints = builder.placementConstraints;
            this.platformVersion = builder.platformVersion;
            this.propagateTags = builder.propagateTags;
            this.schedulingStrategy = builder.schedulingStrategy;
            this.serviceRegistries = builder.serviceRegistries;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.taskDefinition = builder.taskDefinition;
            this.timeouts = builder.timeouts;
            this.waitForSteadyState = builder.waitForSteadyState;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getCapacityProviderStrategy() {
            return this.capacityProviderStrategy;
        }

        @Override
        public final java.lang.String getCluster() {
            return this.cluster;
        }

        @Override
        public final imports.aws.ecs.EcsServiceDeploymentCircuitBreaker getDeploymentCircuitBreaker() {
            return this.deploymentCircuitBreaker;
        }

        @Override
        public final imports.aws.ecs.EcsServiceDeploymentController getDeploymentController() {
            return this.deploymentController;
        }

        @Override
        public final java.lang.Number getDeploymentMaximumPercent() {
            return this.deploymentMaximumPercent;
        }

        @Override
        public final java.lang.Number getDeploymentMinimumHealthyPercent() {
            return this.deploymentMinimumHealthyPercent;
        }

        @Override
        public final java.lang.Number getDesiredCount() {
            return this.desiredCount;
        }

        @Override
        public final java.lang.Object getEnableEcsManagedTags() {
            return this.enableEcsManagedTags;
        }

        @Override
        public final java.lang.Object getEnableExecuteCommand() {
            return this.enableExecuteCommand;
        }

        @Override
        public final java.lang.Object getForceNewDeployment() {
            return this.forceNewDeployment;
        }

        @Override
        public final java.lang.Number getHealthCheckGracePeriodSeconds() {
            return this.healthCheckGracePeriodSeconds;
        }

        @Override
        public final java.lang.String getIamRole() {
            return this.iamRole;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getLaunchType() {
            return this.launchType;
        }

        @Override
        public final java.lang.Object getLoadBalancer() {
            return this.loadBalancer;
        }

        @Override
        public final imports.aws.ecs.EcsServiceNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        @Override
        public final java.lang.Object getOrderedPlacementStrategy() {
            return this.orderedPlacementStrategy;
        }

        @Override
        public final java.lang.Object getPlacementConstraints() {
            return this.placementConstraints;
        }

        @Override
        public final java.lang.String getPlatformVersion() {
            return this.platformVersion;
        }

        @Override
        public final java.lang.String getPropagateTags() {
            return this.propagateTags;
        }

        @Override
        public final java.lang.String getSchedulingStrategy() {
            return this.schedulingStrategy;
        }

        @Override
        public final imports.aws.ecs.EcsServiceServiceRegistries getServiceRegistries() {
            return this.serviceRegistries;
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
        public final java.lang.String getTaskDefinition() {
            return this.taskDefinition;
        }

        @Override
        public final imports.aws.ecs.EcsServiceTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Object getWaitForSteadyState() {
            return this.waitForSteadyState;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getCapacityProviderStrategy() != null) {
                data.set("capacityProviderStrategy", om.valueToTree(this.getCapacityProviderStrategy()));
            }
            if (this.getCluster() != null) {
                data.set("cluster", om.valueToTree(this.getCluster()));
            }
            if (this.getDeploymentCircuitBreaker() != null) {
                data.set("deploymentCircuitBreaker", om.valueToTree(this.getDeploymentCircuitBreaker()));
            }
            if (this.getDeploymentController() != null) {
                data.set("deploymentController", om.valueToTree(this.getDeploymentController()));
            }
            if (this.getDeploymentMaximumPercent() != null) {
                data.set("deploymentMaximumPercent", om.valueToTree(this.getDeploymentMaximumPercent()));
            }
            if (this.getDeploymentMinimumHealthyPercent() != null) {
                data.set("deploymentMinimumHealthyPercent", om.valueToTree(this.getDeploymentMinimumHealthyPercent()));
            }
            if (this.getDesiredCount() != null) {
                data.set("desiredCount", om.valueToTree(this.getDesiredCount()));
            }
            if (this.getEnableEcsManagedTags() != null) {
                data.set("enableEcsManagedTags", om.valueToTree(this.getEnableEcsManagedTags()));
            }
            if (this.getEnableExecuteCommand() != null) {
                data.set("enableExecuteCommand", om.valueToTree(this.getEnableExecuteCommand()));
            }
            if (this.getForceNewDeployment() != null) {
                data.set("forceNewDeployment", om.valueToTree(this.getForceNewDeployment()));
            }
            if (this.getHealthCheckGracePeriodSeconds() != null) {
                data.set("healthCheckGracePeriodSeconds", om.valueToTree(this.getHealthCheckGracePeriodSeconds()));
            }
            if (this.getIamRole() != null) {
                data.set("iamRole", om.valueToTree(this.getIamRole()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getLaunchType() != null) {
                data.set("launchType", om.valueToTree(this.getLaunchType()));
            }
            if (this.getLoadBalancer() != null) {
                data.set("loadBalancer", om.valueToTree(this.getLoadBalancer()));
            }
            if (this.getNetworkConfiguration() != null) {
                data.set("networkConfiguration", om.valueToTree(this.getNetworkConfiguration()));
            }
            if (this.getOrderedPlacementStrategy() != null) {
                data.set("orderedPlacementStrategy", om.valueToTree(this.getOrderedPlacementStrategy()));
            }
            if (this.getPlacementConstraints() != null) {
                data.set("placementConstraints", om.valueToTree(this.getPlacementConstraints()));
            }
            if (this.getPlatformVersion() != null) {
                data.set("platformVersion", om.valueToTree(this.getPlatformVersion()));
            }
            if (this.getPropagateTags() != null) {
                data.set("propagateTags", om.valueToTree(this.getPropagateTags()));
            }
            if (this.getSchedulingStrategy() != null) {
                data.set("schedulingStrategy", om.valueToTree(this.getSchedulingStrategy()));
            }
            if (this.getServiceRegistries() != null) {
                data.set("serviceRegistries", om.valueToTree(this.getServiceRegistries()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getTaskDefinition() != null) {
                data.set("taskDefinition", om.valueToTree(this.getTaskDefinition()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getWaitForSteadyState() != null) {
                data.set("waitForSteadyState", om.valueToTree(this.getWaitForSteadyState()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.ecs.EcsServiceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsServiceConfig.Jsii$Proxy that = (EcsServiceConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.capacityProviderStrategy != null ? !this.capacityProviderStrategy.equals(that.capacityProviderStrategy) : that.capacityProviderStrategy != null) return false;
            if (this.cluster != null ? !this.cluster.equals(that.cluster) : that.cluster != null) return false;
            if (this.deploymentCircuitBreaker != null ? !this.deploymentCircuitBreaker.equals(that.deploymentCircuitBreaker) : that.deploymentCircuitBreaker != null) return false;
            if (this.deploymentController != null ? !this.deploymentController.equals(that.deploymentController) : that.deploymentController != null) return false;
            if (this.deploymentMaximumPercent != null ? !this.deploymentMaximumPercent.equals(that.deploymentMaximumPercent) : that.deploymentMaximumPercent != null) return false;
            if (this.deploymentMinimumHealthyPercent != null ? !this.deploymentMinimumHealthyPercent.equals(that.deploymentMinimumHealthyPercent) : that.deploymentMinimumHealthyPercent != null) return false;
            if (this.desiredCount != null ? !this.desiredCount.equals(that.desiredCount) : that.desiredCount != null) return false;
            if (this.enableEcsManagedTags != null ? !this.enableEcsManagedTags.equals(that.enableEcsManagedTags) : that.enableEcsManagedTags != null) return false;
            if (this.enableExecuteCommand != null ? !this.enableExecuteCommand.equals(that.enableExecuteCommand) : that.enableExecuteCommand != null) return false;
            if (this.forceNewDeployment != null ? !this.forceNewDeployment.equals(that.forceNewDeployment) : that.forceNewDeployment != null) return false;
            if (this.healthCheckGracePeriodSeconds != null ? !this.healthCheckGracePeriodSeconds.equals(that.healthCheckGracePeriodSeconds) : that.healthCheckGracePeriodSeconds != null) return false;
            if (this.iamRole != null ? !this.iamRole.equals(that.iamRole) : that.iamRole != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.launchType != null ? !this.launchType.equals(that.launchType) : that.launchType != null) return false;
            if (this.loadBalancer != null ? !this.loadBalancer.equals(that.loadBalancer) : that.loadBalancer != null) return false;
            if (this.networkConfiguration != null ? !this.networkConfiguration.equals(that.networkConfiguration) : that.networkConfiguration != null) return false;
            if (this.orderedPlacementStrategy != null ? !this.orderedPlacementStrategy.equals(that.orderedPlacementStrategy) : that.orderedPlacementStrategy != null) return false;
            if (this.placementConstraints != null ? !this.placementConstraints.equals(that.placementConstraints) : that.placementConstraints != null) return false;
            if (this.platformVersion != null ? !this.platformVersion.equals(that.platformVersion) : that.platformVersion != null) return false;
            if (this.propagateTags != null ? !this.propagateTags.equals(that.propagateTags) : that.propagateTags != null) return false;
            if (this.schedulingStrategy != null ? !this.schedulingStrategy.equals(that.schedulingStrategy) : that.schedulingStrategy != null) return false;
            if (this.serviceRegistries != null ? !this.serviceRegistries.equals(that.serviceRegistries) : that.serviceRegistries != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.taskDefinition != null ? !this.taskDefinition.equals(that.taskDefinition) : that.taskDefinition != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.waitForSteadyState != null ? !this.waitForSteadyState.equals(that.waitForSteadyState) : that.waitForSteadyState != null) return false;
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
            int result = this.name.hashCode();
            result = 31 * result + (this.capacityProviderStrategy != null ? this.capacityProviderStrategy.hashCode() : 0);
            result = 31 * result + (this.cluster != null ? this.cluster.hashCode() : 0);
            result = 31 * result + (this.deploymentCircuitBreaker != null ? this.deploymentCircuitBreaker.hashCode() : 0);
            result = 31 * result + (this.deploymentController != null ? this.deploymentController.hashCode() : 0);
            result = 31 * result + (this.deploymentMaximumPercent != null ? this.deploymentMaximumPercent.hashCode() : 0);
            result = 31 * result + (this.deploymentMinimumHealthyPercent != null ? this.deploymentMinimumHealthyPercent.hashCode() : 0);
            result = 31 * result + (this.desiredCount != null ? this.desiredCount.hashCode() : 0);
            result = 31 * result + (this.enableEcsManagedTags != null ? this.enableEcsManagedTags.hashCode() : 0);
            result = 31 * result + (this.enableExecuteCommand != null ? this.enableExecuteCommand.hashCode() : 0);
            result = 31 * result + (this.forceNewDeployment != null ? this.forceNewDeployment.hashCode() : 0);
            result = 31 * result + (this.healthCheckGracePeriodSeconds != null ? this.healthCheckGracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.iamRole != null ? this.iamRole.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.launchType != null ? this.launchType.hashCode() : 0);
            result = 31 * result + (this.loadBalancer != null ? this.loadBalancer.hashCode() : 0);
            result = 31 * result + (this.networkConfiguration != null ? this.networkConfiguration.hashCode() : 0);
            result = 31 * result + (this.orderedPlacementStrategy != null ? this.orderedPlacementStrategy.hashCode() : 0);
            result = 31 * result + (this.placementConstraints != null ? this.placementConstraints.hashCode() : 0);
            result = 31 * result + (this.platformVersion != null ? this.platformVersion.hashCode() : 0);
            result = 31 * result + (this.propagateTags != null ? this.propagateTags.hashCode() : 0);
            result = 31 * result + (this.schedulingStrategy != null ? this.schedulingStrategy.hashCode() : 0);
            result = 31 * result + (this.serviceRegistries != null ? this.serviceRegistries.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.taskDefinition != null ? this.taskDefinition.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.waitForSteadyState != null ? this.waitForSteadyState.hashCode() : 0);
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
