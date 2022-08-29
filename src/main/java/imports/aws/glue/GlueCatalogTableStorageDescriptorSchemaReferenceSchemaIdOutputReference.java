package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.251Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference")
public class GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueCatalogTableStorageDescriptorSchemaReferenceSchemaIdOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetRegistryName() {
        software.amazon.jsii.Kernel.call(this, "resetRegistryName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchemaArn() {
        software.amazon.jsii.Kernel.call(this, "resetSchemaArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchemaName() {
        software.amazon.jsii.Kernel.call(this, "resetSchemaName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegistryNameInput() {
        return software.amazon.jsii.Kernel.get(this, "registryNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemaArnInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemaNameInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegistryName() {
        return software.amazon.jsii.Kernel.get(this, "registryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegistryName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "registryName", java.util.Objects.requireNonNull(value, "registryName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchemaArn() {
        return software.amazon.jsii.Kernel.get(this, "schemaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchemaArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schemaArn", java.util.Objects.requireNonNull(value, "schemaArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchemaName() {
        return software.amazon.jsii.Kernel.get(this, "schemaName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchemaName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schemaName", java.util.Objects.requireNonNull(value, "schemaName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaId getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaId.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogTableStorageDescriptorSchemaReferenceSchemaId value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
