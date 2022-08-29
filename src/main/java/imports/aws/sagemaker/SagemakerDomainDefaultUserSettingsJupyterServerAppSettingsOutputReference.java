package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.497Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsOutputReference")
public class SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDefaultResourceSpec(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpec value) {
        software.amazon.jsii.Kernel.call(this, "putDefaultResourceSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDefaultResourceSpec() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultResourceSpec", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLifecycleConfigArns() {
        software.amazon.jsii.Kernel.call(this, "resetLifecycleConfigArns", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecOutputReference getDefaultResourceSpec() {
        return software.amazon.jsii.Kernel.get(this, "defaultResourceSpec", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpec getDefaultResourceSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultResourceSpecInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpec.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLifecycleConfigArnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "lifecycleConfigArnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLifecycleConfigArns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "lifecycleConfigArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLifecycleConfigArns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "lifecycleConfigArns", java.util.Objects.requireNonNull(value, "lifecycleConfigArns is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDomainDefaultUserSettingsJupyterServerAppSettings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
