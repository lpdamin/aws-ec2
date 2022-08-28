package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.332Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference")
public class GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSseAwsKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetSseAwsKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCatalogEncryptionModeInput() {
        return software.amazon.jsii.Kernel.get(this, "catalogEncryptionModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSseAwsKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "sseAwsKmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCatalogEncryptionMode() {
        return software.amazon.jsii.Kernel.get(this, "catalogEncryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCatalogEncryptionMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "catalogEncryptionMode", java.util.Objects.requireNonNull(value, "catalogEncryptionMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSseAwsKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "sseAwsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSseAwsKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sseAwsKmsKeyId", java.util.Objects.requireNonNull(value, "sseAwsKmsKeyId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
