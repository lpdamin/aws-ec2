package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.173Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersOutputReference")
public class QuicksightDataSourceParametersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceParametersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceParametersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceParametersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAmazonElasticsearch(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAmazonElasticsearch value) {
        software.amazon.jsii.Kernel.call(this, "putAmazonElasticsearch", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAthena(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAthena value) {
        software.amazon.jsii.Kernel.call(this, "putAthena", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAurora(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAurora value) {
        software.amazon.jsii.Kernel.call(this, "putAurora", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAuroraPostgresql(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAuroraPostgresql value) {
        software.amazon.jsii.Kernel.call(this, "putAuroraPostgresql", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAwsIotAnalytics(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAwsIotAnalytics value) {
        software.amazon.jsii.Kernel.call(this, "putAwsIotAnalytics", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putJira(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersJira value) {
        software.amazon.jsii.Kernel.call(this, "putJira", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMariaDb(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersMariaDb value) {
        software.amazon.jsii.Kernel.call(this, "putMariaDb", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMysql(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersMysql value) {
        software.amazon.jsii.Kernel.call(this, "putMysql", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOracle(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersOracle value) {
        software.amazon.jsii.Kernel.call(this, "putOracle", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPostgresql(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersPostgresql value) {
        software.amazon.jsii.Kernel.call(this, "putPostgresql", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPresto(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersPresto value) {
        software.amazon.jsii.Kernel.call(this, "putPresto", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRds(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersRds value) {
        software.amazon.jsii.Kernel.call(this, "putRds", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedshift(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersRedshift value) {
        software.amazon.jsii.Kernel.call(this, "putRedshift", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersS3 value) {
        software.amazon.jsii.Kernel.call(this, "putS3", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServiceNow(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersServiceNow value) {
        software.amazon.jsii.Kernel.call(this, "putServiceNow", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSnowflake(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersSnowflake value) {
        software.amazon.jsii.Kernel.call(this, "putSnowflake", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpark(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersSpark value) {
        software.amazon.jsii.Kernel.call(this, "putSpark", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSqlServer(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersSqlServer value) {
        software.amazon.jsii.Kernel.call(this, "putSqlServer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTeradata(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersTeradata value) {
        software.amazon.jsii.Kernel.call(this, "putTeradata", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTwitter(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersTwitter value) {
        software.amazon.jsii.Kernel.call(this, "putTwitter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAmazonElasticsearch() {
        software.amazon.jsii.Kernel.call(this, "resetAmazonElasticsearch", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAthena() {
        software.amazon.jsii.Kernel.call(this, "resetAthena", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAurora() {
        software.amazon.jsii.Kernel.call(this, "resetAurora", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuroraPostgresql() {
        software.amazon.jsii.Kernel.call(this, "resetAuroraPostgresql", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAwsIotAnalytics() {
        software.amazon.jsii.Kernel.call(this, "resetAwsIotAnalytics", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJira() {
        software.amazon.jsii.Kernel.call(this, "resetJira", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMariaDb() {
        software.amazon.jsii.Kernel.call(this, "resetMariaDb", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMysql() {
        software.amazon.jsii.Kernel.call(this, "resetMysql", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOracle() {
        software.amazon.jsii.Kernel.call(this, "resetOracle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPostgresql() {
        software.amazon.jsii.Kernel.call(this, "resetPostgresql", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPresto() {
        software.amazon.jsii.Kernel.call(this, "resetPresto", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRds() {
        software.amazon.jsii.Kernel.call(this, "resetRds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedshift() {
        software.amazon.jsii.Kernel.call(this, "resetRedshift", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3() {
        software.amazon.jsii.Kernel.call(this, "resetS3", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceNow() {
        software.amazon.jsii.Kernel.call(this, "resetServiceNow", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnowflake() {
        software.amazon.jsii.Kernel.call(this, "resetSnowflake", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpark() {
        software.amazon.jsii.Kernel.call(this, "resetSpark", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqlServer() {
        software.amazon.jsii.Kernel.call(this, "resetSqlServer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTeradata() {
        software.amazon.jsii.Kernel.call(this, "resetTeradata", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTwitter() {
        software.amazon.jsii.Kernel.call(this, "resetTwitter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAmazonElasticsearchOutputReference getAmazonElasticsearch() {
        return software.amazon.jsii.Kernel.get(this, "amazonElasticsearch", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAmazonElasticsearchOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAthenaOutputReference getAthena() {
        return software.amazon.jsii.Kernel.get(this, "athena", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAthenaOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAuroraOutputReference getAurora() {
        return software.amazon.jsii.Kernel.get(this, "aurora", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAuroraOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAuroraPostgresqlOutputReference getAuroraPostgresql() {
        return software.amazon.jsii.Kernel.get(this, "auroraPostgresql", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAuroraPostgresqlOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersAwsIotAnalyticsOutputReference getAwsIotAnalytics() {
        return software.amazon.jsii.Kernel.get(this, "awsIotAnalytics", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAwsIotAnalyticsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersJiraOutputReference getJira() {
        return software.amazon.jsii.Kernel.get(this, "jira", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersJiraOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersMariaDbOutputReference getMariaDb() {
        return software.amazon.jsii.Kernel.get(this, "mariaDb", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersMariaDbOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersMysqlOutputReference getMysql() {
        return software.amazon.jsii.Kernel.get(this, "mysql", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersMysqlOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersOracleOutputReference getOracle() {
        return software.amazon.jsii.Kernel.get(this, "oracle", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersOracleOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersPostgresqlOutputReference getPostgresql() {
        return software.amazon.jsii.Kernel.get(this, "postgresql", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersPostgresqlOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersPrestoOutputReference getPresto() {
        return software.amazon.jsii.Kernel.get(this, "presto", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersPrestoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersRdsOutputReference getRds() {
        return software.amazon.jsii.Kernel.get(this, "rds", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersRdsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersRedshiftOutputReference getRedshift() {
        return software.amazon.jsii.Kernel.get(this, "redshift", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersRedshiftOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersS3OutputReference getS3() {
        return software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersS3OutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersServiceNowOutputReference getServiceNow() {
        return software.amazon.jsii.Kernel.get(this, "serviceNow", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersServiceNowOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersSnowflakeOutputReference getSnowflake() {
        return software.amazon.jsii.Kernel.get(this, "snowflake", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersSnowflakeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersSparkOutputReference getSpark() {
        return software.amazon.jsii.Kernel.get(this, "spark", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersSparkOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersSqlServerOutputReference getSqlServer() {
        return software.amazon.jsii.Kernel.get(this, "sqlServer", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersSqlServerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersTeradataOutputReference getTeradata() {
        return software.amazon.jsii.Kernel.get(this, "teradata", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersTeradataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceParametersTwitterOutputReference getTwitter() {
        return software.amazon.jsii.Kernel.get(this, "twitter", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersTwitterOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAmazonElasticsearch getAmazonElasticsearchInput() {
        return software.amazon.jsii.Kernel.get(this, "amazonElasticsearchInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAmazonElasticsearch.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAthena getAthenaInput() {
        return software.amazon.jsii.Kernel.get(this, "athenaInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAthena.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAurora getAuroraInput() {
        return software.amazon.jsii.Kernel.get(this, "auroraInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAurora.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAuroraPostgresql getAuroraPostgresqlInput() {
        return software.amazon.jsii.Kernel.get(this, "auroraPostgresqlInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAuroraPostgresql.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAwsIotAnalytics getAwsIotAnalyticsInput() {
        return software.amazon.jsii.Kernel.get(this, "awsIotAnalyticsInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAwsIotAnalytics.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersJira getJiraInput() {
        return software.amazon.jsii.Kernel.get(this, "jiraInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersJira.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersMariaDb getMariaDbInput() {
        return software.amazon.jsii.Kernel.get(this, "mariaDbInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersMariaDb.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersMysql getMysqlInput() {
        return software.amazon.jsii.Kernel.get(this, "mysqlInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersMysql.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersOracle getOracleInput() {
        return software.amazon.jsii.Kernel.get(this, "oracleInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersOracle.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersPostgresql getPostgresqlInput() {
        return software.amazon.jsii.Kernel.get(this, "postgresqlInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersPostgresql.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersPresto getPrestoInput() {
        return software.amazon.jsii.Kernel.get(this, "prestoInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersPresto.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersRds getRdsInput() {
        return software.amazon.jsii.Kernel.get(this, "rdsInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersRds.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersRedshift getRedshiftInput() {
        return software.amazon.jsii.Kernel.get(this, "redshiftInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersRedshift.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersS3 getS3Input() {
        return software.amazon.jsii.Kernel.get(this, "s3Input", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersS3.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersServiceNow getServiceNowInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNowInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersServiceNow.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersSnowflake getSnowflakeInput() {
        return software.amazon.jsii.Kernel.get(this, "snowflakeInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersSnowflake.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersSpark getSparkInput() {
        return software.amazon.jsii.Kernel.get(this, "sparkInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersSpark.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersSqlServer getSqlServerInput() {
        return software.amazon.jsii.Kernel.get(this, "sqlServerInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersSqlServer.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersTeradata getTeradataInput() {
        return software.amazon.jsii.Kernel.get(this, "teradataInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersTeradata.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersTwitter getTwitterInput() {
        return software.amazon.jsii.Kernel.get(this, "twitterInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersTwitter.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParameters getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParameters.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParameters value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
