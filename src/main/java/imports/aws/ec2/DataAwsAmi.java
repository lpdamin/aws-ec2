package imports.aws.ec2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/ami aws_ami}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:58.561Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsAmi")
public class DataAwsAmi extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsAmi(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsAmi(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ec2.DataAwsAmi.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ami aws_ami} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsAmi(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.ec2.DataAwsAmiConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/ami aws_ami} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsAmi(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiTimeouts value) {
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

    public void resetIncludeDeprecated() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeDeprecated", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMostRecent() {
        software.amazon.jsii.Kernel.call(this, "resetMostRecent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNameRegex() {
        software.amazon.jsii.Kernel.call(this, "resetNameRegex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOwners() {
        software.amazon.jsii.Kernel.call(this, "resetOwners", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArchitecture() {
        return software.amazon.jsii.Kernel.get(this, "architecture", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiBlockDeviceMappingsList getBlockDeviceMappings() {
        return software.amazon.jsii.Kernel.get(this, "blockDeviceMappings", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsAmiBlockDeviceMappingsList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBootMode() {
        return software.amazon.jsii.Kernel.get(this, "bootMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreationDate() {
        return software.amazon.jsii.Kernel.get(this, "creationDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeprecationTime() {
        return software.amazon.jsii.Kernel.get(this, "deprecationTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getEnaSupport() {
        return software.amazon.jsii.Kernel.get(this, "enaSupport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsAmiFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHypervisor() {
        return software.amazon.jsii.Kernel.get(this, "hypervisor", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageId() {
        return software.amazon.jsii.Kernel.get(this, "imageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageLocation() {
        return software.amazon.jsii.Kernel.get(this, "imageLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageOwnerAlias() {
        return software.amazon.jsii.Kernel.get(this, "imageOwnerAlias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageType() {
        return software.amazon.jsii.Kernel.get(this, "imageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKernelId() {
        return software.amazon.jsii.Kernel.get(this, "kernelId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatform() {
        return software.amazon.jsii.Kernel.get(this, "platform", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPlatformDetails() {
        return software.amazon.jsii.Kernel.get(this, "platformDetails", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiProductCodesList getProductCodes() {
        return software.amazon.jsii.Kernel.get(this, "productCodes", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsAmiProductCodesList.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getPublicValue() {
        return software.amazon.jsii.Kernel.get(this, "public", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRamdiskId() {
        return software.amazon.jsii.Kernel.get(this, "ramdiskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootDeviceName() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootDeviceType() {
        return software.amazon.jsii.Kernel.get(this, "rootDeviceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootSnapshotId() {
        return software.amazon.jsii.Kernel.get(this, "rootSnapshotId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSriovNetSupport() {
        return software.amazon.jsii.Kernel.get(this, "sriovNetSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getStateReason() {
        return software.amazon.jsii.Kernel.get(this, "stateReason", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.DataAwsAmiTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.DataAwsAmiTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTpmSupport() {
        return software.amazon.jsii.Kernel.get(this, "tpmSupport", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUsageOperation() {
        return software.amazon.jsii.Kernel.get(this, "usageOperation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVirtualizationType() {
        return software.amazon.jsii.Kernel.get(this, "virtualizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeDeprecatedInput() {
        return software.amazon.jsii.Kernel.get(this, "includeDeprecatedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMostRecentInput() {
        return software.amazon.jsii.Kernel.get(this, "mostRecentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameRegexInput() {
        return software.amazon.jsii.Kernel.get(this, "nameRegexInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOwnersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ownersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeDeprecated() {
        return software.amazon.jsii.Kernel.get(this, "includeDeprecated", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeDeprecated(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeDeprecated", java.util.Objects.requireNonNull(value, "includeDeprecated is required"));
    }

    public void setIncludeDeprecated(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeDeprecated", java.util.Objects.requireNonNull(value, "includeDeprecated is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMostRecent() {
        return software.amazon.jsii.Kernel.get(this, "mostRecent", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMostRecent(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "mostRecent", java.util.Objects.requireNonNull(value, "mostRecent is required"));
    }

    public void setMostRecent(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "mostRecent", java.util.Objects.requireNonNull(value, "mostRecent is required"));
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

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ec2.DataAwsAmi}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ec2.DataAwsAmi> {
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
        private imports.aws.ec2.DataAwsAmiConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#executable_users DataAwsAmi#executable_users}.
         * <p>
         * @return {@code this}
         * @param executableUsers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#executable_users DataAwsAmi#executable_users}. This parameter is required.
         */
        public Builder executableUsers(final java.util.List<java.lang.String> executableUsers) {
            this.config().executableUsers(executableUsers);
            return this;
        }

        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ami#filter DataAwsAmi#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final com.hashicorp.cdktf.IResolvable filter) {
            this.config().filter(filter);
            return this;
        }
        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ami#filter DataAwsAmi#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.ec2.DataAwsAmiFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#id DataAwsAmi#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#id DataAwsAmi#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#include_deprecated DataAwsAmi#include_deprecated}.
         * <p>
         * @return {@code this}
         * @param includeDeprecated Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#include_deprecated DataAwsAmi#include_deprecated}. This parameter is required.
         */
        public Builder includeDeprecated(final java.lang.Boolean includeDeprecated) {
            this.config().includeDeprecated(includeDeprecated);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#include_deprecated DataAwsAmi#include_deprecated}.
         * <p>
         * @return {@code this}
         * @param includeDeprecated Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#include_deprecated DataAwsAmi#include_deprecated}. This parameter is required.
         */
        public Builder includeDeprecated(final com.hashicorp.cdktf.IResolvable includeDeprecated) {
            this.config().includeDeprecated(includeDeprecated);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#most_recent DataAwsAmi#most_recent}.
         * <p>
         * @return {@code this}
         * @param mostRecent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#most_recent DataAwsAmi#most_recent}. This parameter is required.
         */
        public Builder mostRecent(final java.lang.Boolean mostRecent) {
            this.config().mostRecent(mostRecent);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#most_recent DataAwsAmi#most_recent}.
         * <p>
         * @return {@code this}
         * @param mostRecent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#most_recent DataAwsAmi#most_recent}. This parameter is required.
         */
        public Builder mostRecent(final com.hashicorp.cdktf.IResolvable mostRecent) {
            this.config().mostRecent(mostRecent);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#name_regex DataAwsAmi#name_regex}.
         * <p>
         * @return {@code this}
         * @param nameRegex Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#name_regex DataAwsAmi#name_regex}. This parameter is required.
         */
        public Builder nameRegex(final java.lang.String nameRegex) {
            this.config().nameRegex(nameRegex);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#owners DataAwsAmi#owners}.
         * <p>
         * @return {@code this}
         * @param owners Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#owners DataAwsAmi#owners}. This parameter is required.
         */
        public Builder owners(final java.util.List<java.lang.String> owners) {
            this.config().owners(owners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#tags DataAwsAmi#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ami#tags DataAwsAmi#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ami#timeouts DataAwsAmi#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.ec2.DataAwsAmiTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ec2.DataAwsAmi}.
         */
        @Override
        public imports.aws.ec2.DataAwsAmi build() {
            return new imports.aws.ec2.DataAwsAmi(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.ec2.DataAwsAmiConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.ec2.DataAwsAmiConfig.Builder();
            }
            return this.config;
        }
    }
}
