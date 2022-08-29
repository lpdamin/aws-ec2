package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.010Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference")
public class AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putErrorHandlingConfig(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putErrorHandlingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSuccessResponseHandlingConfig(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putSuccessResponseHandlingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetErrorHandlingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetErrorHandlingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdFieldNames() {
        software.amazon.jsii.Kernel.call(this, "resetIdFieldNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuccessResponseHandlingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetSuccessResponseHandlingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWriteOperationType() {
        software.amazon.jsii.Kernel.call(this, "resetWriteOperationType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigOutputReference getErrorHandlingConfig() {
        return software.amazon.jsii.Kernel.get(this, "errorHandlingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigOutputReference getSuccessResponseHandlingConfig() {
        return software.amazon.jsii.Kernel.get(this, "successResponseHandlingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig getErrorHandlingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "errorHandlingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIdFieldNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "idFieldNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectPathInput() {
        return software.amazon.jsii.Kernel.get(this, "objectPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig getSuccessResponseHandlingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "successResponseHandlingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWriteOperationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "writeOperationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIdFieldNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "idFieldNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIdFieldNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "idFieldNames", java.util.Objects.requireNonNull(value, "idFieldNames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getObjectPath() {
        return software.amazon.jsii.Kernel.get(this, "objectPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectPath", java.util.Objects.requireNonNull(value, "objectPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWriteOperationType() {
        return software.amazon.jsii.Kernel.get(this, "writeOperationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWriteOperationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "writeOperationType", java.util.Objects.requireNonNull(value, "writeOperationType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
