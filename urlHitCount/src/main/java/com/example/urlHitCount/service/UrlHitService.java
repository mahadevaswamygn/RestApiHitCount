package com.example.urlHitCount.service;

import com.example.urlHitCount.model.vist;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService {


    HashMap<String,Integer> hm = new HashMap<>();
    static int c=1;


    public vist getByName(String name)
    {
        int c=1;
        if(hm.containsKey(name))
        {
            int tt=hm.get(name);
            hm.put(name,++tt);

        }
        else {
            hm.put(name,c);
        }
        vist var = new vist(name,hm.get(name));
        return  var;
    }
    public int getCounts()
    {
        int te=c++;

        return  te;

    }


}
