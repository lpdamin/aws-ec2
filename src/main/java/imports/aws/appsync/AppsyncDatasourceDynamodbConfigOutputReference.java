package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.720Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncDatasourceDynamodbConfigOutputReference")
public class AppsyncDatasourceDynamodbConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncDatasourceDynamodbConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncDatasourceDynamodbConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncDatasourceDynamodbConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDeltaSyncConfig(final @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceDynamodbConfigDeltaSyncConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDeltaSyncConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDeltaSyncConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDeltaSyncConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseCallerCredentials() {
        software.amazon.jsii.Kernel.call(this, "resetUseCallerCredentials", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersioned() {
        software.amazon.jsii.Kernel.call(this, "resetVersioned", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appsync.AppsyncDatasourceDynamodbConfigDeltaSyncConfigOutputReference getDeltaSyncConfig() {
        return software.amazon.jsii.Kernel.get(this, "deltaSyncConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceDynamodbConfigDeltaSyncConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceDynamodbConfigDeltaSyncConfig getDeltaSyncConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "deltaSyncConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceDynamodbConfigDeltaSyncConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTableNameInput() {
        return software.amazon.jsii.Kernel.get(this, "tableNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseCallerCredentialsInput() {
        return software.amazon.jsii.Kernel.get(this, "useCallerCredentialsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getVersionedInput() {
        return software.amazon.jsii.Kernel.get(this, "versionedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableName() {
        return software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTableName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tableName", java.util.Objects.requireNonNull(value, "tableName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getUseCallerCredentials() {
        return software.amazon.jsii.Kernel.get(this, "useCallerCredentials", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseCallerCredentials(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useCallerCredentials", java.util.Objects.requireNonNull(value, "useCallerCredentials is required"));
    }

    public void setUseCallerCredentials(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useCallerCredentials", java.util.Objects.requireNonNull(value, "useCallerCredentials is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getVersioned() {
        return software.amazon.jsii.Kernel.get(this, "versioned", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setVersioned(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "versioned", java.util.Objects.requireNonNull(value, "versioned is required"));
    }

    public void setVersioned(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "versioned", java.util.Objects.requireNonNull(value, "versioned is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceDynamodbConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncDatasourceDynamodbConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncDatasourceDynamodbConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
