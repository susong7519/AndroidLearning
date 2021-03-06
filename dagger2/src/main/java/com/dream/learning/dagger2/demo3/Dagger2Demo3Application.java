package com.dream.learning.dagger2.demo3;

import android.app.Application;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo3Application extends Application {

    private static Dagger2Demo3Application mDagger2Demo3Application;
    private static Dagger2Demo3Component   mDagger2Demo3Component;

    @Override
    public void onCreate() {
        super.onCreate();
        mDagger2Demo3Application = this;
    }

    public static Dagger2Demo3Component getDagger2Demo3Component() {
        if (mDagger2Demo3Component == null) {
            mDagger2Demo3Component = DaggerDagger2Demo3Component.builder()
                                                                .dagger2Demo3Module(new Dagger2Demo3Module(mDagger2Demo3Application))
                                                                .build();
        }
        return mDagger2Demo3Component;
    }
}
