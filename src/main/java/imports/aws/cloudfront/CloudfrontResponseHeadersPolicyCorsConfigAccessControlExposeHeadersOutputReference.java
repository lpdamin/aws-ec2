package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.999Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference")
public class CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeadersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetItems() {
        software.amazon.jsii.Kernel.call(this, "resetItems", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getItemsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "itemsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getItems() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setItems(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "items", java.util.Objects.requireNonNull(value, "items is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeaders getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeaders.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigAccessControlExposeHeaders value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
