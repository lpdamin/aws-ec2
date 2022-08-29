package imports.aws.acm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.423Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOutputReference")
public class DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putCrlConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCrlConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOcspConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOcspConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCrlConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetCrlConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOcspConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetOcspConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationCrlConfigurationList getCrlConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "crlConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationCrlConfigurationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOcspConfigurationList getOcspConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "ocspConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfigurationOcspConfigurationList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCrlConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "crlConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOcspConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "ocspConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.acm.DataAwsAcmpcaCertificateAuthorityRevocationConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
