package imports.aws.transfer;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.839Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.transfer.TransferWorkflowSteps")
@software.amazon.jsii.Jsii.Proxy(TransferWorkflowSteps.Jsii$Proxy.class)
public interface TransferWorkflowSteps extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#type TransferWorkflow#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * copy_step_details block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#copy_step_details TransferWorkflow#copy_step_details}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsCopyStepDetails getCopyStepDetails() {
        return null;
    }

    /**
     * custom_step_details block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#custom_step_details TransferWorkflow#custom_step_details}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsCustomStepDetails getCustomStepDetails() {
        return null;
    }

    /**
     * delete_step_details block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#delete_step_details TransferWorkflow#delete_step_details}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsDeleteStepDetails getDeleteStepDetails() {
        return null;
    }

    /**
     * tag_step_details block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#tag_step_details TransferWorkflow#tag_step_details}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.transfer.TransferWorkflowStepsTagStepDetails getTagStepDetails() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TransferWorkflowSteps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TransferWorkflowSteps}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TransferWorkflowSteps> {
        java.lang.String type;
        imports.aws.transfer.TransferWorkflowStepsCopyStepDetails copyStepDetails;
        imports.aws.transfer.TransferWorkflowStepsCustomStepDetails customStepDetails;
        imports.aws.transfer.TransferWorkflowStepsDeleteStepDetails deleteStepDetails;
        imports.aws.transfer.TransferWorkflowStepsTagStepDetails tagStepDetails;

        /**
         * Sets the value of {@link TransferWorkflowSteps#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#type TransferWorkflow#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link TransferWorkflowSteps#getCopyStepDetails}
         * @param copyStepDetails copy_step_details block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#copy_step_details TransferWorkflow#copy_step_details}
         * @return {@code this}
         */
        public Builder copyStepDetails(imports.aws.transfer.TransferWorkflowStepsCopyStepDetails copyStepDetails) {
            this.copyStepDetails = copyStepDetails;
            return this;
        }

        /**
         * Sets the value of {@link TransferWorkflowSteps#getCustomStepDetails}
         * @param customStepDetails custom_step_details block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#custom_step_details TransferWorkflow#custom_step_details}
         * @return {@code this}
         */
        public Builder customStepDetails(imports.aws.transfer.TransferWorkflowStepsCustomStepDetails customStepDetails) {
            this.customStepDetails = customStepDetails;
            return this;
        }

        /**
         * Sets the value of {@link TransferWorkflowSteps#getDeleteStepDetails}
         * @param deleteStepDetails delete_step_details block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#delete_step_details TransferWorkflow#delete_step_details}
         * @return {@code this}
         */
        public Builder deleteStepDetails(imports.aws.transfer.TransferWorkflowStepsDeleteStepDetails deleteStepDetails) {
            this.deleteStepDetails = deleteStepDetails;
            return this;
        }

        /**
         * Sets the value of {@link TransferWorkflowSteps#getTagStepDetails}
         * @param tagStepDetails tag_step_details block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/transfer_workflow#tag_step_details TransferWorkflow#tag_step_details}
         * @return {@code this}
         */
        public Builder tagStepDetails(imports.aws.transfer.TransferWorkflowStepsTagStepDetails tagStepDetails) {
            this.tagStepDetails = tagStepDetails;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TransferWorkflowSteps}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TransferWorkflowSteps build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link TransferWorkflowSteps}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TransferWorkflowSteps {
        private final java.lang.String type;
        private final imports.aws.transfer.TransferWorkflowStepsCopyStepDetails copyStepDetails;
        private final imports.aws.transfer.TransferWorkflowStepsCustomStepDetails customStepDetails;
        private final imports.aws.transfer.TransferWorkflowStepsDeleteStepDetails deleteStepDetails;
        private final imports.aws.transfer.TransferWorkflowStepsTagStepDetails tagStepDetails;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.copyStepDetails = software.amazon.jsii.Kernel.get(this, "copyStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsCopyStepDetails.class));
            this.customStepDetails = software.amazon.jsii.Kernel.get(this, "customStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsCustomStepDetails.class));
            this.deleteStepDetails = software.amazon.jsii.Kernel.get(this, "deleteStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsDeleteStepDetails.class));
            this.tagStepDetails = software.amazon.jsii.Kernel.get(this, "tagStepDetails", software.amazon.jsii.NativeType.forClass(imports.aws.transfer.TransferWorkflowStepsTagStepDetails.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.copyStepDetails = builder.copyStepDetails;
            this.customStepDetails = builder.customStepDetails;
            this.deleteStepDetails = builder.deleteStepDetails;
            this.tagStepDetails = builder.tagStepDetails;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.aws.transfer.TransferWorkflowStepsCopyStepDetails getCopyStepDetails() {
            return this.copyStepDetails;
        }

        @Override
        public final imports.aws.transfer.TransferWorkflowStepsCustomStepDetails getCustomStepDetails() {
            return this.customStepDetails;
        }

        @Override
        public final imports.aws.transfer.TransferWorkflowStepsDeleteStepDetails getDeleteStepDetails() {
            return this.deleteStepDetails;
        }

        @Override
        public final imports.aws.transfer.TransferWorkflowStepsTagStepDetails getTagStepDetails() {
            return this.tagStepDetails;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getCopyStepDetails() != null) {
                data.set("copyStepDetails", om.valueToTree(this.getCopyStepDetails()));
            }
            if (this.getCustomStepDetails() != null) {
                data.set("customStepDetails", om.valueToTree(this.getCustomStepDetails()));
            }
            if (this.getDeleteStepDetails() != null) {
                data.set("deleteStepDetails", om.valueToTree(this.getDeleteStepDetails()));
            }
            if (this.getTagStepDetails() != null) {
                data.set("tagStepDetails", om.valueToTree(this.getTagStepDetails()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.transfer.TransferWorkflowSteps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TransferWorkflowSteps.Jsii$Proxy that = (TransferWorkflowSteps.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.copyStepDetails != null ? !this.copyStepDetails.equals(that.copyStepDetails) : that.copyStepDetails != null) return false;
            if (this.customStepDetails != null ? !this.customStepDetails.equals(that.customStepDetails) : that.customStepDetails != null) return false;
            if (this.deleteStepDetails != null ? !this.deleteStepDetails.equals(that.deleteStepDetails) : that.deleteStepDetails != null) return false;
            return this.tagStepDetails != null ? this.tagStepDetails.equals(that.tagStepDetails) : that.tagStepDetails == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.copyStepDetails != null ? this.copyStepDetails.hashCode() : 0);
            result = 31 * result + (this.customStepDetails != null ? this.customStepDetails.hashCode() : 0);
            result = 31 * result + (this.deleteStepDetails != null ? this.deleteStepDetails.hashCode() : 0);
            result = 31 * result + (this.tagStepDetails != null ? this.tagStepDetails.hashCode() : 0);
            return result;
        }
    }
}
