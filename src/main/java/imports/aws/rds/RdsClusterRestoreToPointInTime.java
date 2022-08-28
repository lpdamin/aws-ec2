package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.255Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.RdsClusterRestoreToPointInTime")
@software.amazon.jsii.Jsii.Proxy(RdsClusterRestoreToPointInTime.Jsii$Proxy.class)
public interface RdsClusterRestoreToPointInTime extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#source_cluster_identifier RdsCluster#source_cluster_identifier}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceClusterIdentifier();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#restore_to_time RdsCluster#restore_to_time}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRestoreToTime() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#restore_type RdsCluster#restore_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRestoreType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#use_latest_restorable_time RdsCluster#use_latest_restorable_time}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseLatestRestorableTime() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RdsClusterRestoreToPointInTime}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RdsClusterRestoreToPointInTime}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RdsClusterRestoreToPointInTime> {
        java.lang.String sourceClusterIdentifier;
        java.lang.String restoreToTime;
        java.lang.String restoreType;
        java.lang.Object useLatestRestorableTime;

        /**
         * Sets the value of {@link RdsClusterRestoreToPointInTime#getSourceClusterIdentifier}
         * @param sourceClusterIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#source_cluster_identifier RdsCluster#source_cluster_identifier}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceClusterIdentifier(java.lang.String sourceClusterIdentifier) {
            this.sourceClusterIdentifier = sourceClusterIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterRestoreToPointInTime#getRestoreToTime}
         * @param restoreToTime Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#restore_to_time RdsCluster#restore_to_time}.
         * @return {@code this}
         */
        public Builder restoreToTime(java.lang.String restoreToTime) {
            this.restoreToTime = restoreToTime;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterRestoreToPointInTime#getRestoreType}
         * @param restoreType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#restore_type RdsCluster#restore_type}.
         * @return {@code this}
         */
        public Builder restoreType(java.lang.String restoreType) {
            this.restoreType = restoreType;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterRestoreToPointInTime#getUseLatestRestorableTime}
         * @param useLatestRestorableTime Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#use_latest_restorable_time RdsCluster#use_latest_restorable_time}.
         * @return {@code this}
         */
        public Builder useLatestRestorableTime(java.lang.Boolean useLatestRestorableTime) {
            this.useLatestRestorableTime = useLatestRestorableTime;
            return this;
        }

        /**
         * Sets the value of {@link RdsClusterRestoreToPointInTime#getUseLatestRestorableTime}
         * @param useLatestRestorableTime Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/rds_cluster#use_latest_restorable_time RdsCluster#use_latest_restorable_time}.
         * @return {@code this}
         */
        public Builder useLatestRestorableTime(com.hashicorp.cdktf.IResolvable useLatestRestorableTime) {
            this.useLatestRestorableTime = useLatestRestorableTime;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RdsClusterRestoreToPointInTime}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RdsClusterRestoreToPointInTime build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RdsClusterRestoreToPointInTime}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RdsClusterRestoreToPointInTime {
        private final java.lang.String sourceClusterIdentifier;
        private final java.lang.String restoreToTime;
        private final java.lang.String restoreType;
        private final java.lang.Object useLatestRestorableTime;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sourceClusterIdentifier = software.amazon.jsii.Kernel.get(this, "sourceClusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restoreToTime = software.amazon.jsii.Kernel.get(this, "restoreToTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restoreType = software.amazon.jsii.Kernel.get(this, "restoreType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useLatestRestorableTime = software.amazon.jsii.Kernel.get(this, "useLatestRestorableTime", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sourceClusterIdentifier = java.util.Objects.requireNonNull(builder.sourceClusterIdentifier, "sourceClusterIdentifier is required");
            this.restoreToTime = builder.restoreToTime;
            this.restoreType = builder.restoreType;
            this.useLatestRestorableTime = builder.useLatestRestorableTime;
        }

        @Override
        public final java.lang.String getSourceClusterIdentifier() {
            return this.sourceClusterIdentifier;
        }

        @Override
        public final java.lang.String getRestoreToTime() {
            return this.restoreToTime;
        }

        @Override
        public final java.lang.String getRestoreType() {
            return this.restoreType;
        }

        @Override
        public final java.lang.Object getUseLatestRestorableTime() {
            return this.useLatestRestorableTime;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("sourceClusterIdentifier", om.valueToTree(this.getSourceClusterIdentifier()));
            if (this.getRestoreToTime() != null) {
                data.set("restoreToTime", om.valueToTree(this.getRestoreToTime()));
            }
            if (this.getRestoreType() != null) {
                data.set("restoreType", om.valueToTree(this.getRestoreType()));
            }
            if (this.getUseLatestRestorableTime() != null) {
                data.set("useLatestRestorableTime", om.valueToTree(this.getUseLatestRestorableTime()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.rds.RdsClusterRestoreToPointInTime"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RdsClusterRestoreToPointInTime.Jsii$Proxy that = (RdsClusterRestoreToPointInTime.Jsii$Proxy) o;

            if (!sourceClusterIdentifier.equals(that.sourceClusterIdentifier)) return false;
            if (this.restoreToTime != null ? !this.restoreToTime.equals(that.restoreToTime) : that.restoreToTime != null) return false;
            if (this.restoreType != null ? !this.restoreType.equals(that.restoreType) : that.restoreType != null) return false;
            return this.useLatestRestorableTime != null ? this.useLatestRestorableTime.equals(that.useLatestRestorableTime) : that.useLatestRestorableTime == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sourceClusterIdentifier.hashCode();
            result = 31 * result + (this.restoreToTime != null ? this.restoreToTime.hashCode() : 0);
            result = 31 * result + (this.restoreType != null ? this.restoreType.hashCode() : 0);
            result = 31 * result + (this.useLatestRestorableTime != null ? this.useLatestRestorableTime.hashCode() : 0);
            return result;
        }
    }
}
