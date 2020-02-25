package jww.qk.designPattern.flyweight;

import java.util.HashMap;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 15:25
 * @title
 **/
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSite>
             pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type){
        if(!(pool.containsKey(type))){
            pool.put(type,
                    new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }

}
