package imports.aws.eks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.509Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eks.EksNodeGroupUpdateConfig")
@software.amazon.jsii.Jsii.Proxy(EksNodeGroupUpdateConfig.Jsii$Proxy.class)
public interface EksNodeGroupUpdateConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#max_unavailable EksNodeGroup#max_unavailable}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxUnavailable() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#max_unavailable_percentage EksNodeGroup#max_unavailable_percentage}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxUnavailablePercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EksNodeGroupUpdateConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EksNodeGroupUpdateConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EksNodeGroupUpdateConfig> {
        java.lang.Number maxUnavailable;
        java.lang.Number maxUnavailablePercentage;

        /**
         * Sets the value of {@link EksNodeGroupUpdateConfig#getMaxUnavailable}
         * @param maxUnavailable Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#max_unavailable EksNodeGroup#max_unavailable}.
         * @return {@code this}
         */
        public Builder maxUnavailable(java.lang.Number maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Sets the value of {@link EksNodeGroupUpdateConfig#getMaxUnavailablePercentage}
         * @param maxUnavailablePercentage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_node_group#max_unavailable_percentage EksNodeGroup#max_unavailable_percentage}.
         * @return {@code this}
         */
        public Builder maxUnavailablePercentage(java.lang.Number maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EksNodeGroupUpdateConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EksNodeGroupUpdateConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EksNodeGroupUpdateConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EksNodeGroupUpdateConfig {
        private final java.lang.Number maxUnavailable;
        private final java.lang.Number maxUnavailablePercentage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxUnavailable = software.amazon.jsii.Kernel.get(this, "maxUnavailable", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maxUnavailablePercentage = software.amazon.jsii.Kernel.get(this, "maxUnavailablePercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxUnavailable = builder.maxUnavailable;
            this.maxUnavailablePercentage = builder.maxUnavailablePercentage;
        }

        @Override
        public final java.lang.Number getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public final java.lang.Number getMaxUnavailablePercentage() {
            return this.maxUnavailablePercentage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }
            if (this.getMaxUnavailablePercentage() != null) {
                data.set("maxUnavailablePercentage", om.valueToTree(this.getMaxUnavailablePercentage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.eks.EksNodeGroupUpdateConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EksNodeGroupUpdateConfig.Jsii$Proxy that = (EksNodeGroupUpdateConfig.Jsii$Proxy) o;

            if (this.maxUnavailable != null ? !this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable != null) return false;
            return this.maxUnavailablePercentage != null ? this.maxUnavailablePercentage.equals(that.maxUnavailablePercentage) : that.maxUnavailablePercentage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0;
            result = 31 * result + (this.maxUnavailablePercentage != null ? this.maxUnavailablePercentage.hashCode() : 0);
            return result;
        }
    }
}
