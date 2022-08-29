package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.402Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketAclAccessControlPolicyOutputReference")
public class S3BucketAclAccessControlPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketAclAccessControlPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketAclAccessControlPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketAclAccessControlPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putGrant(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putGrant", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOwner(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketAclAccessControlPolicyOwner value) {
        software.amazon.jsii.Kernel.call(this, "putOwner", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGrant() {
        software.amazon.jsii.Kernel.call(this, "resetGrant", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketAclAccessControlPolicyGrantList getGrant() {
        return software.amazon.jsii.Kernel.get(this, "grant", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAclAccessControlPolicyGrantList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketAclAccessControlPolicyOwnerOutputReference getOwner() {
        return software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAclAccessControlPolicyOwnerOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGrantInput() {
        return software.amazon.jsii.Kernel.get(this, "grantInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketAclAccessControlPolicyOwner getOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "ownerInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAclAccessControlPolicyOwner.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketAclAccessControlPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAclAccessControlPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketAclAccessControlPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
