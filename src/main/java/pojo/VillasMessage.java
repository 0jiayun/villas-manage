package pojo;

import java.math.BigDecimal;

public class VillasMessage {
    private String buildNo;

    private String buildName;

    private String protectGrade;

    private String address;

    private String beginTime;//页面查询当成建造时间

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

    private Integer pillarMaterial;

    private Integer groundMaterial;

    private Integer intactDegree;

    private Integer surroundings;

    private Integer surProDegree;

    private Integer buildIns;

    private String insertTime;

    private String updateTime;

    //以下两个属性用于分页，不需要写入数据库
    private Integer start;

    private Integer number;

    public VillasMessage(String buildNo, String buildName, String protectGrade, String address, String beginTime, String finishTime, Integer dataSaving, Integer useState, String user, String owner, String custodian, BigDecimal allArea, BigDecimal allDeep, Integer type, Integer road, Integer jin, String bearingSit, String bearingTo, Integer decoratePicture, Integer roomTop, Integer structure, Integer wallMaterial, Integer floorMaterial, Integer stairMaterial, Integer beamMaterial, Integer pillarMaterial, Integer groundMaterial, Integer intactDegree, Integer surroundings, Integer surProDegree, Integer buildIns, String insertTime, String updateTime) {
        this.buildNo = buildNo;
        this.buildName = buildName;
        this.protectGrade = protectGrade;
        this.address = address;
        this.beginTime = beginTime;
        this.finishTime = finishTime;
        this.dataSaving = dataSaving;
        this.useState = useState;
        this.user = user;
        this.owner = owner;
        this.custodian = custodian;
        this.allArea = allArea;
        this.allDeep = allDeep;
        this.type = type;
        this.road = road;
        this.jin = jin;
        this.bearingSit = bearingSit;
        this.bearingTo = bearingTo;
        this.decoratePicture = decoratePicture;
        this.roomTop = roomTop;
        this.structure = structure;
        this.wallMaterial = wallMaterial;
        this.floorMaterial = floorMaterial;
        this.stairMaterial = stairMaterial;
        this.beamMaterial = beamMaterial;
        this.pillarMaterial = pillarMaterial;
        this.groundMaterial = groundMaterial;
        this.intactDegree = intactDegree;
        this.surroundings = surroundings;
        this.surProDegree = surProDegree;
        this.buildIns = buildIns;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
    }

    public String getProtectGrade() {
        return protectGrade;
    }

    public void setProtectGrade(String protectGrade) {
        this.protectGrade = protectGrade;
    }

    public Integer getPillarMaterial() {
        return pillarMaterial;
    }

    public void setPillarMaterial(Integer pillarMaterial) {
        this.pillarMaterial = pillarMaterial;
    }

    public Integer getStart() {
        return start;
    }

    public VillasMessage() {
    }

    public VillasMessage(String buildNo, String buildName, String address, String beginTime, String finishTime, Integer dataSaving, Integer useState, String user, String owner, String custodian, BigDecimal allArea, BigDecimal allDeep, Integer type, Integer road, Integer jin, String bearingSit, String bearingTo, Integer decoratePicture, Integer roomTop, Integer structure, Integer wallMaterial, Integer floorMaterial, Integer stairMaterial, Integer beamMaterial, Integer groundMaterial, Integer intactDegree, Integer surroundings, Integer surProDegree, Integer buildIns, String insertTime, String updateTime) {
        this.buildNo = buildNo;
        this.buildName = buildName;
        this.address = address;
        this.beginTime = beginTime;
        this.finishTime = finishTime;
        this.dataSaving = dataSaving;
        this.useState = useState;
        this.user = user;
        this.owner = owner;
        this.custodian = custodian;
        this.allArea = allArea;
        this.allDeep = allDeep;
        this.type = type;
        this.road = road;
        this.jin = jin;
        this.bearingSit = bearingSit;
        this.bearingTo = bearingTo;
        this.decoratePicture = decoratePicture;
        this.roomTop = roomTop;
        this.structure = structure;
        this.wallMaterial = wallMaterial;
        this.floorMaterial = floorMaterial;
        this.stairMaterial = stairMaterial;
        this.beamMaterial = beamMaterial;
        this.groundMaterial = groundMaterial;
        this.intactDegree = intactDegree;
        this.surroundings = surroundings;
        this.surProDegree = surProDegree;
        this.buildIns = buildIns;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
    }

    public VillasMessage(Integer start, Integer number) {
        this.start = start;
        this.number = number;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

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

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime == null ? null : insertTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}