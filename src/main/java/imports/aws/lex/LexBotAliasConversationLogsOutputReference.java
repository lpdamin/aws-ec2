package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.835Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexBotAliasConversationLogsOutputReference")
public class LexBotAliasConversationLogsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LexBotAliasConversationLogsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LexBotAliasConversationLogsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LexBotAliasConversationLogsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLogSettings(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLogSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetLogSettings() {
        software.amazon.jsii.Kernel.call(this, "resetLogSettings", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotAliasConversationLogsLogSettingsList getLogSettings() {
        return software.amazon.jsii.Kernel.get(this, "logSettings", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotAliasConversationLogsLogSettingsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLogSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "logSettingsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRoleArn", java.util.Objects.requireNonNull(value, "iamRoleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexBotAliasConversationLogs getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotAliasConversationLogs.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lex.LexBotAliasConversationLogs value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
