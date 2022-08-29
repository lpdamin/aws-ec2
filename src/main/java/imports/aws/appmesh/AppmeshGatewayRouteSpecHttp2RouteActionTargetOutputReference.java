package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.609Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference")
public class AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshGatewayRouteSpecHttp2RouteActionTargetOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putVirtualService(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualService value) {
        software.amazon.jsii.Kernel.call(this, "putVirtualService", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference getVirtualService() {
        return software.amazon.jsii.Kernel.get(this, "virtualService", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualServiceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualService getVirtualServiceInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualServiceInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTargetVirtualService.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTarget getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTarget.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionTarget value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
