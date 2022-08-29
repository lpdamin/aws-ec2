package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.641Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecOutputReference")
public class AppmeshRouteSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshRouteSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshRouteSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshRouteSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putGrpcRoute(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecGrpcRoute value) {
        software.amazon.jsii.Kernel.call(this, "putGrpcRoute", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttp2Route(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttp2Route value) {
        software.amazon.jsii.Kernel.call(this, "putHttp2Route", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpRoute(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttpRoute value) {
        software.amazon.jsii.Kernel.call(this, "putHttpRoute", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTcpRoute(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecTcpRoute value) {
        software.amazon.jsii.Kernel.call(this, "putTcpRoute", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGrpcRoute() {
        software.amazon.jsii.Kernel.call(this, "resetGrpcRoute", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttp2Route() {
        software.amazon.jsii.Kernel.call(this, "resetHttp2Route", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpRoute() {
        software.amazon.jsii.Kernel.call(this, "resetHttpRoute", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPriority() {
        software.amazon.jsii.Kernel.call(this, "resetPriority", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTcpRoute() {
        software.amazon.jsii.Kernel.call(this, "resetTcpRoute", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecGrpcRouteOutputReference getGrpcRoute() {
        return software.amazon.jsii.Kernel.get(this, "grpcRoute", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRouteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttp2RouteOutputReference getHttp2Route() {
        return software.amazon.jsii.Kernel.get(this, "http2Route", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttp2RouteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttpRouteOutputReference getHttpRoute() {
        return software.amazon.jsii.Kernel.get(this, "httpRoute", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttpRouteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecTcpRouteOutputReference getTcpRoute() {
        return software.amazon.jsii.Kernel.get(this, "tcpRoute", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRouteOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecGrpcRoute getGrpcRouteInput() {
        return software.amazon.jsii.Kernel.get(this, "grpcRouteInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRoute.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecHttp2Route getHttp2RouteInput() {
        return software.amazon.jsii.Kernel.get(this, "http2RouteInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttp2Route.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecHttpRoute getHttpRouteInput() {
        return software.amazon.jsii.Kernel.get(this, "httpRouteInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttpRoute.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPriorityInput() {
        return software.amazon.jsii.Kernel.get(this, "priorityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecTcpRoute getTcpRouteInput() {
        return software.amazon.jsii.Kernel.get(this, "tcpRouteInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecTcpRoute.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPriority() {
        return software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPriority(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "priority", java.util.Objects.requireNonNull(value, "priority is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
