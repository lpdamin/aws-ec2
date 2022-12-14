package imports.aws.synthetics;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.812Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.synthetics.SyntheticsCanaryArtifactConfigOutputReference")
public class SyntheticsCanaryArtifactConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SyntheticsCanaryArtifactConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SyntheticsCanaryArtifactConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SyntheticsCanaryArtifactConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putS3Encryption(final @org.jetbrains.annotations.NotNull imports.aws.synthetics.SyntheticsCanaryArtifactConfigS3Encryption value) {
        software.amazon.jsii.Kernel.call(this, "putS3Encryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetS3Encryption() {
        software.amazon.jsii.Kernel.call(this, "resetS3Encryption", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.synthetics.SyntheticsCanaryArtifactConfigS3EncryptionOutputReference getS3Encryption() {
        return software.amazon.jsii.Kernel.get(this, "s3Encryption", software.amazon.jsii.NativeType.forClass(imports.aws.synthetics.SyntheticsCanaryArtifactConfigS3EncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.synthetics.SyntheticsCanaryArtifactConfigS3Encryption getS3EncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "s3EncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.synthetics.SyntheticsCanaryArtifactConfigS3Encryption.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.synthetics.SyntheticsCanaryArtifactConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.synthetics.SyntheticsCanaryArtifactConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.synthetics.SyntheticsCanaryArtifactConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
