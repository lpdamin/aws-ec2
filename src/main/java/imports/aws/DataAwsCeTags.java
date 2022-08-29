package imports.aws;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/ce_tags aws_ce_tags}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.168Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsCeTags")
public class DataAwsCeTags extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsCeTags(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsCeTags(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.DataAwsCeTags.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ce_tags aws_ce_tags} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsCeTags(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilter value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSortBy(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSortBy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimePeriod(final @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsTimePeriod value) {
        software.amazon.jsii.Kernel.call(this, "putTimePeriod", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSearchString() {
        software.amazon.jsii.Kernel.call(this, "resetSearchString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSortBy() {
        software.amazon.jsii.Kernel.call(this, "resetSortBy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagKey() {
        software.amazon.jsii.Kernel.call(this, "resetTagKey", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsFilterOutputReference getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsSortByList getSortBy() {
        return software.amazon.jsii.Kernel.get(this, "sortBy", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsSortByList.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTags() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.DataAwsCeTagsTimePeriodOutputReference getTimePeriod() {
        return software.amazon.jsii.Kernel.get(this, "timePeriod", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsTimePeriodOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilter getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilter.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSearchStringInput() {
        return software.amazon.jsii.Kernel.get(this, "searchStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSortByInput() {
        return software.amazon.jsii.Kernel.get(this, "sortByInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTagKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "tagKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsTimePeriod getTimePeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodInput", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsTimePeriod.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSearchString() {
        return software.amazon.jsii.Kernel.get(this, "searchString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSearchString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "searchString", java.util.Objects.requireNonNull(value, "searchString is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTagKey() {
        return software.amazon.jsii.Kernel.get(this, "tagKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTagKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tagKey", java.util.Objects.requireNonNull(value, "tagKey is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsCeTags}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsCeTags> {
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
        private final imports.aws.DataAwsCeTagsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.DataAwsCeTagsConfig.Builder();
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
         * time_period block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#time_period DataAwsCeTags#time_period}
         * <p>
         * @return {@code this}
         * @param timePeriod time_period block. This parameter is required.
         */
        public Builder timePeriod(final imports.aws.DataAwsCeTagsTimePeriod timePeriod) {
            this.config.timePeriod(timePeriod);
            return this;
        }

        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#filter DataAwsCeTags#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final imports.aws.DataAwsCeTagsFilter filter) {
            this.config.filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ce_tags#id DataAwsCeTags#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ce_tags#id DataAwsCeTags#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ce_tags#search_string DataAwsCeTags#search_string}.
         * <p>
         * @return {@code this}
         * @param searchString Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ce_tags#search_string DataAwsCeTags#search_string}. This parameter is required.
         */
        public Builder searchString(final java.lang.String searchString) {
            this.config.searchString(searchString);
            return this;
        }

        /**
         * sort_by block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#sort_by DataAwsCeTags#sort_by}
         * <p>
         * @return {@code this}
         * @param sortBy sort_by block. This parameter is required.
         */
        public Builder sortBy(final com.hashicorp.cdktf.IResolvable sortBy) {
            this.config.sortBy(sortBy);
            return this;
        }
        /**
         * sort_by block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#sort_by DataAwsCeTags#sort_by}
         * <p>
         * @return {@code this}
         * @param sortBy sort_by block. This parameter is required.
         */
        public Builder sortBy(final java.util.List<? extends imports.aws.DataAwsCeTagsSortBy> sortBy) {
            this.config.sortBy(sortBy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ce_tags#tag_key DataAwsCeTags#tag_key}.
         * <p>
         * @return {@code this}
         * @param tagKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ce_tags#tag_key DataAwsCeTags#tag_key}. This parameter is required.
         */
        public Builder tagKey(final java.lang.String tagKey) {
            this.config.tagKey(tagKey);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsCeTags}.
         */
        @Override
        public imports.aws.DataAwsCeTags build() {
            return new imports.aws.DataAwsCeTags(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
