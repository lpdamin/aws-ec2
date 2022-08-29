package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.743Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncDatasourceElasticsearchConfigOutputReference")
public class AppsyncDatasourceElasticsearchConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncDatasourceElasticsearchConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncDatasourceElasticsearchConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncDatasourceElasticsearchConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpoint", java.util.Objects.requireNonNull(value, "endpoint is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceElasticsearchConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceElasticsearchConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceElasticsearchConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
