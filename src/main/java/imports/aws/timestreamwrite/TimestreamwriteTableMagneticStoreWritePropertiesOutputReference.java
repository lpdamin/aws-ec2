package imports.aws.timestreamwrite;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.817Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesOutputReference")
public class TimestreamwriteTableMagneticStoreWritePropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TimestreamwriteTableMagneticStoreWritePropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TimestreamwriteTableMagneticStoreWritePropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TimestreamwriteTableMagneticStoreWritePropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMagneticStoreRejectedDataLocation(final @org.jetbrains.annotations.NotNull imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation value) {
        software.amazon.jsii.Kernel.call(this, "putMagneticStoreRejectedDataLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEnableMagneticStoreWrites() {
        software.amazon.jsii.Kernel.call(this, "resetEnableMagneticStoreWrites", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMagneticStoreRejectedDataLocation() {
        software.amazon.jsii.Kernel.call(this, "resetMagneticStoreRejectedDataLocation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference getMagneticStoreRejectedDataLocation() {
        return software.amazon.jsii.Kernel.get(this, "magneticStoreRejectedDataLocation", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableMagneticStoreWritesInput() {
        return software.amazon.jsii.Kernel.get(this, "enableMagneticStoreWritesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation getMagneticStoreRejectedDataLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "magneticStoreRejectedDataLocationInput", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableMagneticStoreWrites() {
        return software.amazon.jsii.Kernel.get(this, "enableMagneticStoreWrites", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableMagneticStoreWrites(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableMagneticStoreWrites", java.util.Objects.requireNonNull(value, "enableMagneticStoreWrites is required"));
    }

    public void setEnableMagneticStoreWrites(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableMagneticStoreWrites", java.util.Objects.requireNonNull(value, "enableMagneticStoreWrites is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWriteProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWriteProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWriteProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
