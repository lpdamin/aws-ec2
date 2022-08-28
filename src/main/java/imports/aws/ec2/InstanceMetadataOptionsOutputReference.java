package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.164Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.InstanceMetadataOptionsOutputReference")
public class InstanceMetadataOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected InstanceMetadataOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected InstanceMetadataOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public InstanceMetadataOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetHttpEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetHttpEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpPutResponseHopLimit() {
        software.amazon.jsii.Kernel.call(this, "resetHttpPutResponseHopLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpTokens() {
        software.amazon.jsii.Kernel.call(this, "resetHttpTokens", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceMetadataTags() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceMetadataTags", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "httpEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHttpPutResponseHopLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "httpPutResponseHopLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpTokensInput() {
        return software.amazon.jsii.Kernel.get(this, "httpTokensInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceMetadataTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceMetadataTagsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "httpEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpEndpoint", java.util.Objects.requireNonNull(value, "httpEndpoint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHttpPutResponseHopLimit() {
        return software.amazon.jsii.Kernel.get(this, "httpPutResponseHopLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHttpPutResponseHopLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "httpPutResponseHopLimit", java.util.Objects.requireNonNull(value, "httpPutResponseHopLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpTokens() {
        return software.amazon.jsii.Kernel.get(this, "httpTokens", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpTokens(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpTokens", java.util.Objects.requireNonNull(value, "httpTokens is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceMetadataTags() {
        return software.amazon.jsii.Kernel.get(this, "instanceMetadataTags", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceMetadataTags(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceMetadataTags", java.util.Objects.requireNonNull(value, "instanceMetadataTags is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.InstanceMetadataOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.InstanceMetadataOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.InstanceMetadataOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
