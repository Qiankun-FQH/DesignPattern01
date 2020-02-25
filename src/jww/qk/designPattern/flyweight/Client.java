package jww.qk.designPattern.flyweight;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 15:25
 * @title
 **/
public class Client {
    public static void main(String[] args){
        WebSiteFactory factory = new WebSiteFactory();


        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("01"));

        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("02"));
        WebSite webSite2 = factory.getWebSiteCategory("新闻");
        webSite2.use(new User("03"));

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("04"));
        WebSite webSite4 = factory.getWebSiteCategory("新闻");
        webSite4.use(new User("05"));

        WebSite webSite5 = factory.getWebSiteCategory("博客");
        webSite5.use(new User("06"));

        int webSiteCount = factory.getWebSiteCount();
        System.out.println(webSiteCount);
    }
}
