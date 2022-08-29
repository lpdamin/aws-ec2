package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.610Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewriteOutputReference")
public class AppmeshGatewayRouteSpecHttpRouteActionRewriteOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshGatewayRouteSpecHttpRouteActionRewriteOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshGatewayRouteSpecHttpRouteActionRewriteOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshGatewayRouteSpecHttpRouteActionRewriteOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putHostname(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewriteHostname value) {
        software.amazon.jsii.Kernel.call(this, "putHostname", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPrefix(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewritePrefix value) {
        software.amazon.jsii.Kernel.call(this, "putPrefix", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetHostname() {
        software.amazon.jsii.Kernel.call(this, "resetHostname", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewriteHostnameOutputReference getHostname() {
        return software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewriteHostnameOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewritePrefixOutputReference getPrefix() {
        return software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewritePrefixOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewriteHostname getHostnameInput() {
        return software.amazon.jsii.Kernel.get(this, "hostnameInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewriteHostname.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewritePrefix getPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewritePrefix.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshGatewayRouteSpecHttpRouteActionRewrite value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
