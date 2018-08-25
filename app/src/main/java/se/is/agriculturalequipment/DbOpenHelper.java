package se.is.agriculturalequipment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by iFirst on 12/19/16.
 */

public class DbOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "AgriculturalEquipment.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_TABLE_G200 = "create table g200TABLE(_id integer primary key, partNameG200 TEXT, partPriceG200 TEXT);";
    private static final String CREATE_TABLE_GX160 = "create table gx160TABLE(_id integer primary key, partNameGX160 TEXT, partPriceGX160 TEXT);";
    private static final String CREATE_TABLE_GX35 = "create table gx35TABLE(_id integer primary key, partNameGX35 TEXT, partPriceGX35 TEXT);";
    private static final String CREATE_TABLE_T200 = "create table t200TABLE(_id integer primary key, partNameT200 TEXT, partPriceT200 TEXT);";
    private static final String CREATE_TABLE_TM31 = "create table tm31TABLE(_id integer primary key, partNameTM31 TEXT, partPriceTM31 TEXT);";
    private static final String CREATE_TABLE_USER = "create table userTable(id integer primary key, nameUser TEXT, username TEXT, password TEXT, userRole TEXT);";


    public DbOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_G200);
        sqLiteDatabase.execSQL(CREATE_TABLE_GX160);
        sqLiteDatabase.execSQL(CREATE_TABLE_GX35);
        sqLiteDatabase.execSQL(CREATE_TABLE_T200);
        sqLiteDatabase.execSQL(CREATE_TABLE_TM31);
        sqLiteDatabase.execSQL(CREATE_TABLE_USER);

        String insertUser = "INSERT INTO userTable (nameUser, username, password, userRole) VALUES ('กิตติ','kitti','1234','Employee');";
        String insertUser1 = "INSERT INTO userTable (nameUser, username, password, userRole) VALUES ('จัสติน บีบี้','justinBB','1234','Employee');";
        String insertUser2 = "INSERT INTO userTable (nameUser, username, password, userRole) VALUES ('เป็นต่อ','pentor','1234','Owner');";
        String insertUser3 = "INSERT INTO userTable (nameUser, username, password, userRole) VALUES ('พอใจ','porjai','1234','Owner');";


        sqLiteDatabase.execSQL(insertUser);
        sqLiteDatabase.execSQL(insertUser1);
        sqLiteDatabase.execSQL(insertUser2);
        sqLiteDatabase.execSQL(insertUser3);


//        String insertG200a = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('จานกระตุก','420');";
//        String insertG200b = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ถังน้ำมัน','700');";
//        String insertG200c = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('หม้อกรองอากาศ','250');";
//        String insertG200d = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('คาร์บูเรเตอร์','450');";
//        String insertG200e = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('เสื้อสูบ','2200');";
//        String insertG200f = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ก๊อกน้ำมัน','150');";
//        String insertG200g = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ท่อไอเสีย','160');";
//        String insertG200h = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('สวิตช์ปิดเปิด','120');";
//        String insertG200i = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('คอยล์','580');";
//        String insertG200j = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ฝาถังน้ำมัน','50');";
//        String insertG200k = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ทำสี','120');";
//        String insertG200l = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ฝาถังน้ำมันเครื่อง','50');";
//        String insertG200m = "INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ปลั๊กหัวเทียน','50');";

        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('เครื่อง G200','8800');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('เชือกกระตุก','30')");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('จานกระตุก','420');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ถังน้ำมัน','700');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ไส้กรองอากาศ','40')");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('หม้อกรองอากาศ','250');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('คาร์บูเรเตอร์','450');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('เสื้อสูบ','2200');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ก็อกน้ำมัน','150');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ท่อไอเสีย','160');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('สวิตช์ปิดเปิด','120');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('คอยล์','580');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ฝาถังน้ำมัน','50');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ทำสี','120');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ฝาถังน้ำมันเครื่อง','50');");
        sqLiteDatabase.execSQL("INSERT INTO g200TABLE (partNameG200,partPriceG200) VALUES ('ปลั๊กหัวเทียน','50');");


        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('เครื่อง GX160','6000');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('เชือกกระตุก','30');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('จานกระตุก','420');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ถังน้ำมัน','650');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ไส้กรองอากาศ','40');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('หม้อกรองอากาศ','300');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('คาร์บูเรเตอร์','420');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('เสื้อสูบ','1800');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ก๊อกน้ำมัน','150');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ท่อไอเสีย','150');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('สวิตช์ปิดเปิด','120');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('คอยล์','550');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ฝาถังน้ำมัน','50');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ทำสี','120');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ฝาถังน้ำมันเครื่อง','50');");
        sqLiteDatabase.execSQL("INSERT INTO gx160TABLE (partNameGX160,partPriceGX160) VALUES ('ปลั๊กหัวเทียน','50');");




        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('เครื่อง GX35 ','8800');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('เชือกกระตุก','50');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('จานกระตุก','350');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ถังน้ำมัน','350');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('มือเร่ง','180');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ใบมีด','150');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ไส้กรองอากาศ','50');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('หม้อกรองอากาศ','250');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('คาร์บูเรเตอร์','550');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('เสื้อสูบ','850');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ก๊อกน้ำมัน','120');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ท่อไอเสีย','210');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('คอตัดหญ้า','800');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('กระบอกหาง','580');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('คอยล์','550');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('แกนเพลา','280');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ฝาถังน้ำมันเครื่อง','50');");
        sqLiteDatabase.execSQL("INSERT INTO gx35TABLE (partNameGX35,partPriceGX35) VALUES ('ปลั๊กหัวเทียน','50');");




        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('เครื่อง T200','8500');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('เชือกกระตุก','50');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('จานกระตุก','340');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ถังน้ำมัน','280');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('มือเร่ง','160');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ใบมีด','150');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ไส้กรองอากาศ','30');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('หม้อกรองอากาศ','200');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('คาร์บูเรเตอร์','480');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('เสื้อสูบ','650');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ก๊อกน้ำมัน','120');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ท่อไอเสีย','160');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('คอตัดหญ้า','750');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('กระบอกหาง','580');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('คอยล์','550');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('แกนเพลา','280');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ฝาถังน้ำมันเครื่อง','50');");
        sqLiteDatabase.execSQL("INSERT INTO t200TABLE (partNameT200,partPriceT200) VALUES ('ปลั๊กหัวเทียน','50');");



        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('เครื่อง TM31','5500');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('หม้อลม','350');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('ตัวตั้งโปโล','580');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('ท่อนดูด','350');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('ท่อนส่ง','550');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('ลูกสูบ','220');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('มู่เล่ย์','280');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('เกย์วัดความดัน','180');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('ก๊อกน้ำ','65');");
        sqLiteDatabase.execSQL("INSERT INTO tm31TABLE (partNameTM31,partPriceTM31) VALUES ('ฝาปิดน้ำมันเครื่อง','50');");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
