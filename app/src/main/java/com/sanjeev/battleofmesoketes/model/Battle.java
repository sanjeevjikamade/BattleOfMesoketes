package com.sanjeev.battleofmesoketes.model;

import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sanjeev.battleofmesoketes.BR;
import com.sanjeev.battleofmesoketes.Data.InputData;
import com.sanjeev.battleofmesoketes.utils.BattleUtils;

/**
 * author::Sanjeev Jikamade
 */

public class Battle {

    @NonNull
    Button btnResult;

    @NonNull
    int etEast1, etEast2, etEast3, etNorth1, etNorth2, etNorth3, etSouth, etSouth2, etSouth3, etWest1, etWest2, etWest3;
    @NonNull
    String tvResult;

    public Battle() {
    }

    public Battle(@NonNull int etEast1, @NonNull int etEast2, @NonNull int etEast3, @NonNull int etNorth1, @NonNull int etNorth2, @NonNull int etNorth3, @NonNull int etSouth, @NonNull int etSouth2, @NonNull int etSouth3, @NonNull int etWest1, @NonNull int etWest2, @NonNull int etWest3, @Nullable String tvResult) {
        this.etEast1 = etEast1;
        this.etEast2 = etEast2;
        this.etEast3 = etEast3;
        this.etNorth1 = etNorth1;
        this.etNorth2 = etNorth2;
        this.etNorth3 = etNorth3;
        this.etSouth = etSouth;
        this.etSouth2 = etSouth2;
        this.etSouth3 = etSouth3;
        this.etWest1 = etWest1;
        this.etWest2 = etWest2;
        this.etWest3 = etWest3;
        this.tvResult = tvResult;
    }

    @NonNull
    public int getEtEast1() {
        return etEast1;
    }

    public void setEtEast1(@NonNull int etEast1) {
        this.etEast1 = etEast1;
    }

    @NonNull
    public int getEtEast2() {
        return etEast2;
    }

    public void setEtEast2(@NonNull int etEast2) {
        this.etEast2 = etEast2;
    }

    @NonNull
    public int getEtEast3() {
        return etEast3;
    }

    public void setEtEast3(@NonNull int etEast3) {
        this.etEast3 = etEast3;
    }

    @NonNull
    public int getEtNorth1() {
        return etNorth1;
    }

    public void setEtNorth1(@NonNull int etNorth1) {
        this.etNorth1 = etNorth1;
    }

    @NonNull
    public int getEtNorth2() {
        return etNorth2;
    }

    public void setEtNorth2(@NonNull int etNorth2) {
        this.etNorth2 = etNorth2;
    }

    @NonNull
    public int getEtNorth3() {
        return etNorth3;
    }

    public void setEtNorth3(@NonNull int etNorth3) {
        this.etNorth3 = etNorth3;
    }

    @NonNull
    public int getEtSouth() {
        return etSouth;
    }

    public void setEtSouth(@NonNull int etSouth) {
        this.etSouth = etSouth;
    }

    @NonNull
    public int getEtSouth2() {
        return etSouth2;
    }

    public void setEtSouth2(@NonNull int etSouth2) {
        this.etSouth2 = etSouth2;
    }

    @NonNull
    public int getEtSouth3() {
        return etSouth3;
    }

    public void setEtSouth3(@NonNull int etSouth3) {
        this.etSouth3 = etSouth3;
    }

    @NonNull
    public int getEtWest1() {
        return etWest1;
    }

    public void setEtWest1(@NonNull int etWest1) {
        this.etWest1 = etWest1;
    }

    @NonNull
    public int getEtWest2() {
        return etWest2;
    }

    public void setEtWest2(@NonNull int etWest2) {
        this.etWest2 = etWest2;
    }

    @NonNull
    public int getEtWest3() {
        return etWest3;
    }

    public void setEtWest3(@NonNull int etWest3) {
        this.etWest3 = etWest3;
    }

    @NonNull
    public String getTvResult() {
        return tvResult;
    }

    public void setTvResult(@NonNull String tvResult) {
        this.tvResult = tvResult;
    }

    public int getBattleResult(Integer[][] battlePoints){
        try{

        return new BattleUtils().getBattleResult(battlePoints);
        }catch (Exception ex){ex.printStackTrace();}

        return 0;

    }

    public Integer[][] getBattleData(){
        try{
        Integer[][] data = {{getEtEast1(), getEtWest1(), getEtSouth(), getEtNorth1()},
                {getEtEast2(), getEtWest2(), getEtSouth2(), getEtNorth2()},
                {getEtEast3(), getEtWest3(), getEtSouth3(), getEtNorth3()}};
         return data;
        }catch (Exception ex){ex.printStackTrace();}
        return null;
    }


    public boolean validateData(){
        try{
            return !TextUtils.isEmpty(getEtEast1()+"") && !TextUtils.isEmpty(getEtEast2()+"") && !TextUtils.isEmpty(getEtEast3()+"")
                    && !TextUtils.isEmpty(getEtWest1()+"") && !TextUtils.isEmpty(getEtWest2()+"") && !TextUtils.isEmpty(getEtWest3()+"")
                    && !TextUtils.isEmpty(getEtSouth()+"") && !TextUtils.isEmpty(getEtSouth2()+"") && !TextUtils.isEmpty(getEtSouth3()+"")
                    && !TextUtils.isEmpty(getEtNorth1()+"") && !TextUtils.isEmpty(getEtNorth2()+"") && !TextUtils.isEmpty(getEtNorth3()+"");
        }catch (Exception ex){ex.printStackTrace();}
        return false;
    }

/*    public void fillData(){

        Integer[][] data = new InputData().getBattlePoints1();
        setEtEast1(data[0][0]);
        setEtEast2(data[1][0]);
        setEtEast3(data[2][0]);

        setEtWest1(data[0][1]);
        setEtWest2(data[1][1]);
        setEtWest3(data[2][1]);

        setEtSouth(data[0][2]);
        setEtSouth2(data[1][2]);
        setEtSouth3(data[2][2]);

        setEtNorth1(data[0][3]);
        setEtNorth1(data[1][3]);
        setEtNorth1(data[2][3]);

    }*/


}
