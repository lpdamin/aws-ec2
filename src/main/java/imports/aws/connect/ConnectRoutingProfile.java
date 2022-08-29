package imports.aws.connect;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile aws_connect_routing_profile}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.253Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectRoutingProfile")
public class ConnectRoutingProfile extends com.hashicorp.cdktf.TerraformResource {

    protected ConnectRoutingProfile(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConnectRoutingProfile(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.connect.ConnectRoutingProfile.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile aws_connect_routing_profile} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ConnectRoutingProfile(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectRoutingProfileConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putMediaConcurrencies(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMediaConcurrencies", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putQueueConfigs(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putQueueConfigs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueueConfigs() {
        software.amazon.jsii.Kernel.call(this, "resetQueueConfigs", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectRoutingProfileMediaConcurrenciesList getMediaConcurrencies() {
        return software.amazon.jsii.Kernel.get(this, "mediaConcurrencies", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectRoutingProfileMediaConcurrenciesList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectRoutingProfileQueueConfigsList getQueueConfigs() {
        return software.amazon.jsii.Kernel.get(this, "queueConfigs", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectRoutingProfileQueueConfigsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectRoutingProfileQueueConfigsAssociatedList getQueueConfigsAssociated() {
        return software.amazon.jsii.Kernel.get(this, "queueConfigsAssociated", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectRoutingProfileQueueConfigsAssociatedList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoutingProfileId() {
        return software.amazon.jsii.Kernel.get(this, "routingProfileId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultOutboundQueueIdInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultOutboundQueueIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMediaConcurrenciesInput() {
        return software.amazon.jsii.Kernel.get(this, "mediaConcurrenciesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getQueueConfigsInput() {
        return software.amazon.jsii.Kernel.get(this, "queueConfigsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultOutboundQueueId() {
        return software.amazon.jsii.Kernel.get(this, "defaultOutboundQueueId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultOutboundQueueId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultOutboundQueueId", java.util.Objects.requireNonNull(value, "defaultOutboundQueueId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceId() {
        return software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceId", java.util.Objects.requireNonNull(value, "instanceId is required"));
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
     * A fluent builder for {@link imports.aws.connect.ConnectRoutingProfile}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.connect.ConnectRoutingProfile> {
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
        private final imports.aws.connect.ConnectRoutingProfileConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.connect.ConnectRoutingProfileConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#default_outbound_queue_id ConnectRoutingProfile#default_outbound_queue_id}.
         * <p>
         * @return {@code this}
         * @param defaultOutboundQueueId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#default_outbound_queue_id ConnectRoutingProfile#default_outbound_queue_id}. This parameter is required.
         */
        public Builder defaultOutboundQueueId(final java.lang.String defaultOutboundQueueId) {
            this.config.defaultOutboundQueueId(defaultOutboundQueueId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#description ConnectRoutingProfile#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#description ConnectRoutingProfile#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#instance_id ConnectRoutingProfile#instance_id}.
         * <p>
         * @return {@code this}
         * @param instanceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#instance_id ConnectRoutingProfile#instance_id}. This parameter is required.
         */
        public Builder instanceId(final java.lang.String instanceId) {
            this.config.instanceId(instanceId);
            return this;
        }

        /**
         * media_concurrencies block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#media_concurrencies ConnectRoutingProfile#media_concurrencies}
         * <p>
         * @return {@code this}
         * @param mediaConcurrencies media_concurrencies block. This parameter is required.
         */
        public Builder mediaConcurrencies(final com.hashicorp.cdktf.IResolvable mediaConcurrencies) {
            this.config.mediaConcurrencies(mediaConcurrencies);
            return this;
        }
        /**
         * media_concurrencies block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#media_concurrencies ConnectRoutingProfile#media_concurrencies}
         * <p>
         * @return {@code this}
         * @param mediaConcurrencies media_concurrencies block. This parameter is required.
         */
        public Builder mediaConcurrencies(final java.util.List<? extends imports.aws.connect.ConnectRoutingProfileMediaConcurrencies> mediaConcurrencies) {
            this.config.mediaConcurrencies(mediaConcurrencies);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#name ConnectRoutingProfile#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#name ConnectRoutingProfile#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#id ConnectRoutingProfile#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#id ConnectRoutingProfile#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * queue_configs block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#queue_configs ConnectRoutingProfile#queue_configs}
         * <p>
         * @return {@code this}
         * @param queueConfigs queue_configs block. This parameter is required.
         */
        public Builder queueConfigs(final com.hashicorp.cdktf.IResolvable queueConfigs) {
            this.config.queueConfigs(queueConfigs);
            return this;
        }
        /**
         * queue_configs block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#queue_configs ConnectRoutingProfile#queue_configs}
         * <p>
         * @return {@code this}
         * @param queueConfigs queue_configs block. This parameter is required.
         */
        public Builder queueConfigs(final java.util.List<? extends imports.aws.connect.ConnectRoutingProfileQueueConfigs> queueConfigs) {
            this.config.queueConfigs(queueConfigs);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#tags ConnectRoutingProfile#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#tags ConnectRoutingProfile#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#tags_all ConnectRoutingProfile#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/connect_routing_profile#tags_all ConnectRoutingProfile#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.connect.ConnectRoutingProfile}.
         */
        @Override
        public imports.aws.connect.ConnectRoutingProfile build() {
            return new imports.aws.connect.ConnectRoutingProfile(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
