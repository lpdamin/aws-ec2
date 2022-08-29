package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.814Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification")
@software.amazon.jsii.Jsii.Proxy(AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification.Jsii$Proxy.class)
public interface AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#target_value AutoscalingPolicy#target_value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getTargetValue();

    /**
     * customized_capacity_metric_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#customized_capacity_metric_specification AutoscalingPolicy#customized_capacity_metric_specification}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification getCustomizedCapacityMetricSpecification() {
        return null;
    }

    /**
     * customized_load_metric_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#customized_load_metric_specification AutoscalingPolicy#customized_load_metric_specification}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification getCustomizedLoadMetricSpecification() {
        return null;
    }

    /**
     * customized_scaling_metric_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#customized_scaling_metric_specification AutoscalingPolicy#customized_scaling_metric_specification}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification getCustomizedScalingMetricSpecification() {
        return null;
    }

    /**
     * predefined_load_metric_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#predefined_load_metric_specification AutoscalingPolicy#predefined_load_metric_specification}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification getPredefinedLoadMetricSpecification() {
        return null;
    }

    /**
     * predefined_metric_pair_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#predefined_metric_pair_specification AutoscalingPolicy#predefined_metric_pair_specification}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification getPredefinedMetricPairSpecification() {
        return null;
    }

    /**
     * predefined_scaling_metric_specification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#predefined_scaling_metric_specification AutoscalingPolicy#predefined_scaling_metric_specification}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification getPredefinedScalingMetricSpecification() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification> {
        java.lang.Number targetValue;
        imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification customizedCapacityMetricSpecification;
        imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification customizedLoadMetricSpecification;
        imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification customizedScalingMetricSpecification;
        imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
        imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification;
        imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getTargetValue}
         * @param targetValue Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#target_value AutoscalingPolicy#target_value}. This parameter is required.
         * @return {@code this}
         */
        public Builder targetValue(java.lang.Number targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getCustomizedCapacityMetricSpecification}
         * @param customizedCapacityMetricSpecification customized_capacity_metric_specification block.
         *                                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#customized_capacity_metric_specification AutoscalingPolicy#customized_capacity_metric_specification}
         * @return {@code this}
         */
        public Builder customizedCapacityMetricSpecification(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification customizedCapacityMetricSpecification) {
            this.customizedCapacityMetricSpecification = customizedCapacityMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getCustomizedLoadMetricSpecification}
         * @param customizedLoadMetricSpecification customized_load_metric_specification block.
         *                                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#customized_load_metric_specification AutoscalingPolicy#customized_load_metric_specification}
         * @return {@code this}
         */
        public Builder customizedLoadMetricSpecification(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification customizedLoadMetricSpecification) {
            this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getCustomizedScalingMetricSpecification}
         * @param customizedScalingMetricSpecification customized_scaling_metric_specification block.
         *                                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#customized_scaling_metric_specification AutoscalingPolicy#customized_scaling_metric_specification}
         * @return {@code this}
         */
        public Builder customizedScalingMetricSpecification(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
            this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getPredefinedLoadMetricSpecification}
         * @param predefinedLoadMetricSpecification predefined_load_metric_specification block.
         *                                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#predefined_load_metric_specification AutoscalingPolicy#predefined_load_metric_specification}
         * @return {@code this}
         */
        public Builder predefinedLoadMetricSpecification(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getPredefinedMetricPairSpecification}
         * @param predefinedMetricPairSpecification predefined_metric_pair_specification block.
         *                                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#predefined_metric_pair_specification AutoscalingPolicy#predefined_metric_pair_specification}
         * @return {@code this}
         */
        public Builder predefinedMetricPairSpecification(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification) {
            this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification#getPredefinedScalingMetricSpecification}
         * @param predefinedScalingMetricSpecification predefined_scaling_metric_specification block.
         *                                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#predefined_scaling_metric_specification AutoscalingPolicy#predefined_scaling_metric_specification}
         * @return {@code this}
         */
        public Builder predefinedScalingMetricSpecification(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification {
        private final java.lang.Number targetValue;
        private final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification customizedCapacityMetricSpecification;
        private final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification customizedLoadMetricSpecification;
        private final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification customizedScalingMetricSpecification;
        private final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
        private final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification;
        private final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetValue = software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.customizedCapacityMetricSpecification = software.amazon.jsii.Kernel.get(this, "customizedCapacityMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification.class));
            this.customizedLoadMetricSpecification = software.amazon.jsii.Kernel.get(this, "customizedLoadMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification.class));
            this.customizedScalingMetricSpecification = software.amazon.jsii.Kernel.get(this, "customizedScalingMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification.class));
            this.predefinedLoadMetricSpecification = software.amazon.jsii.Kernel.get(this, "predefinedLoadMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification.class));
            this.predefinedMetricPairSpecification = software.amazon.jsii.Kernel.get(this, "predefinedMetricPairSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification.class));
            this.predefinedScalingMetricSpecification = software.amazon.jsii.Kernel.get(this, "predefinedScalingMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetValue = java.util.Objects.requireNonNull(builder.targetValue, "targetValue is required");
            this.customizedCapacityMetricSpecification = builder.customizedCapacityMetricSpecification;
            this.customizedLoadMetricSpecification = builder.customizedLoadMetricSpecification;
            this.customizedScalingMetricSpecification = builder.customizedScalingMetricSpecification;
            this.predefinedLoadMetricSpecification = builder.predefinedLoadMetricSpecification;
            this.predefinedMetricPairSpecification = builder.predefinedMetricPairSpecification;
            this.predefinedScalingMetricSpecification = builder.predefinedScalingMetricSpecification;
        }

        @Override
        public final java.lang.Number getTargetValue() {
            return this.targetValue;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification getCustomizedCapacityMetricSpecification() {
            return this.customizedCapacityMetricSpecification;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification getCustomizedLoadMetricSpecification() {
            return this.customizedLoadMetricSpecification;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification getCustomizedScalingMetricSpecification() {
            return this.customizedScalingMetricSpecification;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification getPredefinedLoadMetricSpecification() {
            return this.predefinedLoadMetricSpecification;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification getPredefinedMetricPairSpecification() {
            return this.predefinedMetricPairSpecification;
        }

        @Override
        public final imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification getPredefinedScalingMetricSpecification() {
            return this.predefinedScalingMetricSpecification;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("targetValue", om.valueToTree(this.getTargetValue()));
            if (this.getCustomizedCapacityMetricSpecification() != null) {
                data.set("customizedCapacityMetricSpecification", om.valueToTree(this.getCustomizedCapacityMetricSpecification()));
            }
            if (this.getCustomizedLoadMetricSpecification() != null) {
                data.set("customizedLoadMetricSpecification", om.valueToTree(this.getCustomizedLoadMetricSpecification()));
            }
            if (this.getCustomizedScalingMetricSpecification() != null) {
                data.set("customizedScalingMetricSpecification", om.valueToTree(this.getCustomizedScalingMetricSpecification()));
            }
            if (this.getPredefinedLoadMetricSpecification() != null) {
                data.set("predefinedLoadMetricSpecification", om.valueToTree(this.getPredefinedLoadMetricSpecification()));
            }
            if (this.getPredefinedMetricPairSpecification() != null) {
                data.set("predefinedMetricPairSpecification", om.valueToTree(this.getPredefinedMetricPairSpecification()));
            }
            if (this.getPredefinedScalingMetricSpecification() != null) {
                data.set("predefinedScalingMetricSpecification", om.valueToTree(this.getPredefinedScalingMetricSpecification()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification.Jsii$Proxy that = (AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification.Jsii$Proxy) o;

            if (!targetValue.equals(that.targetValue)) return false;
            if (this.customizedCapacityMetricSpecification != null ? !this.customizedCapacityMetricSpecification.equals(that.customizedCapacityMetricSpecification) : that.customizedCapacityMetricSpecification != null) return false;
            if (this.customizedLoadMetricSpecification != null ? !this.customizedLoadMetricSpecification.equals(that.customizedLoadMetricSpecification) : that.customizedLoadMetricSpecification != null) return false;
            if (this.customizedScalingMetricSpecification != null ? !this.customizedScalingMetricSpecification.equals(that.customizedScalingMetricSpecification) : that.customizedScalingMetricSpecification != null) return false;
            if (this.predefinedLoadMetricSpecification != null ? !this.predefinedLoadMetricSpecification.equals(that.predefinedLoadMetricSpecification) : that.predefinedLoadMetricSpecification != null) return false;
            if (this.predefinedMetricPairSpecification != null ? !this.predefinedMetricPairSpecification.equals(that.predefinedMetricPairSpecification) : that.predefinedMetricPairSpecification != null) return false;
            return this.predefinedScalingMetricSpecification != null ? this.predefinedScalingMetricSpecification.equals(that.predefinedScalingMetricSpecification) : that.predefinedScalingMetricSpecification == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetValue.hashCode();
            result = 31 * result + (this.customizedCapacityMetricSpecification != null ? this.customizedCapacityMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.customizedLoadMetricSpecification != null ? this.customizedLoadMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.customizedScalingMetricSpecification != null ? this.customizedScalingMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.predefinedLoadMetricSpecification != null ? this.predefinedLoadMetricSpecification.hashCode() : 0);
            result = 31 * result + (this.predefinedMetricPairSpecification != null ? this.predefinedMetricPairSpecification.hashCode() : 0);
            result = 31 * result + (this.predefinedScalingMetricSpecification != null ? this.predefinedScalingMetricSpecification.hashCode() : 0);
            return result;
        }
    }
}
