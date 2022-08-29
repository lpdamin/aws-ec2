package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.961Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigOutputReference")
public class CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putContentTypeProfiles(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles value) {
        software.amazon.jsii.Kernel.call(this, "putContentTypeProfiles", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesOutputReference getContentTypeProfiles() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeProfiles", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles getContentTypeProfilesInput() {
        return software.amazon.jsii.Kernel.get(this, "contentTypeProfilesInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForwardWhenContentTypeIsUnknownInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardWhenContentTypeIsUnknownInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForwardWhenContentTypeIsUnknown() {
        return software.amazon.jsii.Kernel.get(this, "forwardWhenContentTypeIsUnknown", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForwardWhenContentTypeIsUnknown(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forwardWhenContentTypeIsUnknown", java.util.Objects.requireNonNull(value, "forwardWhenContentTypeIsUnknown is required"));
    }

    public void setForwardWhenContentTypeIsUnknown(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forwardWhenContentTypeIsUnknown", java.util.Objects.requireNonNull(value, "forwardWhenContentTypeIsUnknown is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigContentTypeProfileConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
