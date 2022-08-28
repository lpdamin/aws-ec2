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
            .build());

        app.synth();
    }
}
