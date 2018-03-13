package cn.oa.mapper;

import java.util.List;

import cn.oa.pojo.CommonParameter;
import cn.oa.pojo.Role;

public interface RoleMapper {

	void roleAdd(Role role);

	List<Role> queryAll(CommonParameter common);

}
