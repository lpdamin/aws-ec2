package imports.aws.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.060Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOutputReference")
public class CloudwatchEventConnectionAuthParametersOauthOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudwatchEventConnectionAuthParametersOauthOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchEventConnectionAuthParametersOauthOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudwatchEventConnectionAuthParametersOauthOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putClientParameters(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthClientParameters value) {
        software.amazon.jsii.Kernel.call(this, "putClientParameters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOauthHttpParameters(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParameters value) {
        software.amazon.jsii.Kernel.call(this, "putOauthHttpParameters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClientParameters() {
        software.amazon.jsii.Kernel.call(this, "resetClientParameters", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthClientParametersOutputReference getClientParameters() {
        return software.amazon.jsii.Kernel.get(this, "clientParameters", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthClientParametersOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference getOauthHttpParameters() {
        return software.amazon.jsii.Kernel.get(this, "oauthHttpParameters", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizationEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthClientParameters getClientParametersInput() {
        return software.amazon.jsii.Kernel.get(this, "clientParametersInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthClientParameters.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "httpMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParameters getOauthHttpParametersInput() {
        return software.amazon.jsii.Kernel.get(this, "oauthHttpParametersInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParameters.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "authorizationEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizationEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizationEndpoint", java.util.Objects.requireNonNull(value, "authorizationEndpoint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpMethod() {
        return software.amazon.jsii.Kernel.get(this, "httpMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpMethod", java.util.Objects.requireNonNull(value, "httpMethod is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauth getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauth.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauth value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
