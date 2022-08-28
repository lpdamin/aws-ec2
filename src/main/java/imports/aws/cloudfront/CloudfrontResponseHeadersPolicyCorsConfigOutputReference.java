package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.251Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigOutputReference")
public class CloudfrontResponseHeadersPolicyCorsConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontResponseHeadersPolicyCorsConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontResponseHeadersPolicyCorsConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontResponseHeadersPolicyCorsConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAccessControlAllowHeaders(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeaders value) {
        software.amazon.jsii.Kernel.call(this, "putAccessControlAllowHeaders", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAccessControlAllowMethods(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethods value) {
        software.amazon.jsii.Kernel.call(this, "putAccessControlAllowMethods", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAccessControlAllowOrigins(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOrigins value) {
        software.amazon.jsii.Kernel.call(this, "putAccessControlAllowOrigins", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAccessControlExposeHeaders(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeaders value) {
        software.amazon.jsii.Kernel.call(this, "putAccessControlExposeHeaders", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccessControlExposeHeaders() {
        software.amazon.jsii.Kernel.call(this, "resetAccessControlExposeHeaders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAccessControlMaxAgeSec() {
        software.amazon.jsii.Kernel.call(this, "resetAccessControlMaxAgeSec", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeadersOutputReference getAccessControlAllowHeaders() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowHeaders", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeadersOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethodsOutputReference getAccessControlAllowMethods() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowMethods", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethodsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOriginsOutputReference getAccessControlAllowOrigins() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowOrigins", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOriginsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference getAccessControlExposeHeaders() {
        return software.amazon.jsii.Kernel.get(this, "accessControlExposeHeaders", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAccessControlAllowCredentialsInput() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowCredentialsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeaders getAccessControlAllowHeadersInput() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowHeadersInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeaders.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethods getAccessControlAllowMethodsInput() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowMethodsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethods.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOrigins getAccessControlAllowOriginsInput() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowOriginsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOrigins.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeaders getAccessControlExposeHeadersInput() {
        return software.amazon.jsii.Kernel.get(this, "accessControlExposeHeadersInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeaders.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAccessControlMaxAgeSecInput() {
        return software.amazon.jsii.Kernel.get(this, "accessControlMaxAgeSecInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOriginOverrideInput() {
        return software.amazon.jsii.Kernel.get(this, "originOverrideInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAccessControlAllowCredentials() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowCredentials", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAccessControlAllowCredentials(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "accessControlAllowCredentials", java.util.Objects.requireNonNull(value, "accessControlAllowCredentials is required"));
    }

    public void setAccessControlAllowCredentials(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "accessControlAllowCredentials", java.util.Objects.requireNonNull(value, "accessControlAllowCredentials is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAccessControlMaxAgeSec() {
        return software.amazon.jsii.Kernel.get(this, "accessControlMaxAgeSec", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAccessControlMaxAgeSec(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "accessControlMaxAgeSec", java.util.Objects.requireNonNull(value, "accessControlMaxAgeSec is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getOriginOverride() {
        return software.amazon.jsii.Kernel.get(this, "originOverride", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setOriginOverride(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "originOverride", java.util.Objects.requireNonNull(value, "originOverride is required"));
    }

    public void setOriginOverride(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "originOverride", java.util.Objects.requireNonNull(value, "originOverride is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
