package imports.aws.signer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.727Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.signer.SignerSigningJobSourceOutputReference")
public class SignerSigningJobSourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SignerSigningJobSourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SignerSigningJobSourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SignerSigningJobSourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putS3(final @org.jetbrains.annotations.NotNull imports.aws.signer.SignerSigningJobSourceS3 value) {
        software.amazon.jsii.Kernel.call(this, "putS3", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.signer.SignerSigningJobSourceS3OutputReference getS3() {
        return software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.signer.SignerSigningJobSourceS3OutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.signer.SignerSigningJobSourceS3 getS3Input() {
        return software.amazon.jsii.Kernel.get(this, "s3Input", software.amazon.jsii.NativeType.forClass(imports.aws.signer.SignerSigningJobSourceS3.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.signer.SignerSigningJobSource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.signer.SignerSigningJobSource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.signer.SignerSigningJobSource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
