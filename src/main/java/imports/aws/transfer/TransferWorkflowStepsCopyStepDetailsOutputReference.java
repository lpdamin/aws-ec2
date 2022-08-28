package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.841Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferWorkflowStepsCopyStepDetailsOutputReference")
public class TransferWorkflowStepsCopyStepDetailsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TransferWorkflowStepsCopyStepDetailsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferWorkflowStepsCopyStepDetailsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TransferWorkflowStepsCopyStepDetailsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDestinationFileLocation(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowStepsCopyStepDetailsDestinationFileLocation value) {
        software.amazon.jsii.Kernel.call(this, "putDestinationFileLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDestinationFileLocation() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationFileLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOverwriteExisting() {
        software.amazon.jsii.Kernel.call(this, "resetOverwriteExisting", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceFileLocation() {
        software.amazon.jsii.Kernel.call(this, "resetSourceFileLocation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowStepsCopyStepDetailsDestinationFileLocationOutputReference getDestinationFileLocation() {
        return software.amazon.jsii.Kernel.get(this, "destinationFileLocation", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsCopyStepDetailsDestinationFileLocationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsCopyStepDetailsDestinationFileLocation getDestinationFileLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationFileLocationInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsCopyStepDetailsDestinationFileLocation.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOverwriteExistingInput() {
        return software.amazon.jsii.Kernel.get(this, "overwriteExistingInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSourceFileLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceFileLocationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOverwriteExisting() {
        return software.amazon.jsii.Kernel.get(this, "overwriteExisting", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOverwriteExisting(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "overwriteExisting", java.util.Objects.requireNonNull(value, "overwriteExisting is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceFileLocation() {
        return software.amazon.jsii.Kernel.get(this, "sourceFileLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceFileLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceFileLocation", java.util.Objects.requireNonNull(value, "sourceFileLocation is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsCopyStepDetails getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsCopyStepDetails.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsCopyStepDetails value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
