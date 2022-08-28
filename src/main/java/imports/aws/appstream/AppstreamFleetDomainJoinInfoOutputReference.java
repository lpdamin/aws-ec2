package imports.aws.appstream;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.666Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamFleetDomainJoinInfoOutputReference")
public class AppstreamFleetDomainJoinInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppstreamFleetDomainJoinInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppstreamFleetDomainJoinInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppstreamFleetDomainJoinInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDirectoryName() {
        software.amazon.jsii.Kernel.call(this, "resetDirectoryName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrganizationalUnitDistinguishedName() {
        software.amazon.jsii.Kernel.call(this, "resetOrganizationalUnitDistinguishedName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDirectoryNameInput() {
        return software.amazon.jsii.Kernel.get(this, "directoryNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOrganizationalUnitDistinguishedNameInput() {
        return software.amazon.jsii.Kernel.get(this, "organizationalUnitDistinguishedNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryName() {
        return software.amazon.jsii.Kernel.get(this, "directoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDirectoryName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "directoryName", java.util.Objects.requireNonNull(value, "directoryName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOrganizationalUnitDistinguishedName() {
        return software.amazon.jsii.Kernel.get(this, "organizationalUnitDistinguishedName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOrganizationalUnitDistinguishedName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "organizationalUnitDistinguishedName", java.util.Objects.requireNonNull(value, "organizationalUnitDistinguishedName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamFleetDomainJoinInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamFleetDomainJoinInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamFleetDomainJoinInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
