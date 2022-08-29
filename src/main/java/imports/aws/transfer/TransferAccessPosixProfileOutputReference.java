package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.819Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferAccessPosixProfileOutputReference")
public class TransferAccessPosixProfileOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TransferAccessPosixProfileOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferAccessPosixProfileOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TransferAccessPosixProfileOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSecondaryGids() {
        software.amazon.jsii.Kernel.call(this, "resetSecondaryGids", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getGidInput() {
        return software.amazon.jsii.Kernel.get(this, "gidInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getSecondaryGidsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Number>)(software.amazon.jsii.Kernel.get(this, "secondaryGidsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getUidInput() {
        return software.amazon.jsii.Kernel.get(this, "uidInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getGid() {
        return software.amazon.jsii.Kernel.get(this, "gid", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setGid(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "gid", java.util.Objects.requireNonNull(value, "gid is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getSecondaryGids() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "secondaryGids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public void setSecondaryGids(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> value) {
        software.amazon.jsii.Kernel.set(this, "secondaryGids", java.util.Objects.requireNonNull(value, "secondaryGids is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getUid() {
        return software.amazon.jsii.Kernel.get(this, "uid", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setUid(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "uid", java.util.Objects.requireNonNull(value, "uid is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferAccessPosixProfile getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferAccessPosixProfile.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferAccessPosixProfile value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
