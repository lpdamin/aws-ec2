package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.653Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolOutputReference")
public class AppmeshVirtualGatewaySpecListenerConnectionPoolOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualGatewaySpecListenerConnectionPoolOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualGatewaySpecListenerConnectionPoolOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualGatewaySpecListenerConnectionPoolOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putGrpc(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc value) {
        software.amazon.jsii.Kernel.call(this, "putGrpc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttp(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp value) {
        software.amazon.jsii.Kernel.call(this, "putHttp", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttp2(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp2 value) {
        software.amazon.jsii.Kernel.call(this, "putHttp2", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGrpc() {
        software.amazon.jsii.Kernel.call(this, "resetGrpc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttp() {
        software.amazon.jsii.Kernel.call(this, "resetHttp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttp2() {
        software.amazon.jsii.Kernel.call(this, "resetHttp2", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpcOutputReference getGrpc() {
        return software.amazon.jsii.Kernel.get(this, "grpc", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference getHttp() {
        return software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttpOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp2OutputReference getHttp2() {
        return software.amazon.jsii.Kernel.get(this, "http2", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp2OutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc getGrpcInput() {
        return software.amazon.jsii.Kernel.get(this, "grpcInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolGrpc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp2 getHttp2Input() {
        return software.amazon.jsii.Kernel.get(this, "http2Input", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp2.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp getHttpInput() {
        return software.amazon.jsii.Kernel.get(this, "httpInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPoolHttp.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPool getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPool.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecListenerConnectionPool value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
