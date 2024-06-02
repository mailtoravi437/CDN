package org.cdn;

public interface EdgeServer {
    Content getContent(String url) throws Exception;
}
