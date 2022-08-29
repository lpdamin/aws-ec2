package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.951Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookiesOutputReference")
public class CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetWhitelistedNames() {
        software.amazon.jsii.Kernel.call(this, "resetWhitelistedNames", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getForwardInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getWhitelistedNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "whitelistedNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getForward() {
        return software.amazon.jsii.Kernel.get(this, "forward", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setForward(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "forward", java.util.Objects.requireNonNull(value, "forward is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getWhitelistedNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "whitelistedNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setWhitelistedNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "whitelistedNames", java.util.Objects.requireNonNull(value, "whitelistedNames is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookies getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookies.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOrderedCacheBehaviorForwardedValuesCookies value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
