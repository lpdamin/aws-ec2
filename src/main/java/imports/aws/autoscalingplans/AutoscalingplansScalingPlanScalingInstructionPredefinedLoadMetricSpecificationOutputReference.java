package imports.aws.autoscalingplans;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.839Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscalingplans.AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecificationOutputReference")
public class AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetResourceLabel() {
        software.amazon.jsii.Kernel.call(this, "resetResourceLabel", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPredefinedLoadMetricTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "predefinedLoadMetricTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceLabelInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceLabelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPredefinedLoadMetricType() {
        return software.amazon.jsii.Kernel.get(this, "predefinedLoadMetricType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPredefinedLoadMetricType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "predefinedLoadMetricType", java.util.Objects.requireNonNull(value, "predefinedLoadMetricType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceLabel() {
        return software.amazon.jsii.Kernel.get(this, "resourceLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceLabel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceLabel", java.util.Objects.requireNonNull(value, "resourceLabel is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscalingplans.AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscalingplans.AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscalingplans.AutoscalingplansScalingPlanScalingInstructionPredefinedLoadMetricSpecification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
