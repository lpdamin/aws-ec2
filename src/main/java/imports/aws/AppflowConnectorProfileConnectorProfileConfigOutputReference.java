package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.991Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigOutputReference")
public class AppflowConnectorProfileConnectorProfileConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowConnectorProfileConnectorProfileConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowConnectorProfileConnectorProfileConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowConnectorProfileConnectorProfileConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConnectorProfileCredentials(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials value) {
        software.amazon.jsii.Kernel.call(this, "putConnectorProfileCredentials", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConnectorProfileProperties(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties value) {
        software.amazon.jsii.Kernel.call(this, "putConnectorProfileProperties", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsOutputReference getConnectorProfileCredentials() {
        return software.amazon.jsii.Kernel.get(this, "connectorProfileCredentials", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesOutputReference getConnectorProfileProperties() {
        return software.amazon.jsii.Kernel.get(this, "connectorProfileProperties", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials getConnectorProfileCredentialsInput() {
        return software.amazon.jsii.Kernel.get(this, "connectorProfileCredentialsInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties getConnectorProfilePropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "connectorProfilePropertiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
