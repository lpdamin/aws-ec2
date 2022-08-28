package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.411Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsTaskDefinitionVolumeOutputReference")
public class EcsTaskDefinitionVolumeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EcsTaskDefinitionVolumeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsTaskDefinitionVolumeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public EcsTaskDefinitionVolumeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putDockerVolumeConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putDockerVolumeConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEfsVolumeConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putEfsVolumeConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFsxWindowsFileServerVolumeConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putFsxWindowsFileServerVolumeConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDockerVolumeConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetDockerVolumeConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEfsVolumeConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEfsVolumeConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFsxWindowsFileServerVolumeConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetFsxWindowsFileServerVolumeConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHostPath() {
        software.amazon.jsii.Kernel.call(this, "resetHostPath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfigurationOutputReference getDockerVolumeConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "dockerVolumeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfigurationOutputReference getEfsVolumeConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "efsVolumeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationOutputReference getFsxWindowsFileServerVolumeConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "fsxWindowsFileServerVolumeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration getDockerVolumeConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "dockerVolumeConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration getEfsVolumeConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "efsVolumeConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration getFsxWindowsFileServerVolumeConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "fsxWindowsFileServerVolumeConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostPathInput() {
        return software.amazon.jsii.Kernel.get(this, "hostPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostPath() {
        return software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostPath", java.util.Objects.requireNonNull(value, "hostPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolume value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
