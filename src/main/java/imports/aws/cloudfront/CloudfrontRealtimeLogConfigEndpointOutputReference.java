package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.247Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontRealtimeLogConfigEndpointOutputReference")
public class CloudfrontRealtimeLogConfigEndpointOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontRealtimeLogConfigEndpointOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontRealtimeLogConfigEndpointOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontRealtimeLogConfigEndpointOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putKinesisStreamConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpointKinesisStreamConfig value) {
        software.amazon.jsii.Kernel.call(this, "putKinesisStreamConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpointKinesisStreamConfigOutputReference getKinesisStreamConfig() {
        return software.amazon.jsii.Kernel.get(this, "kinesisStreamConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpointKinesisStreamConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpointKinesisStreamConfig getKinesisStreamConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisStreamConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpointKinesisStreamConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStreamTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "streamTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamType() {
        return software.amazon.jsii.Kernel.get(this, "streamType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStreamType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "streamType", java.util.Objects.requireNonNull(value, "streamType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpoint getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpoint.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontRealtimeLogConfigEndpoint value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
