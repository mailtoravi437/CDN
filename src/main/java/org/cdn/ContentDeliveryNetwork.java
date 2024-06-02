package org.cdn;

import java.util.HashMap;
import java.util.Map;

public class ContentDeliveryNetwork {
    Map<String,EdgeServer> edgeServers;

    ContentDeliveryNetwork(){
        edgeServers = new HashMap<>();
    }

    public void addEdgeServer(String location,EdgeServer edgeServer){
        edgeServers.put(location,edgeServer);
    }


    public Content getContent(String location,String url) throws Exception{
        EdgeServer edgeServer = edgeServers.get(location);
        if(edgeServer!=null){
            return edgeServer.getContent(url);
        }

        throw new RuntimeException("No edge server found for location: "+location);
    }
}
