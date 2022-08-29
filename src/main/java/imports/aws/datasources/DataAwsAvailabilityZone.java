package imports.aws.datasources;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/availability_zone aws_availability_zone}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.309Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datasources.DataAwsAvailabilityZone")
public class DataAwsAvailabilityZone extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsAvailabilityZone(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsAvailabilityZone(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.datasources.DataAwsAvailabilityZone.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/availability_zone aws_availability_zone} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsAvailabilityZone(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.datasources.DataAwsAvailabilityZoneConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/availability_zone aws_availability_zone} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsAvailabilityZone(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.datasources.DataAwsAvailabilityZoneTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllAvailabilityZones() {
        software.amazon.jsii.Kernel.call(this, "resetAllAvailabilityZones", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetState() {
        software.amazon.jsii.Kernel.call(this, "resetState", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetZoneId() {
        software.amazon.jsii.Kernel.call(this, "resetZoneId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.datasources.DataAwsAvailabilityZoneFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.datasources.DataAwsAvailabilityZoneFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGroupName() {
        return software.amazon.jsii.Kernel.get(this, "groupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameSuffix() {
        return software.amazon.jsii.Kernel.get(this, "nameSuffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkBorderGroup() {
        return software.amazon.jsii.Kernel.get(this, "networkBorderGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOptInStatus() {
        return software.amazon.jsii.Kernel.get(this, "optInStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParentZoneId() {
        return software.amazon.jsii.Kernel.get(this, "parentZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getParentZoneName() {
        return software.amazon.jsii.Kernel.get(this, "parentZoneName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.datasources.DataAwsAvailabilityZoneTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.datasources.DataAwsAvailabilityZoneTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneType() {
        return software.amazon.jsii.Kernel.get(this, "zoneType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllAvailabilityZonesInput() {
        return software.amazon.jsii.Kernel.get(this, "allAvailabilityZonesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStateInput() {
        return software.amazon.jsii.Kernel.get(this, "stateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getZoneIdInput() {
        return software.amazon.jsii.Kernel.get(this, "zoneIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllAvailabilityZones() {
        return software.amazon.jsii.Kernel.get(this, "allAvailabilityZones", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllAvailabilityZones(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allAvailabilityZones", java.util.Objects.requireNonNull(value, "allAvailabilityZones is required"));
    }

    public void setAllAvailabilityZones(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allAvailabilityZones", java.util.Objects.requireNonNull(value, "allAvailabilityZones is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "state", java.util.Objects.requireNonNull(value, "state is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZoneId() {
        return software.amazon.jsii.Kernel.get(this, "zoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setZoneId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "zoneId", java.util.Objects.requireNonNull(value, "zoneId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.datasources.DataAwsAvailabilityZone}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.datasources.DataAwsAvailabilityZone> {
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
        private imports.aws.datasources.DataAwsAvailabilityZoneConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#all_availability_zones DataAwsAvailabilityZone#all_availability_zones}.
         * <p>
         * @return {@code this}
         * @param allAvailabilityZones Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#all_availability_zones DataAwsAvailabilityZone#all_availability_zones}. This parameter is required.
         */
        public Builder allAvailabilityZones(final java.lang.Boolean allAvailabilityZones) {
            this.config().allAvailabilityZones(allAvailabilityZones);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#all_availability_zones DataAwsAvailabilityZone#all_availability_zones}.
         * <p>
         * @return {@code this}
         * @param allAvailabilityZones Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#all_availability_zones DataAwsAvailabilityZone#all_availability_zones}. This parameter is required.
         */
        public Builder allAvailabilityZones(final com.hashicorp.cdktf.IResolvable allAvailabilityZones) {
            this.config().allAvailabilityZones(allAvailabilityZones);
            return this;
        }

        /**
         * filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/availability_zone#filter DataAwsAvailabilityZone#filter}
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
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/availability_zone#filter DataAwsAvailabilityZone#filter}
         * <p>
         * @return {@code this}
         * @param filter filter block. This parameter is required.
         */
        public Builder filter(final java.util.List<? extends imports.aws.datasources.DataAwsAvailabilityZoneFilter> filter) {
            this.config().filter(filter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#id DataAwsAvailabilityZone#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#id DataAwsAvailabilityZone#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#name DataAwsAvailabilityZone#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#name DataAwsAvailabilityZone#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#state DataAwsAvailabilityZone#state}.
         * <p>
         * @return {@code this}
         * @param state Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#state DataAwsAvailabilityZone#state}. This parameter is required.
         */
        public Builder state(final java.lang.String state) {
            this.config().state(state);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/availability_zone#timeouts DataAwsAvailabilityZone#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.datasources.DataAwsAvailabilityZoneTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#zone_id DataAwsAvailabilityZone#zone_id}.
         * <p>
         * @return {@code this}
         * @param zoneId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/availability_zone#zone_id DataAwsAvailabilityZone#zone_id}. This parameter is required.
         */
        public Builder zoneId(final java.lang.String zoneId) {
            this.config().zoneId(zoneId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.datasources.DataAwsAvailabilityZone}.
         */
        @Override
        public imports.aws.datasources.DataAwsAvailabilityZone build() {
            return new imports.aws.datasources.DataAwsAvailabilityZone(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.datasources.DataAwsAvailabilityZoneConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.datasources.DataAwsAvailabilityZoneConfig.Builder();
            }
            return this.config;
        }
    }
}
