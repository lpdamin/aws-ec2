package imports.aws.ec2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/ami_ids aws_ami_ids}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.533Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsAmiIds")
public class DataAwsAmiIds extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsAmiIds(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsAmiIds(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ec2.DataAwsAmiIds.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ami_ids aws_ami_ids} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsAmiIds(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiIdsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiIdsTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExecutableUsers() {
        software.amazon.jsii.Kernel.call(this, "resetExecutableUsers", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNameRegex() {
        software.amazon.jsii.Kernel.call(this, "resetNameRegex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSortAscending() {
        software.amazon.jsii.Kernel.call(this, "resetSortAscending", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiIdsFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsAmiIdsFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiIdsTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsAmiIdsTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExecutableUsersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "executableUsersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameRegexInput() {
        return software.amazon.jsii.Kernel.get(this, "nameRegexInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOwnersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ownersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSortAscendingInput() {
        return software.amazon.jsii.Kernel.get(this, "sortAscendingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExecutableUsers() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "executableUsers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExecutableUsers(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "executableUsers", java.util.Objects.requireNonNull(value, "executableUsers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameRegex() {
        return software.amazon.jsii.Kernel.get(this, "nameRegex", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNameRegex(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nameRegex", java.util.Objects.requireNonNull(value, "nameRegex is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOwners() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "owners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOwners(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "owners", java.util.Objects.requireNonNull(value, "owners is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSortAscending() {
        return software.amazon.jsii.Kernel.get(this, "sortAscending", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSortAscending(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "sortAscending", java.util.Objects.requireNonNull(value, "sortAscending is required"));
    }

    public void setSortAscending(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "sortAscending", java.util.Objects.requireNonNull(value, "sortAscending is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ec2.DataAwsAmiIds}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ec2.DataAwsAmiIds> {
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
        private final imports.aws.ec2.DataAwsAmiIdsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ec2.DataAwsAmiIdsConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#owners DataAwsAmiIds#owners}.
         * <p>
         * @return {@code this}
         * @param owners Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#owners DataAwsAmiIds#owners}. This parameter is required.
         */
        public Builder owners(final java.util.List<java.lang.String> owners) {
            this.config.owners(owners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#executable_users DataAwsAmiIds#executable_users}.
         * <p>
         * @return {@code this}
         * @param executableUsers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#executable_users DataAwsAmiIds#executable_users}. This parameter is required.
         */
        public Builder executableUsers(final java.util.List<java.lang.String> executableUsers) {
            this.config.executableUsers(executableUsers);
            return this;
        }

        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ami_ids#filter DataAwsAmiIds#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final com.hashicorp.cdktf.IResolvable filter) {
            this.config.filter(filter);
            return this;
        }
        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ami_ids#filter DataAwsAmiIds#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.ec2.DataAwsAmiIdsFilter> filter) {
            this.config.filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#id DataAwsAmiIds#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#id DataAwsAmiIds#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#name_regex DataAwsAmiIds#name_regex}.
         * <p>
         * @return {@code this}
         * @param nameRegex Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#name_regex DataAwsAmiIds#name_regex}. This parameter is required.
         */
        public Builder nameRegex(final java.lang.String nameRegex) {
            this.config.nameRegex(nameRegex);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#sort_ascending DataAwsAmiIds#sort_ascending}.
         * <p>
         * @return {@code this}
         * @param sortAscending Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#sort_ascending DataAwsAmiIds#sort_ascending}. This parameter is required.
         */
        public Builder sortAscending(final java.lang.Boolean sortAscending) {
            this.config.sortAscending(sortAscending);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#sort_ascending DataAwsAmiIds#sort_ascending}.
         * <p>
         * @return {@code this}
         * @param sortAscending Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami_ids#sort_ascending DataAwsAmiIds#sort_ascending}. This parameter is required.
         */
        public Builder sortAscending(final com.hashicorp.cdktf.IResolvable sortAscending) {
            this.config.sortAscending(sortAscending);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ami_ids#timeouts DataAwsAmiIds#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.ec2.DataAwsAmiIdsTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ec2.DataAwsAmiIds}.
         */
        @Override
        public imports.aws.ec2.DataAwsAmiIds build() {
            return new imports.aws.ec2.DataAwsAmiIds(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
