package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.693Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecOutputReference")
public class AppmeshVirtualNodeSpecOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBackend(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putBackend", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBackendDefaults(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaults value) {
        software.amazon.jsii.Kernel.call(this, "putBackendDefaults", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putListener(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListener value) {
        software.amazon.jsii.Kernel.call(this, "putListener", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogging(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecLogging value) {
        software.amazon.jsii.Kernel.call(this, "putLogging", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServiceDiscovery(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscovery value) {
        software.amazon.jsii.Kernel.call(this, "putServiceDiscovery", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBackend() {
        software.amazon.jsii.Kernel.call(this, "resetBackend", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBackendDefaults() {
        software.amazon.jsii.Kernel.call(this, "resetBackendDefaults", software.amazon.jsii.NativeType.VOID);
    }

    public void resetListener() {
        software.amazon.jsii.Kernel.call(this, "resetListener", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogging() {
        software.amazon.jsii.Kernel.call(this, "resetLogging", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceDiscovery() {
        software.amazon.jsii.Kernel.call(this, "resetServiceDiscovery", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendList getBackend() {
        return software.amazon.jsii.Kernel.get(this, "backend", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsOutputReference getBackendDefaults() {
        return software.amazon.jsii.Kernel.get(this, "backendDefaults", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaultsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerOutputReference getListener() {
        return software.amazon.jsii.Kernel.get(this, "listener", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingOutputReference getLogging() {
        return software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryOutputReference getServiceDiscovery() {
        return software.amazon.jsii.Kernel.get(this, "serviceDiscovery", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaults getBackendDefaultsInput() {
        return software.amazon.jsii.Kernel.get(this, "backendDefaultsInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecBackendDefaults.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBackendInput() {
        return software.amazon.jsii.Kernel.get(this, "backendInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListener getListenerInput() {
        return software.amazon.jsii.Kernel.get(this, "listenerInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListener.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecLogging getLoggingInput() {
        return software.amazon.jsii.Kernel.get(this, "loggingInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecLogging.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscovery getServiceDiscoveryInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceDiscoveryInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscovery.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpec getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpec.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpec value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
