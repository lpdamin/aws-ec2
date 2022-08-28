package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.407Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsTaskDefinitionEphemeralStorageOutputReference")
public class EcsTaskDefinitionEphemeralStorageOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EcsTaskDefinitionEphemeralStorageOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsTaskDefinitionEphemeralStorageOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EcsTaskDefinitionEphemeralStorageOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSizeInGibInput() {
        return software.amazon.jsii.Kernel.get(this, "sizeInGibInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSizeInGib() {
        return software.amazon.jsii.Kernel.get(this, "sizeInGib", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSizeInGib(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "sizeInGib", java.util.Objects.requireNonNull(value, "sizeInGib is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionEphemeralStorage getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionEphemeralStorage.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionEphemeralStorage value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
