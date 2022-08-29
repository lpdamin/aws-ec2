package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.277Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GluePartitionIndexPartitionIndexOutputReference")
public class GluePartitionIndexPartitionIndexOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GluePartitionIndexPartitionIndexOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GluePartitionIndexPartitionIndexOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GluePartitionIndexPartitionIndexOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetIndexName() {
        software.amazon.jsii.Kernel.call(this, "resetIndexName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeys() {
        software.amazon.jsii.Kernel.call(this, "resetKeys", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIndexStatus() {
        return software.amazon.jsii.Kernel.get(this, "indexStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIndexNameInput() {
        return software.amazon.jsii.Kernel.get(this, "indexNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getKeysInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "keysInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIndexName() {
        return software.amazon.jsii.Kernel.get(this, "indexName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIndexName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "indexName", java.util.Objects.requireNonNull(value, "indexName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getKeys() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "keys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setKeys(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "keys", java.util.Objects.requireNonNull(value, "keys is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionIndexPartitionIndex getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionIndexPartitionIndex.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionIndexPartitionIndex value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
