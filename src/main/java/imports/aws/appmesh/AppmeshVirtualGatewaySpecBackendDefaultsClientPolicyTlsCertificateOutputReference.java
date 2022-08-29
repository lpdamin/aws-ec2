package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.645Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateOutputReference")
public class AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFile(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile value) {
        software.amazon.jsii.Kernel.call(this, "putFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSds(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds value) {
        software.amazon.jsii.Kernel.call(this, "putSds", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFile() {
        software.amazon.jsii.Kernel.call(this, "resetFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSds() {
        software.amazon.jsii.Kernel.call(this, "resetSds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileOutputReference getFile() {
        return software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsOutputReference getSds() {
        return software.amazon.jsii.Kernel.get(this, "sds", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile getFileInput() {
        return software.amazon.jsii.Kernel.get(this, "fileInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds getSdsInput() {
        return software.amazon.jsii.Kernel.get(this, "sdsInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
