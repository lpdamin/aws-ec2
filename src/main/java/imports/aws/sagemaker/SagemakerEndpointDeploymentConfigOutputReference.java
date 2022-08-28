package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.500Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointDeploymentConfigOutputReference")
public class SagemakerEndpointDeploymentConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerEndpointDeploymentConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointDeploymentConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerEndpointDeploymentConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAutoRollbackConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putAutoRollbackConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBlueGreenUpdatePolicy(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy value) {
        software.amazon.jsii.Kernel.call(this, "putBlueGreenUpdatePolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutoRollbackConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAutoRollbackConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfigurationOutputReference getAutoRollbackConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "autoRollbackConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference getBlueGreenUpdatePolicy() {
        return software.amazon.jsii.Kernel.get(this, "blueGreenUpdatePolicy", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration getAutoRollbackConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "autoRollbackConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigAutoRollbackConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy getBlueGreenUpdatePolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "blueGreenUpdatePolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfigBlueGreenUpdatePolicy.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointDeploymentConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointDeploymentConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
