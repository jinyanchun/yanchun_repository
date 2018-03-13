package cn.oa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.oa.mapper.RoleMapper;
import cn.oa.pojo.CommonParameter;
import cn.oa.pojo.EasyuiResult;
import cn.oa.pojo.Role;

@Service
public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	public void roleAdd(Role role) {
		role.setCreateTime(new Date());
		role.setUpdateTime(new Date());
		this.roleMapper.roleAdd(role);
	}

	public EasyuiResult queryAll(Integer pageNumber, Integer pageSize) {
		CommonParameter common = new CommonParameter(pageNumber,pageSize);
		List<Role> rows = this.roleMapper.queryAll(common);
		EasyuiResult result = new EasyuiResult();
		result.setRows(rows);
		return result;
	}

}
