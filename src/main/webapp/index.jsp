<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OA后台管理系统</title>
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
<body class="easyui-layout">
	<div id="rightsAddWindow" class="easyui-window" title="新增权限"
		data-options="modal:true,closed:true,iconCls:'icon-save',href:'/rest/page/account-edit'"
		style="width: 50%; height: 80%; padding: 10px;"></div>
	<div data-options="region:'north',border:false"
		style="height: 60px; background: #B3DFDA; padding: 10px">
		<h1 align="center">OA后台管理系统</h1>
	</div>
	<div data-options="region:'west',split:true" title="菜单"
		style="width: 200px;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="系统管理" style="padding: 10px;" data-options="selected:true">
				<ul id="menu" class="easyui-tree"
					style="margin-top: 10px; margin-left: 5px;">
					<li><span>用户管理</span>
						<ul>
							<li data-options="iconCls:'icon-add',attributes:{'url':'/rest/page/account-addd'}" >新增用户</li>
							<li data-options="iconCls:'icon-search',attributes:{'url':'/rest/page/account-list'}">查询用户</li>
						</ul></li>
					<li><span>权限管理</span>
						<ul>
							<li data-options="iconCls:'icon-add',attributes:{'url':'/rest/page/rights-add'}">新增权限</li>
							<li data-options="iconCls:'icon-search',attributes:{'url':'/rest/page/rights-list'}">所有权限</li>
						</ul></li>
					<li><span>角色管理</span>
						<ul>
							<li data-options="iconCls:'icon-add',attributes:{'url':'/rest/page/role-add'}">新增角色</li>
							<li data-options="iconCls:'icon-search',attributes:{'url':'/rest/page/role-list'}">所有角色</li>
						</ul></li>
				</ul>
			</div>
			<div title="Title2" data-options="selected:true"
				style="padding: 10px;">content2</div>
			<div title="Title3" style="padding: 10px">content3</div>
		</div>
	</div>
	<div
		data-options="region:'east',split:true,collapsed:true,title:'East'"
		style="width: 100px; padding: 10px;">east region</div>
	<div data-options="region:'south',border:false"
		style="height: 50px; background: #A9FACD; padding: 10px;">south
		region</div>
	<div id="tabs" class="easyui-tabs"
		data-options="region:'center',title:'Center'"
		style="width: 100%; height: 100%"></div>
</body>
<script type="text/javascript">
	$(function() {
		//为树的每个节点绑定点击事件
		$('#menu').tree({
			// node是点击的节点对象
			onClick : function(node) {
				//判断点击的节点是否是叶子节点
				if ($('#menu').tree("isLeaf", node.target)) {
					var tabs = $("#tabs");
					//判断当前节点是否已经被打开过
					var tab = tabs.tabs("getTab", node.text);
					if (tab) {
						//如果已经打开，选中它
						tabs.tabs("select", node.text);
					} else {
						//没有打开，重新打开一个页面
						tabs.tabs('add', {
							title : node.text,
							href : node.attributes.url,
							closable : true,
							bodyCls : "content"
						});
					}
				}
			}
		});
	});
	function rightsAdd() {
		$("#rightsAddWindow").window({
			onLoad : function() {
				$("#accountEditForm").form("load","/rest/page/account-edit");
			}
		}).window("open");
	}
</script>
</html>