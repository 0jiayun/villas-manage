package pojo;

/**
 * 照片
 */
public class Photo {
    private String buildNo;

    private String photoNo;

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo == null ? null : buildNo.trim();
    }

    public String getPhotoNo() {
        return photoNo;
    }

    public void setPhotoNo(String photoNo) {
        this.photoNo = photoNo == null ? null : photoNo.trim();
    }
}