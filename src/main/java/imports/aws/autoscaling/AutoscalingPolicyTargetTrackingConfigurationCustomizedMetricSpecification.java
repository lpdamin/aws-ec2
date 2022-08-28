package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.882Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification")
@software.amazon.jsii.Jsii.Proxy(AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification.Jsii$Proxy.class)
public interface AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#metric_name AutoscalingPolicy#metric_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetricName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#namespace AutoscalingPolicy#namespace}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNamespace();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#statistic AutoscalingPolicy#statistic}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStatistic();

    /**
     * metric_dimension block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#metric_dimension AutoscalingPolicy#metric_dimension}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetricDimension() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#unit AutoscalingPolicy#unit}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUnit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification> {
        java.lang.String metricName;
        java.lang.String namespace;
        java.lang.String statistic;
        java.lang.Object metricDimension;
        java.lang.String unit;

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification#getMetricName}
         * @param metricName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#metric_name AutoscalingPolicy#metric_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification#getNamespace}
         * @param namespace Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#namespace AutoscalingPolicy#namespace}. This parameter is required.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification#getStatistic}
         * @param statistic Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#statistic AutoscalingPolicy#statistic}. This parameter is required.
         * @return {@code this}
         */
        public Builder statistic(java.lang.String statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification#getMetricDimension}
         * @param metricDimension metric_dimension block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#metric_dimension AutoscalingPolicy#metric_dimension}
         * @return {@code this}
         */
        public Builder metricDimension(com.hashicorp.cdktf.IResolvable metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification#getMetricDimension}
         * @param metricDimension metric_dimension block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#metric_dimension AutoscalingPolicy#metric_dimension}
         * @return {@code this}
         */
        public Builder metricDimension(java.util.List<? extends imports.aws.autoscaling.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification#getUnit}
         * @param unit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_policy#unit AutoscalingPolicy#unit}.
         * @return {@code this}
         */
        public Builder unit(java.lang.String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification {
        private final java.lang.String metricName;
        private final java.lang.String namespace;
        private final java.lang.String statistic;
        private final java.lang.Object metricDimension;
        private final java.lang.String unit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statistic = software.amazon.jsii.Kernel.get(this, "statistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricDimension = software.amazon.jsii.Kernel.get(this, "metricDimension", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.unit = software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metricName = java.util.Objects.requireNonNull(builder.metricName, "metricName is required");
            this.namespace = java.util.Objects.requireNonNull(builder.namespace, "namespace is required");
            this.statistic = java.util.Objects.requireNonNull(builder.statistic, "statistic is required");
            this.metricDimension = builder.metricDimension;
            this.unit = builder.unit;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.lang.String getStatistic() {
            return this.statistic;
        }

        @Override
        public final java.lang.Object getMetricDimension() {
            return this.metricDimension;
        }

        @Override
        public final java.lang.String getUnit() {
            return this.unit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("metricName", om.valueToTree(this.getMetricName()));
            data.set("namespace", om.valueToTree(this.getNamespace()));
            data.set("statistic", om.valueToTree(this.getStatistic()));
            if (this.getMetricDimension() != null) {
                data.set("metricDimension", om.valueToTree(this.getMetricDimension()));
            }
            if (this.getUnit() != null) {
                data.set("unit", om.valueToTree(this.getUnit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.autoscaling.AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification.Jsii$Proxy that = (AutoscalingPolicyTargetTrackingConfigurationCustomizedMetricSpecification.Jsii$Proxy) o;

            if (!metricName.equals(that.metricName)) return false;
            if (!namespace.equals(that.namespace)) return false;
            if (!statistic.equals(that.statistic)) return false;
            if (this.metricDimension != null ? !this.metricDimension.equals(that.metricDimension) : that.metricDimension != null) return false;
            return this.unit != null ? this.unit.equals(that.unit) : that.unit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.metricName.hashCode();
            result = 31 * result + (this.namespace.hashCode());
            result = 31 * result + (this.statistic.hashCode());
            result = 31 * result + (this.metricDimension != null ? this.metricDimension.hashCode() : 0);
            result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
            return result;
        }
    }
}
