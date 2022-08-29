package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.834Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationOutputReference")
public class TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEfsFileLocation(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationEfsFileLocation value) {
        software.amazon.jsii.Kernel.call(this, "putEfsFileLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3FileLocation(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationS3FileLocation value) {
        software.amazon.jsii.Kernel.call(this, "putS3FileLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEfsFileLocation() {
        software.amazon.jsii.Kernel.call(this, "resetEfsFileLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3FileLocation() {
        software.amazon.jsii.Kernel.call(this, "resetS3FileLocation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationEfsFileLocationOutputReference getEfsFileLocation() {
        return software.amazon.jsii.Kernel.get(this, "efsFileLocation", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationEfsFileLocationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationS3FileLocationOutputReference getS3FileLocation() {
        return software.amazon.jsii.Kernel.get(this, "s3FileLocation", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationS3FileLocationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationEfsFileLocation getEfsFileLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "efsFileLocationInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationEfsFileLocation.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationS3FileLocation getS3FileLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "s3FileLocationInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocationS3FileLocation.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocation getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocation.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsDestinationFileLocation value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
