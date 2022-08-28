package imports.aws.apprunner;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.645Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerServiceObservabilityConfigurationOutputReference")
public class ApprunnerServiceObservabilityConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApprunnerServiceObservabilityConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApprunnerServiceObservabilityConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApprunnerServiceObservabilityConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObservabilityConfigurationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "observabilityConfigurationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getObservabilityEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "observabilityEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObservabilityConfigurationArn() {
        return software.amazon.jsii.Kernel.get(this, "observabilityConfigurationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObservabilityConfigurationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "observabilityConfigurationArn", java.util.Objects.requireNonNull(value, "observabilityConfigurationArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getObservabilityEnabled() {
        return software.amazon.jsii.Kernel.get(this, "observabilityEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setObservabilityEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "observabilityEnabled", java.util.Objects.requireNonNull(value, "observabilityEnabled is required"));
    }

    public void setObservabilityEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "observabilityEnabled", java.util.Objects.requireNonNull(value, "observabilityEnabled is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceObservabilityConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
