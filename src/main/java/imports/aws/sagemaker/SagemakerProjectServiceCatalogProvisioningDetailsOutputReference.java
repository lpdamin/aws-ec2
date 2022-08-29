package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.535Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerProjectServiceCatalogProvisioningDetailsOutputReference")
public class SagemakerProjectServiceCatalogProvisioningDetailsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerProjectServiceCatalogProvisioningDetailsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerProjectServiceCatalogProvisioningDetailsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerProjectServiceCatalogProvisioningDetailsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putProvisioningParameter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putProvisioningParameter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPathId() {
        software.amazon.jsii.Kernel.call(this, "resetPathId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProvisioningArtifactId() {
        software.amazon.jsii.Kernel.call(this, "resetProvisioningArtifactId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProvisioningParameter() {
        software.amazon.jsii.Kernel.call(this, "resetProvisioningParameter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerProjectServiceCatalogProvisioningDetailsProvisioningParameterList getProvisioningParameter() {
        return software.amazon.jsii.Kernel.get(this, "provisioningParameter", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerProjectServiceCatalogProvisioningDetailsProvisioningParameterList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathIdInput() {
        return software.amazon.jsii.Kernel.get(this, "pathIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProductIdInput() {
        return software.amazon.jsii.Kernel.get(this, "productIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProvisioningArtifactIdInput() {
        return software.amazon.jsii.Kernel.get(this, "provisioningArtifactIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getProvisioningParameterInput() {
        return software.amazon.jsii.Kernel.get(this, "provisioningParameterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPathId() {
        return software.amazon.jsii.Kernel.get(this, "pathId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPathId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pathId", java.util.Objects.requireNonNull(value, "pathId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProductId() {
        return software.amazon.jsii.Kernel.get(this, "productId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProductId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "productId", java.util.Objects.requireNonNull(value, "productId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProvisioningArtifactId() {
        return software.amazon.jsii.Kernel.get(this, "provisioningArtifactId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProvisioningArtifactId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "provisioningArtifactId", java.util.Objects.requireNonNull(value, "provisioningArtifactId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerProjectServiceCatalogProvisioningDetails getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerProjectServiceCatalogProvisioningDetails.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerProjectServiceCatalogProvisioningDetails value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
