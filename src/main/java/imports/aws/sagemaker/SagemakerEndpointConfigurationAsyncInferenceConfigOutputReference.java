package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.490Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference")
public class SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerEndpointConfigurationAsyncInferenceConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClientConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigClientConfig value) {
        software.amazon.jsii.Kernel.call(this, "putClientConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOutputConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig value) {
        software.amazon.jsii.Kernel.call(this, "putOutputConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClientConfig() {
        software.amazon.jsii.Kernel.call(this, "resetClientConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigClientConfigOutputReference getClientConfig() {
        return software.amazon.jsii.Kernel.get(this, "clientConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigClientConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigOutputReference getOutputConfig() {
        return software.amazon.jsii.Kernel.get(this, "outputConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigClientConfig getClientConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "clientConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigClientConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig getOutputConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "outputConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfigOutputConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationAsyncInferenceConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
