package imports.aws.lakeformation;

/**
 * AWS Lake Formation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.744Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lakeformation.LakeformationResourceLfTagsConfig")
@software.amazon.jsii.Jsii.Proxy(LakeformationResourceLfTagsConfig.Jsii$Proxy.class)
public interface LakeformationResourceLfTagsConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * lf_tag block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#lf_tag LakeformationResourceLfTags#lf_tag}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getLfTag();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#catalog_id LakeformationResourceLfTags#catalog_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCatalogId() {
        return null;
    }

    /**
     * database block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#database LakeformationResourceLfTags#database}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lakeformation.LakeformationResourceLfTagsDatabase getDatabase() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#id LakeformationResourceLfTags#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * table block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#table LakeformationResourceLfTags#table}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lakeformation.LakeformationResourceLfTagsTable getTable() {
        return null;
    }

    /**
     * table_with_columns block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#table_with_columns LakeformationResourceLfTags#table_with_columns}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lakeformation.LakeformationResourceLfTagsTableWithColumns getTableWithColumns() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#timeouts LakeformationResourceLfTags#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lakeformation.LakeformationResourceLfTagsTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LakeformationResourceLfTagsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LakeformationResourceLfTagsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LakeformationResourceLfTagsConfig> {
        java.lang.Object lfTag;
        java.lang.String catalogId;
        imports.aws.lakeformation.LakeformationResourceLfTagsDatabase database;
        java.lang.String id;
        imports.aws.lakeformation.LakeformationResourceLfTagsTable table;
        imports.aws.lakeformation.LakeformationResourceLfTagsTableWithColumns tableWithColumns;
        imports.aws.lakeformation.LakeformationResourceLfTagsTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getLfTag}
         * @param lfTag lf_tag block. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#lf_tag LakeformationResourceLfTags#lf_tag}
         * @return {@code this}
         */
        public Builder lfTag(com.hashicorp.cdktf.IResolvable lfTag) {
            this.lfTag = lfTag;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getLfTag}
         * @param lfTag lf_tag block. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#lf_tag LakeformationResourceLfTags#lf_tag}
         * @return {@code this}
         */
        public Builder lfTag(java.util.List<? extends imports.aws.lakeformation.LakeformationResourceLfTagsLfTag> lfTag) {
            this.lfTag = lfTag;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getCatalogId}
         * @param catalogId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#catalog_id LakeformationResourceLfTags#catalog_id}.
         * @return {@code this}
         */
        public Builder catalogId(java.lang.String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getDatabase}
         * @param database database block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#database LakeformationResourceLfTags#database}
         * @return {@code this}
         */
        public Builder database(imports.aws.lakeformation.LakeformationResourceLfTagsDatabase database) {
            this.database = database;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#id LakeformationResourceLfTags#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getTable}
         * @param table table block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#table LakeformationResourceLfTags#table}
         * @return {@code this}
         */
        public Builder table(imports.aws.lakeformation.LakeformationResourceLfTagsTable table) {
            this.table = table;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getTableWithColumns}
         * @param tableWithColumns table_with_columns block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#table_with_columns LakeformationResourceLfTags#table_with_columns}
         * @return {@code this}
         */
        public Builder tableWithColumns(imports.aws.lakeformation.LakeformationResourceLfTagsTableWithColumns tableWithColumns) {
            this.tableWithColumns = tableWithColumns;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_resource_lf_tags#timeouts LakeformationResourceLfTags#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.lakeformation.LakeformationResourceLfTagsTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getDependsOn}
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
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationResourceLfTagsConfig#getProvisioners}
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
         * @return a new instance of {@link LakeformationResourceLfTagsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LakeformationResourceLfTagsConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LakeformationResourceLfTagsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LakeformationResourceLfTagsConfig {
        private final java.lang.Object lfTag;
        private final java.lang.String catalogId;
        private final imports.aws.lakeformation.LakeformationResourceLfTagsDatabase database;
        private final java.lang.String id;
        private final imports.aws.lakeformation.LakeformationResourceLfTagsTable table;
        private final imports.aws.lakeformation.LakeformationResourceLfTagsTableWithColumns tableWithColumns;
        private final imports.aws.lakeformation.LakeformationResourceLfTagsTimeouts timeouts;
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
            this.lfTag = software.amazon.jsii.Kernel.get(this, "lfTag", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.catalogId = software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.database = software.amazon.jsii.Kernel.get(this, "database", software.amazon.jsii.NativeType.forClass(imports.aws.lakeformation.LakeformationResourceLfTagsDatabase.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.table = software.amazon.jsii.Kernel.get(this, "table", software.amazon.jsii.NativeType.forClass(imports.aws.lakeformation.LakeformationResourceLfTagsTable.class));
            this.tableWithColumns = software.amazon.jsii.Kernel.get(this, "tableWithColumns", software.amazon.jsii.NativeType.forClass(imports.aws.lakeformation.LakeformationResourceLfTagsTableWithColumns.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.lakeformation.LakeformationResourceLfTagsTimeouts.class));
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
            this.lfTag = java.util.Objects.requireNonNull(builder.lfTag, "lfTag is required");
            this.catalogId = builder.catalogId;
            this.database = builder.database;
            this.id = builder.id;
            this.table = builder.table;
            this.tableWithColumns = builder.tableWithColumns;
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
        public final java.lang.Object getLfTag() {
            return this.lfTag;
        }

        @Override
        public final java.lang.String getCatalogId() {
            return this.catalogId;
        }

        @Override
        public final imports.aws.lakeformation.LakeformationResourceLfTagsDatabase getDatabase() {
            return this.database;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.lakeformation.LakeformationResourceLfTagsTable getTable() {
            return this.table;
        }

        @Override
        public final imports.aws.lakeformation.LakeformationResourceLfTagsTableWithColumns getTableWithColumns() {
            return this.tableWithColumns;
        }

        @Override
        public final imports.aws.lakeformation.LakeformationResourceLfTagsTimeouts getTimeouts() {
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

            data.set("lfTag", om.valueToTree(this.getLfTag()));
            if (this.getCatalogId() != null) {
                data.set("catalogId", om.valueToTree(this.getCatalogId()));
            }
            if (this.getDatabase() != null) {
                data.set("database", om.valueToTree(this.getDatabase()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getTable() != null) {
                data.set("table", om.valueToTree(this.getTable()));
            }
            if (this.getTableWithColumns() != null) {
                data.set("tableWithColumns", om.valueToTree(this.getTableWithColumns()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.lakeformation.LakeformationResourceLfTagsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LakeformationResourceLfTagsConfig.Jsii$Proxy that = (LakeformationResourceLfTagsConfig.Jsii$Proxy) o;

            if (!lfTag.equals(that.lfTag)) return false;
            if (this.catalogId != null ? !this.catalogId.equals(that.catalogId) : that.catalogId != null) return false;
            if (this.database != null ? !this.database.equals(that.database) : that.database != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.table != null ? !this.table.equals(that.table) : that.table != null) return false;
            if (this.tableWithColumns != null ? !this.tableWithColumns.equals(that.tableWithColumns) : that.tableWithColumns != null) return false;
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
            int result = this.lfTag.hashCode();
            result = 31 * result + (this.catalogId != null ? this.catalogId.hashCode() : 0);
            result = 31 * result + (this.database != null ? this.database.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.table != null ? this.table.hashCode() : 0);
            result = 31 * result + (this.tableWithColumns != null ? this.tableWithColumns.hashCode() : 0);
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
