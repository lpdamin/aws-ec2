package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.308Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference")
public class GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueCatalogDatabaseCreateTableDefaultPermissionPrincipalOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDataLakePrincipalIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetDataLakePrincipalIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataLakePrincipalIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "dataLakePrincipalIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataLakePrincipalIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "dataLakePrincipalIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataLakePrincipalIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataLakePrincipalIdentifier", java.util.Objects.requireNonNull(value, "dataLakePrincipalIdentifier is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
