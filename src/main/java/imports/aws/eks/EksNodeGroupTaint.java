package imports.aws.eks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.959Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eks.EksNodeGroupTaint")
@software.amazon.jsii.Jsii.Proxy(EksNodeGroupTaint.Jsii$Proxy.class)
public interface EksNodeGroupTaint extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#effect EksNodeGroup#effect}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEffect();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#key EksNodeGroup#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#value EksNodeGroup#value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksNodeGroupTaint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksNodeGroupTaint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksNodeGroupTaint> {
        java.lang.String effect;
        java.lang.String key;
        java.lang.String value;

        /**
         * Sets the value of {@link EksNodeGroupTaint#getEffect}
         * @param effect Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#effect EksNodeGroup#effect}. This parameter is required.
         * @return {@code this}
         */
        public Builder effect(java.lang.String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupTaint#getKey}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#key EksNodeGroup#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupTaint#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#value EksNodeGroup#value}.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EksNodeGroupTaint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksNodeGroupTaint build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EksNodeGroupTaint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksNodeGroupTaint {
        private final java.lang.String effect;
        private final java.lang.String key;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.effect = software.amazon.jsii.Kernel.get(this, "effect", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.effect = java.util.Objects.requireNonNull(builder.effect, "effect is required");
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getEffect() {
            return this.effect;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("effect", om.valueToTree(this.getEffect()));
            data.set("key", om.valueToTree(this.getKey()));
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.eks.EksNodeGroupTaint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksNodeGroupTaint.Jsii$Proxy that = (EksNodeGroupTaint.Jsii$Proxy) o;

            if (!effect.equals(that.effect)) return false;
            if (!key.equals(that.key)) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.effect.hashCode();
            result = 31 * result + (this.key.hashCode());
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
