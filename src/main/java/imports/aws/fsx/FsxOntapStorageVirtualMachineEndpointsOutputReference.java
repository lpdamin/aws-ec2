package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.195Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxOntapStorageVirtualMachineEndpointsOutputReference")
public class FsxOntapStorageVirtualMachineEndpointsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected FsxOntapStorageVirtualMachineEndpointsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FsxOntapStorageVirtualMachineEndpointsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public FsxOntapStorageVirtualMachineEndpointsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsIscsiList getIscsi() {
        return software.amazon.jsii.Kernel.get(this, "iscsi", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsIscsiList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsManagementList getManagement() {
        return software.amazon.jsii.Kernel.get(this, "management", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsManagementList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsNfsList getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsNfsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsSmbList getSmb() {
        return software.amazon.jsii.Kernel.get(this, "smb", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineEndpointsSmbList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOntapStorageVirtualMachineEndpoints getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineEndpoints.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOntapStorageVirtualMachineEndpoints value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
