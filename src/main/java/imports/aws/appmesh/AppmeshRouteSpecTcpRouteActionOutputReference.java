package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.642Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecTcpRouteActionOutputReference")
public class AppmeshRouteSpecTcpRouteActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshRouteSpecTcpRouteActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshRouteSpecTcpRouteActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshRouteSpecTcpRouteActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putWeightedTarget(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putWeightedTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecTcpRouteActionWeightedTargetList getWeightedTarget() {
        return software.amazon.jsii.Kernel.get(this, "weightedTarget", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRouteActionWeightedTargetList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWeightedTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "weightedTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecTcpRouteAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
