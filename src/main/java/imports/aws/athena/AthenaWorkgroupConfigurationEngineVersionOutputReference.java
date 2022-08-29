package imports.aws.athena;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.780Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.athena.AthenaWorkgroupConfigurationEngineVersionOutputReference")
public class AthenaWorkgroupConfigurationEngineVersionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AthenaWorkgroupConfigurationEngineVersionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AthenaWorkgroupConfigurationEngineVersionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AthenaWorkgroupConfigurationEngineVersionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSelectedEngineVersion() {
        software.amazon.jsii.Kernel.call(this, "resetSelectedEngineVersion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEffectiveEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "effectiveEngineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSelectedEngineVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "selectedEngineVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSelectedEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "selectedEngineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSelectedEngineVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "selectedEngineVersion", java.util.Objects.requireNonNull(value, "selectedEngineVersion is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationEngineVersion getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationEngineVersion.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationEngineVersion value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
