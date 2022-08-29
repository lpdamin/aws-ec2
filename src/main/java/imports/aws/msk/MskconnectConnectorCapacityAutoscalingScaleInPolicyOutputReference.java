package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.976Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorCapacityAutoscalingScaleInPolicyOutputReference")
public class MskconnectConnectorCapacityAutoscalingScaleInPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskconnectConnectorCapacityAutoscalingScaleInPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskconnectConnectorCapacityAutoscalingScaleInPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskconnectConnectorCapacityAutoscalingScaleInPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCpuUtilizationPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetCpuUtilizationPercentage", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCpuUtilizationPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "cpuUtilizationPercentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getCpuUtilizationPercentage() {
        return software.amazon.jsii.Kernel.get(this, "cpuUtilizationPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCpuUtilizationPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cpuUtilizationPercentage", java.util.Objects.requireNonNull(value, "cpuUtilizationPercentage is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorCapacityAutoscalingScaleInPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorCapacityAutoscalingScaleInPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorCapacityAutoscalingScaleInPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
