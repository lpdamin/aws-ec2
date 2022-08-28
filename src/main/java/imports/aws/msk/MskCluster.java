package imports.aws.msk;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster aws_msk_cluster}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.826Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskCluster")
public class MskCluster extends com.hashicorp.cdktf.TerraformResource {

    protected MskCluster(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskCluster(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.msk.MskCluster.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster aws_msk_cluster} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public MskCluster(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putBrokerNodeGroupInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfo value) {
        software.amazon.jsii.Kernel.call(this, "putBrokerNodeGroupInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putClientAuthentication(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterClientAuthentication value) {
        software.amazon.jsii.Kernel.call(this, "putClientAuthentication", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConfigurationInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterConfigurationInfo value) {
        software.amazon.jsii.Kernel.call(this, "putConfigurationInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEncryptionInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterEncryptionInfo value) {
        software.amazon.jsii.Kernel.call(this, "putEncryptionInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLoggingInfo(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterLoggingInfo value) {
        software.amazon.jsii.Kernel.call(this, "putLoggingInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOpenMonitoring(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoring value) {
        software.amazon.jsii.Kernel.call(this, "putOpenMonitoring", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClientAuthentication() {
        software.amazon.jsii.Kernel.call(this, "resetClientAuthentication", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfigurationInfo() {
        software.amazon.jsii.Kernel.call(this, "resetConfigurationInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionInfo() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnhancedMonitoring() {
        software.amazon.jsii.Kernel.call(this, "resetEnhancedMonitoring", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingInfo() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOpenMonitoring() {
        software.amazon.jsii.Kernel.call(this, "resetOpenMonitoring", software.amazon.jsii.NativeType.VOID);
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

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokers() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokers", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersPublicSaslIam() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersPublicSaslIam", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersPublicSaslScram() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersPublicSaslScram", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersPublicTls() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersPublicTls", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersSaslIam() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersSaslIam", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersSaslScram() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersSaslScram", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootstrapBrokersTls() {
        return software.amazon.jsii.Kernel.get(this, "bootstrapBrokersTls", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterBrokerNodeGroupInfoOutputReference getBrokerNodeGroupInfo() {
        return software.amazon.jsii.Kernel.get(this, "brokerNodeGroupInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterClientAuthenticationOutputReference getClientAuthentication() {
        return software.amazon.jsii.Kernel.get(this, "clientAuthentication", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthenticationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterConfigurationInfoOutputReference getConfigurationInfo() {
        return software.amazon.jsii.Kernel.get(this, "configurationInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterConfigurationInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCurrentVersion() {
        return software.amazon.jsii.Kernel.get(this, "currentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterEncryptionInfoOutputReference getEncryptionInfo() {
        return software.amazon.jsii.Kernel.get(this, "encryptionInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterEncryptionInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterLoggingInfoOutputReference getLoggingInfo() {
        return software.amazon.jsii.Kernel.get(this, "loggingInfo", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterLoggingInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterOpenMonitoringOutputReference getOpenMonitoring() {
        return software.amazon.jsii.Kernel.get(this, "openMonitoring", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoringOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZookeeperConnectString() {
        return software.amazon.jsii.Kernel.get(this, "zookeeperConnectString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZookeeperConnectStringTls() {
        return software.amazon.jsii.Kernel.get(this, "zookeeperConnectStringTls", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfo getBrokerNodeGroupInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "brokerNodeGroupInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthentication getClientAuthenticationInput() {
        return software.amazon.jsii.Kernel.get(this, "clientAuthenticationInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthentication.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterConfigurationInfo getConfigurationInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterConfigurationInfo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterEncryptionInfo getEncryptionInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterEncryptionInfo.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEnhancedMonitoringInput() {
        return software.amazon.jsii.Kernel.get(this, "enhancedMonitoringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKafkaVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "kafkaVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterLoggingInfo getLoggingInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "loggingInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterLoggingInfo.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfBrokerNodesInput() {
        return software.amazon.jsii.Kernel.get(this, "numberOfBrokerNodesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterOpenMonitoring getOpenMonitoringInput() {
        return software.amazon.jsii.Kernel.get(this, "openMonitoringInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterOpenMonitoring.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterName() {
        return software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterName", java.util.Objects.requireNonNull(value, "clusterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEnhancedMonitoring() {
        return software.amazon.jsii.Kernel.get(this, "enhancedMonitoring", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEnhancedMonitoring(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "enhancedMonitoring", java.util.Objects.requireNonNull(value, "enhancedMonitoring is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKafkaVersion() {
        return software.amazon.jsii.Kernel.get(this, "kafkaVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKafkaVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kafkaVersion", java.util.Objects.requireNonNull(value, "kafkaVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfBrokerNodes() {
        return software.amazon.jsii.Kernel.get(this, "numberOfBrokerNodes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfBrokerNodes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfBrokerNodes", java.util.Objects.requireNonNull(value, "numberOfBrokerNodes is required"));
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
     * A fluent builder for {@link imports.aws.msk.MskCluster}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.msk.MskCluster> {
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
        private final imports.aws.msk.MskClusterConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.msk.MskClusterConfig.Builder();
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
         * broker_node_group_info block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#broker_node_group_info MskCluster#broker_node_group_info}
         * <p>
         * @return {@code this}
         * @param brokerNodeGroupInfo broker_node_group_info block. This parameter is required.
         */
        public Builder brokerNodeGroupInfo(final imports.aws.msk.MskClusterBrokerNodeGroupInfo brokerNodeGroupInfo) {
            this.config.brokerNodeGroupInfo(brokerNodeGroupInfo);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#cluster_name MskCluster#cluster_name}.
         * <p>
         * @return {@code this}
         * @param clusterName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#cluster_name MskCluster#cluster_name}. This parameter is required.
         */
        public Builder clusterName(final java.lang.String clusterName) {
            this.config.clusterName(clusterName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#kafka_version MskCluster#kafka_version}.
         * <p>
         * @return {@code this}
         * @param kafkaVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#kafka_version MskCluster#kafka_version}. This parameter is required.
         */
        public Builder kafkaVersion(final java.lang.String kafkaVersion) {
            this.config.kafkaVersion(kafkaVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#number_of_broker_nodes MskCluster#number_of_broker_nodes}.
         * <p>
         * @return {@code this}
         * @param numberOfBrokerNodes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#number_of_broker_nodes MskCluster#number_of_broker_nodes}. This parameter is required.
         */
        public Builder numberOfBrokerNodes(final java.lang.Number numberOfBrokerNodes) {
            this.config.numberOfBrokerNodes(numberOfBrokerNodes);
            return this;
        }

        /**
         * client_authentication block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#client_authentication MskCluster#client_authentication}
         * <p>
         * @return {@code this}
         * @param clientAuthentication client_authentication block. This parameter is required.
         */
        public Builder clientAuthentication(final imports.aws.msk.MskClusterClientAuthentication clientAuthentication) {
            this.config.clientAuthentication(clientAuthentication);
            return this;
        }

        /**
         * configuration_info block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#configuration_info MskCluster#configuration_info}
         * <p>
         * @return {@code this}
         * @param configurationInfo configuration_info block. This parameter is required.
         */
        public Builder configurationInfo(final imports.aws.msk.MskClusterConfigurationInfo configurationInfo) {
            this.config.configurationInfo(configurationInfo);
            return this;
        }

        /**
         * encryption_info block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#encryption_info MskCluster#encryption_info}
         * <p>
         * @return {@code this}
         * @param encryptionInfo encryption_info block. This parameter is required.
         */
        public Builder encryptionInfo(final imports.aws.msk.MskClusterEncryptionInfo encryptionInfo) {
            this.config.encryptionInfo(encryptionInfo);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enhanced_monitoring MskCluster#enhanced_monitoring}.
         * <p>
         * @return {@code this}
         * @param enhancedMonitoring Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enhanced_monitoring MskCluster#enhanced_monitoring}. This parameter is required.
         */
        public Builder enhancedMonitoring(final java.lang.String enhancedMonitoring) {
            this.config.enhancedMonitoring(enhancedMonitoring);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#id MskCluster#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#id MskCluster#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * logging_info block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#logging_info MskCluster#logging_info}
         * <p>
         * @return {@code this}
         * @param loggingInfo logging_info block. This parameter is required.
         */
        public Builder loggingInfo(final imports.aws.msk.MskClusterLoggingInfo loggingInfo) {
            this.config.loggingInfo(loggingInfo);
            return this;
        }

        /**
         * open_monitoring block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#open_monitoring MskCluster#open_monitoring}
         * <p>
         * @return {@code this}
         * @param openMonitoring open_monitoring block. This parameter is required.
         */
        public Builder openMonitoring(final imports.aws.msk.MskClusterOpenMonitoring openMonitoring) {
            this.config.openMonitoring(openMonitoring);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#tags MskCluster#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#tags MskCluster#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#tags_all MskCluster#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#tags_all MskCluster#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#timeouts MskCluster#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.msk.MskClusterTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.msk.MskCluster}.
         */
        @Override
        public imports.aws.msk.MskCluster build() {
            return new imports.aws.msk.MskCluster(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
