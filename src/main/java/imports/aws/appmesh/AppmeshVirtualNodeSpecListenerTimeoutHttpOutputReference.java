package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.688Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpOutputReference")
public class AppmeshVirtualNodeSpecListenerTimeoutHttpOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecListenerTimeoutHttpOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecListenerTimeoutHttpOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecListenerTimeoutHttpOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putIdle(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpIdle value) {
        software.amazon.jsii.Kernel.call(this, "putIdle", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPerRequest(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpPerRequest value) {
        software.amazon.jsii.Kernel.call(this, "putPerRequest", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetIdle() {
        software.amazon.jsii.Kernel.call(this, "resetIdle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerRequest() {
        software.amazon.jsii.Kernel.call(this, "resetPerRequest", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpIdleOutputReference getIdle() {
        return software.amazon.jsii.Kernel.get(this, "idle", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpIdleOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpPerRequestOutputReference getPerRequest() {
        return software.amazon.jsii.Kernel.get(this, "perRequest", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpPerRequestOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpIdle getIdleInput() {
        return software.amazon.jsii.Kernel.get(this, "idleInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpIdle.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpPerRequest getPerRequestInput() {
        return software.amazon.jsii.Kernel.get(this, "perRequestInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttpPerRequest.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTimeoutHttp value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
