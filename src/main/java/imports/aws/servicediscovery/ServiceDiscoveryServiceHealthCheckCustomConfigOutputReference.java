package imports.aws.servicediscovery;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.680Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicediscovery.ServiceDiscoveryServiceHealthCheckCustomConfigOutputReference")
public class ServiceDiscoveryServiceHealthCheckCustomConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ServiceDiscoveryServiceHealthCheckCustomConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceDiscoveryServiceHealthCheckCustomConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ServiceDiscoveryServiceHealthCheckCustomConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFailureThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetFailureThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getFailureThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "failureThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getFailureThreshold() {
        return software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setFailureThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "failureThreshold", java.util.Objects.requireNonNull(value, "failureThreshold is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.servicediscovery.ServiceDiscoveryServiceHealthCheckCustomConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.servicediscovery.ServiceDiscoveryServiceHealthCheckCustomConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.servicediscovery.ServiceDiscoveryServiceHealthCheckCustomConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
