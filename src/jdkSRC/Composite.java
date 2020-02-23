package jdkSRC;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -9:33
 * @title
 **/
public class Composite {
    public static void main(String[] args){
        Map<Integer,String> hashMap =
                new HashMap<>();
        hashMap.put(0, "东游记");

        Map<Integer,String> hashMap2 =
                new HashMap<>();
        hashMap2.put(1, "西游记");
        hashMap2.put(2, "红楼梦");
        hashMap.putAll(hashMap2);

        System.out.println(hashMap);
    }
}
