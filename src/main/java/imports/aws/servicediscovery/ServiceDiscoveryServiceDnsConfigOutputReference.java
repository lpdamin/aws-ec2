package imports.aws.servicediscovery;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.679Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicediscovery.ServiceDiscoveryServiceDnsConfigOutputReference")
public class ServiceDiscoveryServiceDnsConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ServiceDiscoveryServiceDnsConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServiceDiscoveryServiceDnsConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ServiceDiscoveryServiceDnsConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDnsRecords(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDnsRecords", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRoutingPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetRoutingPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.servicediscovery.ServiceDiscoveryServiceDnsConfigDnsRecordsList getDnsRecords() {
        return software.amazon.jsii.Kernel.get(this, "dnsRecords", software.amazon.jsii.NativeType.forClass(imports.aws.servicediscovery.ServiceDiscoveryServiceDnsConfigDnsRecordsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDnsRecordsInput() {
        return software.amazon.jsii.Kernel.get(this, "dnsRecordsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamespaceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "namespaceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoutingPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "routingPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamespaceId() {
        return software.amazon.jsii.Kernel.get(this, "namespaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamespaceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namespaceId", java.util.Objects.requireNonNull(value, "namespaceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoutingPolicy() {
        return software.amazon.jsii.Kernel.get(this, "routingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoutingPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "routingPolicy", java.util.Objects.requireNonNull(value, "routingPolicy is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.servicediscovery.ServiceDiscoveryServiceDnsConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.servicediscovery.ServiceDiscoveryServiceDnsConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.servicediscovery.ServiceDiscoveryServiceDnsConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
