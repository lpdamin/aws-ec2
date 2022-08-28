package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.499Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference")
public class SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTrafficRoutingConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putTrafficRoutingConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMaximumExecutionTimeoutInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumExecutionTimeoutInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationWaitInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationWaitInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationOutputReference getTrafficRoutingConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "trafficRoutingConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumExecutionTimeoutInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumExecutionTimeoutInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTerminationWaitInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "terminationWaitInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration getTrafficRoutingConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "trafficRoutingConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumExecutionTimeoutInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumExecutionTimeoutInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumExecutionTimeoutInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumExecutionTimeoutInSeconds", java.util.Objects.requireNonNull(value, "maximumExecutionTimeoutInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTerminationWaitInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "terminationWaitInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTerminationWaitInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "terminationWaitInSeconds", java.util.Objects.requireNonNull(value, "terminationWaitInSeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
