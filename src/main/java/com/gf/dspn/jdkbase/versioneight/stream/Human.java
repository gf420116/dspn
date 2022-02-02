package com.gf.dspn.jdkbase.versioneight.stream;

/**
 * bean实体.
 *
 * @author : doublej
 * @Date : 2021-12-17 15:43
 */

public class Human {

    private String account;
    private String name;
    private Integer salry;

    Human(String account, String name, Integer salry) {
        this.account = account;
        this.name = name;
        this.salry = salry;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalry() {
        return salry;
    }

    public void setSalry(Integer salry) {
        this.salry = salry;
    }
}
