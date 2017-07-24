package domain.enums;

import pers.posse.tool.utils.enums.DbEnum;

/**
 * Created by posse on 17-7-24.
 */
public enum Duty implements DbEnum {
    STUDENT(0, "student"),
    MONITOR(1, "monitor"),
    VICE_MONITOR(2, "vice.monitor"),
    LEAGUE_SECRETARY(3, "league.secretary");

    private Integer dbConstant;
    private String messageKey;

    Duty(Integer dbConstant, String messageKey) {
        this.dbConstant = dbConstant;
        this.messageKey = messageKey;
    }

    public int getDbConstant() {
        return dbConstant;
    }

    public void setDbConstant(int dbConstant) {
        this.dbConstant = dbConstant;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }
}
