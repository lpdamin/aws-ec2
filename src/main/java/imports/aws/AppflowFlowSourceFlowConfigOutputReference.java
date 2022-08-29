package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.023Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowSourceFlowConfigOutputReference")
public class AppflowFlowSourceFlowConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowSourceFlowConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowSourceFlowConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowSourceFlowConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putIncrementalPullConfig(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfig value) {
        software.amazon.jsii.Kernel.call(this, "putIncrementalPullConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourceConnectorProperties(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowSourceFlowConfigSourceConnectorProperties value) {
        software.amazon.jsii.Kernel.call(this, "putSourceConnectorProperties", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetApiVersion() {
        software.amazon.jsii.Kernel.call(this, "resetApiVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectorProfileName() {
        software.amazon.jsii.Kernel.call(this, "resetConnectorProfileName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncrementalPullConfig() {
        software.amazon.jsii.Kernel.call(this, "resetIncrementalPullConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference getIncrementalPullConfig() {
        return software.amazon.jsii.Kernel.get(this, "incrementalPullConfig", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesOutputReference getSourceConnectorProperties() {
        return software.amazon.jsii.Kernel.get(this, "sourceConnectorProperties", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApiVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "apiVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectorProfileNameInput() {
        return software.amazon.jsii.Kernel.get(this, "connectorProfileNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConnectorTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "connectorTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfig getIncrementalPullConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "incrementalPullConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigSourceConnectorProperties getSourceConnectorPropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceConnectorPropertiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigSourceConnectorProperties.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApiVersion() {
        return software.amazon.jsii.Kernel.get(this, "apiVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApiVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "apiVersion", java.util.Objects.requireNonNull(value, "apiVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectorProfileName() {
        return software.amazon.jsii.Kernel.get(this, "connectorProfileName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectorProfileName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectorProfileName", java.util.Objects.requireNonNull(value, "connectorProfileName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConnectorType() {
        return software.amazon.jsii.Kernel.get(this, "connectorType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConnectorType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "connectorType", java.util.Objects.requireNonNull(value, "connectorType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
