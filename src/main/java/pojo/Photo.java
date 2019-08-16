package pojo;

/**
 * 照片
 */
public class Photo {
    private String buildNo;

    private String photoNo;

    private int lineNo;

    public Photo(String buildNo, String photoNo, int lineNo) {
        this.buildNo = buildNo;
        this.photoNo = photoNo;
        this.lineNo = lineNo;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public Photo() {
    }

    public String getBuildNo() {
        return buildNo;
    }

    public Photo(String buildNo, String photoNo) {
        this.buildNo = buildNo;
        this.photoNo = photoNo;
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