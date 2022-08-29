package imports.aws.datapipeline;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition aws_datapipeline_pipeline_definition}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.292Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datapipeline.DataAwsDatapipelinePipelineDefinition")
public class DataAwsDatapipelinePipelineDefinition extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsDatapipelinePipelineDefinition(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsDatapipelinePipelineDefinition(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinition.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition aws_datapipeline_pipeline_definition} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsDatapipelinePipelineDefinition(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putParameterValue(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putParameterValue", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameterValue() {
        software.amazon.jsii.Kernel.call(this, "resetParameterValue", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionParameterObjectList getParameterObject() {
        return software.amazon.jsii.Kernel.get(this, "parameterObject", software.amazon.jsii.NativeType.forClass(imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionParameterObjectList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionParameterValueList getParameterValue() {
        return software.amazon.jsii.Kernel.get(this, "parameterValue", software.amazon.jsii.NativeType.forClass(imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionParameterValueList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionPipelineObjectList getPipelineObject() {
        return software.amazon.jsii.Kernel.get(this, "pipelineObject", software.amazon.jsii.NativeType.forClass(imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionPipelineObjectList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParameterValueInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterValueInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPipelineIdInput() {
        return software.amazon.jsii.Kernel.get(this, "pipelineIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
     * A fluent builder for {@link imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinition}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinition> {
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
        private final imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition#pipeline_id DataAwsDatapipelinePipelineDefinition#pipeline_id}.
         * <p>
         * @return {@code this}
         * @param pipelineId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition#pipeline_id DataAwsDatapipelinePipelineDefinition#pipeline_id}. This parameter is required.
         */
        public Builder pipelineId(final java.lang.String pipelineId) {
            this.config.pipelineId(pipelineId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition#id DataAwsDatapipelinePipelineDefinition#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition#id DataAwsDatapipelinePipelineDefinition#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * parameter_value block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition#parameter_value DataAwsDatapipelinePipelineDefinition#parameter_value}
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/datapipeline_pipeline_definition#parameter_value DataAwsDatapipelinePipelineDefinition#parameter_value}
         * <p>
         * @return {@code this}
         * @param parameterValue parameter_value block. This parameter is required.
         */
        public Builder parameterValue(final java.util.List<? extends imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinitionParameterValue> parameterValue) {
            this.config.parameterValue(parameterValue);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinition}.
         */
        @Override
        public imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinition build() {
            return new imports.aws.datapipeline.DataAwsDatapipelinePipelineDefinition(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
