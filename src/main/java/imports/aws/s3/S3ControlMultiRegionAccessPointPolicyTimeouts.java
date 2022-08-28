package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.462Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3ControlMultiRegionAccessPointPolicyTimeouts")
@software.amazon.jsii.Jsii.Proxy(S3ControlMultiRegionAccessPointPolicyTimeouts.Jsii$Proxy.class)
public interface S3ControlMultiRegionAccessPointPolicyTimeouts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point_policy#create S3ControlMultiRegionAccessPointPolicy#create}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point_policy#update S3ControlMultiRegionAccessPointPolicy#update}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUpdate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3ControlMultiRegionAccessPointPolicyTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3ControlMultiRegionAccessPointPolicyTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3ControlMultiRegionAccessPointPolicyTimeouts> {
        java.lang.String create;
        java.lang.String update;

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointPolicyTimeouts#getCreate}
         * @param create Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point_policy#create S3ControlMultiRegionAccessPointPolicy#create}.
         * @return {@code this}
         */
        public Builder create(java.lang.String create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointPolicyTimeouts#getUpdate}
         * @param update Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point_policy#update S3ControlMultiRegionAccessPointPolicy#update}.
         * @return {@code this}
         */
        public Builder update(java.lang.String update) {
            this.update = update;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3ControlMultiRegionAccessPointPolicyTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3ControlMultiRegionAccessPointPolicyTimeouts build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3ControlMultiRegionAccessPointPolicyTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3ControlMultiRegionAccessPointPolicyTimeouts {
        private final java.lang.String create;
        private final java.lang.String update;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.update = software.amazon.jsii.Kernel.get(this, "update", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.create = builder.create;
            this.update = builder.update;
        }

        @Override
        public final java.lang.String getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.String getUpdate() {
            return this.update;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getUpdate() != null) {
                data.set("update", om.valueToTree(this.getUpdate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3ControlMultiRegionAccessPointPolicyTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3ControlMultiRegionAccessPointPolicyTimeouts.Jsii$Proxy that = (S3ControlMultiRegionAccessPointPolicyTimeouts.Jsii$Proxy) o;

            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            return this.update != null ? this.update.equals(that.update) : that.update == null;
        }

        @Override
        public final int hashCode() {
            int result = this.create != null ? this.create.hashCode() : 0;
            result = 31 * result + (this.update != null ? this.update.hashCode() : 0);
            return result;
        }
    }
}
