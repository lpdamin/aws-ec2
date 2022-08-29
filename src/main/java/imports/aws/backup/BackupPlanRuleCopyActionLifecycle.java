package imports.aws.backup;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.845Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.backup.BackupPlanRuleCopyActionLifecycle")
@software.amazon.jsii.Jsii.Proxy(BackupPlanRuleCopyActionLifecycle.Jsii$Proxy.class)
public interface BackupPlanRuleCopyActionLifecycle extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_plan#cold_storage_after BackupPlan#cold_storage_after}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getColdStorageAfter() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_plan#delete_after BackupPlan#delete_after}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDeleteAfter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BackupPlanRuleCopyActionLifecycle}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BackupPlanRuleCopyActionLifecycle}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BackupPlanRuleCopyActionLifecycle> {
        java.lang.Number coldStorageAfter;
        java.lang.Number deleteAfter;

        /**
         * Sets the value of {@link BackupPlanRuleCopyActionLifecycle#getColdStorageAfter}
         * @param coldStorageAfter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_plan#cold_storage_after BackupPlan#cold_storage_after}.
         * @return {@code this}
         */
        public Builder coldStorageAfter(java.lang.Number coldStorageAfter) {
            this.coldStorageAfter = coldStorageAfter;
            return this;
        }

        /**
         * Sets the value of {@link BackupPlanRuleCopyActionLifecycle#getDeleteAfter}
         * @param deleteAfter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_plan#delete_after BackupPlan#delete_after}.
         * @return {@code this}
         */
        public Builder deleteAfter(java.lang.Number deleteAfter) {
            this.deleteAfter = deleteAfter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BackupPlanRuleCopyActionLifecycle}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BackupPlanRuleCopyActionLifecycle build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BackupPlanRuleCopyActionLifecycle}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BackupPlanRuleCopyActionLifecycle {
        private final java.lang.Number coldStorageAfter;
        private final java.lang.Number deleteAfter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.coldStorageAfter = software.amazon.jsii.Kernel.get(this, "coldStorageAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deleteAfter = software.amazon.jsii.Kernel.get(this, "deleteAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.coldStorageAfter = builder.coldStorageAfter;
            this.deleteAfter = builder.deleteAfter;
        }

        @Override
        public final java.lang.Number getColdStorageAfter() {
            return this.coldStorageAfter;
        }

        @Override
        public final java.lang.Number getDeleteAfter() {
            return this.deleteAfter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getColdStorageAfter() != null) {
                data.set("coldStorageAfter", om.valueToTree(this.getColdStorageAfter()));
            }
            if (this.getDeleteAfter() != null) {
                data.set("deleteAfter", om.valueToTree(this.getDeleteAfter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.backup.BackupPlanRuleCopyActionLifecycle"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BackupPlanRuleCopyActionLifecycle.Jsii$Proxy that = (BackupPlanRuleCopyActionLifecycle.Jsii$Proxy) o;

            if (this.coldStorageAfter != null ? !this.coldStorageAfter.equals(that.coldStorageAfter) : that.coldStorageAfter != null) return false;
            return this.deleteAfter != null ? this.deleteAfter.equals(that.deleteAfter) : that.deleteAfter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.coldStorageAfter != null ? this.coldStorageAfter.hashCode() : 0;
            result = 31 * result + (this.deleteAfter != null ? this.deleteAfter.hashCode() : 0);
            return result;
        }
    }
}
