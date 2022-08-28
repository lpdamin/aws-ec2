package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.461Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlock")
@software.amazon.jsii.Jsii.Proxy(S3ControlMultiRegionAccessPointDetailsPublicAccessBlock.Jsii$Proxy.class)
public interface S3ControlMultiRegionAccessPointDetailsPublicAccessBlock extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#block_public_acls S3ControlMultiRegionAccessPoint#block_public_acls}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getBlockPublicAcls() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#block_public_policy S3ControlMultiRegionAccessPoint#block_public_policy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getBlockPublicPolicy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#ignore_public_acls S3ControlMultiRegionAccessPoint#ignore_public_acls}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIgnorePublicAcls() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#restrict_public_buckets S3ControlMultiRegionAccessPoint#restrict_public_buckets}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRestrictPublicBuckets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3ControlMultiRegionAccessPointDetailsPublicAccessBlock> {
        java.lang.Object blockPublicAcls;
        java.lang.Object blockPublicPolicy;
        java.lang.Object ignorePublicAcls;
        java.lang.Object restrictPublicBuckets;

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getBlockPublicAcls}
         * @param blockPublicAcls Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#block_public_acls S3ControlMultiRegionAccessPoint#block_public_acls}.
         * @return {@code this}
         */
        public Builder blockPublicAcls(java.lang.Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getBlockPublicAcls}
         * @param blockPublicAcls Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#block_public_acls S3ControlMultiRegionAccessPoint#block_public_acls}.
         * @return {@code this}
         */
        public Builder blockPublicAcls(com.hashicorp.cdktf.IResolvable blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getBlockPublicPolicy}
         * @param blockPublicPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#block_public_policy S3ControlMultiRegionAccessPoint#block_public_policy}.
         * @return {@code this}
         */
        public Builder blockPublicPolicy(java.lang.Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getBlockPublicPolicy}
         * @param blockPublicPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#block_public_policy S3ControlMultiRegionAccessPoint#block_public_policy}.
         * @return {@code this}
         */
        public Builder blockPublicPolicy(com.hashicorp.cdktf.IResolvable blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getIgnorePublicAcls}
         * @param ignorePublicAcls Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#ignore_public_acls S3ControlMultiRegionAccessPoint#ignore_public_acls}.
         * @return {@code this}
         */
        public Builder ignorePublicAcls(java.lang.Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getIgnorePublicAcls}
         * @param ignorePublicAcls Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#ignore_public_acls S3ControlMultiRegionAccessPoint#ignore_public_acls}.
         * @return {@code this}
         */
        public Builder ignorePublicAcls(com.hashicorp.cdktf.IResolvable ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getRestrictPublicBuckets}
         * @param restrictPublicBuckets Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#restrict_public_buckets S3ControlMultiRegionAccessPoint#restrict_public_buckets}.
         * @return {@code this}
         */
        public Builder restrictPublicBuckets(java.lang.Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock#getRestrictPublicBuckets}
         * @param restrictPublicBuckets Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_multi_region_access_point#restrict_public_buckets S3ControlMultiRegionAccessPoint#restrict_public_buckets}.
         * @return {@code this}
         */
        public Builder restrictPublicBuckets(com.hashicorp.cdktf.IResolvable restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3ControlMultiRegionAccessPointDetailsPublicAccessBlock build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3ControlMultiRegionAccessPointDetailsPublicAccessBlock}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3ControlMultiRegionAccessPointDetailsPublicAccessBlock {
        private final java.lang.Object blockPublicAcls;
        private final java.lang.Object blockPublicPolicy;
        private final java.lang.Object ignorePublicAcls;
        private final java.lang.Object restrictPublicBuckets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blockPublicAcls = software.amazon.jsii.Kernel.get(this, "blockPublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.blockPublicPolicy = software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ignorePublicAcls = software.amazon.jsii.Kernel.get(this, "ignorePublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.restrictPublicBuckets = software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blockPublicAcls = builder.blockPublicAcls;
            this.blockPublicPolicy = builder.blockPublicPolicy;
            this.ignorePublicAcls = builder.ignorePublicAcls;
            this.restrictPublicBuckets = builder.restrictPublicBuckets;
        }

        @Override
        public final java.lang.Object getBlockPublicAcls() {
            return this.blockPublicAcls;
        }

        @Override
        public final java.lang.Object getBlockPublicPolicy() {
            return this.blockPublicPolicy;
        }

        @Override
        public final java.lang.Object getIgnorePublicAcls() {
            return this.ignorePublicAcls;
        }

        @Override
        public final java.lang.Object getRestrictPublicBuckets() {
            return this.restrictPublicBuckets;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBlockPublicAcls() != null) {
                data.set("blockPublicAcls", om.valueToTree(this.getBlockPublicAcls()));
            }
            if (this.getBlockPublicPolicy() != null) {
                data.set("blockPublicPolicy", om.valueToTree(this.getBlockPublicPolicy()));
            }
            if (this.getIgnorePublicAcls() != null) {
                data.set("ignorePublicAcls", om.valueToTree(this.getIgnorePublicAcls()));
            }
            if (this.getRestrictPublicBuckets() != null) {
                data.set("restrictPublicBuckets", om.valueToTree(this.getRestrictPublicBuckets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3ControlMultiRegionAccessPointDetailsPublicAccessBlock"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3ControlMultiRegionAccessPointDetailsPublicAccessBlock.Jsii$Proxy that = (S3ControlMultiRegionAccessPointDetailsPublicAccessBlock.Jsii$Proxy) o;

            if (this.blockPublicAcls != null ? !this.blockPublicAcls.equals(that.blockPublicAcls) : that.blockPublicAcls != null) return false;
            if (this.blockPublicPolicy != null ? !this.blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) return false;
            if (this.ignorePublicAcls != null ? !this.ignorePublicAcls.equals(that.ignorePublicAcls) : that.ignorePublicAcls != null) return false;
            return this.restrictPublicBuckets != null ? this.restrictPublicBuckets.equals(that.restrictPublicBuckets) : that.restrictPublicBuckets == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockPublicAcls != null ? this.blockPublicAcls.hashCode() : 0;
            result = 31 * result + (this.blockPublicPolicy != null ? this.blockPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.ignorePublicAcls != null ? this.ignorePublicAcls.hashCode() : 0);
            result = 31 * result + (this.restrictPublicBuckets != null ? this.restrictPublicBuckets.hashCode() : 0);
            return result;
        }
    }
}
