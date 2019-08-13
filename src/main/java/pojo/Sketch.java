package pojo;

/**
 * 草图
 */
public class Sketch {
    private String buildNo;

    private String pictureNo;

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