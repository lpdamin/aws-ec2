package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.198Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsOutputReference")
public class FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClientConfigurations(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putClientConfigurations", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fsx.FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationsList getClientConfigurations() {
        return software.amazon.jsii.Kernel.get(this, "clientConfigurations", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOpenzfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getClientConfigurationsInput() {
        return software.amazon.jsii.Kernel.get(this, "clientConfigurationsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOpenzfsFileSystemRootVolumeConfigurationNfsExports getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOpenzfsFileSystemRootVolumeConfigurationNfsExports.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOpenzfsFileSystemRootVolumeConfigurationNfsExports value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
