package imports.aws.lakeformation;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.734Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lakeformation.LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions")
@software.amazon.jsii.Jsii.Proxy(LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions.Jsii$Proxy.class)
public interface LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#permissions LakeformationDataLakeSettings#permissions}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPermissions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#principal LakeformationDataLakeSettings#principal}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrincipal() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions> {
        java.util.List<java.lang.String> permissions;
        java.lang.String principal;

        /**
         * Sets the value of {@link LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions#getPermissions}
         * @param permissions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#permissions LakeformationDataLakeSettings#permissions}.
         * @return {@code this}
         */
        public Builder permissions(java.util.List<java.lang.String> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions#getPrincipal}
         * @param principal Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#principal LakeformationDataLakeSettings#principal}.
         * @return {@code this}
         */
        public Builder principal(java.lang.String principal) {
            this.principal = principal;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions {
        private final java.util.List<java.lang.String> permissions;
        private final java.lang.String principal;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.permissions = software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.principal = software.amazon.jsii.Kernel.get(this, "principal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.permissions = builder.permissions;
            this.principal = builder.principal;
        }

        @Override
        public final java.util.List<java.lang.String> getPermissions() {
            return this.permissions;
        }

        @Override
        public final java.lang.String getPrincipal() {
            return this.principal;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPermissions() != null) {
                data.set("permissions", om.valueToTree(this.getPermissions()));
            }
            if (this.getPrincipal() != null) {
                data.set("principal", om.valueToTree(this.getPrincipal()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lakeformation.LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions.Jsii$Proxy that = (LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions.Jsii$Proxy) o;

            if (this.permissions != null ? !this.permissions.equals(that.permissions) : that.permissions != null) return false;
            return this.principal != null ? this.principal.equals(that.principal) : that.principal == null;
        }

        @Override
        public final int hashCode() {
            int result = this.permissions != null ? this.permissions.hashCode() : 0;
            result = 31 * result + (this.principal != null ? this.principal.hashCode() : 0);
            return result;
        }
    }
}
