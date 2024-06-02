package org.cdn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ContentDeliveryNetwork cdn = new ContentDeliveryNetwork();
        cdn.addEdgeServer("US",new CachingEdgeServer());

        try{
            Content content = cdn.getContent("US","http://www.google.com");
            System.out.println(content.getContent());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
