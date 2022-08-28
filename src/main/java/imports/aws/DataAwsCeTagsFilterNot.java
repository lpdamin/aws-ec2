package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.544Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsCeTagsFilterNot")
@software.amazon.jsii.Jsii.Proxy(DataAwsCeTagsFilterNot.Jsii$Proxy.class)
public interface DataAwsCeTagsFilterNot extends software.amazon.jsii.JsiiSerializable {

    /**
     * cost_category block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#cost_category DataAwsCeTags#cost_category}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNotCostCategory getCostCategory() {
        return null;
    }

    /**
     * dimension block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#dimension DataAwsCeTags#dimension}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNotDimension getDimension() {
        return null;
    }

    /**
     * tags block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#tags DataAwsCeTags#tags}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.DataAwsCeTagsFilterNotTags getTags() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsCeTagsFilterNot}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsCeTagsFilterNot}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsCeTagsFilterNot> {
        imports.aws.DataAwsCeTagsFilterNotCostCategory costCategory;
        imports.aws.DataAwsCeTagsFilterNotDimension dimension;
        imports.aws.DataAwsCeTagsFilterNotTags tags;

        /**
         * Sets the value of {@link DataAwsCeTagsFilterNot#getCostCategory}
         * @param costCategory cost_category block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#cost_category DataAwsCeTags#cost_category}
         * @return {@code this}
         */
        public Builder costCategory(imports.aws.DataAwsCeTagsFilterNotCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilterNot#getDimension}
         * @param dimension dimension block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#dimension DataAwsCeTags#dimension}
         * @return {@code this}
         */
        public Builder dimension(imports.aws.DataAwsCeTagsFilterNotDimension dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsCeTagsFilterNot#getTags}
         * @param tags tags block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/ce_tags#tags DataAwsCeTags#tags}
         * @return {@code this}
         */
        public Builder tags(imports.aws.DataAwsCeTagsFilterNotTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsCeTagsFilterNot}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsCeTagsFilterNot build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsCeTagsFilterNot}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsCeTagsFilterNot {
        private final imports.aws.DataAwsCeTagsFilterNotCostCategory costCategory;
        private final imports.aws.DataAwsCeTagsFilterNotDimension dimension;
        private final imports.aws.DataAwsCeTagsFilterNotTags tags;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.costCategory = software.amazon.jsii.Kernel.get(this, "costCategory", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotCostCategory.class));
            this.dimension = software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotDimension.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsCeTagsFilterNotTags.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.costCategory = builder.costCategory;
            this.dimension = builder.dimension;
            this.tags = builder.tags;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterNotCostCategory getCostCategory() {
            return this.costCategory;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterNotDimension getDimension() {
            return this.dimension;
        }

        @Override
        public final imports.aws.DataAwsCeTagsFilterNotTags getTags() {
            return this.tags;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCostCategory() != null) {
                data.set("costCategory", om.valueToTree(this.getCostCategory()));
            }
            if (this.getDimension() != null) {
                data.set("dimension", om.valueToTree(this.getDimension()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.DataAwsCeTagsFilterNot"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsCeTagsFilterNot.Jsii$Proxy that = (DataAwsCeTagsFilterNot.Jsii$Proxy) o;

            if (this.costCategory != null ? !this.costCategory.equals(that.costCategory) : that.costCategory != null) return false;
            if (this.dimension != null ? !this.dimension.equals(that.dimension) : that.dimension != null) return false;
            return this.tags != null ? this.tags.equals(that.tags) : that.tags == null;
        }

        @Override
        public final int hashCode() {
            int result = this.costCategory != null ? this.costCategory.hashCode() : 0;
            result = 31 * result + (this.dimension != null ? this.dimension.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            return result;
        }
    }
}
