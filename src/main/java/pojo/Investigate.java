package pojo;

/**
 * 调查
 */
public class Investigate {
    private String buildNo;

    private String time;

    private String invMan;

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo == null ? null : buildNo.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getInvMan() {
        return invMan;
    }

    public void setInvMan(String invMan) {
        this.invMan = invMan == null ? null : invMan.trim();
    }
}