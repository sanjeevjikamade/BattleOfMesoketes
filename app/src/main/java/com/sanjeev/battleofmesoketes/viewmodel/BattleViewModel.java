package com.sanjeev.battleofmesoketes.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.sanjeev.battleofmesoketes.Interface.BattleResultCallback;
import com.sanjeev.battleofmesoketes.model.Battle;
import com.sanjeev.battleofmesoketes.utils.BattleUtils;


public class BattleViewModel extends ViewModel {

    BattleResultCallback battleResultCallback;
    Battle battle;

    public BattleViewModel(BattleResultCallback battleResultCallback) {
        this.battleResultCallback = battleResultCallback;
        this.battle = new Battle();
    }

    public TextWatcher getEtEast1TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtEast1(s.toString());
            }
        };
    }
    public TextWatcher getEtEast2TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtEast2(s.toString());
            }
        };
    }
    public TextWatcher getEtEast3TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtEast3(s.toString());
            }
        };
    }

    public TextWatcher getEtWest1TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtWest1(s.toString());
            }
        };
    }
    public TextWatcher getEtWest2TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtWest2(s.toString());
            }
        };
    }
    public TextWatcher getEtWest3TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtWest3(s.toString());
            }
        };
    }

    public TextWatcher getEtNorth1TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtNorth1(s.toString());
            }
        };
    }
    public TextWatcher getEtNorth2TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtNorth2(s.toString());
            }
        };
    }
    public TextWatcher getEtNorth3TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtNorth3(s.toString());
            }
        };
    }

    public TextWatcher getEtSouth1TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtSouth(s.toString());
            }
        };
    }
    public TextWatcher getEtSouth2TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtSouth2(s.toString());
            }
        };
    }
    public TextWatcher getEtSouth3TextWatcher(){

        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                battle.setEtSouth3(s.toString());
            }
        };
    }

    public void onResultClicked() {
        Integer[][] battlePoints = {{3, 4, 0, 2},
                {3, 2, 4, 0},
                {2, 0, 5, 3}};

        int test = battle.getBattleResult(battlePoints);
        battle.setTvResult(battle.getBattleResult(battlePoints)+"");
    }


}
