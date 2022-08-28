package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.174Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersS3OutputReference")
public class QuicksightDataSourceParametersS3OutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceParametersS3OutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceParametersS3OutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceParametersS3OutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putManifestFileLocation(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersS3ManifestFileLocation value) {
        software.amazon.jsii.Kernel.call(this, "putManifestFileLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersS3ManifestFileLocationOutputReference getManifestFileLocation() {
        return software.amazon.jsii.Kernel.get(this, "manifestFileLocation", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersS3ManifestFileLocationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersS3ManifestFileLocation getManifestFileLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "manifestFileLocationInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersS3ManifestFileLocation.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersS3 getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersS3.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersS3 value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
