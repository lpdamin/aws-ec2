package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.978Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionOutputReference")
public class CloudfrontMonitoringSubscriptionMonitoringSubscriptionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontMonitoringSubscriptionMonitoringSubscriptionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontMonitoringSubscriptionMonitoringSubscriptionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontMonitoringSubscriptionMonitoringSubscriptionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRealtimeMetricsSubscriptionConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig value) {
        software.amazon.jsii.Kernel.call(this, "putRealtimeMetricsSubscriptionConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigOutputReference getRealtimeMetricsSubscriptionConfig() {
        return software.amazon.jsii.Kernel.get(this, "realtimeMetricsSubscriptionConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig getRealtimeMetricsSubscriptionConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "realtimeMetricsSubscriptionConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscription getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscription.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontMonitoringSubscriptionMonitoringSubscription value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
