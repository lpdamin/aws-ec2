package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.468Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayIntegrationTlsConfigOutputReference")
public class ApiGatewayIntegrationTlsConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApiGatewayIntegrationTlsConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayIntegrationTlsConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApiGatewayIntegrationTlsConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetInsecureSkipVerification() {
        software.amazon.jsii.Kernel.call(this, "resetInsecureSkipVerification", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInsecureSkipVerificationInput() {
        return software.amazon.jsii.Kernel.get(this, "insecureSkipVerificationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getInsecureSkipVerification() {
        return software.amazon.jsii.Kernel.get(this, "insecureSkipVerification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInsecureSkipVerification(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "insecureSkipVerification", java.util.Objects.requireNonNull(value, "insecureSkipVerification is required"));
    }

    public void setInsecureSkipVerification(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "insecureSkipVerification", java.util.Objects.requireNonNull(value, "insecureSkipVerification is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayIntegrationTlsConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apigateway.ApiGatewayIntegrationTlsConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayIntegrationTlsConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
