package org.example;

public class Main {
    public static void main(String[] args) {
        계산기 계산기 = new 계산기(3, 10);
        System.out.println(계산기.합산());
    }
}

class 계산기{
    계산기(){}
    계산기(int a, int b){
        this.a = a;
        this.b = b;
    }
    int a;
    int b;
    int 곱(){
        return this.a * this.b;
    }
    int 덧(){
        return this.a + this.b;
    }
    int 뺄(){
        return this.a - this.b;
    }
    int 나(){
        return this.a / this.b;
    }
    int 남(){
        return this.a % this.b;
    }
    int 합산(){
        int val = 0;
        for(int i = this.a; i <= this.b; i++)
            val += i;
        return val;
    }
}