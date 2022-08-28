package imports.aws.codedeploy;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.557Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference")
public class CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAction() {
        software.amazon.jsii.Kernel.call(this, "resetAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTerminationWaitTimeInMinutes() {
        software.amazon.jsii.Kernel.call(this, "resetTerminationWaitTimeInMinutes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getActionInput() {
        return software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTerminationWaitTimeInMinutesInput() {
        return software.amazon.jsii.Kernel.get(this, "terminationWaitTimeInMinutesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAction() {
        return software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "action", java.util.Objects.requireNonNull(value, "action is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTerminationWaitTimeInMinutes() {
        return software.amazon.jsii.Kernel.get(this, "terminationWaitTimeInMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTerminationWaitTimeInMinutes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "terminationWaitTimeInMinutes", java.util.Objects.requireNonNull(value, "terminationWaitTimeInMinutes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
