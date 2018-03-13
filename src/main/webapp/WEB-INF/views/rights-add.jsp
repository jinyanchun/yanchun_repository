<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Load Form Data - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="./js/jquery-easyui-1.5.1/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="./js/jquery-easyui-1.5.1/themes/icon.css">
	<script type="text/javascript" src="./js/jquery-easyui-1.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="./js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
</head>
<body>
	<div class="easyui-panel" style="width:400px">
		<div style="padding:10px 60px 20px 60px">
	    <form id="rightAddForm" method="post" >
	    	<table cellpadding="5">
	    		<tr>
	    			<td>权限名称:</td>
	    			<td><input class="easyui-textbox" type="text" name="rightName" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>权限地址:</td>
	    			<td><input class="easyui-textbox" type="text" name="rightSite" data-options="required:true,validType:'email'"></input></td>
	    		</tr>
	    		<tr>
	    			<td>权限类型:</td>
	    			<td>
		    			<select id="typeId" name="type" style="width: 100px">
			    			<option value="0">菜单</option>
			    			<option value="1">按钮</option>
		    			</select>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>上级权限:</td>
		            <td>
	            		<ul id="functionTree" class="ztree"></ul>
		    		</td>
	    		</tr>
	    		<tr>
		            <td>是否锁定:</td>
		            <td>
			    		<input type="radio" name="islock" value="1">是
			    		<input type="radio" name="islock" value="0">否
		    		</td>
	        	</tr>
	    	</table>
	    </form>
	    </div>
	</div>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
	<script>
	
	$(function(){
		// 授权树初始化
		var setting = {
			data : {
				key : {
					title : "t"
				},
				simpleData : {
					enable : true
				}
			},
			check : {
				enable : true,
			}
		};
		
		$.ajax({
			url : '${pageContext.request.contextPath}/json/menu.json',
			type : 'POST',
			dataType : 'text',
			success : function(data) {
				var zNodes = eval("(" + data + ")");
				$.fn.zTree.init($("#functionTree"), setting, zNodes);
			},
			error : function(msg) {
				alert('树加载异常!');
			}
		});
		
		// 点击保存
		$('#save').click(function(){
			location.href='${pageContext.request.contextPath}/page_admin_privilege.action';
		});
	});
// 	++++++++++++++++++++++++++++++
// 	++++++++++++++++++++++++++++++
// 	++++++++++++++++++++++++++++++
// 	++++++++++++++++++++++++++++++
function submitForm(){
		
		//  提交到后台的RESTful
		$.ajax({
		   type: "POST",
		   url: "/rest/right",
		   data: $("#rightAddForm").serialize(),
		   statusCode : {
			   201 : function(){
				   $.messager.alert('提示','新增权限成功!');
			   },
			   400 : function(){
				   $.messager.alert('提示','参数有误!');
			   },
			   500 : function(){
				   $.messager.alert('提示','新增权限失败!');
			   }
		   }
		});
	}
	
	function clearForm(){
		$('#rightAddForm').form('reset');
	}
	</script>
</body>
</html>