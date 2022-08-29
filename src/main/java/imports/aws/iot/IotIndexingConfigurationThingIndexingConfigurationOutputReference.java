package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.431Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotIndexingConfigurationThingIndexingConfigurationOutputReference")
public class IotIndexingConfigurationThingIndexingConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotIndexingConfigurationThingIndexingConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotIndexingConfigurationThingIndexingConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotIndexingConfigurationThingIndexingConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCustomField(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCustomField", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putManagedField(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putManagedField", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCustomField() {
        software.amazon.jsii.Kernel.call(this, "resetCustomField", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeviceDefenderIndexingMode() {
        software.amazon.jsii.Kernel.call(this, "resetDeviceDefenderIndexingMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetManagedField() {
        software.amazon.jsii.Kernel.call(this, "resetManagedField", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamedShadowIndexingMode() {
        software.amazon.jsii.Kernel.call(this, "resetNamedShadowIndexingMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThingConnectivityIndexingMode() {
        software.amazon.jsii.Kernel.call(this, "resetThingConnectivityIndexingMode", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotIndexingConfigurationThingIndexingConfigurationCustomFieldList getCustomField() {
        return software.amazon.jsii.Kernel.get(this, "customField", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotIndexingConfigurationThingIndexingConfigurationCustomFieldList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotIndexingConfigurationThingIndexingConfigurationManagedFieldList getManagedField() {
        return software.amazon.jsii.Kernel.get(this, "managedField", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotIndexingConfigurationThingIndexingConfigurationManagedFieldList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCustomFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "customFieldInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeviceDefenderIndexingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "deviceDefenderIndexingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getManagedFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "managedFieldInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamedShadowIndexingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "namedShadowIndexingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThingConnectivityIndexingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "thingConnectivityIndexingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThingIndexingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "thingIndexingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeviceDefenderIndexingMode() {
        return software.amazon.jsii.Kernel.get(this, "deviceDefenderIndexingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeviceDefenderIndexingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deviceDefenderIndexingMode", java.util.Objects.requireNonNull(value, "deviceDefenderIndexingMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamedShadowIndexingMode() {
        return software.amazon.jsii.Kernel.get(this, "namedShadowIndexingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamedShadowIndexingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namedShadowIndexingMode", java.util.Objects.requireNonNull(value, "namedShadowIndexingMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThingConnectivityIndexingMode() {
        return software.amazon.jsii.Kernel.get(this, "thingConnectivityIndexingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThingConnectivityIndexingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thingConnectivityIndexingMode", java.util.Objects.requireNonNull(value, "thingConnectivityIndexingMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThingIndexingMode() {
        return software.amazon.jsii.Kernel.get(this, "thingIndexingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThingIndexingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thingIndexingMode", java.util.Objects.requireNonNull(value, "thingIndexingMode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotIndexingConfigurationThingIndexingConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotIndexingConfigurationThingIndexingConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotIndexingConfigurationThingIndexingConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
