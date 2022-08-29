package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.004Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference")
public class AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putErrorHandlingConfig(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putErrorHandlingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetErrorHandlingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetErrorHandlingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfigOutputReference getErrorHandlingConfig() {
        return software.amazon.jsii.Kernel.get(this, "errorHandlingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfig getErrorHandlingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "errorHandlingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoErrorHandlingConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "objectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObject() {
        return software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObject(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "object", java.util.Objects.requireNonNull(value, "object is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
