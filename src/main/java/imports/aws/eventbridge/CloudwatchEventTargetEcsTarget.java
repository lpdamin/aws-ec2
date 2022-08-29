package imports.aws.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.159Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventTargetEcsTarget")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventTargetEcsTarget.Jsii$Proxy.class)
public interface CloudwatchEventTargetEcsTarget extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#task_definition_arn CloudwatchEventTarget#task_definition_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTaskDefinitionArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#enable_ecs_managed_tags CloudwatchEventTarget#enable_ecs_managed_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableEcsManagedTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#enable_execute_command CloudwatchEventTarget#enable_execute_command}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnableExecuteCommand() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#group CloudwatchEventTarget#group}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#launch_type CloudwatchEventTarget#launch_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLaunchType() {
        return null;
    }

    /**
     * network_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#network_configuration CloudwatchEventTarget#network_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetEcsTargetNetworkConfiguration getNetworkConfiguration() {
        return null;
    }

    /**
     * placement_constraint block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#placement_constraint CloudwatchEventTarget#placement_constraint}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPlacementConstraint() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#platform_version CloudwatchEventTarget#platform_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPlatformVersion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#propagate_tags CloudwatchEventTarget#propagate_tags}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPropagateTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#tags CloudwatchEventTarget#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#task_count CloudwatchEventTarget#task_count}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTaskCount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudwatchEventTargetEcsTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventTargetEcsTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventTargetEcsTarget> {
        java.lang.String taskDefinitionArn;
        java.lang.Object enableEcsManagedTags;
        java.lang.Object enableExecuteCommand;
        java.lang.String group;
        java.lang.String launchType;
        imports.aws.eventbridge.CloudwatchEventTargetEcsTargetNetworkConfiguration networkConfiguration;
        java.lang.Object placementConstraint;
        java.lang.String platformVersion;
        java.lang.String propagateTags;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.Number taskCount;

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getTaskDefinitionArn}
         * @param taskDefinitionArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#task_definition_arn CloudwatchEventTarget#task_definition_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder taskDefinitionArn(java.lang.String taskDefinitionArn) {
            this.taskDefinitionArn = taskDefinitionArn;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getEnableEcsManagedTags}
         * @param enableEcsManagedTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#enable_ecs_managed_tags CloudwatchEventTarget#enable_ecs_managed_tags}.
         * @return {@code this}
         */
        public Builder enableEcsManagedTags(java.lang.Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getEnableEcsManagedTags}
         * @param enableEcsManagedTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#enable_ecs_managed_tags CloudwatchEventTarget#enable_ecs_managed_tags}.
         * @return {@code this}
         */
        public Builder enableEcsManagedTags(com.hashicorp.cdktf.IResolvable enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getEnableExecuteCommand}
         * @param enableExecuteCommand Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#enable_execute_command CloudwatchEventTarget#enable_execute_command}.
         * @return {@code this}
         */
        public Builder enableExecuteCommand(java.lang.Boolean enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getEnableExecuteCommand}
         * @param enableExecuteCommand Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#enable_execute_command CloudwatchEventTarget#enable_execute_command}.
         * @return {@code this}
         */
        public Builder enableExecuteCommand(com.hashicorp.cdktf.IResolvable enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getGroup}
         * @param group Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#group CloudwatchEventTarget#group}.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getLaunchType}
         * @param launchType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#launch_type CloudwatchEventTarget#launch_type}.
         * @return {@code this}
         */
        public Builder launchType(java.lang.String launchType) {
            this.launchType = launchType;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getNetworkConfiguration}
         * @param networkConfiguration network_configuration block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#network_configuration CloudwatchEventTarget#network_configuration}
         * @return {@code this}
         */
        public Builder networkConfiguration(imports.aws.eventbridge.CloudwatchEventTargetEcsTargetNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getPlacementConstraint}
         * @param placementConstraint placement_constraint block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#placement_constraint CloudwatchEventTarget#placement_constraint}
         * @return {@code this}
         */
        public Builder placementConstraint(com.hashicorp.cdktf.IResolvable placementConstraint) {
            this.placementConstraint = placementConstraint;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getPlacementConstraint}
         * @param placementConstraint placement_constraint block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#placement_constraint CloudwatchEventTarget#placement_constraint}
         * @return {@code this}
         */
        public Builder placementConstraint(java.util.List<? extends imports.aws.eventbridge.CloudwatchEventTargetEcsTargetPlacementConstraint> placementConstraint) {
            this.placementConstraint = placementConstraint;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getPlatformVersion}
         * @param platformVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#platform_version CloudwatchEventTarget#platform_version}.
         * @return {@code this}
         */
        public Builder platformVersion(java.lang.String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getPropagateTags}
         * @param propagateTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#propagate_tags CloudwatchEventTarget#propagate_tags}.
         * @return {@code this}
         */
        public Builder propagateTags(java.lang.String propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#tags CloudwatchEventTarget#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventTargetEcsTarget#getTaskCount}
         * @param taskCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#task_count CloudwatchEventTarget#task_count}.
         * @return {@code this}
         */
        public Builder taskCount(java.lang.Number taskCount) {
            this.taskCount = taskCount;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchEventTargetEcsTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventTargetEcsTarget build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventTargetEcsTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventTargetEcsTarget {
        private final java.lang.String taskDefinitionArn;
        private final java.lang.Object enableEcsManagedTags;
        private final java.lang.Object enableExecuteCommand;
        private final java.lang.String group;
        private final java.lang.String launchType;
        private final imports.aws.eventbridge.CloudwatchEventTargetEcsTargetNetworkConfiguration networkConfiguration;
        private final java.lang.Object placementConstraint;
        private final java.lang.String platformVersion;
        private final java.lang.String propagateTags;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number taskCount;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.taskDefinitionArn = software.amazon.jsii.Kernel.get(this, "taskDefinitionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableEcsManagedTags = software.amazon.jsii.Kernel.get(this, "enableEcsManagedTags", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.enableExecuteCommand = software.amazon.jsii.Kernel.get(this, "enableExecuteCommand", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.group = software.amazon.jsii.Kernel.get(this, "group", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchType = software.amazon.jsii.Kernel.get(this, "launchType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkConfiguration = software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetEcsTargetNetworkConfiguration.class));
            this.placementConstraint = software.amazon.jsii.Kernel.get(this, "placementConstraint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.platformVersion = software.amazon.jsii.Kernel.get(this, "platformVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.propagateTags = software.amazon.jsii.Kernel.get(this, "propagateTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.taskCount = software.amazon.jsii.Kernel.get(this, "taskCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.taskDefinitionArn = java.util.Objects.requireNonNull(builder.taskDefinitionArn, "taskDefinitionArn is required");
            this.enableEcsManagedTags = builder.enableEcsManagedTags;
            this.enableExecuteCommand = builder.enableExecuteCommand;
            this.group = builder.group;
            this.launchType = builder.launchType;
            this.networkConfiguration = builder.networkConfiguration;
            this.placementConstraint = builder.placementConstraint;
            this.platformVersion = builder.platformVersion;
            this.propagateTags = builder.propagateTags;
            this.tags = builder.tags;
            this.taskCount = builder.taskCount;
        }

        @Override
        public final java.lang.String getTaskDefinitionArn() {
            return this.taskDefinitionArn;
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
        public final java.lang.String getGroup() {
            return this.group;
        }

        @Override
        public final java.lang.String getLaunchType() {
            return this.launchType;
        }

        @Override
        public final imports.aws.eventbridge.CloudwatchEventTargetEcsTargetNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        @Override
        public final java.lang.Object getPlacementConstraint() {
            return this.placementConstraint;
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
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getTaskCount() {
            return this.taskCount;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("taskDefinitionArn", om.valueToTree(this.getTaskDefinitionArn()));
            if (this.getEnableEcsManagedTags() != null) {
                data.set("enableEcsManagedTags", om.valueToTree(this.getEnableEcsManagedTags()));
            }
            if (this.getEnableExecuteCommand() != null) {
                data.set("enableExecuteCommand", om.valueToTree(this.getEnableExecuteCommand()));
            }
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getLaunchType() != null) {
                data.set("launchType", om.valueToTree(this.getLaunchType()));
            }
            if (this.getNetworkConfiguration() != null) {
                data.set("networkConfiguration", om.valueToTree(this.getNetworkConfiguration()));
            }
            if (this.getPlacementConstraint() != null) {
                data.set("placementConstraint", om.valueToTree(this.getPlacementConstraint()));
            }
            if (this.getPlatformVersion() != null) {
                data.set("platformVersion", om.valueToTree(this.getPlatformVersion()));
            }
            if (this.getPropagateTags() != null) {
                data.set("propagateTags", om.valueToTree(this.getPropagateTags()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTaskCount() != null) {
                data.set("taskCount", om.valueToTree(this.getTaskCount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.eventbridge.CloudwatchEventTargetEcsTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventTargetEcsTarget.Jsii$Proxy that = (CloudwatchEventTargetEcsTarget.Jsii$Proxy) o;

            if (!taskDefinitionArn.equals(that.taskDefinitionArn)) return false;
            if (this.enableEcsManagedTags != null ? !this.enableEcsManagedTags.equals(that.enableEcsManagedTags) : that.enableEcsManagedTags != null) return false;
            if (this.enableExecuteCommand != null ? !this.enableExecuteCommand.equals(that.enableExecuteCommand) : that.enableExecuteCommand != null) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.launchType != null ? !this.launchType.equals(that.launchType) : that.launchType != null) return false;
            if (this.networkConfiguration != null ? !this.networkConfiguration.equals(that.networkConfiguration) : that.networkConfiguration != null) return false;
            if (this.placementConstraint != null ? !this.placementConstraint.equals(that.placementConstraint) : that.placementConstraint != null) return false;
            if (this.platformVersion != null ? !this.platformVersion.equals(that.platformVersion) : that.platformVersion != null) return false;
            if (this.propagateTags != null ? !this.propagateTags.equals(that.propagateTags) : that.propagateTags != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            return this.taskCount != null ? this.taskCount.equals(that.taskCount) : that.taskCount == null;
        }

        @Override
        public final int hashCode() {
            int result = this.taskDefinitionArn.hashCode();
            result = 31 * result + (this.enableEcsManagedTags != null ? this.enableEcsManagedTags.hashCode() : 0);
            result = 31 * result + (this.enableExecuteCommand != null ? this.enableExecuteCommand.hashCode() : 0);
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.launchType != null ? this.launchType.hashCode() : 0);
            result = 31 * result + (this.networkConfiguration != null ? this.networkConfiguration.hashCode() : 0);
            result = 31 * result + (this.placementConstraint != null ? this.placementConstraint.hashCode() : 0);
            result = 31 * result + (this.platformVersion != null ? this.platformVersion.hashCode() : 0);
            result = 31 * result + (this.propagateTags != null ? this.propagateTags.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.taskCount != null ? this.taskCount.hashCode() : 0);
            return result;
        }
    }
}
