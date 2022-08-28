package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.189Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayStageCanarySettingsOutputReference")
public class ApiGatewayStageCanarySettingsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApiGatewayStageCanarySettingsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayStageCanarySettingsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApiGatewayStageCanarySettingsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetPercentTraffic() {
        software.amazon.jsii.Kernel.call(this, "resetPercentTraffic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStageVariableOverrides() {
        software.amazon.jsii.Kernel.call(this, "resetStageVariableOverrides", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseStageCache() {
        software.amazon.jsii.Kernel.call(this, "resetUseStageCache", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPercentTrafficInput() {
        return software.amazon.jsii.Kernel.get(this, "percentTrafficInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getStageVariableOverridesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "stageVariableOverridesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseStageCacheInput() {
        return software.amazon.jsii.Kernel.get(this, "useStageCacheInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPercentTraffic() {
        return software.amazon.jsii.Kernel.get(this, "percentTraffic", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPercentTraffic(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "percentTraffic", java.util.Objects.requireNonNull(value, "percentTraffic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getStageVariableOverrides() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "stageVariableOverrides", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStageVariableOverrides(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "stageVariableOverrides", java.util.Objects.requireNonNull(value, "stageVariableOverrides is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getUseStageCache() {
        return software.amazon.jsii.Kernel.get(this, "useStageCache", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseStageCache(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useStageCache", java.util.Objects.requireNonNull(value, "useStageCache is required"));
    }

    public void setUseStageCache(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useStageCache", java.util.Objects.requireNonNull(value, "useStageCache is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayStageCanarySettings getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apigateway.ApiGatewayStageCanarySettings.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayStageCanarySettings value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
