package cn.oa.pojo;

public class CommonParameter {
	private Integer page;
	private Integer rows;
	private Integer current;
	
	
	public CommonParameter(Integer page, Integer rows) {
		super();
		this.page = page;
		this.rows = rows;
	}
	
	public CommonParameter() {
		super();
	}

	public Integer getCurrent() {
		current =(page-1)*rows;
		return current;
	}
	public void setCurrent(Integer current) {
		this.current = current;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "CommonParameter [page=" + page + ", rows=" + rows + ", current=" + current + "]";
	}
	
}
