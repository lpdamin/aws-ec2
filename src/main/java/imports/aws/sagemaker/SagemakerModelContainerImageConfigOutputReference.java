package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.521Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelContainerImageConfigOutputReference")
public class SagemakerModelContainerImageConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerModelContainerImageConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerModelContainerImageConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerModelContainerImageConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRepositoryAuthConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelContainerImageConfigRepositoryAuthConfig value) {
        software.amazon.jsii.Kernel.call(this, "putRepositoryAuthConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRepositoryAuthConfig() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryAuthConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelContainerImageConfigRepositoryAuthConfigOutputReference getRepositoryAuthConfig() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAuthConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelContainerImageConfigRepositoryAuthConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryAccessModeInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAccessModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelContainerImageConfigRepositoryAuthConfig getRepositoryAuthConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAuthConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelContainerImageConfigRepositoryAuthConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryAccessMode() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAccessMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryAccessMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryAccessMode", java.util.Objects.requireNonNull(value, "repositoryAccessMode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelContainerImageConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelContainerImageConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelContainerImageConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
