package com.practice.zhuzru;

/**
 * 功能描述：
 *
 * @Date 2023/8/14 23:13
 * @Created by zhuzru
 */
public class InputMethod {
    private Skin skin;

    InputMethod() {
    }

    InputMethod(Skin skin) {
        this.skin = skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    void displaySkin() {
        skin.display();
    }
}
