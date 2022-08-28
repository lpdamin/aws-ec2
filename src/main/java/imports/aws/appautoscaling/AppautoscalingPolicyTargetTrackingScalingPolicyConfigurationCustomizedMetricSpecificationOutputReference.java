package imports.aws.appautoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.387Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOutputReference")
public class AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDimensions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDimensions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDimensions() {
        software.amazon.jsii.Kernel.call(this, "resetDimensions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUnit() {
        software.amazon.jsii.Kernel.call(this, "resetUnit", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionsList getDimensions() {
        return software.amazon.jsii.Kernel.get(this, "dimensions", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDimensionsInput() {
        return software.amazon.jsii.Kernel.get(this, "dimensionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricNameInput() {
        return software.amazon.jsii.Kernel.get(this, "metricNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatisticInput() {
        return software.amazon.jsii.Kernel.get(this, "statisticInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "unitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMetricName() {
        return software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricName", java.util.Objects.requireNonNull(value, "metricName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamespace() {
        return software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamespace(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namespace", java.util.Objects.requireNonNull(value, "namespace is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatistic() {
        return software.amazon.jsii.Kernel.get(this, "statistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatistic(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "statistic", java.util.Objects.requireNonNull(value, "statistic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUnit() {
        return software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "unit", java.util.Objects.requireNonNull(value, "unit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
