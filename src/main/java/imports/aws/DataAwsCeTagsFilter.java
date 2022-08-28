package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.540Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsCeTagsFilter")
@software.amazon.jsii.Jsii.Proxy(DataAwsCeTagsFilter.Jsii$Proxy.class)
public interface DataAwsCeTagsFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * and block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#and DataAwsCeTags#and}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAnd() {
        return null;
    }

    /**
     * cost_category block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#cost_category DataAwsCeTags#cost_category}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterCostCategory getCostCategory() {
        return null;
    }

    /**
     * dimension block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#dimension DataAwsCeTags#dimension}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterDimension getDimension() {
        return null;
    }

    /**
     * not block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#not DataAwsCeTags#not}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNot getNot() {
        return null;
    }

    /**
     * or block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#or DataAwsCeTags#or}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOr() {
        return null;
    }

    /**
     * tags block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#tags DataAwsCeTags#tags}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterTags getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsCeTagsFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsCeTagsFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsCeTagsFilter> {
        java.lang.Object and;
        imports.aws.DataAwsCeTagsFilterCostCategory costCategory;
        imports.aws.DataAwsCeTagsFilterDimension dimension;
        imports.aws.DataAwsCeTagsFilterNot not;
        java.lang.Object or;
        imports.aws.DataAwsCeTagsFilterTags tags;

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getAnd}
         * @param and and block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#and DataAwsCeTags#and}
         * @return {@code this}
         */
        public Builder and(com.hashicorp.cdktf.IResolvable and) {
            this.and = and;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getAnd}
         * @param and and block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#and DataAwsCeTags#and}
         * @return {@code this}
         */
        public Builder and(java.util.List<? extends imports.aws.DataAwsCeTagsFilterAnd> and) {
            this.and = and;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getCostCategory}
         * @param costCategory cost_category block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#cost_category DataAwsCeTags#cost_category}
         * @return {@code this}
         */
        public Builder costCategory(imports.aws.DataAwsCeTagsFilterCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getDimension}
         * @param dimension dimension block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#dimension DataAwsCeTags#dimension}
         * @return {@code this}
         */
        public Builder dimension(imports.aws.DataAwsCeTagsFilterDimension dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getNot}
         * @param not not block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#not DataAwsCeTags#not}
         * @return {@code this}
         */
        public Builder not(imports.aws.DataAwsCeTagsFilterNot not) {
            this.not = not;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getOr}
         * @param or or block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#or DataAwsCeTags#or}
         * @return {@code this}
         */
        public Builder or(com.hashicorp.cdktf.IResolvable or) {
            this.or = or;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getOr}
         * @param or or block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#or DataAwsCeTags#or}
         * @return {@code this}
         */
        public Builder or(java.util.List<? extends imports.aws.DataAwsCeTagsFilterOr> or) {
            this.or = or;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilter#getTags}
         * @param tags tags block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#tags DataAwsCeTags#tags}
         * @return {@code this}
         */
        public Builder tags(imports.aws.DataAwsCeTagsFilterTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsCeTagsFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsCeTagsFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsCeTagsFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsCeTagsFilter {
        private final java.lang.Object and;
        private final imports.aws.DataAwsCeTagsFilterCostCategory costCategory;
        private final imports.aws.DataAwsCeTagsFilterDimension dimension;
        private final imports.aws.DataAwsCeTagsFilterNot not;
        private final java.lang.Object or;
        private final imports.aws.DataAwsCeTagsFilterTags tags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.and = software.amazon.jsii.Kernel.get(this, "and", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.costCategory = software.amazon.jsii.Kernel.get(this, "costCategory", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterCostCategory.class));
            this.dimension = software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterDimension.class));
            this.not = software.amazon.jsii.Kernel.get(this, "not", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNot.class));
            this.or = software.amazon.jsii.Kernel.get(this, "or", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterTags.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.and = builder.and;
            this.costCategory = builder.costCategory;
            this.dimension = builder.dimension;
            this.not = builder.not;
            this.or = builder.or;
            this.tags = builder.tags;
        }

        @Override
        public final java.lang.Object getAnd() {
            return this.and;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterCostCategory getCostCategory() {
            return this.costCategory;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterDimension getDimension() {
            return this.dimension;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterNot getNot() {
            return this.not;
        }

        @Override
        public final java.lang.Object getOr() {
            return this.or;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterTags getTags() {
            return this.tags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnd() != null) {
                data.set("and", om.valueToTree(this.getAnd()));
            }
            if (this.getCostCategory() != null) {
                data.set("costCategory", om.valueToTree(this.getCostCategory()));
            }
            if (this.getDimension() != null) {
                data.set("dimension", om.valueToTree(this.getDimension()));
            }
            if (this.getNot() != null) {
                data.set("not", om.valueToTree(this.getNot()));
            }
            if (this.getOr() != null) {
                data.set("or", om.valueToTree(this.getOr()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.DataAwsCeTagsFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsCeTagsFilter.Jsii$Proxy that = (DataAwsCeTagsFilter.Jsii$Proxy) o;

            if (this.and != null ? !this.and.equals(that.and) : that.and != null) return false;
            if (this.costCategory != null ? !this.costCategory.equals(that.costCategory) : that.costCategory != null) return false;
            if (this.dimension != null ? !this.dimension.equals(that.dimension) : that.dimension != null) return false;
            if (this.not != null ? !this.not.equals(that.not) : that.not != null) return false;
            if (this.or != null ? !this.or.equals(that.or) : that.or != null) return false;
            return this.tags != null ? this.tags.equals(that.tags) : that.tags == null;
        }

        @Override
        public final int hashCode() {
            int result = this.and != null ? this.and.hashCode() : 0;
            result = 31 * result + (this.costCategory != null ? this.costCategory.hashCode() : 0);
            result = 31 * result + (this.dimension != null ? this.dimension.hashCode() : 0);
            result = 31 * result + (this.not != null ? this.not.hashCode() : 0);
            result = 31 * result + (this.or != null ? this.or.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            return result;
        }
    }
}
