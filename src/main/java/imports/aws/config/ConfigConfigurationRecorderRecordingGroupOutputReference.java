package imports.aws.config;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.207Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigConfigurationRecorderRecordingGroupOutputReference")
public class ConfigConfigurationRecorderRecordingGroupOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ConfigConfigurationRecorderRecordingGroupOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConfigConfigurationRecorderRecordingGroupOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ConfigConfigurationRecorderRecordingGroupOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAllSupported() {
        software.amazon.jsii.Kernel.call(this, "resetAllSupported", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeGlobalResourceTypes() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeGlobalResourceTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceTypes() {
        software.amazon.jsii.Kernel.call(this, "resetResourceTypes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllSupportedInput() {
        return software.amazon.jsii.Kernel.get(this, "allSupportedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeGlobalResourceTypesInput() {
        return software.amazon.jsii.Kernel.get(this, "includeGlobalResourceTypesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "resourceTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllSupported() {
        return software.amazon.jsii.Kernel.get(this, "allSupported", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllSupported(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allSupported", java.util.Objects.requireNonNull(value, "allSupported is required"));
    }

    public void setAllSupported(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allSupported", java.util.Objects.requireNonNull(value, "allSupported is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeGlobalResourceTypes() {
        return software.amazon.jsii.Kernel.get(this, "includeGlobalResourceTypes", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeGlobalResourceTypes(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeGlobalResourceTypes", java.util.Objects.requireNonNull(value, "includeGlobalResourceTypes is required"));
    }

    public void setIncludeGlobalResourceTypes(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeGlobalResourceTypes", java.util.Objects.requireNonNull(value, "includeGlobalResourceTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResourceTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resourceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResourceTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "resourceTypes", java.util.Objects.requireNonNull(value, "resourceTypes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.config.ConfigConfigurationRecorderRecordingGroup getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigConfigurationRecorderRecordingGroup.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.config.ConfigConfigurationRecorderRecordingGroup value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
