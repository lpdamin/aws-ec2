package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.241Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionOutputReference")
public class GlueCatalogDatabaseCreateTableDefaultPermissionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueCatalogDatabaseCreateTableDefaultPermissionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCatalogDatabaseCreateTableDefaultPermissionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public GlueCatalogDatabaseCreateTableDefaultPermissionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putPrincipal(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal value) {
        software.amazon.jsii.Kernel.call(this, "putPrincipal", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetPermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrincipal() {
        software.amazon.jsii.Kernel.call(this, "resetPrincipal", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference getPrincipal() {
        return software.amazon.jsii.Kernel.get(this, "principal", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPermissionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "permissionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal getPrincipalInput() {
        return software.amazon.jsii.Kernel.get(this, "principalInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPermissions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPermissions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "permissions", java.util.Objects.requireNonNull(value, "permissions is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermission value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
