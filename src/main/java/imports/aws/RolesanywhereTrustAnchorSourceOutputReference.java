package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.386Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.RolesanywhereTrustAnchorSourceOutputReference")
public class RolesanywhereTrustAnchorSourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RolesanywhereTrustAnchorSourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RolesanywhereTrustAnchorSourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RolesanywhereTrustAnchorSourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSourceData(final @org.jetbrains.annotations.NotNull imports.aws.RolesanywhereTrustAnchorSourceSourceData value) {
        software.amazon.jsii.Kernel.call(this, "putSourceData", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.RolesanywhereTrustAnchorSourceSourceDataOutputReference getSourceData() {
        return software.amazon.jsii.Kernel.get(this, "sourceData", software.amazon.jsii.NativeType.forClass(imports.aws.RolesanywhereTrustAnchorSourceSourceDataOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.RolesanywhereTrustAnchorSourceSourceData getSourceDataInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceDataInput", software.amazon.jsii.NativeType.forClass(imports.aws.RolesanywhereTrustAnchorSourceSourceData.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceType() {
        return software.amazon.jsii.Kernel.get(this, "sourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceType", java.util.Objects.requireNonNull(value, "sourceType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.RolesanywhereTrustAnchorSource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.RolesanywhereTrustAnchorSource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.RolesanywhereTrustAnchorSource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
