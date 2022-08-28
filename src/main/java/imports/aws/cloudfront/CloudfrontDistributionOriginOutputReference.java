package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.201Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionOriginOutputReference")
public class CloudfrontDistributionOriginOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontDistributionOriginOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistributionOriginOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CloudfrontDistributionOriginOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putCustomHeader(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCustomHeader", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustomOriginConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig value) {
        software.amazon.jsii.Kernel.call(this, "putCustomOriginConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOriginShield(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield value) {
        software.amazon.jsii.Kernel.call(this, "putOriginShield", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3OriginConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig value) {
        software.amazon.jsii.Kernel.call(this, "putS3OriginConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConnectionAttempts() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionAttempts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConnectionTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetConnectionTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomHeader() {
        software.amazon.jsii.Kernel.call(this, "resetCustomHeader", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomOriginConfig() {
        software.amazon.jsii.Kernel.call(this, "resetCustomOriginConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOriginPath() {
        software.amazon.jsii.Kernel.call(this, "resetOriginPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOriginShield() {
        software.amazon.jsii.Kernel.call(this, "resetOriginShield", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3OriginConfig() {
        software.amazon.jsii.Kernel.call(this, "resetS3OriginConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginCustomHeaderList getCustomHeader() {
        return software.amazon.jsii.Kernel.get(this, "customHeader", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginCustomHeaderList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfigOutputReference getCustomOriginConfig() {
        return software.amazon.jsii.Kernel.get(this, "customOriginConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginOriginShieldOutputReference getOriginShield() {
        return software.amazon.jsii.Kernel.get(this, "originShield", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginOriginShieldOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfigOutputReference getS3OriginConfig() {
        return software.amazon.jsii.Kernel.get(this, "s3OriginConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getConnectionAttemptsInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionAttemptsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getConnectionTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "connectionTimeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCustomHeaderInput() {
        return software.amazon.jsii.Kernel.get(this, "customHeaderInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig getCustomOriginConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "customOriginConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginCustomOriginConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOriginIdInput() {
        return software.amazon.jsii.Kernel.get(this, "originIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOriginPathInput() {
        return software.amazon.jsii.Kernel.get(this, "originPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield getOriginShieldInput() {
        return software.amazon.jsii.Kernel.get(this, "originShieldInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginOriginShield.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig getS3OriginConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "s3OriginConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionOriginS3OriginConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getConnectionAttempts() {
        return software.amazon.jsii.Kernel.get(this, "connectionAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setConnectionAttempts(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "connectionAttempts", java.util.Objects.requireNonNull(value, "connectionAttempts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getConnectionTimeout() {
        return software.amazon.jsii.Kernel.get(this, "connectionTimeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setConnectionTimeout(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "connectionTimeout", java.util.Objects.requireNonNull(value, "connectionTimeout is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainName", java.util.Objects.requireNonNull(value, "domainName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOriginId() {
        return software.amazon.jsii.Kernel.get(this, "originId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOriginId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "originId", java.util.Objects.requireNonNull(value, "originId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOriginPath() {
        return software.amazon.jsii.Kernel.get(this, "originPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOriginPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "originPath", java.util.Objects.requireNonNull(value, "originPath is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionOrigin value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
