package cn.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.oa.pojo.Rights;
import cn.oa.service.RightsService;

@Controller
@RequestMapping(value="rights")
public class RightsController {
	@Autowired
	private RightsService rightsService;
	
	@RequestMapping(method={RequestMethod.GET})
	public ResponseEntity<Void> queryRightsByPid(@RequestParam(value="pid",defaultValue="0")Integer parentId){
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	/**
	 * 权限新增方法
	 * @param right
	 * @return
	 */
	@RequestMapping(method={RequestMethod.POST})
	public ResponseEntity<Void> addRights(Rights rights){
		try {
			this.rightsService.addRights(rights);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
}
