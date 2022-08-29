package imports.aws.datasync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.349Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolOutputReference")
public class DatasyncLocationFsxOpenzfsFileSystemProtocolOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DatasyncLocationFsxOpenzfsFileSystemProtocolOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DatasyncLocationFsxOpenzfsFileSystemProtocolOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DatasyncLocationFsxOpenzfsFileSystemProtocolOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putNfs(final @org.jetbrains.annotations.NotNull imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfs value) {
        software.amazon.jsii.Kernel.call(this, "putNfs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference getNfs() {
        return software.amazon.jsii.Kernel.get(this, "nfs", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfs getNfsInput() {
        return software.amazon.jsii.Kernel.get(this, "nfsInput", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocol getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocol.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocol value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
