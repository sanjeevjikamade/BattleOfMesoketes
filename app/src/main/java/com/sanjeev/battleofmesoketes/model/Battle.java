package com.sanjeev.battleofmesoketes.model;

import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sanjeev.battleofmesoketes.utils.BattleUtils;

public class Battle {

    @NonNull
    Button btnResult;

    @NonNull
    String etEast1, etEast2, etEast3, etNorth1, etNorth2, etNorth3, etSouth, etSouth2, etSouth3, etWest1, etWest2, etWest3;
    @NonNull
    String tvResult;

    public Battle() {
    }

    public Battle(@NonNull String etEast1, @NonNull String etEast2, @NonNull String etEast3, @NonNull String etNorth1, @NonNull String etNorth2, @NonNull String etNorth3, @NonNull String etSouth, @NonNull String etSouth2, @NonNull String etSouth3, @NonNull String etWest1, @NonNull String etWest2, @NonNull String etWest3, @Nullable String tvResult) {
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
    public String getEtEast1() {
        return etEast1;
    }

    public void setEtEast1(@NonNull String etEast1) {
        this.etEast1 = etEast1;
    }

    @NonNull
    public String getEtEast2() {
        return etEast2;
    }

    public void setEtEast2(@NonNull String etEast2) {
        this.etEast2 = etEast2;
    }

    @NonNull
    public String getEtEast3() {
        return etEast3;
    }

    public void setEtEast3(@NonNull String etEast3) {
        this.etEast3 = etEast3;
    }

    @NonNull
    public String getEtNorth1() {
        return etNorth1;
    }

    public void setEtNorth1(@NonNull String etNorth1) {
        this.etNorth1 = etNorth1;
    }

    @NonNull
    public String getEtNorth2() {
        return etNorth2;
    }

    public void setEtNorth2(@NonNull String etNorth2) {
        this.etNorth2 = etNorth2;
    }

    @NonNull
    public String getEtNorth3() {
        return etNorth3;
    }

    public void setEtNorth3(@NonNull String etNorth3) {
        this.etNorth3 = etNorth3;
    }

    @NonNull
    public String getEtSouth() {
        return etSouth;
    }

    public void setEtSouth(@NonNull String etSouth) {
        this.etSouth = etSouth;
    }

    @NonNull
    public String getEtSouth2() {
        return etSouth2;
    }

    public void setEtSouth2(@NonNull String etSouth2) {
        this.etSouth2 = etSouth2;
    }

    @NonNull
    public String getEtSouth3() {
        return etSouth3;
    }

    public void setEtSouth3(@NonNull String etSouth3) {
        this.etSouth3 = etSouth3;
    }

    @NonNull
    public String getEtWest1() {
        return etWest1;
    }

    public void setEtWest1(@NonNull String etWest1) {
        this.etWest1 = etWest1;
    }

    @NonNull
    public String getEtWest2() {
        return etWest2;
    }

    public void setEtWest2(@NonNull String etWest2) {
        this.etWest2 = etWest2;
    }

    @NonNull
    public String getEtWest3() {
        return etWest3;
    }

    public void setEtWest3(@NonNull String etWest3) {
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

        return new BattleUtils().getBattleResult(battlePoints);

    }
}
