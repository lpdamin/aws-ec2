package imports.aws.mq;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/mq_broker aws_mq_broker}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.936Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.mq.MqBroker")
public class MqBroker extends com.hashicorp.cdktf.TerraformResource {

    protected MqBroker(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MqBroker(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.mq.MqBroker.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/mq_broker aws_mq_broker} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public MqBroker(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEncryptionOptions(final @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerEncryptionOptions value) {
        software.amazon.jsii.Kernel.call(this, "putEncryptionOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLdapServerMetadata(final @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerLdapServerMetadata value) {
        software.amazon.jsii.Kernel.call(this, "putLdapServerMetadata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogs(final @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerLogs value) {
        software.amazon.jsii.Kernel.call(this, "putLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMaintenanceWindowStartTime(final @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerMaintenanceWindowStartTime value) {
        software.amazon.jsii.Kernel.call(this, "putMaintenanceWindowStartTime", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUser(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putUser", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetApplyImmediately() {
        software.amazon.jsii.Kernel.call(this, "resetApplyImmediately", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthenticationStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetAuthenticationStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoMinorVersionUpgrade() {
        software.amazon.jsii.Kernel.call(this, "resetAutoMinorVersionUpgrade", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeploymentMode() {
        software.amazon.jsii.Kernel.call(this, "resetDeploymentMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionOptions() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionOptions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLdapServerMetadata() {
        software.amazon.jsii.Kernel.call(this, "resetLdapServerMetadata", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogs() {
        software.amazon.jsii.Kernel.call(this, "resetLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaintenanceWindowStartTime() {
        software.amazon.jsii.Kernel.call(this, "resetMaintenanceWindowStartTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPubliclyAccessible() {
        software.amazon.jsii.Kernel.call(this, "resetPubliclyAccessible", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageType() {
        software.amazon.jsii.Kernel.call(this, "resetStorageType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnetIds() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerConfigurationOutputReference getConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "configuration", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerEncryptionOptionsOutputReference getEncryptionOptions() {
        return software.amazon.jsii.Kernel.get(this, "encryptionOptions", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerEncryptionOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerInstancesList getInstances() {
        return software.amazon.jsii.Kernel.get(this, "instances", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerInstancesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerLdapServerMetadataOutputReference getLdapServerMetadata() {
        return software.amazon.jsii.Kernel.get(this, "ldapServerMetadata", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerLdapServerMetadataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerLogsOutputReference getLogs() {
        return software.amazon.jsii.Kernel.get(this, "logs", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerMaintenanceWindowStartTimeOutputReference getMaintenanceWindowStartTime() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceWindowStartTime", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerMaintenanceWindowStartTimeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.mq.MqBrokerUserList getUser() {
        return software.amazon.jsii.Kernel.get(this, "user", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerUserList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getApplyImmediatelyInput() {
        return software.amazon.jsii.Kernel.get(this, "applyImmediatelyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthenticationStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoMinorVersionUpgradeInput() {
        return software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgradeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBrokerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "brokerNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerConfiguration getConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeploymentModeInput() {
        return software.amazon.jsii.Kernel.get(this, "deploymentModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerEncryptionOptions getEncryptionOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerEncryptionOptions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "engineTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "engineVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "hostInstanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerLdapServerMetadata getLdapServerMetadataInput() {
        return software.amazon.jsii.Kernel.get(this, "ldapServerMetadataInput", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerLdapServerMetadata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerLogs getLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "logsInput", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.mq.MqBrokerMaintenanceWindowStartTime getMaintenanceWindowStartTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceWindowStartTimeInput", software.amazon.jsii.NativeType.forClass(imports.aws.mq.MqBrokerMaintenanceWindowStartTime.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPubliclyAccessibleInput() {
        return software.amazon.jsii.Kernel.get(this, "publiclyAccessibleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "storageTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUserInput() {
        return software.amazon.jsii.Kernel.get(this, "userInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getApplyImmediately() {
        return software.amazon.jsii.Kernel.get(this, "applyImmediately", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setApplyImmediately(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "applyImmediately", java.util.Objects.requireNonNull(value, "applyImmediately is required"));
    }

    public void setApplyImmediately(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "applyImmediately", java.util.Objects.requireNonNull(value, "applyImmediately is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationStrategy() {
        return software.amazon.jsii.Kernel.get(this, "authenticationStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthenticationStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authenticationStrategy", java.util.Objects.requireNonNull(value, "authenticationStrategy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoMinorVersionUpgrade() {
        return software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoMinorVersionUpgrade(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoMinorVersionUpgrade", java.util.Objects.requireNonNull(value, "autoMinorVersionUpgrade is required"));
    }

    public void setAutoMinorVersionUpgrade(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoMinorVersionUpgrade", java.util.Objects.requireNonNull(value, "autoMinorVersionUpgrade is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBrokerName() {
        return software.amazon.jsii.Kernel.get(this, "brokerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBrokerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "brokerName", java.util.Objects.requireNonNull(value, "brokerName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeploymentMode() {
        return software.amazon.jsii.Kernel.get(this, "deploymentMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeploymentMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deploymentMode", java.util.Objects.requireNonNull(value, "deploymentMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineType() {
        return software.amazon.jsii.Kernel.get(this, "engineType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineType", java.util.Objects.requireNonNull(value, "engineType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineVersion", java.util.Objects.requireNonNull(value, "engineVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "hostInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostInstanceType", java.util.Objects.requireNonNull(value, "hostInstanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPubliclyAccessible() {
        return software.amazon.jsii.Kernel.get(this, "publiclyAccessible", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPubliclyAccessible(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publiclyAccessible", java.util.Objects.requireNonNull(value, "publiclyAccessible is required"));
    }

    public void setPubliclyAccessible(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "publiclyAccessible", java.util.Objects.requireNonNull(value, "publiclyAccessible is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageType() {
        return software.amazon.jsii.Kernel.get(this, "storageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageType", java.util.Objects.requireNonNull(value, "storageType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnetIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnetIds", java.util.Objects.requireNonNull(value, "subnetIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.mq.MqBroker}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.mq.MqBroker> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.mq.MqBrokerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.mq.MqBrokerConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#broker_name MqBroker#broker_name}.
         * <p>
         * @return {@code this}
         * @param brokerName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#broker_name MqBroker#broker_name}. This parameter is required.
         */
        public Builder brokerName(final java.lang.String brokerName) {
            this.config.brokerName(brokerName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#engine_type MqBroker#engine_type}.
         * <p>
         * @return {@code this}
         * @param engineType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#engine_type MqBroker#engine_type}. This parameter is required.
         */
        public Builder engineType(final java.lang.String engineType) {
            this.config.engineType(engineType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#engine_version MqBroker#engine_version}.
         * <p>
         * @return {@code this}
         * @param engineVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#engine_version MqBroker#engine_version}. This parameter is required.
         */
        public Builder engineVersion(final java.lang.String engineVersion) {
            this.config.engineVersion(engineVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#host_instance_type MqBroker#host_instance_type}.
         * <p>
         * @return {@code this}
         * @param hostInstanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#host_instance_type MqBroker#host_instance_type}. This parameter is required.
         */
        public Builder hostInstanceType(final java.lang.String hostInstanceType) {
            this.config.hostInstanceType(hostInstanceType);
            return this;
        }

        /**
         * user block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#user MqBroker#user}
         * <p>
         * @return {@code this}
         * @param user user block. This parameter is required.
         */
        public Builder user(final com.hashicorp.cdktf.IResolvable user) {
            this.config.user(user);
            return this;
        }
        /**
         * user block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#user MqBroker#user}
         * <p>
         * @return {@code this}
         * @param user user block. This parameter is required.
         */
        public Builder user(final java.util.List<? extends imports.aws.mq.MqBrokerUser> user) {
            this.config.user(user);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#apply_immediately MqBroker#apply_immediately}.
         * <p>
         * @return {@code this}
         * @param applyImmediately Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#apply_immediately MqBroker#apply_immediately}. This parameter is required.
         */
        public Builder applyImmediately(final java.lang.Boolean applyImmediately) {
            this.config.applyImmediately(applyImmediately);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#apply_immediately MqBroker#apply_immediately}.
         * <p>
         * @return {@code this}
         * @param applyImmediately Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#apply_immediately MqBroker#apply_immediately}. This parameter is required.
         */
        public Builder applyImmediately(final com.hashicorp.cdktf.IResolvable applyImmediately) {
            this.config.applyImmediately(applyImmediately);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#authentication_strategy MqBroker#authentication_strategy}.
         * <p>
         * @return {@code this}
         * @param authenticationStrategy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#authentication_strategy MqBroker#authentication_strategy}. This parameter is required.
         */
        public Builder authenticationStrategy(final java.lang.String authenticationStrategy) {
            this.config.authenticationStrategy(authenticationStrategy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#auto_minor_version_upgrade MqBroker#auto_minor_version_upgrade}.
         * <p>
         * @return {@code this}
         * @param autoMinorVersionUpgrade Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#auto_minor_version_upgrade MqBroker#auto_minor_version_upgrade}. This parameter is required.
         */
        public Builder autoMinorVersionUpgrade(final java.lang.Boolean autoMinorVersionUpgrade) {
            this.config.autoMinorVersionUpgrade(autoMinorVersionUpgrade);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#auto_minor_version_upgrade MqBroker#auto_minor_version_upgrade}.
         * <p>
         * @return {@code this}
         * @param autoMinorVersionUpgrade Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#auto_minor_version_upgrade MqBroker#auto_minor_version_upgrade}. This parameter is required.
         */
        public Builder autoMinorVersionUpgrade(final com.hashicorp.cdktf.IResolvable autoMinorVersionUpgrade) {
            this.config.autoMinorVersionUpgrade(autoMinorVersionUpgrade);
            return this;
        }

        /**
         * configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#configuration MqBroker#configuration}
         * <p>
         * @return {@code this}
         * @param configuration configuration block. This parameter is required.
         */
        public Builder configuration(final imports.aws.mq.MqBrokerConfiguration configuration) {
            this.config.configuration(configuration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#deployment_mode MqBroker#deployment_mode}.
         * <p>
         * @return {@code this}
         * @param deploymentMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#deployment_mode MqBroker#deployment_mode}. This parameter is required.
         */
        public Builder deploymentMode(final java.lang.String deploymentMode) {
            this.config.deploymentMode(deploymentMode);
            return this;
        }

        /**
         * encryption_options block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#encryption_options MqBroker#encryption_options}
         * <p>
         * @return {@code this}
         * @param encryptionOptions encryption_options block. This parameter is required.
         */
        public Builder encryptionOptions(final imports.aws.mq.MqBrokerEncryptionOptions encryptionOptions) {
            this.config.encryptionOptions(encryptionOptions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#id MqBroker#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#id MqBroker#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * ldap_server_metadata block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#ldap_server_metadata MqBroker#ldap_server_metadata}
         * <p>
         * @return {@code this}
         * @param ldapServerMetadata ldap_server_metadata block. This parameter is required.
         */
        public Builder ldapServerMetadata(final imports.aws.mq.MqBrokerLdapServerMetadata ldapServerMetadata) {
            this.config.ldapServerMetadata(ldapServerMetadata);
            return this;
        }

        /**
         * logs block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#logs MqBroker#logs}
         * <p>
         * @return {@code this}
         * @param logs logs block. This parameter is required.
         */
        public Builder logs(final imports.aws.mq.MqBrokerLogs logs) {
            this.config.logs(logs);
            return this;
        }

        /**
         * maintenance_window_start_time block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mq_broker#maintenance_window_start_time MqBroker#maintenance_window_start_time}
         * <p>
         * @return {@code this}
         * @param maintenanceWindowStartTime maintenance_window_start_time block. This parameter is required.
         */
        public Builder maintenanceWindowStartTime(final imports.aws.mq.MqBrokerMaintenanceWindowStartTime maintenanceWindowStartTime) {
            this.config.maintenanceWindowStartTime(maintenanceWindowStartTime);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#publicly_accessible MqBroker#publicly_accessible}.
         * <p>
         * @return {@code this}
         * @param publiclyAccessible Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#publicly_accessible MqBroker#publicly_accessible}. This parameter is required.
         */
        public Builder publiclyAccessible(final java.lang.Boolean publiclyAccessible) {
            this.config.publiclyAccessible(publiclyAccessible);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#publicly_accessible MqBroker#publicly_accessible}.
         * <p>
         * @return {@code this}
         * @param publiclyAccessible Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#publicly_accessible MqBroker#publicly_accessible}. This parameter is required.
         */
        public Builder publiclyAccessible(final com.hashicorp.cdktf.IResolvable publiclyAccessible) {
            this.config.publiclyAccessible(publiclyAccessible);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#security_groups MqBroker#security_groups}.
         * <p>
         * @return {@code this}
         * @param securityGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#security_groups MqBroker#security_groups}. This parameter is required.
         */
        public Builder securityGroups(final java.util.List<java.lang.String> securityGroups) {
            this.config.securityGroups(securityGroups);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#storage_type MqBroker#storage_type}.
         * <p>
         * @return {@code this}
         * @param storageType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#storage_type MqBroker#storage_type}. This parameter is required.
         */
        public Builder storageType(final java.lang.String storageType) {
            this.config.storageType(storageType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#subnet_ids MqBroker#subnet_ids}.
         * <p>
         * @return {@code this}
         * @param subnetIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#subnet_ids MqBroker#subnet_ids}. This parameter is required.
         */
        public Builder subnetIds(final java.util.List<java.lang.String> subnetIds) {
            this.config.subnetIds(subnetIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#tags MqBroker#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#tags MqBroker#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#tags_all MqBroker#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mq_broker#tags_all MqBroker#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.mq.MqBroker}.
         */
        @Override
        public imports.aws.mq.MqBroker build() {
            return new imports.aws.mq.MqBroker(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
