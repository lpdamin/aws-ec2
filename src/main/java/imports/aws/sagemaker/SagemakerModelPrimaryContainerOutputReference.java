package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.531Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerOutputReference")
public class SagemakerModelPrimaryContainerOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerModelPrimaryContainerOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerModelPrimaryContainerOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerModelPrimaryContainerOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putImageConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfig value) {
        software.amazon.jsii.Kernel.call(this, "putImageConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetContainerHostname() {
        software.amazon.jsii.Kernel.call(this, "resetContainerHostname", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnvironment() {
        software.amazon.jsii.Kernel.call(this, "resetEnvironment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageConfig() {
        software.amazon.jsii.Kernel.call(this, "resetImageConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMode() {
        software.amazon.jsii.Kernel.call(this, "resetMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetModelDataUrl() {
        software.amazon.jsii.Kernel.call(this, "resetModelDataUrl", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigOutputReference getImageConfig() {
        return software.amazon.jsii.Kernel.get(this, "imageConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContainerHostnameInput() {
        return software.amazon.jsii.Kernel.get(this, "containerHostnameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getEnvironmentInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "environmentInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfig getImageConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "imageConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageInput() {
        return software.amazon.jsii.Kernel.get(this, "imageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModeInput() {
        return software.amazon.jsii.Kernel.get(this, "modeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModelDataUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "modelDataUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContainerHostname() {
        return software.amazon.jsii.Kernel.get(this, "containerHostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContainerHostname(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "containerHostname", java.util.Objects.requireNonNull(value, "containerHostname is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getEnvironment() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setEnvironment(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "environment", java.util.Objects.requireNonNull(value, "environment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImage() {
        return software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "image", java.util.Objects.requireNonNull(value, "image is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMode() {
        return software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mode", java.util.Objects.requireNonNull(value, "mode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModelDataUrl() {
        return software.amazon.jsii.Kernel.get(this, "modelDataUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setModelDataUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "modelDataUrl", java.util.Objects.requireNonNull(value, "modelDataUrl is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainer getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainer.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainer value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
