package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.264Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.DataAwsConnectBotAssociationLexBotOutputReference")
public class DataAwsConnectBotAssociationLexBotOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsConnectBotAssociationLexBotOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsConnectBotAssociationLexBotOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DataAwsConnectBotAssociationLexBotOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetLexRegion() {
        software.amazon.jsii.Kernel.call(this, "resetLexRegion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLexRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "lexRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLexRegion() {
        return software.amazon.jsii.Kernel.get(this, "lexRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLexRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lexRegion", java.util.Objects.requireNonNull(value, "lexRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.connect.DataAwsConnectBotAssociationLexBot getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.connect.DataAwsConnectBotAssociationLexBot.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.connect.DataAwsConnectBotAssociationLexBot value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
