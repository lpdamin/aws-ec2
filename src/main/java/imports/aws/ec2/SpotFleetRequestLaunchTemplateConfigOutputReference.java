package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.845Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.SpotFleetRequestLaunchTemplateConfigOutputReference")
public class SpotFleetRequestLaunchTemplateConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SpotFleetRequestLaunchTemplateConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SpotFleetRequestLaunchTemplateConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public SpotFleetRequestLaunchTemplateConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putLaunchTemplateSpecification(final @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification value) {
        software.amazon.jsii.Kernel.call(this, "putLaunchTemplateSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOverrides(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOverrides", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOverrides() {
        software.amazon.jsii.Kernel.call(this, "resetOverrides", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationOutputReference getLaunchTemplateSpecification() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigOverridesList getOverrides() {
        return software.amazon.jsii.Kernel.get(this, "overrides", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigOverridesList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification getLaunchTemplateSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateSpecificationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOverridesInput() {
        return software.amazon.jsii.Kernel.get(this, "overridesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestLaunchTemplateConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
