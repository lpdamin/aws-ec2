package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.743Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigOutputReference")
public class AppsyncDatasourceHttpConfigAuthorizationConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncDatasourceHttpConfigAuthorizationConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncDatasourceHttpConfigAuthorizationConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncDatasourceHttpConfigAuthorizationConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAwsIamConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfig value) {
        software.amazon.jsii.Kernel.call(this, "putAwsIamConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAuthorizationType() {
        software.amazon.jsii.Kernel.call(this, "resetAuthorizationType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAwsIamConfig() {
        software.amazon.jsii.Kernel.call(this, "resetAwsIamConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference getAwsIamConfig() {
        return software.amazon.jsii.Kernel.get(this, "awsIamConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfig getAwsIamConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "awsIamConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationType() {
        return software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizationType", java.util.Objects.requireNonNull(value, "authorizationType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
