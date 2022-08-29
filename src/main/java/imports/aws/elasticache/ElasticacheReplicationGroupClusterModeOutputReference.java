package imports.aws.elasticache;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.975Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticache.ElasticacheReplicationGroupClusterModeOutputReference")
public class ElasticacheReplicationGroupClusterModeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ElasticacheReplicationGroupClusterModeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElasticacheReplicationGroupClusterModeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ElasticacheReplicationGroupClusterModeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetNumNodeGroups() {
        software.amazon.jsii.Kernel.call(this, "resetNumNodeGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicasPerNodeGroup() {
        software.amazon.jsii.Kernel.call(this, "resetReplicasPerNodeGroup", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumNodeGroupsInput() {
        return software.amazon.jsii.Kernel.get(this, "numNodeGroupsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getReplicasPerNodeGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "replicasPerNodeGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumNodeGroups() {
        return software.amazon.jsii.Kernel.get(this, "numNodeGroups", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumNodeGroups(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numNodeGroups", java.util.Objects.requireNonNull(value, "numNodeGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getReplicasPerNodeGroup() {
        return software.amazon.jsii.Kernel.get(this, "replicasPerNodeGroup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReplicasPerNodeGroup(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "replicasPerNodeGroup", java.util.Objects.requireNonNull(value, "replicasPerNodeGroup is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elasticache.ElasticacheReplicationGroupClusterMode getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.elasticache.ElasticacheReplicationGroupClusterMode.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elasticache.ElasticacheReplicationGroupClusterMode value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
