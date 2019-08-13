package pojo;

import java.math.BigDecimal;

/**
 * 祠堂基本信息
 */
public class VillasMessage {
    private String buildNo;

    private String buildName;

    private String address;

    private String beginTime;

    private String finishTime;

    private Integer dataSaving;

    private Integer useState;

    private String user;

    private String owner;

    private String custodian;

    private BigDecimal allArea;

    private BigDecimal allDeep;

    private Integer type;

    private Integer road;

    private Integer jin;

    private String bearingSit;

    private String bearingTo;

    private Integer decoratePicture;

    private Integer roomTop;

    private Integer structure;

    private Integer wallMaterial;

    private Integer floorMaterial;

    private Integer stairMaterial;

    private Integer beamMaterial;

    private Integer groundMaterial;

    private Integer intactDegree;

    private Integer surroundings;

    private Integer surProDegree;

    private Integer buildIns;

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo == null ? null : buildNo.trim();
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName == null ? null : buildName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
    }

    public Integer getDataSaving() {
        return dataSaving;
    }

    public void setDataSaving(Integer dataSaving) {
        this.dataSaving = dataSaving;
    }

    public Integer getUseState() {
        return useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian == null ? null : custodian.trim();
    }

    public BigDecimal getAllArea() {
        return allArea;
    }

    public void setAllArea(BigDecimal allArea) {
        this.allArea = allArea;
    }

    public BigDecimal getAllDeep() {
        return allDeep;
    }

    public void setAllDeep(BigDecimal allDeep) {
        this.allDeep = allDeep;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRoad() {
        return road;
    }

    public void setRoad(Integer road) {
        this.road = road;
    }

    public Integer getJin() {
        return jin;
    }

    public void setJin(Integer jin) {
        this.jin = jin;
    }

    public String getBearingSit() {
        return bearingSit;
    }

    public void setBearingSit(String bearingSit) {
        this.bearingSit = bearingSit == null ? null : bearingSit.trim();
    }

    public String getBearingTo() {
        return bearingTo;
    }

    public void setBearingTo(String bearingTo) {
        this.bearingTo = bearingTo == null ? null : bearingTo.trim();
    }

    public Integer getDecoratePicture() {
        return decoratePicture;
    }

    public void setDecoratePicture(Integer decoratePicture) {
        this.decoratePicture = decoratePicture;
    }

    public Integer getRoomTop() {
        return roomTop;
    }

    public void setRoomTop(Integer roomTop) {
        this.roomTop = roomTop;
    }

    public Integer getStructure() {
        return structure;
    }

    public void setStructure(Integer structure) {
        this.structure = structure;
    }

    public Integer getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(Integer wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public Integer getFloorMaterial() {
        return floorMaterial;
    }

    public void setFloorMaterial(Integer floorMaterial) {
        this.floorMaterial = floorMaterial;
    }

    public Integer getStairMaterial() {
        return stairMaterial;
    }

    public void setStairMaterial(Integer stairMaterial) {
        this.stairMaterial = stairMaterial;
    }

    public Integer getBeamMaterial() {
        return beamMaterial;
    }

    public void setBeamMaterial(Integer beamMaterial) {
        this.beamMaterial = beamMaterial;
    }

    public Integer getGroundMaterial() {
        return groundMaterial;
    }

    public void setGroundMaterial(Integer groundMaterial) {
        this.groundMaterial = groundMaterial;
    }

    public Integer getIntactDegree() {
        return intactDegree;
    }

    public void setIntactDegree(Integer intactDegree) {
        this.intactDegree = intactDegree;
    }

    public Integer getSurroundings() {
        return surroundings;
    }

    public void setSurroundings(Integer surroundings) {
        this.surroundings = surroundings;
    }

    public Integer getSurProDegree() {
        return surProDegree;
    }

    public void setSurProDegree(Integer surProDegree) {
        this.surProDegree = surProDegree;
    }

    public Integer getBuildIns() {
        return buildIns;
    }

    public void setBuildIns(Integer buildIns) {
        this.buildIns = buildIns;
    }
}