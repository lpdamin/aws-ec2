package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.463Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3ControlObjectLambdaAccessPointConfigurationOutputReference")
public class S3ControlObjectLambdaAccessPointConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3ControlObjectLambdaAccessPointConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3ControlObjectLambdaAccessPointConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3ControlObjectLambdaAccessPointConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTransformationConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTransformationConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllowedFeatures() {
        software.amazon.jsii.Kernel.call(this, "resetAllowedFeatures", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudWatchMetricsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetCloudWatchMetricsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationList getTransformationConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "transformationConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedFeaturesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "allowedFeaturesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCloudWatchMetricsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudWatchMetricsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSupportingAccessPointInput() {
        return software.amazon.jsii.Kernel.get(this, "supportingAccessPointInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTransformationConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "transformationConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAllowedFeatures() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "allowedFeatures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAllowedFeatures(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "allowedFeatures", java.util.Objects.requireNonNull(value, "allowedFeatures is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCloudWatchMetricsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "cloudWatchMetricsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCloudWatchMetricsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "cloudWatchMetricsEnabled", java.util.Objects.requireNonNull(value, "cloudWatchMetricsEnabled is required"));
    }

    public void setCloudWatchMetricsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "cloudWatchMetricsEnabled", java.util.Objects.requireNonNull(value, "cloudWatchMetricsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSupportingAccessPoint() {
        return software.amazon.jsii.Kernel.get(this, "supportingAccessPoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSupportingAccessPoint(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "supportingAccessPoint", java.util.Objects.requireNonNull(value, "supportingAccessPoint is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3ControlObjectLambdaAccessPointConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlObjectLambdaAccessPointConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3ControlObjectLambdaAccessPointConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
