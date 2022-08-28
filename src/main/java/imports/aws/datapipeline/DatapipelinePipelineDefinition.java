package imports.aws.datapipeline;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition aws_datapipeline_pipeline_definition}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.969Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datapipeline.DatapipelinePipelineDefinition")
public class DatapipelinePipelineDefinition extends com.hashicorp.cdktf.TerraformResource {

    protected DatapipelinePipelineDefinition(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DatapipelinePipelineDefinition(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.datapipeline.DatapipelinePipelineDefinition.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition aws_datapipeline_pipeline_definition} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DatapipelinePipelineDefinition(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DatapipelinePipelineDefinitionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putParameterObject(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putParameterObject", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putParameterValue(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putParameterValue", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPipelineObject(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPipelineObject", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameterObject() {
        software.amazon.jsii.Kernel.call(this, "resetParameterObject", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameterValue() {
        software.amazon.jsii.Kernel.call(this, "resetParameterValue", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DatapipelinePipelineDefinitionParameterObjectList getParameterObject() {
        return software.amazon.jsii.Kernel.get(this, "parameterObject", software.amazon.jsii.NativeType.forClass(imports.aws.datapipeline.DatapipelinePipelineDefinitionParameterObjectList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DatapipelinePipelineDefinitionParameterValueList getParameterValue() {
        return software.amazon.jsii.Kernel.get(this, "parameterValue", software.amazon.jsii.NativeType.forClass(imports.aws.datapipeline.DatapipelinePipelineDefinitionParameterValueList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DatapipelinePipelineDefinitionPipelineObjectList getPipelineObject() {
        return software.amazon.jsii.Kernel.get(this, "pipelineObject", software.amazon.jsii.NativeType.forClass(imports.aws.datapipeline.DatapipelinePipelineDefinitionPipelineObjectList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParameterObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterObjectInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParameterValueInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterValueInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPipelineIdInput() {
        return software.amazon.jsii.Kernel.get(this, "pipelineIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPipelineObjectInput() {
        return software.amazon.jsii.Kernel.get(this, "pipelineObjectInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPipelineId() {
        return software.amazon.jsii.Kernel.get(this, "pipelineId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPipelineId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pipelineId", java.util.Objects.requireNonNull(value, "pipelineId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.datapipeline.DatapipelinePipelineDefinition}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.datapipeline.DatapipelinePipelineDefinition> {
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
        private final imports.aws.datapipeline.DatapipelinePipelineDefinitionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.datapipeline.DatapipelinePipelineDefinitionConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#pipeline_id DatapipelinePipelineDefinition#pipeline_id}.
         * <p>
         * @return {@code this}
         * @param pipelineId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#pipeline_id DatapipelinePipelineDefinition#pipeline_id}. This parameter is required.
         */
        public Builder pipelineId(final java.lang.String pipelineId) {
            this.config.pipelineId(pipelineId);
            return this;
        }

        /**
         * pipeline_object block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#pipeline_object DatapipelinePipelineDefinition#pipeline_object}
         * <p>
         * @return {@code this}
         * @param pipelineObject pipeline_object block. This parameter is required.
         */
        public Builder pipelineObject(final com.hashicorp.cdktf.IResolvable pipelineObject) {
            this.config.pipelineObject(pipelineObject);
            return this;
        }
        /**
         * pipeline_object block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#pipeline_object DatapipelinePipelineDefinition#pipeline_object}
         * <p>
         * @return {@code this}
         * @param pipelineObject pipeline_object block. This parameter is required.
         */
        public Builder pipelineObject(final java.util.List<? extends imports.aws.datapipeline.DatapipelinePipelineDefinitionPipelineObject> pipelineObject) {
            this.config.pipelineObject(pipelineObject);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#id DatapipelinePipelineDefinition#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#id DatapipelinePipelineDefinition#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * parameter_object block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#parameter_object DatapipelinePipelineDefinition#parameter_object}
         * <p>
         * @return {@code this}
         * @param parameterObject parameter_object block. This parameter is required.
         */
        public Builder parameterObject(final com.hashicorp.cdktf.IResolvable parameterObject) {
            this.config.parameterObject(parameterObject);
            return this;
        }
        /**
         * parameter_object block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#parameter_object DatapipelinePipelineDefinition#parameter_object}
         * <p>
         * @return {@code this}
         * @param parameterObject parameter_object block. This parameter is required.
         */
        public Builder parameterObject(final java.util.List<? extends imports.aws.datapipeline.DatapipelinePipelineDefinitionParameterObject> parameterObject) {
            this.config.parameterObject(parameterObject);
            return this;
        }

        /**
         * parameter_value block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#parameter_value DatapipelinePipelineDefinition#parameter_value}
         * <p>
         * @return {@code this}
         * @param parameterValue parameter_value block. This parameter is required.
         */
        public Builder parameterValue(final com.hashicorp.cdktf.IResolvable parameterValue) {
            this.config.parameterValue(parameterValue);
            return this;
        }
        /**
         * parameter_value block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/datapipeline_pipeline_definition#parameter_value DatapipelinePipelineDefinition#parameter_value}
         * <p>
         * @return {@code this}
         * @param parameterValue parameter_value block. This parameter is required.
         */
        public Builder parameterValue(final java.util.List<? extends imports.aws.datapipeline.DatapipelinePipelineDefinitionParameterValue> parameterValue) {
            this.config.parameterValue(parameterValue);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.datapipeline.DatapipelinePipelineDefinition}.
         */
        @Override
        public imports.aws.datapipeline.DatapipelinePipelineDefinition build() {
            return new imports.aws.datapipeline.DatapipelinePipelineDefinition(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
