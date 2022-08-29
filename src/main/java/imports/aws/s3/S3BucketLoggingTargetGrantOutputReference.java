package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.425Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketLoggingTargetGrantOutputReference")
public class S3BucketLoggingTargetGrantOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketLoggingTargetGrantOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketLoggingTargetGrantOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public S3BucketLoggingTargetGrantOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putGrantee(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLoggingTargetGrantGrantee value) {
        software.amazon.jsii.Kernel.call(this, "putGrantee", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketLoggingTargetGrantGranteeOutputReference getGrantee() {
        return software.amazon.jsii.Kernel.get(this, "grantee", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLoggingTargetGrantGranteeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLoggingTargetGrantGrantee getGranteeInput() {
        return software.amazon.jsii.Kernel.get(this, "granteeInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketLoggingTargetGrantGrantee.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPermissionInput() {
        return software.amazon.jsii.Kernel.get(this, "permissionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPermission() {
        return software.amazon.jsii.Kernel.get(this, "permission", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPermission(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "permission", java.util.Objects.requireNonNull(value, "permission is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketLoggingTargetGrant value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
