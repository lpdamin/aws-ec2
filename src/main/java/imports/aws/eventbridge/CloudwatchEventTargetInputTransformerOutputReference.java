package imports.aws.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.101Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventTargetInputTransformerOutputReference")
public class CloudwatchEventTargetInputTransformerOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudwatchEventTargetInputTransformerOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchEventTargetInputTransformerOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudwatchEventTargetInputTransformerOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetInputPaths() {
        software.amazon.jsii.Kernel.call(this, "resetInputPaths", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getInputPathsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "inputPathsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "inputTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getInputPaths() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "inputPaths", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setInputPaths(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "inputPaths", java.util.Objects.requireNonNull(value, "inputPaths is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputTemplate() {
        return software.amazon.jsii.Kernel.get(this, "inputTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputTemplate", java.util.Objects.requireNonNull(value, "inputTemplate is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetInputTransformer getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetInputTransformer.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetInputTransformer value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
