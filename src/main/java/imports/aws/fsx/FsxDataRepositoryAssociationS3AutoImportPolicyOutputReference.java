package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.185Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxDataRepositoryAssociationS3AutoImportPolicyOutputReference")
public class FsxDataRepositoryAssociationS3AutoImportPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected FsxDataRepositoryAssociationS3AutoImportPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FsxDataRepositoryAssociationS3AutoImportPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public FsxDataRepositoryAssociationS3AutoImportPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetEvents() {
        software.amazon.jsii.Kernel.call(this, "resetEvents", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEventsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "eventsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEvents() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "events", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setEvents(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "events", java.util.Objects.requireNonNull(value, "events is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxDataRepositoryAssociationS3AutoImportPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxDataRepositoryAssociationS3AutoImportPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxDataRepositoryAssociationS3AutoImportPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
