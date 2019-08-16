package pojo;

/**
 * 草图
 */
public class Sketch {
    private String buildNo;

    private String pictureNo;

    private int lineNo;

    public Sketch(String buildNo, String pictureNo, int lineNo) {
        this.buildNo = buildNo;
        this.pictureNo = pictureNo;
        this.lineNo = lineNo;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public Sketch() {
    }

    public Sketch(String buildNo, String pictureNo) {
        this.buildNo = buildNo;
        this.pictureNo = pictureNo;
    }

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo == null ? null : buildNo.trim();
    }

    public String getPictureNo() {
        return pictureNo;
    }

    public void setPictureNo(String pictureNo) {
        this.pictureNo = pictureNo == null ? null : pictureNo.trim();
    }
}