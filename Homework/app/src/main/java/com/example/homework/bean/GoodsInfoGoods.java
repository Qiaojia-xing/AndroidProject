package com.example.homework.bean;

import com.example.homework.R;

import java.util.ArrayList;

public class GoodsInfoGoods {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfoGoods() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手表商品的名称数组
    private static String[] mNameArray = {
            "iPhone12 pro max", "华为 nova6se", "红米 9A", "OPPO Reno4 SE", "vivo Y73s", "魅蓝Note6"
    };
    // 声明一个手表商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 Pro 5G手机国行正品官方旗舰店",
            "Huawei nova6se手机全网通新款直降p30",
            "Xiaomi Redmi 9A红米全新手机",
            "OPPO Reno4 SE opporeno4se手机5G 限量版",
            "vivo Y73s双模5G智能新款手机官方旗舰店官网正品全新限量版",
            "Meizu/魅族 魅蓝Note6全网通4G5.5寸双卡智能移动电信手机note5/3"
    };
    // 声明一个手表手机商品的价格数组
    private static float[] mPriceArray = {5678, 3421, 3456, 4567, 2413, 2678};
    // 声明一个手表商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s
    };
    // 声明一个手表商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.huawei, R.drawable.xiaomi,
            R.drawable.oppo, R.drawable.vivo, R.drawable.meizu
    };

    // 获取默认的手表信息列表
    public static ArrayList<GoodsInfoGoods> getDefaultList() {
        ArrayList<GoodsInfoGoods> goodsList = new ArrayList<GoodsInfoGoods>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfoGoods info = new GoodsInfoGoods();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}//These codes are from Peter Pang.