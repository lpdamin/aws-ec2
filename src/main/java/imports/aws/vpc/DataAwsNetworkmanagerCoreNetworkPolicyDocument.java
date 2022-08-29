package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document aws_networkmanager_core_network_policy_document}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.856Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument")
public class DataAwsNetworkmanagerCoreNetworkPolicyDocument extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocument(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocument(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document aws_networkmanager_core_network_policy_document} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsNetworkmanagerCoreNetworkPolicyDocument(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAttachmentPolicies(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAttachmentPolicies", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCoreNetworkConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCoreNetworkConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSegmentActions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSegmentActions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSegments(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSegments", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAttachmentPolicies() {
        software.amazon.jsii.Kernel.call(this, "resetAttachmentPolicies", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSegmentActions() {
        software.amazon.jsii.Kernel.call(this, "resetSegmentActions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetVersion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesList getAttachmentPolicies() {
        return software.amazon.jsii.Kernel.get(this, "attachmentPolicies", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentCoreNetworkConfigurationList getCoreNetworkConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "coreNetworkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentCoreNetworkConfigurationList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getJson() {
        return software.amazon.jsii.Kernel.get(this, "json", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsList getSegmentActions() {
        return software.amazon.jsii.Kernel.get(this, "segmentActions", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentsList getSegments() {
        return software.amazon.jsii.Kernel.get(this, "segments", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAttachmentPoliciesInput() {
        return software.amazon.jsii.Kernel.get(this, "attachmentPoliciesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCoreNetworkConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "coreNetworkConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSegmentActionsInput() {
        return software.amazon.jsii.Kernel.get(this, "segmentActionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSegmentsInput() {
        return software.amazon.jsii.Kernel.get(this, "segmentsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "versionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "version", java.util.Objects.requireNonNull(value, "version is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument> {
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
        private final imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentConfig.Builder();
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
         * core_network_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#core_network_configuration DataAwsNetworkmanagerCoreNetworkPolicyDocument#core_network_configuration}
         * <p>
         * @return {@code this}
         * @param coreNetworkConfiguration core_network_configuration block. This parameter is required.
         */
        public Builder coreNetworkConfiguration(final com.hashicorp.cdktf.IResolvable coreNetworkConfiguration) {
            this.config.coreNetworkConfiguration(coreNetworkConfiguration);
            return this;
        }
        /**
         * core_network_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#core_network_configuration DataAwsNetworkmanagerCoreNetworkPolicyDocument#core_network_configuration}
         * <p>
         * @return {@code this}
         * @param coreNetworkConfiguration core_network_configuration block. This parameter is required.
         */
        public Builder coreNetworkConfiguration(final java.util.List<? extends imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentCoreNetworkConfiguration> coreNetworkConfiguration) {
            this.config.coreNetworkConfiguration(coreNetworkConfiguration);
            return this;
        }

        /**
         * segments block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#segments DataAwsNetworkmanagerCoreNetworkPolicyDocument#segments}
         * <p>
         * @return {@code this}
         * @param segments segments block. This parameter is required.
         */
        public Builder segments(final com.hashicorp.cdktf.IResolvable segments) {
            this.config.segments(segments);
            return this;
        }
        /**
         * segments block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#segments DataAwsNetworkmanagerCoreNetworkPolicyDocument#segments}
         * <p>
         * @return {@code this}
         * @param segments segments block. This parameter is required.
         */
        public Builder segments(final java.util.List<? extends imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegments> segments) {
            this.config.segments(segments);
            return this;
        }

        /**
         * attachment_policies block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#attachment_policies DataAwsNetworkmanagerCoreNetworkPolicyDocument#attachment_policies}
         * <p>
         * @return {@code this}
         * @param attachmentPolicies attachment_policies block. This parameter is required.
         */
        public Builder attachmentPolicies(final com.hashicorp.cdktf.IResolvable attachmentPolicies) {
            this.config.attachmentPolicies(attachmentPolicies);
            return this;
        }
        /**
         * attachment_policies block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#attachment_policies DataAwsNetworkmanagerCoreNetworkPolicyDocument#attachment_policies}
         * <p>
         * @return {@code this}
         * @param attachmentPolicies attachment_policies block. This parameter is required.
         */
        public Builder attachmentPolicies(final java.util.List<? extends imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPolicies> attachmentPolicies) {
            this.config.attachmentPolicies(attachmentPolicies);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#id DataAwsNetworkmanagerCoreNetworkPolicyDocument#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#id DataAwsNetworkmanagerCoreNetworkPolicyDocument#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * segment_actions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#segment_actions DataAwsNetworkmanagerCoreNetworkPolicyDocument#segment_actions}
         * <p>
         * @return {@code this}
         * @param segmentActions segment_actions block. This parameter is required.
         */
        public Builder segmentActions(final com.hashicorp.cdktf.IResolvable segmentActions) {
            this.config.segmentActions(segmentActions);
            return this;
        }
        /**
         * segment_actions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#segment_actions DataAwsNetworkmanagerCoreNetworkPolicyDocument#segment_actions}
         * <p>
         * @return {@code this}
         * @param segmentActions segment_actions block. This parameter is required.
         */
        public Builder segmentActions(final java.util.List<? extends imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActions> segmentActions) {
            this.config.segmentActions(segmentActions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#version DataAwsNetworkmanagerCoreNetworkPolicyDocument#version}.
         * <p>
         * @return {@code this}
         * @param version Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#version DataAwsNetworkmanagerCoreNetworkPolicyDocument#version}. This parameter is required.
         */
        public Builder version(final java.lang.String version) {
            this.config.version(version);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument}.
         */
        @Override
        public imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument build() {
            return new imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocument(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
