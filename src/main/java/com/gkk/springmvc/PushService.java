package com.gkk.springmvc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by gongkuaikuai on 2017/4/13.
 */
@Service
public class PushService {
    private DeferredResult<String> defferredResult;

    public DeferredResult<String> getAsyncUpdate(){
        defferredResult = new DeferredResult<String>();
        return defferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        if(defferredResult!=null){
            defferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}
