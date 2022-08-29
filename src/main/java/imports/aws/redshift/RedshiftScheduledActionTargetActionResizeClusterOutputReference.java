package imports.aws.redshift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.297Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.RedshiftScheduledActionTargetActionResizeClusterOutputReference")
public class RedshiftScheduledActionTargetActionResizeClusterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected RedshiftScheduledActionTargetActionResizeClusterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RedshiftScheduledActionTargetActionResizeClusterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public RedshiftScheduledActionTargetActionResizeClusterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetClassic() {
        software.amazon.jsii.Kernel.call(this, "resetClassic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClusterType() {
        software.amazon.jsii.Kernel.call(this, "resetClusterType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNodeType() {
        software.amazon.jsii.Kernel.call(this, "resetNodeType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNumberOfNodes() {
        software.amazon.jsii.Kernel.call(this, "resetNumberOfNodes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getClassicInput() {
        return software.amazon.jsii.Kernel.get(this, "classicInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNodeTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "nodeTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfNodesInput() {
        return software.amazon.jsii.Kernel.get(this, "numberOfNodesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getClassic() {
        return software.amazon.jsii.Kernel.get(this, "classic", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setClassic(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "classic", java.util.Objects.requireNonNull(value, "classic is required"));
    }

    public void setClassic(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "classic", java.util.Objects.requireNonNull(value, "classic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterIdentifier", java.util.Objects.requireNonNull(value, "clusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterType() {
        return software.amazon.jsii.Kernel.get(this, "clusterType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterType", java.util.Objects.requireNonNull(value, "clusterType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeType() {
        return software.amazon.jsii.Kernel.get(this, "nodeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNodeType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nodeType", java.util.Objects.requireNonNull(value, "nodeType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfNodes() {
        return software.amazon.jsii.Kernel.get(this, "numberOfNodes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfNodes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfNodes", java.util.Objects.requireNonNull(value, "numberOfNodes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
