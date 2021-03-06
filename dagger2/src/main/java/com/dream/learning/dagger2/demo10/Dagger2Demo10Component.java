package com.dream.learning.dagger2.demo10;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Component(modules = Dagger2Demo10Module.class)
public interface Dagger2Demo10Component {

    // @Subcomponent(modules = Dagger2Demo10PresenterModule.class)
    // 需要将SubComponent 追加到 被依赖的Component中
    Dagger2Demo10PresenterComponent addSub(Dagger2Demo10PresenterModule dagger2Demo10PresenterModule);

}
