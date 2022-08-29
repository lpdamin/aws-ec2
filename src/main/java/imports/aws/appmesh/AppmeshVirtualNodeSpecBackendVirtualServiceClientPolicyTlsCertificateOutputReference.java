package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.680Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateOutputReference")
public class AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFile(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile value) {
        software.amazon.jsii.Kernel.call(this, "putFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSds(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds value) {
        software.amazon.jsii.Kernel.call(this, "putSds", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFile() {
        software.amazon.jsii.Kernel.call(this, "resetFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSds() {
        software.amazon.jsii.Kernel.call(this, "resetSds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileOutputReference getFile() {
        return software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsOutputReference getSds() {
        return software.amazon.jsii.Kernel.get(this, "sds", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile getFileInput() {
        return software.amazon.jsii.Kernel.get(this, "fileInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds getSdsInput() {
        return software.amazon.jsii.Kernel.get(this, "sdsInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
