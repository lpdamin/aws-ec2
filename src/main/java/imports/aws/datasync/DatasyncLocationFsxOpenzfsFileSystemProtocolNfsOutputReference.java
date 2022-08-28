package imports.aws.datasync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:58.111Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference")
public class DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMountOptions(final @org.jetbrains.annotations.NotNull imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions value) {
        software.amazon.jsii.Kernel.call(this, "putMountOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptionsOutputReference getMountOptions() {
        return software.amazon.jsii.Kernel.get(this, "mountOptions", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions getMountOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "mountOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfs getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfs.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfs value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
