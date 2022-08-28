package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.513Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerImageConfigOutputReference")
public class SagemakerModelPrimaryContainerImageConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerModelPrimaryContainerImageConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerModelPrimaryContainerImageConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerModelPrimaryContainerImageConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRepositoryAuthConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig value) {
        software.amazon.jsii.Kernel.call(this, "putRepositoryAuthConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRepositoryAuthConfig() {
        software.amazon.jsii.Kernel.call(this, "resetRepositoryAuthConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference getRepositoryAuthConfig() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAuthConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryAccessModeInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAccessModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig getRepositoryAuthConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAuthConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryAccessMode() {
        return software.amazon.jsii.Kernel.get(this, "repositoryAccessMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryAccessMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryAccessMode", java.util.Objects.requireNonNull(value, "repositoryAccessMode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
