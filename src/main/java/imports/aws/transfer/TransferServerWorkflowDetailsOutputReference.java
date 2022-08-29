package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.830Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferServerWorkflowDetailsOutputReference")
public class TransferServerWorkflowDetailsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TransferServerWorkflowDetailsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TransferServerWorkflowDetailsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TransferServerWorkflowDetailsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putOnUpload(final @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferServerWorkflowDetailsOnUpload value) {
        software.amazon.jsii.Kernel.call(this, "putOnUpload", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOnUpload() {
        software.amazon.jsii.Kernel.call(this, "resetOnUpload", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.transfer.TransferServerWorkflowDetailsOnUploadOutputReference getOnUpload() {
        return software.amazon.jsii.Kernel.get(this, "onUpload", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferServerWorkflowDetailsOnUploadOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferServerWorkflowDetailsOnUpload getOnUploadInput() {
        return software.amazon.jsii.Kernel.get(this, "onUploadInput", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferServerWorkflowDetailsOnUpload.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferServerWorkflowDetails getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferServerWorkflowDetails.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferServerWorkflowDetails value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
