package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.866Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectUserHierarchyStructureHierarchyStructure")
@software.amazon.jsii.Jsii.Proxy(ConnectUserHierarchyStructureHierarchyStructure.Jsii$Proxy.class)
public interface ConnectUserHierarchyStructureHierarchyStructure extends software.amazon.jsii.JsiiSerializable {

    /**
     * level_five block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_five ConnectUserHierarchyStructure#level_five}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFive getLevelFive() {
        return null;
    }

    /**
     * level_four block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_four ConnectUserHierarchyStructure#level_four}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFour getLevelFour() {
        return null;
    }

    /**
     * level_one block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_one ConnectUserHierarchyStructure#level_one}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelOne getLevelOne() {
        return null;
    }

    /**
     * level_three block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_three ConnectUserHierarchyStructure#level_three}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelThree getLevelThree() {
        return null;
    }

    /**
     * level_two block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_two ConnectUserHierarchyStructure#level_two}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelTwo getLevelTwo() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConnectUserHierarchyStructureHierarchyStructure}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConnectUserHierarchyStructureHierarchyStructure}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConnectUserHierarchyStructureHierarchyStructure> {
        imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFive levelFive;
        imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFour levelFour;
        imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelOne levelOne;
        imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelThree levelThree;
        imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelTwo levelTwo;

        /**
         * Sets the value of {@link ConnectUserHierarchyStructureHierarchyStructure#getLevelFive}
         * @param levelFive level_five block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_five ConnectUserHierarchyStructure#level_five}
         * @return {@code this}
         */
        public Builder levelFive(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFive levelFive) {
            this.levelFive = levelFive;
            return this;
        }

        /**
         * Sets the value of {@link ConnectUserHierarchyStructureHierarchyStructure#getLevelFour}
         * @param levelFour level_four block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_four ConnectUserHierarchyStructure#level_four}
         * @return {@code this}
         */
        public Builder levelFour(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFour levelFour) {
            this.levelFour = levelFour;
            return this;
        }

        /**
         * Sets the value of {@link ConnectUserHierarchyStructureHierarchyStructure#getLevelOne}
         * @param levelOne level_one block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_one ConnectUserHierarchyStructure#level_one}
         * @return {@code this}
         */
        public Builder levelOne(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelOne levelOne) {
            this.levelOne = levelOne;
            return this;
        }

        /**
         * Sets the value of {@link ConnectUserHierarchyStructureHierarchyStructure#getLevelThree}
         * @param levelThree level_three block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_three ConnectUserHierarchyStructure#level_three}
         * @return {@code this}
         */
        public Builder levelThree(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelThree levelThree) {
            this.levelThree = levelThree;
            return this;
        }

        /**
         * Sets the value of {@link ConnectUserHierarchyStructureHierarchyStructure#getLevelTwo}
         * @param levelTwo level_two block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/connect_user_hierarchy_structure#level_two ConnectUserHierarchyStructure#level_two}
         * @return {@code this}
         */
        public Builder levelTwo(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelTwo levelTwo) {
            this.levelTwo = levelTwo;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConnectUserHierarchyStructureHierarchyStructure}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConnectUserHierarchyStructureHierarchyStructure build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConnectUserHierarchyStructureHierarchyStructure}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConnectUserHierarchyStructureHierarchyStructure {
        private final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFive levelFive;
        private final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFour levelFour;
        private final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelOne levelOne;
        private final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelThree levelThree;
        private final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelTwo levelTwo;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.levelFive = software.amazon.jsii.Kernel.get(this, "levelFive", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFive.class));
            this.levelFour = software.amazon.jsii.Kernel.get(this, "levelFour", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFour.class));
            this.levelOne = software.amazon.jsii.Kernel.get(this, "levelOne", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelOne.class));
            this.levelThree = software.amazon.jsii.Kernel.get(this, "levelThree", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelThree.class));
            this.levelTwo = software.amazon.jsii.Kernel.get(this, "levelTwo", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelTwo.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.levelFive = builder.levelFive;
            this.levelFour = builder.levelFour;
            this.levelOne = builder.levelOne;
            this.levelThree = builder.levelThree;
            this.levelTwo = builder.levelTwo;
        }

        @Override
        public final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFive getLevelFive() {
            return this.levelFive;
        }

        @Override
        public final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelFour getLevelFour() {
            return this.levelFour;
        }

        @Override
        public final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelOne getLevelOne() {
            return this.levelOne;
        }

        @Override
        public final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelThree getLevelThree() {
            return this.levelThree;
        }

        @Override
        public final imports.aws.connect.ConnectUserHierarchyStructureHierarchyStructureLevelTwo getLevelTwo() {
            return this.levelTwo;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLevelFive() != null) {
                data.set("levelFive", om.valueToTree(this.getLevelFive()));
            }
            if (this.getLevelFour() != null) {
                data.set("levelFour", om.valueToTree(this.getLevelFour()));
            }
            if (this.getLevelOne() != null) {
                data.set("levelOne", om.valueToTree(this.getLevelOne()));
            }
            if (this.getLevelThree() != null) {
                data.set("levelThree", om.valueToTree(this.getLevelThree()));
            }
            if (this.getLevelTwo() != null) {
                data.set("levelTwo", om.valueToTree(this.getLevelTwo()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.connect.ConnectUserHierarchyStructureHierarchyStructure"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConnectUserHierarchyStructureHierarchyStructure.Jsii$Proxy that = (ConnectUserHierarchyStructureHierarchyStructure.Jsii$Proxy) o;

            if (this.levelFive != null ? !this.levelFive.equals(that.levelFive) : that.levelFive != null) return false;
            if (this.levelFour != null ? !this.levelFour.equals(that.levelFour) : that.levelFour != null) return false;
            if (this.levelOne != null ? !this.levelOne.equals(that.levelOne) : that.levelOne != null) return false;
            if (this.levelThree != null ? !this.levelThree.equals(that.levelThree) : that.levelThree != null) return false;
            return this.levelTwo != null ? this.levelTwo.equals(that.levelTwo) : that.levelTwo == null;
        }

        @Override
        public final int hashCode() {
            int result = this.levelFive != null ? this.levelFive.hashCode() : 0;
            result = 31 * result + (this.levelFour != null ? this.levelFour.hashCode() : 0);
            result = 31 * result + (this.levelOne != null ? this.levelOne.hashCode() : 0);
            result = 31 * result + (this.levelThree != null ? this.levelThree.hashCode() : 0);
            result = 31 * result + (this.levelTwo != null ? this.levelTwo.hashCode() : 0);
            return result;
        }
    }
}
