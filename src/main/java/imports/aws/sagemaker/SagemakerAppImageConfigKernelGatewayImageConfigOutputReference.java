package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.493Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigOutputReference")
public class SagemakerAppImageConfigKernelGatewayImageConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerAppImageConfigKernelGatewayImageConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerAppImageConfigKernelGatewayImageConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerAppImageConfigKernelGatewayImageConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFileSystemConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfig value) {
        software.amazon.jsii.Kernel.call(this, "putFileSystemConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKernelSpec(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigKernelSpec value) {
        software.amazon.jsii.Kernel.call(this, "putKernelSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFileSystemConfig() {
        software.amazon.jsii.Kernel.call(this, "resetFileSystemConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference getFileSystemConfig() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigKernelSpecOutputReference getKernelSpec() {
        return software.amazon.jsii.Kernel.get(this, "kernelSpec", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigKernelSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfig getFileSystemConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigKernelSpec getKernelSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "kernelSpecInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigKernelSpec.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
