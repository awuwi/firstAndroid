package com.example.admin.test;

import java.util.ArrayList;
import java.util.List;

public class Ling {

    private String name;
    private int imageId;

    public Ling(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    //返回一个Ling的列表
    public static List<Ling> getLings(){
        List<Ling> list = new ArrayList<>();
        list.add(new Ling("玲",R.drawable.ql));

        return list;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
