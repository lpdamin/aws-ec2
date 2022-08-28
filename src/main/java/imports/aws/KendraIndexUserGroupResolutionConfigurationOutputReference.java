package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.786Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraIndexUserGroupResolutionConfigurationOutputReference")
public class KendraIndexUserGroupResolutionConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraIndexUserGroupResolutionConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraIndexUserGroupResolutionConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraIndexUserGroupResolutionConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserGroupResolutionModeInput() {
        return software.amazon.jsii.Kernel.get(this, "userGroupResolutionModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserGroupResolutionMode() {
        return software.amazon.jsii.Kernel.get(this, "userGroupResolutionMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserGroupResolutionMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userGroupResolutionMode", java.util.Objects.requireNonNull(value, "userGroupResolutionMode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserGroupResolutionConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserGroupResolutionConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserGroupResolutionConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
