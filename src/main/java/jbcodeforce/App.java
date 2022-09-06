package jbcodeforce;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import io.apicurio.registry.rest.client.RegistryClient;
import io.apicurio.registry.rest.client.RegistryClientFactory;
import io.apicurio.registry.rest.v2.beans.ArtifactMetaData;

/**
 * Hello world!
 *
 */
public class App {

    
    
    public static void main( String[] args )
    {
        System.out.println( "Hello From Apicur.io registry client!" );
        String registryUrl = "https://es-demo-ibm-es-ac-reg-external-cp4i-eventstreams.apps.finn.coc-ibm.com/apis/registry/v2";
        Map<String,Object> config = new HashMap<String,Object>();
        config.put("apicurio.registry.request.ssl.truststore.location", "./es-cert.p12");
        config.put("apicurio.registry.request.ssl.truststore.password","K46pEyLaYrpf");
        config.put("apicurio.registry.request.ssl.truststore.type","PKCS12");
        RegistryClient client = RegistryClientFactory.create(registryUrl,config);
        ArtifactMetaData data = client.getArtifactMetaData("default", "finn20-customer-value");
        System.out.println(data.toString());
    }
}
