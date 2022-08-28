package com.mycompany.app;

import com.hashicorp.cdktf.App;
import com.hashicorp.cdktf.NamedRemoteWorkspace;
import com.hashicorp.cdktf.RemoteBackend;
import com.hashicorp.cdktf.RemoteBackendProps;
import com.hashicorp.cdktf.TerraformStack;

public class Main
{
    public static void main(String[] args) {
        final App app = new App();
        TerraformStack stack = new MainStack(app, "aws_instance");
        new RemoteBackend(stack, RemoteBackendProps.builder()
            .hostname("app.terraform.io")
            .organization("lakshmi-www-prod")
            .workspaces(new NamedRemoteWorkspace("aws-ec2"))
            .token("qMhWjdspYFLKNA.atlasv1.m6gw5uCQXWgB0y7vbq5LKEPAf7HMNs7zwYEuzVozGkNDSMxMu7Uz2jRCWHtkOT6MVPs")
            .build());

        app.synth();
    }
}
