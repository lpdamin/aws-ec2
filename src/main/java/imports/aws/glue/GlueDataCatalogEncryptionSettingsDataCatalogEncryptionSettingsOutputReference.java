package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.262Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsOutputReference")
public class GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConnectionPasswordEncryption(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption value) {
        software.amazon.jsii.Kernel.call(this, "putConnectionPasswordEncryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEncryptionAtRest(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest value) {
        software.amazon.jsii.Kernel.call(this, "putEncryptionAtRest", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference getConnectionPasswordEncryption() {
        return software.amazon.jsii.Kernel.get(this, "connectionPasswordEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference getEncryptionAtRest() {
        return software.amazon.jsii.Kernel.get(this, "encryptionAtRest", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption getConnectionPasswordEncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionPasswordEncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest getEncryptionAtRestInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionAtRestInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
