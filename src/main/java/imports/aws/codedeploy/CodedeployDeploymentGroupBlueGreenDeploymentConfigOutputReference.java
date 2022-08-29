package imports.aws.codedeploy;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.125Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigOutputReference")
public class CodedeployDeploymentGroupBlueGreenDeploymentConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodedeployDeploymentGroupBlueGreenDeploymentConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentGroupBlueGreenDeploymentConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodedeployDeploymentGroupBlueGreenDeploymentConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDeploymentReadyOption(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption value) {
        software.amazon.jsii.Kernel.call(this, "putDeploymentReadyOption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGreenFleetProvisioningOption(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption value) {
        software.amazon.jsii.Kernel.call(this, "putGreenFleetProvisioningOption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTerminateBlueInstancesOnDeploymentSuccess(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess value) {
        software.amazon.jsii.Kernel.call(this, "putTerminateBlueInstancesOnDeploymentSuccess", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDeploymentReadyOption() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentReadyOption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGreenFleetProvisioningOption() {
        software.amazon.jsii.Kernel.call(this, "resetGreenFleetProvisioningOption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminateBlueInstancesOnDeploymentSuccess() {
        software.amazon.jsii.Kernel.call(this, "resetTerminateBlueInstancesOnDeploymentSuccess", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionOutputReference getDeploymentReadyOption() {
        return software.amazon.jsii.Kernel.get(this, "deploymentReadyOption", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionOutputReference getGreenFleetProvisioningOption() {
        return software.amazon.jsii.Kernel.get(this, "greenFleetProvisioningOption", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference getTerminateBlueInstancesOnDeploymentSuccess() {
        return software.amazon.jsii.Kernel.get(this, "terminateBlueInstancesOnDeploymentSuccess", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption getDeploymentReadyOptionInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentReadyOptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption getGreenFleetProvisioningOptionInput() {
        return software.amazon.jsii.Kernel.get(this, "greenFleetProvisioningOptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess getTerminateBlueInstancesOnDeploymentSuccessInput() {
        return software.amazon.jsii.Kernel.get(this, "terminateBlueInstancesOnDeploymentSuccessInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
