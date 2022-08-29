package imports.aws.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.154Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventConnectionAuthParametersOutputReference")
public class CloudwatchEventConnectionAuthParametersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudwatchEventConnectionAuthParametersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchEventConnectionAuthParametersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudwatchEventConnectionAuthParametersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putApiKey(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersApiKey value) {
        software.amazon.jsii.Kernel.call(this, "putApiKey", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBasic(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersBasic value) {
        software.amazon.jsii.Kernel.call(this, "putBasic", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInvocationHttpParameters(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersInvocationHttpParameters value) {
        software.amazon.jsii.Kernel.call(this, "putInvocationHttpParameters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOauth(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauth value) {
        software.amazon.jsii.Kernel.call(this, "putOauth", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetApiKey() {
        software.amazon.jsii.Kernel.call(this, "resetApiKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBasic() {
        software.amazon.jsii.Kernel.call(this, "resetBasic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInvocationHttpParameters() {
        software.amazon.jsii.Kernel.call(this, "resetInvocationHttpParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOauth() {
        software.amazon.jsii.Kernel.call(this, "resetOauth", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersApiKeyOutputReference getApiKey() {
        return software.amazon.jsii.Kernel.get(this, "apiKey", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersApiKeyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersBasicOutputReference getBasic() {
        return software.amazon.jsii.Kernel.get(this, "basic", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersBasicOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersInvocationHttpParametersOutputReference getInvocationHttpParameters() {
        return software.amazon.jsii.Kernel.get(this, "invocationHttpParameters", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersInvocationHttpParametersOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOutputReference getOauth() {
        return software.amazon.jsii.Kernel.get(this, "oauth", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersApiKey getApiKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "apiKeyInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersApiKey.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersBasic getBasicInput() {
        return software.amazon.jsii.Kernel.get(this, "basicInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersBasic.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersInvocationHttpParameters getInvocationHttpParametersInput() {
        return software.amazon.jsii.Kernel.get(this, "invocationHttpParametersInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersInvocationHttpParameters.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauth getOauthInput() {
        return software.amazon.jsii.Kernel.get(this, "oauthInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauth.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParameters getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParameters.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParameters value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
