package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.315Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigOutputReference")
public class DataAwsCloudfrontResponseHeadersPolicyCorsConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsCloudfrontResponseHeadersPolicyCorsConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsCloudfrontResponseHeadersPolicyCorsConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsCloudfrontResponseHeadersPolicyCorsConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAccessControlAllowCredentials() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowCredentials", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeadersList getAccessControlAllowHeaders() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowHeaders", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowHeadersList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethodsList getAccessControlAllowMethods() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowMethods", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowMethodsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOriginsList getAccessControlAllowOrigins() {
        return software.amazon.jsii.Kernel.get(this, "accessControlAllowOrigins", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlAllowOriginsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersList getAccessControlExposeHeaders() {
        return software.amazon.jsii.Kernel.get(this, "accessControlExposeHeaders", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAccessControlMaxAgeSec() {
        return software.amazon.jsii.Kernel.get(this, "accessControlMaxAgeSec", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getOriginOverride() {
        return software.amazon.jsii.Kernel.get(this, "originOverride", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.DataAwsCloudfrontResponseHeadersPolicyCorsConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
