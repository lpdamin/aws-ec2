package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.685Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2OutputReference")
public class AppmeshVirtualNodeSpecListenerConnectionPoolHttp2OutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecListenerConnectionPoolHttp2OutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecListenerConnectionPoolHttp2OutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecListenerConnectionPoolHttp2OutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRequestsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxRequestsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxRequests() {
        return software.amazon.jsii.Kernel.get(this, "maxRequests", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxRequests(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxRequests", java.util.Objects.requireNonNull(value, "maxRequests is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
