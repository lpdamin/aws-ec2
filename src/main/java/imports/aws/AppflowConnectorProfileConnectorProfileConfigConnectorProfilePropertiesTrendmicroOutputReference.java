package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.990Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroOutputReference")
public class AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicro getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicro.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicro value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
