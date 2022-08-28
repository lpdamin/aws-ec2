package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.207Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigOutputReference")
public class CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putQueryArgProfiles(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles value) {
        software.amazon.jsii.Kernel.call(this, "putQueryArgProfiles", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetQueryArgProfiles() {
        software.amazon.jsii.Kernel.call(this, "resetQueryArgProfiles", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference getQueryArgProfiles() {
        return software.amazon.jsii.Kernel.get(this, "queryArgProfiles", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForwardWhenQueryArgProfileIsUnknownInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardWhenQueryArgProfileIsUnknownInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles getQueryArgProfilesInput() {
        return software.amazon.jsii.Kernel.get(this, "queryArgProfilesInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForwardWhenQueryArgProfileIsUnknown() {
        return software.amazon.jsii.Kernel.get(this, "forwardWhenQueryArgProfileIsUnknown", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForwardWhenQueryArgProfileIsUnknown(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forwardWhenQueryArgProfileIsUnknown", java.util.Objects.requireNonNull(value, "forwardWhenQueryArgProfileIsUnknown is required"));
    }

    public void setForwardWhenQueryArgProfileIsUnknown(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forwardWhenQueryArgProfileIsUnknown", java.util.Objects.requireNonNull(value, "forwardWhenQueryArgProfileIsUnknown is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontFieldLevelEncryptionConfigQueryArgProfileConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
