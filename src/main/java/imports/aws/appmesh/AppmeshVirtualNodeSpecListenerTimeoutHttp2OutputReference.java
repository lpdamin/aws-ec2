package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.587Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2OutputReference")
public class AppmeshVirtualNodeSpecListenerTimeoutHttp2OutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecListenerTimeoutHttp2OutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecListenerTimeoutHttp2OutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecListenerTimeoutHttp2OutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putIdle(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2Idle value) {
        software.amazon.jsii.Kernel.call(this, "putIdle", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPerRequest(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2PerRequest value) {
        software.amazon.jsii.Kernel.call(this, "putPerRequest", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetIdle() {
        software.amazon.jsii.Kernel.call(this, "resetIdle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerRequest() {
        software.amazon.jsii.Kernel.call(this, "resetPerRequest", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2IdleOutputReference getIdle() {
        return software.amazon.jsii.Kernel.get(this, "idle", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2IdleOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2PerRequestOutputReference getPerRequest() {
        return software.amazon.jsii.Kernel.get(this, "perRequest", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2PerRequestOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2Idle getIdleInput() {
        return software.amazon.jsii.Kernel.get(this, "idleInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2Idle.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2PerRequest getPerRequestInput() {
        return software.amazon.jsii.Kernel.get(this, "perRequestInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2PerRequest.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2 getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp2 value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
