package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.193Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersJiraOutputReference")
public class QuicksightDataSourceParametersJiraOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceParametersJiraOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceParametersJiraOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceParametersJiraOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSiteBaseUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "siteBaseUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSiteBaseUrl() {
        return software.amazon.jsii.Kernel.get(this, "siteBaseUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSiteBaseUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "siteBaseUrl", java.util.Objects.requireNonNull(value, "siteBaseUrl is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersJira getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersJira.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersJira value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
