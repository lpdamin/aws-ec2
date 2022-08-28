package imports.aws.apprunner;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.655Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerServiceSourceConfigurationImageRepositoryOutputReference")
public class ApprunnerServiceSourceConfigurationImageRepositoryOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApprunnerServiceSourceConfigurationImageRepositoryOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApprunnerServiceSourceConfigurationImageRepositoryOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApprunnerServiceSourceConfigurationImageRepositoryOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putImageConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepositoryImageConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putImageConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetImageConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetImageConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepositoryImageConfigurationOutputReference getImageConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "imageConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepositoryImageConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepositoryImageConfiguration getImageConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "imageConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepositoryImageConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "imageIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageRepositoryTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "imageRepositoryTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "imageIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageIdentifier", java.util.Objects.requireNonNull(value, "imageIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageRepositoryType() {
        return software.amazon.jsii.Kernel.get(this, "imageRepositoryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageRepositoryType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageRepositoryType", java.util.Objects.requireNonNull(value, "imageRepositoryType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepository getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepository.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationImageRepository value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
