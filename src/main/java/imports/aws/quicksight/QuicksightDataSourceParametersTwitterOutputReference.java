package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.196Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersTwitterOutputReference")
public class QuicksightDataSourceParametersTwitterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceParametersTwitterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceParametersTwitterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceParametersTwitterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxRowsInput() {
        return software.amazon.jsii.Kernel.get(this, "maxRowsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQueryInput() {
        return software.amazon.jsii.Kernel.get(this, "queryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxRows() {
        return software.amazon.jsii.Kernel.get(this, "maxRows", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxRows(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxRows", java.util.Objects.requireNonNull(value, "maxRows is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQuery() {
        return software.amazon.jsii.Kernel.get(this, "query", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQuery(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "query", java.util.Objects.requireNonNull(value, "query is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersTwitter getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersTwitter.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersTwitter value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
