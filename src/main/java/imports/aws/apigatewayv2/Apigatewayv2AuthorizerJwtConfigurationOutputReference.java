package imports.aws.apigatewayv2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.530Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfigurationOutputReference")
public class Apigatewayv2AuthorizerJwtConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Apigatewayv2AuthorizerJwtConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Apigatewayv2AuthorizerJwtConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Apigatewayv2AuthorizerJwtConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAudience() {
        software.amazon.jsii.Kernel.call(this, "resetAudience", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIssuer() {
        software.amazon.jsii.Kernel.call(this, "resetIssuer", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAudienceInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "audienceInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIssuerInput() {
        return software.amazon.jsii.Kernel.get(this, "issuerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAudience() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "audience", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAudience(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "audience", java.util.Objects.requireNonNull(value, "audience is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIssuer() {
        return software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIssuer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "issuer", java.util.Objects.requireNonNull(value, "issuer is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apigatewayv2.Apigatewayv2AuthorizerJwtConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
