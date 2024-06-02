package org.cdn;

import java.util.HashMap;
import java.util.Map;

public class CachingEdgeServer implements EdgeServer{

    Map<String,Content> cache;

    CachingEdgeServer(){
        cache = new HashMap<>();
    }


    @Override
    public Content getContent(String url) throws Exception {
        if(!cache.containsKey(url)){
            Content content = new Content("Content for url: "+url);
            cache.put(url,content);
        }
        return cache.get(url);
    }
}
