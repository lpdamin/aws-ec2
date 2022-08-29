package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.032Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcPeeringConnectionOptionsAccepterOutputReference")
public class VpcPeeringConnectionOptionsAccepterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected VpcPeeringConnectionOptionsAccepterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcPeeringConnectionOptionsAccepterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public VpcPeeringConnectionOptionsAccepterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAllowClassicLinkToRemoteVpc() {
        software.amazon.jsii.Kernel.call(this, "resetAllowClassicLinkToRemoteVpc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowRemoteVpcDnsResolution() {
        software.amazon.jsii.Kernel.call(this, "resetAllowRemoteVpcDnsResolution", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowVpcToRemoteClassicLink() {
        software.amazon.jsii.Kernel.call(this, "resetAllowVpcToRemoteClassicLink", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowClassicLinkToRemoteVpcInput() {
        return software.amazon.jsii.Kernel.get(this, "allowClassicLinkToRemoteVpcInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowRemoteVpcDnsResolutionInput() {
        return software.amazon.jsii.Kernel.get(this, "allowRemoteVpcDnsResolutionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowVpcToRemoteClassicLinkInput() {
        return software.amazon.jsii.Kernel.get(this, "allowVpcToRemoteClassicLinkInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowClassicLinkToRemoteVpc() {
        return software.amazon.jsii.Kernel.get(this, "allowClassicLinkToRemoteVpc", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowClassicLinkToRemoteVpc(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowClassicLinkToRemoteVpc", java.util.Objects.requireNonNull(value, "allowClassicLinkToRemoteVpc is required"));
    }

    public void setAllowClassicLinkToRemoteVpc(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowClassicLinkToRemoteVpc", java.util.Objects.requireNonNull(value, "allowClassicLinkToRemoteVpc is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowRemoteVpcDnsResolution() {
        return software.amazon.jsii.Kernel.get(this, "allowRemoteVpcDnsResolution", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowRemoteVpcDnsResolution(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowRemoteVpcDnsResolution", java.util.Objects.requireNonNull(value, "allowRemoteVpcDnsResolution is required"));
    }

    public void setAllowRemoteVpcDnsResolution(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowRemoteVpcDnsResolution", java.util.Objects.requireNonNull(value, "allowRemoteVpcDnsResolution is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowVpcToRemoteClassicLink() {
        return software.amazon.jsii.Kernel.get(this, "allowVpcToRemoteClassicLink", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowVpcToRemoteClassicLink(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowVpcToRemoteClassicLink", java.util.Objects.requireNonNull(value, "allowVpcToRemoteClassicLink is required"));
    }

    public void setAllowVpcToRemoteClassicLink(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowVpcToRemoteClassicLink", java.util.Objects.requireNonNull(value, "allowVpcToRemoteClassicLink is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcPeeringConnectionOptionsAccepter getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionOptionsAccepter.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcPeeringConnectionOptionsAccepter value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
