package imports.aws.dms;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint aws_dms_endpoint}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.452Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dms.DmsEndpoint")
public class DmsEndpoint extends com.hashicorp.cdktf.TerraformResource {

    protected DmsEndpoint(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DmsEndpoint(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.dms.DmsEndpoint.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint aws_dms_endpoint} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DmsEndpoint(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putElasticsearchSettings(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointElasticsearchSettings value) {
        software.amazon.jsii.Kernel.call(this, "putElasticsearchSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKafkaSettings(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointKafkaSettings value) {
        software.amazon.jsii.Kernel.call(this, "putKafkaSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKinesisSettings(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointKinesisSettings value) {
        software.amazon.jsii.Kernel.call(this, "putKinesisSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMongodbSettings(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointMongodbSettings value) {
        software.amazon.jsii.Kernel.call(this, "putMongodbSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedshiftSettings(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointRedshiftSettings value) {
        software.amazon.jsii.Kernel.call(this, "putRedshiftSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3Settings(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointS3Settings value) {
        software.amazon.jsii.Kernel.call(this, "putS3Settings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCertificateArn() {
        software.amazon.jsii.Kernel.call(this, "resetCertificateArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDatabaseName() {
        software.amazon.jsii.Kernel.call(this, "resetDatabaseName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearchSettings() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearchSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExtraConnectionAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetExtraConnectionAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKafkaSettings() {
        software.amazon.jsii.Kernel.call(this, "resetKafkaSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisSettings() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKeyArn() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKeyArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMongodbSettings() {
        software.amazon.jsii.Kernel.call(this, "resetMongodbSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPassword() {
        software.amazon.jsii.Kernel.call(this, "resetPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPort() {
        software.amazon.jsii.Kernel.call(this, "resetPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedshiftSettings() {
        software.amazon.jsii.Kernel.call(this, "resetRedshiftSettings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Settings() {
        software.amazon.jsii.Kernel.call(this, "resetS3Settings", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretsManagerAccessRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetSecretsManagerAccessRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretsManagerArn() {
        software.amazon.jsii.Kernel.call(this, "resetSecretsManagerArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerName() {
        software.amazon.jsii.Kernel.call(this, "resetServerName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceAccessRole() {
        software.amazon.jsii.Kernel.call(this, "resetServiceAccessRole", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSslMode() {
        software.amazon.jsii.Kernel.call(this, "resetSslMode", software.amazon.jsii.NativeType.VOID);
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

    public void resetUsername() {
        software.amazon.jsii.Kernel.call(this, "resetUsername", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointElasticsearchSettingsOutputReference getElasticsearchSettings() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchSettings", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointElasticsearchSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointArn() {
        return software.amazon.jsii.Kernel.get(this, "endpointArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointKafkaSettingsOutputReference getKafkaSettings() {
        return software.amazon.jsii.Kernel.get(this, "kafkaSettings", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointKafkaSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointKinesisSettingsOutputReference getKinesisSettings() {
        return software.amazon.jsii.Kernel.get(this, "kinesisSettings", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointKinesisSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointMongodbSettingsOutputReference getMongodbSettings() {
        return software.amazon.jsii.Kernel.get(this, "mongodbSettings", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointMongodbSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointRedshiftSettingsOutputReference getRedshiftSettings() {
        return software.amazon.jsii.Kernel.get(this, "redshiftSettings", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointRedshiftSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointS3SettingsOutputReference getS3Settings() {
        return software.amazon.jsii.Kernel.get(this, "s3Settings", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointS3SettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dms.DmsEndpointTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateArnInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatabaseNameInput() {
        return software.amazon.jsii.Kernel.get(this, "databaseNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointElasticsearchSettings getElasticsearchSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointElasticsearchSettings.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointIdInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineNameInput() {
        return software.amazon.jsii.Kernel.get(this, "engineNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExtraConnectionAttributesInput() {
        return software.amazon.jsii.Kernel.get(this, "extraConnectionAttributesInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointKafkaSettings getKafkaSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "kafkaSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointKafkaSettings.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointKinesisSettings getKinesisSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointKinesisSettings.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointMongodbSettings getMongodbSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "mongodbSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointMongodbSettings.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortInput() {
        return software.amazon.jsii.Kernel.get(this, "portInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointRedshiftSettings getRedshiftSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "redshiftSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointRedshiftSettings.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dms.DmsEndpointS3Settings getS3SettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "s3SettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.dms.DmsEndpointS3Settings.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretsManagerAccessRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "secretsManagerAccessRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretsManagerArnInput() {
        return software.amazon.jsii.Kernel.get(this, "secretsManagerArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServerNameInput() {
        return software.amazon.jsii.Kernel.get(this, "serverNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceAccessRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccessRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSslModeInput() {
        return software.amazon.jsii.Kernel.get(this, "sslModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificateArn() {
        return software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificateArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificateArn", java.util.Objects.requireNonNull(value, "certificateArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName() {
        return software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatabaseName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "databaseName", java.util.Objects.requireNonNull(value, "databaseName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointId() {
        return software.amazon.jsii.Kernel.get(this, "endpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointId", java.util.Objects.requireNonNull(value, "endpointId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointType() {
        return software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointType", java.util.Objects.requireNonNull(value, "endpointType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineName() {
        return software.amazon.jsii.Kernel.get(this, "engineName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineName", java.util.Objects.requireNonNull(value, "engineName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExtraConnectionAttributes() {
        return software.amazon.jsii.Kernel.get(this, "extraConnectionAttributes", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExtraConnectionAttributes(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "extraConnectionAttributes", java.util.Objects.requireNonNull(value, "extraConnectionAttributes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", java.util.Objects.requireNonNull(value, "kmsKeyArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassword() {
        return software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "password", java.util.Objects.requireNonNull(value, "password is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPort() {
        return software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "port", java.util.Objects.requireNonNull(value, "port is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretsManagerAccessRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "secretsManagerAccessRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretsManagerAccessRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretsManagerAccessRoleArn", java.util.Objects.requireNonNull(value, "secretsManagerAccessRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretsManagerArn() {
        return software.amazon.jsii.Kernel.get(this, "secretsManagerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretsManagerArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretsManagerArn", java.util.Objects.requireNonNull(value, "secretsManagerArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerName() {
        return software.amazon.jsii.Kernel.get(this, "serverName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServerName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serverName", java.util.Objects.requireNonNull(value, "serverName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceAccessRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccessRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceAccessRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceAccessRole", java.util.Objects.requireNonNull(value, "serviceAccessRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSslMode() {
        return software.amazon.jsii.Kernel.get(this, "sslMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSslMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sslMode", java.util.Objects.requireNonNull(value, "sslMode is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getUsername() {
        return software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "username", java.util.Objects.requireNonNull(value, "username is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.dms.DmsEndpoint}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.dms.DmsEndpoint> {
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
        private final imports.aws.dms.DmsEndpointConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.dms.DmsEndpointConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#endpoint_id DmsEndpoint#endpoint_id}.
         * <p>
         * @return {@code this}
         * @param endpointId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#endpoint_id DmsEndpoint#endpoint_id}. This parameter is required.
         */
        public Builder endpointId(final java.lang.String endpointId) {
            this.config.endpointId(endpointId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#endpoint_type DmsEndpoint#endpoint_type}.
         * <p>
         * @return {@code this}
         * @param endpointType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#endpoint_type DmsEndpoint#endpoint_type}. This parameter is required.
         */
        public Builder endpointType(final java.lang.String endpointType) {
            this.config.endpointType(endpointType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#engine_name DmsEndpoint#engine_name}.
         * <p>
         * @return {@code this}
         * @param engineName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#engine_name DmsEndpoint#engine_name}. This parameter is required.
         */
        public Builder engineName(final java.lang.String engineName) {
            this.config.engineName(engineName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#certificate_arn DmsEndpoint#certificate_arn}.
         * <p>
         * @return {@code this}
         * @param certificateArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#certificate_arn DmsEndpoint#certificate_arn}. This parameter is required.
         */
        public Builder certificateArn(final java.lang.String certificateArn) {
            this.config.certificateArn(certificateArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#database_name DmsEndpoint#database_name}.
         * <p>
         * @return {@code this}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#database_name DmsEndpoint#database_name}. This parameter is required.
         */
        public Builder databaseName(final java.lang.String databaseName) {
            this.config.databaseName(databaseName);
            return this;
        }

        /**
         * elasticsearch_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#elasticsearch_settings DmsEndpoint#elasticsearch_settings}
         * <p>
         * @return {@code this}
         * @param elasticsearchSettings elasticsearch_settings block. This parameter is required.
         */
        public Builder elasticsearchSettings(final imports.aws.dms.DmsEndpointElasticsearchSettings elasticsearchSettings) {
            this.config.elasticsearchSettings(elasticsearchSettings);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#extra_connection_attributes DmsEndpoint#extra_connection_attributes}.
         * <p>
         * @return {@code this}
         * @param extraConnectionAttributes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#extra_connection_attributes DmsEndpoint#extra_connection_attributes}. This parameter is required.
         */
        public Builder extraConnectionAttributes(final java.lang.String extraConnectionAttributes) {
            this.config.extraConnectionAttributes(extraConnectionAttributes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#id DmsEndpoint#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#id DmsEndpoint#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * kafka_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#kafka_settings DmsEndpoint#kafka_settings}
         * <p>
         * @return {@code this}
         * @param kafkaSettings kafka_settings block. This parameter is required.
         */
        public Builder kafkaSettings(final imports.aws.dms.DmsEndpointKafkaSettings kafkaSettings) {
            this.config.kafkaSettings(kafkaSettings);
            return this;
        }

        /**
         * kinesis_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#kinesis_settings DmsEndpoint#kinesis_settings}
         * <p>
         * @return {@code this}
         * @param kinesisSettings kinesis_settings block. This parameter is required.
         */
        public Builder kinesisSettings(final imports.aws.dms.DmsEndpointKinesisSettings kinesisSettings) {
            this.config.kinesisSettings(kinesisSettings);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#kms_key_arn DmsEndpoint#kms_key_arn}.
         * <p>
         * @return {@code this}
         * @param kmsKeyArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#kms_key_arn DmsEndpoint#kms_key_arn}. This parameter is required.
         */
        public Builder kmsKeyArn(final java.lang.String kmsKeyArn) {
            this.config.kmsKeyArn(kmsKeyArn);
            return this;
        }

        /**
         * mongodb_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#mongodb_settings DmsEndpoint#mongodb_settings}
         * <p>
         * @return {@code this}
         * @param mongodbSettings mongodb_settings block. This parameter is required.
         */
        public Builder mongodbSettings(final imports.aws.dms.DmsEndpointMongodbSettings mongodbSettings) {
            this.config.mongodbSettings(mongodbSettings);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#password DmsEndpoint#password}.
         * <p>
         * @return {@code this}
         * @param password Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#password DmsEndpoint#password}. This parameter is required.
         */
        public Builder password(final java.lang.String password) {
            this.config.password(password);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#port DmsEndpoint#port}.
         * <p>
         * @return {@code this}
         * @param port Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#port DmsEndpoint#port}. This parameter is required.
         */
        public Builder port(final java.lang.Number port) {
            this.config.port(port);
            return this;
        }

        /**
         * redshift_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#redshift_settings DmsEndpoint#redshift_settings}
         * <p>
         * @return {@code this}
         * @param redshiftSettings redshift_settings block. This parameter is required.
         */
        public Builder redshiftSettings(final imports.aws.dms.DmsEndpointRedshiftSettings redshiftSettings) {
            this.config.redshiftSettings(redshiftSettings);
            return this;
        }

        /**
         * s3_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#s3_settings DmsEndpoint#s3_settings}
         * <p>
         * @return {@code this}
         * @param s3Settings s3_settings block. This parameter is required.
         */
        public Builder s3Settings(final imports.aws.dms.DmsEndpointS3Settings s3Settings) {
            this.config.s3Settings(s3Settings);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#secrets_manager_access_role_arn DmsEndpoint#secrets_manager_access_role_arn}.
         * <p>
         * @return {@code this}
         * @param secretsManagerAccessRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#secrets_manager_access_role_arn DmsEndpoint#secrets_manager_access_role_arn}. This parameter is required.
         */
        public Builder secretsManagerAccessRoleArn(final java.lang.String secretsManagerAccessRoleArn) {
            this.config.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#secrets_manager_arn DmsEndpoint#secrets_manager_arn}.
         * <p>
         * @return {@code this}
         * @param secretsManagerArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#secrets_manager_arn DmsEndpoint#secrets_manager_arn}. This parameter is required.
         */
        public Builder secretsManagerArn(final java.lang.String secretsManagerArn) {
            this.config.secretsManagerArn(secretsManagerArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#server_name DmsEndpoint#server_name}.
         * <p>
         * @return {@code this}
         * @param serverName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#server_name DmsEndpoint#server_name}. This parameter is required.
         */
        public Builder serverName(final java.lang.String serverName) {
            this.config.serverName(serverName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#service_access_role DmsEndpoint#service_access_role}.
         * <p>
         * @return {@code this}
         * @param serviceAccessRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#service_access_role DmsEndpoint#service_access_role}. This parameter is required.
         */
        public Builder serviceAccessRole(final java.lang.String serviceAccessRole) {
            this.config.serviceAccessRole(serviceAccessRole);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#ssl_mode DmsEndpoint#ssl_mode}.
         * <p>
         * @return {@code this}
         * @param sslMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#ssl_mode DmsEndpoint#ssl_mode}. This parameter is required.
         */
        public Builder sslMode(final java.lang.String sslMode) {
            this.config.sslMode(sslMode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#tags DmsEndpoint#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#tags DmsEndpoint#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#tags_all DmsEndpoint#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#tags_all DmsEndpoint#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#timeouts DmsEndpoint#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.dms.DmsEndpointTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#username DmsEndpoint#username}.
         * <p>
         * @return {@code this}
         * @param username Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dms_endpoint#username DmsEndpoint#username}. This parameter is required.
         */
        public Builder username(final java.lang.String username) {
            this.config.username(username);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.dms.DmsEndpoint}.
         */
        @Override
        public imports.aws.dms.DmsEndpoint build() {
            return new imports.aws.dms.DmsEndpoint(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
