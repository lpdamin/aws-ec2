package imports.aws.config;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.224Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigRemediationConfigurationExecutionControlsOutputReference")
public class ConfigRemediationConfigurationExecutionControlsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ConfigRemediationConfigurationExecutionControlsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConfigRemediationConfigurationExecutionControlsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ConfigRemediationConfigurationExecutionControlsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSsmControls(final @org.jetbrains.annotations.NotNull imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls value) {
        software.amazon.jsii.Kernel.call(this, "putSsmControls", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSsmControls() {
        software.amazon.jsii.Kernel.call(this, "resetSsmControls", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControlsOutputReference getSsmControls() {
        return software.amazon.jsii.Kernel.get(this, "ssmControls", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControlsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls getSsmControlsInput() {
        return software.amazon.jsii.Kernel.get(this, "ssmControlsInput", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.config.ConfigRemediationConfigurationExecutionControls getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationExecutionControls.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.config.ConfigRemediationConfigurationExecutionControls value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
