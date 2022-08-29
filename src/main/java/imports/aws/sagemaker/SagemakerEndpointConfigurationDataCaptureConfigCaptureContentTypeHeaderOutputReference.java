package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.509Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference")
public class SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCsvContentTypes() {
        software.amazon.jsii.Kernel.call(this, "resetCsvContentTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJsonContentTypes() {
        software.amazon.jsii.Kernel.call(this, "resetJsonContentTypes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCsvContentTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "csvContentTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getJsonContentTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "jsonContentTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getCsvContentTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "csvContentTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCsvContentTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "csvContentTypes", java.util.Objects.requireNonNull(value, "csvContentTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getJsonContentTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "jsonContentTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setJsonContentTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "jsonContentTypes", java.util.Objects.requireNonNull(value, "jsonContentTypes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeader getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeader.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationDataCaptureConfigCaptureContentTypeHeader value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
