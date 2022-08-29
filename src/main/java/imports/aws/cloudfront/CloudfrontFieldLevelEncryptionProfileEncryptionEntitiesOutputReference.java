package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.975Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesOutputReference")
public class CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putItems(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putItems", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetItems() {
        software.amazon.jsii.Kernel.call(this, "resetItems", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsList getItems() {
        return software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntitiesItemsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getItemsInput() {
        return software.amazon.jsii.Kernel.get(this, "itemsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntities getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntities.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionProfileEncryptionEntities value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
