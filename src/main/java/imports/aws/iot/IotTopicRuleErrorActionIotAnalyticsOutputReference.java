package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.462Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleErrorActionIotAnalyticsOutputReference")
public class IotTopicRuleErrorActionIotAnalyticsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotTopicRuleErrorActionIotAnalyticsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotTopicRuleErrorActionIotAnalyticsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotTopicRuleErrorActionIotAnalyticsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getChannelNameInput() {
        return software.amazon.jsii.Kernel.get(this, "channelNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getChannelName() {
        return software.amazon.jsii.Kernel.get(this, "channelName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setChannelName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "channelName", java.util.Objects.requireNonNull(value, "channelName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionIotAnalytics getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionIotAnalytics.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionIotAnalytics value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
