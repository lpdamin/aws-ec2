package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.640Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyOutputReference")
public class AppmeshRouteSpecHttpRouteRetryPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshRouteSpecHttpRouteRetryPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshRouteSpecHttpRouteRetryPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshRouteSpecHttpRouteRetryPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPerRetryTimeout(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout value) {
        software.amazon.jsii.Kernel.call(this, "putPerRetryTimeout", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetHttpRetryEvents() {
        software.amazon.jsii.Kernel.call(this, "resetHttpRetryEvents", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTcpRetryEvents() {
        software.amazon.jsii.Kernel.call(this, "resetTcpRetryEvents", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeoutOutputReference getPerRetryTimeout() {
        return software.amazon.jsii.Kernel.get(this, "perRetryTimeout", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeoutOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHttpRetryEventsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "httpRetryEventsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetriesInput() {
        return software.amazon.jsii.Kernel.get(this, "maxRetriesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout getPerRetryTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "perRetryTimeoutInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTcpRetryEventsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tcpRetryEventsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getHttpRetryEvents() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "httpRetryEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setHttpRetryEvents(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "httpRetryEvents", java.util.Objects.requireNonNull(value, "httpRetryEvents is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxRetries() {
        return software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxRetries(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxRetries", java.util.Objects.requireNonNull(value, "maxRetries is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTcpRetryEvents() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "tcpRetryEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTcpRetryEvents(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tcpRetryEvents", java.util.Objects.requireNonNull(value, "tcpRetryEvents is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
