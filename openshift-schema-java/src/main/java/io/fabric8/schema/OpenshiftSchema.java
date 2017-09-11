package io.fabric8.schema;

import java.net.URI;
import java.net.URISyntaxException;


public class OpenshiftSchema {
    public static URI getSchemaFile(String name) throws URISyntaxException {
        return OpenshiftSchema.class.getResource("/schema/" + name + ".json").toURI();
    }
}
