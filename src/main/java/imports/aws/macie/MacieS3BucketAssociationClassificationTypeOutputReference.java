package imports.aws.macie;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.772Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.macie.MacieS3BucketAssociationClassificationTypeOutputReference")
public class MacieS3BucketAssociationClassificationTypeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MacieS3BucketAssociationClassificationTypeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MacieS3BucketAssociationClassificationTypeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MacieS3BucketAssociationClassificationTypeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetContinuous() {
        software.amazon.jsii.Kernel.call(this, "resetContinuous", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOneTime() {
        software.amazon.jsii.Kernel.call(this, "resetOneTime", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContinuousInput() {
        return software.amazon.jsii.Kernel.get(this, "continuousInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOneTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "oneTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContinuous() {
        return software.amazon.jsii.Kernel.get(this, "continuous", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContinuous(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "continuous", java.util.Objects.requireNonNull(value, "continuous is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOneTime() {
        return software.amazon.jsii.Kernel.get(this, "oneTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOneTime(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "oneTime", java.util.Objects.requireNonNull(value, "oneTime is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie.MacieS3BucketAssociationClassificationType getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.macie.MacieS3BucketAssociationClassificationType.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.macie.MacieS3BucketAssociationClassificationType value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
