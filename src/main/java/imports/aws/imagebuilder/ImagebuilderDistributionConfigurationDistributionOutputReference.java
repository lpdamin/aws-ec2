package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.399Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionOutputReference")
public class ImagebuilderDistributionConfigurationDistributionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ImagebuilderDistributionConfigurationDistributionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ImagebuilderDistributionConfigurationDistributionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public ImagebuilderDistributionConfigurationDistributionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAmiDistributionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putAmiDistributionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putContainerDistributionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putContainerDistributionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFastLaunchConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFastLaunchConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLaunchTemplateConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLaunchTemplateConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAmiDistributionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAmiDistributionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContainerDistributionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetContainerDistributionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFastLaunchConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetFastLaunchConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchTemplateConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchTemplateConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseConfigurationArns() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseConfigurationArns", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference getAmiDistributionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "amiDistributionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationOutputReference getContainerDistributionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "containerDistributionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionFastLaunchConfigurationList getFastLaunchConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "fastLaunchConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionFastLaunchConfigurationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionLaunchTemplateConfigurationList getLaunchTemplateConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionLaunchTemplateConfigurationList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration getAmiDistributionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "amiDistributionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration getContainerDistributionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "containerDistributionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFastLaunchConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "fastLaunchConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLaunchTemplateConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "launchTemplateConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLicenseConfigurationArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "licenseConfigurationArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLicenseConfigurationArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "licenseConfigurationArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLicenseConfigurationArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "licenseConfigurationArns", java.util.Objects.requireNonNull(value, "licenseConfigurationArns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistribution value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
