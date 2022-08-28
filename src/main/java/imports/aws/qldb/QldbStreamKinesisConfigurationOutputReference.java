package imports.aws.qldb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.158Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.qldb.QldbStreamKinesisConfigurationOutputReference")
public class QldbStreamKinesisConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QldbStreamKinesisConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QldbStreamKinesisConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QldbStreamKinesisConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAggregationEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetAggregationEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAggregationEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "aggregationEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStreamArnInput() {
        return software.amazon.jsii.Kernel.get(this, "streamArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAggregationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "aggregationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAggregationEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "aggregationEnabled", java.util.Objects.requireNonNull(value, "aggregationEnabled is required"));
    }

    public void setAggregationEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "aggregationEnabled", java.util.Objects.requireNonNull(value, "aggregationEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamArn() {
        return software.amazon.jsii.Kernel.get(this, "streamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStreamArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "streamArn", java.util.Objects.requireNonNull(value, "streamArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.qldb.QldbStreamKinesisConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.qldb.QldbStreamKinesisConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.qldb.QldbStreamKinesisConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
