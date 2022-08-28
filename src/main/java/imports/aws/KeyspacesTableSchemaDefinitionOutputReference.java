package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.816Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KeyspacesTableSchemaDefinitionOutputReference")
public class KeyspacesTableSchemaDefinitionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KeyspacesTableSchemaDefinitionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KeyspacesTableSchemaDefinitionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KeyspacesTableSchemaDefinitionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClusteringKey(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putClusteringKey", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putColumn(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putColumn", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPartitionKey(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPartitionKey", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStaticColumn(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putStaticColumn", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClusteringKey() {
        software.amazon.jsii.Kernel.call(this, "resetClusteringKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStaticColumn() {
        software.amazon.jsii.Kernel.call(this, "resetStaticColumn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableSchemaDefinitionClusteringKeyList getClusteringKey() {
        return software.amazon.jsii.Kernel.get(this, "clusteringKey", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinitionClusteringKeyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableSchemaDefinitionColumnList getColumn() {
        return software.amazon.jsii.Kernel.get(this, "column", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinitionColumnList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableSchemaDefinitionPartitionKeyList getPartitionKey() {
        return software.amazon.jsii.Kernel.get(this, "partitionKey", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinitionPartitionKeyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KeyspacesTableSchemaDefinitionStaticColumnList getStaticColumn() {
        return software.amazon.jsii.Kernel.get(this, "staticColumn", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinitionStaticColumnList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getClusteringKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "clusteringKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getColumnInput() {
        return software.amazon.jsii.Kernel.get(this, "columnInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPartitionKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "partitionKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStaticColumnInput() {
        return software.amazon.jsii.Kernel.get(this, "staticColumnInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableSchemaDefinition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KeyspacesTableSchemaDefinition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KeyspacesTableSchemaDefinition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
