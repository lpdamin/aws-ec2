package imports.aws.glue;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger aws_glue_trigger}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.286Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueTrigger")
public class GlueTrigger extends com.hashicorp.cdktf.TerraformResource {

    protected GlueTrigger(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueTrigger(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.glue.GlueTrigger.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger aws_glue_trigger} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public GlueTrigger(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putActions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putActions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEventBatchingCondition(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEventBatchingCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPredicate(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerPredicate value) {
        software.amazon.jsii.Kernel.call(this, "putPredicate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventBatchingCondition() {
        software.amazon.jsii.Kernel.call(this, "resetEventBatchingCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPredicate() {
        software.amazon.jsii.Kernel.call(this, "resetPredicate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedule() {
        software.amazon.jsii.Kernel.call(this, "resetSchedule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartOnCreation() {
        software.amazon.jsii.Kernel.call(this, "resetStartOnCreation", software.amazon.jsii.NativeType.VOID);
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

    public void resetWorkflowName() {
        software.amazon.jsii.Kernel.call(this, "resetWorkflowName", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerActionsList getActions() {
        return software.amazon.jsii.Kernel.get(this, "actions", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueTriggerActionsList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerEventBatchingConditionList getEventBatchingCondition() {
        return software.amazon.jsii.Kernel.get(this, "eventBatchingCondition", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueTriggerEventBatchingConditionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerPredicateOutputReference getPredicate() {
        return software.amazon.jsii.Kernel.get(this, "predicate", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueTriggerPredicateOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueTriggerTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueTriggerTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getActionsInput() {
        return software.amazon.jsii.Kernel.get(this, "actionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEventBatchingConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "eventBatchingConditionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueTriggerPredicate getPredicateInput() {
        return software.amazon.jsii.Kernel.get(this, "predicateInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueTriggerPredicate.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScheduleInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStartOnCreationInput() {
        return software.amazon.jsii.Kernel.get(this, "startOnCreationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWorkflowNameInput() {
        return software.amazon.jsii.Kernel.get(this, "workflowNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchedule() {
        return software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchedule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schedule", java.util.Objects.requireNonNull(value, "schedule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStartOnCreation() {
        return software.amazon.jsii.Kernel.get(this, "startOnCreation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStartOnCreation(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "startOnCreation", java.util.Objects.requireNonNull(value, "startOnCreation is required"));
    }

    public void setStartOnCreation(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "startOnCreation", java.util.Objects.requireNonNull(value, "startOnCreation is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkflowName() {
        return software.amazon.jsii.Kernel.get(this, "workflowName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWorkflowName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "workflowName", java.util.Objects.requireNonNull(value, "workflowName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.glue.GlueTrigger}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.glue.GlueTrigger> {
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
        private final imports.aws.glue.GlueTriggerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.glue.GlueTriggerConfig.Builder();
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
         * actions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_trigger#actions GlueTrigger#actions}
         * <p>
         * @return {@code this}
         * @param actions actions block. This parameter is required.
         */
        public Builder actions(final com.hashicorp.cdktf.IResolvable actions) {
            this.config.actions(actions);
            return this;
        }
        /**
         * actions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_trigger#actions GlueTrigger#actions}
         * <p>
         * @return {@code this}
         * @param actions actions block. This parameter is required.
         */
        public Builder actions(final java.util.List<? extends imports.aws.glue.GlueTriggerActions> actions) {
            this.config.actions(actions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#name GlueTrigger#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#name GlueTrigger#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#type GlueTrigger#type}.
         * <p>
         * @return {@code this}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#type GlueTrigger#type}. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#description GlueTrigger#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#description GlueTrigger#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#enabled GlueTrigger#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#enabled GlueTrigger#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#enabled GlueTrigger#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#enabled GlueTrigger#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * event_batching_condition block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_trigger#event_batching_condition GlueTrigger#event_batching_condition}
         * <p>
         * @return {@code this}
         * @param eventBatchingCondition event_batching_condition block. This parameter is required.
         */
        public Builder eventBatchingCondition(final com.hashicorp.cdktf.IResolvable eventBatchingCondition) {
            this.config.eventBatchingCondition(eventBatchingCondition);
            return this;
        }
        /**
         * event_batching_condition block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_trigger#event_batching_condition GlueTrigger#event_batching_condition}
         * <p>
         * @return {@code this}
         * @param eventBatchingCondition event_batching_condition block. This parameter is required.
         */
        public Builder eventBatchingCondition(final java.util.List<? extends imports.aws.glue.GlueTriggerEventBatchingCondition> eventBatchingCondition) {
            this.config.eventBatchingCondition(eventBatchingCondition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#id GlueTrigger#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#id GlueTrigger#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * predicate block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_trigger#predicate GlueTrigger#predicate}
         * <p>
         * @return {@code this}
         * @param predicate predicate block. This parameter is required.
         */
        public Builder predicate(final imports.aws.glue.GlueTriggerPredicate predicate) {
            this.config.predicate(predicate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#schedule GlueTrigger#schedule}.
         * <p>
         * @return {@code this}
         * @param schedule Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#schedule GlueTrigger#schedule}. This parameter is required.
         */
        public Builder schedule(final java.lang.String schedule) {
            this.config.schedule(schedule);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#start_on_creation GlueTrigger#start_on_creation}.
         * <p>
         * @return {@code this}
         * @param startOnCreation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#start_on_creation GlueTrigger#start_on_creation}. This parameter is required.
         */
        public Builder startOnCreation(final java.lang.Boolean startOnCreation) {
            this.config.startOnCreation(startOnCreation);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#start_on_creation GlueTrigger#start_on_creation}.
         * <p>
         * @return {@code this}
         * @param startOnCreation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#start_on_creation GlueTrigger#start_on_creation}. This parameter is required.
         */
        public Builder startOnCreation(final com.hashicorp.cdktf.IResolvable startOnCreation) {
            this.config.startOnCreation(startOnCreation);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#tags GlueTrigger#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#tags GlueTrigger#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#tags_all GlueTrigger#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#tags_all GlueTrigger#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_trigger#timeouts GlueTrigger#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.glue.GlueTriggerTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#workflow_name GlueTrigger#workflow_name}.
         * <p>
         * @return {@code this}
         * @param workflowName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_trigger#workflow_name GlueTrigger#workflow_name}. This parameter is required.
         */
        public Builder workflowName(final java.lang.String workflowName) {
            this.config.workflowName(workflowName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.glue.GlueTrigger}.
         */
        @Override
        public imports.aws.glue.GlueTrigger build() {
            return new imports.aws.glue.GlueTrigger(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
