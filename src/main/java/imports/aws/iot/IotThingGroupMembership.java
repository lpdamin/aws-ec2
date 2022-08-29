package imports.aws.iot;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership aws_iot_thing_group_membership}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.437Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotThingGroupMembership")
public class IotThingGroupMembership extends com.hashicorp.cdktf.TerraformResource {

    protected IotThingGroupMembership(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotThingGroupMembership(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.iot.IotThingGroupMembership.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership aws_iot_thing_group_membership} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public IotThingGroupMembership(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.iot.IotThingGroupMembershipConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOverrideDynamicGroup() {
        software.amazon.jsii.Kernel.call(this, "resetOverrideDynamicGroup", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOverrideDynamicGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "overrideDynamicGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThingGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "thingGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThingNameInput() {
        return software.amazon.jsii.Kernel.get(this, "thingNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getOverrideDynamicGroup() {
        return software.amazon.jsii.Kernel.get(this, "overrideDynamicGroup", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setOverrideDynamicGroup(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "overrideDynamicGroup", java.util.Objects.requireNonNull(value, "overrideDynamicGroup is required"));
    }

    public void setOverrideDynamicGroup(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "overrideDynamicGroup", java.util.Objects.requireNonNull(value, "overrideDynamicGroup is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThingGroupName() {
        return software.amazon.jsii.Kernel.get(this, "thingGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThingGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thingGroupName", java.util.Objects.requireNonNull(value, "thingGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThingName() {
        return software.amazon.jsii.Kernel.get(this, "thingName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThingName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thingName", java.util.Objects.requireNonNull(value, "thingName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.iot.IotThingGroupMembership}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.iot.IotThingGroupMembership> {
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
        private final imports.aws.iot.IotThingGroupMembershipConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.iot.IotThingGroupMembershipConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#thing_group_name IotThingGroupMembership#thing_group_name}.
         * <p>
         * @return {@code this}
         * @param thingGroupName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#thing_group_name IotThingGroupMembership#thing_group_name}. This parameter is required.
         */
        public Builder thingGroupName(final java.lang.String thingGroupName) {
            this.config.thingGroupName(thingGroupName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#thing_name IotThingGroupMembership#thing_name}.
         * <p>
         * @return {@code this}
         * @param thingName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#thing_name IotThingGroupMembership#thing_name}. This parameter is required.
         */
        public Builder thingName(final java.lang.String thingName) {
            this.config.thingName(thingName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#id IotThingGroupMembership#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#id IotThingGroupMembership#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#override_dynamic_group IotThingGroupMembership#override_dynamic_group}.
         * <p>
         * @return {@code this}
         * @param overrideDynamicGroup Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#override_dynamic_group IotThingGroupMembership#override_dynamic_group}. This parameter is required.
         */
        public Builder overrideDynamicGroup(final java.lang.Boolean overrideDynamicGroup) {
            this.config.overrideDynamicGroup(overrideDynamicGroup);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#override_dynamic_group IotThingGroupMembership#override_dynamic_group}.
         * <p>
         * @return {@code this}
         * @param overrideDynamicGroup Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_thing_group_membership#override_dynamic_group IotThingGroupMembership#override_dynamic_group}. This parameter is required.
         */
        public Builder overrideDynamicGroup(final com.hashicorp.cdktf.IResolvable overrideDynamicGroup) {
            this.config.overrideDynamicGroup(overrideDynamicGroup);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.iot.IotThingGroupMembership}.
         */
        @Override
        public imports.aws.iot.IotThingGroupMembership build() {
            return new imports.aws.iot.IotThingGroupMembership(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
