package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.241Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfigOutputReference")
public class CloudfrontOriginRequestPolicyCookiesConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontOriginRequestPolicyCookiesConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontOriginRequestPolicyCookiesConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontOriginRequestPolicyCookiesConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCookies(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfigCookies value) {
        software.amazon.jsii.Kernel.call(this, "putCookies", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCookies() {
        software.amazon.jsii.Kernel.call(this, "resetCookies", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfigCookiesOutputReference getCookies() {
        return software.amazon.jsii.Kernel.get(this, "cookies", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfigCookiesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCookieBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "cookieBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfigCookies getCookiesInput() {
        return software.amazon.jsii.Kernel.get(this, "cookiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfigCookies.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCookieBehavior() {
        return software.amazon.jsii.Kernel.get(this, "cookieBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCookieBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cookieBehavior", java.util.Objects.requireNonNull(value, "cookieBehavior is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontOriginRequestPolicyCookiesConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
