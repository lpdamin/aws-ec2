package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.198Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfigOutputReference")
public class CloudfrontDistributionOriginCustomOriginConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontDistributionOriginCustomOriginConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistributionOriginCustomOriginConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontDistributionOriginCustomOriginConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetOriginKeepaliveTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetOriginKeepaliveTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOriginReadTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetOriginReadTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHttpPortInput() {
        return software.amazon.jsii.Kernel.get(this, "httpPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHttpsPortInput() {
        return software.amazon.jsii.Kernel.get(this, "httpsPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getOriginKeepaliveTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "originKeepaliveTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOriginProtocolPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "originProtocolPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getOriginReadTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "originReadTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOriginSslProtocolsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "originSslProtocolsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHttpPort() {
        return software.amazon.jsii.Kernel.get(this, "httpPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHttpPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "httpPort", java.util.Objects.requireNonNull(value, "httpPort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHttpsPort() {
        return software.amazon.jsii.Kernel.get(this, "httpsPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHttpsPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "httpsPort", java.util.Objects.requireNonNull(value, "httpsPort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getOriginKeepaliveTimeout() {
        return software.amazon.jsii.Kernel.get(this, "originKeepaliveTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setOriginKeepaliveTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "originKeepaliveTimeout", java.util.Objects.requireNonNull(value, "originKeepaliveTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOriginProtocolPolicy() {
        return software.amazon.jsii.Kernel.get(this, "originProtocolPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOriginProtocolPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "originProtocolPolicy", java.util.Objects.requireNonNull(value, "originProtocolPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getOriginReadTimeout() {
        return software.amazon.jsii.Kernel.get(this, "originReadTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setOriginReadTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "originReadTimeout", java.util.Objects.requireNonNull(value, "originReadTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOriginSslProtocols() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "originSslProtocols", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOriginSslProtocols(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "originSslProtocols", java.util.Objects.requireNonNull(value, "originSslProtocols is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
