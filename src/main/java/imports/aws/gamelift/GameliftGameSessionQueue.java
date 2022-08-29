package imports.aws.gamelift;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue aws_gamelift_game_session_queue}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.218Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftGameSessionQueue")
public class GameliftGameSessionQueue extends com.hashicorp.cdktf.TerraformResource {

    protected GameliftGameSessionQueue(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GameliftGameSessionQueue(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.gamelift.GameliftGameSessionQueue.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue aws_gamelift_game_session_queue} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public GameliftGameSessionQueue(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.gamelift.GameliftGameSessionQueueConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putPlayerLatencyPolicy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPlayerLatencyPolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDestinations() {
        software.amazon.jsii.Kernel.call(this, "resetDestinations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotificationTarget() {
        software.amazon.jsii.Kernel.call(this, "resetNotificationTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPlayerLatencyPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPlayerLatencyPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeoutInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetTimeoutInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.gamelift.GameliftGameSessionQueuePlayerLatencyPolicyList getPlayerLatencyPolicy() {
        return software.amazon.jsii.Kernel.get(this, "playerLatencyPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftGameSessionQueuePlayerLatencyPolicyList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDestinationsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "destinationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationTargetInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPlayerLatencyPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "playerLatencyPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDestinations() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "destinations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDestinations(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "destinations", java.util.Objects.requireNonNull(value, "destinations is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationTarget() {
        return software.amazon.jsii.Kernel.get(this, "notificationTarget", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationTarget(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationTarget", java.util.Objects.requireNonNull(value, "notificationTarget is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Number getTimeoutInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "timeoutInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeoutInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeoutInSeconds", java.util.Objects.requireNonNull(value, "timeoutInSeconds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.gamelift.GameliftGameSessionQueue}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.gamelift.GameliftGameSessionQueue> {
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
        private final imports.aws.gamelift.GameliftGameSessionQueueConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.gamelift.GameliftGameSessionQueueConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#name GameliftGameSessionQueue#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#name GameliftGameSessionQueue#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#destinations GameliftGameSessionQueue#destinations}.
         * <p>
         * @return {@code this}
         * @param destinations Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#destinations GameliftGameSessionQueue#destinations}. This parameter is required.
         */
        public Builder destinations(final java.util.List<java.lang.String> destinations) {
            this.config.destinations(destinations);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#id GameliftGameSessionQueue#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#id GameliftGameSessionQueue#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#notification_target GameliftGameSessionQueue#notification_target}.
         * <p>
         * @return {@code this}
         * @param notificationTarget Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#notification_target GameliftGameSessionQueue#notification_target}. This parameter is required.
         */
        public Builder notificationTarget(final java.lang.String notificationTarget) {
            this.config.notificationTarget(notificationTarget);
            return this;
        }

        /**
         * player_latency_policy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#player_latency_policy GameliftGameSessionQueue#player_latency_policy}
         * <p>
         * @return {@code this}
         * @param playerLatencyPolicy player_latency_policy block. This parameter is required.
         */
        public Builder playerLatencyPolicy(final com.hashicorp.cdktf.IResolvable playerLatencyPolicy) {
            this.config.playerLatencyPolicy(playerLatencyPolicy);
            return this;
        }
        /**
         * player_latency_policy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#player_latency_policy GameliftGameSessionQueue#player_latency_policy}
         * <p>
         * @return {@code this}
         * @param playerLatencyPolicy player_latency_policy block. This parameter is required.
         */
        public Builder playerLatencyPolicy(final java.util.List<? extends imports.aws.gamelift.GameliftGameSessionQueuePlayerLatencyPolicy> playerLatencyPolicy) {
            this.config.playerLatencyPolicy(playerLatencyPolicy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#tags GameliftGameSessionQueue#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#tags GameliftGameSessionQueue#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#tags_all GameliftGameSessionQueue#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#tags_all GameliftGameSessionQueue#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#timeout_in_seconds GameliftGameSessionQueue#timeout_in_seconds}.
         * <p>
         * @return {@code this}
         * @param timeoutInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_session_queue#timeout_in_seconds GameliftGameSessionQueue#timeout_in_seconds}. This parameter is required.
         */
        public Builder timeoutInSeconds(final java.lang.Number timeoutInSeconds) {
            this.config.timeoutInSeconds(timeoutInSeconds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.gamelift.GameliftGameSessionQueue}.
         */
        @Override
        public imports.aws.gamelift.GameliftGameSessionQueue build() {
            return new imports.aws.gamelift.GameliftGameSessionQueue(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
