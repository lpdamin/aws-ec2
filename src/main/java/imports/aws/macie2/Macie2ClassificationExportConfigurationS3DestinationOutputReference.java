package imports.aws.macie2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.785Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.macie2.Macie2ClassificationExportConfigurationS3DestinationOutputReference")
public class Macie2ClassificationExportConfigurationS3DestinationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Macie2ClassificationExportConfigurationS3DestinationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Macie2ClassificationExportConfigurationS3DestinationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Macie2ClassificationExportConfigurationS3DestinationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetKeyPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetKeyPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "keyPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketName() {
        return software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketName", java.util.Objects.requireNonNull(value, "bucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyPrefix() {
        return software.amazon.jsii.Kernel.get(this, "keyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyPrefix", java.util.Objects.requireNonNull(value, "keyPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationExportConfigurationS3Destination getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationExportConfigurationS3Destination.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationExportConfigurationS3Destination value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
