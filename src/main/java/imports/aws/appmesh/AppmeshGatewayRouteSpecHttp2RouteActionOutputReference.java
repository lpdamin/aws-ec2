package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.608Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionOutputReference")
public class AppmeshGatewayRouteSpecHttp2RouteActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshGatewayRouteSpecHttp2RouteActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshGatewayRouteSpecHttp2RouteActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshGatewayRouteSpecHttp2RouteActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRewrite(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewrite value) {
        software.amazon.jsii.Kernel.call(this, "putRewrite", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTarget(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTarget value) {
        software.amazon.jsii.Kernel.call(this, "putTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRewrite() {
        software.amazon.jsii.Kernel.call(this, "resetRewrite", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewriteOutputReference getRewrite() {
        return software.amazon.jsii.Kernel.get(this, "rewrite", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewriteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference getTarget() {
        return software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewrite getRewriteInput() {
        return software.amazon.jsii.Kernel.get(this, "rewriteInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewrite.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTarget getTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "targetInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTarget.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
