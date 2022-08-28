package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.357Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference")
public class GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryptionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCloudwatchEncryptionMode() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchEncryptionMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchEncryptionModeInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchEncryptionModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchEncryptionMode() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchEncryptionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchEncryptionMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchEncryptionMode", java.util.Objects.requireNonNull(value, "cloudwatchEncryptionMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueSecurityConfigurationEncryptionConfigurationCloudwatchEncryption value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
