package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.630Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutOutputReference")
public class AppmeshRouteSpecGrpcRouteTimeoutOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshRouteSpecGrpcRouteTimeoutOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshRouteSpecGrpcRouteTimeoutOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshRouteSpecGrpcRouteTimeoutOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putIdle(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutIdle value) {
        software.amazon.jsii.Kernel.call(this, "putIdle", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPerRequest(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutPerRequest value) {
        software.amazon.jsii.Kernel.call(this, "putPerRequest", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetIdle() {
        software.amazon.jsii.Kernel.call(this, "resetIdle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerRequest() {
        software.amazon.jsii.Kernel.call(this, "resetPerRequest", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutIdleOutputReference getIdle() {
        return software.amazon.jsii.Kernel.get(this, "idle", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutIdleOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutPerRequestOutputReference getPerRequest() {
        return software.amazon.jsii.Kernel.get(this, "perRequest", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutPerRequestOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutIdle getIdleInput() {
        return software.amazon.jsii.Kernel.get(this, "idleInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutIdle.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutPerRequest getPerRequestInput() {
        return software.amazon.jsii.Kernel.get(this, "perRequestInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeoutPerRequest.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeout getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeout.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpecGrpcRouteTimeout value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
