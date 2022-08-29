package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.820Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationOutputReference")
public class AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCustomizedCapacityMetricSpecification(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putCustomizedCapacityMetricSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustomizedLoadMetricSpecification(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putCustomizedLoadMetricSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustomizedScalingMetricSpecification(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putCustomizedScalingMetricSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPredefinedLoadMetricSpecification(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putPredefinedLoadMetricSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPredefinedMetricPairSpecification(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putPredefinedMetricPairSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPredefinedScalingMetricSpecification(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putPredefinedScalingMetricSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCustomizedCapacityMetricSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetCustomizedCapacityMetricSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomizedLoadMetricSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetCustomizedLoadMetricSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomizedScalingMetricSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetCustomizedScalingMetricSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPredefinedLoadMetricSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetPredefinedLoadMetricSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPredefinedMetricPairSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetPredefinedMetricPairSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPredefinedScalingMetricSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetPredefinedScalingMetricSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationOutputReference getCustomizedCapacityMetricSpecification() {
        return software.amazon.jsii.Kernel.get(this, "customizedCapacityMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationOutputReference getCustomizedLoadMetricSpecification() {
        return software.amazon.jsii.Kernel.get(this, "customizedLoadMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationOutputReference getCustomizedScalingMetricSpecification() {
        return software.amazon.jsii.Kernel.get(this, "customizedScalingMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationOutputReference getPredefinedLoadMetricSpecification() {
        return software.amazon.jsii.Kernel.get(this, "predefinedLoadMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationOutputReference getPredefinedMetricPairSpecification() {
        return software.amazon.jsii.Kernel.get(this, "predefinedMetricPairSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationOutputReference getPredefinedScalingMetricSpecification() {
        return software.amazon.jsii.Kernel.get(this, "predefinedScalingMetricSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification getCustomizedCapacityMetricSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "customizedCapacityMetricSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification getCustomizedLoadMetricSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "customizedLoadMetricSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedLoadMetricSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification getCustomizedScalingMetricSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "customizedScalingMetricSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification getPredefinedLoadMetricSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "predefinedLoadMetricSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification getPredefinedMetricPairSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "predefinedMetricPairSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification getPredefinedScalingMetricSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "predefinedScalingMetricSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTargetValueInput() {
        return software.amazon.jsii.Kernel.get(this, "targetValueInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTargetValue() {
        return software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTargetValue(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "targetValue", java.util.Objects.requireNonNull(value, "targetValue is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingPolicyPredictiveScalingConfigurationMetricSpecification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
