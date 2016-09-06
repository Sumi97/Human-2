package com.example.sumi.human;

/**
 * Created by sumi on 2016/09/06.
 */
import android.util.Log;

class Human extends Animal implements Thinkable {

    //メンバ変数
    String hobby;   //考え

    //コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + name + "です。");
        Log.d("javatest", "私の歳は" + age + "歳です。");
    }
    @Override
    public void think(){
        Log.d("javatest", "私は" + hobby + "について考える。");
    }

}