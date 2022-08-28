package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.357Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueSecurityConfigurationEncryptionConfigurationOutputReference")
public class GlueSecurityConfigurationEncryptionConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueSecurityConfigurationEncryptionConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueSecurityConfigurationEncryptionConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueSecurityConfigurationEncryptionConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCloudwatchEncryption(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchEncryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putJobBookmarksEncryption(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption value) {
        software.amazon.jsii.Kernel.call(this, "putJobBookmarksEncryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3Encryption(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationS3Encryption value) {
        software.amazon.jsii.Kernel.call(this, "putS3Encryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference getCloudwatchEncryption() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionOutputReference getJobBookmarksEncryption() {
        return software.amazon.jsii.Kernel.get(this, "jobBookmarksEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationS3EncryptionOutputReference getS3Encryption() {
        return software.amazon.jsii.Kernel.get(this, "s3Encryption", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationS3EncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption getCloudwatchEncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchEncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption getJobBookmarksEncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "jobBookmarksEncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationJobBookmarksEncryption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationS3Encryption getS3EncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "s3EncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationS3Encryption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
