package imports.aws.cloudtrail;

/**
 * AWS CloudTrail.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.341Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudtrail.CloudtrailEventDataStoreConfig")
@software.amazon.jsii.Jsii.Proxy(CloudtrailEventDataStoreConfig.Jsii$Proxy.class)
public interface CloudtrailEventDataStoreConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#name CloudtrailEventDataStore#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * advanced_event_selector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#advanced_event_selector CloudtrailEventDataStore#advanced_event_selector}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAdvancedEventSelector() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#id CloudtrailEventDataStore#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#multi_region_enabled CloudtrailEventDataStore#multi_region_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMultiRegionEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#organization_enabled CloudtrailEventDataStore#organization_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOrganizationEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#retention_period CloudtrailEventDataStore#retention_period}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRetentionPeriod() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#tags CloudtrailEventDataStore#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#tags_all CloudtrailEventDataStore#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#termination_protection_enabled CloudtrailEventDataStore#termination_protection_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTerminationProtectionEnabled() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#timeouts CloudtrailEventDataStore#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cloudtrail.CloudtrailEventDataStoreTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudtrailEventDataStoreConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudtrailEventDataStoreConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudtrailEventDataStoreConfig> {
        java.lang.String name;
        java.lang.Object advancedEventSelector;
        java.lang.String id;
        java.lang.Object multiRegionEnabled;
        java.lang.Object organizationEnabled;
        java.lang.Number retentionPeriod;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        java.lang.Object terminationProtectionEnabled;
        imports.aws.cloudtrail.CloudtrailEventDataStoreTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#name CloudtrailEventDataStore#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getAdvancedEventSelector}
         * @param advancedEventSelector advanced_event_selector block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#advanced_event_selector CloudtrailEventDataStore#advanced_event_selector}
         * @return {@code this}
         */
        public Builder advancedEventSelector(com.hashicorp.cdktf.IResolvable advancedEventSelector) {
            this.advancedEventSelector = advancedEventSelector;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getAdvancedEventSelector}
         * @param advancedEventSelector advanced_event_selector block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#advanced_event_selector CloudtrailEventDataStore#advanced_event_selector}
         * @return {@code this}
         */
        public Builder advancedEventSelector(java.util.List<? extends imports.aws.cloudtrail.CloudtrailEventDataStoreAdvancedEventSelector> advancedEventSelector) {
            this.advancedEventSelector = advancedEventSelector;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#id CloudtrailEventDataStore#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getMultiRegionEnabled}
         * @param multiRegionEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#multi_region_enabled CloudtrailEventDataStore#multi_region_enabled}.
         * @return {@code this}
         */
        public Builder multiRegionEnabled(java.lang.Boolean multiRegionEnabled) {
            this.multiRegionEnabled = multiRegionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getMultiRegionEnabled}
         * @param multiRegionEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#multi_region_enabled CloudtrailEventDataStore#multi_region_enabled}.
         * @return {@code this}
         */
        public Builder multiRegionEnabled(com.hashicorp.cdktf.IResolvable multiRegionEnabled) {
            this.multiRegionEnabled = multiRegionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getOrganizationEnabled}
         * @param organizationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#organization_enabled CloudtrailEventDataStore#organization_enabled}.
         * @return {@code this}
         */
        public Builder organizationEnabled(java.lang.Boolean organizationEnabled) {
            this.organizationEnabled = organizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getOrganizationEnabled}
         * @param organizationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#organization_enabled CloudtrailEventDataStore#organization_enabled}.
         * @return {@code this}
         */
        public Builder organizationEnabled(com.hashicorp.cdktf.IResolvable organizationEnabled) {
            this.organizationEnabled = organizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getRetentionPeriod}
         * @param retentionPeriod Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#retention_period CloudtrailEventDataStore#retention_period}.
         * @return {@code this}
         */
        public Builder retentionPeriod(java.lang.Number retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#tags CloudtrailEventDataStore#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#tags_all CloudtrailEventDataStore#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getTerminationProtectionEnabled}
         * @param terminationProtectionEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#termination_protection_enabled CloudtrailEventDataStore#termination_protection_enabled}.
         * @return {@code this}
         */
        public Builder terminationProtectionEnabled(java.lang.Boolean terminationProtectionEnabled) {
            this.terminationProtectionEnabled = terminationProtectionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getTerminationProtectionEnabled}
         * @param terminationProtectionEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#termination_protection_enabled CloudtrailEventDataStore#termination_protection_enabled}.
         * @return {@code this}
         */
        public Builder terminationProtectionEnabled(com.hashicorp.cdktf.IResolvable terminationProtectionEnabled) {
            this.terminationProtectionEnabled = terminationProtectionEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudtrail_event_data_store#timeouts CloudtrailEventDataStore#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.cloudtrail.CloudtrailEventDataStoreTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailEventDataStoreConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudtrailEventDataStoreConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudtrailEventDataStoreConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudtrailEventDataStoreConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudtrailEventDataStoreConfig {
        private final java.lang.String name;
        private final java.lang.Object advancedEventSelector;
        private final java.lang.String id;
        private final java.lang.Object multiRegionEnabled;
        private final java.lang.Object organizationEnabled;
        private final java.lang.Number retentionPeriod;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final java.lang.Object terminationProtectionEnabled;
        private final imports.aws.cloudtrail.CloudtrailEventDataStoreTimeouts timeouts;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.advancedEventSelector = software.amazon.jsii.Kernel.get(this, "advancedEventSelector", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.multiRegionEnabled = software.amazon.jsii.Kernel.get(this, "multiRegionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.organizationEnabled = software.amazon.jsii.Kernel.get(this, "organizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.retentionPeriod = software.amazon.jsii.Kernel.get(this, "retentionPeriod", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.terminationProtectionEnabled = software.amazon.jsii.Kernel.get(this, "terminationProtectionEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.cloudtrail.CloudtrailEventDataStoreTimeouts.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.advancedEventSelector = builder.advancedEventSelector;
            this.id = builder.id;
            this.multiRegionEnabled = builder.multiRegionEnabled;
            this.organizationEnabled = builder.organizationEnabled;
            this.retentionPeriod = builder.retentionPeriod;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.terminationProtectionEnabled = builder.terminationProtectionEnabled;
            this.timeouts = builder.timeouts;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getAdvancedEventSelector() {
            return this.advancedEventSelector;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getMultiRegionEnabled() {
            return this.multiRegionEnabled;
        }

        @Override
        public final java.lang.Object getOrganizationEnabled() {
            return this.organizationEnabled;
        }

        @Override
        public final java.lang.Number getRetentionPeriod() {
            return this.retentionPeriod;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final java.lang.Object getTerminationProtectionEnabled() {
            return this.terminationProtectionEnabled;
        }

        @Override
        public final imports.aws.cloudtrail.CloudtrailEventDataStoreTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdvancedEventSelector() != null) {
                data.set("advancedEventSelector", om.valueToTree(this.getAdvancedEventSelector()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getMultiRegionEnabled() != null) {
                data.set("multiRegionEnabled", om.valueToTree(this.getMultiRegionEnabled()));
            }
            if (this.getOrganizationEnabled() != null) {
                data.set("organizationEnabled", om.valueToTree(this.getOrganizationEnabled()));
            }
            if (this.getRetentionPeriod() != null) {
                data.set("retentionPeriod", om.valueToTree(this.getRetentionPeriod()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getTerminationProtectionEnabled() != null) {
                data.set("terminationProtectionEnabled", om.valueToTree(this.getTerminationProtectionEnabled()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudtrail.CloudtrailEventDataStoreConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudtrailEventDataStoreConfig.Jsii$Proxy that = (CloudtrailEventDataStoreConfig.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.advancedEventSelector != null ? !this.advancedEventSelector.equals(that.advancedEventSelector) : that.advancedEventSelector != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.multiRegionEnabled != null ? !this.multiRegionEnabled.equals(that.multiRegionEnabled) : that.multiRegionEnabled != null) return false;
            if (this.organizationEnabled != null ? !this.organizationEnabled.equals(that.organizationEnabled) : that.organizationEnabled != null) return false;
            if (this.retentionPeriod != null ? !this.retentionPeriod.equals(that.retentionPeriod) : that.retentionPeriod != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.terminationProtectionEnabled != null ? !this.terminationProtectionEnabled.equals(that.terminationProtectionEnabled) : that.terminationProtectionEnabled != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.advancedEventSelector != null ? this.advancedEventSelector.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.multiRegionEnabled != null ? this.multiRegionEnabled.hashCode() : 0);
            result = 31 * result + (this.organizationEnabled != null ? this.organizationEnabled.hashCode() : 0);
            result = 31 * result + (this.retentionPeriod != null ? this.retentionPeriod.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.terminationProtectionEnabled != null ? this.terminationProtectionEnabled.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
