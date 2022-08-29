package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.847Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCountOutputReference")
public class SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCountOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCountOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCountOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCountOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMax() {
        software.amazon.jsii.Kernel.call(this, "resetMax", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMin() {
        software.amazon.jsii.Kernel.call(this, "resetMin", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxInput() {
        return software.amazon.jsii.Kernel.get(this, "maxInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinInput() {
        return software.amazon.jsii.Kernel.get(this, "minInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMax() {
        return software.amazon.jsii.Kernel.get(this, "max", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMax(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "max", java.util.Objects.requireNonNull(value, "max is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMin() {
        return software.amazon.jsii.Kernel.get(this, "min", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMin(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "min", java.util.Objects.requireNonNull(value, "min is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCount getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCount.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigOverridesInstanceRequirementsVcpuCount value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
