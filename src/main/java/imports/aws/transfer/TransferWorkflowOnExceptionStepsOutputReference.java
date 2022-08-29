package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.835Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferWorkflowOnExceptionStepsOutputReference")
public class TransferWorkflowOnExceptionStepsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TransferWorkflowOnExceptionStepsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferWorkflowOnExceptionStepsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public TransferWorkflowOnExceptionStepsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putCopyStepDetails(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetails value) {
        software.amazon.jsii.Kernel.call(this, "putCopyStepDetails", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustomStepDetails(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCustomStepDetails value) {
        software.amazon.jsii.Kernel.call(this, "putCustomStepDetails", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDeleteStepDetails(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetails value) {
        software.amazon.jsii.Kernel.call(this, "putDeleteStepDetails", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTagStepDetails(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsTagStepDetails value) {
        software.amazon.jsii.Kernel.call(this, "putTagStepDetails", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCopyStepDetails() {
        software.amazon.jsii.Kernel.call(this, "resetCopyStepDetails", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomStepDetails() {
        software.amazon.jsii.Kernel.call(this, "resetCustomStepDetails", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeleteStepDetails() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteStepDetails", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagStepDetails() {
        software.amazon.jsii.Kernel.call(this, "resetTagStepDetails", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsOutputReference getCopyStepDetails() {
        return software.amazon.jsii.Kernel.get(this, "copyStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetailsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsCustomStepDetailsOutputReference getCustomStepDetails() {
        return software.amazon.jsii.Kernel.get(this, "customStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCustomStepDetailsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference getDeleteStepDetails() {
        return software.amazon.jsii.Kernel.get(this, "deleteStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferWorkflowOnExceptionStepsTagStepDetailsOutputReference getTagStepDetails() {
        return software.amazon.jsii.Kernel.get(this, "tagStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsTagStepDetailsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetails getCopyStepDetailsInput() {
        return software.amazon.jsii.Kernel.get(this, "copyStepDetailsInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCopyStepDetails.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsCustomStepDetails getCustomStepDetailsInput() {
        return software.amazon.jsii.Kernel.get(this, "customStepDetailsInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsCustomStepDetails.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetails getDeleteStepDetailsInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteStepDetailsInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetails.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsTagStepDetails getTagStepDetailsInput() {
        return software.amazon.jsii.Kernel.get(this, "tagStepDetailsInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsTagStepDetails.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionSteps value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
