package imports.aws.appstream;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder aws_appstream_image_builder}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.667Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamImageBuilder")
public class AppstreamImageBuilder extends com.hashicorp.cdktf.TerraformResource {

    protected AppstreamImageBuilder(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppstreamImageBuilder(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appstream.AppstreamImageBuilder.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder aws_appstream_image_builder} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppstreamImageBuilder(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamImageBuilderConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAccessEndpoint(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAccessEndpoint", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDomainJoinInfo(final @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamImageBuilderDomainJoinInfo value) {
        software.amazon.jsii.Kernel.call(this, "putDomainJoinInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVpcConfig(final @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamImageBuilderVpcConfig value) {
        software.amazon.jsii.Kernel.call(this, "putVpcConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccessEndpoint() {
        software.amazon.jsii.Kernel.call(this, "resetAccessEndpoint", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAppstreamAgentVersion() {
        software.amazon.jsii.Kernel.call(this, "resetAppstreamAgentVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisplayName() {
        software.amazon.jsii.Kernel.call(this, "resetDisplayName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDomainJoinInfo() {
        software.amazon.jsii.Kernel.call(this, "resetDomainJoinInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableDefaultInternetAccess() {
        software.amazon.jsii.Kernel.call(this, "resetEnableDefaultInternetAccess", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIamRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetIamRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageArn() {
        software.amazon.jsii.Kernel.call(this, "resetImageArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageName() {
        software.amazon.jsii.Kernel.call(this, "resetImageName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVpcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetVpcConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamImageBuilderAccessEndpointList getAccessEndpoint() {
        return software.amazon.jsii.Kernel.get(this, "accessEndpoint", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamImageBuilderAccessEndpointList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedTime() {
        return software.amazon.jsii.Kernel.get(this, "createdTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamImageBuilderDomainJoinInfoOutputReference getDomainJoinInfo() {
        return software.amazon.jsii.Kernel.get(this, "domainJoinInfo", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamImageBuilderDomainJoinInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamImageBuilderVpcConfigOutputReference getVpcConfig() {
        return software.amazon.jsii.Kernel.get(this, "vpcConfig", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamImageBuilderVpcConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAccessEndpointInput() {
        return software.amazon.jsii.Kernel.get(this, "accessEndpointInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAppstreamAgentVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "appstreamAgentVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDisplayNameInput() {
        return software.amazon.jsii.Kernel.get(this, "displayNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamImageBuilderDomainJoinInfo getDomainJoinInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "domainJoinInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamImageBuilderDomainJoinInfo.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableDefaultInternetAccessInput() {
        return software.amazon.jsii.Kernel.get(this, "enableDefaultInternetAccessInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageArnInput() {
        return software.amazon.jsii.Kernel.get(this, "imageArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageNameInput() {
        return software.amazon.jsii.Kernel.get(this, "imageNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamImageBuilderVpcConfig getVpcConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamImageBuilderVpcConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAppstreamAgentVersion() {
        return software.amazon.jsii.Kernel.get(this, "appstreamAgentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAppstreamAgentVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "appstreamAgentVersion", java.util.Objects.requireNonNull(value, "appstreamAgentVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDisplayName() {
        return software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDisplayName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "displayName", java.util.Objects.requireNonNull(value, "displayName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableDefaultInternetAccess() {
        return software.amazon.jsii.Kernel.get(this, "enableDefaultInternetAccess", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableDefaultInternetAccess(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableDefaultInternetAccess", java.util.Objects.requireNonNull(value, "enableDefaultInternetAccess is required"));
    }

    public void setEnableDefaultInternetAccess(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableDefaultInternetAccess", java.util.Objects.requireNonNull(value, "enableDefaultInternetAccess is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRoleArn", java.util.Objects.requireNonNull(value, "iamRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageArn() {
        return software.amazon.jsii.Kernel.get(this, "imageArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageArn", java.util.Objects.requireNonNull(value, "imageArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageName() {
        return software.amazon.jsii.Kernel.get(this, "imageName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageName", java.util.Objects.requireNonNull(value, "imageName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
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
     * A fluent builder for {@link imports.aws.appstream.AppstreamImageBuilder}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appstream.AppstreamImageBuilder> {
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
        private final imports.aws.appstream.AppstreamImageBuilderConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appstream.AppstreamImageBuilderConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#instance_type AppstreamImageBuilder#instance_type}.
         * <p>
         * @return {@code this}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#instance_type AppstreamImageBuilder#instance_type}. This parameter is required.
         */
        public Builder instanceType(final java.lang.String instanceType) {
            this.config.instanceType(instanceType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#name AppstreamImageBuilder#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#name AppstreamImageBuilder#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * access_endpoint block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#access_endpoint AppstreamImageBuilder#access_endpoint}
         * <p>
         * @return {@code this}
         * @param accessEndpoint access_endpoint block. This parameter is required.
         */
        public Builder accessEndpoint(final com.hashicorp.cdktf.IResolvable accessEndpoint) {
            this.config.accessEndpoint(accessEndpoint);
            return this;
        }
        /**
         * access_endpoint block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#access_endpoint AppstreamImageBuilder#access_endpoint}
         * <p>
         * @return {@code this}
         * @param accessEndpoint access_endpoint block. This parameter is required.
         */
        public Builder accessEndpoint(final java.util.List<? extends imports.aws.appstream.AppstreamImageBuilderAccessEndpoint> accessEndpoint) {
            this.config.accessEndpoint(accessEndpoint);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#appstream_agent_version AppstreamImageBuilder#appstream_agent_version}.
         * <p>
         * @return {@code this}
         * @param appstreamAgentVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#appstream_agent_version AppstreamImageBuilder#appstream_agent_version}. This parameter is required.
         */
        public Builder appstreamAgentVersion(final java.lang.String appstreamAgentVersion) {
            this.config.appstreamAgentVersion(appstreamAgentVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#description AppstreamImageBuilder#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#description AppstreamImageBuilder#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#display_name AppstreamImageBuilder#display_name}.
         * <p>
         * @return {@code this}
         * @param displayName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#display_name AppstreamImageBuilder#display_name}. This parameter is required.
         */
        public Builder displayName(final java.lang.String displayName) {
            this.config.displayName(displayName);
            return this;
        }

        /**
         * domain_join_info block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#domain_join_info AppstreamImageBuilder#domain_join_info}
         * <p>
         * @return {@code this}
         * @param domainJoinInfo domain_join_info block. This parameter is required.
         */
        public Builder domainJoinInfo(final imports.aws.appstream.AppstreamImageBuilderDomainJoinInfo domainJoinInfo) {
            this.config.domainJoinInfo(domainJoinInfo);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#enable_default_internet_access AppstreamImageBuilder#enable_default_internet_access}.
         * <p>
         * @return {@code this}
         * @param enableDefaultInternetAccess Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#enable_default_internet_access AppstreamImageBuilder#enable_default_internet_access}. This parameter is required.
         */
        public Builder enableDefaultInternetAccess(final java.lang.Boolean enableDefaultInternetAccess) {
            this.config.enableDefaultInternetAccess(enableDefaultInternetAccess);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#enable_default_internet_access AppstreamImageBuilder#enable_default_internet_access}.
         * <p>
         * @return {@code this}
         * @param enableDefaultInternetAccess Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#enable_default_internet_access AppstreamImageBuilder#enable_default_internet_access}. This parameter is required.
         */
        public Builder enableDefaultInternetAccess(final com.hashicorp.cdktf.IResolvable enableDefaultInternetAccess) {
            this.config.enableDefaultInternetAccess(enableDefaultInternetAccess);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#iam_role_arn AppstreamImageBuilder#iam_role_arn}.
         * <p>
         * @return {@code this}
         * @param iamRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#iam_role_arn AppstreamImageBuilder#iam_role_arn}. This parameter is required.
         */
        public Builder iamRoleArn(final java.lang.String iamRoleArn) {
            this.config.iamRoleArn(iamRoleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#id AppstreamImageBuilder#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#id AppstreamImageBuilder#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#image_arn AppstreamImageBuilder#image_arn}.
         * <p>
         * @return {@code this}
         * @param imageArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#image_arn AppstreamImageBuilder#image_arn}. This parameter is required.
         */
        public Builder imageArn(final java.lang.String imageArn) {
            this.config.imageArn(imageArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#image_name AppstreamImageBuilder#image_name}.
         * <p>
         * @return {@code this}
         * @param imageName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#image_name AppstreamImageBuilder#image_name}. This parameter is required.
         */
        public Builder imageName(final java.lang.String imageName) {
            this.config.imageName(imageName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#tags AppstreamImageBuilder#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#tags AppstreamImageBuilder#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#tags_all AppstreamImageBuilder#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#tags_all AppstreamImageBuilder#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * vpc_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appstream_image_builder#vpc_config AppstreamImageBuilder#vpc_config}
         * <p>
         * @return {@code this}
         * @param vpcConfig vpc_config block. This parameter is required.
         */
        public Builder vpcConfig(final imports.aws.appstream.AppstreamImageBuilderVpcConfig vpcConfig) {
            this.config.vpcConfig(vpcConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appstream.AppstreamImageBuilder}.
         */
        @Override
        public imports.aws.appstream.AppstreamImageBuilder build() {
            return new imports.aws.appstream.AppstreamImageBuilder(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
