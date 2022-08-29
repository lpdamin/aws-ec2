package imports.aws.lightsail;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.876Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lightsail.LightsailContainerServicePublicDomainNamesOutputReference")
public class LightsailContainerServicePublicDomainNamesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LightsailContainerServicePublicDomainNamesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LightsailContainerServicePublicDomainNamesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LightsailContainerServicePublicDomainNamesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCertificate(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCertificate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lightsail.LightsailContainerServicePublicDomainNamesCertificateList getCertificate() {
        return software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(imports.aws.lightsail.LightsailContainerServicePublicDomainNamesCertificateList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lightsail.LightsailContainerServicePublicDomainNames getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lightsail.LightsailContainerServicePublicDomainNames.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lightsail.LightsailContainerServicePublicDomainNames value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
