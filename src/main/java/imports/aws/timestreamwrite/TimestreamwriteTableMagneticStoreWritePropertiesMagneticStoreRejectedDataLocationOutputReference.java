package imports.aws.timestreamwrite;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.816Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference")
public class TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putS3Configuration(final @org.jetbrains.annotations.NotNull imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration value) {
        software.amazon.jsii.Kernel.call(this, "putS3Configuration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetS3Configuration() {
        software.amazon.jsii.Kernel.call(this, "resetS3Configuration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationOutputReference getS3Configuration() {
        return software.amazon.jsii.Kernel.get(this, "s3Configuration", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration getS3ConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "s3ConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
