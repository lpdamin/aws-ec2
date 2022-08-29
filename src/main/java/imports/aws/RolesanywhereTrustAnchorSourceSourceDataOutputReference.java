package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.386Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.RolesanywhereTrustAnchorSourceSourceDataOutputReference")
public class RolesanywhereTrustAnchorSourceSourceDataOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RolesanywhereTrustAnchorSourceSourceDataOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RolesanywhereTrustAnchorSourceSourceDataOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RolesanywhereTrustAnchorSourceSourceDataOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAcmPcaArn() {
        software.amazon.jsii.Kernel.call(this, "resetAcmPcaArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetX509CertificateData() {
        software.amazon.jsii.Kernel.call(this, "resetX509CertificateData", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAcmPcaArnInput() {
        return software.amazon.jsii.Kernel.get(this, "acmPcaArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getX509CertificateDataInput() {
        return software.amazon.jsii.Kernel.get(this, "x509CertificateDataInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcmPcaArn() {
        return software.amazon.jsii.Kernel.get(this, "acmPcaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcmPcaArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acmPcaArn", java.util.Objects.requireNonNull(value, "acmPcaArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getX509CertificateData() {
        return software.amazon.jsii.Kernel.get(this, "x509CertificateData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setX509CertificateData(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "x509CertificateData", java.util.Objects.requireNonNull(value, "x509CertificateData is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.RolesanywhereTrustAnchorSourceSourceData getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.RolesanywhereTrustAnchorSourceSourceData.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.RolesanywhereTrustAnchorSourceSourceData value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
