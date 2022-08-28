package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.513Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference")
public class SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRepositoryCredentialsProviderArnInput() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCredentialsProviderArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRepositoryCredentialsProviderArn() {
        return software.amazon.jsii.Kernel.get(this, "repositoryCredentialsProviderArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRepositoryCredentialsProviderArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "repositoryCredentialsProviderArn", java.util.Objects.requireNonNull(value, "repositoryCredentialsProviderArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
