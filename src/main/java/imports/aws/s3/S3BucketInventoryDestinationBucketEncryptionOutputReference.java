package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.410Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketInventoryDestinationBucketEncryptionOutputReference")
public class S3BucketInventoryDestinationBucketEncryptionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketInventoryDestinationBucketEncryptionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketInventoryDestinationBucketEncryptionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketInventoryDestinationBucketEncryptionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSseKms(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKms value) {
        software.amazon.jsii.Kernel.call(this, "putSseKms", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSseS3(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3 value) {
        software.amazon.jsii.Kernel.call(this, "putSseS3", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSseKms() {
        software.amazon.jsii.Kernel.call(this, "resetSseKms", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSseS3() {
        software.amazon.jsii.Kernel.call(this, "resetSseS3", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKmsOutputReference getSseKms() {
        return software.amazon.jsii.Kernel.get(this, "sseKms", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKmsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference getSseS3() {
        return software.amazon.jsii.Kernel.get(this, "sseS3", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3OutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKms getSseKmsInput() {
        return software.amazon.jsii.Kernel.get(this, "sseKmsInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseKms.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3 getSseS3Input() {
        return software.amazon.jsii.Kernel.get(this, "sseS3Input", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketInventoryDestinationBucketEncryptionSseS3.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketInventoryDestinationBucketEncryption getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketInventoryDestinationBucketEncryption.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketInventoryDestinationBucketEncryption value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
