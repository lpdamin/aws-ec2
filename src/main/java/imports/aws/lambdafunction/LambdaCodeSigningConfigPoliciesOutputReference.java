package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.718Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaCodeSigningConfigPoliciesOutputReference")
public class LambdaCodeSigningConfigPoliciesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LambdaCodeSigningConfigPoliciesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaCodeSigningConfigPoliciesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LambdaCodeSigningConfigPoliciesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUntrustedArtifactOnDeploymentInput() {
        return software.amazon.jsii.Kernel.get(this, "untrustedArtifactOnDeploymentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUntrustedArtifactOnDeployment() {
        return software.amazon.jsii.Kernel.get(this, "untrustedArtifactOnDeployment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUntrustedArtifactOnDeployment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "untrustedArtifactOnDeployment", java.util.Objects.requireNonNull(value, "untrustedArtifactOnDeployment is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaCodeSigningConfigPolicies getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaCodeSigningConfigPolicies.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaCodeSigningConfigPolicies value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
