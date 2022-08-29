package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.743Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference")
public class AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSigningRegion() {
        software.amazon.jsii.Kernel.call(this, "resetSigningRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSigningServiceName() {
        software.amazon.jsii.Kernel.call(this, "resetSigningServiceName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSigningRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "signingRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSigningServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "signingServiceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSigningRegion() {
        return software.amazon.jsii.Kernel.get(this, "signingRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSigningRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "signingRegion", java.util.Objects.requireNonNull(value, "signingRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSigningServiceName() {
        return software.amazon.jsii.Kernel.get(this, "signingServiceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSigningServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "signingServiceName", java.util.Objects.requireNonNull(value, "signingServiceName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceHttpConfigAuthorizationConfigAwsIamConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
