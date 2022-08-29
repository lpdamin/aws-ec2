package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.397Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference")
public class ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLaunchPermission(final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission value) {
        software.amazon.jsii.Kernel.call(this, "putLaunchPermission", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAmiTags() {
        software.amazon.jsii.Kernel.call(this, "resetAmiTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLaunchPermission() {
        software.amazon.jsii.Kernel.call(this, "resetLaunchPermission", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetAccountIds() {
        software.amazon.jsii.Kernel.call(this, "resetTargetAccountIds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionOutputReference getLaunchPermission() {
        return software.amazon.jsii.Kernel.get(this, "launchPermission", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAmiTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "amiTagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission getLaunchPermissionInput() {
        return software.amazon.jsii.Kernel.get(this, "launchPermissionInput", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTargetAccountIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "targetAccountIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getAmiTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "amiTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAmiTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "amiTags", java.util.Objects.requireNonNull(value, "amiTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTargetAccountIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "targetAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTargetAccountIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "targetAccountIds", java.util.Objects.requireNonNull(value, "targetAccountIds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
