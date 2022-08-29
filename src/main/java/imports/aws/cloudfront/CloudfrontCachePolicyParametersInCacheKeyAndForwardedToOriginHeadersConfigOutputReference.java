package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.942Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigOutputReference")
public class CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putHeaders(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders value) {
        software.amazon.jsii.Kernel.call(this, "putHeaders", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetHeaderBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetHeaderBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHeaders() {
        software.amazon.jsii.Kernel.call(this, "resetHeaders", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersOutputReference getHeaders() {
        return software.amazon.jsii.Kernel.get(this, "headers", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHeaderBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "headerBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders getHeadersInput() {
        return software.amazon.jsii.Kernel.get(this, "headersInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHeaderBehavior() {
        return software.amazon.jsii.Kernel.get(this, "headerBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHeaderBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "headerBehavior", java.util.Objects.requireNonNull(value, "headerBehavior is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
