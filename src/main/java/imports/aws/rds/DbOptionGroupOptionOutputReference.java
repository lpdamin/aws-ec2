package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.240Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.DbOptionGroupOptionOutputReference")
public class DbOptionGroupOptionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DbOptionGroupOptionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DbOptionGroupOptionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DbOptionGroupOptionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putOptionSettings(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOptionSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDbSecurityGroupMemberships() {
        software.amazon.jsii.Kernel.call(this, "resetDbSecurityGroupMemberships", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOptionSettings() {
        software.amazon.jsii.Kernel.call(this, "resetOptionSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcSecurityGroupMemberships() {
        software.amazon.jsii.Kernel.call(this, "resetVpcSecurityGroupMemberships", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.rds.DbOptionGroupOptionOptionSettingsList getOptionSettings() {
        return software.amazon.jsii.Kernel.get(this, "optionSettings", software.amazon.jsii.NativeType.forClass(imports.aws.rds.DbOptionGroupOptionOptionSettingsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDbSecurityGroupMembershipsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "dbSecurityGroupMembershipsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOptionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "optionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOptionSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "optionSettingsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupMembershipsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupMembershipsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDbSecurityGroupMemberships() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dbSecurityGroupMemberships", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDbSecurityGroupMemberships(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "dbSecurityGroupMemberships", java.util.Objects.requireNonNull(value, "dbSecurityGroupMemberships is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOptionName() {
        return software.amazon.jsii.Kernel.get(this, "optionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOptionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "optionName", java.util.Objects.requireNonNull(value, "optionName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcSecurityGroupMemberships() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupMemberships", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVpcSecurityGroupMemberships(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupMemberships", java.util.Objects.requireNonNull(value, "vpcSecurityGroupMemberships is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.rds.DbOptionGroupOption value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
