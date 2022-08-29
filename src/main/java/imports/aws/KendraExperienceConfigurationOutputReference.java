package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.291Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraExperienceConfigurationOutputReference")
public class KendraExperienceConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraExperienceConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraExperienceConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraExperienceConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putContentSourceConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraExperienceConfigurationContentSourceConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putContentSourceConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserIdentityConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraExperienceConfigurationUserIdentityConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putUserIdentityConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetContentSourceConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetContentSourceConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserIdentityConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetUserIdentityConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraExperienceConfigurationContentSourceConfigurationOutputReference getContentSourceConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "contentSourceConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraExperienceConfigurationContentSourceConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraExperienceConfigurationUserIdentityConfigurationOutputReference getUserIdentityConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "userIdentityConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraExperienceConfigurationUserIdentityConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraExperienceConfigurationContentSourceConfiguration getContentSourceConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "contentSourceConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraExperienceConfigurationContentSourceConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraExperienceConfigurationUserIdentityConfiguration getUserIdentityConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "userIdentityConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraExperienceConfigurationUserIdentityConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraExperienceConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraExperienceConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraExperienceConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
