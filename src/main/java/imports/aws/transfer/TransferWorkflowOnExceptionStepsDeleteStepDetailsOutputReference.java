package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.835Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference")
public class TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TransferWorkflowOnExceptionStepsDeleteStepDetailsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceFileLocation() {
        software.amazon.jsii.Kernel.call(this, "resetSourceFileLocation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceFileLocation() {
        return software.amazon.jsii.Kernel.get(this, "sourceFileLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSourceFileLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sourceFileLocation", java.util.Objects.requireNonNull(value, "sourceFileLocation is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetails getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetails.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowOnExceptionStepsDeleteStepDetails value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
