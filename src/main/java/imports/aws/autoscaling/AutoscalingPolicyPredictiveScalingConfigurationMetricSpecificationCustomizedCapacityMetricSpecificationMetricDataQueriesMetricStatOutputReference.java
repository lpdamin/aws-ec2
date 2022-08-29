package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.816Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatOutputReference")
public class AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMetric(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatMetric value) {
        software.amazon.jsii.Kernel.call(this, "putMetric", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetUnit() {
        software.amazon.jsii.Kernel.call(this, "resetUnit", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatMetricOutputReference getMetric() {
        return software.amazon.jsii.Kernel.get(this, "metric", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatMetricOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatMetric getMetricInput() {
        return software.amazon.jsii.Kernel.get(this, "metricInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStatMetric.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatInput() {
        return software.amazon.jsii.Kernel.get(this, "statInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "unitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStat() {
        return software.amazon.jsii.Kernel.get(this, "stat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "stat", java.util.Objects.requireNonNull(value, "stat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUnit() {
        return software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "unit", java.util.Objects.requireNonNull(value, "unit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStat getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStat.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueriesMetricStat value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
