package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.646Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference")
public class AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMatch(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch value) {
        software.amazon.jsii.Kernel.call(this, "putMatch", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchOutputReference getMatch() {
        return software.amazon.jsii.Kernel.get(this, "match", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch getMatchInput() {
        return software.amazon.jsii.Kernel.get(this, "matchInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
