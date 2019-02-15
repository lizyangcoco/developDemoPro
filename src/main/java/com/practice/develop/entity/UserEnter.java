package com.practice.develop.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 李泽阳 on 2019/2/15
 */
@Entity
@Table(name = "user_table")
@NoArgsConstructor
@Getter
@Setter
public class UserEnter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    /*登陆账户*/
    @Column(name = "user_name",columnDefinition = "varchar(100)")
    private String userName;

    /*用户密码*/
    @Column(name = "pass_word",columnDefinition = "varchar(100)")
    private String passWord;

    /*登陆姓名*/
    @Column(name = "real_name",columnDefinition = "varchar(100)")
    private String realName;

    /*选票类型*/
    @Column(name = "vote_type",columnDefinition = "varchar(10)")
    private String voteType;

    /*角色*/
    @Column(name = "role",columnDefinition = "varchar(20)")
    private String role;

    /*所属部门*/
    @Column(name = "department",columnDefinition = "varchar(100)")
    private String department;

    /*个人邮件*/
    @Column(name = "email",columnDefinition = "varchar(100)")
    private String email;

    /*个人电话*/
    @Column(name = "phone_num",columnDefinition = "varchar(100)")
    private String phoneNum;

    /*创建时间*/
    @Column(name = "create_time",columnDefinition = "date")
    private Date createTime;

    /*更新时间*/
    @Column(name = "update_time",columnDefinition = "date")
    private Date update_time;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(String voteType) {
        this.voteType = voteType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
