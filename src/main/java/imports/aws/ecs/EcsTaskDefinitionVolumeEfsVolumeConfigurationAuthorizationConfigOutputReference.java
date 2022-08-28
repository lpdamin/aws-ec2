package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.411Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigOutputReference")
public class EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAccessPointId() {
        software.amazon.jsii.Kernel.call(this, "resetAccessPointId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIam() {
        software.amazon.jsii.Kernel.call(this, "resetIam", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessPointIdInput() {
        return software.amazon.jsii.Kernel.get(this, "accessPointIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamInput() {
        return software.amazon.jsii.Kernel.get(this, "iamInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessPointId() {
        return software.amazon.jsii.Kernel.get(this, "accessPointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessPointId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessPointId", java.util.Objects.requireNonNull(value, "accessPointId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIam() {
        return software.amazon.jsii.Kernel.get(this, "iam", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIam(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iam", java.util.Objects.requireNonNull(value, "iam is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
