package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.229Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigOutputReference")
public class AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetPrefixFormat() {
        software.amazon.jsii.Kernel.call(this, "resetPrefixFormat", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrefixTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "prefixTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefixFormat() {
        return software.amazon.jsii.Kernel.get(this, "prefixFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefixFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefixFormat", java.util.Objects.requireNonNull(value, "prefixFormat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrefixType() {
        return software.amazon.jsii.Kernel.get(this, "prefixType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrefixType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "prefixType", java.util.Objects.requireNonNull(value, "prefixType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
