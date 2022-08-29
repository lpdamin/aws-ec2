package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.797Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingGroupMixedInstancesPolicyOutputReference")
public class AutoscalingGroupMixedInstancesPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingGroupMixedInstancesPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingGroupMixedInstancesPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingGroupMixedInstancesPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putInstancesDistribution(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution value) {
        software.amazon.jsii.Kernel.call(this, "putInstancesDistribution", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLaunchTemplate(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putLaunchTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetInstancesDistribution() {
        software.amazon.jsii.Kernel.call(this, "resetInstancesDistribution", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistributionOutputReference getInstancesDistribution() {
        return software.amazon.jsii.Kernel.get(this, "instancesDistribution", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistributionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplateOutputReference getLaunchTemplate() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution getInstancesDistributionInput() {
        return software.amazon.jsii.Kernel.get(this, "instancesDistributionInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyInstancesDistribution.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate getLaunchTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicyLaunchTemplate.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupMixedInstancesPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
