package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.191Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfigurationOutputReference")
public class FsxOntapStorageVirtualMachineActiveDirectoryConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected FsxOntapStorageVirtualMachineActiveDirectoryConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FsxOntapStorageVirtualMachineActiveDirectoryConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public FsxOntapStorageVirtualMachineActiveDirectoryConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSelfManagedActiveDirectoryConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putSelfManagedActiveDirectoryConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetNetbiosName() {
        software.amazon.jsii.Kernel.call(this, "resetNetbiosName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelfManagedActiveDirectoryConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSelfManagedActiveDirectoryConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationOutputReference getSelfManagedActiveDirectoryConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "selfManagedActiveDirectoryConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNetbiosNameInput() {
        return software.amazon.jsii.Kernel.get(this, "netbiosNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration getSelfManagedActiveDirectoryConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "selfManagedActiveDirectoryConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetbiosName() {
        return software.amazon.jsii.Kernel.get(this, "netbiosName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNetbiosName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "netbiosName", java.util.Objects.requireNonNull(value, "netbiosName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOntapStorageVirtualMachineActiveDirectoryConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
