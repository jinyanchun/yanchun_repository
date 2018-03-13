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
	
	<div class="easyui-panel" title="修改" style="width:400px">
		<div style="padding:10px 60px 20px 60px">
	    <form id="accountEditForm" method="post">
	    <input type="hidden" name="accountId">
	    	<table cellpadding="5" >
	    		<tr>
	    			<td>姓名:</td>
	    			<td><input class="easyui-textbox" type="text" name="accountName" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>昵称:</td>
	    			<td><input class="easyui-textbox" type="text" name="nickName" data-options="required:true,validType:'email'"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码:</td>
	    			<td><input class="easyui-textbox" type="text" name="password" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>性别:</td>
		            <td>
			    		<input type="radio" name="sex" value="1">男
			    		<input type="radio" name="sex" value="2">女
			    		<input type="radio" name="sex" value="0">未知
		    		</td>
	    		</tr>
	    		<tr>
		            <td>是否锁定:</td>
		            <td>
			    		<input type="radio" name="isLock" value="1">是
			    		<input type="radio" name="isLock" value="0">否
		    		</td>
	        	</tr>
	    		<tr>
	    			<td>头像上传:</td>
	    			<td>
		            	 <a href="javascript:void(0)" class="easyui-linkbutton">上传图片</a>
		                 <input type="hidden" name="headUrl"/>
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
function submitForm(){
		
		// 提交到后台的RESTful
		$.ajax({
		   type: "PUT",
		   url: "/rest/account",
		   data: $("#accountEditForm").serialize(),
		   statusCode : {
			   201 : function(){
				   $.messager.alert('提示','修改用户成功!');
				   parent.$("#itemEditWindow").window('close');
				   parent.reflush();
			   },
			   400 : function(){
				   $.messager.alert('提示','参数有误!');
			   },
			   500 : function(){
				   $.messager.alert('提示','修改用户失败!');
			   }
		   }
		});
	}
	
	function clearForm(){
		$('#accountEditForm').form('reset');
	}
	</script>
</body>
</html>