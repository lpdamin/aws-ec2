package imports.aws.codedeploy;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.542Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigOutputReference")
public class CodedeployDeploymentConfigTrafficRoutingConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodedeployDeploymentConfigTrafficRoutingConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentConfigTrafficRoutingConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodedeployDeploymentConfigTrafficRoutingConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTimeBasedCanary(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary value) {
        software.amazon.jsii.Kernel.call(this, "putTimeBasedCanary", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeBasedLinear(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear value) {
        software.amazon.jsii.Kernel.call(this, "putTimeBasedLinear", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTimeBasedCanary() {
        software.amazon.jsii.Kernel.call(this, "resetTimeBasedCanary", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeBasedLinear() {
        software.amazon.jsii.Kernel.call(this, "resetTimeBasedLinear", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference getTimeBasedCanary() {
        return software.amazon.jsii.Kernel.get(this, "timeBasedCanary", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinearOutputReference getTimeBasedLinear() {
        return software.amazon.jsii.Kernel.get(this, "timeBasedLinear", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinearOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary getTimeBasedCanaryInput() {
        return software.amazon.jsii.Kernel.get(this, "timeBasedCanaryInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear getTimeBasedLinearInput() {
        return software.amazon.jsii.Kernel.get(this, "timeBasedLinearInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedLinear.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
