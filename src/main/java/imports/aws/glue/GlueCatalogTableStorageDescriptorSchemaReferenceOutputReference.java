package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.312Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceOutputReference")
public class GlueCatalogTableStorageDescriptorSchemaReferenceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueCatalogTableStorageDescriptorSchemaReferenceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCatalogTableStorageDescriptorSchemaReferenceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueCatalogTableStorageDescriptorSchemaReferenceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSchemaId(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaId value) {
        software.amazon.jsii.Kernel.call(this, "putSchemaId", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSchemaId() {
        software.amazon.jsii.Kernel.call(this, "resetSchemaId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchemaVersionId() {
        software.amazon.jsii.Kernel.call(this, "resetSchemaVersionId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference getSchemaId() {
        return software.amazon.jsii.Kernel.get(this, "schemaId", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaId getSchemaIdInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaIdInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaId.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemaVersionIdInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaVersionIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSchemaVersionNumberInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaVersionNumberInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchemaVersionId() {
        return software.amazon.jsii.Kernel.get(this, "schemaVersionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchemaVersionId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schemaVersionId", java.util.Objects.requireNonNull(value, "schemaVersionId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSchemaVersionNumber() {
        return software.amazon.jsii.Kernel.get(this, "schemaVersionNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSchemaVersionNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "schemaVersionNumber", java.util.Objects.requireNonNull(value, "schemaVersionNumber is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReference getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReference.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReference value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
