package com.jetbrains;

public class teger {
    int i;
    public teger(int val) {this.i = val;};
    public static teger plus(teger a, teger b) {
        a = new teger(a.i + b.i );
        return a;
    }
}
