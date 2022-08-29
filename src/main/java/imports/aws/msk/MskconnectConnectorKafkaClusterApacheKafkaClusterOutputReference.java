package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.986Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference")
public class MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putVpc(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc value) {
        software.amazon.jsii.Kernel.call(this, "putVpc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpcOutputReference getVpc() {
        return software.amazon.jsii.Kernel.get(this, "vpc", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpcOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBootstrapServersInput() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapServersInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc getVpcInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapServers() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapServers", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBootstrapServers(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bootstrapServers", java.util.Objects.requireNonNull(value, "bootstrapServers is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
