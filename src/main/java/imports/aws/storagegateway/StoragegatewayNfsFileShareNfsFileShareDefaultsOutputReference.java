package imports.aws.storagegateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.805Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.StoragegatewayNfsFileShareNfsFileShareDefaultsOutputReference")
public class StoragegatewayNfsFileShareNfsFileShareDefaultsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected StoragegatewayNfsFileShareNfsFileShareDefaultsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewayNfsFileShareNfsFileShareDefaultsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public StoragegatewayNfsFileShareNfsFileShareDefaultsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDirectoryMode() {
        software.amazon.jsii.Kernel.call(this, "resetDirectoryMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFileMode() {
        software.amazon.jsii.Kernel.call(this, "resetFileMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGroupId() {
        software.amazon.jsii.Kernel.call(this, "resetGroupId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDirectoryModeInput() {
        return software.amazon.jsii.Kernel.get(this, "directoryModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFileModeInput() {
        return software.amazon.jsii.Kernel.get(this, "fileModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGroupIdInput() {
        return software.amazon.jsii.Kernel.get(this, "groupIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryMode() {
        return software.amazon.jsii.Kernel.get(this, "directoryMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDirectoryMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "directoryMode", java.util.Objects.requireNonNull(value, "directoryMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileMode() {
        return software.amazon.jsii.Kernel.get(this, "fileMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileMode", java.util.Objects.requireNonNull(value, "fileMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGroupId() {
        return software.amazon.jsii.Kernel.get(this, "groupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGroupId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "groupId", java.util.Objects.requireNonNull(value, "groupId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOwnerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ownerId", java.util.Objects.requireNonNull(value, "ownerId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.storagegateway.StoragegatewayNfsFileShareNfsFileShareDefaults getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.storagegateway.StoragegatewayNfsFileShareNfsFileShareDefaults.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.storagegateway.StoragegatewayNfsFileShareNfsFileShareDefaults value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
