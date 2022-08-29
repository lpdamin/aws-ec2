package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.503Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayUsagePlanThrottleSettingsOutputReference")
public class ApiGatewayUsagePlanThrottleSettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApiGatewayUsagePlanThrottleSettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayUsagePlanThrottleSettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApiGatewayUsagePlanThrottleSettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetBurstLimit() {
        software.amazon.jsii.Kernel.call(this, "resetBurstLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRateLimit() {
        software.amazon.jsii.Kernel.call(this, "resetRateLimit", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBurstLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "burstLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRateLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "rateLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBurstLimit() {
        return software.amazon.jsii.Kernel.get(this, "burstLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBurstLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "burstLimit", java.util.Objects.requireNonNull(value, "burstLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRateLimit() {
        return software.amazon.jsii.Kernel.get(this, "rateLimit", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRateLimit(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "rateLimit", java.util.Objects.requireNonNull(value, "rateLimit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayUsagePlanThrottleSettings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apigateway.ApiGatewayUsagePlanThrottleSettings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayUsagePlanThrottleSettings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
