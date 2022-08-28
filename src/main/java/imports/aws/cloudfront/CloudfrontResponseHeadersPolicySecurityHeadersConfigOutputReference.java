package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.256Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference")
public class CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putContentSecurityPolicy(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy value) {
        software.amazon.jsii.Kernel.call(this, "putContentSecurityPolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putContentTypeOptions(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentTypeOptions value) {
        software.amazon.jsii.Kernel.call(this, "putContentTypeOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFrameOptions(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigFrameOptions value) {
        software.amazon.jsii.Kernel.call(this, "putFrameOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putReferrerPolicy(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigReferrerPolicy value) {
        software.amazon.jsii.Kernel.call(this, "putReferrerPolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStrictTransportSecurity(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity value) {
        software.amazon.jsii.Kernel.call(this, "putStrictTransportSecurity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putXssProtection(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigXssProtection value) {
        software.amazon.jsii.Kernel.call(this, "putXssProtection", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetContentSecurityPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetContentSecurityPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetContentTypeOptions() {
        software.amazon.jsii.Kernel.call(this, "resetContentTypeOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFrameOptions() {
        software.amazon.jsii.Kernel.call(this, "resetFrameOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReferrerPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetReferrerPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStrictTransportSecurity() {
        software.amazon.jsii.Kernel.call(this, "resetStrictTransportSecurity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXssProtection() {
        software.amazon.jsii.Kernel.call(this, "resetXssProtection", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyOutputReference getContentSecurityPolicy() {
        return software.amazon.jsii.Kernel.get(this, "contentSecurityPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsOutputReference getContentTypeOptions() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeOptions", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigFrameOptionsOutputReference getFrameOptions() {
        return software.amazon.jsii.Kernel.get(this, "frameOptions", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigFrameOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigReferrerPolicyOutputReference getReferrerPolicy() {
        return software.amazon.jsii.Kernel.get(this, "referrerPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigReferrerPolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityOutputReference getStrictTransportSecurity() {
        return software.amazon.jsii.Kernel.get(this, "strictTransportSecurity", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigXssProtectionOutputReference getXssProtection() {
        return software.amazon.jsii.Kernel.get(this, "xssProtection", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigXssProtectionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy getContentSecurityPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "contentSecurityPolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentTypeOptions getContentTypeOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigContentTypeOptions.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigFrameOptions getFrameOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "frameOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigFrameOptions.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigReferrerPolicy getReferrerPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "referrerPolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigReferrerPolicy.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity getStrictTransportSecurityInput() {
        return software.amazon.jsii.Kernel.get(this, "strictTransportSecurityInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigXssProtection getXssProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "xssProtectionInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigXssProtection.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
