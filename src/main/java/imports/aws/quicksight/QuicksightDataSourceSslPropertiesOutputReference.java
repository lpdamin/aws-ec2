package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.196Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceSslPropertiesOutputReference")
public class QuicksightDataSourceSslPropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceSslPropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceSslPropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceSslPropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisableSslInput() {
        return software.amazon.jsii.Kernel.get(this, "disableSslInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisableSsl() {
        return software.amazon.jsii.Kernel.get(this, "disableSsl", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisableSsl(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableSsl", java.util.Objects.requireNonNull(value, "disableSsl is required"));
    }

    public void setDisableSsl(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disableSsl", java.util.Objects.requireNonNull(value, "disableSsl is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceSslProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceSslProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceSslProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
