package imports.aws.secretsmanager;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.559Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.secretsmanager.SecretsmanagerSecretRotationRotationRulesOutputReference")
public class SecretsmanagerSecretRotationRotationRulesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SecretsmanagerSecretRotationRotationRulesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SecretsmanagerSecretRotationRotationRulesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SecretsmanagerSecretRotationRotationRulesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAutomaticallyAfterDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "automaticallyAfterDaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAutomaticallyAfterDays() {
        return software.amazon.jsii.Kernel.get(this, "automaticallyAfterDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAutomaticallyAfterDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "automaticallyAfterDays", java.util.Objects.requireNonNull(value, "automaticallyAfterDays is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.secretsmanager.SecretsmanagerSecretRotationRotationRules value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
