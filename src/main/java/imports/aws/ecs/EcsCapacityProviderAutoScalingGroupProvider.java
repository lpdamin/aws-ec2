package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.890Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsCapacityProviderAutoScalingGroupProvider")
@software.amazon.jsii.Jsii.Proxy(EcsCapacityProviderAutoScalingGroupProvider.Jsii$Proxy.class)
public interface EcsCapacityProviderAutoScalingGroupProvider extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_capacity_provider#auto_scaling_group_arn EcsCapacityProvider#auto_scaling_group_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAutoScalingGroupArn();

    /**
     * managed_scaling block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_capacity_provider#managed_scaling EcsCapacityProvider#managed_scaling}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling getManagedScaling() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_capacity_provider#managed_termination_protection EcsCapacityProvider#managed_termination_protection}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getManagedTerminationProtection() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsCapacityProviderAutoScalingGroupProvider}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsCapacityProviderAutoScalingGroupProvider}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsCapacityProviderAutoScalingGroupProvider> {
        java.lang.String autoScalingGroupArn;
        imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling managedScaling;
        java.lang.String managedTerminationProtection;

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProvider#getAutoScalingGroupArn}
         * @param autoScalingGroupArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_capacity_provider#auto_scaling_group_arn EcsCapacityProvider#auto_scaling_group_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder autoScalingGroupArn(java.lang.String autoScalingGroupArn) {
            this.autoScalingGroupArn = autoScalingGroupArn;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProvider#getManagedScaling}
         * @param managedScaling managed_scaling block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_capacity_provider#managed_scaling EcsCapacityProvider#managed_scaling}
         * @return {@code this}
         */
        public Builder managedScaling(imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }

        /**
         * Sets the value of {@link EcsCapacityProviderAutoScalingGroupProvider#getManagedTerminationProtection}
         * @param managedTerminationProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_capacity_provider#managed_termination_protection EcsCapacityProvider#managed_termination_protection}.
         * @return {@code this}
         */
        public Builder managedTerminationProtection(java.lang.String managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsCapacityProviderAutoScalingGroupProvider}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsCapacityProviderAutoScalingGroupProvider build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EcsCapacityProviderAutoScalingGroupProvider}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsCapacityProviderAutoScalingGroupProvider {
        private final java.lang.String autoScalingGroupArn;
        private final imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling managedScaling;
        private final java.lang.String managedTerminationProtection;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.autoScalingGroupArn = software.amazon.jsii.Kernel.get(this, "autoScalingGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.managedScaling = software.amazon.jsii.Kernel.get(this, "managedScaling", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling.class));
            this.managedTerminationProtection = software.amazon.jsii.Kernel.get(this, "managedTerminationProtection", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoScalingGroupArn = java.util.Objects.requireNonNull(builder.autoScalingGroupArn, "autoScalingGroupArn is required");
            this.managedScaling = builder.managedScaling;
            this.managedTerminationProtection = builder.managedTerminationProtection;
        }

        @Override
        public final java.lang.String getAutoScalingGroupArn() {
            return this.autoScalingGroupArn;
        }

        @Override
        public final imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling getManagedScaling() {
            return this.managedScaling;
        }

        @Override
        public final java.lang.String getManagedTerminationProtection() {
            return this.managedTerminationProtection;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("autoScalingGroupArn", om.valueToTree(this.getAutoScalingGroupArn()));
            if (this.getManagedScaling() != null) {
                data.set("managedScaling", om.valueToTree(this.getManagedScaling()));
            }
            if (this.getManagedTerminationProtection() != null) {
                data.set("managedTerminationProtection", om.valueToTree(this.getManagedTerminationProtection()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ecs.EcsCapacityProviderAutoScalingGroupProvider"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsCapacityProviderAutoScalingGroupProvider.Jsii$Proxy that = (EcsCapacityProviderAutoScalingGroupProvider.Jsii$Proxy) o;

            if (!autoScalingGroupArn.equals(that.autoScalingGroupArn)) return false;
            if (this.managedScaling != null ? !this.managedScaling.equals(that.managedScaling) : that.managedScaling != null) return false;
            return this.managedTerminationProtection != null ? this.managedTerminationProtection.equals(that.managedTerminationProtection) : that.managedTerminationProtection == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoScalingGroupArn.hashCode();
            result = 31 * result + (this.managedScaling != null ? this.managedScaling.hashCode() : 0);
            result = 31 * result + (this.managedTerminationProtection != null ? this.managedTerminationProtection.hashCode() : 0);
            return result;
        }
    }
}
