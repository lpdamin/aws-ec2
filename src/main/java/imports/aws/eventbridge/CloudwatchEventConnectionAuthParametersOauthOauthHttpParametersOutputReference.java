package imports.aws.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.153Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference")
public class CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBody(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putBody", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHeader(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueryString(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putQueryString", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBody() {
        software.amazon.jsii.Kernel.call(this, "resetBody", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHeader() {
        software.amazon.jsii.Kernel.call(this, "resetHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueryString() {
        software.amazon.jsii.Kernel.call(this, "resetQueryString", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersBodyList getBody() {
        return software.amazon.jsii.Kernel.get(this, "body", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersBodyList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersHeaderList getHeader() {
        return software.amazon.jsii.Kernel.get(this, "header", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersHeaderList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersQueryStringList getQueryString() {
        return software.amazon.jsii.Kernel.get(this, "queryString", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParametersQueryStringList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "bodyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "headerInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getQueryStringInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParameters getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParameters.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventConnectionAuthParametersOauthOauthHttpParameters value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
