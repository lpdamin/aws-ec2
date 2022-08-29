package imports.aws.apprunner;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.715Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositoryOutputReference")
public class ApprunnerServiceSourceConfigurationCodeRepositoryOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApprunnerServiceSourceConfigurationCodeRepositoryOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApprunnerServiceSourceConfigurationCodeRepositoryOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApprunnerServiceSourceConfigurationCodeRepositoryOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCodeConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositoryCodeConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putCodeConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourceCodeVersion(final @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositorySourceCodeVersion value) {
        software.amazon.jsii.Kernel.call(this, "putSourceCodeVersion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCodeConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetCodeConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositoryCodeConfigurationOutputReference getCodeConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "codeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositoryCodeConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositorySourceCodeVersionOutputReference getSourceCodeVersion() {
        return software.amazon.jsii.Kernel.get(this, "sourceCodeVersion", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositorySourceCodeVersionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositoryCodeConfiguration getCodeConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "codeConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositoryCodeConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositorySourceCodeVersion getSourceCodeVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceCodeVersionInput", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepositorySourceCodeVersion.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryUrl() {
        return software.amazon.jsii.Kernel.get(this, "repositoryUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryUrl", java.util.Objects.requireNonNull(value, "repositoryUrl is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepository getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepository.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceSourceConfigurationCodeRepository value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
