package imports.aws.glue;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/glue_classifier aws_glue_classifier}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.313Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueClassifier")
public class GlueClassifier extends com.hashicorp.cdktf.TerraformResource {

    protected GlueClassifier(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueClassifier(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.glue.GlueClassifier.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/glue_classifier aws_glue_classifier} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public GlueClassifier(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCsvClassifier(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierCsvClassifier value) {
        software.amazon.jsii.Kernel.call(this, "putCsvClassifier", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGrokClassifier(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierGrokClassifier value) {
        software.amazon.jsii.Kernel.call(this, "putGrokClassifier", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putJsonClassifier(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierJsonClassifier value) {
        software.amazon.jsii.Kernel.call(this, "putJsonClassifier", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putXmlClassifier(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierXmlClassifier value) {
        software.amazon.jsii.Kernel.call(this, "putXmlClassifier", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCsvClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetCsvClassifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGrokClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetGrokClassifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJsonClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetJsonClassifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetXmlClassifier() {
        software.amazon.jsii.Kernel.call(this, "resetXmlClassifier", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierCsvClassifierOutputReference getCsvClassifier() {
        return software.amazon.jsii.Kernel.get(this, "csvClassifier", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierCsvClassifierOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierGrokClassifierOutputReference getGrokClassifier() {
        return software.amazon.jsii.Kernel.get(this, "grokClassifier", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierGrokClassifierOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierJsonClassifierOutputReference getJsonClassifier() {
        return software.amazon.jsii.Kernel.get(this, "jsonClassifier", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierJsonClassifierOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueClassifierXmlClassifierOutputReference getXmlClassifier() {
        return software.amazon.jsii.Kernel.get(this, "xmlClassifier", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierXmlClassifierOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierCsvClassifier getCsvClassifierInput() {
        return software.amazon.jsii.Kernel.get(this, "csvClassifierInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierCsvClassifier.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierGrokClassifier getGrokClassifierInput() {
        return software.amazon.jsii.Kernel.get(this, "grokClassifierInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierGrokClassifier.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierJsonClassifier getJsonClassifierInput() {
        return software.amazon.jsii.Kernel.get(this, "jsonClassifierInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierJsonClassifier.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierXmlClassifier getXmlClassifierInput() {
        return software.amazon.jsii.Kernel.get(this, "xmlClassifierInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierXmlClassifier.class));
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

    /**
     * A fluent builder for {@link imports.aws.glue.GlueClassifier}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.glue.GlueClassifier> {
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
        private final imports.aws.glue.GlueClassifierConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.glue.GlueClassifierConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_classifier#name GlueClassifier#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_classifier#name GlueClassifier#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * csv_classifier block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_classifier#csv_classifier GlueClassifier#csv_classifier}
         * <p>
         * @return {@code this}
         * @param csvClassifier csv_classifier block. This parameter is required.
         */
        public Builder csvClassifier(final imports.aws.glue.GlueClassifierCsvClassifier csvClassifier) {
            this.config.csvClassifier(csvClassifier);
            return this;
        }

        /**
         * grok_classifier block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_classifier#grok_classifier GlueClassifier#grok_classifier}
         * <p>
         * @return {@code this}
         * @param grokClassifier grok_classifier block. This parameter is required.
         */
        public Builder grokClassifier(final imports.aws.glue.GlueClassifierGrokClassifier grokClassifier) {
            this.config.grokClassifier(grokClassifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_classifier#id GlueClassifier#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_classifier#id GlueClassifier#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * json_classifier block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_classifier#json_classifier GlueClassifier#json_classifier}
         * <p>
         * @return {@code this}
         * @param jsonClassifier json_classifier block. This parameter is required.
         */
        public Builder jsonClassifier(final imports.aws.glue.GlueClassifierJsonClassifier jsonClassifier) {
            this.config.jsonClassifier(jsonClassifier);
            return this;
        }

        /**
         * xml_classifier block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_classifier#xml_classifier GlueClassifier#xml_classifier}
         * <p>
         * @return {@code this}
         * @param xmlClassifier xml_classifier block. This parameter is required.
         */
        public Builder xmlClassifier(final imports.aws.glue.GlueClassifierXmlClassifier xmlClassifier) {
            this.config.xmlClassifier(xmlClassifier);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.glue.GlueClassifier}.
         */
        @Override
        public imports.aws.glue.GlueClassifier build() {
            return new imports.aws.glue.GlueClassifier(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
