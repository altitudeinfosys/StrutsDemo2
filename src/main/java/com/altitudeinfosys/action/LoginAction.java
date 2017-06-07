package com.altitudeinfosys.action;

/**
 * Created by tarek on 2/15/2017.
 */

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements Action {

    @Override
    public String execute() throws Exception {
        if("tareka".equals(getName()) && "tareka".equals(getPwd()))
            return SUCCESS;
        else return ERROR;
    }

    //Java Bean to hold the form parameters
    private String name;
    private String pwd;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void validate()
    {
        if (name == null || name.trim().equals(""))
        {
            addFieldError("name","Name is required");
        }
        if (pwd == null || pwd.trim().equals(""))
        {
            addFieldError("pwd","Password is required");
        }
    }

}