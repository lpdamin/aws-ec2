package imports.aws.efs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.445Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.efs.EfsReplicationConfigurationDestinationOutputReference")
public class EfsReplicationConfigurationDestinationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EfsReplicationConfigurationDestinationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EfsReplicationConfigurationDestinationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EfsReplicationConfigurationDestinationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAvailabilityZoneName() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZoneName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileSystemId() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneNameInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZoneName() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZoneName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZoneName", java.util.Objects.requireNonNull(value, "availabilityZoneName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.efs.EfsReplicationConfigurationDestination getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.efs.EfsReplicationConfigurationDestination.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.efs.EfsReplicationConfigurationDestination value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
