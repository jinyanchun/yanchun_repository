package cn.oa.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Data;

import cn.oa.mapper.RightsMapper;
import cn.oa.pojo.Rights;

@Service
public class RightsService {
	@Autowired
	private RightsMapper rightMapper;
	
	public void addRights(Rights rights) {
		rights.setCreateTime(new Date());
		rights.setUpdateTime(new Date());
		this.rightMapper.addRights(rights);
	}
}
