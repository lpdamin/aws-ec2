package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.397Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryOutputReference")
public class ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryNameInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryName() {
        return software.amazon.jsii.Kernel.get(this, "repositoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryName", java.util.Objects.requireNonNull(value, "repositoryName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getService() {
        return software.amazon.jsii.Kernel.get(this, "service", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setService(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "service", java.util.Objects.requireNonNull(value, "service is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepository getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepository.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepository value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
