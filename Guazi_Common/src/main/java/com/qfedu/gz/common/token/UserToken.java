package com.qfedu.gz.common.token;

/**
 * 描述:
 * 用户令牌
 *
 * @author szp
 * @create 2018-10-24 14:49
 */
public class UserToken {
    private long time;
    private Object user;
    private Integer randomnum;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public Integer getRandomnum() {
        return randomnum;
    }

    public void setRandomnum(Integer randomnum) {
        this.randomnum = randomnum;
    }

    public UserToken() {
    }

    public UserToken(long time, Object user, Integer randomnum) {
        this.time = time;
        this.user = user;
        this.randomnum = randomnum;
    }
}
