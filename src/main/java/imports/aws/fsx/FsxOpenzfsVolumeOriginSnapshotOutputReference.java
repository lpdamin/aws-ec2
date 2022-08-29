package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.208Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxOpenzfsVolumeOriginSnapshotOutputReference")
public class FsxOpenzfsVolumeOriginSnapshotOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected FsxOpenzfsVolumeOriginSnapshotOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FsxOpenzfsVolumeOriginSnapshotOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public FsxOpenzfsVolumeOriginSnapshotOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCopyStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "copyStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotArnInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCopyStrategy() {
        return software.amazon.jsii.Kernel.get(this, "copyStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCopyStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "copyStrategy", java.util.Objects.requireNonNull(value, "copyStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotArn() {
        return software.amazon.jsii.Kernel.get(this, "snapshotArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotArn", java.util.Objects.requireNonNull(value, "snapshotArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOpenzfsVolumeOriginSnapshot getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxOpenzfsVolumeOriginSnapshot.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxOpenzfsVolumeOriginSnapshot value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
