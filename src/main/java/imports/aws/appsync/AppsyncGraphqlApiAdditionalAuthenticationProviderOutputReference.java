package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.752Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOutputReference")
public class AppsyncGraphqlApiAdditionalAuthenticationProviderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncGraphqlApiAdditionalAuthenticationProviderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncGraphqlApiAdditionalAuthenticationProviderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public AppsyncGraphqlApiAdditionalAuthenticationProviderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putLambdaAuthorizerConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderLambdaAuthorizerConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLambdaAuthorizerConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOpenidConnectConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig value) {
        software.amazon.jsii.Kernel.call(this, "putOpenidConnectConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserPoolConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig value) {
        software.amazon.jsii.Kernel.call(this, "putUserPoolConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetLambdaAuthorizerConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLambdaAuthorizerConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOpenidConnectConfig() {
        software.amazon.jsii.Kernel.call(this, "resetOpenidConnectConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserPoolConfig() {
        software.amazon.jsii.Kernel.call(this, "resetUserPoolConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderLambdaAuthorizerConfigOutputReference getLambdaAuthorizerConfig() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAuthorizerConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderLambdaAuthorizerConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference getOpenidConnectConfig() {
        return software.amazon.jsii.Kernel.get(this, "openidConnectConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfigOutputReference getUserPoolConfig() {
        return software.amazon.jsii.Kernel.get(this, "userPoolConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthenticationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderLambdaAuthorizerConfig getLambdaAuthorizerConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAuthorizerConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderLambdaAuthorizerConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig getOpenidConnectConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "openidConnectConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig getUserPoolConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "userPoolConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderUserPoolConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType() {
        return software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthenticationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authenticationType", java.util.Objects.requireNonNull(value, "authenticationType is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProvider value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
