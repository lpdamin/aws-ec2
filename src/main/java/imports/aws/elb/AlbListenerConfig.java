package imports.aws.elb;

/**
 * AWS Elastic Load Balancer.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.027Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.AlbListenerConfig")
@software.amazon.jsii.Jsii.Proxy(AlbListenerConfig.Jsii$Proxy.class)
public interface AlbListenerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * default_action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/alb_listener#default_action AlbListener#default_action}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getDefaultAction();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#load_balancer_arn AlbListener#load_balancer_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLoadBalancerArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#alpn_policy AlbListener#alpn_policy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlpnPolicy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#certificate_arn AlbListener#certificate_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCertificateArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#id AlbListener#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#port AlbListener#port}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#protocol AlbListener#protocol}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProtocol() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#ssl_policy AlbListener#ssl_policy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSslPolicy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#tags AlbListener#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#tags_all AlbListener#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/alb_listener#timeouts AlbListener#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AlbListenerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AlbListenerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AlbListenerConfig> {
        java.lang.Object defaultAction;
        java.lang.String loadBalancerArn;
        java.lang.String alpnPolicy;
        java.lang.String certificateArn;
        java.lang.String id;
        java.lang.Number port;
        java.lang.String protocol;
        java.lang.String sslPolicy;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        imports.aws.elb.AlbListenerTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link AlbListenerConfig#getDefaultAction}
         * @param defaultAction default_action block. This parameter is required.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/alb_listener#default_action AlbListener#default_action}
         * @return {@code this}
         */
        public Builder defaultAction(com.hashicorp.cdktf.IResolvable defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getDefaultAction}
         * @param defaultAction default_action block. This parameter is required.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/alb_listener#default_action AlbListener#default_action}
         * @return {@code this}
         */
        public Builder defaultAction(java.util.List<? extends imports.aws.elb.AlbListenerDefaultAction> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getLoadBalancerArn}
         * @param loadBalancerArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#load_balancer_arn AlbListener#load_balancer_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder loadBalancerArn(java.lang.String loadBalancerArn) {
            this.loadBalancerArn = loadBalancerArn;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getAlpnPolicy}
         * @param alpnPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#alpn_policy AlbListener#alpn_policy}.
         * @return {@code this}
         */
        public Builder alpnPolicy(java.lang.String alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getCertificateArn}
         * @param certificateArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#certificate_arn AlbListener#certificate_arn}.
         * @return {@code this}
         */
        public Builder certificateArn(java.lang.String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#id AlbListener#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getPort}
         * @param port Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#port AlbListener#port}.
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getProtocol}
         * @param protocol Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#protocol AlbListener#protocol}.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getSslPolicy}
         * @param sslPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#ssl_policy AlbListener#ssl_policy}.
         * @return {@code this}
         */
        public Builder sslPolicy(java.lang.String sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#tags AlbListener#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/alb_listener#tags_all AlbListener#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/alb_listener#timeouts AlbListener#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.elb.AlbListenerTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link AlbListenerConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AlbListenerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AlbListenerConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AlbListenerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AlbListenerConfig {
        private final java.lang.Object defaultAction;
        private final java.lang.String loadBalancerArn;
        private final java.lang.String alpnPolicy;
        private final java.lang.String certificateArn;
        private final java.lang.String id;
        private final java.lang.Number port;
        private final java.lang.String protocol;
        private final java.lang.String sslPolicy;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final imports.aws.elb.AlbListenerTimeouts timeouts;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultAction = software.amazon.jsii.Kernel.get(this, "defaultAction", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.loadBalancerArn = software.amazon.jsii.Kernel.get(this, "loadBalancerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alpnPolicy = software.amazon.jsii.Kernel.get(this, "alpnPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.certificateArn = software.amazon.jsii.Kernel.get(this, "certificateArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.port = software.amazon.jsii.Kernel.get(this, "port", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sslPolicy = software.amazon.jsii.Kernel.get(this, "sslPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerTimeouts.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultAction = java.util.Objects.requireNonNull(builder.defaultAction, "defaultAction is required");
            this.loadBalancerArn = java.util.Objects.requireNonNull(builder.loadBalancerArn, "loadBalancerArn is required");
            this.alpnPolicy = builder.alpnPolicy;
            this.certificateArn = builder.certificateArn;
            this.id = builder.id;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sslPolicy = builder.sslPolicy;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.timeouts = builder.timeouts;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Object getDefaultAction() {
            return this.defaultAction;
        }

        @Override
        public final java.lang.String getLoadBalancerArn() {
            return this.loadBalancerArn;
        }

        @Override
        public final java.lang.String getAlpnPolicy() {
            return this.alpnPolicy;
        }

        @Override
        public final java.lang.String getCertificateArn() {
            return this.certificateArn;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.String getSslPolicy() {
            return this.sslPolicy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final imports.aws.elb.AlbListenerTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultAction", om.valueToTree(this.getDefaultAction()));
            data.set("loadBalancerArn", om.valueToTree(this.getLoadBalancerArn()));
            if (this.getAlpnPolicy() != null) {
                data.set("alpnPolicy", om.valueToTree(this.getAlpnPolicy()));
            }
            if (this.getCertificateArn() != null) {
                data.set("certificateArn", om.valueToTree(this.getCertificateArn()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getProtocol() != null) {
                data.set("protocol", om.valueToTree(this.getProtocol()));
            }
            if (this.getSslPolicy() != null) {
                data.set("sslPolicy", om.valueToTree(this.getSslPolicy()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elb.AlbListenerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AlbListenerConfig.Jsii$Proxy that = (AlbListenerConfig.Jsii$Proxy) o;

            if (!defaultAction.equals(that.defaultAction)) return false;
            if (!loadBalancerArn.equals(that.loadBalancerArn)) return false;
            if (this.alpnPolicy != null ? !this.alpnPolicy.equals(that.alpnPolicy) : that.alpnPolicy != null) return false;
            if (this.certificateArn != null ? !this.certificateArn.equals(that.certificateArn) : that.certificateArn != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            if (this.protocol != null ? !this.protocol.equals(that.protocol) : that.protocol != null) return false;
            if (this.sslPolicy != null ? !this.sslPolicy.equals(that.sslPolicy) : that.sslPolicy != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultAction.hashCode();
            result = 31 * result + (this.loadBalancerArn.hashCode());
            result = 31 * result + (this.alpnPolicy != null ? this.alpnPolicy.hashCode() : 0);
            result = 31 * result + (this.certificateArn != null ? this.certificateArn.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.protocol != null ? this.protocol.hashCode() : 0);
            result = 31 * result + (this.sslPolicy != null ? this.sslPolicy.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
