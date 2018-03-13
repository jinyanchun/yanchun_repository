<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic DataGrid - jQuery EasyUI Demo</title>
<link rel="stylesheet" type="text/css"
	href="./js/jquery-easyui-1.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="./js/jquery-easyui-1.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="./js/jquery-easyui-1.5.1/demo/demo.css">
<script type="text/javascript"
	src="./js/jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="./js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
</head>
<body>
	<div style="padding: 5px 0;">
		<a href="#" onclick="add()" class="easyui-linkbutton"
			data-options="iconCls:'icon-add'">新增</a> <a href="#"
			onclick="remove()" class="easyui-linkbutton"
			data-options="iconCls:'icon-remove'">删除</a> <a href="#"
			onclick="edit()" class="easyui-linkbutton"
			data-options="iconCls:'icon-edit'">修改</a>
	</div>
	<table id="dg" title="角色查询" style="width: 100%; height: 100%"
		data-options="rownumbers:true,singleSelect:false,pagination:true,url:'rest/role',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'roleId',width:50">角色ID</th>
				<th data-options="field:'roleName',width:100">角色名称</th>
				<th data-options="field:'status',width:80,align:'center'" formatter="formatStatus">状态</th>
				<th data-options="field:'pid',width:100,align:'center'" formatter="formatPid">上级角色</th>
				<th data-options="field:'createTime',width:120,align:'center'" formatter="formatDate">创建时间</th>
				<th data-options="field:'updateTime',width:120,align:'center'" formatter="formatDate">最后更新时间</th>
			</tr>
		</thead>
	</table>
	<div id="itemEditWindow" class="easyui-window" title="编辑角色信息"
		data-options="modal:true,closed:true,iconCls:'icon-save',href:'/rest/page/account-edit'"
		style="width: 50%; height: 80%; padding: 10px;"></div>
	<script type="text/javascript">
	//时间格式化
	Date.prototype.format = function(format){ 
	    var o =  { 
	    "M+" : this.getMonth()+1, //month 
	    "d+" : this.getDate(), //day 
	    "h+" : this.getHours(), //hour 
	    "m+" : this.getMinutes(), //minute 
	    "s+" : this.getSeconds(), //second 
	    "q+" : Math.floor((this.getMonth()+3)/3), //quarter 
	    "S" : this.getMilliseconds() //millisecond 
	    };
	    if(/(y+)/.test(format)){ 
	    	format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	    }
	    for(var k in o)  { 
		    if(new RegExp("("+ k +")").test(format)){ 
		    	format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length)); 
		    } 
	    } 
	    return format; 
	};
	function formatPid(value,row){
		return "超级管理员";
	}
	//格式化时间
	function formatDate(value,row){
		var now = new Date(value);
    	return now.format("yyyy-MM-dd hh:mm:ss");
	}
	//状态(0正常，1锁定)
	function formatStatus(value,row){
		var Status = "";
		if(value == 0){
			Status = "正常";
		}else if(value == 1){
			Status = "锁定";
		}else{
			Status ="未填写";
		}
		return Status;
	}
		//新增事件调用
		function add() {
			// 去上级目录中找新增用户按钮
			$(".tree-title:contains('新增角色')").parent().click();
		}
		//修改事件调用
		function edit() {
			var ids = getSelectionsIds();
			if (ids.length == 0) {
				$.messager.alert('提示', '必须选择一个角色才能编辑!');
				return;
			}
			if (ids.indexOf(',') > 0) {
				$.messager.alert('提示', '只能选择一个角色!');
				return;
			}
			
			$("#itemEditWindow").window({
				onLoad :function(){
					$("#accountEditForm").form("load","/rest/role/getAccount?id="+ids);
				}
			}).window("open");
		}
		// 刷新表格
		function reflush(){
			//刷新页面
			$("#dg").datagrid("reload");
		}
		// 删除事件调用
		function remove() {
			var ids = getSelectionsIds();
			if (ids.length == 0) {
				$.messager.alert('提示', '未选择角色！');
				return;
			}
			$.messager.confirm('确认', '确定删除ID为 ' + ids + ' 的角色所有信息吗？', function(
					r) {
				if (r) {
					$.ajax({
						type : "POST",
						url : "/rest/role/delete",
						data : {
							"ids" : ids,
							"_method" : "DELETE"
						},
						statusCode : {
							200 : function() {
								$("#dg").datagrid("reload");
								$.messager.alert('提示', '删除角色成功!!');
							},
							500 : function() {
								$.messager.alert('提示', '删除角色失败!');
							}
						}
					});
				}
			});
		}
		$(function() {
			var pager = $('#dg').datagrid().datagrid('getPager');
		})

		//获取选中的ID长度
		function getSelectionsIds() {
			var accountList = $("#dg");
			var sels = accountList.datagrid("getSelections");
			var ids = [];
			for ( var i in sels) {
				ids.push(sels[i].accountId);
			}
			ids = ids.join(",");
			return ids;
		}
	</script>
</body>
</html>