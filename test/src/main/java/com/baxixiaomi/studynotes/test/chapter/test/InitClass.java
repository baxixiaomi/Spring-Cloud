package com.baxixiaomi.studynotes.test.chapter.test;

import org.apache.commons.lang3.StringUtils;

/**
 * 验证变量未初始化的值
 *
 * @author 吧嘻小米
 * @since JDK 1.8
 */
public class InitClass {

    private int i;

    private char character;

    public InitClass(int i, char character) {
        this.i = i;
        this.character = character;
    }

    private InitClass() {
    }

    public static void main(String[] args) {
        InitClass initClass = new InitClass();
        char character = initClass.character;
        int i = initClass.i;
        System.out.println(character);
        // 判断字符为空的方法
        if (character == '\0') {
            System.out.println(" this char is blank");
        }
        System.out.println(i);
    }
}
