package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.962Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference")
public class CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putItems(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putItems", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetItems() {
        software.amazon.jsii.Kernel.call(this, "resetItems", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemsList getItems() {
        return software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getItemsInput() {
        return software.amazon.jsii.Kernel.get(this, "itemsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
