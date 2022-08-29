package imports.aws.ses;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination aws_ses_event_destination}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.696Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ses.SesEventDestination")
public class SesEventDestination extends com.hashicorp.cdktf.TerraformResource {

    protected SesEventDestination(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesEventDestination(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ses.SesEventDestination.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination aws_ses_event_destination} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SesEventDestination(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ses.SesEventDestinationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCloudwatchDestination(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchDestination", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKinesisDestination(final @org.jetbrains.annotations.NotNull imports.aws.ses.SesEventDestinationKinesisDestination value) {
        software.amazon.jsii.Kernel.call(this, "putKinesisDestination", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSnsDestination(final @org.jetbrains.annotations.NotNull imports.aws.ses.SesEventDestinationSnsDestination value) {
        software.amazon.jsii.Kernel.call(this, "putSnsDestination", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCloudwatchDestination() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchDestination", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisDestination() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisDestination", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnsDestination() {
        software.amazon.jsii.Kernel.call(this, "resetSnsDestination", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ses.SesEventDestinationCloudwatchDestinationList getCloudwatchDestination() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchDestination", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationCloudwatchDestinationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ses.SesEventDestinationKinesisDestinationOutputReference getKinesisDestination() {
        return software.amazon.jsii.Kernel.get(this, "kinesisDestination", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationKinesisDestinationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ses.SesEventDestinationSnsDestinationOutputReference getSnsDestination() {
        return software.amazon.jsii.Kernel.get(this, "snsDestination", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationSnsDestinationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCloudwatchDestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchDestinationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationSetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationSetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ses.SesEventDestinationKinesisDestination getKinesisDestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisDestinationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationKinesisDestination.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMatchingTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "matchingTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ses.SesEventDestinationSnsDestination getSnsDestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "snsDestinationInput", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationSnsDestination.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationSetName() {
        return software.amazon.jsii.Kernel.get(this, "configurationSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurationSetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurationSetName", java.util.Objects.requireNonNull(value, "configurationSetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMatchingTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "matchingTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setMatchingTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "matchingTypes", java.util.Objects.requireNonNull(value, "matchingTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ses.SesEventDestination}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ses.SesEventDestination> {
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
        private final imports.aws.ses.SesEventDestinationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ses.SesEventDestinationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#configuration_set_name SesEventDestination#configuration_set_name}.
         * <p>
         * @return {@code this}
         * @param configurationSetName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#configuration_set_name SesEventDestination#configuration_set_name}. This parameter is required.
         */
        public Builder configurationSetName(final java.lang.String configurationSetName) {
            this.config.configurationSetName(configurationSetName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#matching_types SesEventDestination#matching_types}.
         * <p>
         * @return {@code this}
         * @param matchingTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#matching_types SesEventDestination#matching_types}. This parameter is required.
         */
        public Builder matchingTypes(final java.util.List<java.lang.String> matchingTypes) {
            this.config.matchingTypes(matchingTypes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#name SesEventDestination#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#name SesEventDestination#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * cloudwatch_destination block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#cloudwatch_destination SesEventDestination#cloudwatch_destination}
         * <p>
         * @return {@code this}
         * @param cloudwatchDestination cloudwatch_destination block. This parameter is required.
         */
        public Builder cloudwatchDestination(final com.hashicorp.cdktf.IResolvable cloudwatchDestination) {
            this.config.cloudwatchDestination(cloudwatchDestination);
            return this;
        }
        /**
         * cloudwatch_destination block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#cloudwatch_destination SesEventDestination#cloudwatch_destination}
         * <p>
         * @return {@code this}
         * @param cloudwatchDestination cloudwatch_destination block. This parameter is required.
         */
        public Builder cloudwatchDestination(final java.util.List<? extends imports.aws.ses.SesEventDestinationCloudwatchDestination> cloudwatchDestination) {
            this.config.cloudwatchDestination(cloudwatchDestination);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#id SesEventDestination#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#id SesEventDestination#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * kinesis_destination block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#kinesis_destination SesEventDestination#kinesis_destination}
         * <p>
         * @return {@code this}
         * @param kinesisDestination kinesis_destination block. This parameter is required.
         */
        public Builder kinesisDestination(final imports.aws.ses.SesEventDestinationKinesisDestination kinesisDestination) {
            this.config.kinesisDestination(kinesisDestination);
            return this;
        }

        /**
         * sns_destination block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#sns_destination SesEventDestination#sns_destination}
         * <p>
         * @return {@code this}
         * @param snsDestination sns_destination block. This parameter is required.
         */
        public Builder snsDestination(final imports.aws.ses.SesEventDestinationSnsDestination snsDestination) {
            this.config.snsDestination(snsDestination);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ses.SesEventDestination}.
         */
        @Override
        public imports.aws.ses.SesEventDestination build() {
            return new imports.aws.ses.SesEventDestination(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
