package imports.aws.codepipeline;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.593Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codepipeline.CodepipelineWebhookAuthenticationConfigurationOutputReference")
public class CodepipelineWebhookAuthenticationConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodepipelineWebhookAuthenticationConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodepipelineWebhookAuthenticationConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodepipelineWebhookAuthenticationConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAllowedIpRange() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedIpRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretToken() {
        software.amazon.jsii.Kernel.call(this, "resetSecretToken", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAllowedIpRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "allowedIpRangeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "secretTokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAllowedIpRange() {
        return software.amazon.jsii.Kernel.get(this, "allowedIpRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAllowedIpRange(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "allowedIpRange", java.util.Objects.requireNonNull(value, "allowedIpRange is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretToken() {
        return software.amazon.jsii.Kernel.get(this, "secretToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretToken(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretToken", java.util.Objects.requireNonNull(value, "secretToken is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codepipeline.CodepipelineWebhookAuthenticationConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codepipeline.CodepipelineWebhookAuthenticationConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codepipeline.CodepipelineWebhookAuthenticationConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
