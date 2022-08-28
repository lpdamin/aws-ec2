package imports.aws.apigatewayv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.285Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigatewayv2.Apigatewayv2DomainNameDomainNameConfigurationOutputReference")
public class Apigatewayv2DomainNameDomainNameConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Apigatewayv2DomainNameDomainNameConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2DomainNameDomainNameConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Apigatewayv2DomainNameDomainNameConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetOwnershipVerificationCertificateArn() {
        software.amazon.jsii.Kernel.call(this, "resetOwnershipVerificationCertificateArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostedZoneId() {
        return software.amazon.jsii.Kernel.get(this, "hostedZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetDomainName() {
        return software.amazon.jsii.Kernel.get(this, "targetDomainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnershipVerificationCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "ownershipVerificationCertificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecurityPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "securityPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateArn", java.util.Objects.requireNonNull(value, "certificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointType() {
        return software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointType", java.util.Objects.requireNonNull(value, "endpointType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnershipVerificationCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "ownershipVerificationCertificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwnershipVerificationCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ownershipVerificationCertificateArn", java.util.Objects.requireNonNull(value, "ownershipVerificationCertificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecurityPolicy() {
        return software.amazon.jsii.Kernel.get(this, "securityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecurityPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "securityPolicy", java.util.Objects.requireNonNull(value, "securityPolicy is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigatewayv2.Apigatewayv2DomainNameDomainNameConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apigatewayv2.Apigatewayv2DomainNameDomainNameConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apigatewayv2.Apigatewayv2DomainNameDomainNameConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
