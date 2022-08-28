package imports.aws.acm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.020Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationOutputReference")
public class AcmpcaCertificateAuthorityCertificateAuthorityConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AcmpcaCertificateAuthorityCertificateAuthorityConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AcmpcaCertificateAuthorityCertificateAuthorityConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AcmpcaCertificateAuthorityCertificateAuthorityConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSubject(final @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject value) {
        software.amazon.jsii.Kernel.call(this, "putSubject", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubjectOutputReference getSubject() {
        return software.amazon.jsii.Kernel.get(this, "subject", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubjectOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyAlgorithmInput() {
        return software.amazon.jsii.Kernel.get(this, "keyAlgorithmInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSigningAlgorithmInput() {
        return software.amazon.jsii.Kernel.get(this, "signingAlgorithmInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject getSubjectInput() {
        return software.amazon.jsii.Kernel.get(this, "subjectInput", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfigurationSubject.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyAlgorithm() {
        return software.amazon.jsii.Kernel.get(this, "keyAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyAlgorithm(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyAlgorithm", java.util.Objects.requireNonNull(value, "keyAlgorithm is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSigningAlgorithm() {
        return software.amazon.jsii.Kernel.get(this, "signingAlgorithm", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSigningAlgorithm(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "signingAlgorithm", java.util.Objects.requireNonNull(value, "signingAlgorithm is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityCertificateAuthorityConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
