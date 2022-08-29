package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.725Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2FleetLaunchTemplateConfigOutputReference")
public class Ec2FleetLaunchTemplateConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Ec2FleetLaunchTemplateConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2FleetLaunchTemplateConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Ec2FleetLaunchTemplateConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLaunchTemplateSpecification(final @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putLaunchTemplateSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOverride(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOverride", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOverride() {
        software.amazon.jsii.Kernel.call(this, "resetOverride", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecificationOutputReference getLaunchTemplateSpecification() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2FleetLaunchTemplateConfigOverrideList getOverride() {
        return software.amazon.jsii.Kernel.get(this, "override", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2FleetLaunchTemplateConfigOverrideList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification getLaunchTemplateSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2FleetLaunchTemplateConfigLaunchTemplateSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOverrideInput() {
        return software.amazon.jsii.Kernel.get(this, "overrideInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2FleetLaunchTemplateConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2FleetLaunchTemplateConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2FleetLaunchTemplateConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
