package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.601Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualServiceSpecProviderOutputReference")
public class AppmeshVirtualServiceSpecProviderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualServiceSpecProviderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualServiceSpecProviderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualServiceSpecProviderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putVirtualNode(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode value) {
        software.amazon.jsii.Kernel.call(this, "putVirtualNode", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVirtualRouter(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter value) {
        software.amazon.jsii.Kernel.call(this, "putVirtualRouter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetVirtualNode() {
        software.amazon.jsii.Kernel.call(this, "resetVirtualNode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVirtualRouter() {
        software.amazon.jsii.Kernel.call(this, "resetVirtualRouter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNodeOutputReference getVirtualNode() {
        return software.amazon.jsii.Kernel.get(this, "virtualNode", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNodeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouterOutputReference getVirtualRouter() {
        return software.amazon.jsii.Kernel.get(this, "virtualRouter", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouterOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode getVirtualNodeInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualNodeInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualNode.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter getVirtualRouterInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualRouterInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProviderVirtualRouter.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualServiceSpecProvider getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualServiceSpecProvider.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualServiceSpecProvider value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
