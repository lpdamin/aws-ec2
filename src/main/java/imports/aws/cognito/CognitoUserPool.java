package imports.aws.cognito;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool aws_cognito_user_pool}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.703Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPool")
public class CognitoUserPool extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoUserPool(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPool(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cognito.CognitoUserPool.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool aws_cognito_user_pool} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CognitoUserPool(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAccountRecoverySetting(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAccountRecoverySetting value) {
        software.amazon.jsii.Kernel.call(this, "putAccountRecoverySetting", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAdminCreateUserConfig(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig value) {
        software.amazon.jsii.Kernel.call(this, "putAdminCreateUserConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDeviceConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolDeviceConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putDeviceConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEmailConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolEmailConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putEmailConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLambdaConfig(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolLambdaConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLambdaConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPasswordPolicy(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolPasswordPolicy value) {
        software.amazon.jsii.Kernel.call(this, "putPasswordPolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSchema(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSchema", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSmsConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolSmsConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putSmsConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSoftwareTokenMfaConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolSoftwareTokenMfaConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putSoftwareTokenMfaConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUsernameConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolUsernameConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putUsernameConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserPoolAddOns(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolUserPoolAddOns value) {
        software.amazon.jsii.Kernel.call(this, "putUserPoolAddOns", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVerificationMessageTemplate(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolVerificationMessageTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putVerificationMessageTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccountRecoverySetting() {
        software.amazon.jsii.Kernel.call(this, "resetAccountRecoverySetting", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAdminCreateUserConfig() {
        software.amazon.jsii.Kernel.call(this, "resetAdminCreateUserConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAliasAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetAliasAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoVerifiedAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetAutoVerifiedAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeviceConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetDeviceConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEmailConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailVerificationMessage() {
        software.amazon.jsii.Kernel.call(this, "resetEmailVerificationMessage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailVerificationSubject() {
        software.amazon.jsii.Kernel.call(this, "resetEmailVerificationSubject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambdaConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMfaConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetMfaConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPasswordPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPasswordPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchema() {
        software.amazon.jsii.Kernel.call(this, "resetSchema", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmsAuthenticationMessage() {
        software.amazon.jsii.Kernel.call(this, "resetSmsAuthenticationMessage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmsConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSmsConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSmsVerificationMessage() {
        software.amazon.jsii.Kernel.call(this, "resetSmsVerificationMessage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSoftwareTokenMfaConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSoftwareTokenMfaConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsernameAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetUsernameAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsernameConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetUsernameConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserPoolAddOns() {
        software.amazon.jsii.Kernel.call(this, "resetUserPoolAddOns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVerificationMessageTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetVerificationMessageTemplate", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAccountRecoverySettingOutputReference getAccountRecoverySetting() {
        return software.amazon.jsii.Kernel.get(this, "accountRecoverySetting", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAccountRecoverySettingOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigOutputReference getAdminCreateUserConfig() {
        return software.amazon.jsii.Kernel.get(this, "adminCreateUserConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreationDate() {
        return software.amazon.jsii.Kernel.get(this, "creationDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomDomain() {
        return software.amazon.jsii.Kernel.get(this, "customDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolDeviceConfigurationOutputReference getDeviceConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "deviceConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolDeviceConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomain() {
        return software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolEmailConfigurationOutputReference getEmailConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "emailConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolEmailConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEstimatedNumberOfUsers() {
        return software.amazon.jsii.Kernel.get(this, "estimatedNumberOfUsers", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolLambdaConfigOutputReference getLambdaConfig() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolLambdaConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModifiedDate() {
        return software.amazon.jsii.Kernel.get(this, "lastModifiedDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolPasswordPolicyOutputReference getPasswordPolicy() {
        return software.amazon.jsii.Kernel.get(this, "passwordPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolPasswordPolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolSchemaList getSchema() {
        return software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolSchemaList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolSmsConfigurationOutputReference getSmsConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "smsConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolSmsConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolSoftwareTokenMfaConfigurationOutputReference getSoftwareTokenMfaConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "softwareTokenMfaConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolSoftwareTokenMfaConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolUsernameConfigurationOutputReference getUsernameConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "usernameConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolUsernameConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolUserPoolAddOnsOutputReference getUserPoolAddOns() {
        return software.amazon.jsii.Kernel.get(this, "userPoolAddOns", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolUserPoolAddOnsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolVerificationMessageTemplateOutputReference getVerificationMessageTemplate() {
        return software.amazon.jsii.Kernel.get(this, "verificationMessageTemplate", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolVerificationMessageTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAccountRecoverySetting getAccountRecoverySettingInput() {
        return software.amazon.jsii.Kernel.get(this, "accountRecoverySettingInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAccountRecoverySetting.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig getAdminCreateUserConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "adminCreateUserConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAliasAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "aliasAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAutoVerifiedAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "autoVerifiedAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolDeviceConfiguration getDeviceConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "deviceConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolDeviceConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolEmailConfiguration getEmailConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "emailConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolEmailConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEmailVerificationMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationMessageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEmailVerificationSubjectInput() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationSubjectInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolLambdaConfig getLambdaConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolLambdaConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMfaConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "mfaConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolPasswordPolicy getPasswordPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordPolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolPasswordPolicy.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSchemaInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSmsAuthenticationMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "smsAuthenticationMessageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolSmsConfiguration getSmsConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "smsConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolSmsConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSmsVerificationMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "smsVerificationMessageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolSoftwareTokenMfaConfiguration getSoftwareTokenMfaConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "softwareTokenMfaConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolSoftwareTokenMfaConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getUsernameAttributesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "usernameAttributesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolUsernameConfiguration getUsernameConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolUsernameConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolUserPoolAddOns getUserPoolAddOnsInput() {
        return software.amazon.jsii.Kernel.get(this, "userPoolAddOnsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolUserPoolAddOns.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolVerificationMessageTemplate getVerificationMessageTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "verificationMessageTemplateInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolVerificationMessageTemplate.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAliasAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "aliasAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAliasAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "aliasAttributes", java.util.Objects.requireNonNull(value, "aliasAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAutoVerifiedAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "autoVerifiedAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAutoVerifiedAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "autoVerifiedAttributes", java.util.Objects.requireNonNull(value, "autoVerifiedAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEmailVerificationMessage() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEmailVerificationMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "emailVerificationMessage", java.util.Objects.requireNonNull(value, "emailVerificationMessage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEmailVerificationSubject() {
        return software.amazon.jsii.Kernel.get(this, "emailVerificationSubject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEmailVerificationSubject(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "emailVerificationSubject", java.util.Objects.requireNonNull(value, "emailVerificationSubject is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMfaConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "mfaConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMfaConfiguration(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mfaConfiguration", java.util.Objects.requireNonNull(value, "mfaConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSmsAuthenticationMessage() {
        return software.amazon.jsii.Kernel.get(this, "smsAuthenticationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSmsAuthenticationMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "smsAuthenticationMessage", java.util.Objects.requireNonNull(value, "smsAuthenticationMessage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSmsVerificationMessage() {
        return software.amazon.jsii.Kernel.get(this, "smsVerificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSmsVerificationMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "smsVerificationMessage", java.util.Objects.requireNonNull(value, "smsVerificationMessage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getUsernameAttributes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "usernameAttributes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setUsernameAttributes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "usernameAttributes", java.util.Objects.requireNonNull(value, "usernameAttributes is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cognito.CognitoUserPool}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cognito.CognitoUserPool> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.cognito.CognitoUserPoolConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cognito.CognitoUserPoolConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#name CognitoUserPool#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#name CognitoUserPool#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * account_recovery_setting block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#account_recovery_setting CognitoUserPool#account_recovery_setting}
         * <p>
         * @return {@code this}
         * @param accountRecoverySetting account_recovery_setting block. This parameter is required.
         */
        public Builder accountRecoverySetting(final imports.aws.cognito.CognitoUserPoolAccountRecoverySetting accountRecoverySetting) {
            this.config.accountRecoverySetting(accountRecoverySetting);
            return this;
        }

        /**
         * admin_create_user_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#admin_create_user_config CognitoUserPool#admin_create_user_config}
         * <p>
         * @return {@code this}
         * @param adminCreateUserConfig admin_create_user_config block. This parameter is required.
         */
        public Builder adminCreateUserConfig(final imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig adminCreateUserConfig) {
            this.config.adminCreateUserConfig(adminCreateUserConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#alias_attributes CognitoUserPool#alias_attributes}.
         * <p>
         * @return {@code this}
         * @param aliasAttributes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#alias_attributes CognitoUserPool#alias_attributes}. This parameter is required.
         */
        public Builder aliasAttributes(final java.util.List<java.lang.String> aliasAttributes) {
            this.config.aliasAttributes(aliasAttributes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#auto_verified_attributes CognitoUserPool#auto_verified_attributes}.
         * <p>
         * @return {@code this}
         * @param autoVerifiedAttributes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#auto_verified_attributes CognitoUserPool#auto_verified_attributes}. This parameter is required.
         */
        public Builder autoVerifiedAttributes(final java.util.List<java.lang.String> autoVerifiedAttributes) {
            this.config.autoVerifiedAttributes(autoVerifiedAttributes);
            return this;
        }

        /**
         * device_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#device_configuration CognitoUserPool#device_configuration}
         * <p>
         * @return {@code this}
         * @param deviceConfiguration device_configuration block. This parameter is required.
         */
        public Builder deviceConfiguration(final imports.aws.cognito.CognitoUserPoolDeviceConfiguration deviceConfiguration) {
            this.config.deviceConfiguration(deviceConfiguration);
            return this;
        }

        /**
         * email_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#email_configuration CognitoUserPool#email_configuration}
         * <p>
         * @return {@code this}
         * @param emailConfiguration email_configuration block. This parameter is required.
         */
        public Builder emailConfiguration(final imports.aws.cognito.CognitoUserPoolEmailConfiguration emailConfiguration) {
            this.config.emailConfiguration(emailConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#email_verification_message CognitoUserPool#email_verification_message}.
         * <p>
         * @return {@code this}
         * @param emailVerificationMessage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#email_verification_message CognitoUserPool#email_verification_message}. This parameter is required.
         */
        public Builder emailVerificationMessage(final java.lang.String emailVerificationMessage) {
            this.config.emailVerificationMessage(emailVerificationMessage);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#email_verification_subject CognitoUserPool#email_verification_subject}.
         * <p>
         * @return {@code this}
         * @param emailVerificationSubject Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#email_verification_subject CognitoUserPool#email_verification_subject}. This parameter is required.
         */
        public Builder emailVerificationSubject(final java.lang.String emailVerificationSubject) {
            this.config.emailVerificationSubject(emailVerificationSubject);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#id CognitoUserPool#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#id CognitoUserPool#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * lambda_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#lambda_config CognitoUserPool#lambda_config}
         * <p>
         * @return {@code this}
         * @param lambdaConfig lambda_config block. This parameter is required.
         */
        public Builder lambdaConfig(final imports.aws.cognito.CognitoUserPoolLambdaConfig lambdaConfig) {
            this.config.lambdaConfig(lambdaConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#mfa_configuration CognitoUserPool#mfa_configuration}.
         * <p>
         * @return {@code this}
         * @param mfaConfiguration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#mfa_configuration CognitoUserPool#mfa_configuration}. This parameter is required.
         */
        public Builder mfaConfiguration(final java.lang.String mfaConfiguration) {
            this.config.mfaConfiguration(mfaConfiguration);
            return this;
        }

        /**
         * password_policy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#password_policy CognitoUserPool#password_policy}
         * <p>
         * @return {@code this}
         * @param passwordPolicy password_policy block. This parameter is required.
         */
        public Builder passwordPolicy(final imports.aws.cognito.CognitoUserPoolPasswordPolicy passwordPolicy) {
            this.config.passwordPolicy(passwordPolicy);
            return this;
        }

        /**
         * schema block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#schema CognitoUserPool#schema}
         * <p>
         * @return {@code this}
         * @param schema schema block. This parameter is required.
         */
        public Builder schema(final com.hashicorp.cdktf.IResolvable schema) {
            this.config.schema(schema);
            return this;
        }
        /**
         * schema block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#schema CognitoUserPool#schema}
         * <p>
         * @return {@code this}
         * @param schema schema block. This parameter is required.
         */
        public Builder schema(final java.util.List<? extends imports.aws.cognito.CognitoUserPoolSchema> schema) {
            this.config.schema(schema);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sms_authentication_message CognitoUserPool#sms_authentication_message}.
         * <p>
         * @return {@code this}
         * @param smsAuthenticationMessage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sms_authentication_message CognitoUserPool#sms_authentication_message}. This parameter is required.
         */
        public Builder smsAuthenticationMessage(final java.lang.String smsAuthenticationMessage) {
            this.config.smsAuthenticationMessage(smsAuthenticationMessage);
            return this;
        }

        /**
         * sms_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sms_configuration CognitoUserPool#sms_configuration}
         * <p>
         * @return {@code this}
         * @param smsConfiguration sms_configuration block. This parameter is required.
         */
        public Builder smsConfiguration(final imports.aws.cognito.CognitoUserPoolSmsConfiguration smsConfiguration) {
            this.config.smsConfiguration(smsConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sms_verification_message CognitoUserPool#sms_verification_message}.
         * <p>
         * @return {@code this}
         * @param smsVerificationMessage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#sms_verification_message CognitoUserPool#sms_verification_message}. This parameter is required.
         */
        public Builder smsVerificationMessage(final java.lang.String smsVerificationMessage) {
            this.config.smsVerificationMessage(smsVerificationMessage);
            return this;
        }

        /**
         * software_token_mfa_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#software_token_mfa_configuration CognitoUserPool#software_token_mfa_configuration}
         * <p>
         * @return {@code this}
         * @param softwareTokenMfaConfiguration software_token_mfa_configuration block. This parameter is required.
         */
        public Builder softwareTokenMfaConfiguration(final imports.aws.cognito.CognitoUserPoolSoftwareTokenMfaConfiguration softwareTokenMfaConfiguration) {
            this.config.softwareTokenMfaConfiguration(softwareTokenMfaConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#tags CognitoUserPool#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#tags CognitoUserPool#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#tags_all CognitoUserPool#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#tags_all CognitoUserPool#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#username_attributes CognitoUserPool#username_attributes}.
         * <p>
         * @return {@code this}
         * @param usernameAttributes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#username_attributes CognitoUserPool#username_attributes}. This parameter is required.
         */
        public Builder usernameAttributes(final java.util.List<java.lang.String> usernameAttributes) {
            this.config.usernameAttributes(usernameAttributes);
            return this;
        }

        /**
         * username_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#username_configuration CognitoUserPool#username_configuration}
         * <p>
         * @return {@code this}
         * @param usernameConfiguration username_configuration block. This parameter is required.
         */
        public Builder usernameConfiguration(final imports.aws.cognito.CognitoUserPoolUsernameConfiguration usernameConfiguration) {
            this.config.usernameConfiguration(usernameConfiguration);
            return this;
        }

        /**
         * user_pool_add_ons block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#user_pool_add_ons CognitoUserPool#user_pool_add_ons}
         * <p>
         * @return {@code this}
         * @param userPoolAddOns user_pool_add_ons block. This parameter is required.
         */
        public Builder userPoolAddOns(final imports.aws.cognito.CognitoUserPoolUserPoolAddOns userPoolAddOns) {
            this.config.userPoolAddOns(userPoolAddOns);
            return this;
        }

        /**
         * verification_message_template block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#verification_message_template CognitoUserPool#verification_message_template}
         * <p>
         * @return {@code this}
         * @param verificationMessageTemplate verification_message_template block. This parameter is required.
         */
        public Builder verificationMessageTemplate(final imports.aws.cognito.CognitoUserPoolVerificationMessageTemplate verificationMessageTemplate) {
            this.config.verificationMessageTemplate(verificationMessageTemplate);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cognito.CognitoUserPool}.
         */
        @Override
        public imports.aws.cognito.CognitoUserPool build() {
            return new imports.aws.cognito.CognitoUserPool(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
