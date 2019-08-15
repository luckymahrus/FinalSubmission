package com.luckymahrus.finalsubmission.model;

import java.util.ArrayList;

public class BrandsData
{
    public static String[][] data = new String[][]{
            {"0", "Acer", "http://www.myiconfinder.com/uploads/iconsets/128-128-f37bd5c8c36eeb36ed779054550246f2-Acer.png"},
            {"1", "Apple", "https://image.flaticon.com/icons/png/128/25/25345.png"},
            {"2", "Asus", "https://www.shareicon.net/data/128x128/2016/07/15/619322_mirror_320x320.png"},
            {"3", "Huawei", "http://bewhere.com/wp-content/uploads/2017/06/huawei_logo_128px_.png"},
            {"4", "Lenovo", "https://cdn.iconscout.com/icon/free/png-128/lenovo-226431.png"},
            {"5", "LG", "https://www.shareicon.net/data/128x128/2015/09/01/94026_lg_512x512.png"},
            {"6", "Oppo", "https://image.flaticon.com/icons/png/128/882/882745.png"},
            {"7", "Samsung", "https://cdn4.iconfinder.com/data/icons/logos-brands-5/24/samsung-128.png"},
            {"8", "Vivo", "https://image.flaticon.com/icons/png/128/882/882711.png"},
            {"9", "Xiaomi", "https://cdn4.iconfinder.com/data/icons/flat-brand-logo-2/512/xiaomi-128.png"},
    };

    public static ArrayList<Brand> getListData()
    {
        ArrayList<Brand> list = new ArrayList<>();
        for (String[] aData : data) {
            Brand brand = new Brand();
            brand.setBrandId(aData[0]);
            brand.setBrandLogo(aData[2]);
            brand.setBrandName(aData[1]);
            list.add(brand);
        }
        return list;
    }
}