package com.dream.learning.dagger2.demo9;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Component(modules = Dagger2Demo9Module.class)
public interface Dagger2Demo9Component {
    // @Component(modules = Dagger2Demo9PresenterModule.class, dependencies = Dagger2Demo9Component.class)
    // 将Dagger2Demo9Module中的Dagger2Demo9ABean暴露出来，以便于其他依赖于Dagger2Demo9Component的Component调用
    Dagger2Demo9ABean getDagger2Demo9ABean();

}
