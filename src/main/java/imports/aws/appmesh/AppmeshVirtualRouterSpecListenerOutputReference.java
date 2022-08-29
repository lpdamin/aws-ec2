package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.701Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualRouterSpecListenerOutputReference")
public class AppmeshVirtualRouterSpecListenerOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualRouterSpecListenerOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualRouterSpecListenerOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualRouterSpecListenerOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPortMapping(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping value) {
        software.amazon.jsii.Kernel.call(this, "putPortMapping", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMappingOutputReference getPortMapping() {
        return software.amazon.jsii.Kernel.get(this, "portMapping", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMappingOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping getPortMappingInput() {
        return software.amazon.jsii.Kernel.get(this, "portMappingInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualRouterSpecListenerPortMapping.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualRouterSpecListener getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualRouterSpecListener.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualRouterSpecListener value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
