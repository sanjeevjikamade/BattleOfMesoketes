package com.sanjeev.battleofmesoketes.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.sanjeev.battleofmesoketes.Data.InputData;
import com.sanjeev.battleofmesoketes.Interface.BattleResultCallback;
import com.sanjeev.battleofmesoketes.model.Battle;
import com.sanjeev.battleofmesoketes.utils.BattleUtils;

/**
 * author::Sanjeev Jikamade
 */
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
                try{
                battle.setEtEast1(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtEast2(Integer.parseInt(s.toString()));
            }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtEast3(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try {
                    battle.setEtWest1(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtWest2(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtWest3(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtNorth1(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtNorth2(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try {
                    battle.setEtNorth3(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtSouth(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtSouth2(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
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
                try{
                battle.setEtSouth3(Integer.parseInt(s.toString()));
                }catch (Exception ex){ex.printStackTrace();}
            }
        };
    }

  /*  public void onFillDataClicked() {
        try {
            battle.fillData();
        }catch (Exception ex){ex.printStackTrace();}

    }*/


    public void onResultClicked() {
        try {
       /* CASE1::{{3, 4, 0, 2},
                {3, 2, 4, 0},
                {2, 0, 5, 3}};*/


        int testResult = battle.getBattleResult(battle.getBattleData());
        battle.setResult(testResult+"");
        battleResultCallback.onSuccess(testResult);

        }catch (Exception ex){ex.printStackTrace();}

    }


}
