package imports.aws.acm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.416Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationOutputReference")
public class AcmpcaCertificateAuthorityRevocationConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AcmpcaCertificateAuthorityRevocationConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AcmpcaCertificateAuthorityRevocationConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AcmpcaCertificateAuthorityRevocationConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCrlConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putCrlConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOcspConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationOcspConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putOcspConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCrlConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetCrlConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOcspConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetOcspConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfigurationOutputReference getCrlConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "crlConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationOcspConfigurationOutputReference getOcspConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "ocspConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationOcspConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration getCrlConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "crlConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationCrlConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationOcspConfiguration getOcspConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "ocspConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfigurationOcspConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.acm.AcmpcaCertificateAuthorityRevocationConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
