package imports.aws.rds;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/db_instance aws_db_instance}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.223Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.DbInstance")
public class DbInstance extends com.hashicorp.cdktf.TerraformResource {

    protected DbInstance(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DbInstance(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.rds.DbInstance.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/db_instance aws_db_instance} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DbInstance(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putRestoreToPointInTime(final @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceRestoreToPointInTime value) {
        software.amazon.jsii.Kernel.call(this, "putRestoreToPointInTime", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3Import(final @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceS3Import value) {
        software.amazon.jsii.Kernel.call(this, "putS3Import", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllocatedStorage() {
        software.amazon.jsii.Kernel.call(this, "resetAllocatedStorage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAllowMajorVersionUpgrade() {
        software.amazon.jsii.Kernel.call(this, "resetAllowMajorVersionUpgrade", software.amazon.jsii.NativeType.VOID);
    }

    public void resetApplyImmediately() {
        software.amazon.jsii.Kernel.call(this, "resetApplyImmediately", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoMinorVersionUpgrade() {
        software.amazon.jsii.Kernel.call(this, "resetAutoMinorVersionUpgrade", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAvailabilityZone() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBackupRetentionPeriod() {
        software.amazon.jsii.Kernel.call(this, "resetBackupRetentionPeriod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBackupWindow() {
        software.amazon.jsii.Kernel.call(this, "resetBackupWindow", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCaCertIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetCaCertIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCharacterSetName() {
        software.amazon.jsii.Kernel.call(this, "resetCharacterSetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCopyTagsToSnapshot() {
        software.amazon.jsii.Kernel.call(this, "resetCopyTagsToSnapshot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomerOwnedIpEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetCustomerOwnedIpEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDbName() {
        software.amazon.jsii.Kernel.call(this, "resetDbName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDbSubnetGroupName() {
        software.amazon.jsii.Kernel.call(this, "resetDbSubnetGroupName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeleteAutomatedBackups() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteAutomatedBackups", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeletionProtection() {
        software.amazon.jsii.Kernel.call(this, "resetDeletionProtection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomain() {
        software.amazon.jsii.Kernel.call(this, "resetDomain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomainIamRoleName() {
        software.amazon.jsii.Kernel.call(this, "resetDomainIamRoleName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabledCloudwatchLogsExports() {
        software.amazon.jsii.Kernel.call(this, "resetEnabledCloudwatchLogsExports", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEngine() {
        software.amazon.jsii.Kernel.call(this, "resetEngine", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEngineVersion() {
        software.amazon.jsii.Kernel.call(this, "resetEngineVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFinalSnapshotIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetFinalSnapshotIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIamDatabaseAuthenticationEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetIamDatabaseAuthenticationEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdentifierPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetIdentifierPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIops() {
        software.amazon.jsii.Kernel.call(this, "resetIops", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseModel() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseModel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaintenanceWindow() {
        software.amazon.jsii.Kernel.call(this, "resetMaintenanceWindow", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxAllocatedStorage() {
        software.amazon.jsii.Kernel.call(this, "resetMaxAllocatedStorage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMonitoringInterval() {
        software.amazon.jsii.Kernel.call(this, "resetMonitoringInterval", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMonitoringRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetMonitoringRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMultiAz() {
        software.amazon.jsii.Kernel.call(this, "resetMultiAz", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNcharCharacterSetName() {
        software.amazon.jsii.Kernel.call(this, "resetNcharCharacterSetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkType() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOptionGroupName() {
        software.amazon.jsii.Kernel.call(this, "resetOptionGroupName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameterGroupName() {
        software.amazon.jsii.Kernel.call(this, "resetParameterGroupName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassword() {
        software.amazon.jsii.Kernel.call(this, "resetPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerformanceInsightsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetPerformanceInsightsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerformanceInsightsKmsKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetPerformanceInsightsKmsKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPerformanceInsightsRetentionPeriod() {
        software.amazon.jsii.Kernel.call(this, "resetPerformanceInsightsRetentionPeriod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPubliclyAccessible() {
        software.amazon.jsii.Kernel.call(this, "resetPubliclyAccessible", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicaMode() {
        software.amazon.jsii.Kernel.call(this, "resetReplicaMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplicateSourceDb() {
        software.amazon.jsii.Kernel.call(this, "resetReplicateSourceDb", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestoreToPointInTime() {
        software.amazon.jsii.Kernel.call(this, "resetRestoreToPointInTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Import() {
        software.amazon.jsii.Kernel.call(this, "resetS3Import", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroupNames() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroupNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipFinalSnapshot() {
        software.amazon.jsii.Kernel.call(this, "resetSkipFinalSnapshot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotIdentifier() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotIdentifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetStorageEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStorageType() {
        software.amazon.jsii.Kernel.call(this, "resetStorageType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimezone() {
        software.amazon.jsii.Kernel.call(this, "resetTimezone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUsername() {
        software.amazon.jsii.Kernel.call(this, "resetUsername", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcSecurityGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetVpcSecurityGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getAddress() {
        return software.amazon.jsii.Kernel.get(this, "address", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "endpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineVersionActual() {
        return software.amazon.jsii.Kernel.get(this, "engineVersionActual", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHostedZoneId() {
        return software.amazon.jsii.Kernel.get(this, "hostedZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLatestRestorableTime() {
        return software.amazon.jsii.Kernel.get(this, "latestRestorableTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getReplicas() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "replicas", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceId() {
        return software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceRestoreToPointInTimeOutputReference getRestoreToPointInTime() {
        return software.amazon.jsii.Kernel.get(this, "restoreToPointInTime", software.amazon.jsii.NativeType.forClass(imports.aws.rds.DbInstanceRestoreToPointInTimeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceS3ImportOutputReference getS3Import() {
        return software.amazon.jsii.Kernel.get(this, "s3Import", software.amazon.jsii.NativeType.forClass(imports.aws.rds.DbInstanceS3ImportOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.rds.DbInstanceTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.rds.DbInstanceTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAllocatedStorageInput() {
        return software.amazon.jsii.Kernel.get(this, "allocatedStorageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowMajorVersionUpgradeInput() {
        return software.amazon.jsii.Kernel.get(this, "allowMajorVersionUpgradeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getApplyImmediatelyInput() {
        return software.amazon.jsii.Kernel.get(this, "applyImmediatelyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoMinorVersionUpgradeInput() {
        return software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgradeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBackupRetentionPeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "backupRetentionPeriodInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBackupWindowInput() {
        return software.amazon.jsii.Kernel.get(this, "backupWindowInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaCertIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "caCertIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCharacterSetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "characterSetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCopyTagsToSnapshotInput() {
        return software.amazon.jsii.Kernel.get(this, "copyTagsToSnapshotInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCustomerOwnedIpEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "customerOwnedIpEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDbNameInput() {
        return software.amazon.jsii.Kernel.get(this, "dbNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDbSubnetGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "dbSubnetGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDeleteAutomatedBackupsInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteAutomatedBackupsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDeletionProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "deletionProtectionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainIamRoleNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainIamRoleNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "domainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnabledCloudwatchLogsExportsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "enabledCloudwatchLogsExportsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineInput() {
        return software.amazon.jsii.Kernel.get(this, "engineInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "engineVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFinalSnapshotIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIamDatabaseAuthenticationEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "iamDatabaseAuthenticationEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "identifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdentifierPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "identifierPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceClassInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIopsInput() {
        return software.amazon.jsii.Kernel.get(this, "iopsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLicenseModelInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseModelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaintenanceWindowInput() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceWindowInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxAllocatedStorageInput() {
        return software.amazon.jsii.Kernel.get(this, "maxAllocatedStorageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMonitoringIntervalInput() {
        return software.amazon.jsii.Kernel.get(this, "monitoringIntervalInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMonitoringRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "monitoringRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMultiAzInput() {
        return software.amazon.jsii.Kernel.get(this, "multiAzInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNcharCharacterSetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "ncharCharacterSetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNetworkTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "networkTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOptionGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "optionGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParameterGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPerformanceInsightsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "performanceInsightsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPerformanceInsightsKmsKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "performanceInsightsKmsKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPerformanceInsightsRetentionPeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "performanceInsightsRetentionPeriodInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPubliclyAccessibleInput() {
        return software.amazon.jsii.Kernel.get(this, "publiclyAccessibleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReplicaModeInput() {
        return software.amazon.jsii.Kernel.get(this, "replicaModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReplicateSourceDbInput() {
        return software.amazon.jsii.Kernel.get(this, "replicateSourceDbInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.rds.DbInstanceRestoreToPointInTime getRestoreToPointInTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "restoreToPointInTimeInput", software.amazon.jsii.NativeType.forClass(imports.aws.rds.DbInstanceRestoreToPointInTime.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.rds.DbInstanceS3Import getS3ImportInput() {
        return software.amazon.jsii.Kernel.get(this, "s3ImportInput", software.amazon.jsii.NativeType.forClass(imports.aws.rds.DbInstanceS3Import.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipFinalSnapshotInput() {
        return software.amazon.jsii.Kernel.get(this, "skipFinalSnapshotInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStorageEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "storageEncryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStorageTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "storageTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimezoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timezoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAllocatedStorage() {
        return software.amazon.jsii.Kernel.get(this, "allocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAllocatedStorage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "allocatedStorage", java.util.Objects.requireNonNull(value, "allocatedStorage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowMajorVersionUpgrade() {
        return software.amazon.jsii.Kernel.get(this, "allowMajorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowMajorVersionUpgrade(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowMajorVersionUpgrade", java.util.Objects.requireNonNull(value, "allowMajorVersionUpgrade is required"));
    }

    public void setAllowMajorVersionUpgrade(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowMajorVersionUpgrade", java.util.Objects.requireNonNull(value, "allowMajorVersionUpgrade is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoMinorVersionUpgrade() {
        return software.amazon.jsii.Kernel.get(this, "autoMinorVersionUpgrade", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoMinorVersionUpgrade(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoMinorVersionUpgrade", java.util.Objects.requireNonNull(value, "autoMinorVersionUpgrade is required"));
    }

    public void setAutoMinorVersionUpgrade(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoMinorVersionUpgrade", java.util.Objects.requireNonNull(value, "autoMinorVersionUpgrade is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZone", java.util.Objects.requireNonNull(value, "availabilityZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBackupRetentionPeriod() {
        return software.amazon.jsii.Kernel.get(this, "backupRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBackupRetentionPeriod(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "backupRetentionPeriod", java.util.Objects.requireNonNull(value, "backupRetentionPeriod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBackupWindow() {
        return software.amazon.jsii.Kernel.get(this, "backupWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBackupWindow(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "backupWindow", java.util.Objects.requireNonNull(value, "backupWindow is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCaCertIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "caCertIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCaCertIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "caCertIdentifier", java.util.Objects.requireNonNull(value, "caCertIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCharacterSetName() {
        return software.amazon.jsii.Kernel.get(this, "characterSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCharacterSetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "characterSetName", java.util.Objects.requireNonNull(value, "characterSetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCopyTagsToSnapshot() {
        return software.amazon.jsii.Kernel.get(this, "copyTagsToSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCopyTagsToSnapshot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "copyTagsToSnapshot", java.util.Objects.requireNonNull(value, "copyTagsToSnapshot is required"));
    }

    public void setCopyTagsToSnapshot(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "copyTagsToSnapshot", java.util.Objects.requireNonNull(value, "copyTagsToSnapshot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCustomerOwnedIpEnabled() {
        return software.amazon.jsii.Kernel.get(this, "customerOwnedIpEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCustomerOwnedIpEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "customerOwnedIpEnabled", java.util.Objects.requireNonNull(value, "customerOwnedIpEnabled is required"));
    }

    public void setCustomerOwnedIpEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "customerOwnedIpEnabled", java.util.Objects.requireNonNull(value, "customerOwnedIpEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbName() {
        return software.amazon.jsii.Kernel.get(this, "dbName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDbName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dbName", java.util.Objects.requireNonNull(value, "dbName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDbSubnetGroupName() {
        return software.amazon.jsii.Kernel.get(this, "dbSubnetGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDbSubnetGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dbSubnetGroupName", java.util.Objects.requireNonNull(value, "dbSubnetGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDeleteAutomatedBackups() {
        return software.amazon.jsii.Kernel.get(this, "deleteAutomatedBackups", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDeleteAutomatedBackups(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deleteAutomatedBackups", java.util.Objects.requireNonNull(value, "deleteAutomatedBackups is required"));
    }

    public void setDeleteAutomatedBackups(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "deleteAutomatedBackups", java.util.Objects.requireNonNull(value, "deleteAutomatedBackups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDeletionProtection() {
        return software.amazon.jsii.Kernel.get(this, "deletionProtection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDeletionProtection(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deletionProtection", java.util.Objects.requireNonNull(value, "deletionProtection is required"));
    }

    public void setDeletionProtection(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "deletionProtection", java.util.Objects.requireNonNull(value, "deletionProtection is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomain() {
        return software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domain", java.util.Objects.requireNonNull(value, "domain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainIamRoleName() {
        return software.amazon.jsii.Kernel.get(this, "domainIamRoleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainIamRoleName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainIamRoleName", java.util.Objects.requireNonNull(value, "domainIamRoleName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEnabledCloudwatchLogsExports() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "enabledCloudwatchLogsExports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setEnabledCloudwatchLogsExports(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "enabledCloudwatchLogsExports", java.util.Objects.requireNonNull(value, "enabledCloudwatchLogsExports is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngine() {
        return software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngine(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engine", java.util.Objects.requireNonNull(value, "engine is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineVersion() {
        return software.amazon.jsii.Kernel.get(this, "engineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineVersion", java.util.Objects.requireNonNull(value, "engineVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFinalSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "finalSnapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFinalSnapshotIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "finalSnapshotIdentifier", java.util.Objects.requireNonNull(value, "finalSnapshotIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIamDatabaseAuthenticationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "iamDatabaseAuthenticationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIamDatabaseAuthenticationEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "iamDatabaseAuthenticationEnabled", java.util.Objects.requireNonNull(value, "iamDatabaseAuthenticationEnabled is required"));
    }

    public void setIamDatabaseAuthenticationEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "iamDatabaseAuthenticationEnabled", java.util.Objects.requireNonNull(value, "iamDatabaseAuthenticationEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "identifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identifier", java.util.Objects.requireNonNull(value, "identifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentifierPrefix() {
        return software.amazon.jsii.Kernel.get(this, "identifierPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentifierPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identifierPrefix", java.util.Objects.requireNonNull(value, "identifierPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceClass() {
        return software.amazon.jsii.Kernel.get(this, "instanceClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceClass", java.util.Objects.requireNonNull(value, "instanceClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIops() {
        return software.amazon.jsii.Kernel.get(this, "iops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIops(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "iops", java.util.Objects.requireNonNull(value, "iops is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", java.util.Objects.requireNonNull(value, "kmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLicenseModel() {
        return software.amazon.jsii.Kernel.get(this, "licenseModel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLicenseModel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "licenseModel", java.util.Objects.requireNonNull(value, "licenseModel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaintenanceWindow() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaintenanceWindow(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maintenanceWindow", java.util.Objects.requireNonNull(value, "maintenanceWindow is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxAllocatedStorage() {
        return software.amazon.jsii.Kernel.get(this, "maxAllocatedStorage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxAllocatedStorage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxAllocatedStorage", java.util.Objects.requireNonNull(value, "maxAllocatedStorage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMonitoringInterval() {
        return software.amazon.jsii.Kernel.get(this, "monitoringInterval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMonitoringInterval(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "monitoringInterval", java.util.Objects.requireNonNull(value, "monitoringInterval is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMonitoringRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "monitoringRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMonitoringRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "monitoringRoleArn", java.util.Objects.requireNonNull(value, "monitoringRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMultiAz() {
        return software.amazon.jsii.Kernel.get(this, "multiAz", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMultiAz(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "multiAz", java.util.Objects.requireNonNull(value, "multiAz is required"));
    }

    public void setMultiAz(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "multiAz", java.util.Objects.requireNonNull(value, "multiAz is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNcharCharacterSetName() {
        return software.amazon.jsii.Kernel.get(this, "ncharCharacterSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNcharCharacterSetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ncharCharacterSetName", java.util.Objects.requireNonNull(value, "ncharCharacterSetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkType() {
        return software.amazon.jsii.Kernel.get(this, "networkType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNetworkType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "networkType", java.util.Objects.requireNonNull(value, "networkType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOptionGroupName() {
        return software.amazon.jsii.Kernel.get(this, "optionGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOptionGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "optionGroupName", java.util.Objects.requireNonNull(value, "optionGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParameterGroupName() {
        return software.amazon.jsii.Kernel.get(this, "parameterGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParameterGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parameterGroupName", java.util.Objects.requireNonNull(value, "parameterGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassword() {
        return software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "password", java.util.Objects.requireNonNull(value, "password is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPerformanceInsightsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "performanceInsightsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPerformanceInsightsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "performanceInsightsEnabled", java.util.Objects.requireNonNull(value, "performanceInsightsEnabled is required"));
    }

    public void setPerformanceInsightsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "performanceInsightsEnabled", java.util.Objects.requireNonNull(value, "performanceInsightsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPerformanceInsightsKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "performanceInsightsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPerformanceInsightsKmsKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "performanceInsightsKmsKeyId", java.util.Objects.requireNonNull(value, "performanceInsightsKmsKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPerformanceInsightsRetentionPeriod() {
        return software.amazon.jsii.Kernel.get(this, "performanceInsightsRetentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPerformanceInsightsRetentionPeriod(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "performanceInsightsRetentionPeriod", java.util.Objects.requireNonNull(value, "performanceInsightsRetentionPeriod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicaMode() {
        return software.amazon.jsii.Kernel.get(this, "replicaMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplicaMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replicaMode", java.util.Objects.requireNonNull(value, "replicaMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplicateSourceDb() {
        return software.amazon.jsii.Kernel.get(this, "replicateSourceDb", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplicateSourceDb(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replicateSourceDb", java.util.Objects.requireNonNull(value, "replicateSourceDb is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroupNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroupNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroupNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroupNames", java.util.Objects.requireNonNull(value, "securityGroupNames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSkipFinalSnapshot() {
        return software.amazon.jsii.Kernel.get(this, "skipFinalSnapshot", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipFinalSnapshot(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipFinalSnapshot", java.util.Objects.requireNonNull(value, "skipFinalSnapshot is required"));
    }

    public void setSkipFinalSnapshot(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipFinalSnapshot", java.util.Objects.requireNonNull(value, "skipFinalSnapshot is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "snapshotIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotIdentifier", java.util.Objects.requireNonNull(value, "snapshotIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStorageEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "storageEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStorageEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "storageEncrypted", java.util.Objects.requireNonNull(value, "storageEncrypted is required"));
    }

    public void setStorageEncrypted(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "storageEncrypted", java.util.Objects.requireNonNull(value, "storageEncrypted is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStorageType() {
        return software.amazon.jsii.Kernel.get(this, "storageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStorageType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "storageType", java.util.Objects.requireNonNull(value, "storageType is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTimezone() {
        return software.amazon.jsii.Kernel.get(this, "timezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimezone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timezone", java.util.Objects.requireNonNull(value, "timezone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUsername() {
        return software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "username", java.util.Objects.requireNonNull(value, "username is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVpcSecurityGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupIds", java.util.Objects.requireNonNull(value, "vpcSecurityGroupIds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.rds.DbInstance}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.rds.DbInstance> {
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
        private final imports.aws.rds.DbInstanceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.rds.DbInstanceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#instance_class DbInstance#instance_class}.
         * <p>
         * @return {@code this}
         * @param instanceClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#instance_class DbInstance#instance_class}. This parameter is required.
         */
        public Builder instanceClass(final java.lang.String instanceClass) {
            this.config.instanceClass(instanceClass);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#allocated_storage DbInstance#allocated_storage}.
         * <p>
         * @return {@code this}
         * @param allocatedStorage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#allocated_storage DbInstance#allocated_storage}. This parameter is required.
         */
        public Builder allocatedStorage(final java.lang.Number allocatedStorage) {
            this.config.allocatedStorage(allocatedStorage);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#allow_major_version_upgrade DbInstance#allow_major_version_upgrade}.
         * <p>
         * @return {@code this}
         * @param allowMajorVersionUpgrade Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#allow_major_version_upgrade DbInstance#allow_major_version_upgrade}. This parameter is required.
         */
        public Builder allowMajorVersionUpgrade(final java.lang.Boolean allowMajorVersionUpgrade) {
            this.config.allowMajorVersionUpgrade(allowMajorVersionUpgrade);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#allow_major_version_upgrade DbInstance#allow_major_version_upgrade}.
         * <p>
         * @return {@code this}
         * @param allowMajorVersionUpgrade Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#allow_major_version_upgrade DbInstance#allow_major_version_upgrade}. This parameter is required.
         */
        public Builder allowMajorVersionUpgrade(final com.hashicorp.cdktf.IResolvable allowMajorVersionUpgrade) {
            this.config.allowMajorVersionUpgrade(allowMajorVersionUpgrade);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#apply_immediately DbInstance#apply_immediately}.
         * <p>
         * @return {@code this}
         * @param applyImmediately Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#apply_immediately DbInstance#apply_immediately}. This parameter is required.
         */
        public Builder applyImmediately(final java.lang.Boolean applyImmediately) {
            this.config.applyImmediately(applyImmediately);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#apply_immediately DbInstance#apply_immediately}.
         * <p>
         * @return {@code this}
         * @param applyImmediately Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#apply_immediately DbInstance#apply_immediately}. This parameter is required.
         */
        public Builder applyImmediately(final com.hashicorp.cdktf.IResolvable applyImmediately) {
            this.config.applyImmediately(applyImmediately);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#auto_minor_version_upgrade DbInstance#auto_minor_version_upgrade}.
         * <p>
         * @return {@code this}
         * @param autoMinorVersionUpgrade Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#auto_minor_version_upgrade DbInstance#auto_minor_version_upgrade}. This parameter is required.
         */
        public Builder autoMinorVersionUpgrade(final java.lang.Boolean autoMinorVersionUpgrade) {
            this.config.autoMinorVersionUpgrade(autoMinorVersionUpgrade);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#auto_minor_version_upgrade DbInstance#auto_minor_version_upgrade}.
         * <p>
         * @return {@code this}
         * @param autoMinorVersionUpgrade Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#auto_minor_version_upgrade DbInstance#auto_minor_version_upgrade}. This parameter is required.
         */
        public Builder autoMinorVersionUpgrade(final com.hashicorp.cdktf.IResolvable autoMinorVersionUpgrade) {
            this.config.autoMinorVersionUpgrade(autoMinorVersionUpgrade);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#availability_zone DbInstance#availability_zone}.
         * <p>
         * @return {@code this}
         * @param availabilityZone Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#availability_zone DbInstance#availability_zone}. This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config.availabilityZone(availabilityZone);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#backup_retention_period DbInstance#backup_retention_period}.
         * <p>
         * @return {@code this}
         * @param backupRetentionPeriod Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#backup_retention_period DbInstance#backup_retention_period}. This parameter is required.
         */
        public Builder backupRetentionPeriod(final java.lang.Number backupRetentionPeriod) {
            this.config.backupRetentionPeriod(backupRetentionPeriod);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#backup_window DbInstance#backup_window}.
         * <p>
         * @return {@code this}
         * @param backupWindow Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#backup_window DbInstance#backup_window}. This parameter is required.
         */
        public Builder backupWindow(final java.lang.String backupWindow) {
            this.config.backupWindow(backupWindow);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#ca_cert_identifier DbInstance#ca_cert_identifier}.
         * <p>
         * @return {@code this}
         * @param caCertIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#ca_cert_identifier DbInstance#ca_cert_identifier}. This parameter is required.
         */
        public Builder caCertIdentifier(final java.lang.String caCertIdentifier) {
            this.config.caCertIdentifier(caCertIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#character_set_name DbInstance#character_set_name}.
         * <p>
         * @return {@code this}
         * @param characterSetName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#character_set_name DbInstance#character_set_name}. This parameter is required.
         */
        public Builder characterSetName(final java.lang.String characterSetName) {
            this.config.characterSetName(characterSetName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#copy_tags_to_snapshot DbInstance#copy_tags_to_snapshot}.
         * <p>
         * @return {@code this}
         * @param copyTagsToSnapshot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#copy_tags_to_snapshot DbInstance#copy_tags_to_snapshot}. This parameter is required.
         */
        public Builder copyTagsToSnapshot(final java.lang.Boolean copyTagsToSnapshot) {
            this.config.copyTagsToSnapshot(copyTagsToSnapshot);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#copy_tags_to_snapshot DbInstance#copy_tags_to_snapshot}.
         * <p>
         * @return {@code this}
         * @param copyTagsToSnapshot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#copy_tags_to_snapshot DbInstance#copy_tags_to_snapshot}. This parameter is required.
         */
        public Builder copyTagsToSnapshot(final com.hashicorp.cdktf.IResolvable copyTagsToSnapshot) {
            this.config.copyTagsToSnapshot(copyTagsToSnapshot);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#customer_owned_ip_enabled DbInstance#customer_owned_ip_enabled}.
         * <p>
         * @return {@code this}
         * @param customerOwnedIpEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#customer_owned_ip_enabled DbInstance#customer_owned_ip_enabled}. This parameter is required.
         */
        public Builder customerOwnedIpEnabled(final java.lang.Boolean customerOwnedIpEnabled) {
            this.config.customerOwnedIpEnabled(customerOwnedIpEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#customer_owned_ip_enabled DbInstance#customer_owned_ip_enabled}.
         * <p>
         * @return {@code this}
         * @param customerOwnedIpEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#customer_owned_ip_enabled DbInstance#customer_owned_ip_enabled}. This parameter is required.
         */
        public Builder customerOwnedIpEnabled(final com.hashicorp.cdktf.IResolvable customerOwnedIpEnabled) {
            this.config.customerOwnedIpEnabled(customerOwnedIpEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#db_name DbInstance#db_name}.
         * <p>
         * @return {@code this}
         * @param dbName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#db_name DbInstance#db_name}. This parameter is required.
         */
        public Builder dbName(final java.lang.String dbName) {
            this.config.dbName(dbName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#db_subnet_group_name DbInstance#db_subnet_group_name}.
         * <p>
         * @return {@code this}
         * @param dbSubnetGroupName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#db_subnet_group_name DbInstance#db_subnet_group_name}. This parameter is required.
         */
        public Builder dbSubnetGroupName(final java.lang.String dbSubnetGroupName) {
            this.config.dbSubnetGroupName(dbSubnetGroupName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#delete_automated_backups DbInstance#delete_automated_backups}.
         * <p>
         * @return {@code this}
         * @param deleteAutomatedBackups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#delete_automated_backups DbInstance#delete_automated_backups}. This parameter is required.
         */
        public Builder deleteAutomatedBackups(final java.lang.Boolean deleteAutomatedBackups) {
            this.config.deleteAutomatedBackups(deleteAutomatedBackups);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#delete_automated_backups DbInstance#delete_automated_backups}.
         * <p>
         * @return {@code this}
         * @param deleteAutomatedBackups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#delete_automated_backups DbInstance#delete_automated_backups}. This parameter is required.
         */
        public Builder deleteAutomatedBackups(final com.hashicorp.cdktf.IResolvable deleteAutomatedBackups) {
            this.config.deleteAutomatedBackups(deleteAutomatedBackups);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#deletion_protection DbInstance#deletion_protection}.
         * <p>
         * @return {@code this}
         * @param deletionProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#deletion_protection DbInstance#deletion_protection}. This parameter is required.
         */
        public Builder deletionProtection(final java.lang.Boolean deletionProtection) {
            this.config.deletionProtection(deletionProtection);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#deletion_protection DbInstance#deletion_protection}.
         * <p>
         * @return {@code this}
         * @param deletionProtection Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#deletion_protection DbInstance#deletion_protection}. This parameter is required.
         */
        public Builder deletionProtection(final com.hashicorp.cdktf.IResolvable deletionProtection) {
            this.config.deletionProtection(deletionProtection);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#domain DbInstance#domain}.
         * <p>
         * @return {@code this}
         * @param domain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#domain DbInstance#domain}. This parameter is required.
         */
        public Builder domain(final java.lang.String domain) {
            this.config.domain(domain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#domain_iam_role_name DbInstance#domain_iam_role_name}.
         * <p>
         * @return {@code this}
         * @param domainIamRoleName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#domain_iam_role_name DbInstance#domain_iam_role_name}. This parameter is required.
         */
        public Builder domainIamRoleName(final java.lang.String domainIamRoleName) {
            this.config.domainIamRoleName(domainIamRoleName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#enabled_cloudwatch_logs_exports DbInstance#enabled_cloudwatch_logs_exports}.
         * <p>
         * @return {@code this}
         * @param enabledCloudwatchLogsExports Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#enabled_cloudwatch_logs_exports DbInstance#enabled_cloudwatch_logs_exports}. This parameter is required.
         */
        public Builder enabledCloudwatchLogsExports(final java.util.List<java.lang.String> enabledCloudwatchLogsExports) {
            this.config.enabledCloudwatchLogsExports(enabledCloudwatchLogsExports);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#engine DbInstance#engine}.
         * <p>
         * @return {@code this}
         * @param engine Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#engine DbInstance#engine}. This parameter is required.
         */
        public Builder engine(final java.lang.String engine) {
            this.config.engine(engine);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#engine_version DbInstance#engine_version}.
         * <p>
         * @return {@code this}
         * @param engineVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#engine_version DbInstance#engine_version}. This parameter is required.
         */
        public Builder engineVersion(final java.lang.String engineVersion) {
            this.config.engineVersion(engineVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#final_snapshot_identifier DbInstance#final_snapshot_identifier}.
         * <p>
         * @return {@code this}
         * @param finalSnapshotIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#final_snapshot_identifier DbInstance#final_snapshot_identifier}. This parameter is required.
         */
        public Builder finalSnapshotIdentifier(final java.lang.String finalSnapshotIdentifier) {
            this.config.finalSnapshotIdentifier(finalSnapshotIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#iam_database_authentication_enabled DbInstance#iam_database_authentication_enabled}.
         * <p>
         * @return {@code this}
         * @param iamDatabaseAuthenticationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#iam_database_authentication_enabled DbInstance#iam_database_authentication_enabled}. This parameter is required.
         */
        public Builder iamDatabaseAuthenticationEnabled(final java.lang.Boolean iamDatabaseAuthenticationEnabled) {
            this.config.iamDatabaseAuthenticationEnabled(iamDatabaseAuthenticationEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#iam_database_authentication_enabled DbInstance#iam_database_authentication_enabled}.
         * <p>
         * @return {@code this}
         * @param iamDatabaseAuthenticationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#iam_database_authentication_enabled DbInstance#iam_database_authentication_enabled}. This parameter is required.
         */
        public Builder iamDatabaseAuthenticationEnabled(final com.hashicorp.cdktf.IResolvable iamDatabaseAuthenticationEnabled) {
            this.config.iamDatabaseAuthenticationEnabled(iamDatabaseAuthenticationEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#id DbInstance#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#id DbInstance#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#identifier DbInstance#identifier}.
         * <p>
         * @return {@code this}
         * @param identifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#identifier DbInstance#identifier}. This parameter is required.
         */
        public Builder identifier(final java.lang.String identifier) {
            this.config.identifier(identifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#identifier_prefix DbInstance#identifier_prefix}.
         * <p>
         * @return {@code this}
         * @param identifierPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#identifier_prefix DbInstance#identifier_prefix}. This parameter is required.
         */
        public Builder identifierPrefix(final java.lang.String identifierPrefix) {
            this.config.identifierPrefix(identifierPrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#iops DbInstance#iops}.
         * <p>
         * @return {@code this}
         * @param iops Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#iops DbInstance#iops}. This parameter is required.
         */
        public Builder iops(final java.lang.Number iops) {
            this.config.iops(iops);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#kms_key_id DbInstance#kms_key_id}.
         * <p>
         * @return {@code this}
         * @param kmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#kms_key_id DbInstance#kms_key_id}. This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config.kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#license_model DbInstance#license_model}.
         * <p>
         * @return {@code this}
         * @param licenseModel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#license_model DbInstance#license_model}. This parameter is required.
         */
        public Builder licenseModel(final java.lang.String licenseModel) {
            this.config.licenseModel(licenseModel);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#maintenance_window DbInstance#maintenance_window}.
         * <p>
         * @return {@code this}
         * @param maintenanceWindow Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#maintenance_window DbInstance#maintenance_window}. This parameter is required.
         */
        public Builder maintenanceWindow(final java.lang.String maintenanceWindow) {
            this.config.maintenanceWindow(maintenanceWindow);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#max_allocated_storage DbInstance#max_allocated_storage}.
         * <p>
         * @return {@code this}
         * @param maxAllocatedStorage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#max_allocated_storage DbInstance#max_allocated_storage}. This parameter is required.
         */
        public Builder maxAllocatedStorage(final java.lang.Number maxAllocatedStorage) {
            this.config.maxAllocatedStorage(maxAllocatedStorage);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#monitoring_interval DbInstance#monitoring_interval}.
         * <p>
         * @return {@code this}
         * @param monitoringInterval Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#monitoring_interval DbInstance#monitoring_interval}. This parameter is required.
         */
        public Builder monitoringInterval(final java.lang.Number monitoringInterval) {
            this.config.monitoringInterval(monitoringInterval);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#monitoring_role_arn DbInstance#monitoring_role_arn}.
         * <p>
         * @return {@code this}
         * @param monitoringRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#monitoring_role_arn DbInstance#monitoring_role_arn}. This parameter is required.
         */
        public Builder monitoringRoleArn(final java.lang.String monitoringRoleArn) {
            this.config.monitoringRoleArn(monitoringRoleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#multi_az DbInstance#multi_az}.
         * <p>
         * @return {@code this}
         * @param multiAz Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#multi_az DbInstance#multi_az}. This parameter is required.
         */
        public Builder multiAz(final java.lang.Boolean multiAz) {
            this.config.multiAz(multiAz);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#multi_az DbInstance#multi_az}.
         * <p>
         * @return {@code this}
         * @param multiAz Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#multi_az DbInstance#multi_az}. This parameter is required.
         */
        public Builder multiAz(final com.hashicorp.cdktf.IResolvable multiAz) {
            this.config.multiAz(multiAz);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#name DbInstance#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#name DbInstance#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#nchar_character_set_name DbInstance#nchar_character_set_name}.
         * <p>
         * @return {@code this}
         * @param ncharCharacterSetName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#nchar_character_set_name DbInstance#nchar_character_set_name}. This parameter is required.
         */
        public Builder ncharCharacterSetName(final java.lang.String ncharCharacterSetName) {
            this.config.ncharCharacterSetName(ncharCharacterSetName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#network_type DbInstance#network_type}.
         * <p>
         * @return {@code this}
         * @param networkType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#network_type DbInstance#network_type}. This parameter is required.
         */
        public Builder networkType(final java.lang.String networkType) {
            this.config.networkType(networkType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#option_group_name DbInstance#option_group_name}.
         * <p>
         * @return {@code this}
         * @param optionGroupName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#option_group_name DbInstance#option_group_name}. This parameter is required.
         */
        public Builder optionGroupName(final java.lang.String optionGroupName) {
            this.config.optionGroupName(optionGroupName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#parameter_group_name DbInstance#parameter_group_name}.
         * <p>
         * @return {@code this}
         * @param parameterGroupName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#parameter_group_name DbInstance#parameter_group_name}. This parameter is required.
         */
        public Builder parameterGroupName(final java.lang.String parameterGroupName) {
            this.config.parameterGroupName(parameterGroupName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#password DbInstance#password}.
         * <p>
         * @return {@code this}
         * @param password Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#password DbInstance#password}. This parameter is required.
         */
        public Builder password(final java.lang.String password) {
            this.config.password(password);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_enabled DbInstance#performance_insights_enabled}.
         * <p>
         * @return {@code this}
         * @param performanceInsightsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_enabled DbInstance#performance_insights_enabled}. This parameter is required.
         */
        public Builder performanceInsightsEnabled(final java.lang.Boolean performanceInsightsEnabled) {
            this.config.performanceInsightsEnabled(performanceInsightsEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_enabled DbInstance#performance_insights_enabled}.
         * <p>
         * @return {@code this}
         * @param performanceInsightsEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_enabled DbInstance#performance_insights_enabled}. This parameter is required.
         */
        public Builder performanceInsightsEnabled(final com.hashicorp.cdktf.IResolvable performanceInsightsEnabled) {
            this.config.performanceInsightsEnabled(performanceInsightsEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_kms_key_id DbInstance#performance_insights_kms_key_id}.
         * <p>
         * @return {@code this}
         * @param performanceInsightsKmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_kms_key_id DbInstance#performance_insights_kms_key_id}. This parameter is required.
         */
        public Builder performanceInsightsKmsKeyId(final java.lang.String performanceInsightsKmsKeyId) {
            this.config.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_retention_period DbInstance#performance_insights_retention_period}.
         * <p>
         * @return {@code this}
         * @param performanceInsightsRetentionPeriod Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#performance_insights_retention_period DbInstance#performance_insights_retention_period}. This parameter is required.
         */
        public Builder performanceInsightsRetentionPeriod(final java.lang.Number performanceInsightsRetentionPeriod) {
            this.config.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#port DbInstance#port}.
         * <p>
         * @return {@code this}
         * @param port Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#port DbInstance#port}. This parameter is required.
         */
        public Builder port(final java.lang.Number port) {
            this.config.port(port);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#publicly_accessible DbInstance#publicly_accessible}.
         * <p>
         * @return {@code this}
         * @param publiclyAccessible Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#publicly_accessible DbInstance#publicly_accessible}. This parameter is required.
         */
        public Builder publiclyAccessible(final java.lang.Boolean publiclyAccessible) {
            this.config.publiclyAccessible(publiclyAccessible);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#publicly_accessible DbInstance#publicly_accessible}.
         * <p>
         * @return {@code this}
         * @param publiclyAccessible Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#publicly_accessible DbInstance#publicly_accessible}. This parameter is required.
         */
        public Builder publiclyAccessible(final com.hashicorp.cdktf.IResolvable publiclyAccessible) {
            this.config.publiclyAccessible(publiclyAccessible);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#replica_mode DbInstance#replica_mode}.
         * <p>
         * @return {@code this}
         * @param replicaMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#replica_mode DbInstance#replica_mode}. This parameter is required.
         */
        public Builder replicaMode(final java.lang.String replicaMode) {
            this.config.replicaMode(replicaMode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#replicate_source_db DbInstance#replicate_source_db}.
         * <p>
         * @return {@code this}
         * @param replicateSourceDb Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#replicate_source_db DbInstance#replicate_source_db}. This parameter is required.
         */
        public Builder replicateSourceDb(final java.lang.String replicateSourceDb) {
            this.config.replicateSourceDb(replicateSourceDb);
            return this;
        }

        /**
         * restore_to_point_in_time block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/db_instance#restore_to_point_in_time DbInstance#restore_to_point_in_time}
         * <p>
         * @return {@code this}
         * @param restoreToPointInTime restore_to_point_in_time block. This parameter is required.
         */
        public Builder restoreToPointInTime(final imports.aws.rds.DbInstanceRestoreToPointInTime restoreToPointInTime) {
            this.config.restoreToPointInTime(restoreToPointInTime);
            return this;
        }

        /**
         * s3_import block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/db_instance#s3_import DbInstance#s3_import}
         * <p>
         * @return {@code this}
         * @param s3Import s3_import block. This parameter is required.
         */
        public Builder s3Import(final imports.aws.rds.DbInstanceS3Import s3Import) {
            this.config.s3Import(s3Import);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#security_group_names DbInstance#security_group_names}.
         * <p>
         * @return {@code this}
         * @param securityGroupNames Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#security_group_names DbInstance#security_group_names}. This parameter is required.
         */
        public Builder securityGroupNames(final java.util.List<java.lang.String> securityGroupNames) {
            this.config.securityGroupNames(securityGroupNames);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#skip_final_snapshot DbInstance#skip_final_snapshot}.
         * <p>
         * @return {@code this}
         * @param skipFinalSnapshot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#skip_final_snapshot DbInstance#skip_final_snapshot}. This parameter is required.
         */
        public Builder skipFinalSnapshot(final java.lang.Boolean skipFinalSnapshot) {
            this.config.skipFinalSnapshot(skipFinalSnapshot);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#skip_final_snapshot DbInstance#skip_final_snapshot}.
         * <p>
         * @return {@code this}
         * @param skipFinalSnapshot Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#skip_final_snapshot DbInstance#skip_final_snapshot}. This parameter is required.
         */
        public Builder skipFinalSnapshot(final com.hashicorp.cdktf.IResolvable skipFinalSnapshot) {
            this.config.skipFinalSnapshot(skipFinalSnapshot);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#snapshot_identifier DbInstance#snapshot_identifier}.
         * <p>
         * @return {@code this}
         * @param snapshotIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#snapshot_identifier DbInstance#snapshot_identifier}. This parameter is required.
         */
        public Builder snapshotIdentifier(final java.lang.String snapshotIdentifier) {
            this.config.snapshotIdentifier(snapshotIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#storage_encrypted DbInstance#storage_encrypted}.
         * <p>
         * @return {@code this}
         * @param storageEncrypted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#storage_encrypted DbInstance#storage_encrypted}. This parameter is required.
         */
        public Builder storageEncrypted(final java.lang.Boolean storageEncrypted) {
            this.config.storageEncrypted(storageEncrypted);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#storage_encrypted DbInstance#storage_encrypted}.
         * <p>
         * @return {@code this}
         * @param storageEncrypted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#storage_encrypted DbInstance#storage_encrypted}. This parameter is required.
         */
        public Builder storageEncrypted(final com.hashicorp.cdktf.IResolvable storageEncrypted) {
            this.config.storageEncrypted(storageEncrypted);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#storage_type DbInstance#storage_type}.
         * <p>
         * @return {@code this}
         * @param storageType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#storage_type DbInstance#storage_type}. This parameter is required.
         */
        public Builder storageType(final java.lang.String storageType) {
            this.config.storageType(storageType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#tags DbInstance#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#tags DbInstance#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#tags_all DbInstance#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#tags_all DbInstance#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/db_instance#timeouts DbInstance#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.rds.DbInstanceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#timezone DbInstance#timezone}.
         * <p>
         * @return {@code this}
         * @param timezone Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#timezone DbInstance#timezone}. This parameter is required.
         */
        public Builder timezone(final java.lang.String timezone) {
            this.config.timezone(timezone);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#username DbInstance#username}.
         * <p>
         * @return {@code this}
         * @param username Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#username DbInstance#username}. This parameter is required.
         */
        public Builder username(final java.lang.String username) {
            this.config.username(username);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#vpc_security_group_ids DbInstance#vpc_security_group_ids}.
         * <p>
         * @return {@code this}
         * @param vpcSecurityGroupIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#vpc_security_group_ids DbInstance#vpc_security_group_ids}. This parameter is required.
         */
        public Builder vpcSecurityGroupIds(final java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.config.vpcSecurityGroupIds(vpcSecurityGroupIds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.rds.DbInstance}.
         */
        @Override
        public imports.aws.rds.DbInstance build() {
            return new imports.aws.rds.DbInstance(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
