package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.788Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfigurationOutputReference")
public class KendraIndexUserTokenConfigurationsJsonTokenTypeConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraIndexUserTokenConfigurationsJsonTokenTypeConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraIndexUserTokenConfigurationsJsonTokenTypeConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraIndexUserTokenConfigurationsJsonTokenTypeConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGroupAttributeFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "groupAttributeFieldInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserNameAttributeFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "userNameAttributeFieldInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGroupAttributeField() {
        return software.amazon.jsii.Kernel.get(this, "groupAttributeField", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGroupAttributeField(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "groupAttributeField", java.util.Objects.requireNonNull(value, "groupAttributeField is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserNameAttributeField() {
        return software.amazon.jsii.Kernel.get(this, "userNameAttributeField", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserNameAttributeField(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userNameAttributeField", java.util.Objects.requireNonNull(value, "userNameAttributeField is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
