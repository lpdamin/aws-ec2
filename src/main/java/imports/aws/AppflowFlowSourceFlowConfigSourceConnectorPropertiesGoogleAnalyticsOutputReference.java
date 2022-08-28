package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.242Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsOutputReference")
public class AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
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

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
