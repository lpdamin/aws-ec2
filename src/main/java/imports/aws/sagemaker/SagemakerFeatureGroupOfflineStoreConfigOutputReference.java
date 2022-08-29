package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.513Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigOutputReference")
public class SagemakerFeatureGroupOfflineStoreConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerFeatureGroupOfflineStoreConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerFeatureGroupOfflineStoreConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerFeatureGroupOfflineStoreConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDataCatalogConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDataCatalogConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3StorageConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig value) {
        software.amazon.jsii.Kernel.call(this, "putS3StorageConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDataCatalogConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDataCatalogConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisableGlueTableCreation() {
        software.amazon.jsii.Kernel.call(this, "resetDisableGlueTableCreation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfigOutputReference getDataCatalogConfig() {
        return software.amazon.jsii.Kernel.get(this, "dataCatalogConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfigOutputReference getS3StorageConfig() {
        return software.amazon.jsii.Kernel.get(this, "s3StorageConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig getDataCatalogConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "dataCatalogConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisableGlueTableCreationInput() {
        return software.amazon.jsii.Kernel.get(this, "disableGlueTableCreationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig getS3StorageConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "s3StorageConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisableGlueTableCreation() {
        return software.amazon.jsii.Kernel.get(this, "disableGlueTableCreation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisableGlueTableCreation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableGlueTableCreation", java.util.Objects.requireNonNull(value, "disableGlueTableCreation is required"));
    }

    public void setDisableGlueTableCreation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disableGlueTableCreation", java.util.Objects.requireNonNull(value, "disableGlueTableCreation is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
