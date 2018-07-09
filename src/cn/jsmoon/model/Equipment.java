package cn.jsmoon.model;

public class Equipment {
	
	private Integer id; //设备ID
	
	private String name;	//设备名称
	
	private String no;	//设备编号
	
	private Integer typeId;	//设备类型ID
	
	private Integer state;	//设备状态 1正常，2维修，3报废
	
	private String remark;	//备注
	
	private String typeName;	//设备类型名字

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
