package com.demo.retrofit;

import rx.Observable;


public class RetrofitTest {
    public static void main(String args[]) {
        Observable.just("mcdull", "may")
                .subscribe(response -> {
                    System.out.println(response);
                },
                        throwable -> {
                            System.out.println("error");
                        });
    }
}
