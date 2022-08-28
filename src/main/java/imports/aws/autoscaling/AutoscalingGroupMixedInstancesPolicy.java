package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.825Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingGroupMixedInstancesPolicy")
@software.amazon.jsii.Jsii.Proxy(AutoscalingGroupMixedInstancesPolicy.Jsii$Proxy.class)
public interface AutoscalingGroupMixedInstancesPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * launch_template block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#launch_template AutoscalingGroup#launch_template}
     */
    @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate getLaunchTemplate();

    /**
     * instances_distribution block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#instances_distribution AutoscalingGroup#instances_distribution}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution getInstancesDistribution() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingGroupMixedInstancesPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingGroupMixedInstancesPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingGroupMixedInstancesPolicy> {
        imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate launchTemplate;
        imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution instancesDistribution;

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicy#getLaunchTemplate}
         * @param launchTemplate launch_template block. This parameter is required.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#launch_template AutoscalingGroup#launch_template}
         * @return {@code this}
         */
        public Builder launchTemplate(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupMixedInstancesPolicy#getInstancesDistribution}
         * @param instancesDistribution instances_distribution block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#instances_distribution AutoscalingGroup#instances_distribution}
         * @return {@code this}
         */
        public Builder instancesDistribution(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution instancesDistribution) {
            this.instancesDistribution = instancesDistribution;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingGroupMixedInstancesPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingGroupMixedInstancesPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AutoscalingGroupMixedInstancesPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingGroupMixedInstancesPolicy {
        private final imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate launchTemplate;
        private final imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution instancesDistribution;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.launchTemplate = software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate.class));
            this.instancesDistribution = software.amazon.jsii.Kernel.get(this, "instancesDistribution", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.launchTemplate = java.util.Objects.requireNonNull(builder.launchTemplate, "launchTemplate is required");
            this.instancesDistribution = builder.instancesDistribution;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate getLaunchTemplate() {
            return this.launchTemplate;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution getInstancesDistribution() {
            return this.instancesDistribution;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("launchTemplate", om.valueToTree(this.getLaunchTemplate()));
            if (this.getInstancesDistribution() != null) {
                data.set("instancesDistribution", om.valueToTree(this.getInstancesDistribution()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.autoscaling.AutoscalingGroupMixedInstancesPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingGroupMixedInstancesPolicy.Jsii$Proxy that = (AutoscalingGroupMixedInstancesPolicy.Jsii$Proxy) o;

            if (!launchTemplate.equals(that.launchTemplate)) return false;
            return this.instancesDistribution != null ? this.instancesDistribution.equals(that.instancesDistribution) : that.instancesDistribution == null;
        }

        @Override
        public final int hashCode() {
            int result = this.launchTemplate.hashCode();
            result = 31 * result + (this.instancesDistribution != null ? this.instancesDistribution.hashCode() : 0);
            return result;
        }
    }
}
