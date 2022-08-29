package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.673Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference")
public class AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSubjectAlternativeNames(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames value) {
        software.amazon.jsii.Kernel.call(this, "putSubjectAlternativeNames", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTrust(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust value) {
        software.amazon.jsii.Kernel.call(this, "putTrust", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSubjectAlternativeNames() {
        software.amazon.jsii.Kernel.call(this, "resetSubjectAlternativeNames", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference getSubjectAlternativeNames() {
        return software.amazon.jsii.Kernel.get(this, "subjectAlternativeNames", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustOutputReference getTrust() {
        return software.amazon.jsii.Kernel.get(this, "trust", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames getSubjectAlternativeNamesInput() {
        return software.amazon.jsii.Kernel.get(this, "subjectAlternativeNamesInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust getTrustInput() {
        return software.amazon.jsii.Kernel.get(this, "trustInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidation getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidation.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsClientPolicyTlsValidation value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
