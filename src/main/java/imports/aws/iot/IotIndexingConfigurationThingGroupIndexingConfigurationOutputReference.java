package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.560Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotIndexingConfigurationThingGroupIndexingConfigurationOutputReference")
public class IotIndexingConfigurationThingGroupIndexingConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotIndexingConfigurationThingGroupIndexingConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotIndexingConfigurationThingGroupIndexingConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotIndexingConfigurationThingGroupIndexingConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
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

    public void resetManagedField() {
        software.amazon.jsii.Kernel.call(this, "resetManagedField", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfigurationCustomFieldList getCustomField() {
        return software.amazon.jsii.Kernel.get(this, "customField", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfigurationCustomFieldList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfigurationManagedFieldList getManagedField() {
        return software.amazon.jsii.Kernel.get(this, "managedField", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfigurationManagedFieldList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCustomFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "customFieldInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getManagedFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "managedFieldInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThingGroupIndexingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "thingGroupIndexingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThingGroupIndexingMode() {
        return software.amazon.jsii.Kernel.get(this, "thingGroupIndexingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThingGroupIndexingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thingGroupIndexingMode", java.util.Objects.requireNonNull(value, "thingGroupIndexingMode is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotIndexingConfigurationThingGroupIndexingConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
