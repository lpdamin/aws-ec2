package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.470Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3ControlMultiRegionAccessPointDetailsOutputReference")
public class S3ControlMultiRegionAccessPointDetailsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3ControlMultiRegionAccessPointDetailsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3ControlMultiRegionAccessPointDetailsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3ControlMultiRegionAccessPointDetailsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putPublicAccessBlock(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlock value) {
        software.amazon.jsii.Kernel.call(this, "putPublicAccessBlock", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRegion(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRegion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPublicAccessBlock() {
        software.amazon.jsii.Kernel.call(this, "resetPublicAccessBlock", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlockOutputReference getPublicAccessBlock() {
        return software.amazon.jsii.Kernel.get(this, "publicAccessBlock", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlockOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3ControlMultiRegionAccessPointDetailsRegionList getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlMultiRegionAccessPointDetailsRegionList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlock getPublicAccessBlockInput() {
        return software.amazon.jsii.Kernel.get(this, "publicAccessBlockInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlock.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3ControlMultiRegionAccessPointDetails getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlMultiRegionAccessPointDetails.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3ControlMultiRegionAccessPointDetails value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
