package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.509Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigOutputReference")
public class SagemakerEndpointConfigurationDataCaptureConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerEndpointConfigurationDataCaptureConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointConfigurationDataCaptureConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerEndpointConfigurationDataCaptureConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCaptureContentTypeHeader(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeader value) {
        software.amazon.jsii.Kernel.call(this, "putCaptureContentTypeHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCaptureOptions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCaptureOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCaptureContentTypeHeader() {
        software.amazon.jsii.Kernel.call(this, "resetCaptureContentTypeHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableCapture() {
        software.amazon.jsii.Kernel.call(this, "resetEnableCapture", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference getCaptureContentTypeHeader() {
        return software.amazon.jsii.Kernel.get(this, "captureContentTypeHeader", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureOptionsList getCaptureOptions() {
        return software.amazon.jsii.Kernel.get(this, "captureOptions", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureOptionsList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeader getCaptureContentTypeHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "captureContentTypeHeaderInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeader.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCaptureOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "captureOptionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationS3UriInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationS3UriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableCaptureInput() {
        return software.amazon.jsii.Kernel.get(this, "enableCaptureInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInitialSamplingPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "initialSamplingPercentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationS3Uri() {
        return software.amazon.jsii.Kernel.get(this, "destinationS3Uri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationS3Uri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationS3Uri", java.util.Objects.requireNonNull(value, "destinationS3Uri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableCapture() {
        return software.amazon.jsii.Kernel.get(this, "enableCapture", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableCapture(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableCapture", java.util.Objects.requireNonNull(value, "enableCapture is required"));
    }

    public void setEnableCapture(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableCapture", java.util.Objects.requireNonNull(value, "enableCapture is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInitialSamplingPercentage() {
        return software.amazon.jsii.Kernel.get(this, "initialSamplingPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInitialSamplingPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "initialSamplingPercentage", java.util.Objects.requireNonNull(value, "initialSamplingPercentage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
