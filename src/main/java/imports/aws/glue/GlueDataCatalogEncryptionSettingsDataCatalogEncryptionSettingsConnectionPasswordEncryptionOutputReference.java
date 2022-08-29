package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.262Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference")
public class GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAwsKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetAwsKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAwsKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "awsKmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReturnConnectionPasswordEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "returnConnectionPasswordEncryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "awsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAwsKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "awsKmsKeyId", java.util.Objects.requireNonNull(value, "awsKmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReturnConnectionPasswordEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "returnConnectionPasswordEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReturnConnectionPasswordEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "returnConnectionPasswordEncrypted", java.util.Objects.requireNonNull(value, "returnConnectionPasswordEncrypted is required"));
    }

    public void setReturnConnectionPasswordEncrypted(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "returnConnectionPasswordEncrypted", java.util.Objects.requireNonNull(value, "returnConnectionPasswordEncrypted is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
