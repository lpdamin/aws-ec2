package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.414Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLifecycleRuleExpirationOutputReference")
public class S3BucketLifecycleRuleExpirationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketLifecycleRuleExpirationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLifecycleRuleExpirationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketLifecycleRuleExpirationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDate() {
        software.amazon.jsii.Kernel.call(this, "resetDate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDays() {
        software.amazon.jsii.Kernel.call(this, "resetDays", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExpiredObjectDeleteMarker() {
        software.amazon.jsii.Kernel.call(this, "resetExpiredObjectDeleteMarker", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDateInput() {
        return software.amazon.jsii.Kernel.get(this, "dateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "daysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getExpiredObjectDeleteMarkerInput() {
        return software.amazon.jsii.Kernel.get(this, "expiredObjectDeleteMarkerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDate() {
        return software.amazon.jsii.Kernel.get(this, "date", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "date", java.util.Objects.requireNonNull(value, "date is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDays() {
        return software.amazon.jsii.Kernel.get(this, "days", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "days", java.util.Objects.requireNonNull(value, "days is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getExpiredObjectDeleteMarker() {
        return software.amazon.jsii.Kernel.get(this, "expiredObjectDeleteMarker", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setExpiredObjectDeleteMarker(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "expiredObjectDeleteMarker", java.util.Objects.requireNonNull(value, "expiredObjectDeleteMarker is required"));
    }

    public void setExpiredObjectDeleteMarker(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "expiredObjectDeleteMarker", java.util.Objects.requireNonNull(value, "expiredObjectDeleteMarker is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleRuleExpiration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLifecycleRuleExpiration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLifecycleRuleExpiration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
