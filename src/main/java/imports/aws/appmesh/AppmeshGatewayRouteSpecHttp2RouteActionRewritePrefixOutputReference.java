package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.408Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefixOutputReference")
public class AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefixOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefixOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefixOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefixOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDefaultPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValue() {
        software.amazon.jsii.Kernel.call(this, "resetValue", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValueInput() {
        return software.amazon.jsii.Kernel.get(this, "valueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultPrefix() {
        return software.amazon.jsii.Kernel.get(this, "defaultPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultPrefix", java.util.Objects.requireNonNull(value, "defaultPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "value", java.util.Objects.requireNonNull(value, "value is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefix getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefix.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttp2RouteActionRewritePrefix value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
