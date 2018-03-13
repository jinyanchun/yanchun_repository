package cn.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.oa.pojo.EasyuiResult;
import cn.oa.pojo.Role;
import cn.oa.service.RoleService;

@Controller
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(method={RequestMethod.POST})
	public ResponseEntity<Void> roleAdd(Role role){
		try {
			this.roleService.roleAdd(role);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	/**
	 * 角色分页查询
	 * @param pageNumber
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(method={RequestMethod.GET})
	public ResponseEntity<EasyuiResult> queryAllRole(
			@RequestParam(value="page",defaultValue="1")Integer pageNumber,
			@RequestParam(value="rows",defaultValue="10")Integer pageSize){
		try {
			EasyuiResult result = this.roleService.queryAll(pageNumber,pageSize);
			return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
}
