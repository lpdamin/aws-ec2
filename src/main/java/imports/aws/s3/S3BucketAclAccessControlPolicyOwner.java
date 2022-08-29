package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.402Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketAclAccessControlPolicyOwner")
@software.amazon.jsii.Jsii.Proxy(S3BucketAclAccessControlPolicyOwner.Jsii$Proxy.class)
public interface S3BucketAclAccessControlPolicyOwner extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_acl#id S3BucketAcl#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_acl#display_name S3BucketAcl#display_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketAclAccessControlPolicyOwner}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketAclAccessControlPolicyOwner}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketAclAccessControlPolicyOwner> {
        java.lang.String id;
        java.lang.String displayName;

        /**
         * Sets the value of {@link S3BucketAclAccessControlPolicyOwner#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_acl#id S3BucketAcl#id}. This parameter is required.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketAclAccessControlPolicyOwner#getDisplayName}
         * @param displayName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_acl#display_name S3BucketAcl#display_name}.
         * @return {@code this}
         */
        public Builder displayName(java.lang.String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketAclAccessControlPolicyOwner}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketAclAccessControlPolicyOwner build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketAclAccessControlPolicyOwner}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketAclAccessControlPolicyOwner {
        private final java.lang.String id;
        private final java.lang.String displayName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.displayName = software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.id = java.util.Objects.requireNonNull(builder.id, "id is required");
            this.displayName = builder.displayName;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("id", om.valueToTree(this.getId()));
            if (this.getDisplayName() != null) {
                data.set("displayName", om.valueToTree(this.getDisplayName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketAclAccessControlPolicyOwner"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketAclAccessControlPolicyOwner.Jsii$Proxy that = (S3BucketAclAccessControlPolicyOwner.Jsii$Proxy) o;

            if (!id.equals(that.id)) return false;
            return this.displayName != null ? this.displayName.equals(that.displayName) : that.displayName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.id.hashCode();
            result = 31 * result + (this.displayName != null ? this.displayName.hashCode() : 0);
            return result;
        }
    }
}
