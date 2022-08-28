package imports.aws.chime;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming aws_chime_voice_connector_streaming}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.118Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.chime.ChimeVoiceConnectorStreaming")
public class ChimeVoiceConnectorStreaming extends com.hashicorp.cdktf.TerraformResource {

    protected ChimeVoiceConnectorStreaming(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ChimeVoiceConnectorStreaming(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.chime.ChimeVoiceConnectorStreaming.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming aws_chime_voice_connector_streaming} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ChimeVoiceConnectorStreaming(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.chime.ChimeVoiceConnectorStreamingConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDisabled() {
        software.amazon.jsii.Kernel.call(this, "resetDisabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStreamingNotificationTargets() {
        software.amazon.jsii.Kernel.call(this, "resetStreamingNotificationTargets", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.Number getDataRetentionInput() {
        return software.amazon.jsii.Kernel.get(this, "dataRetentionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisabledInput() {
        return software.amazon.jsii.Kernel.get(this, "disabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStreamingNotificationTargetsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "streamingNotificationTargetsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVoiceConnectorIdInput() {
        return software.amazon.jsii.Kernel.get(this, "voiceConnectorIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDataRetention() {
        return software.amazon.jsii.Kernel.get(this, "dataRetention", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDataRetention(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "dataRetention", java.util.Objects.requireNonNull(value, "dataRetention is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisabled() {
        return software.amazon.jsii.Kernel.get(this, "disabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disabled", java.util.Objects.requireNonNull(value, "disabled is required"));
    }

    public void setDisabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disabled", java.util.Objects.requireNonNull(value, "disabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getStreamingNotificationTargets() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "streamingNotificationTargets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setStreamingNotificationTargets(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "streamingNotificationTargets", java.util.Objects.requireNonNull(value, "streamingNotificationTargets is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVoiceConnectorId() {
        return software.amazon.jsii.Kernel.get(this, "voiceConnectorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVoiceConnectorId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "voiceConnectorId", java.util.Objects.requireNonNull(value, "voiceConnectorId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.chime.ChimeVoiceConnectorStreaming}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.chime.ChimeVoiceConnectorStreaming> {
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
        private final imports.aws.chime.ChimeVoiceConnectorStreamingConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.chime.ChimeVoiceConnectorStreamingConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#data_retention ChimeVoiceConnectorStreaming#data_retention}.
         * <p>
         * @return {@code this}
         * @param dataRetention Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#data_retention ChimeVoiceConnectorStreaming#data_retention}. This parameter is required.
         */
        public Builder dataRetention(final java.lang.Number dataRetention) {
            this.config.dataRetention(dataRetention);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#voice_connector_id ChimeVoiceConnectorStreaming#voice_connector_id}.
         * <p>
         * @return {@code this}
         * @param voiceConnectorId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#voice_connector_id ChimeVoiceConnectorStreaming#voice_connector_id}. This parameter is required.
         */
        public Builder voiceConnectorId(final java.lang.String voiceConnectorId) {
            this.config.voiceConnectorId(voiceConnectorId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#disabled ChimeVoiceConnectorStreaming#disabled}.
         * <p>
         * @return {@code this}
         * @param disabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#disabled ChimeVoiceConnectorStreaming#disabled}. This parameter is required.
         */
        public Builder disabled(final java.lang.Boolean disabled) {
            this.config.disabled(disabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#disabled ChimeVoiceConnectorStreaming#disabled}.
         * <p>
         * @return {@code this}
         * @param disabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#disabled ChimeVoiceConnectorStreaming#disabled}. This parameter is required.
         */
        public Builder disabled(final com.hashicorp.cdktf.IResolvable disabled) {
            this.config.disabled(disabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#id ChimeVoiceConnectorStreaming#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#id ChimeVoiceConnectorStreaming#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#streaming_notification_targets ChimeVoiceConnectorStreaming#streaming_notification_targets}.
         * <p>
         * @return {@code this}
         * @param streamingNotificationTargets Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/chime_voice_connector_streaming#streaming_notification_targets ChimeVoiceConnectorStreaming#streaming_notification_targets}. This parameter is required.
         */
        public Builder streamingNotificationTargets(final java.util.List<java.lang.String> streamingNotificationTargets) {
            this.config.streamingNotificationTargets(streamingNotificationTargets);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.chime.ChimeVoiceConnectorStreaming}.
         */
        @Override
        public imports.aws.chime.ChimeVoiceConnectorStreaming build() {
            return new imports.aws.chime.ChimeVoiceConnectorStreaming(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
