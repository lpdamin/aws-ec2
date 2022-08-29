package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.673Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsOutputReference")
public class AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCertificate(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate value) {
        software.amazon.jsii.Kernel.call(this, "putCertificate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putValidation(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidation value) {
        software.amazon.jsii.Kernel.call(this, "putValidation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCertificate() {
        software.amazon.jsii.Kernel.call(this, "resetCertificate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnforce() {
        software.amazon.jsii.Kernel.call(this, "resetEnforce", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPorts() {
        software.amazon.jsii.Kernel.call(this, "resetPorts", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateOutputReference getCertificate() {
        return software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference getValidation() {
        return software.amazon.jsii.Kernel.get(this, "validation", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate getCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsCertificate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnforceInput() {
        return software.amazon.jsii.Kernel.get(this, "enforceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getPortsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Number>)(software.amazon.jsii.Kernel.get(this, "portsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidation getValidationInput() {
        return software.amazon.jsii.Kernel.get(this, "validationInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidation.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnforce() {
        return software.amazon.jsii.Kernel.get(this, "enforce", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnforce(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enforce", java.util.Objects.requireNonNull(value, "enforce is required"));
    }

    public void setEnforce(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enforce", java.util.Objects.requireNonNull(value, "enforce is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getPorts() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public void setPorts(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> value) {
        software.amazon.jsii.Kernel.set(this, "ports", java.util.Objects.requireNonNull(value, "ports is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTls getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTls.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTls value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
