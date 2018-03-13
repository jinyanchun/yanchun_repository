<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Load Form Data - jQuery EasyUI Demo</title>
<link rel="stylesheet" type="text/css"
	href="./js/jquery-easyui-1.5.1/demo/demo.css">
<link rel="stylesheet" type="text/css"
	href="./js/jquery-easyui-1.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="./js/jquery-easyui-1.5.1/themes/icon.css">
<script type="text/javascript"
	src="./js/jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="./js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
</head>
<body>
	<div class="easyui-panel" style="width: 400px">
		<div style="padding: 10px 60px 20px 60px">
			<form id="roleAddForm" method="post">
				<table cellpadding="5">
					<tr>
						<td>角色名称:</td>
						<td><input class="easyui-textbox" type="text"
							name="accountName" data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>状态:</td>
						<td><select id="statusId" name="status"
							style="width: 100px">
								<option value="0">正常</option>
								<option value="1">锁定</option>
						</select></td>
					</tr>
					<tr>
						<td>上级角色:</td>
						<td>
							<div class="easyui-panel" style="padding: 5px">
								<ul class="easyui-tree" data-options="url:'rest/rights',method:'get',loadFilter:myLoadFilter"></ul>
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div style="padding: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			onclick="submitForm()">提交</a> <a href="javascript:void(0)"
			class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
	<script>
		function myLoadFilter(data, parent) {
			var state = $.data(this, 'tree');

			function setData() {
				var serno = 1;
				var todo = [];
				for (var i = 0; i < data.length; i++) {
					todo.push(data[i]);
				}
				while (todo.length) {
					var node = todo.shift();
					if (node.id == undefined) {
						node.id = '_node_' + (serno++);
					}
					if (node.children) {
						node.state = 'closed';
						node.children1 = node.children;
						node.children = undefined;
						todo = todo.concat(node.children1);
					}
				}
				state.tdata = data;
			}
			function find(id) {
				var data = state.tdata;
				var cc = [ data ];
				while (cc.length) {
					var c = cc.shift();
					for (var i = 0; i < c.length; i++) {
						var node = c[i];
						if (node.id == id) {
							return node;
						} else if (node.children1) {
							cc.push(node.children1);
						}
					}
				}
				return null;
			}

			setData();

			var t = $(this);
			var opts = t.tree('options');
			opts.onBeforeExpand = function(node) {
				var n = find(node.id);
				if (n.children && n.children.length) {
					return
				}
				if (n.children1) {
					var filter = opts.loadFilter;
					opts.loadFilter = function(data) {
						return data;
					};
					t.tree('append', {
						parent : node.target,
						data : n.children1
					});
					opts.loadFilter = filter;
					n.children = n.children1;
				}
			};
			return data;
		}

		// 	=======================================================================
		// 	=======================================================================
		// 	=======================================================================
		// 	=======================================================================
		// 	=======================================================================
		// 	=======================================================================

		function submitForm() {

			//  提交到后台的RESTful
			$.ajax({
				type : "POST",
				url : "/rest/role",
				data : $("#roleAddForm").serialize(),
				statusCode : {
					201 : function() {
						$.messager.alert('提示', '新增角色成功!');
					},
					400 : function() {
						$.messager.alert('提示', '参数有误!');
					},
					500 : function() {
						$.messager.alert('提示', '新增角色失败!');
					}
				}
			});
		}

		function clearForm() {
			$('#roleAddForm').form('reset');
		}
	</script>
</body>
</html>