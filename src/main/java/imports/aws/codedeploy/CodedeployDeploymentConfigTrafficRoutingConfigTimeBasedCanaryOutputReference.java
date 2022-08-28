package imports.aws.codedeploy;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.543Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference")
public class CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanaryOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetInterval() {
        software.amazon.jsii.Kernel.call(this, "resetInterval", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetPercentage", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "intervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "percentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInterval() {
        return software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "interval", java.util.Objects.requireNonNull(value, "interval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPercentage() {
        return software.amazon.jsii.Kernel.get(this, "percentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "percentage", java.util.Objects.requireNonNull(value, "percentage is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentConfigTrafficRoutingConfigTimeBasedCanary value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
